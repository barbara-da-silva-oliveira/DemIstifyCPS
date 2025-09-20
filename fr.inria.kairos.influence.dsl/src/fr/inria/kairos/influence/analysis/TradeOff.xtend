package fr.inria.kairos.influence.analysis

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.DesignArtifact
import org.eclipse.xtext.generator.IFileSystemAccess2

import java.util.Map
import java.util.List
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.ArrayList
import java.util.TreeSet
import java.util.Collection


class TradeOff {

	static class TradeoffRow {
		public val String influence        // the influence name for which we chose a compensator
	    public val String originator       // originator artifact (of that influence)
	    public val String compensator      // chosen easiest compensator, best choice
	    public val double changeability    // its changeability
	    public val int    alsoOriginatorCount // how many other influences where compensator is originator
	    public val String alsoOriginatorIn // semicolon-separated list of those influences
	    new(String influence, String originator, String compensator, double changeability,
	        int alsoOriginatorCount, String alsoOriginatorIn) {
	      this.influence = influence
	      this.originator = originator
	      this.compensator = compensator
	      this.changeability = changeability
	      this.alsoOriginatorCount = alsoOriginatorCount
	      this.alsoOriginatorIn = alsoOriginatorIn
	    }
  	}

	def List<TradeoffRow> analyze(
	    Resource res,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
		val rows = new ArrayList<TradeoffRow>()

	    // index artifacts by name to read changeability
	    val daIndex = indexArtifacts(res)
	
	    // Build: influenceName -> originatorArtifactNames
	    val inflToOriginators = new LinkedHashMap<String, LinkedHashSet<String>>()
	    // Build: artifactName -> set of influenceNames where it is originator
	    val artToInfluences = new LinkedHashMap<String, LinkedHashSet<String>>()
	
	    for (inf : res.allContents.toIterable.filter(Influence)) {
	      val iName = inf.name
	      val originators = namesFromArtifactFeature(inf, "originatorArtifact")
	      if (!originators.isEmpty) {
	        inflToOriginators.put(iName, originators)
	        for (a : originators) {
	          var s = artToInfluences.get(a)
	          if (s === null) { s = new LinkedHashSet<String>(); artToInfluences.put(a, s) }
	          s.add(iName)
	        }
	      }
	    }

    	val tracer = new RequirementTraceability

	    // For each influence, choose hardest compensator from SR upstream candidates, then check tradeoff
		for (inf : res.allContents.toIterable.filter(Influence)) {
			val iName = inf.name
			val originators = inflToOriginators.get(iName)
			if (originators === null || originators.isEmpty) {
	        // nothing to do
	      	} else {
	        // gather candidate compensators from affected SRs
	        val cand = new LinkedHashSet<String>()
	        val affectsF = inf.eClass.getEStructuralFeature("affects")
	        if (affectsF !== null) {
	        	val srs = inf.eGet(affectsF) as Collection<?>
	        	if (srs !== null) for (sr : srs) {
	            	val srName = readName(sr as EObject)
	            	if (srName !== null) cand.addAll(tracer.upstreamArtifacts("SR:" + srName, inEdges).keySet)
	          }
	        }
			if (!cand.isEmpty) {
	          // pick easiest = max changeability
				var String bestName = null
				var Double bestVal  = null
				for (nm : cand) {
	          	val da = daIndex.get(nm)
	            var double c = 0.5
	            if (da !== null) c = readChangeability(da)
	            if (bestVal === null || c > bestVal) { bestVal = c; bestName = nm }
	          }
			if (bestName !== null && bestVal !== null) {
	            // For each originator of THIS influence, emit a row
	            val whereCompIsOrigin = new TreeSet<String>(artToInfluences.getOrDefault(bestName, new LinkedHashSet<String>()))
	            whereCompIsOrigin.remove(iName) // "different influences" only
	            val joined = whereCompIsOrigin.join("; ")
	            for (o : originators) {
	              rows.add(new TradeoffRow(
	                iName, o, bestName, bestVal,
	                whereCompIsOrigin.size, joined
	              ))
	            }
	          }
	        }
	      }
    	}
    	rows
  	}

	def void exportCSV(
	    Resource res,
	    IFileSystemAccess2 fsa, String path,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
		) {
		val rows = analyze(res, reqToSRs, inEdges)
	    val sb = new StringBuilder(
//	      "influence,originator,compensator,changeability,count,influence_originator\n"
			"influence,compensator,count,influence_originator\n"
	    )
	    for (r : rows) {
	      sb.append(csv(r.influence)).append(',')
	      //  .append(csv(r.originator)).append(',')
	        .append(csv(r.compensator)).append(',')
	     //   .append( r.changeability).append(',')
	        .append(String.valueOf(r.alsoOriginatorCount)).append(',')
	        .append(csv(r.alsoOriginatorIn)).append('\n')
	    }
	    fsa.generateFile(path, sb.toString)
	  }

  
	private def Map<String, DesignArtifact> indexArtifacts(Resource res) {
	    val map = new LinkedHashMap<String, DesignArtifact>()
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

	private def LinkedHashSet<String> namesFromArtifactFeature(EObject host, String featureName) {
	    val out = new LinkedHashSet<String>()
	    val f = host.eClass.getEStructuralFeature(featureName)
	    if (f === null) return out
	    val v = host.eGet(f)
	    switch v {
	      Collection<?>: for (e : v) if (e instanceof DesignArtifact) {
	        val nm = (e as DesignArtifact).name
	        if (nm !== null) out.add(nm)
	      }
	      DesignArtifact: {
	        val nm = (v as DesignArtifact).name
	        if (nm !== null) out.add(nm)
	      }
	      default: {}
	    }
	    out
  	}

	private def String readName(EObject obj) {
	    val nf = obj.eClass.getEStructuralFeature("name")
	    if (nf === null) return null
	    val nv = obj.eGet(nf)
	    if (nv instanceof String) nv as String else null
	}

	private def String csv(String s) {
	    val needs = s.indexOf(',') >= 0 || s.indexOf('\"') >= 0 || s.indexOf('\\n') >= 0 || s.indexOf('\\r') >= 0
	    val esc = s
	    if (needs) '\"' + esc + '\"' else esc
	  }
}
