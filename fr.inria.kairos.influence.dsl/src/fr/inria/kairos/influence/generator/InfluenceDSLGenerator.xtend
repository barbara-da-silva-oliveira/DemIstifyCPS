package fr.inria.kairos.influence.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.jgrapht.nio.dot.DOTExporter
import java.io.StringWriter
import org.jgrapht.alg.cycle.CycleDetector
import fr.inria.kairos.influence.metamodel.Influence
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import java.util.Map.Entry
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import fr.inria.kairos.influence.MetadataUtil
import org.eclipse.emf.ecore.EObject
import fr.inria.kairos.influence.metamodel.DesignArtifact
import fr.inria.kairos.influence.metamodel.Requirement
import java.util.LinkedHashSet
import java.util.Map
import java.util.ArrayDeque

class InfluenceDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val infoFile = new StringBuilder("Quick Info:\n")

		val jsonFile = new StringBuilder
		jsonFile.append("{\n\t\"influences\": [\n")
		var firstInfluence = true

		val graph = new DefaultDirectedGraph<String,DefaultEdge>(DefaultEdge)

		val outEdges = new HashMap<String, LinkedHashSet<String>>()
		val inEdges  = new HashMap<String, LinkedHashSet<String>>()

		// Requirement name -> set of SR names that feed it
		val reqToSRs = new HashMap<String, LinkedHashSet<String>>()
		
		// ----- unweighted (counts) -----
		val impactArtifacts   = new HashMap<String, Integer>() // d in Origin(I_k)
		val impactPhenomena   = new HashMap<String, Integer>() // φ in Origin(I_k)
		val sensArtifacts     = new HashMap<String, Integer>() // artifact in relatedTo (non-Requirement)
		val sensRequirements  = new HashMap<String, Integer>() // requirement in relatedTo

		// ----- weighted (likelihood / priority) -----
		val impactArtifactsW  = new HashMap<String, Double>()  // sum of likelihood(d.metadata)
		val impactPhenomenaW  = new HashMap<String, Double>()  // sum of likelihood(phen.metadata) if available
		val sensArtifactsW    = new HashMap<String, Double>()  // sum of likelihood(artifact.metadata) if available
		val sensRequirementsW = new HashMap<String, Double>()  // sum of priority(req.metadata) in [0..1]


		
		val ite = resource.allContents
		while (ite.hasNext) {
			val content = ite.next
			if (content instanceof Influence) {
				val inf = content as Influence

				if (!firstInfluence) jsonFile.append(",\n")
				jsonFile.append("\t\t{\n")
				jsonFile.append("\t\t\t\"name\": \"").append(inf.name).append("\",\n")
				jsonFile.append("\t\t\t\"sources\": \"")
					.append(inf.originatorArtifact.join(", ")).append("\",\n")
					.append(inf.originatorPhenomena.join(", ")).append("\"\n")
				jsonFile.append("\t\t}")
				firstInfluence = false

				infoFile.append(inf.name).append(": ").append(inf.originatorArtifact)
					.append("\n\t->\n\t").append(inf.affects).append("\n")
				infoFile.append(inf.name).append(": ").append(inf.originatorArtifact)
					.append("\n\t->\n\t").append(inf.relatedTo).append("\n")

				for (sourceName : inf.originatorArtifact) {
					for (systemResponse : inf.affects) {
						graph.addVertex(sourceName.name)
						graph.addVertex(systemResponse.name)
						graph.addEdge(sourceName.name, systemResponse.name)
						detectCycle(graph)
					}
				}

				val seenImpactArt = new HashSet<String>
				val seenImpactPhe = new HashSet<String>
				val seenSensArt   = new HashSet<String>
				val seenSensReq   = new HashSet<String>

				// Originator artifacts
				for (a : inf.originatorArtifact) {
					if (a !== null && a.name !== null) {
						seenImpactArt.add(a.name)
					}
				}
				// Originator phenomena
				for (p : inf.originatorPhenomena) {
					if (p !== null && p.name !== null) {
						seenImpactPhe.add(p.name)
					}
				}

				// Requirements
				for (sr : inf.affects) {
				  for (r : sr.usedIn) {
				    if (r !== null && r.name !== null) {
				      seenSensReq.add(r.name)
				    }
				  }
				}

				// ----- increment unweighted (counts) -----
				for (k : seenImpactArt)  impactArtifacts.put(k, (impactArtifacts.getOrDefault(k, 0) + 1))
				for (k : seenImpactPhe)  impactPhenomena.put(k, (impactPhenomena.getOrDefault(k, 0) + 1))
				for (k : seenSensArt)    sensArtifacts.put(k, (sensArtifacts.getOrDefault(k, 0) + 1))
				for (k : seenSensReq)    sensRequirements.put(k, (sensRequirements.getOrDefault(k, 0) + 1))

				// ----- increment weighted -----
				// Impact (artifacts)
				for (a : inf.originatorArtifact) {
				  if (a !== null && a.name !== null && seenImpactArt.contains(a.name)) {
				    val lw = MetadataUtil.parseWeights(metadataSafe(a)).likelihood
				    impactArtifactsW.put(a.name, impactArtifactsW.getOrDefault(a.name, 0d) + lw)
				  }
				}
				
				// Impact (phenomena)
				for (p : inf.originatorPhenomena) {
				  if (p !== null && p.name !== null && seenImpactPhe.contains(p.name)) {
				    val lw = MetadataUtil.parseWeights(metadataSafe(p)).likelihood
				    impactPhenomenaW.put(p.name, impactPhenomenaW.getOrDefault(p.name, 0d) + lw)
				  }
				}
				
				// Sensibility (artifacts in relatedTo)
				for (t : inf.relatedTo) {
				  if (t instanceof DesignArtifact) {
				    val da = t as DesignArtifact
				    if (da.name !== null && seenSensArt.contains(da.name)) {
				      val lw = MetadataUtil.parseWeights(MetadataUtil.metadataSafe(da)).likelihood
				      sensArtifactsW.put(da.name, sensArtifactsW.getOrDefault(da.name, 0d) + lw)
				    }
				  }
				}
				
				// Sensibility (requirements) – use requirement priority
				for (t : inf.relatedTo) {
				  if (t instanceof Requirement) {
				    val r = t as Requirement
				    if (r.name !== null && seenSensReq.contains(r.name)) {
				      val pw = MetadataUtil.priorityWeight(metadataSafe(r))
				      sensRequirementsW.put(r.name, sensRequirementsW.getOrDefault(r.name, 0d) + pw)
				    }
				  }
				}
				
				
        // build adjacency + req->SRs for tracing 
        for (sr : inf.affects) {
          if (sr !== null && sr.name !== null) {

            // A -> SR
            for (a : inf.originatorArtifact) {
              if (a !== null && a.name !== null) {
                addAdjEdge(outEdges, inEdges, toA(a.name), toSR(sr.name))
              }
            }

            // P -> SR
            for (p : inf.originatorPhenomena) {
              if (p !== null && p.name !== null) {
                addAdjEdge(outEdges, inEdges, toP(p.name), toSR(sr.name))
              }
            }

            // SR -> SR (chains)
            for (sr0 : inf.originatorSystemResponse) {
              if (sr0 !== null && sr0.name !== null) {
                addAdjEdge(outEdges, inEdges, toSR(sr0.name), toSR(sr.name))
              }
            }

            // requirement usage
            for (r : sr.usedIn) {
              if (r !== null && r.name !== null) {
                reqToSRs.computeIfAbsent(r.name) [ new LinkedHashSet<String>() ].add(sr.name)
              }
            }
          }
        }


			}
		}

		jsonFile.append("\n\t]\n}\n")

		exportGraphToDot(graph, fsa, "influenceGraph.dot")
		fsa.generateFile("influences.json", jsonFile.toString)

		// Unweighted sections
		// Impact of Artifacts (counts)
		infoFile.append("\nImpact of Artifacts (origin count):\n")
		printSortedIntMap(infoFile, impactArtifacts)

		// Impact of Phenomena (counts)
		infoFile.append("\nImpact of Phenomena (origin count):\n")
		printSortedIntMap(infoFile, impactPhenomena)

		// Sensibility of Artifacts (counts)
		infoFile.append("\nSensibility of Artifacts:\n")
		printSortedIntMap(infoFile, sensArtifacts)

		// Sensibility of Requirements (counts)
		infoFile.append("\nSensibility of Requirements:\n")
		printSortedIntMap(infoFile, sensRequirements)

		// Weighted
		// Impact of Artifacts (likelihood-weighted)
		infoFile.append("\nImpact of Artifacts (likelihood-weighted):\n")
		printSortedDoubleMap(infoFile, impactArtifactsW)

		// Impact of Phenomena (likelihood-weighted)
		infoFile.append("\nImpact of Phenomena (likelihood-weighted):\n")
		printSortedDoubleMap(infoFile, impactPhenomenaW)

		// Sensibility of Artifacts (likelihood-weighted)
		infoFile.append("\nSensibility of Artifacts (likelihood-weighted):\n")
		printSortedDoubleMap(infoFile, sensArtifactsW)

		// Sensibility of Requirements (priority-weighted) 
		infoFile.append("\nSensibility of Requirements (priority-weighted):\n")
		printSortedDoubleMap(infoFile, sensRequirementsW)
		
		
		
		infoFile.append("\nCandidate of compensators traced per requirement:\n")

		// For each requirement, union all upstream artifacts over its SRs; keep min hop distance
		for (reqName : new java.util.TreeSet<String>(reqToSRs.keySet)) {
		  val agg = new HashMap<String, Integer>()
		  for (srName : reqToSRs.get(reqName)) {
		    val m = upstreamArtifacts(toSR(srName), inEdges)
		    for (e : m.entrySet) {
		      val prev = agg.get(e.key)
		      if (prev === null || e.value < prev) agg.put(e.key, e.value)
		    }
		  }
		
		  // pretty print sorted by hop distance, then name
		  val items = new ArrayList<java.util.Map$Entry<String, Integer>>(agg.entrySet)
		  items.sort [ a, b |
		    val c = Integer.compare(a.value, b.value)
		    if (c != 0) c else a.key.compareTo(b.key)
		  ]
		
		  infoFile.append("  ").append(reqName).append(": ")
		  if (items.empty) {
		    infoFile.append("(none)\n")
		  } else {
		    val line = items.map [ it.key + " (" + it.value + " hop" + (it.value == 1 ? "" : "s") + ")" ].join(", ")
		    infoFile.append(line).append("\n")
		  }
		}
		
		
		// Write info file
		fsa.generateFile("info.txt", infoFile.toString)
	}

	  private def static String toA(String n)  { 'A:'  + n }
	  private def static String toP(String n)  { 'P:'  + n }
	  private def static String toSR(String n) { 'SR:' + n }
	
	  // add adjacency edge both ways
	  private def static void addAdjEdge(
	    Map<String, LinkedHashSet<String>> outE,
	    Map<String, LinkedHashSet<String>> inE,
	    String from, String to
	  ) {
	    var os = outE.get(from)
	    if (os === null) { os = new LinkedHashSet<String>(); outE.put(from, os) }
	    os.add(to)
	
	    var is = inE.get(to)
	    if (is === null) { is = new LinkedHashSet<String>(); inE.put(to, is) }
	    is.add(from)
	  }
	
	  // simple holder for BFS
	  private static class NodeDepth {
	    val String node
	    val int depth
	    new(String n, int d) { node = n; depth = d }
	  }
	
	  /** Reverse BFS from SR-node to collect upstream artifacts with min hop distance. */
	  private def static HashMap<String, Integer> upstreamArtifacts(
	    String srNode,
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
	    val result  = new HashMap<String, Integer>()
	    val visited = new HashSet<String>()
	    val q       = new ArrayDeque<NodeDepth>()
	
	    visited.add(srNode)
	    q.add(new NodeDepth(srNode, 0))
	
	    while (!q.isEmpty) {
	      val cur   = q.removeFirst
	      val preds = inEdges.get(cur.node)
	
	      if (preds !== null) {
	        for (p : preds) {
	          if (visited.add(p)) {
	            if (p.startsWith("A:")) {
	              val name = p.substring(2)
	              val old  = result.get(name)
	              if (old === null || cur.depth + 1 < old) result.put(name, cur.depth + 1)
	            }
	            q.add(new NodeDepth(p, cur.depth + 1))
	          }
	        }
	      }
	    }
	    result
	  }

	def void exportGraphToDot(DefaultDirectedGraph<String, DefaultEdge> graph, IFileSystemAccess2 fsa, String filename) {
		val dotExporter = new DOTExporter<String, DefaultEdge>()
		val writer = new StringWriter
		dotExporter.exportGraph(graph, writer)
		fsa.generateFile(filename, writer.toString)
	}

	def static boolean detectCycle(DefaultDirectedGraph<String, DefaultEdge> graph) {
		val cycleDetector = new CycleDetector<String, DefaultEdge>(graph)
		if (cycleDetector.detectCycles()) {
			println("Cycle detected" + cycleDetector.findCycles())
			return true
		} else {
			println("No cycles detected")
			return false
		}
	}

	/** Safely get 'metadata' as a single String from any EObject. Joins lists with ", ". */
	def static String metadataSafe(EObject o) {
		if (o === null) return null
		val f = o.eClass?.getEStructuralFeature("metadata")
		if (f === null) return null
		val v = o.eGet(f)
		switch v {
		case v instanceof String            : v as String
	    case v instanceof java.util.List<?> : (v as java.util.List<?>)
                                          .filter[it !== null]
                                          .map[String.valueOf(it)]
                                          .join(", ")
		default                             : null
  		}
	}

	def static void printSortedIntMap(StringBuilder sb, HashMap<String, Integer> map) {
		val list = new ArrayList<Entry<String, Integer>>(map.entrySet)
		list.sort [ a, b |
			val c = Integer.compare(b.value, a.value)
			if (c != 0) c else a.key.compareTo(b.key)
		]
		for (e : list) {
			sb.append("  ").append(e.key).append(" -> ").append(e.value).append("\n")
		}
	}

	def static void printSortedDoubleMap(StringBuilder sb, HashMap<String, Double> map) {
		val list = new ArrayList<Entry<String, Double>>(map.entrySet)
		list.sort [ a, b |
			val c = Double.compare(b.value, a.value)
			if (c != 0) c else a.key.compareTo(b.key)
		]
		for (e : list) {
			sb.append("  ").append(e.key).append(" -> ").append(e.value).append("\n")
		}
	}
}


