package fr.inria.kairos.influence.generator

import fr.inria.kairos.influence.analysis.ImpactMetrics
import fr.inria.kairos.influence.analysis.RequirementTraceability
import fr.inria.kairos.influence.analysis.StakeholdersOwner
import fr.inria.kairos.influence.export.DotExporter
import fr.inria.kairos.influence.analysis.GraphBuilder
import fr.inria.kairos.influence.export.InfoExporter
import fr.inria.kairos.influence.export.JsonExporter
import fr.inria.kairos.influence.export.TablesExporter
import java.io.ByteArrayInputStream
import java.util.ArrayDeque
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map
import java.util.Map.Entry
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.jgrapht.alg.cycle.CycleDetector
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
import fr.inria.kairos.influence.metamodel.SRPInputParticipant
import fr.inria.kairos.influence.metamodel.ValueType
import fr.inria.kairos.influence.analysis.StructuralRequirementEvaluation
class InfluenceDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

    //  Build the canonical graph
		val graphBuilder = new GraphBuilder
	    val graphBundle  = graphBuilder.build(resource) // GraphBuilder.Result
	
	    val jgraphtGraph      = graphBundle.graph
	    val vertexLabels      = graphBundle.vertexLabels
	    val edgeLabels        = graphBundle.edgeLabels
	    val incomingAdjacency = graphBundle.inEdges
	    val outgoingAdjacency = graphBundle.outEdges
	    val reqToSrpMap       = graphBundle.reqToSRs
	    val srpToInfluence    = graphBundle.srp2inf
	    val nodeToOrigin = graphBundle.nodeToOrigin
	    val edgeToOrigin = graphBundle.edgeToOrigin
	    val edgeWeights = graphBundle.edgeWeights
	    val nodeSourceModel = graphBundle.nodeSourceModel
	
	    //  Graph and JSON exports
	    new DotExporter().exportGraphToDot(jgraphtGraph, vertexLabels, edgeLabels, fsa, "graph/influenceHypergraph.dot")
	    new DotExporter().exportGraphToDot(jgraphtGraph, vertexLabels, edgeLabels, nodeToOrigin, nodeSourceModel, edgeToOrigin, edgeWeights, fsa, "graph/influenceHypergraph_origin.dot")
	    
	    new JsonExporter().exportInfluences(resource, fsa)
	
	    // Impact metrics (InfoExporter pretty prints)
	    val metrics = new ImpactMetrics().compute(resource, graphBundle)
	    val reportBuilder = new StringBuilder("Metrics on the Influences:\n")
	    val infoExporter  = new InfoExporter
	    
	    
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
	
	    reportBuilder.append("\nImpact of Artifacts Progagated (weighted):\n")
	    infoExporter.appendSortedDoubleMap(reportBuilder, new HashMap<String, Double>(metrics.impactArtifactsPropagatedW))
	
	    reportBuilder.append("\nImpact of Environment Factor Progagated (weighted):\n")
	    infoExporter.appendSortedDoubleMap(reportBuilder, new HashMap<String, Double>(metrics.impactEnvFactorsPropagatedW))
	
	//    reportBuilder.append("\nSensibility of Requirements (priority-weighted):\n")
	//    infoExporter.appendSortedDoubleMap(reportBuilder, new HashMap<String, Double>(metrics.sensRequirementsW))
	
	    // Candidate compensators traced per requirement (min-hop distances)
		reportBuilder.append("\nCandidate potential beneficial changes on participants traced per requirement:\n")
	
	    // We keep a RequirementTraceability instance (for other queries if needed),
	    // but min-hop distances are computed locally to match your "(n hops)" output.
	    val traceQueries = new RequirementTraceability(graphBundle)
	
	    for (requirementName : new java.util.TreeSet<String>(reqToSrpMap.keySet)) {
	      val Map<String, Integer> minHopByNode = new HashMap<String, Integer>()
	      val srpNames = reqToSrpMap.get(requirementName)
	
	      if (srpNames !== null) {
	        for (srpSimpleName : srpNames) {
	          // Artifacts upstream
	          val artifactDistances = computeUpstreamDistancesFromSrp(
	            "SR:" + srpSimpleName, incomingAdjacency, srpToInfluence, "A:"
	          )
	          for (entry : artifactDistances.entrySet) {
	            val previous = minHopByNode.get(entry.key)
	            if (previous === null || entry.value < previous) {
	              minHopByNode.put(entry.key, entry.value)
	            } else {
	              // keep shorter distance already stored
	            }
	          }
	
	          // Environmental factors upstream
	          val factorDistances = computeUpstreamDistancesFromSrp(
	            "SR:" + srpSimpleName, incomingAdjacency, srpToInfluence, "E:"
	          )
	          for (entry : factorDistances.entrySet) {
	            val previous = minHopByNode.get(entry.key)
	            if (previous === null || entry.value < previous) {
	              minHopByNode.put(entry.key, entry.value)
	            } else {
	              // keep shorter distance already stored
	            }
	          }
	        }
	      } else {
	        // requirement has no SRPs; nothing to aggregate
	      }
	
	   val items = minHopByNode.entrySet.toList
	
		// In-place sort: first by hop count (value), then by name (key)
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
	
	    new StakeholdersOwner().exportCSV(resource, fsa, "tables/influence_model_spread.csv")
	
	    // Write the metrics/text report
	    fsa.generateFile("file/info.txt", reportBuilder.toString)
	
	    // Cycle detection
	    detectCycle(jgraphtGraph)
	
	    //  Numeric evaluation of each Influence
	    val modelRoot = resource.contents.head as fr.inria.kairos.influence.metamodel.InfluenceModel
	
	    val globalScenario = new LinkedHashMap<String, Double>
	    // 1) Environmental factors
	    for (ef : modelRoot.ownedEnvironmentalFactors) {
	      if (!java.lang.Double.isNaN(ef.value)) {
	        globalScenario.put(ef.name, ef.value)
	      } else {
	        // skip NaN
	      }
	    }
	    // 2) Design artifact numeric values (when resolvable)
	    for (da : modelRoot.ownedArtifacts) {
	      val ref = da.ref
	      if (ref !== null) {
	        val opt = fr.inria.kairos.influence.analysis.DesignValueArtifacts.resolveNumeric(ref)
	        if (opt.isPresent) {
	          globalScenario.put(da.name, opt.asDouble)
	        } else {
	          // unresolved, skip
	        }
	      } else {
	        // no reference, skip
	      }
	    }
		val structural = new StructuralRequirementEvaluation
	    val numericLog = new StringBuilder(" Requirement Evaluation\n\n")
	    for (inf : modelRoot.ownedInfluences.filter(fr.inria.kairos.influence.metamodel.Influence)) {
	      val localScenario = new LinkedHashMap<String, Double>(globalScenario)
	      val fn = inf.ownedInfluenceFunction
	      switch fn.returnType {
	        case ValueType::TEXT: {
			  numericLog.append("## ").append(inf.name).append("\n")
			    .append(" Skipped function numeric evaluation, since returnType = Text.\n")
			    .append(" Structural advice based on graph topology:\n")
			  structural.appendForInfluence(resource, graphBundle, inf, numericLog)
			}
	
	        case ValueType::REAL: {
	          try {
	            val res = fr.inria.kairos.influence.analysis.InfluenceEvaluator
	              .evaluateChainWithRequirement(modelRoot, inf, localScenario)
	            val srpName = inf.outputSRP.name
	            numericLog.append(inf.name).append("\n")
	            numericLog.append("SRP `").append(srpName).append("` = ")
	              .append(String.format(java.util.Locale.US, "%.6f", res.srpValue)).append("\n")
	
	            numericLog.append("Inputs:\n")
	            for (p : inf.ownedParticipants) {
	              val name = switch p {
	                ArtifactParticipant: p.target.name
	                EnvironmentalFactorParticipant: p.target.name
	                SRPInputParticipant: p.target.name
	                default: p.eClass.name
	              }
	              var Double v = localScenario.get(name)
	              if (v === null && p instanceof SRPInputParticipant) {
	                val up = modelRoot.ownedInfluences
	                  .filter(fr.inria.kairos.influence.metamodel.Influence)
	                  .findFirst[ outputSRP.name == name ]
	                if (up !== null) {
	                  val upRes = fr.inria.kairos.influence.analysis.InfluenceEvaluator
	                    .evaluateChainWithRequirement(modelRoot, up, localScenario)
	                  v = upRes.srpValue
	                } else {
	                  // no producing influence, leave NA
	                }
	              } else {
	                // present in scenario or not an SRP input
	              }
	              numericLog.append(" ").append(name).append(" = ")
	                .append(if (v === null) "NA" else String.format(java.util.Locale.US, "%.6f", v))
	                .append("\n")
	            }
	            
	            numericLog.append(" Changeability / Flexibility (if available):\n")
				for (p : inf.ownedParticipants) {
					switch p {
				    	ArtifactParticipant: {
				    		val obj = p.target as org.eclipse.emf.ecore.EObject
				      		val f = obj?.eClass?.getEStructuralFeature("changeability")
				      		val v = if (f !== null) obj.eGet(f) else null
				      		numericLog.append(" ").append(p.target.name).append(" = ")
				        	.append(if (v instanceof Number) String.format(java.util.Locale.US, "%.2f", (v as Number).doubleValue)
				                	else if (v instanceof String) v as String else "NA")
				        	.append("\n")
				    	}
				    	EnvironmentalFactorParticipant: {
				      		val obj = p.target as org.eclipse.emf.ecore.EObject
				      		val f = obj?.eClass?.getEStructuralFeature("flexibility")
				      		val v = if (f !== null) obj.eGet(f) else null
				      		numericLog.append(" ").append(p.target.name).append(" = ")
				        	.append(if (v instanceof Number) String.format(java.util.Locale.US, "%.2f", (v as Number).doubleValue)
				               		else if (v instanceof String) v as String else "NA")
				        	.append("\n")
				    	}
				    	default: { /* SRP inputs: skip here */ }
				  	}
				}
	
	            if (java.lang.Double.isNaN(res.margin)) {
	              numericLog.append(" Margin: N/A (no requirement linked)\n")
	            } else {
	              numericLog.append(" Margin = ")
	                .append(String.format(java.util.Locale.US, "%.6f", res.margin)).append("\n")
	            }
	
	            if (!res.grad.isEmpty) {
	              numericLog.append(" Sensitivities:\n")
	              for (e : res.grad.entrySet) {
	                numericLog.append(" ").append(e.key).append(" = ")
	                  .append(String.format(java.util.Locale.US, "%.6f", e.value)).append("\n")
	              }
	              numericLog.append(" Classification (increase ↑):\n")
	              for (e : res.label.entrySet) {
	                numericLog.append("  ").append(e.key).append(": ").append(e.value).append("\n")
	              }
	            }
	            numericLog.append("\n")
	
	          } catch (Throwable t) {
	            val sw = new java.io.StringWriter
	            t.printStackTrace(new java.io.PrintWriter(sw))
	            numericLog.append(inf.name).append(" (error)\n")
	              .append(sw.toString).append("\n")
	          }
	        }
	        
	      }
	    }
	    fsa.generateFile("eval/numeric.txt", new ByteArrayInputStream(numericLog.toString.bytes))
	  } // end doGenerate

// Detect cycles in the directed graph (returns true if cycles are present).
	def static boolean detectCycle(DefaultDirectedGraph<String, DefaultEdge> graph) {
	    val cycleDetector = new CycleDetector<String, DefaultEdge>(graph)
	    if (cycleDetector.detectCycles()) {
	      println("Cycle detected " + cycleDetector.findCycles())
	      true
	    } else {
	      println("No cycles detected")
	      false
	    }
	  }

// Metadata helper (safe).
	def static String metadataSafe(EObject o) {
	    if (o === null) {
	      return null
	    } else {
	      val f = o.eClass?.getEStructuralFeature("metadata")
	      if (f === null) {
	        return null
	      } else {
	        val v = o.eGet(f)
	        if (v instanceof String) {
	          v as String
	        } else if (v instanceof java.util.List<?>) {
	          (v as java.util.List<?>).filter[it !== null].map[String.valueOf(it)].join(", ")
	        } else {
	          null
	        }
	      }
	    }
	  }

  // Local BFS helper: min-hop distances upstream from an SRP

//Compute minimum-hop distances from an SRP to all upstream nodes with the given prefix
//(e.g., "A:" for Artifacts, "E:" for Environmental Factors).
//Uses srp2inf and inEdges, explicit branching and guards.
 
	private def Map<String, Integer> computeUpstreamDistancesFromSrp(
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
	    } else {
	      // SRP without producer: return empty map
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
	            val prev = distances.get(upstreamNodeId)
	            if (prev === null || nextHops < prev) {
	              distances.put(upstreamNodeId, nextHops)
	            } else {
	              // keep shorter distance already present
	            }
	          } else if (upstreamNodeId.startsWith("SR:")) {
	            if (!visitedSrps.contains(upstreamNodeId)) {
	              visitedSrps.add(upstreamNodeId)
	              val upstreamProducer = srpToInfluence.get(upstreamNodeId)
	              if (upstreamProducer !== null) {
	                worklist.add(new PairNode(upstreamProducer, nextHops))
	              } else {
	                // SRP without producer; stop this branch
	              }
	            } else {
	              // already visited SRP; avoid cycles
	            }
	          } else {
	            // other node types ignored
	          }
	        }
	      } else {
	        // no upstream nodes; continue
	      }
	    }
	    return distances
	  }

// Tiny pair record for BFS.
	static class PairNode {
	    public val String nodeId
	    public val int hops
	    new(String nodeId, int hops) {
	      this.nodeId = nodeId
	      this.hops = hops
	    }
	  } 
}
