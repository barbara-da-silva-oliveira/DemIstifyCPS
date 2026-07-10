package fr.inria.kairos.influence.analysis

import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.DesignArtifact
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.Participant
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact
import fr.inria.kairos.influence.metamodel.SRPInputParticipant
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion
import fr.inria.kairos.influence.metamodel.SystemResponseProperty
import java.util.HashMap
import java.util.LinkedHashSet
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge

class GraphBuilder {

	static val DEFAULT_IMPACT_WEIGHT = 1.0
	static val MISSING_CONTRIBUTION_WEIGHT = 0.0

	def Result build(Resource resource) {
		val graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge)

		val vertexLabels = new HashMap<String, String>()
		val edgeLabels = new HashMap<DefaultEdge, String>()

		val outEdges = new HashMap<String, LinkedHashSet<String>>()
		val inEdges = new HashMap<String, LinkedHashSet<String>>()

		val reqToSRs = new HashMap<String, LinkedHashSet<String>>()
		val srp2inf = new HashMap<String, String>()

		val nodeToOrigin = new HashMap<String, String>()
		val originToNode = new HashMap<String, String>()
		val edgeToOrigin = new HashMap<DefaultEdge, String>()
		val edgeWeights = new HashMap<DefaultEdge, Double>()
		val nodeSourceModel = new HashMap<String, String>()

		for (inf : resource.allContents.toIterable.filter(Influence)) {
			val iNode = toI(inf.name)

			graph.addVertex(iNode)
			vertexLabels.put(iNode, influenceLabel(inf))
			setNodeOrigin(nodeToOrigin, originToNode, iNode, inf)

			/*
			 * Participant -> Influence edges
			 *
			 * Weights now come from:
			 *   ParticipantImpactFunction.participantContribution.importance
			 *
			 */
			for (p : inf.ownedParticipants) {
				switch p {
					ArtifactParticipant: {
						addArtifactParticipantEdge(
							p,
							inf,
							iNode,
							graph,
							vertexLabels,
							edgeLabels,
							outEdges,
							inEdges,
							nodeToOrigin,
							originToNode,
							edgeToOrigin,
							edgeWeights,
							nodeSourceModel
						)
					}

					EnvironmentalFactorParticipant: {
						addEnvironmentalFactorParticipantEdge(
							p,
							inf,
							iNode,
							graph,
							vertexLabels,
							edgeLabels,
							outEdges,
							inEdges,
							nodeToOrigin,
							originToNode,
							edgeToOrigin,
							edgeWeights
						)
					}

					SRPInputParticipant: {
						addSRPInputParticipantEdge(
							p,
							inf,
							iNode,
							resource,
							graph,
							vertexLabels,
							edgeLabels,
							outEdges,
							inEdges,
							nodeToOrigin,
							originToNode,
							edgeToOrigin,
							edgeWeights,
							reqToSRs
						)
					}
				}
			}

			/*
			 * Influence -> output SRP
			 */
			val output = inf.outputSRP

			if (output !== null && output.name !== null) {
				val srOutNode = toSR(output.name)

				graph.addVertex(srOutNode)
				vertexLabels.putIfAbsent(srOutNode, srOutNode)
				setNodeOrigin(nodeToOrigin, originToNode, srOutNode, output)

				val producesEdge = graph.addEdge(iNode, srOutNode)

				if (producesEdge !== null) {
					edgeLabels.put(producesEdge, "produces")
					setEdgeOrigin(edgeToOrigin, producesEdge, inf)
				}

				addAdjEdge(outEdges, inEdges, iNode, srOutNode)

				/*
				 * Map SRP output to producer influence.
				 * Used later by BFS / propagation analyses.
				 */
				srp2inf.put(srOutNode, iNode)

				/*
				 * output SRP -> RequirementRef
				 *
				 * Old model:
				 *   output.constrainedBy
				 *
				 * New model:
				 *   SatisfactionCriterion.constrainedSRPs contains output
				 */
				addRequirementEdgesForSrp(
					resource,
					output,
					srOutNode,
					graph,
					vertexLabels,
					edgeLabels,
					outEdges,
					inEdges,
					reqToSRs,
					nodeToOrigin,
					originToNode,
					edgeToOrigin
				)

				/*
				 * Traceability adjacency shortcut:
				 * originators -> output SRP
				 *
				 * This is not added as a visible graph edge, only as adjacency
				 * for analyses.
				 */
				for (p : inf.ownedParticipants) {
					switch p {
						ArtifactParticipant: {
							val artifact = p.target
							if (artifact?.name !== null) {
								addAdjEdge(outEdges, inEdges, toA(artifact.name), srOutNode)
							}
						}

						EnvironmentalFactorParticipant: {
							val env = p.target
							if (env?.name !== null) {
								addAdjEdge(outEdges, inEdges, toE(env.name), srOutNode)
							}
						}

						SRPInputParticipant: {
							val srp = p.target
							if (srp?.name !== null) {
								addAdjEdge(outEdges, inEdges, toSR(srp.name), srOutNode)
							}
						}
					}
				}
			}
		}

		new Result(
			graph,
			vertexLabels,
			edgeLabels,
			outEdges,
			inEdges,
			reqToSRs,
			srp2inf,
			nodeToOrigin,
			originToNode,
			edgeToOrigin,
			edgeWeights,
			nodeSourceModel
		)
	}

	private def void addArtifactParticipantEdge(
		ArtifactParticipant participant,
		Influence influence,
		String influenceNode,
		DefaultDirectedGraph<String, DefaultEdge> graph,
		Map<String, String> vertexLabels,
		Map<DefaultEdge, String> edgeLabels,
		Map<String, LinkedHashSet<String>> outEdges,
		Map<String, LinkedHashSet<String>> inEdges,
		Map<String, String> nodeToOrigin,
		Map<String, String> originToNode,
		Map<DefaultEdge, String> edgeToOrigin,
		Map<DefaultEdge, Double> edgeWeights,
		Map<String, String> nodeSourceModel
	) {
		val artifact = participant.target

		if (artifact === null || artifact.name === null) {
			return
		}

		val artifactNode = toA(artifact.name)

		graph.addVertex(artifactNode)
		vertexLabels.putIfAbsent(artifactNode, artifactNode)
		setNodeOrigin(nodeToOrigin, originToNode, artifactNode, artifact)

		val edge = graph.addEdge(artifactNode, influenceNode)
		val weight = participantImpactWeight(influence, participant)

		if (edge !== null) {
			edgeLabels.put(edge, fmtD(weight))
			edgeWeights.put(edge, weight)
			setEdgeOrigin(edgeToOrigin, edge, participant)
		}

		addAdjEdge(outEdges, inEdges, artifactNode, influenceNode)

		val targetEObject = readRefEObject(artifact)
		val modelUri = modelUriOf(targetEObject)

		if (modelUri !== null) {
			nodeSourceModel.put(artifactNode, modelUri)
		}
	}

	private def void addEnvironmentalFactorParticipantEdge(
		EnvironmentalFactorParticipant participant,
		Influence influence,
		String influenceNode,
		DefaultDirectedGraph<String, DefaultEdge> graph,
		Map<String, String> vertexLabels,
		Map<DefaultEdge, String> edgeLabels,
		Map<String, LinkedHashSet<String>> outEdges,
		Map<String, LinkedHashSet<String>> inEdges,
		Map<String, String> nodeToOrigin,
		Map<String, String> originToNode,
		Map<DefaultEdge, String> edgeToOrigin,
		Map<DefaultEdge, Double> edgeWeights
	) {
		val env = participant.target

		if (env === null || env.name === null) {
			return
		}

		val envNode = toE(env.name)

		graph.addVertex(envNode)
		vertexLabels.putIfAbsent(envNode, envNode)
		setNodeOrigin(nodeToOrigin, originToNode, envNode, env)

		val edge = graph.addEdge(envNode, influenceNode)
		val weight = participantImpactWeight(influence, participant)

		if (edge !== null) {
			edgeLabels.put(edge, fmtD(weight))
			edgeWeights.put(edge, weight)
			setEdgeOrigin(edgeToOrigin, edge, participant)
		}

		addAdjEdge(outEdges, inEdges, envNode, influenceNode)
	}

	private def void addSRPInputParticipantEdge(
		SRPInputParticipant participant,
		Influence influence,
		String influenceNode,
		Resource resource,
		DefaultDirectedGraph<String, DefaultEdge> graph,
		Map<String, String> vertexLabels,
		Map<DefaultEdge, String> edgeLabels,
		Map<String, LinkedHashSet<String>> outEdges,
		Map<String, LinkedHashSet<String>> inEdges,
		Map<String, String> nodeToOrigin,
		Map<String, String> originToNode,
		Map<DefaultEdge, String> edgeToOrigin,
		Map<DefaultEdge, Double> edgeWeights,
		Map<String, LinkedHashSet<String>> reqToSRs
	) {
		val srp = participant.target

		if (srp === null || srp.name === null) {
			return
		}

		val srpNode = toSR(srp.name)

		graph.addVertex(srpNode)
		vertexLabels.putIfAbsent(srpNode, srpNode)
		setNodeOrigin(nodeToOrigin, originToNode, srpNode, srp)

		val edge = graph.addEdge(srpNode, influenceNode)
		val weight = participantImpactWeight(influence, participant)

		if (edge !== null) {
			edgeLabels.put(edge, fmtD(weight))
			edgeWeights.put(edge, weight)
			setEdgeOrigin(edgeToOrigin, edge, participant)
		}

		addAdjEdge(outEdges, inEdges, srpNode, influenceNode)

		/*
		 * SRP input -> RequirementRef
		 *
		 * Useful because an upstream SRP may itself be constrained by
		 * satisfaction criteria.
		 */
		addRequirementEdgesForSrp(
			resource,
			srp,
			srpNode,
			graph,
			vertexLabels,
			edgeLabels,
			outEdges,
			inEdges,
			reqToSRs,
			nodeToOrigin,
			originToNode,
			edgeToOrigin
		)
	}

	private def void addRequirementEdgesForSrp(
		Resource resource,
		SystemResponseProperty srp,
		String srpNode,
		DefaultDirectedGraph<String, DefaultEdge> graph,
		Map<String, String> vertexLabels,
		Map<DefaultEdge, String> edgeLabels,
		Map<String, LinkedHashSet<String>> outEdges,
		Map<String, LinkedHashSet<String>> inEdges,
		Map<String, LinkedHashSet<String>> reqToSRs,
		Map<String, String> nodeToOrigin,
		Map<String, String> originToNode,
		Map<DefaultEdge, String> edgeToOrigin
	) {
		if (srp === null || srp.name === null) {
			return
		}

		for (criterion : criteriaForSrp(resource, srp)) {
			val requirementRef = requirementRefOf(criterion)
			val requirementName = requirementLabel(requirementRef)
		
			if (requirementName !== null) {
				val requirementNode = toR(requirementName)
		
				graph.addVertex(requirementNode)
				vertexLabels.putIfAbsent(requirementNode, requirementNode)
		
				if (requirementRef !== null) {
					setNodeOrigin(nodeToOrigin, originToNode, requirementNode, requirementRef)
				}
		
				val edge = graph.addEdge(srpNode, requirementNode)
		
				if (edge !== null) {
					edgeLabels.put(edge, "constrains")
					setEdgeOrigin(edgeToOrigin, edge, criterion)
				}
		
				addAdjEdge(outEdges, inEdges, srpNode, requirementNode)
				addReqToSrp(reqToSRs, requirementName, srp.name)
			}
		}
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

	/*
	 * Reflection-based so it survives if constrainedSRPs
	 * is temporarily single-valued or multi-valued.
	 *
	 * Recommended Ecore:
	 *   constrainedSRPs : SystemResponseProperty [1..*]
	 */
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

		val uri =
			if (requirementRef.eIsProxy) {
				(requirementRef as InternalEObject).eProxyURI
			} else {
				EcoreUtil.getURI(requirementRef)
			}

		if (uri !== null) {
			return uri.toString
		}

		requirementRef.toString
	}

	/*
	 * Weight for Participant -> Influence.
	 *
	 * Source:
	 *   ParticipantImpactFunction.participantContribution.importance
	 *
	 * If no ParticipantImpactFunction exists, use DEFAULT_IMPACT_WEIGHT.
	 * If an impact function exists but does not mention this participant,
	 * use MISSING_CONTRIBUTION_WEIGHT.
	 */
	private def double participantImpactWeight(Influence influence, Participant participant) {
		val impactFunction = bestParticipantImpactFunction(influence)

		if (impactFunction === null) {
			return DEFAULT_IMPACT_WEIGHT
		}

		val contribution = participantContributions(impactFunction).findFirst [ c |
			c.participant === participant
		]

		if (contribution === null) {
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
		 * If several impact functions exist, take the one with highest confidence, later to define with applicabilityDomain.
		 */
		impactFunctions.sort [ a, b |
			java.lang.Double.compare(b.confidence, a.confidence)
		]

		impactFunctions.head
	}

	/*
	 * Reflection-based for stability while Ecore is still moving.
	 *
	 * Recommended Ecore:
	 *   participantContribution : ParticipantRelativeImpact [1..*] containment
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

	def static void addAdjEdge(
		Map<String, LinkedHashSet<String>> outE,
		Map<String, LinkedHashSet<String>> inE,
		String from,
		String to
	) {
		var os = outE.get(from)

		if (os === null) {
			os = new LinkedHashSet<String>()
			outE.put(from, os)
		}

		os.add(to)

		var is = inE.get(to)

		if (is === null) {
			is = new LinkedHashSet<String>()
			inE.put(to, is)
		}

		is.add(from)
	}

	def static void addReqToSrp(
		Map<String, LinkedHashSet<String>> reqToSRs,
		String requirementName,
		String srpName
	) {
		var srps = reqToSRs.get(requirementName)

		if (srps === null) {
			srps = new LinkedHashSet<String>()
			reqToSRs.put(requirementName, srps)
		}

		srps.add(srpName)
	}

	def static String influenceLabel(Influence inf) {
		var s = "I:" + inf.name

		val meta = metadataSafe(inf)

		if (meta !== null && !meta.trim.empty) {
			s = s + "\\n" + meta
		}

		s
	}

	def static String metadataSafe(EObject o) {
		if (o === null) {
			return null
		}

		val f = o.eClass?.getEStructuralFeature("metadata")

		if (f === null) {
			return null
		}

		val v = o.eGet(f)

		if (v instanceof String) {
			return v as String
		}

		if (v instanceof java.util.List<?>) {
			return (v as java.util.List<?>)
				.filter[it !== null]
				.map[String.valueOf(it)]
				.join(", ")
		}

		null
	}

	def static String originOf(EObject e) {
		if (e === null) {
			return null
		}

		val uri =
			if (e.eIsProxy) {
				(e as InternalEObject).eProxyURI
			} else {
				EcoreUtil.getURI(e)
			}

		if (uri !== null) {
			return uri.toString
		}

		null
	}

	def static void setNodeOrigin(
		Map<String, String> nodeToOrigin,
		Map<String, String> originToNode,
		String nodeId,
		EObject source
	) {
		val originId = originOf(source)

		if (originId !== null && nodeId !== null) {
			if (!nodeToOrigin.containsKey(nodeId)) {
				nodeToOrigin.put(nodeId, originId)
			}

			if (!originToNode.containsKey(originId)) {
				originToNode.put(originId, nodeId)
			}
		}
	}

	def static void setEdgeOrigin(
		Map<DefaultEdge, String> edgeToOrigin,
		DefaultEdge edge,
		EObject source
	) {
		if (edge !== null && source !== null) {
			edgeToOrigin.put(edge, originOf(source))
		}
	}

	def static EObject readRefEObject(DesignArtifact artifact) {
		if (artifact === null) {
			return null
		}

		val f = artifact.eClass.getEStructuralFeature("ref")

		if (f === null || !artifact.eIsSet(f)) {
			return null
		}

		val value = artifact.eGet(f)

		if (value instanceof EObject) {
			return value as EObject
		}

		null
	}

	def static String modelUriOf(EObject e) {
		if (e === null) {
			return null
		}

		val uri =
			if (e.eIsProxy) {
				(e as InternalEObject).eProxyURI
			} else {
				EcoreUtil.getURI(e)
			}

		val base = uri?.trimFragment

		if (base !== null) {
			return base.toString
		}

		null
	}

	def static String toA(String n)  { "A:" + n }
	def static String toE(String n)  { "E:" + n }
	def static String toSR(String n) { "SR:" + n }
	def static String toR(String n)  { "R:" + n }
	def static String toI(String n)  { "I:" + n }

	def static String fmtD(double d) {
		String.format(java.util.Locale.US, "%.3f", d)
	}

	static class Result {
		public val DefaultDirectedGraph<String, DefaultEdge> graph
		public val Map<String, String> vertexLabels
		public val Map<DefaultEdge, String> edgeLabels

		public val Map<String, LinkedHashSet<String>> outEdges
		public val Map<String, LinkedHashSet<String>> inEdges

		public val Map<String, LinkedHashSet<String>> reqToSRs
		public val Map<String, String> srp2inf

		public val Map<String, String> nodeToOrigin
		public val Map<String, String> originToNode
		public val Map<DefaultEdge, String> edgeToOrigin
		public val Map<DefaultEdge, Double> edgeWeights

		public val Map<String, String> nodeSourceModel

		new(
			DefaultDirectedGraph<String, DefaultEdge> graph,
			Map<String, String> vertexLabels,
			Map<DefaultEdge, String> edgeLabels,
			Map<String, LinkedHashSet<String>> outEdges,
			Map<String, LinkedHashSet<String>> inEdges,
			Map<String, LinkedHashSet<String>> reqToSRs,
			Map<String, String> srp2inf,
			Map<String, String> nodeToOrigin,
			Map<String, String> originToNode,
			Map<DefaultEdge, String> edgeToOrigin,
			Map<DefaultEdge, Double> edgeWeights,
			Map<String, String> nodeSourceModel
		) {
			this.graph = graph
			this.vertexLabels = vertexLabels
			this.edgeLabels = edgeLabels

			this.outEdges = outEdges
			this.inEdges = inEdges

			this.reqToSRs = reqToSRs
			this.srp2inf = srp2inf

			this.nodeToOrigin = nodeToOrigin
			this.originToNode = originToNode
			this.edgeToOrigin = edgeToOrigin
			this.edgeWeights = edgeWeights

			this.nodeSourceModel = nodeSourceModel
		}
	}
}
