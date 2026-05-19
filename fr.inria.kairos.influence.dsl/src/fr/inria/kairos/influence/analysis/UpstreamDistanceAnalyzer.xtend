package fr.inria.kairos.influence.analysis

import java.util.ArrayDeque
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashSet
import java.util.Map

class UpstreamDistanceAnalyzer {
//Using BFS
	def Map<String, Integer> computeUpstreamDistancesFromSrp(
		String srpId,
		Map<String, LinkedHashSet<String>> incomingAdjacency,
		Map<String, String> srpToInfluence,
		String targetPrefix
	) {
		val distances = new HashMap<String, Integer>()
		val visitedSrps = new HashSet<String>()
		val worklist = new ArrayDeque<PairNode>()

		val producerInfluenceId = srpToInfluence.get(srpId)

		if (producerInfluenceId !== null) {
			worklist.add(new PairNode(producerInfluenceId, 0))
		}

		while (!worklist.isEmpty) {
			val current = worklist.removeFirst
			val currentInfluenceId = current.nodeId
			val currentHops = current.hops

			val upstreamNodes = incomingAdjacency.get(currentInfluenceId)

			if (upstreamNodes !== null) {
				for (upstreamNodeId : upstreamNodes) {
					val nextHops = currentHops + 1

					if (upstreamNodeId.startsWith(targetPrefix)) {
						val previous = distances.get(upstreamNodeId)

						if (previous === null || nextHops < previous) {
							distances.put(upstreamNodeId, nextHops)
						}
					} else if (upstreamNodeId.startsWith("SR:")) {
						if (!visitedSrps.contains(upstreamNodeId)) {
							visitedSrps.add(upstreamNodeId)

							val upstreamProducer = srpToInfluence.get(upstreamNodeId)

							if (upstreamProducer !== null) {
								worklist.add(new PairNode(upstreamProducer, nextHops))
							}
						}
					}
				}
			}
		}

		distances
	}

	static class PairNode {
		public val String nodeId
		public val int hops

		new(String nodeId, int hops) {
			this.nodeId = nodeId
			this.hops = hops
		}
	}
}