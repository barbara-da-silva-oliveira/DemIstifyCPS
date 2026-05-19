package fr.inria.kairos.influence.export

import fr.inria.kairos.influence.analysis.CandidateCompensatorAnalyzer
import fr.inria.kairos.influence.analysis.ImpactMetrics
import java.util.HashMap
import org.eclipse.xtext.generator.IFileSystemAccess2

class MetricsReportExporter {

	def void export(
		ImpactMetrics.Result metrics,
		CandidateCompensatorAnalyzer.Result compensators,
		IFileSystemAccess2 fsa,
		String outPath
	) {
		val reportBuilder = new StringBuilder("Metrics on the Influences:\n")
		val infoExporter = new InfoExporter

		reportBuilder.append("\nImpact of Artifacts (origin count):\n")
		infoExporter.appendSortedIntMap(reportBuilder, new HashMap<String, Integer>(metrics.impactArtifacts))

		reportBuilder.append("\nImpact of Environment Factor (origin count):\n")
		infoExporter.appendSortedIntMap(reportBuilder, new HashMap<String, Integer>(metrics.impactEnvFactors))

		reportBuilder.append("\nImpact of Artifacts Propagated (origin count):\n")
		infoExporter.appendSortedIntMap(reportBuilder, new HashMap<String, Integer>(metrics.impactArtifactsPropagated))

		reportBuilder.append("\nImpact of Environment Factor Propagated (origin count):\n")
		infoExporter.appendSortedIntMap(reportBuilder, new HashMap<String, Integer>(metrics.impactEnvFactorsPropagated))

		reportBuilder.append("\nSensibility of Requirements (counts):\n")
		infoExporter.appendSortedIntMap(reportBuilder, new HashMap<String, Integer>(metrics.sensRequirements))

		reportBuilder.append("\nImpact of Artifacts Propagated (weighted):\n")
		infoExporter.appendSortedDoubleMap(reportBuilder, new HashMap<String, Double>(metrics.impactArtifactsPropagatedW))

		reportBuilder.append("\nImpact of Environment Factor Propagated (weighted):\n")
		infoExporter.appendSortedDoubleMap(reportBuilder, new HashMap<String, Double>(metrics.impactEnvFactorsPropagatedW))

		appendCandidateCompensators(reportBuilder, compensators)

		fsa.generateFile(outPath, reportBuilder.toString)
	}

	private def void appendCandidateCompensators(
		StringBuilder reportBuilder,
		CandidateCompensatorAnalyzer.Result compensators
	) {
		reportBuilder.append("\nCandidate potential beneficial changes on participants traced per requirement:\n")

		for (entry : compensators.candidatesByRequirement.entrySet) {
			val requirementName = entry.key
			val candidates = entry.value

			val items = candidates.entrySet.toList

			items.sort [ a, b |
				val cmp = Integer::compare(a.value, b.value)
				if (cmp != 0) cmp else a.key.compareTo(b.key)
			]

			reportBuilder.append("  ").append(requirementName).append(": ")

			if (items.empty) {
				reportBuilder.append("(none)\n")
			} else {
				val parts = items.map [ e |
					val hop = e.value
					val plural = if (hop == 1) "" else "s"
					e.key + " (" + hop + " hop" + plural + ")"
				]

				reportBuilder.append(parts.join(", ")).append("\n")
			}
		}
	}
}