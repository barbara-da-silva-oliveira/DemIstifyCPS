package fr.inria.kairos.influence.analysis

import org.eclipse.emf.ecore.resource.Resource
import fr.inria.kairos.influence.metamodel.DesignArtifact
import java.util.LinkedHashSet
import java.util.Map

class CompensationFinder{

	def void appendCompensatorsByChangeability(
	    Resource resource,
	    StringBuilder infoFile,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
	    val daIndex = new java.util.HashMap<String, DesignArtifact>()
		val it = resource.allContents
		while (it.hasNext) {
		  val o = it.next
		  if (o instanceof DesignArtifact) {
		    val da = o as DesignArtifact
		    if (da.name !== null) daIndex.put(da.name, da)
		  }
		}

	    infoFile.append("\nCompensators ranked by changeability:\n")
	
		for (reqName : new java.util.TreeSet<String>(reqToSRs.keySet)) {
	      // candidats upstream from artifacts to SR
			val agg = new java.util.HashMap<String, Integer>()
			val srs = reqToSRs.get(reqName)
	    	if (srs !== null) {
		        val tracer = new RequirementTraceability
		        for (srName : srs) {
		          val m = tracer.upstreamArtifacts(toSR(srName), inEdges)
		          for (e : m.entrySet) {
		            val prev = agg.get(e.key)
		            if (prev === null || e.value < prev) agg.put(e.key, e.value)
		          }
		        }
		      }
	 
	      // lignes (name -> changeability)
			val rows = newArrayList
				for (name : agg.keySet) {
				val da = daIndex.get(name)
		        var double c = 0.5
		        if (da !== null) {
		          val sf = da.eClass?.getEStructuralFeature("changeability")
		          if (sf !== null && da.eIsSet(sf)) {
		            val v = da.eGet(sf)
		            if (v instanceof Number) c = (v as Number).doubleValue
		          }
		        }
		        rows.add(#[name, c]) // tuple [artifactName, changeability]
		      }
	
	      // tri : changeability desc puis nom asc
	      rows.sort [ a, b |
		        val cmp = Double.compare(b.get(1) as Double, a.get(1) as Double)
		        if (cmp != 0) cmp else (a.get(0) as String).compareTo(b.get(0) as String)
		      ]
	
			infoFile.append("  ").append(reqName).append(": ")
			if (rows.empty) {
		        infoFile.append("(none)\n")
		      } else {
		        val line = rows.map[
		          (it.get(0) as String) + " (changeability=" + String.format("%.2f", it.get(1)) + ")"
		        ].join(", ")
		        infoFile.append(line).append("\n")
		      }
		}
	}
	
	def Map<String, Pair<String, Double>> bestCompensatorByChangeability(
		Resource resource,
    	Map<String, LinkedHashSet<String>> reqToSRs,
    	Map<String, LinkedHashSet<String>> inEdges
  		) {
   		 // index artifacts by name (same as in your method)
		val daIndex = new java.util.HashMap<String, DesignArtifact>()
		val it = resource.allContents
	    while (it.hasNext) {
	      val o = it.next
	      if (o instanceof DesignArtifact) {
	        val da = o as DesignArtifact
	        if (da.name !== null) daIndex.put(da.name, da)
	      }
	    }

	    val result = new java.util.LinkedHashMap<String, Pair<String, Double>>()
	
		for (reqName : new java.util.TreeSet<String>(reqToSRs.keySet)) {
	      // gather candidate names via upstream traversal
			val agg = new java.util.HashMap<String, Integer>()
		    val srs = reqToSRs.get(reqName)
			if (srs !== null) {
				val tracer = new RequirementTraceability
				for (srName : srs) {
					val m = tracer.upstreamArtifacts(toSR(srName), inEdges)
					for (e : m.entrySet) {
			        	val prev = agg.get(e.key)
			        	if (prev === null || e.value < prev) agg.put(e.key, e.value)
	          			}
	        	}
		     }
	
		      // rows: Pair(artifactName, changeability)
		     val rows = new java.util.ArrayList<Pair<String, Double>>()
		     for (name : agg.keySet) {
		     	val da = daIndex.get(name)
		     	var double c = 0.5
		    	if (da !== null) {
		       		val sf = da.eClass?.getEStructuralFeature("changeability")
		        	if (sf !== null && da.eIsSet(sf)) {
		            	val v = da.eGet(sf)
		            	if (v instanceof Number) c = (v as Number).doubleValue
		          }
		        }
		        rows.add(new Pair(name, c))
		      }
		      rows.sort [ a, b |
				val cmp = Double.compare(b.value, a.value)
				if (cmp != 0) cmp else a.key.compareTo(b.key)
		      ]
		
		      if (!rows.empty) {
		        result.put(reqName, rows.get(0))
		      }
	    	}
	    result
	  }

	private def static String toSR(String n) { 'SR:' + n }
}