package fr.inria.kairos.influence.analysis

import java.util.ArrayDeque
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashSet
import java.util.Map
import java.util.Set

/*
 * Traceability queries over the canonical graph produced by GraphBuilder.
 *
 * Requirements are graph nodes created from SatisfactionCriterion.requirementRef
 * by GraphBuilder:
 *
 *   SR:<srpName> -> R:<requirementLabel>
 *
 * The requirement label can be a local name, an external model name,
 * or an URI-derived label.
 */
class RequirementTraceability {

	val GraphBuilder.Result canonicalGraph

	new(GraphBuilder.Result graphBundle) {
		this.canonicalGraph = graphBundle
	}

	/*
	 * Resolve requirement -> artifacts as explicit path tuples:
	 *
	 *   R <- SR <- I <- A
	 *
	 * Returned tuple is stored as:
	 *   requirementId, srpId, influenceId, artifactId
	 */
	def Iterable<TracePath> traceRequirementToArtifacts(String requirementNameOrId) {
		val collectedPaths = new java.util.ArrayList<TracePath>()

		if (canonicalGraph === null) {
			return collectedPaths
		}

		val requirementId = normalizeRequirementId(requirementNameOrId)
		val srpIdsConstrainedByRequirement = canonicalGraph.inEdges.get(requirementId)

		if (srpIdsConstrainedByRequirement !== null) {
			for (srpId : srpIdsConstrainedByRequirement) {
				if (srpId !== null && srpId.startsWith("SR:")) {
					val producerInfluenceId = canonicalGraph.srp2inf.get(srpId)

					if (producerInfluenceId !== null) {
						val incomingToInfluence = canonicalGraph.inEdges.get(producerInfluenceId)

						if (incomingToInfluence !== null) {
							for (upstreamNodeId : incomingToInfluence) {
								if (upstreamNodeId !== null && upstreamNodeId.startsWith("A:")) {
									collectedPaths.add(new TracePath(
										requirementId,
										srpId,
										producerInfluenceId,
										upstreamNodeId
									))
								}
							}
						}
					}
				}
			}
		}

		collectedPaths
	}

	/*
	 * Resolve requirement -> environmental factors as explicit path tuples:
	 *
	 *   R <- SR <- I <- E
	 */
	def Iterable<TracePath> traceRequirementToEnvironmentalFactors(String requirementNameOrId) {
		val collectedPaths = new java.util.ArrayList<TracePath>()

		if (canonicalGraph === null) {
			return collectedPaths
		}

		val requirementId = normalizeRequirementId(requirementNameOrId)
		val srpIdsConstrainedByRequirement = canonicalGraph.inEdges.get(requirementId)

		if (srpIdsConstrainedByRequirement !== null) {
			for (srpId : srpIdsConstrainedByRequirement) {
				if (srpId !== null && srpId.startsWith("SR:")) {
					val producerInfluenceId = canonicalGraph.srp2inf.get(srpId)

					if (producerInfluenceId !== null) {
						val incomingToInfluence = canonicalGraph.inEdges.get(producerInfluenceId)

						if (incomingToInfluence !== null) {
							for (upstreamNodeId : incomingToInfluence) {
								if (upstreamNodeId !== null && upstreamNodeId.startsWith("E:")) {
									collectedPaths.add(new TracePath(
										requirementId,
										srpId,
										producerInfluenceId,
										upstreamNodeId
									))
								}
							}
						}
					}
				}
			}
		}

		collectedPaths
	}

	/*
	 * Resolve artifact -> requirements as explicit path tuples:
	 *
	 *   A -> I -> SR -> R
	 */
	def Iterable<TracePath> traceArtifactToRequirements(String artifactSimpleNameOrId) {
		val artifactId = normalizeArtifactId(artifactSimpleNameOrId)
		val collectedPaths = new java.util.ArrayList<TracePath>()

		if (canonicalGraph === null) {
			return collectedPaths
		}

		val influenceIdsConsumedByArtifact = canonicalGraph.outEdges.get(artifactId)

		if (influenceIdsConsumedByArtifact !== null) {
			for (influenceId : influenceIdsConsumedByArtifact) {
				if (influenceId !== null && influenceId.startsWith("I:")) {
					val srpOutputsOfInfluence = canonicalGraph.outEdges.get(influenceId)

					if (srpOutputsOfInfluence !== null) {
						for (srpId : srpOutputsOfInfluence) {
							if (srpId !== null && srpId.startsWith("SR:")) {
								val requirementIdsConstrainedBySrp = canonicalGraph.outEdges.get(srpId)

								if (requirementIdsConstrainedBySrp !== null) {
									for (requirementId : requirementIdsConstrainedBySrp) {
										if (requirementId !== null && requirementId.startsWith("R:")) {
											collectedPaths.add(new TracePath(
												requirementId,
												srpId,
												influenceId,
												artifactId
											))
										}
									}
								}
							}
						}
					}
				}
			}
		}

		collectedPaths
	}

	/*
	 * Resolve environmental factor -> requirements as explicit path tuples:
	 *
	 *   E -> I -> SR -> R
	 */
	def Iterable<TracePath> traceEnvironmentalFactorToRequirements(String factorSimpleNameOrId) {
		val factorId = normalizeFactorId(factorSimpleNameOrId)
		val collectedPaths = new java.util.ArrayList<TracePath>()

		if (canonicalGraph === null) {
			return collectedPaths
		}

		val influenceIdsConsumedByFactor = canonicalGraph.outEdges.get(factorId)

		if (influenceIdsConsumedByFactor !== null) {
			for (influenceId : influenceIdsConsumedByFactor) {
				if (influenceId !== null && influenceId.startsWith("I:")) {
					val srpOutputsOfInfluence = canonicalGraph.outEdges.get(influenceId)

					if (srpOutputsOfInfluence !== null) {
						for (srpId : srpOutputsOfInfluence) {
							if (srpId !== null && srpId.startsWith("SR:")) {
								val requirementIdsConstrainedBySrp = canonicalGraph.outEdges.get(srpId)

								if (requirementIdsConstrainedBySrp !== null) {
									for (requirementId : requirementIdsConstrainedBySrp) {
										if (requirementId !== null && requirementId.startsWith("R:")) {
											collectedPaths.add(new TracePath(
												requirementId,
												srpId,
												influenceId,
												factorId
											))
										}
									}
								}
							}
						}
					}
				}
			}
		}

		collectedPaths
	}

	/*
	 * Upstream artifacts for an SRP id.
	 *
	 * Accepts:
	 *   "Speed"
	 *   "SR:Speed"
	 */
	def Map<String, Integer> upstreamArtifacts(
		String srpNameOrId,
		Map<String, LinkedHashSet<String>> inEdges
	) {
		upstreamByPrefix(normalizeSrpId(srpNameOrId), inEdges, "A:")
	}

	/*
	 * Upstream environmental factors for an SRP id.
	 *
	 * Accepts:
	 *   "Speed"
	 *   "SR:Speed"
	 */
	def Map<String, Integer> upstreamEnvironmentalFactors(
		String srpNameOrId,
		Map<String, LinkedHashSet<String>> inEdges
	) {
		upstreamByPrefix(normalizeSrpId(srpNameOrId), inEdges, "E:")
	}

	/*
	 * Shared BFS used by upstreamArtifacts/upstreamEnvironmentalFactors.
	 *
	 * Walks backwards:
	 *   SR <- I <- A/E/SR
	 *
	 * If it finds an upstream SR, it continues with the influence that produced
	 * that upstream SR.
	 */
	private def Map<String, Integer> upstreamByPrefix(
		String srpId,
		Map<String, LinkedHashSet<String>> inEdges,
		String wantedPrefix
	) {
		val distances = new HashMap<String, Integer>()
		val visitedSrps = new HashSet<String>()
		val worklist = new ArrayDeque<WorkItem>()

		if (srpId === null || inEdges === null) {
			return distances
		}

		val incomingToSrp = inEdges.get(srpId)

		if (incomingToSrp !== null) {
			for (nodeId : incomingToSrp) {
				if (nodeId !== null && nodeId.startsWith("I:")) {
					worklist.add(new WorkItem(nodeId, 0))
				}
			}
		}

		while (!worklist.isEmpty) {
			val item = worklist.removeFirst
			val influenceId = item.nodeId
			val hopsSoFar = item.hops

			val incomingToInfluence = inEdges.get(influenceId)

			if (incomingToInfluence !== null) {
				val nextHops = hopsSoFar + 1

				for (upstreamNodeId : incomingToInfluence) {
					if (upstreamNodeId !== null) {
						if (upstreamNodeId.startsWith(wantedPrefix)) {
							val previous = distances.get(upstreamNodeId)

							if (previous === null || nextHops < previous) {
								distances.put(upstreamNodeId, nextHops)
							}
						} else if (upstreamNodeId.startsWith("SR:")) {
							if (!visitedSrps.contains(upstreamNodeId)) {
								visitedSrps.add(upstreamNodeId)

								val incomingToUpstreamSrp = inEdges.get(upstreamNodeId)

								if (incomingToUpstreamSrp !== null) {
									for (maybeInfluence : incomingToUpstreamSrp) {
										if (maybeInfluence !== null && maybeInfluence.startsWith("I:")) {
											worklist.add(new WorkItem(maybeInfluence, nextHops))
										}
									}
								}
							}
						}
					}
				}
			}
		}

		distances
	}

	/*
	 * Compute upstream base variables of a given SRP:
	 *
	 *   artifacts + environmental factors
	 *
	 * Accepts:
	 *   "Speed"
	 *   "SR:Speed"
	 */
	def UpstreamVariables findUpstreamBaseVariables(String srpNameOrId) {
		val rootSrpId = normalizeSrpId(srpNameOrId)

		val visitedSrpIds = new HashSet<String>()
		val upstreamArtifactIds = new HashSet<String>()
		val upstreamFactorIds = new HashSet<String>()

		if (canonicalGraph !== null && rootSrpId !== null) {
			visitedSrpIds.add(rootSrpId)

			depthFirstCollectUpstream(
				rootSrpId,
				visitedSrpIds,
				upstreamArtifactIds,
				upstreamFactorIds
			)
		}

		new UpstreamVariables(upstreamArtifactIds, upstreamFactorIds)
	}

	private def void depthFirstCollectUpstream(
		String currentSrpId,
		Set<String> visitedSrpIds,
		Set<String> collectedArtifactIds,
		Set<String> collectedFactorIds
	) {
		if (canonicalGraph === null || currentSrpId === null) {
			return
		}

		val producerInfluenceId = canonicalGraph.srp2inf.get(currentSrpId)

		if (producerInfluenceId !== null) {
			val incomingNodeIds = canonicalGraph.inEdges.get(producerInfluenceId)

			if (incomingNodeIds !== null) {
				for (upstreamNodeId : incomingNodeIds) {
					if (upstreamNodeId !== null) {
						if (upstreamNodeId.startsWith("A:")) {
							collectedArtifactIds.add(upstreamNodeId)
						} else if (upstreamNodeId.startsWith("E:")) {
							collectedFactorIds.add(upstreamNodeId)
						} else if (upstreamNodeId.startsWith("SR:")) {
							if (!visitedSrpIds.contains(upstreamNodeId)) {
								visitedSrpIds.add(upstreamNodeId)
								depthFirstCollectUpstream(
									upstreamNodeId,
									visitedSrpIds,
									collectedArtifactIds,
									collectedFactorIds
								)
							}
						}
					}
				}
			}
		}
	}

	/*
	 * Flattened table for exporters:
	 *
	 *   [requirement, srp, influence, artifact]
	 *
	 * The first argument can be:
	 *   "MyRequirement"
	 *   "R:MyRequirement"
	 *   "platform:/resource/..."
	 */
	def Iterable<String[]> buildImpactSummaryTableForRequirement(String requirementNameOrId) {
		val rows = new java.util.ArrayList<String[]>()

		for (path : traceRequirementToArtifacts(requirementNameOrId)) {
			rows.add(#[
				stripKnownPrefix(path.requirementId),
				stripKnownPrefix(path.srpId),
				stripKnownPrefix(path.influenceId),
				stripKnownPrefix(path.sourceId)
			])
		}

		rows
	}

	/*
	 * Useful when the caller does not know the exact external requirement label.
	 */
	def Iterable<String> requirementIds() {
		val result = new java.util.TreeSet<String>()

		if (canonicalGraph !== null && canonicalGraph.reqToSRs !== null) {
			for (requirementName : canonicalGraph.reqToSRs.keySet) {
				result.add(normalizeRequirementId(requirementName))
			}
		}

		result
	}

	def Iterable<String> requirementLabels() {
		requirementIds.map[stripKnownPrefix(it)]
	}

	// ---------- value types ----------

	static class TracePath {
		public val String requirementId
		public val String srpId
		public val String influenceId

		/*
		 *   A:<artifact>
		 *   E:<environmentalFactor>
		 *
		 * Historically this field was named artifactId.
		 * Keep getArtifactId() below for compatibility with old code.
		 */
		public val String sourceId

		new(
			String requirementId,
			String srpId,
			String influenceId,
			String sourceId
		) {
			this.requirementId = requirementId
			this.srpId = srpId
			this.influenceId = influenceId
			this.sourceId = sourceId
		}

		def String getArtifactId() {
			sourceId
		}

		def String getFactorId() {
			sourceId
		}
	}

	static class UpstreamVariables {
		public val Iterable<String> artifactIds
		public val Iterable<String> factorIds

		new(Iterable<String> artifactIds, Iterable<String> factorIds) {
			this.artifactIds = artifactIds
			this.factorIds = factorIds
		}
	}

	static class WorkItem {
		public val String nodeId
		public val int hops

		new(String nodeId, int hops) {
			this.nodeId = nodeId
			this.hops = hops
		}
	}

	// ---------- id helpers ----------

	private def static String normalizeArtifactId(String value) {
		if (value === null) {
			null
		} else if (value.startsWith("A:")) {
			value
		} else {
			"A:" + value
		}
	}

	private def static String normalizeFactorId(String value) {
		if (value === null) {
			null
		} else if (value.startsWith("E:")) {
			value
		} else {
			"E:" + value
		}
	}

	private def static String normalizeSrpId(String value) {
		if (value === null) {
			null
		} else if (value.startsWith("SR:")) {
			value
		} else {
			"SR:" + value
		}
	}

	private def static String normalizeRequirementId(String value) {
		if (value === null) {
			null
		} else if (value.startsWith("R:")) {
			value
		} else {
			"R:" + value
		}
	}

	private def static String stripKnownPrefix(String id) {
		if (id === null) {
			return ""
		}

		if (id.startsWith("SR:")) {
			return id.substring(3)
		}

		if (id.startsWith("A:") || id.startsWith("E:") || id.startsWith("I:") || id.startsWith("R:")) {
			return id.substring(2)
		}

		id
	}
}