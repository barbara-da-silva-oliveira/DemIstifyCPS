package fr.inria.kairos.influence.analysis

import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.DesignArtifact
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.InfluenceModel
import fr.inria.kairos.influence.metamodel.Participant
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact
import fr.inria.kairos.influence.metamodel.SRPInputParticipant
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion
import fr.inria.kairos.influence.metamodel.SystemResponseProperty
import java.util.ArrayDeque
import java.util.HashMap
import java.util.LinkedHashSet
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil

class ImpactMetrics {
// Utilise participantImpactFunction comme source des poids
	static val DEFAULT_IMPACT_WEIGHT = 1.0
	static val MISSING_CONTRIBUTION_WEIGHT = 0.0

	def Result compute(Resource resource, GraphBuilder.Result graphBundle) {
		val modelRoot = resource.contents.head as InfluenceModel

		val impactArtifacts = new HashMap<String, Integer>()
		val impactEnvFactors = new HashMap<String, Integer>()
		val sensRequirements = new HashMap<String, Integer>()

		val impactArtifactsW = new HashMap<String, Double>()
		val impactEnvFactorsW = new HashMap<String, Double>()
		val sensRequirementsW = new HashMap<String, Double>()

		/* Edge weights from participant impact knowledge - This is specified in the  Impact Relative function
		 Examples:
		 A:vNominal       -> I:I_SpeedControl = 0.70
		 E:GroundFriction -> I:I_SpeedControl = 0.30
		 SR:Detection     -> I:I_Control      = 0.40
		 */
		 
		val edgeImpactWeights = new HashMap<String, Double>()

		for (inf : modelRoot.ownedInfluences.filter(Influence)) {
			val seenArtifacts = new java.util.HashSet<String>()
			val seenEnvFactors = new java.util.HashSet<String>()
			val seenRequirements = new java.util.HashSet<String>()

			val directArtifactWeights = new HashMap<String, Double>()
			val directEnvWeights = new HashMap<String, Double>()

			var influenceIncomingImpact = 0.0

			for (p : inf.ownedParticipants) {
				val participantWeight = participantImpactWeight(inf, p)
				influenceIncomingImpact += participantWeight

				switch p {
					ArtifactParticipant: {
						val artifact = p.target

						if (artifact !== null && artifact.name !== null) {
							val artifactName = artifact.name
							val artifactNode = "A:" + artifactName
							val influenceNode = "I:" + inf.name

							seenArtifacts.add(artifactName)
							addDouble(directArtifactWeights, artifactName, participantWeight)
							edgeImpactWeights.put(edgeKey(artifactNode, influenceNode), participantWeight)
						}
					}

					EnvironmentalFactorParticipant: {
						val env = p.target

						if (env !== null && env.name !== null) {
							val envName = env.name
							val envNode = "E:" + envName
							val influenceNode = "I:" + inf.name

							seenEnvFactors.add(envName)
							addDouble(directEnvWeights, envName, participantWeight)
							edgeImpactWeights.put(edgeKey(envNode, influenceNode), participantWeight)
						}
					}

					SRPInputParticipant: {
						val srp = p.target

						if (srp !== null && srp.name !== null) {
							val srpNode = "SR:" + srp.name
							val influenceNode = "I:" + inf.name

							edgeImpactWeights.put(edgeKey(srpNode, influenceNode), participantWeight)
						}
					}
				}
			}

			/*
			 * Requirement Traceability SatisfactionCriterion.constrainedSRPs
			 */
			 
			val output = inf.outputSRP
			if (output !== null) {
				for (criterion : criteriaForSrp(resource, output)) {
					val requirementName = requirementLabel(requirementRefOf(criterion))

					if (requirementName !== null) {
						seenRequirements.add(requirementName)
					}
				}
			}

			for (artifactName : seenArtifacts) {
				impactArtifacts.put(
					artifactName,
					impactArtifacts.getOrDefault(artifactName, 0) + 1
				)
			}

			for (envName : seenEnvFactors) {
				impactEnvFactors.put(
					envName,
					impactEnvFactors.getOrDefault(envName, 0) + 1
				)
			}

			for (requirementName : seenRequirements) {
				sensRequirements.put(
					requirementName,
					sensRequirements.getOrDefault(requirementName, 0) + 1
				)
			}

			for (entry : directArtifactWeights.entrySet) {
				addDouble(impactArtifactsW, entry.key, entry.value)
			}

			for (entry : directEnvWeights.entrySet) {
				addDouble(impactEnvFactorsW, entry.key, entry.value)
			}

			/*
			 * Rough weighted requirement sensitivity.
			 *
			 * If participant impacts are normalized, this will often add ~1.0
			 * per influence touching the requirement.
			 */
			for (requirementName : seenRequirements) {
				addDouble(sensRequirementsW, requirementName, influenceIncomingImpact)
			}
		}

		val allArtifacts = collectAllArtifacts(modelRoot)
		val allEnvFactors = collectAllEnvironmentalFactors(modelRoot)

		val impactArtifactsPropagated = new HashMap<String, Integer>()
		for (artifactName : allArtifacts) {
			val startNodeId = "A:" + artifactName
			val count = countReachableInfluences(startNodeId, graphBundle.outEdges)

			impactArtifactsPropagated.put(artifactName, count)
		}

		val impactEnvFactorsPropagated = new HashMap<String, Integer>()
		for (envName : allEnvFactors) {
			val startNodeId = "E:" + envName
			val count = countReachableInfluences(startNodeId, graphBundle.outEdges)

			impactEnvFactorsPropagated.put(envName, count)
		}

		val impactArtifactsPropagatedW = new HashMap<String, Double>()
		for (artifactName : allArtifacts) {
			val startNodeId = "A:" + artifactName
			val weightedSum = sumBestProductWeightedInfluences(
				startNodeId,
				graphBundle.outEdges,
				edgeImpactWeights
			)

			impactArtifactsPropagatedW.put(artifactName, weightedSum)
		}

		val impactEnvFactorsPropagatedW = new HashMap<String, Double>()
		for (envName : allEnvFactors) {
			val startNodeId = "E:" + envName
			val weightedSum = sumBestProductWeightedInfluences(
				startNodeId,
				graphBundle.outEdges,
				edgeImpactWeights
			)

			impactEnvFactorsPropagatedW.put(envName, weightedSum)
		}

		val impactArtifactsIndirect = new HashMap<String, Integer>()
		for (entry : impactArtifactsPropagated.entrySet) {
			val direct = impactArtifacts.getOrDefault(entry.key, 0)
			val indirectOnly = entry.value - direct

			impactArtifactsIndirect.put(
				entry.key,
				if (indirectOnly > 0) indirectOnly else 0
			)
		}

		val impactEnvFactorsIndirect = new HashMap<String, Integer>()
		for (entry : impactEnvFactorsPropagated.entrySet) {
			val direct = impactEnvFactors.getOrDefault(entry.key, 0)
			val indirectOnly = entry.value - direct

			impactEnvFactorsIndirect.put(
				entry.key,
				if (indirectOnly > 0) indirectOnly else 0
			)
		}

		new Result(
			impactArtifacts,
			impactEnvFactors,
			sensRequirements,
			impactArtifactsW,
			impactEnvFactorsW,
			sensRequirementsW,
			impactArtifactsPropagated,
			impactArtifactsIndirect,
			impactArtifactsPropagatedW,
			impactEnvFactorsPropagated,
			impactEnvFactorsIndirect,
			impactEnvFactorsPropagatedW
		)
	}

	private def LinkedHashSet<String> collectAllArtifacts(InfluenceModel modelRoot) {
		val allArtifacts = new LinkedHashSet<String>()

		for (artifact : modelRoot.ownedArtifacts) {
			if (artifact instanceof DesignArtifact && artifact.name !== null) {
				allArtifacts.add(artifact.name)
			}
		}

		allArtifacts
	}

	private def LinkedHashSet<String> collectAllEnvironmentalFactors(InfluenceModel modelRoot) {
		val allEnvFactors = new LinkedHashSet<String>()

		for (env : modelRoot.ownedEnvironmentalFactors) {
			if (env instanceof EnvironmentalFactor && env.name !== null) {
				allEnvFactors.add(env.name)
			}
		}

		allEnvFactors
	}

	private def double participantImpactWeight(Influence influence, Participant participant) {
		val impactFunction = bestParticipantImpactFunction(influence)

		if (impactFunction === null) {
			return DEFAULT_IMPACT_WEIGHT
		}

		val contribution = participantContributions(impactFunction).findFirst [ c |
			c.participant === participant
		]

		if (contribution === null) {
			/*
			 * If a ParticipantImpactFunction exists but this participant is absent,
			 * treat it as unknown/uncontributed instead of making it dominant.
			 */
			return MISSING_CONTRIBUTION_WEIGHT
		}

		sanitizeWeight(contribution.importance)
	}

	private def ParticipantImpactFunction bestParticipantImpactFunction(Influence influence) {
		val function = influence.ownedInfluenceFunction

		if (function === null || function.representations === null) {
			return null
		}

		val impactFunctions = function.representations
			.filter(ParticipantImpactFunction)
			.toList

		if (impactFunctions.empty) {
			return null
		}

		/*
		 * If several impact functions exist, take the one with highest confidence.
		 * Later, you can refine this using applicabilityDomain.
		 */
		impactFunctions.sort [ a, b |
			java.lang.Double.compare(b.confidence, a.confidence)
		]

		impactFunctions.head
	}

	/* Helpers
	 */
	private def java.util.List<ParticipantRelativeImpact> participantContributions(
		ParticipantImpactFunction function
	) {
		val result = new java.util.ArrayList<ParticipantRelativeImpact>()

		if (function === null) {
			return result
		}

		val feature = function.eClass.getEStructuralFeature("participantContribution")

		if (feature === null || !function.eIsSet(feature)) {
			return result
		}

		val value = function.eGet(feature)

		if (value instanceof java.util.Collection<?>) {
			for (item : value as java.util.Collection<?>) {
				if (item instanceof ParticipantRelativeImpact) {
					result.add(item as ParticipantRelativeImpact)
				}
			}
		} else if (value instanceof ParticipantRelativeImpact) {
			result.add(value as ParticipantRelativeImpact)
		}

		result
	}

	private def double sanitizeWeight(double rawWeight) {
		if (java.lang.Double.isNaN(rawWeight)) {
			return DEFAULT_IMPACT_WEIGHT
		}

		if (rawWeight < 0.0) {
			return 0.0
		}

		if (rawWeight > 1.0) {
			return 1.0
		}

		rawWeight
	}

	private def Iterable<SatisfactionCriterion> criteriaForSrp(
		Resource resource,
		SystemResponseProperty srp
	) {
		resource.allContents.toIterable
			.filter(SatisfactionCriterion)
			.filter [ criterion |
				criterionConstrainsSrp(criterion, srp)
			]
	}

	private def boolean criterionConstrainsSrp(
		SatisfactionCriterion criterion,
		SystemResponseProperty srp
	) {
		if (criterion === null || srp === null) {
			return false
		}

		val feature = criterion.eClass.getEStructuralFeature("constrainedSRPs")

		if (feature === null || !criterion.eIsSet(feature)) {
			return false
		}

		val value = criterion.eGet(feature)

		if (value instanceof java.util.Collection<?>) {
			return (value as java.util.Collection<?>).contains(srp)
		}

		value === srp
	}

	/*
	 *requirementRef is an EObject reference.
	 */
	private def EObject requirementRefOf(SatisfactionCriterion criterion) {
		if (criterion === null) {
			return null
		}

		val feature = criterion.eClass.getEStructuralFeature("requirementRef")

		if (feature === null || !criterion.eIsSet(feature)) {
			return null
		}

		val value = criterion.eGet(feature)

		if (value instanceof EObject) {
			return value as EObject
		}

		if (value instanceof java.util.Collection<?>) {
			for (item : value as java.util.Collection<?>) {
				if (item instanceof EObject) {
					return item as EObject
				}
			}
		}

		null
	}

	private def String requirementLabel(EObject requirementRef) {
		if (requirementRef === null) {
			return "<unknown-requirement>"
		}

		val nameFeature = requirementRef.eClass.getEStructuralFeature("name")

		if (nameFeature !== null) {
			val value = requirementRef.eGet(nameFeature)

			if (value !== null) {
				return String.valueOf(value)
			}
		}

		val uri = EcoreUtil.getURI(requirementRef)

		if (uri !== null) {
			return uri.toString
		}

		requirementRef.toString
	}

	private def int countReachableInfluences(
		String startNodeId,
		Map<String, LinkedHashSet<String>> outEdges
	) {
		val visited = new java.util.HashSet<String>()
		val queue = new ArrayDeque<String>()
		val influences = new java.util.HashSet<String>()

		visited.add(startNodeId)
		queue.add(startNodeId)

		while (!queue.isEmpty) {
			val current = queue.removeFirst
			val successors = outEdges.get(current)

			if (successors !== null) {
				for (next : successors) {
					if (visited.add(next)) {
						if (next.startsWith("I:")) {
							influences.add(next)
						}

						queue.add(next)
					}
				}
			}
		}

		influences.size
	}

	/*
	 * Propagated weighted impact.
	 *
	 * Uses product along paths:
	 *   A -> I1 weight 0.7
	 *   I1 -> SR1 weight 1.0
	 *   SR1 -> I2 weight 0.4
	 *
	 * Score reaching I2 = 0.7 * 1.0 * 0.4 = 0.28
	 *
	 * For each node, we keep the best product score found so far.
	 */
	private def double sumBestProductWeightedInfluences(
		String startNodeId,
		Map<String, LinkedHashSet<String>> outEdges,
		Map<String, Double> edgeImpactWeights
	) {
		val best = new HashMap<String, Double>()
		val queue = new ArrayDeque<String>()

		best.put(startNodeId, 1.0)
		queue.add(startNodeId)

		while (!queue.isEmpty) {
			val current = queue.removeFirst
			val currentScore = best.getOrDefault(current, 0.0)
			val successors = outEdges.get(current)

			if (successors !== null) {
				for (next : successors) {
					val edgeWeight = weightForEdge(current, next, edgeImpactWeights)
					val newScore = currentScore * edgeWeight

					if (newScore > best.getOrDefault(next, java.lang.Double.NEGATIVE_INFINITY)) {
						best.put(next, newScore)
						queue.add(next)
					}
				}
			}
		}

		var total = 0.0

		for (entry : best.entrySet) {
			if (entry.key.startsWith("I:")) {
				total += entry.value
			}
		}

		total
	}

	private def double weightForEdge(
		String from,
		String to,
		Map<String, Double> edgeImpactWeights
	) {
		val explicit = edgeImpactWeights.get(edgeKey(from, to))

		if (explicit !== null) {
			return sanitizeWeight(explicit)
		}

		/*
		 * Structural edges such as:
		 *   I -> SR
		 *   SR -> Requirement
		 *
		 * They propagate the score without modifying it.
		 */
		1.0
	}

	private def String edgeKey(String from, String to) {
		from + "->" + to
	}

	private def void addDouble(Map<String, Double> map, String key, double value) {
		map.put(key, map.getOrDefault(key, 0.0) + value)
	}

	static class Result {
		public val Map<String, Integer> impactArtifacts
		public val Map<String, Integer> impactEnvFactors
		public val Map<String, Integer> sensRequirements

		public val Map<String, Double> impactArtifactsW
		public val Map<String, Double> impactEnvFactorsW
		public val Map<String, Double> sensRequirementsW

		public val Map<String, Integer> impactArtifactsPropagated
		public val Map<String, Integer> impactArtifactsIndirect
		public val Map<String, Double> impactArtifactsPropagatedW

		public val Map<String, Integer> impactEnvFactorsPropagated
		public val Map<String, Integer> impactEnvFactorsIndirect
		public val Map<String, Double> impactEnvFactorsPropagatedW

		new(
			Map<String, Integer> impactArtifacts,
			Map<String, Integer> impactEnvFactors,
			Map<String, Integer> sensRequirements,
			Map<String, Double> impactArtifactsW,
			Map<String, Double> impactEnvFactorsW,
			Map<String, Double> sensRequirementsW,
			Map<String, Integer> impactArtifactsPropagated,
			Map<String, Integer> impactArtifactsIndirect,
			Map<String, Double> impactArtifactsPropagatedW,
			Map<String, Integer> impactEnvFactorsPropagated,
			Map<String, Integer> impactEnvFactorsIndirect,
			Map<String, Double> impactEnvFactorsPropagatedW
		) {
			this.impactArtifacts = impactArtifacts
			this.impactEnvFactors = impactEnvFactors
			this.sensRequirements = sensRequirements

			this.impactArtifactsW = impactArtifactsW
			this.impactEnvFactorsW = impactEnvFactorsW
			this.sensRequirementsW = sensRequirementsW

			this.impactArtifactsPropagated = impactArtifactsPropagated
			this.impactArtifactsIndirect = impactArtifactsIndirect
			this.impactArtifactsPropagatedW = impactArtifactsPropagatedW

			this.impactEnvFactorsPropagated = impactEnvFactorsPropagated
			this.impactEnvFactorsIndirect = impactEnvFactorsIndirect
			this.impactEnvFactorsPropagatedW = impactEnvFactorsPropagatedW
		}
	}
}
