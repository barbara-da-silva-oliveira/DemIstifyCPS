package fr.inria.kairos.influence.analysis

import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map
import java.util.TreeSet

class CandidateCompensatorAnalyzer {
// Candidate potential beneficial changes on participants traced per requirement
	static class Result {
		public val Map<String, Map<String, Integer>> candidatesByRequirement

		new(Map<String, Map<String, Integer>> candidatesByRequirement) {
			this.candidatesByRequirement = candidatesByRequirement
		}
	}

	def Result analyze(GraphBuilder.Result graphBundle) {
		val result = new LinkedHashMap<String, Map<String, Integer>>()
		val distanceAnalyzer = new UpstreamDistanceAnalyzer()

		for (requirementName : new TreeSet<String>(graphBundle.reqToSRs.keySet)) {
			val minHopByNode = new HashMap<String, Integer>()
			val srpNames = graphBundle.reqToSRs.get(requirementName)

			if (srpNames !== null) {
				for (srpSimpleName : srpNames) {
					addMinDistances(
						minHopByNode,
						distanceAnalyzer.computeUpstreamDistancesFromSrp(
							"SR:" + srpSimpleName,
							graphBundle.inEdges,
							graphBundle.srp2inf,
							"A:"
						)
					)

					addMinDistances(
						minHopByNode,
						distanceAnalyzer.computeUpstreamDistancesFromSrp(
							"SR:" + srpSimpleName,
							graphBundle.inEdges,
							graphBundle.srp2inf,
							"E:"
						)
					)
				}
			}

			result.put(requirementName, minHopByNode)
		}

		new Result(result)
	}

	private def void addMinDistances(
		Map<String, Integer> target,
		Map<String, Integer> source
	) {
		for (entry : source.entrySet) {
			val previous = target.get(entry.key)

			if (previous === null || entry.value < previous) {
				target.put(entry.key, entry.value)
			}
		}
	}
}