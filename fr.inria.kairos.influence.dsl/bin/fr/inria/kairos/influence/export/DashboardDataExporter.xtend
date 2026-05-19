package fr.inria.kairos.influence.export

import fr.inria.kairos.influence.analysis.GraphBuilder
import fr.inria.kairos.influence.analysis.ImpactMetrics
import fr.inria.kairos.influence.metamodel.*
import java.util.ArrayList
import java.util.Collections
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Locale
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.jgrapht.graph.DefaultEdge

class DashboardDataExporter {

	def void export(Resource resource, GraphBuilder.Result graphBundle, IFileSystemAccess2 fsa, String basePath) {
		val model = rootModel(resource)
		val base = normalizeBasePath(basePath)

		if (model === null) {
			fsa.generateFile(base + "/dashboard-data.json", '''
			{
			  "error": "No InfluenceModel found"
			}
			''')
			return
		}

		val metrics = new ImpactMetrics().compute(resource, graphBundle)

		fsa.generateFile(
			base + "/dashboard-data.json",
			buildDashboardData(model, graphBundle, metrics)
		)

		fsa.generateFile(
			base + "/graph.json",
			buildGraphData(graphBundle)
		)
	}

	private def InfluenceModel rootModel(Resource resource) {
		if (resource === null || resource.contents === null || resource.contents.empty) {
			return null
		}

		val root = resource.contents.head

		if (root instanceof InfluenceModel) {
			return root as InfluenceModel
		}

		return null
	}

	private def String normalizeBasePath(String basePath) {
		if (basePath === null || basePath.trim.empty) {
			return "dashboard/data"
		}

		if (basePath.endsWith("/")) {
			return basePath.substring(0, basePath.length - 1)
		}

		return basePath
	}

	private def String buildDashboardData(
		InfluenceModel model,
		GraphBuilder.Result graphBundle,
		ImpactMetrics.Result metrics
	) {
		val sb = new StringBuilder

		sb.append("{\n")

		sb.append("  \"model\": ")
		appendModelSummary(sb, model)
		sb.append(",\n")

		sb.append("  \"artifacts\": ")
		appendArtifacts(sb, model)
		sb.append(",\n")

		sb.append("  \"environmentalFactors\": ")
		appendEnvironmentalFactors(sb, model)
		sb.append(",\n")

		sb.append("  \"systemResponseProperties\": ")
		appendSystemResponseProperties(sb, model)
		sb.append(",\n")

		sb.append("  \"satisfactionCriteria\": ")
		appendSatisfactionCriteria(sb, model)
		sb.append(",\n")

		sb.append("  \"influences\": ")
		appendInfluences(sb, model)
		sb.append(",\n")

		sb.append("  \"metrics\": ")
		appendMetrics(sb, metrics)
		sb.append(",\n")

		sb.append("  \"developerViews\": ")
		appendDeveloperViews(sb, model)

		sb.append("\n}\n")

		return sb.toString
	}

	private def void appendModelSummary(StringBuilder sb, InfluenceModel model) {
		val influenceCount = model.ownedInfluences.filter(Influence).size
		val compositeInfluenceCount = model.ownedInfluences.filter(CompositeInfluence).size
		val analyticInfluenceCount = model.ownedInfluences.filter(Influence).filter[hasAnalyticFunction].size

		sb.append("{\n")
		sb.append("    \"name\": ").append(jsonString(model.name)).append(",\n")
		sb.append("    \"counts\": {\n")
		sb.append("      \"artifacts\": ").append(model.ownedArtifacts.size).append(",\n")
		sb.append("      \"environmentalFactors\": ").append(model.ownedEnvironmentalFactors.size).append(",\n")
		sb.append("      \"systemResponseProperties\": ").append(model.ownedSRPs.size).append(",\n")
		sb.append("      \"satisfactionCriteria\": ").append(model.ownedSatisfactionCriteria.size).append(",\n")
		sb.append("      \"influences\": ").append(influenceCount).append(",\n")
		sb.append("      \"compositeInfluences\": ").append(compositeInfluenceCount).append(",\n")
		sb.append("      \"analyticInfluences\": ").append(analyticInfluenceCount).append("\n")
		sb.append("    }\n")
		sb.append("  }")
	}

	private def void appendArtifacts(StringBuilder sb, InfluenceModel model) {
		sb.append("[\n")

		var first = true

		for (artifact : model.ownedArtifacts) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("    {\n")
			sb.append("      \"name\": ").append(jsonString(artifact.name)).append(",\n")
			sb.append("      \"externalReference\": ").append(jsonString(externalReferenceLabel(artifact.ref))).append(",\n")
			sb.append("      \"externalUri\": ").append(jsonString(uriOf(artifact.ref))).append(",\n")
			sb.append("      \"owner\": ").append(jsonString(ownerOfArtifact(artifact))).append(",\n")
			sb.append("      \"changeability\": ").append(jsonNumber(artifact.changeability)).append("\n")
			sb.append("    }")
		}

		sb.append("\n  ]")
	}

	private def void appendEnvironmentalFactors(StringBuilder sb, InfluenceModel model) {
		sb.append("[\n")

		var first = true

		for (factor : model.ownedEnvironmentalFactors) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("    {\n")
			sb.append("      \"name\": ").append(jsonString(factor.name)).append(",\n")
			sb.append("      \"description\": ").append(jsonString(factor.description)).append(",\n")
			sb.append("      \"flexibility\": ").append(jsonNumber(factor.flexibility)).append("\n")
			sb.append("    }")
		}

		sb.append("\n  ]")
	}

	private def void appendSystemResponseProperties(StringBuilder sb, InfluenceModel model) {
		sb.append("[\n")

		var first = true

		for (srp : model.ownedSRPs) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("    {\n")
			sb.append("      \"name\": ").append(jsonString(srp.name)).append(",\n")
			sb.append("      \"description\": ").append(jsonString(srp.description)).append(",\n")
			sb.append("      \"satisfactionCriteria\": ")

			val criteria = criteriaConstraining(model, srp)
			appendStringArray(sb, criteria.map[name])

			sb.append("\n")
			sb.append("    }")
		}

		sb.append("\n  ]")
	}

	private def void appendSatisfactionCriteria(StringBuilder sb, InfluenceModel model) {
		sb.append("[\n")

		var first = true

		for (criterion : model.ownedSatisfactionCriteria) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("    {\n")
			sb.append("      \"name\": ").append(jsonString(criterion.name)).append(",\n")
			sb.append("      \"requirement\": ").append(jsonString(requirementLabel(criterion.requirementRef))).append(",\n")
			sb.append("      \"requirementUri\": ").append(jsonString(uriOf(criterion.requirementRef))).append(",\n")
			sb.append("      \"marginDefinition\": ").append(jsonString(criterion.marginDefinition)).append(",\n")
			sb.append("      \"language\": ").append(jsonString(String.valueOf(criterion.language))).append(",\n")
			sb.append("      \"constrainedSRPs\": ")

			appendStringArray(sb, criterion.constrainedSRPs.map[name])

			sb.append("\n")
			sb.append("    }")
		}

		sb.append("\n  ]")
	}

	private def void appendInfluences(StringBuilder sb, InfluenceModel model) {
		sb.append("[\n")

		var first = true

		for (abstractInfluence : model.ownedInfluences) {
			if (abstractInfluence instanceof Influence) {
				val influence = abstractInfluence as Influence

				if (!first) {
					sb.append(",\n")
				}
				first = false

				appendInfluence(sb, model, influence)
			}
		}

		sb.append("\n  ]")
	}

	private def void appendInfluence(StringBuilder sb, InfluenceModel model, Influence influence) {
		sb.append("    {\n")
		sb.append("      \"name\": ").append(jsonString(influence.name)).append(",\n")
		sb.append("      \"description\": ").append(jsonString(descriptionOf(influence))).append(",\n")
		sb.append("      \"outputSRP\": ").append(jsonString(if (influence.outputSRP !== null) influence.outputSRP.name else null)).append(",\n")
		sb.append("      \"linkedCriteria\": ")

		val criteria = if (influence.outputSRP !== null)
				criteriaConstraining(model, influence.outputSRP)
			else
				newArrayList

		appendStringArray(sb, criteria.map[name])

		sb.append(",\n")
		sb.append("      \"linkedRequirements\": ")
		appendStringArray(sb, criteria.map[requirementLabel(requirementRef)])

		sb.append(",\n")
		sb.append("      \"participants\": ")
		appendParticipants(sb, influence)

		sb.append(",\n")
		sb.append("      \"function\": ")
		appendInfluenceFunction(sb, influence.ownedInfluenceFunction)

		sb.append("\n")
		sb.append("    }")
	}

	private def void appendParticipants(StringBuilder sb, Influence influence) {
		sb.append("[\n")

		var first = true

		for (participant : influence.ownedParticipants) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("        {\n")
			sb.append("          \"name\": ").append(jsonString(nameOf(participant))).append(",\n")
			sb.append("          \"type\": ").append(jsonString(participant.eClass.name)).append(",\n")
			sb.append("          \"target\": ").append(jsonString(participantTargetName(participant))).append(",\n")
			sb.append("          \"confidence\": ").append(jsonNumber(doubleFeature(participant, "confidence"))).append(",\n")
			sb.append("          \"admissibleSpace\": ")

			appendAdmissibleSpace(sb, participant)

			sb.append("\n")
			sb.append("        }")
		}

		sb.append("\n      ]")
	}

	private def void appendInfluenceFunction(StringBuilder sb, InfluenceFunction function) {
		if (function === null) {
			sb.append("null")
			return
		}

		sb.append("{\n")
		sb.append("        \"name\": ").append(jsonString(function.name)).append(",\n")
		sb.append("        \"representations\": ")

		appendFunctionRepresentations(sb, function)

		sb.append("\n")
		sb.append("      }")
	}

	private def void appendFunctionRepresentations(StringBuilder sb, InfluenceFunction function) {
		sb.append("[\n")

		var first = true

		for (representation : function.representations) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("          {\n")
			sb.append("            \"name\": ").append(jsonString(nameOf(representation))).append(",\n")
			sb.append("            \"type\": ").append(jsonString(representation.eClass.name)).append(",\n")
			sb.append("            \"confidence\": ").append(jsonNumber(doubleFeature(representation, "confidence")))

			if (representation instanceof AnalyticExpressionFunction) {
				val analytic = representation as AnalyticExpressionFunction

				sb.append(",\n")
				sb.append("            \"expression\": ").append(jsonString(analytic.expression)).append(",\n")
				sb.append("            \"expressionLanguage\": ").append(jsonString(String.valueOf(analytic.expressionLanguage)))
			} else if (representation instanceof NaturalLanguageFunction) {
				sb.append(",\n")
				sb.append("            \"definition\": ").append(jsonString(stringFeature(representation, "definition")))
			} else if (representation instanceof ParticipantImpactFunction) {
				val impactFunction = representation as ParticipantImpactFunction

				sb.append(",\n")
				sb.append("            \"participantContributions\": ")
				appendParticipantContributions(sb, impactFunction)
			} else if (representation instanceof MonotonicityTable) {
				sb.append(",\n")
				sb.append("            \"rowsCount\": ").append(collectionSize(representation, "tableRows"))
			}

			sb.append("\n")
			sb.append("          }")
		}

		sb.append("\n        ]")
	}

	private def void appendParticipantContributions(StringBuilder sb, ParticipantImpactFunction impactFunction) {
		sb.append("[\n")

		var first = true

		for (impact : impactFunction.participantContribution) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("              {\n")
			sb.append("                \"participant\": ").append(jsonString(if (impact.participant !== null) nameOf(impact.participant) else null)).append(",\n")
			sb.append("                \"target\": ").append(jsonString(if (impact.participant !== null) participantTargetName(impact.participant) else null)).append(",\n")
			sb.append("                \"importance\": ").append(jsonNumber(impact.importance)).append(",\n")
			sb.append("                \"direction\": ").append(jsonString(String.valueOf(impact.direction))).append(",\n")
			sb.append("                \"rationale\": ").append(jsonString(impact.rationale)).append("\n")
			sb.append("              }")
		}

		sb.append("\n            ]")
	}

	private def void appendMetrics(StringBuilder sb, ImpactMetrics.Result metrics) {
		sb.append("{\n")

		sb.append("    \"impactArtifacts\": ")
		appendIntMap(sb, metrics.impactArtifacts)
		sb.append(",\n")

		sb.append("    \"impactEnvironmentalFactors\": ")
		appendIntMap(sb, metrics.impactEnvFactors)
		sb.append(",\n")

		sb.append("    \"sensitiveRequirements\": ")
		appendIntMap(sb, metrics.sensRequirements)
		sb.append(",\n")

		sb.append("    \"impactArtifactsWeighted\": ")
		appendDoubleMap(sb, metrics.impactArtifactsW)
		sb.append(",\n")

		sb.append("    \"impactEnvironmentalFactorsWeighted\": ")
		appendDoubleMap(sb, metrics.impactEnvFactorsW)
		sb.append(",\n")

		sb.append("    \"impactArtifactsPropagated\": ")
		appendIntMap(sb, metrics.impactArtifactsPropagated)
		sb.append(",\n")

		sb.append("    \"impactArtifactsIndirect\": ")
		appendIntMap(sb, metrics.impactArtifactsIndirect)
		sb.append(",\n")

		sb.append("    \"impactArtifactsPropagatedWeighted\": ")
		appendDoubleMap(sb, metrics.impactArtifactsPropagatedW)
		sb.append(",\n")

		sb.append("    \"impactEnvironmentalFactorsPropagated\": ")
		appendIntMap(sb, metrics.impactEnvFactorsPropagated)
		sb.append(",\n")

		sb.append("    \"impactEnvironmentalFactorsIndirect\": ")
		appendIntMap(sb, metrics.impactEnvFactorsIndirect)
		sb.append(",\n")

		sb.append("    \"impactEnvironmentalFactorsPropagatedWeighted\": ")
		appendDoubleMap(sb, metrics.impactEnvFactorsPropagatedW)
		sb.append("\n")

		sb.append("  }")
	}

	private def void appendDeveloperViews(StringBuilder sb, InfluenceModel model) {
		val views = buildDeveloperViews(model)

		sb.append("[\n")

		var first = true

		for (view : views.values) {
			if (!first) {
				sb.append(",\n")
			}
			first = false

			sb.append("    {\n")
			sb.append("      \"id\": ").append(jsonString(view.id)).append(",\n")
			sb.append("      \"displayName\": ").append(jsonString(view.id)).append(",\n")

			sb.append("      \"ownedArtifacts\": ")
			appendStringArray(sb, view.artifacts)
			sb.append(",\n")

			sb.append("      \"influences\": ")
			appendStringArray(sb, view.influences)
			sb.append(",\n")

			sb.append("      \"systemResponseProperties\": ")
			appendStringArray(sb, view.srps)
			sb.append(",\n")

			sb.append("      \"requirements\": ")
			appendStringArray(sb, view.requirements)
			sb.append("\n")

			sb.append("    }")
		}

		sb.append("\n  ]")
	}

	private def Map<String, DeveloperView> buildDeveloperViews(InfluenceModel model) {
		val views = new LinkedHashMap<String, DeveloperView>
		val artifactOwners = new LinkedHashMap<DesignArtifact, String>

		for (artifact : model.ownedArtifacts) {
			val owner = ownerOfArtifact(artifact)
			artifactOwners.put(artifact, owner)
			getOrCreateView(views, owner).artifacts.add(artifact.name)
		}

		for (abstractInfluence : model.ownedInfluences) {
			if (abstractInfluence instanceof Influence) {
				val influence = abstractInfluence as Influence
				val linkedRequirements = requirementLabelsForInfluence(model, influence)

				for (participant : influence.ownedParticipants) {
					if (participant instanceof ArtifactParticipant) {
						val artifact = participant.target

						if (artifact !== null) {
							val owner = if (artifactOwners.containsKey(artifact))
									artifactOwners.get(artifact)
								else
									ownerOfArtifact(artifact)

							val view = getOrCreateView(views, owner)

							view.influences.add(influence.name)

							if (influence.outputSRP !== null) {
								view.srps.add(influence.outputSRP.name)
							}

							view.requirements.addAll(linkedRequirements)
						}
					}
				}
			}
		}

		return views
	}

	private def DeveloperView getOrCreateView(Map<String, DeveloperView> views, String id) {
		val safeId = if (id === null || id.trim.empty) "Unknown" else id
		var view = views.get(safeId)

		if (view === null) {
			view = new DeveloperView(safeId)
			views.put(safeId, view)
		}

		return view
	}

	private def LinkedHashSet<String> requirementLabelsForInfluence(InfluenceModel model, Influence influence) {
		val out = new LinkedHashSet<String>

		if (influence !== null && influence.outputSRP !== null) {
			for (criterion : criteriaConstraining(model, influence.outputSRP)) {
				out.add(requirementLabel(criterion.requirementRef))
			}
		}

		return out
	}

	private def String buildGraphData(GraphBuilder.Result graphBundle) {
		val sb = new StringBuilder

		sb.append("{\n")

		sb.append("  \"nodes\": [\n")

		val nodes = new ArrayList<String>(graphBundle.vertexLabels.keySet)
		Collections.sort(nodes)

		var firstNode = true

		for (nodeId : nodes) {
			if (!firstNode) {
				sb.append(",\n")
			}
			firstNode = false

			sb.append("    {\n")
			sb.append("      \"id\": ").append(jsonString(nodeId)).append(",\n")
			sb.append("      \"label\": ").append(jsonString(graphBundle.vertexLabels.get(nodeId))).append(",\n")
			sb.append("      \"type\": ").append(jsonString(nodeType(nodeId))).append(",\n")
			sb.append("      \"origin\": ").append(jsonString(graphBundle.nodeToOrigin.get(nodeId))).append(",\n")
			sb.append("      \"sourceModel\": ").append(jsonString(graphBundle.nodeSourceModel.get(nodeId))).append("\n")
			sb.append("    }")
		}

		sb.append("\n  ],\n")

		sb.append("  \"edges\": [\n")

		var firstEdge = true

		for (DefaultEdge edge : graphBundle.graph.edgeSet) {
			if (!firstEdge) {
				sb.append(",\n")
			}
			firstEdge = false

			val source = graphBundle.graph.getEdgeSource(edge)
			val target = graphBundle.graph.getEdgeTarget(edge)

			sb.append("    {\n")
			sb.append("      \"source\": ").append(jsonString(source)).append(",\n")
			sb.append("      \"target\": ").append(jsonString(target)).append(",\n")
			sb.append("      \"label\": ").append(jsonString(graphBundle.edgeLabels.get(edge))).append(",\n")
			sb.append("      \"origin\": ").append(jsonString(graphBundle.edgeToOrigin.get(edge))).append(",\n")
			sb.append("      \"weight\": ").append(jsonNumber(graphBundle.edgeWeights.get(edge))).append("\n")
			sb.append("    }")
		}

		sb.append("\n  ]\n")
		sb.append("}\n")

		return sb.toString
	}

	private def Iterable<SatisfactionCriterion> criteriaConstraining(InfluenceModel model, SystemResponseProperty srp) {
		val out = new ArrayList<SatisfactionCriterion>

		if (model !== null && srp !== null) {
			for (criterion : model.ownedSatisfactionCriteria) {
				if (criterion.constrainedSRPs !== null && criterion.constrainedSRPs.contains(srp)) {
					out.add(criterion)
				}
			}
		}

		return out
	}

	private def boolean hasAnalyticFunction(Influence influence) {
		if (influence === null || influence.ownedInfluenceFunction === null) {
			return false
		}

		if (influence.ownedInfluenceFunction.representations === null) {
			return false
		}

		for (representation : influence.ownedInfluenceFunction.representations) {
			if (representation instanceof AnalyticExpressionFunction) {
				return true
			}
		}

		return false
	}

	private def String participantTargetName(Participant participant) {
		if (participant instanceof ArtifactParticipant) {
			return if (participant.target !== null) participant.target.name else null
		}

		if (participant instanceof EnvironmentalFactorParticipant) {
			return if (participant.target !== null) participant.target.name else null
		}

		if (participant instanceof SRPInputParticipant) {
			return if (participant.target !== null) participant.target.name else null
		}

		return null
	}

	private def void appendAdmissibleSpace(StringBuilder sb, EObject participant) {
		val value = objectFeature(participant, "admissibleSpace")

		if (value === null) {
			sb.append("null")
			return
		}

		sb.append("{\n")
		sb.append("            \"type\": ").append(jsonString(value.eClass.name)).append(",\n")
		sb.append("            \"lower\": ").append(jsonNumber(firstDoubleFeature(value, #["lower", "lowerBound", "min", "minimum"]))).append(",\n")
		sb.append("            \"upper\": ").append(jsonNumber(firstDoubleFeature(value, #["upper", "upperBound", "max", "maximum"]))).append(",\n")
		sb.append("            \"nominal\": ").append(jsonNumber(firstDoubleFeature(value, #["nominal", "nominalValue"]))).append(",\n")
		sb.append("            \"step\": ").append(jsonNumber(firstDoubleFeature(value, #["step", "stepSize"]))).append(",\n")
		sb.append("            \"unit\": ").append(jsonString(firstStringFeature(value, #["unit"]))).append("\n")
		sb.append("          }")
	}

	private def String ownerOfArtifact(DesignArtifact artifact) {
		if (artifact === null) {
			return "Unknown"
		}

		val refLabel = externalReferenceLabel(artifact.ref)

		if (refLabel !== null && refLabel.contains(".")) {
			return refLabel.substring(0, refLabel.indexOf("."))
		}

		val uri = uriOf(artifact.ref)

		if (uri !== null && !uri.trim.empty) {
			val simple = uri.substring(uri.lastIndexOf("/") + 1)
			val dot = simple.indexOf(".")

			if (dot > 0) {
				return simple.substring(0, dot)
			}

			return simple
		}

		return "Unknown"
	}

	private def String externalReferenceLabel(EObject obj) {
		if (obj === null) {
			return null
		}

		val names = new ArrayList<String>
		var EObject current = obj

		while (current !== null) {
			val n = nameOf(current)

			if (n !== null && !n.trim.empty) {
				names.add(0, n)
			}

			current = current.eContainer
		}

		if (!names.empty) {
			return names.join(".")
		}

		return uriOf(obj)
	}

	private def String requirementLabel(EObject requirementRef) {
		val label = externalReferenceLabel(requirementRef)

		if (label === null || label.trim.empty) {
			return "UnknownRequirement"
		}

		return label
	}

	private def String uriOf(EObject obj) {
		if (obj === null) {
			return null
		}

		try {
			val uri = EcoreUtil.getURI(obj)

			if (uri !== null) {
				return uri.toString
			}
		} catch (Throwable ignored) {
			return null
		}

		return null
	}

	private def String descriptionOf(EObject obj) {
		return stringFeature(obj, "description")
	}

	private def String nameOf(EObject obj) {
		return stringFeature(obj, "name")
	}

	private def EObject objectFeature(EObject obj, String featureName) {
		if (obj === null || featureName === null) {
			return null
		}

		val feature = obj.eClass.getEStructuralFeature(featureName)

		if (feature === null || !obj.eIsSet(feature)) {
			return null
		}

		val value = obj.eGet(feature)

		if (value instanceof EObject) {
			return value as EObject
		}

		return null
	}

	private def String stringFeature(EObject obj, String featureName) {
		if (obj === null || featureName === null) {
			return null
		}

		val feature = obj.eClass.getEStructuralFeature(featureName)

		if (feature === null || !obj.eIsSet(feature)) {
			return null
		}

		val value = obj.eGet(feature)

		if (value !== null) {
			return String.valueOf(value)
		}

		return null
	}

	private def Double doubleFeature(EObject obj, String featureName) {
		if (obj === null || featureName === null) {
			return null
		}

		val feature = obj.eClass.getEStructuralFeature(featureName)

		if (feature === null || !obj.eIsSet(feature)) {
			return null
		}

		val value = obj.eGet(feature)

		if (value instanceof Number) {
			return (value as Number).doubleValue
		}

		if (value instanceof String) {
			try {
				return java.lang.Double.parseDouble(value as String)
			} catch (Throwable ignored) {
				return null
			}
		}

		return null
	}

	private def Double firstDoubleFeature(EObject obj, Iterable<String> featureNames) {
		for (featureName : featureNames) {
			val value = doubleFeature(obj, featureName)

			if (value !== null) {
				return value
			}
		}

		return null
	}

	private def String firstStringFeature(EObject obj, Iterable<String> featureNames) {
		for (featureName : featureNames) {
			val value = stringFeature(obj, featureName)

			if (value !== null) {
				return value
			}
		}

		return null
	}

	private def int collectionSize(EObject obj, String featureName) {
		if (obj === null || featureName === null) {
			return 0
		}

		val feature = obj.eClass.getEStructuralFeature(featureName)

		if (feature === null || !obj.eIsSet(feature)) {
			return 0
		}

		val value = obj.eGet(feature)

		if (value instanceof java.util.Collection<?>) {
			return (value as java.util.Collection<?>).size
		}

		if (value !== null) {
			return 1
		}

		return 0
	}

	private def String nodeType(String nodeId) {
		if (nodeId === null) {
			return "Unknown"
		}

		if (nodeId.startsWith("A:")) {
			return "Artifact"
		}

		if (nodeId.startsWith("E:")) {
			return "EnvironmentalFactor"
		}

		if (nodeId.startsWith("SR:")) {
			return "SystemResponseProperty"
		}

		if (nodeId.startsWith("I:")) {
			return "Influence"
		}

		if (nodeId.startsWith("R:")) {
			return "Requirement"
		}

		return "Unknown"
	}

	private def void appendStringArray(StringBuilder sb, Iterable<String> values) {
		sb.append("[")

		var first = true

		for (value : values) {
			if (!first) {
				sb.append(", ")
			}
			first = false
			sb.append(jsonString(value))
		}

		sb.append("]")
	}

	private def void appendIntMap(StringBuilder sb, Map<String, Integer> map) {
		sb.append("{")

		if (map !== null) {
			val keys = new ArrayList<String>(map.keySet)
			Collections.sort(keys)

			var first = true

			for (key : keys) {
				if (!first) {
					sb.append(", ")
				}
				first = false

				sb.append(jsonString(key))
				sb.append(": ")
				sb.append(map.get(key))
			}
		}

		sb.append("}")
	}

	private def void appendDoubleMap(StringBuilder sb, Map<String, Double> map) {
		sb.append("{")

		if (map !== null) {
			val keys = new ArrayList<String>(map.keySet)
			Collections.sort(keys)

			var first = true

			for (key : keys) {
				if (!first) {
					sb.append(", ")
				}
				first = false

				sb.append(jsonString(key))
				sb.append(": ")
				sb.append(jsonNumber(map.get(key)))
			}
		}

		sb.append("}")
	}

	private def String jsonString(String value) {
		if (value === null) {
			return "null"
		}

		val escaped = value
			.replace("\\", "\\\\")
			.replace("\"", "\\\"")
			.replace("\n", "\\n")
			.replace("\r", "\\r")
			.replace("\t", "\\t")

		return "\"" + escaped + "\""
	}

	private def String jsonNumber(Double value) {
		if (value === null) {
			return "null"
		}

		if (java.lang.Double.isNaN(value.doubleValue) || java.lang.Double.isInfinite(value.doubleValue)) {
			return "null"
		}

		return String.format(Locale.US, "%.6f", value.doubleValue)
	}

	private def String jsonNumber(double value) {
		if (java.lang.Double.isNaN(value) || java.lang.Double.isInfinite(value)) {
			return "null"
		}

		return String.format(Locale.US, "%.6f", value)
	}

	static class DeveloperView {
		public val String id
		public val Set<String> artifacts = new LinkedHashSet<String>
		public val Set<String> influences = new LinkedHashSet<String>
		public val Set<String> srps = new LinkedHashSet<String>
		public val Set<String> requirements = new LinkedHashSet<String>

		new(String id) {
			this.id = id
		}
	}
}