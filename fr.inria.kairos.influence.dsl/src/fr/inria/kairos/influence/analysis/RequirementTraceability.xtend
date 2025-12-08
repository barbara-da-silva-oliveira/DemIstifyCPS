package fr.inria.kairos.influence.analysis

import fr.inria.kairos.influence.analysis.GraphBuilder
import java.util.Set
import java.util.HashSet
import java.util.Map


// Traceability queries over the canonical graph produced by GraphBuilder.

class RequirementTraceability {

// Canonical graph bundle .
	val GraphBuilder.Result canonicalGraph

	new(GraphBuilder.Result graphBundle) {
		this.canonicalGraph = graphBundle
	}

// Resolve requirements ->  artifacts as explicit path tuples R -> SRP > Influence <- Artifact.
	def Iterable<TracePath> traceRequirementToArtifacts(String requirementSimpleName) {
		val requirementId = toRequirementId(requirementSimpleName)
		val collectedPaths = newArrayList
		if (canonicalGraph === null) return collectedPaths
	    val srpIdsConstrainedByRequirement = canonicalGraph.inEdges.get(requirementId)
	
	    if (srpIdsConstrainedByRequirement !== null) {
	    	for (srpId : srpIdsConstrainedByRequirement) {
		        val producerInfluenceId = canonicalGraph.srp2inf.get(srpId)
		        if (producerInfluenceId !== null) {
		          val incomingToInfluence = canonicalGraph.inEdges.get(producerInfluenceId)
		          if (incomingToInfluence !== null) {
		            for (upstreamNodeId : incomingToInfluence) {
		              if (upstreamNodeId.startsWith("A:")) {
		                collectedPaths.add(new TracePath(
		                  requirementId, srpId, producerInfluenceId, upstreamNodeId
		                ))
		              } else {
		                // not an artifact; ignore or extend with factors as needed
		              }
		            }
		          } else {
		            // no upstream nodes connected to influence, nothing to add
		          }
		        } else {
		          // SRP has no recorded producer influence, nothing to add
		        }
	      }
	    } else {
	      // requirement has no outgoing SRP constraints, nothing to add
	    }
	
	    return collectedPaths
	  }

// Resolve artifacts -> requirements as explicit path tuples A -> Influence -> SRP -> R
	def Iterable<TracePath> traceArtifactToRequirements(String artifactSimpleName) {
	    val artifactId = toArtifactId(artifactSimpleName)
	    val collectedPaths = newArrayList

	    val influenceIdsConsumedByArtifact = canonicalGraph.outEdges.get(artifactId)
	    if (influenceIdsConsumedByArtifact !== null) {
	      for (influenceId : influenceIdsConsumedByArtifact) {
	        val srpOutputsOfInfluence = canonicalGraph.outEdges.get(influenceId)
	        if (srpOutputsOfInfluence !== null) {
	          for (srpId : srpOutputsOfInfluence) {
	            if (srpId.startsWith("SR:")) {
	              val requirementIdsConstrainedBySrp = canonicalGraph.outEdges.get(srpId)
	              if (requirementIdsConstrainedBySrp !== null) {
	                for (requirementId : requirementIdsConstrainedBySrp) {
	                  if (requirementId.startsWith("R:")) {
	                    collectedPaths.add(new TracePath(
	                      requirementId, srpId, influenceId, artifactId
	                    ))
	                  } else {
	                    // not a requirement node, ignore
	                  }
	                }
	              } else {
	                // SRP does not constrain any requirement, nothing to add
	              }
	            } else {
	              // edge is not SRP output, ignore
	            }
	          }
	        } else {
	          // influence has no SRP outputs, nothing to add
	        }
	      }
	    } else {
	      // artifact is not connected to any influence, nothing to add
	    }
	
	    return collectedPaths
	  }
  

	def Map<String, Integer> upstreamArtifacts(
	  String srpId,
	  Map<String, java.util.LinkedHashSet<String>> inEdges
	) {
	  return upstreamByPrefix(srpId, inEdges, "A:")
	}

// Upstreams Environmental Factors for an SRP id, using only inEdges.
	def Map<String, Integer> upstreamEnvironmentalFactors(
	  String srpId,
	  Map<String, java.util.LinkedHashSet<String>> inEdges
	) {
	  return upstreamByPrefix(srpId, inEdges, "E:")
	}

// --- Compatibility shim: upstream Artifacts via inEdges only.
// Accepts "SR:..." and works even if canonicalGraph is null.
// Returns min-hop distances from SRP -> Artifacts.
// Shared BFS used by the two shim methods; walks using inEdges only.
//  No `continue`; explicit if/else branching everywhere.

	private def Map<String, Integer> upstreamByPrefix(
	  String srpId,
	  Map<String, java.util.LinkedHashSet<String>> inEdges,
	  String wantedPrefix
	) {
		val distances   = new java.util.HashMap<String, Integer>()
		val visitedSrps = new java.util.HashSet<String>()
		val worklist    = new java.util.ArrayDeque<WorkItem>()
	
	  // Guard: inputs must exist
	  	if (srpId === null) {
	    	return distances
	  } else if (inEdges === null) {
	    	return distances
	  } else {
	    	val incomingToSrp = inEdges.get(srpId)
	    if (incomingToSrp === null) {
	    	return distances
	    } else {
	      // Seed queue with the influences that produce this SRP
	    	for (n : incomingToSrp) {
		        if (n !== null && n.startsWith("I:")) {
		          worklist.add(new WorkItem(n, 0))
		        } else {
		          // not an Influence node, ignore
		        }
	      	}
	    }
	  }

  // BFS
	while (!worklist.isEmpty) {
		val item = worklist.removeFirst
	    val influenceId = item.nodeId
	    val hopsSoFar   = item.hops
	
	    val incomingToInfluence = inEdges.get(influenceId)
	    if (incomingToInfluence !== null) {
	      val nextHops = hopsSoFar + 1
	      for (u : incomingToInfluence) {
	        if (u === null) {
	          // ignore nulls
	        } else if (u.startsWith(wantedPrefix)) {
	          val prev = distances.get(u)
	          if (prev === null || nextHops < prev) {
	            distances.put(u, nextHops)
	          } else {
	            // we already have a shorter distance, keeping it
	          }
	        } else if (u.startsWith("SR:")) {
	          if (!visitedSrps.contains(u)) {
	            visitedSrps.add(u)
	            // find the influences that produce this upstream SRP
	            val inc = inEdges.get(u)
	            if (inc !== null) {
	              for (maybeInf : inc) {
	                if (maybeInf !== null && maybeInf.startsWith("I:")) {
	                  worklist.add(new WorkItem(maybeInf, nextHops))
	                } else {
	                  // not an Influence, ignore
	                }
	              }
	            } else {
	              // upstream SRP has no producers in inEdges, stop this branch
	            }
	          } else {
	            // SRP already visited, avoid cycles
	          }
	        } else {
	          // other node types ignored
	        }
	      }
	    } else {
	      // influence has no incoming edges, nothing else to explore from here
	    }
	  }
	  return distances
	}

// Tiny queue item for BFS (influence node + hops).
	static class WorkItem {
		public val String nodeId
		public val int hops
		new(String nodeId, int hops) {
		    this.nodeId = nodeId
		    this.hops = hops
	  }
	}


// Compute upstream base variables (artifacts and factors) of a given SRP.
	def UpstreamVariables findUpstreamBaseVariables(String srpSimpleName) {
		val String rootSrpId = toSrpId(srpSimpleName)

		val Set<String> visitedSrpIds = new HashSet<String>()
		visitedSrpIds.add(rootSrpId)

		val Set<String> upstreamArtifactIds = new HashSet<String>()
		val Set<String> upstreamFactorIds  = new HashSet<String>()

		depthFirstCollectUpstream(
    	rootSrpId,
	    visitedSrpIds,
	    upstreamArtifactIds,
	    upstreamFactorIds
  		)

  	return new UpstreamVariables(upstreamArtifactIds, upstreamFactorIds)
	}
// 
//  DFS from an SRP to collect artifacts and factors.
//  Uses explicit if/else branching; no early returns.
//  
	private def void depthFirstCollectUpstream(
    String currentSrpId,
    Set<String> visitedSrpIds,
    Set<String> collectedArtifactIds,
    Set<String> collectedFactorIds
  ) {
    val producerInfluenceId = canonicalGraph.srp2inf.get(currentSrpId)

    if (producerInfluenceId !== null) {
      val incomingNodeIds = canonicalGraph.inEdges.get(producerInfluenceId)

      if (incomingNodeIds !== null) {
        for (upstreamNodeId : incomingNodeIds) {
          if (upstreamNodeId.startsWith("A:")) {
            collectedArtifactIds.add(upstreamNodeId)
          } else if (upstreamNodeId.startsWith("E:")) {
            collectedFactorIds.add(upstreamNodeId)
          } else if (upstreamNodeId.startsWith("SR:")) {
            if (!visitedSrpIds.contains(upstreamNodeId)) {
              visitedSrpIds.add(upstreamNodeId)
              depthFirstCollectUpstream(
                upstreamNodeId, visitedSrpIds, collectedArtifactIds, collectedFactorIds
              )
            } else {
              // SRP already visited; skip to avoid cycles
            }
          } else {
            // other node types can be ignored or handled in the future
          }
        }
      } else {
        // influence has no incoming edges; nothing to collect
      }

    } else {
      // SRP has no producer influence recorded; end of this branch
    }
  }

// Flattened table for exporters: [requirement, srp, influence, artifact].
	def Iterable<String[]> buildImpactSummaryTableForRequirement(String requirementSimpleName) {
	    val rows = newArrayList
	    for (p : traceRequirementToArtifacts(requirementSimpleName)) {
	      rows.add(#[
	        stripPrefix(p.requirementId),
	        stripPrefix(p.srpId),
	        stripPrefix(p.influenceId),
	        stripPrefix(p.artifactId)
	      ])
	    }
	    return rows
	  }

  // ---------- tiny value types helpers ----------

	static class TracePath {
	    public val String requirementId
	    public val String srpId
	    public val String influenceId
	    public val String artifactId
	    new(String requirementId, String srpId, String influenceId, String artifactId) {
	      this.requirementId = requirementId
	      this.srpId = srpId
	      this.influenceId = influenceId
	      this.artifactId = artifactId
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

	private def static String toArtifactId(String simple)   { "A:"  + simple }
	private def static String toFactorId(String simple)     { "E:"  + simple }
	private def static String toSrpId(String simple)        { "SR:" + simple }
	private def static String toRequirementId(String simple){ "R:"  + simple }

	private def static String stripPrefix(String id) {
		if (id === null) return ""
		val i = id.indexOf(':')
		if (i >= 0 && i + 1 < id.length) id.substring(i + 1) else id
	}
}

