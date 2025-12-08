package fr.inria.kairos.influence.analysis


import fr.inria.kairos.influence.analysis.GraphBuilder
import fr.inria.kairos.influence.metamodel.DesignArtifact
import fr.inria.kairos.influence.metamodel.Influence
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.ArrayList
import java.util.Collection
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.TreeMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartUtils
import org.jfree.data.category.DefaultCategoryDataset

class ChartGenerator {
	static class InfRow {
	    public val String prejudicial
	    public val String compensator
	    public val double changeability
	    new(String o, String c, double z) {
	      prejudicial = o
	      compensator = c
	      changeability = z
	    }
	  }
  
	private def GraphBuilder.Result buildGraph(Resource res) {
		new GraphBuilder().build(res)
	}	

	private def ImpactMetrics.Result metrics(Resource res) {
		val gb = buildGraph(res)
		new ImpactMetrics().compute(res, gb)
	}
	
	def void exportImpactBarPng(Resource res, IFileSystemAccess2 fsa, String path, int w, int h) {
	    val m = metrics(res)
	  	val impact = m.impactArtifacts
	
	    if (impact.isEmpty) return
	
	    val ds = new DefaultCategoryDataset
	    for (e : new TreeMap<String, Integer>(impact).entrySet) {
	      ds.addValue(e.value as Number, "Impact", e.key)
	    }
		
	    val chart = ChartFactory.createBarChart(
	      "Impact by Artifact", "Artifact", "Origin count", ds
	    )
	
	    val baos = new ByteArrayOutputStream
	    ChartUtils.writeChartAsPNG(baos, chart, w, h)
	    writeBinary(fsa, path, baos.toByteArray)
	  }

	def void exportPropagationImpactBarPng(Resource res, IFileSystemAccess2 fsa, String path, int w, int h) {
	    val m = metrics(res)
	  	val prop = m.impactArtifactsPropagated
	    if (prop === null || prop.empty) return
	
	
	    val ds = new DefaultCategoryDataset
	    val sorted = new java.util.TreeMap<String, Number>()
	  	for (e : prop.entrySet) sorted.put(e.key, e.value as Number)
	  	for (e : sorted.entrySet) ds.addValue(e.value, "Direct + Indirect", e.key)
	
	
	    val chart = ChartFactory.createBarChart(
	      "Propagated Impact by Artifact", "Artifact", "Influences (direct + cascaded)", ds
	    )
	
	    val baos = new ByteArrayOutputStream
	    ChartUtils.writeChartAsPNG(baos, chart, w, h)
	    writeBinary(fsa, path, baos.toByteArray)
	  }

	def void exportOnlyIndirectImpactBarPng(Resource res, IFileSystemAccess2 fsa, String path, int w, int h) {
		val m = metrics(res)
	  	val ind = m.impactArtifactsIndirect
		if (ind === null || ind.empty) return
	
	
	    val ds = new DefaultCategoryDataset
		val sorted = new java.util.TreeMap<String, Number>()
		for (e : ind.entrySet) sorted.put(e.key, e.value as Number)
		for (e : sorted.entrySet) ds.addValue(e.value, "Indirect only", e.key)
		
	    val chart = ChartFactory.createBarChart(
	      "Propagated Impact by Artifact", "Artifact", "Influences (direct + cascaded)", ds
	    )
	
	    val baos = new ByteArrayOutputStream
	    ChartUtils.writeChartAsPNG(baos, chart, w, h)
	    writeBinary(fsa, path, baos.toByteArray)
	  }

  def void exportPhenomenaBarPng(Resource res, IFileSystemAccess2 fsa, String path, int w, int h) {
	val m = metrics(res)
	val impact  = m.impactEnvFactors
	if (impact === null || impact.empty) return

    val ds = new DefaultCategoryDataset
    for (e : new TreeMap<String, Integer>(impact).entrySet) {
      ds.addValue(e.value as Number, "Impact", e.key)
    }

    val chart = ChartFactory.createBarChart(
      "Impact by Environment Factor", "Environment Factor", "Participant count", ds
    )

    val baos = new ByteArrayOutputStream
    ChartUtils.writeChartAsPNG(baos, chart, w, h)
    writeBinary(fsa, path, baos.toByteArray)
  }

	def List<InfRow> bestCompensatorPerInfluence(
	    Resource res,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
		val out     = new ArrayList<InfRow>()
	    val graph  = buildGraph(res)                          
	  	val tracer = new RequirementTraceability(graph)
	    val daIndex = indexArtifacts(res)
	
	    for (inf : res.allContents.toIterable.filter(Influence)) {
	      val originators = namesFromArtifactFeature(inf, "originatorArtifact")
	      if (!originators.isEmpty) {
	
	        val cand = new LinkedHashSet<String>()
			val srs = srsFromInfluence(inf)
			for (sr : srs) {
			  val srName = readName(sr as EObject)
			  if (srName !== null) {
			    cand.addAll(tracer.upstreamArtifacts("SR:" + srName, inEdges).keySet)
			  }
			}
			if (!cand.empty) {
	          var String bestName = null
	          var Double bestVal  = null
	          for (nm : cand) {
	            val da = daIndex.get(nm)
	            var double c = 0.5
	            if (da !== null) c = readChangeability(da)
	            if (bestVal === null || c > bestVal) {
	              bestVal = c
	              bestName = nm
	            }
	          }
	          if (bestName !== null && bestVal !== null) {
	            for (o : originators) out.add(new InfRow(o, bestName, bestVal))
	          }
	        }
	      }
	    }
	    out
	  }

// Build the full map: originator -> (compensator -> max changeability).
	def Map<String, java.util.LinkedHashMap<String, Double>> allCompensatorsByOriginator(
	    Resource res,
	    Map<String, LinkedHashSet<String>> reqToSRs,
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
	    val out = new java.util.LinkedHashMap<String, java.util.LinkedHashMap<String, Double>>()
	    val graph  = buildGraph(res)                             
	  	val tracer = new RequirementTraceability(graph)
	    val daIndex = indexArtifacts(res)
	
	    for (inf : res.allContents.toIterable.filter(Influence)) {
	      val originators = namesFromArtifactFeature(inf, "originatorArtifact")
	      if (originators.empty) {
	        // skip
	      } else {
	        // gather candidate compensators from SRs affected by this influence
	        val cand = new LinkedHashSet<String>()
			val srs = srsFromInfluence(inf)
			for (sr : srs) {
			  val srName = readName(sr as EObject)
			  if (srName !== null) {
			    cand.addAll(tracer.upstreamArtifacts("SR:" + srName, inEdges).keySet)
			  }
			}
	        if (cand.empty) {
	          // skip
	        } else {
	          // compute changeability for candidates
	          val compToChange = new java.util.LinkedHashMap<String, Double>()
	          for (nm : cand) {
	            val da = daIndex.get(nm)
	            var double c = 0.5
	            if (da !== null) c = readChangeability(da)
	            val prev = compToChange.get(nm)
	            if (prev === null || c > prev) compToChange.put(nm, c)
	          }
	
	          // attach to each originator
	          for (o : originators) {
	            var java.util.LinkedHashMap<String, Double> bucket = out.get(o)
	            if (bucket === null) {
	              bucket = new java.util.LinkedHashMap<String, Double>()
	              out.put(o, bucket)
	            }
	            for (e : compToChange.entrySet) {
	              val prev = bucket.get(e.key)
	              if (prev === null || e.value > prev) bucket.put(e.key, e.value)
	            }
	          }
	        }
	      }
	    }
	    out
	  }

	private def Map<String, DesignArtifact> indexArtifacts(Resource res) {
	    val map = new LinkedHashMap<String, DesignArtifact>()
	    val it  = res.allContents
	    while (it.hasNext) {
	      val any = it.next
	      if (any instanceof DesignArtifact) {
	        val da = any as DesignArtifact
	        if (da.name !== null) map.put(da.name, da)
	      }
	    }
	    map
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

	private def double readChangeability(DesignArtifact da) {
	    var double c = 1.0
	    val sf = da.eClass?.getEStructuralFeature("changeability")
	    if (sf !== null && da.eIsSet(sf)) {
	      val v = da.eGet(sf)
	      if (v instanceof Number) c = (v as Number).doubleValue
	    }
	    c
	  }

	private def void writeBinary(IFileSystemAccess2 fsa, String path, byte[] bytes) {
	    try {
	      val methods = fsa.class.getMethods
	      var java.lang.reflect.Method mi = null
	      for (m : methods) {
	        if (m.name == "generateFile" && m.parameterTypes.length == 2) {
	          if (m.parameterTypes.get(0) == typeof(String) &&
	            m.parameterTypes.get(1).name.contains("InputStream")) {
	            mi = m
	          }
	        }
	      }
	
	      if (mi !== null) {
	        mi.invoke(fsa, path, new ByteArrayInputStream(bytes))
	      } else {
	        fsa.generateFile(path + ".txt", "Binary output not supported by this IFileSystemAccess.")
	      }
	    } catch (Exception e) {
	      fsa.generateFile(path + ".txt", "Binary output failed: " + e.class.simpleName + ": " + e.message)
	    }
  }
  
	private def java.util.ArrayList<EObject> srsFromInfluence(EObject inf) {
		val out = new java.util.ArrayList<EObject>()
		if (inf === null) return out

		for (fn : #["affects", "affectsSR", "affectsSRP", "affectedSRs", "affectsSystemResponse"]) {
		    val f = inf.eClass?.getEStructuralFeature(fn)
		    if (f !== null) {
		      val v = inf.eGet(f)
		      switch v {
		        Collection<?>: for (e : v) if (e instanceof EObject) out.add(e as EObject)
		        EObject: out.add(v as EObject)
		        default: {}
		      }
		      if (!out.empty) return out  // first that yields something wins
		    }
  }

		for (fn : #["outputSRP", "output", "resultSR", "resultSRP"]) {
		    val f = inf.eClass?.getEStructuralFeature(fn)
		    if (f !== null) {
		      val v = inf.eGet(f)
		      if (v instanceof EObject) out.add(v as EObject)
		      if (!out.empty) return out
		    }
		  }
  			out
		}
	}

