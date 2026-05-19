package fr.inria.kairos.influence.export

import fr.inria.kairos.influence.analysis.AnalyticRequirementImpactAnalyzer
import fr.inria.kairos.influence.analysis.DesignValueArtifacts
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction
import fr.inria.kairos.influence.metamodel.DesignArtifact
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.InfluenceModel
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map
import java.util.Set
import java.util.TreeSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2

class AnalyticRequirementImpactExporter {

	static val double TOL = 1e-12

	def void export(Resource resource, IFileSystemAccess2 fsa, String outputPath) {
		val report = new StringBuilder

		report.append("Analytic Requirement Impact Analysis\n")
		report.append("====================================\n\n")

		if (resource === null || resource.contents.empty) {
			report.append("No resource content. Nothing to analyze.\n")
			fsa.generateFile(outputPath, report.toString)
			return
		}

		if (!(resource.contents.head instanceof InfluenceModel)) {
			report.append("Root object is not an InfluenceModel. Nothing to analyze.\n")
			fsa.generateFile(outputPath, report.toString)
			return
		}

		val model = resource.contents.head as InfluenceModel

		val scenario = buildScenario(model, report)

		val allCriterionResults =
			new ArrayList<AnalyticRequirementImpactAnalyzer.CriterionAnalysisResult>()

		report.append("\n\nAnalytic influence evaluations\n")
		report.append("==============================\n\n")

		for (influence : model.ownedInfluences.filter(Influence)) {
			if (hasAnalyticRepresentation(influence)) {
				report.append("------------------------------------------------------------\n")
				report.append("Influence: ").append(influence.name).append("\n")
				report.append("------------------------------------------------------------\n\n")

				try {
					val result = AnalyticRequirementImpactAnalyzer
						.evaluateInfluenceForAllRequirements(model, influence, scenario)

					report.append(result.trace).append("\n")

					allCriterionResults.addAll(result.resultsByCriterion.values)
				} catch (Throwable t) {
					report.append("ERROR while evaluating influence ")
						.append(influence.name)
						.append(": ")
						.append(t.class.simpleName)
						.append(" - ")
						.append(t.message)
						.append("\n\n")
				}
			} else {
				report.append("Skipping influence ")
					.append(influence.name)
					.append(": no AnalyticExpressionFunction representation.\n\n")
			}
		}

		appendGlobalTradeoffSummary(allCriterionResults, report)

		fsa.generateFile(outputPath, report.toString)
	}

	private def Map<String, Double> buildScenario(InfluenceModel model, StringBuilder report) {
		val scenario = new LinkedHashMap<String, Double>

		report.append("Scenario construction\n")
		report.append("=====================\n\n")

		report.append("Artifact values extracted from DesignArtifact.ref:\n")

		for (artifact : model.ownedArtifacts) {
			val value = readArtifactNumericValue(artifact)

			if (value !== null) {
				scenario.put(artifact.name, value)

				report.append("  ")
					.append(artifact.name)
					.append(" = ")
					.append(String.format(java.util.Locale.US, "%.6f", value))
					.append("\n")
			} else {
				report.append("  ")
					.append(artifact.name)
					.append(" = <missing numeric value from referenced EObject>\n")
			}
		}

		report.append("\nEnvironmental factors:\n")
		report.append("  Values are taken from EnvironmentalFactorParticipant.admissibleSpace when available.\n")
		report.append("  If a factor has no admissibleSpace and no scenario value, the analytic evaluation will fail for that influence.\n")

		return scenario
	}

	private def Double readArtifactNumericValue(DesignArtifact artifact) {
		if (artifact === null || artifact.ref === null) {
			return null
		}

		try {
			val optional = DesignValueArtifacts.resolveNumeric(artifact.ref)

			if (optional !== null && optional.isPresent()) {
				return optional.getAsDouble()
			}
		 } catch (Throwable ignored) {
			//The value is missing.
		}

		return null
	}

	private def boolean hasAnalyticRepresentation(Influence influence) {
		if (influence === null || influence.ownedInfluenceFunction === null) {
			return false
		}

		if (influence.ownedInfluenceFunction.representations === null) {
			return false
		}

		return influence.ownedInfluenceFunction.representations.exists[
			it instanceof AnalyticExpressionFunction
		]
	}

	private def void appendGlobalTradeoffSummary(
		Iterable<AnalyticRequirementImpactAnalyzer.CriterionAnalysisResult> results,
		StringBuilder report
	) {
		val benefits = new LinkedHashMap<String, Set<String>>
		val prejudices = new LinkedHashMap<String, Set<String>>
		val neutral = new LinkedHashMap<String, Set<String>>

		for (result : results) {
			val requirement = if (result.requirementLabel !== null)
					result.requirementLabel
				else
					"<unknown-requirement>"

			for (entry : result.grad.entrySet) {
				val variable = entry.key
				val gradient = entry.value

				if (Math.abs(gradient) < TOL) {
					addToSet(neutral, variable, requirement)
				} else if (gradient > 0.0) {
					addToSet(benefits, variable, requirement)
				} else {
					addToSet(prejudices, variable, requirement)
				}
			}
		}

		val variables = new TreeSet<String>
		variables.addAll(benefits.keySet)
		variables.addAll(prejudices.keySet)
		variables.addAll(neutral.keySet)

		report.append("\n\nGlobal cross-requirement trade-off summary\n")
		report.append("==========================================\n\n")

		var conflictCount = 0

		for (variable : variables) {
			val b = benefits.get(variable)
			val p = prejudices.get(variable)

			if (b !== null && !b.empty && p !== null && !p.empty) {
				conflictCount++

				report.append("Variable ")
					.append(variable)
					.append(" benefits ")
					.append(b)
					.append(" but prejudices ")
					.append(p)
					.append(".\n")
			}
		}

		if (conflictCount == 0) {
			report.append("No cross-requirement trade-off detected from analytic evaluations.\n")
		}

		report.append("\nInterpretation:\n")
		report.append("  positive dM/dx => increasing x helps satisfaction\n")
		report.append("  negative dM/dx => increasing x hurts satisfaction\n")
		report.append("  M >= 0 => satisfied\n")
		report.append("  M < 0  => violated\n")
	}

	private def void addToSet(Map<String, Set<String>> map, String key, String value) {
		var set = map.get(key)

		if (set === null) {
			set = new LinkedHashSet<String>
			map.put(key, set)
		}

		set.add(value)
	}
}