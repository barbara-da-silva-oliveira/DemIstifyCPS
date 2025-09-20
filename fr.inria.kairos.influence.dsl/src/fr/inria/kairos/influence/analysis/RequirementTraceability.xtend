package fr.inria.kairos.influence.analysis

import org.eclipse.emf.ecore.resource.Resource
import fr.inria.kairos.influence.metamodel.Influence
import java.util.LinkedHashSet
import java.util.HashMap
import java.util.ArrayDeque
import java.util.Map

class RequirementTraceability {

  // reqToSRs + inEdges + outEdges 
	def TraceData buildTrace(Resource resource) {
		val outEdges = new HashMap<String, LinkedHashSet<String>>()
	    val inEdges  = new HashMap<String, LinkedHashSet<String>>()
	    val reqToSRs = new HashMap<String, LinkedHashSet<String>>()
	
	    val it = resource.allContents
	    while (it.hasNext) {
			val o = it.next
			if (o instanceof Influence) {
	        	val inf = o as Influence
	
	        // I -> SR / SR -> R and reqToSRs
		        for (sr : inf.affects) {
		          if (sr !== null && sr.name !== null) {
		            addAdj(outEdges, inEdges, toI(inf.name), toSR(sr.name))
		            for (r : sr.usedIn) {
		              if (r !== null && r.name !== null) {
		                addAdj(outEdges, inEdges, toSR(sr.name), toR(r.name))
		                reqToSRs.computeIfAbsent(r.name)[ new LinkedHashSet<String>() ].add(sr.name)
		              }
		            }
		          }
		        }
	
		        // Originators -> I
				for (a : inf.originatorArtifact)  if (a?.name !== null) addAdj(outEdges, inEdges, toA(a.name),   toI(inf.name))
				for (p : inf.originatorPhenomena) if (p?.name !== null) addAdj(outEdges, inEdges, toP(p.name),   toI(inf.name))
				for (sr0 : inf.originatorSystemResponse) if (sr0?.name !== null) addAdj(outEdges, inEdges, toSR(sr0.name), toI(inf.name))
		
		        // Chaînes SR0 -> SR
				for (sr : inf.affects)
				for (sr0 : inf.originatorSystemResponse)
				if (sr?.name !== null && sr0?.name !== null) addAdj(outEdges, inEdges, toSR(sr0.name), toSR(sr.name))
	      }
	    }

	new TraceData(inEdges, outEdges, reqToSRs)
  }

  // Reverse BFS from SR to recover until artifacts + min hops
	def HashMap<String, Integer> upstreamArtifacts(String srNode, Map<String, LinkedHashSet<String>> inEdges) {
		val result  = new HashMap<String, Integer>()
		val visited = new java.util.HashSet<String>()
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

	private static class NodeDepth { 
		val String node; 
		val int depth
	    new(String n, int d) { node = n; depth = d }
	  }

	private def static void addAdj(Map<String, LinkedHashSet<String>> outE,
                                 Map<String, LinkedHashSet<String>> inE,
	                                 String from, String to) {
	    var os = outE.get(from); if (os === null) { os = new LinkedHashSet; outE.put(from, os) }
	    os.add(to)
	    var is = inE.get(to); if (is === null) { is = new LinkedHashSet; inE.put(to, is) }
	    is.add(from)
	    }
	
	private def static String toA(String n)  { 'A:'  + n }
	private def static String toP(String n)  { 'P:'  + n }
	private def static String toSR(String n) { 'SR:' + n }
	private def static String toR(String n)  { 'R:'  + n }
	private def static String toI(String n)  { 'I:'  + n }

	static class TraceData {
		public val Map<String, LinkedHashSet<String>> inEdges
		public val Map<String, LinkedHashSet<String>> outEdges
		public val Map<String, LinkedHashSet<String>> reqToSRs
	
		new(Map<String, LinkedHashSet<String>> inEdges,
	    	Map<String, LinkedHashSet<String>> outEdges,
			Map<String, LinkedHashSet<String>> reqToSRs) {
		    this.inEdges  = inEdges
		    this.outEdges = outEdges
		    this.reqToSRs = reqToSRs
		  }
  
  }
}
