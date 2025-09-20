package fr.inria.kairos.influence.export

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.xbase.lib.Pair

import fr.inria.kairos.influence.metamodel.DesignArtifact

import java.util.Locale
import java.util.LinkedHashSet
import java.util.Map
import java.util.TreeMap
import java.util.ArrayList
import fr.inria.kairos.influence.analysis.ImpactMetrics
import fr.inria.kairos.influence.analysis.CompensationFinder
import fr.inria.kairos.influence.analysis.RequirementTraceability

class TablesExporter {

 // 1) Impact metrics (counts and weighted)
	def void exportImpactCSVs(Resource res, IFileSystemAccess2 fsa, String folder) {
	    val m = new ImpactMetrics().compute(res)
	
	    // counts
		writeMapIntCSV(fsa, folder + "/impact_artifacts.csv",
	      "artifact,count", new TreeMap<String, Integer>(m.impactArtifacts))
	
	    writeMapIntCSV(fsa, folder + "/impact_phenomena.csv",
	      "phenomenon,count", new TreeMap<String, Integer>(m.impactPhenomena))
	
	    writeMapIntCSV(fsa, folder + "/sensitive_requirements.csv",
	      "requirement,count", new TreeMap<String, Integer>(m.sensRequirements))
	
	    // weighted - we are not using it right now
	    writeMapDoubleCSV(fsa, folder + "/impact_artifacts_weighted.csv",
	      "artifact,weight", new TreeMap<String, Double>(m.impactArtifactsW))
	
	    writeMapDoubleCSV(fsa, folder + "/impact_phenomena_weighted.csv",
	      "phenomenon,weight", new TreeMap<String, Double>(m.impactPhenomenaW))
	
	    writeMapDoubleCSV(fsa, folder + "/sensitive_requirements_weighted.csv",
	      "requirement,weight", new TreeMap<String, Double>(m.sensRequirementsW))
	}

// Best compensator per requirement (max changeability) CSV
	def void exportHardestCompensatorByReqCSV(
	    Resource res,
	    IFileSystemAccess2 fsa,
	    String outPath,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
	    val cf = new CompensationFinder
	    val hardest = cf.bestCompensatorByChangeability(res, reqToSRs, inEdges)
	    // header
	    val sb = new StringBuilder("requirement,compensator,changeability\n")
	    // rows
	    for (req : new java.util.TreeSet<String>(hardest.keySet)) {
	      val p = hardest.get(req) // Pair<String, Double>
	      if (p !== null) {
	        sb.append(csv(req)).append(',')
	          .append(csv(p.key)).append(',')
	          .append(fmtDouble(p.value)).append('\n')
	      }
    	}
    	fsa.generateFile(outPath, sb.toString)
  	}

// Candidate compensators (upstream artifacts) per requirement with min hops -> CSV
	def void exportCandidatesByReqCSV(
	    Resource res,
	    IFileSystemAccess2 fsa,
	    String outPath,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
		val tracer = new RequirementTraceability
	    val sb = new StringBuilder("requirement,artifact,min_hops\n")
	
	    for (reqName : new java.util.TreeSet<String>(reqToSRs.keySet)) {
			val agg = new java.util.HashMap<String, Integer>()
			val srs = reqToSRs.get(reqName)
			if (srs !== null) {
		    	for (srName : srs) {
		        	val m = tracer.upstreamArtifacts("SR:" + srName, inEdges)
		        	for (e : m.entrySet) {
		            	val prev = agg.get(e.key)
		            	if (prev === null || e.value < prev) agg.put(e.key, e.value)
		          }
		        }
		      }
	      // sorted by hops ASC, then name ASC
	      val rows = new ArrayList<Pair<String, Integer>>()
	      for (name : agg.keySet) rows.add(new Pair(name, agg.get(name)))
	      rows.sort [ a, b |
	        val c = Integer.compare(a.value, b.value)
	        if (c != 0) c else a.key.compareTo(b.key)
	      ]
	      if (rows.empty) {
	        // still emit a line to make it easy to see empties
	        sb.append(csv(reqName)).append(",(none),").append("").append('\n')
	      } else {
	        for (r : rows) {
	          sb.append(csv(reqName)).append(',')
	            .append(csv(r.key)).append(',')
	            .append(String.valueOf(r.value)).append('\n')
	        }
	      }
	    }
	    fsa.generateFile(outPath, sb.toString)
  }

  // 4) Full compensator ranking (changeability) per requirement -> CSV
	def void exportCompensatorRankingByReqCSV(
		Resource res,
	    IFileSystemAccess2 fsa,
	    String outPath,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
	  	) {
	    // index artifacts and read changeability
	    val daIndex = indexArtifacts(res)
	
	    val sb = new StringBuilder("requirement,artifact,changeability\n")
	    for (reqName : new java.util.TreeSet<String>(reqToSRs.keySet)) {
			val agg = new java.util.HashMap<String, Integer>()
	    	val srs = reqToSRs.get(reqName)
	    	if (srs !== null) {
		        val tracer = new RequirementTraceability
		        for (srName : srs) {
		          val m = tracer.upstreamArtifacts("SR:" + srName, inEdges)
		          for (e : m.entrySet) {
		            val prev = agg.get(e.key)
		            if (prev === null || e.value < prev) agg.put(e.key, e.value)
		          }
		        }
		      }
	      // rows (artifact, changeability) sorted by changeability DESC then name ASC
			val rows = new ArrayList<Pair<String, Double>>()
			for (name : agg.keySet) {
		        val da = daIndex.get(name)
		        var double c = 0.5
		        if (da !== null) c = readChangeability(da)
		        rows.add(new Pair(name, c))
	      	}
	      	rows.sort [ a, b |
	        val cmp = Double.compare(b.value, a.value)
	        if (cmp != 0) cmp else a.key.compareTo(b.key)
	      	]
	      	if (rows.empty) {
	        sb.append(csv(reqName)).append(",(none),").append("").append('\n')
	      	} else {
	        for (r : rows) {
	          sb.append(csv(reqName)).append(',')
	            .append(csv(r.key)).append(',')
	            .append(fmtDouble(r.value)).append('\n')
	        }
	      }
	    }
	    fsa.generateFile(outPath, sb.toString)
	  }

  
  
	private def void writeMapIntCSV(IFileSystemAccess2 fsa, String path, String header, Map<String, Integer> m) {
	    val sb = new StringBuilder(header).append('\n')
	    for (e : m.entrySet) {
	    	sb.append(csv(e.key)).append(',').append(String.valueOf(e.value)).append('\n')
	    }
	    fsa.generateFile(path, sb.toString)
	  }

	private def void writeMapDoubleCSV(IFileSystemAccess2 fsa, String path, String header, Map<String, Double> m) {
	    val sb = new StringBuilder(header).append('\n')
	    for (e : m.entrySet) {
	    	sb.append(csv(e.key)).append(',').append(fmtDouble(e.value)).append('\n')
	    }
	    fsa.generateFile(path, sb.toString)
	  }

	private def String csv(String s) {
	    if (s === null) return ""
	    val needs = s.indexOf(',') >= 0 || s.indexOf('"') >= 0 || s.indexOf('\n') >= 0 || s.indexOf('\r') >= 0
	    val esc = s.replace("\"", "\"\"")
	    if (needs) '"' + esc + '"' else esc
	  }

	private def String fmtDouble(Double d) {
	    if (d === null) return ""
	    String.format(Locale.US, "%.4f", d.doubleValue)
	    }

	private def Map<String, DesignArtifact> indexArtifacts(Resource res) {
	    val map = new java.util.LinkedHashMap<String, DesignArtifact>()
	    val it = res.allContents
	    while (it.hasNext) {
	    	val any = it.next
	    	if (any instanceof DesignArtifact) {
		        val da = any as DesignArtifact
		        if (da.name !== null) map.put(da.name, da)
	      	}
	    }
	    map
	  }

	private def double readChangeability(DesignArtifact da) {
	    var double c = 0.5
	    val sf = da.eClass?.getEStructuralFeature("changeability")
	    if (sf !== null && da.eIsSet(sf)) {
	    	val v = da.eGet(sf)
	    	if (v instanceof Number) c = (v as Number).doubleValue
	    	}
	    c
	  }
}
