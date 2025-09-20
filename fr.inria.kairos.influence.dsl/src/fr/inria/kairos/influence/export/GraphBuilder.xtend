package fr.inria.kairos.influence.export

import org.eclipse.emf.ecore.resource.Resource
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.MetadataUtil
import java.util.LinkedHashSet
import java.util.HashMap
import java.util.Map

class GraphBuilder {

	def Result build(Resource resource) {
	    val graph        = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge)
	    val vertexLabels = new HashMap<String, String>()
	    val edgeLabels   = new HashMap<DefaultEdge, String>()
	    val outEdges     = new HashMap<String, LinkedHashSet<String>>()
	    val inEdges      = new HashMap<String, LinkedHashSet<String>>()
	    val reqToSRs     = new HashMap<String, LinkedHashSet<String>>()
	
		val it = resource.allContents
		while (it.hasNext) {
	      val o = it.next
	      if (o instanceof Influence) {
	        val inf = o as Influence
	
	        // Per-element likelihoods (for A->I, P->I edge labels)
	        val L = MetadataUtil.parsePerElement(inf.likelihoodPerElement)
	
	        // Influence node + label
	        val iNode = toI(inf.name)
	        graph.addVertex(iNode)
	        vertexLabels.put(iNode, influenceLabel(inf))
	
	        // A -> I  (label = likelihood per artifact if available)
	        for (a : inf.originatorArtifact) {
	          if (a !== null && a.name !== null) {
	            val aNode = toA(a.name)
	            graph.addVertex(aNode)
	            vertexLabels.putIfAbsent(aNode, aNode)
	            val e = graph.addEdge(aNode, iNode)
	            if (e !== null) edgeLabels.put(e, fmtD(L.artifacts.getOrDefault(a.name, 1.0)))
	            addAdjEdge(outEdges, inEdges, aNode, iNode)
	          }
	        }
	
	        // P -> I  (label = likelihood per phenomenon)
	        for (p : inf.originatorPhenomena) {
	          if (p !== null && p.name !== null) {
	            val pNode = toP(p.name)
	            graph.addVertex(pNode)
	            vertexLabels.putIfAbsent(pNode, pNode)
	            val e = graph.addEdge(pNode, iNode)
	            if (e !== null) edgeLabels.put(e, fmtD(L.phenomena.getOrDefault(p.name, 1.0)))
	            addAdjEdge(outEdges, inEdges, pNode, iNode)
	          }
	        }
	
	        // SR0 -> I  (originator SystemResponses)
	        for (sr0 : inf.originatorSystemResponse) {
	          if (sr0 !== null && sr0.name !== null) {
	            val sr0Node = toSR(sr0.name)
	            graph.addVertex(sr0Node)
	            vertexLabels.putIfAbsent(sr0Node, sr0Node)
	            val e = graph.addEdge(sr0Node, iNode)
	            if (e !== null) edgeLabels.put(e, "origin")
	            addAdjEdge(outEdges, inEdges, sr0Node, iNode)
	          }
	        }
	
	        // I -> SR, then SR -> R  (+ fill reqToSRs)
	        for (sr : inf.affects) {
	          if (sr !== null && sr.name !== null) {
	            val srNode = toSR(sr.name)
	            graph.addVertex(srNode)
	            vertexLabels.putIfAbsent(srNode, srNode)
	            val e = graph.addEdge(iNode, srNode)
	            if (e !== null) edgeLabels.put(e, "affects")
	            addAdjEdge(outEdges, inEdges, iNode, srNode)
	
	            // SR -> R
	            for (r : sr.usedIn) {
	              if (r !== null && r.name !== null) {
	                val rNode = toR(r.name)
	                graph.addVertex(rNode)
	                vertexLabels.putIfAbsent(rNode, rNode)
	                val e2 = graph.addEdge(srNode, rNode)
	                if (e2 !== null) edgeLabels.put(e2, "usedIn")
	                addAdjEdge(outEdges, inEdges, srNode, rNode)
	                reqToSRs.computeIfAbsent(r.name) [ new LinkedHashSet<String>() ].add(sr.name)
	              }
	            }
	
	            // For traceability: connect originators directly to SR (A->SR, P->SR; SR0->SR)
	            for (a : inf.originatorArtifact)
	              if (a !== null && a.name !== null) addAdjEdge(outEdges, inEdges, toA(a.name), srNode)
	            for (p : inf.originatorPhenomena)
	              if (p !== null && p.name !== null) addAdjEdge(outEdges, inEdges, toP(p.name), srNode)
	            for (sr0 : inf.originatorSystemResponse)
	              if (sr0 !== null && sr0.name !== null) addAdjEdge(outEdges, inEdges, toSR(sr0.name), srNode)
	          }
	        }
	      }
	    }
	
	    new Result(graph, vertexLabels, edgeLabels, outEdges, inEdges, reqToSRs)
	}


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

	private def static String influenceLabel(Influence inf) {
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

	private def static String metadataSafe(org.eclipse.emf.ecore.EObject o) {
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

	private def static String toA(String n)  { 'A:'  + n }
	private def static String toP(String n)  { 'P:'  + n }
	private def static String toSR(String n) { 'SR:' + n }
	private def static String toR(String n)  { 'R:'  + n }
	private def static String toI(String n)  { 'I:'  + n }

	private def static String fmtD(double d) { String.format('%.3f', d) }

  // Returned bundle from build
	static class Result {
		public val DefaultDirectedGraph<String, DefaultEdge> graph
	    public val Map<String,String> vertexLabels
	    public val Map<DefaultEdge,String> edgeLabels
	    public val Map<String, LinkedHashSet<String>> outEdges
	    public val Map<String, LinkedHashSet<String>> inEdges
	    public val Map<String, LinkedHashSet<String>> reqToSRs
	    new(DefaultDirectedGraph<String, DefaultEdge> graph,
	        Map<String,String> vertexLabels,
	        Map<DefaultEdge,String> edgeLabels,
	        Map<String, LinkedHashSet<String>> outEdges,
	        Map<String, LinkedHashSet<String>> inEdges,
	        Map<String, LinkedHashSet<String>> reqToSRs) {
	      this.graph = graph
	      this.vertexLabels = vertexLabels
	      this.edgeLabels = edgeLabels
	      this.outEdges = outEdges
	      this.inEdges = inEdges
	      this.reqToSRs = reqToSRs
		  }
	  }
}

