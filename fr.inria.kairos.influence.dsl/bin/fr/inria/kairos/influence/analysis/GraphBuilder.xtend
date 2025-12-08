package fr.inria.kairos.influence.analysis

import org.eclipse.emf.ecore.resource.Resource
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.MetadataUtil
import java.util.LinkedHashSet
import java.util.HashMap
import java.util.Map
import fr.inria.kairos.influence.metamodel.*
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

class GraphBuilder {

	def Result build(Resource resource) {
	    val graph        = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge)
	    val vertexLabels = new HashMap<String, String>()
	    val edgeLabels   = new HashMap<DefaultEdge, String>()
	    val outEdges     = new HashMap<String, LinkedHashSet<String>>()
	    val inEdges      = new HashMap<String, LinkedHashSet<String>>()
	    val reqToSRs     = new HashMap<String, LinkedHashSet<String>>()
	    val nodeToOrigin = new HashMap<String, String>()
		val originToNode = new HashMap<String, String>()
		val edgeToOrigin = new HashMap<DefaultEdge, String>()
		val edgeWeights    = new HashMap<DefaultEdge, Double>()   
		val nodeSourceModel = new HashMap<String, String>()     
		
		val srp2inf = new HashMap<String,String>()  // key = "SR:Speed", val = "I:DragEq"
		val it = resource.allContents
		while (it.hasNext) {
	      val o = it.next
	      if (o instanceof Influence) {
	      	val inf = o as Influence
	
	        // Per-element likelihoods (for A->I, P->I edge labels)
//	        val L = MetadataUtil.parsePerElement(inf.likelihoodPerElement)
	
	        // Influence node + label
	        val iNode = toI(inf.name)
	        graph.addVertex(iNode)
	        vertexLabels.put(iNode, influenceLabel(inf))
	        setNodeOrigin(nodeToOrigin, originToNode, iNode, inf)
	
	
	        // A -> I  (label = likelihood per artifact if available)
	        for (p : inf.ownedParticipants) {
	        	if (p instanceof ArtifactParticipant) {
		            val ap = p as ArtifactParticipant
		            val a  = ap.target
		            if (a !== null && a.name !== null) {
		              val aNode = toA(a.name)
		              graph.addVertex(aNode)
		              vertexLabels.putIfAbsent(aNode, aNode)
		              setNodeOrigin(nodeToOrigin, originToNode, aNode, a)
		              val e = graph.addEdge(aNode, iNode)
		              if (e !== null) {
		              	val w0 = pickAnyWeight(ap)
						val w  = if (w0 === null) null else (if (w0 == 0.0) 1.0 else w0)

						if (w !== null) {
						    edgeLabels.put(e, fmtD(w))
						    edgeWeights.put(e, w)   
						  }
		                setEdgeOrigin(edgeToOrigin, e, ap)
		              }
		              addAdjEdge(outEdges, inEdges, aNode, iNode)
		              val target = readRefEObject(a)
		              val mUri   = modelUriOf(target)
		              if (mUri !== null) nodeSourceModel.put(aNode, mUri)
		     		}
		     		
		     		} else if (p instanceof EnvironmentalFactorParticipant) {
			            val ep = p as EnvironmentalFactorParticipant
			            val ef = ep.target
			            if (ef !== null && ef.name !== null) {
			              val eNode = toE(ef.name)
			              graph.addVertex(eNode)
			              vertexLabels.putIfAbsent(eNode, eNode)
			              setNodeOrigin(nodeToOrigin, originToNode, eNode, ef)
			              val e = graph.addEdge(eNode, iNode)
			              if (e !== null) {
			              	val w0 = pickAnyWeight(ep)
			                val w  = if (w0 === null) null else (if (w0 == 0.0) 1.0 else w0)
			                  if (w !== null) {
							    edgeLabels.put(e, fmtD(w))
							    edgeWeights.put(e, w)
  								}
			                setEdgeOrigin(edgeToOrigin, e, ep)
			              }
			              addAdjEdge(outEdges, inEdges, eNode, iNode)
			            }
		            } else if (p instanceof SRPInputParticipant) {
			            val sp = p as SRPInputParticipant
			            val s  = sp.target
			            if (s !== null && s.name !== null) {
			              val srNode = toSR(s.name)
			              graph.addVertex(srNode)
			              vertexLabels.putIfAbsent(srNode, srNode)
			              setNodeOrigin(nodeToOrigin, originToNode, srNode, s) 
			              val e = graph.addEdge(srNode, iNode)
			              if (e !== null) {
							edgeLabels.put(e, "input")
							setEdgeOrigin(edgeToOrigin, e, sp)                      
							}	
			              
			              addAdjEdge(outEdges, inEdges, srNode, iNode)
	
			        // SR(input) -> Requirement
			              for (r : s.constrainedBy) {
			                if (r !== null && r.name !== null) {
			                  val rNode = toR(r.name)
			                  graph.addVertex(rNode)
			                  vertexLabels.putIfAbsent(rNode, rNode)
			                  setNodeOrigin(nodeToOrigin, originToNode, rNode, r)
			                  val e2 = graph.addEdge(srNode, rNode)
			                  if (e2 !== null) {
								edgeLabels.put(e2, "constrains") 
								setEdgeOrigin(edgeToOrigin, e2, r)
							  }
			                  addAdjEdge(outEdges, inEdges, srNode, rNode)
			                  reqToSRs.computeIfAbsent(r.name) [ new LinkedHashSet<String>() ].add(s.name)
			                }
              			}
            		}
          		}
        	}
        
	        		
			// Influence -> SR(output)
	        val out = inf.outputSRP
	        if (out !== null && out.name !== null) {
	        	val srOut = toSR(out.name)
	        	graph.addVertex(srOut)
	        	vertexLabels.putIfAbsent(srOut, srOut)
	        	val e = graph.addEdge(iNode, srOut)
	        	if (e !== null) {
	          		edgeLabels.put(e, "produces")
					setEdgeOrigin(edgeToOrigin, e, inf)                
				}
	          
         	  	addAdjEdge(outEdges, inEdges, iNode, srOut)
         	 
         	  	srp2inf.put(srOut, iNode)
		            // SR -> R
		        for (r : out.constrainedBy) {
		        	if (r !== null && r.name !== null) {
		            	val rNode = toR(r.name)
		            	graph.addVertex(rNode)
		              	vertexLabels.putIfAbsent(rNode, rNode)
		              	val e2 = graph.addEdge(srOut, rNode)
		              	
		              	if (e2 !== null) {
							edgeLabels.put(e2, "constrains")
							setEdgeOrigin(edgeToOrigin, e2, r)
  						}
		              	addAdjEdge(outEdges, inEdges, srOut, rNode)
		              	reqToSRs.computeIfAbsent(r.name) [ new LinkedHashSet<String>() ].add(out.name)
		            	}
		          	}
            // For traceability: connect originators directly to SR (A->SR, P->SR; SR0->SR)
	          	for (p : inf.ownedParticipants) {
		        	if (p instanceof ArtifactParticipant) {
		            	val a = (p as ArtifactParticipant).target
		           		if (a?.name !== null) addAdjEdge(outEdges, inEdges, toA(a.name), srOut)
		            } else if (p instanceof EnvironmentalFactorParticipant) {
		              	val ef = (p as EnvironmentalFactorParticipant).target
		              	if (ef?.name !== null) addAdjEdge(outEdges, inEdges, toE(ef.name), srOut)
		            } else if (p instanceof SRPInputParticipant) {
		              	val s = (p as SRPInputParticipant).target
		              	if (s?.name !== null) addAdjEdge(outEdges, inEdges, toSR(s.name), srOut)
		            }	          
	        	}
	      	}
	    }
	 }
	
	    new Result(graph, vertexLabels, edgeLabels, outEdges, inEdges, reqToSRs, srp2inf, nodeToOrigin, originToNode, edgeToOrigin, edgeWeights, nodeSourceModel)
	}


	def static void addAdjEdge(
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

	def static String influenceLabel(Influence inf) {
	    // "I:Name\nconf=..." + optional metadata
		var s = 'I:' + inf.name
	    val confSF = inf.eClass?.getEStructuralFeature("confidence")
	    if (confSF !== null && inf.eIsSet(confSF)) {
	      val v = inf.eGet(confSF)
	      if (v instanceof Number) s = s + '\\nconf=' + String.format(java.util.Locale.US, '%.3f', (v as Number).doubleValue)
	      else s = s + '\\nconf=' + String.valueOf(v)
	    }
	    val meta = metadataSafe(inf)
	    if (meta !== null && !meta.trim.empty) s = s + '\\n' + meta
	    s
	  }

	def static String metadataSafe(org.eclipse.emf.ecore.EObject o) {
	    if (o === null) return null
	    val f = o.eClass?.getEStructuralFeature("metadata")
	    if (f === null) return null
	    val v = o.eGet(f)
	    if (v instanceof String) {
	      v as String
	    } else if (v instanceof java.util.List<?>) {
	      (v as java.util.List<?>).filter[it !== null].map[String.valueOf(it)].join(", ")
	    } else null
  	}
  	
	def static String originOf(EObject e) {
		if (e === null) return null
			EcoreUtil.getURI(e).toString 
	} 
	
	def static void setNodeOrigin(
  		Map<String,String> n2o, Map<String,String> o2n, String nodeId, EObject src
	) {
		val oid = originOf(src)
		if (oid !== null && nodeId !== null) {
	    	if (!n2o.containsKey(nodeId)) n2o.put(nodeId, oid)
	    	if (!o2n.containsKey(oid))    o2n.put(oid, nodeId)
	  }
	}
	
	def static void setEdgeOrigin(
	  Map<DefaultEdge,String> e2o, DefaultEdge e, EObject src
	) {
		if (e !== null && src !== null) e2o.put(e, originOf(src))
	}
	
	
	def static Double readDoubleFeature(org.eclipse.emf.ecore.EObject o, String fn) {
		if (o === null) return null
		val f = o.eClass?.getEStructuralFeature(fn)
		if (f === null || !o.eIsSet(f)) return null
		val v = o.eGet(f)
		if (v instanceof Number) (v as Number).doubleValue else null
	}
	//Simple annotation to add confidence, likelihood or generic weight
	def static Double pickAnyWeight(org.eclipse.emf.ecore.EObject participant) {
		val c = readDoubleFeature(participant, "confidence")
		if (c !== null) return c
		val l = readDoubleFeature(participant, "likelihood")
		if (l !== null) return l
		val g = readDoubleFeature(participant, "weight")
		return g
	}
	
	// For artifacts: fetch the referenced EObject
	def static org.eclipse.emf.ecore.EObject readRefEObject(DesignArtifact da) {
		if (da === null) return null
		val f = da.eClass.getEStructuralFeature("ref")
		if (f === null || !da.eIsSet(f)) return null
		val v = da.eGet(f)
		if (v instanceof org.eclipse.emf.ecore.EObject) v as org.eclipse.emf.ecore.EObject else null
	}
	
	// Base model URI (no fragment)
	def static String modelUriOf(org.eclipse.emf.ecore.EObject e) {
		if (e === null) return null
		val u = EcoreUtil.getURI(e)
		val base = u?.trimFragment
		if (base !== null) base.toString else null
	}
	
	  def static String toA(String n)  { 'A:'  + n }
	  def static String toE(String n)  { 'E:'  + n }
	  def static String toSR(String n) { 'SR:' + n }
	  def static String toR(String n)  { 'R:'  + n }
	  def static String toI(String n)  { 'I:'  + n }

	  def static String fmtD(double d) { String.format('%.3f', d) }

  // Returned bundle from build
	static class Result {
		public val DefaultDirectedGraph<String, DefaultEdge> graph
	    public val Map<String,String> vertexLabels
	    public val Map<DefaultEdge,String> edgeLabels
	    public val Map<String, LinkedHashSet<String>> outEdges
	    public val Map<String, LinkedHashSet<String>> inEdges
	    public val Map<String, LinkedHashSet<String>> reqToSRs
	    public val Map<String, String> srp2inf
	    public val Map<String,String> nodeToOrigin
  		public val Map<String,String> originToNode
  		public val Map<DefaultEdge,String> edgeToOrigin
	    public val Map<DefaultEdge,Double> edgeWeights
		public val Map<String,String>      nodeSourceModel
	    new(DefaultDirectedGraph<String, DefaultEdge> graph,
	    	Map<String,String> vertexLabels,
	        Map<DefaultEdge,String> edgeLabels,
	        Map<String, LinkedHashSet<String>> outEdges,
	        Map<String, LinkedHashSet<String>> inEdges,
	        Map<String, LinkedHashSet<String>> reqToSRs,
			Map<String, String> srp2inf,
			Map<String,String> nodeToOrigin,
      		Map<String,String> originToNode,
      		Map<DefaultEdge,String> edgeToOrigin,
      		Map<DefaultEdge,Double> edgeWeights,
      		Map<String,String> nodeSourceModel
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
		  	this.edgeWeights  = edgeWeights
		  	this.nodeSourceModel = nodeSourceModel
		  }
	  }
}

