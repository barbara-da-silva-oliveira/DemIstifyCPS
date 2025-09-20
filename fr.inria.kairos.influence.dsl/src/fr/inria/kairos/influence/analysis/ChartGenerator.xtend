package fr.inria.kairos.influence.analysis

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.kairos.influence.metamodel.DesignArtifact
import fr.inria.kairos.influence.metamodel.Influence
import org.eclipse.xtext.generator.IFileSystemAccess2

import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartUtils
import org.jfree.chart.JFreeChart
import org.jfree.chart.axis.NumberAxis
import org.jfree.chart.plot.XYPlot
import org.jfree.chart.renderer.xy.XYBubbleRenderer
import org.jfree.data.category.DefaultCategoryDataset
import org.jfree.data.xy.DefaultXYZDataset

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.ArrayList
import java.util.Collection
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.TreeMap
import java.util.TreeSet
import org.jfree.chart.axis.SymbolAxis
import org.jfree.data.xy.XYZDataset
import org.jfree.chart.labels.XYItemLabelGenerator
import org.jfree.data.xy.XYDataset
import java.text.DecimalFormat
import org.jfree.chart.labels.StandardXYToolTipGenerator

class ChartGenerator {

   static class InfRow {
    public val String originator
    public val String compensator
    public val double changeability
    new(String o, String c, double z) {
		originator = o
		compensator = c
		changeability = z
    	}
  	}

	def void exportImpactBarPng(Resource res, IFileSystemAccess2 fsa, String path, int w, int h) {
		val impact = new ImpactMetrics().compute(res).impactArtifacts
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
		val impact = new ImpactMetrics().compute(res).impactArtifactsPropagated
		if (impact.isEmpty) return
	
		val ds = new DefaultCategoryDataset
		for (e : new TreeMap<String, Integer>(impact).entrySet) {
		ds.addValue(e.value as Number, "Direct+Indirect", e.key)
		}
	
		val chart = ChartFactory.createBarChart(
		"Propagated Impact by Artifact", "Artifact", "Influences (direct + cascaded)", ds
		)

		val baos = new ByteArrayOutputStream
		ChartUtils.writeChartAsPNG(baos, chart, w, h)
		writeBinary(fsa, path, baos.toByteArray)
	}
	
	def void exportOnlyIndirectImpactBarPng(Resource res, IFileSystemAccess2 fsa, String path, int w, int h) {
		val impact = new ImpactMetrics().compute(res).impactArtifactsPropagated
		if (impact.isEmpty) return
	
		val ds = new DefaultCategoryDataset
		for (e : new TreeMap<String, Integer>(impact).entrySet) {
		ds.addValue(e.value as Number, "Direct+Indirect", e.key)
		}
	
		val chart = ChartFactory.createBarChart(
		"Propagated Impact by Artifact", "Artifact", "Influences (direct + cascaded)", ds
		)

		val baos = new ByteArrayOutputStream
		ChartUtils.writeChartAsPNG(baos, chart, w, h)
		writeBinary(fsa, path, baos.toByteArray)
	}

	def void exportPhenomenaBarPng(Resource res, IFileSystemAccess2 fsa, String path, int w, int h) {
	    val impact = new ImpactMetrics().compute(res).impactPhenomena
	    if (impact.isEmpty) return
	
	    val ds = new DefaultCategoryDataset
	    for (e : new TreeMap<String, Integer>(impact).entrySet) {
	      ds.addValue(e.value as Number, "Impact", e.key)
	    }
	
	    val chart = ChartFactory.createBarChart(
	      "Impact by Phenomena", "Phenomena", "Origin count", ds
	    )
	
	    val baos = new ByteArrayOutputStream
	    ChartUtils.writeChartAsPNG(baos, chart, w, h)
	    writeBinary(fsa, path, baos.toByteArray)
	  }


	def List<InfRow> bestCompensatorPerInfluence(
	    Resource res,
	    Map<String, LinkedHashSet<String>> reqToSRs,        // kept for future variants
	    Map<String, LinkedHashSet<String>> inEdges
	  ) {
	    val out     = new ArrayList<InfRow>()
	    val tracer  = new RequirementTraceability
	    val daIndex = indexArtifacts(res)
	
	    for (inf : res.allContents.toIterable.filter(Influence)) {
			val originators = namesFromArtifactFeature(inf, "originatorArtifact")
			if (!originators.isEmpty) {
	
	        // gather candidate compensators from SRs affected by this influence
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
		          // choose hardest = max changeability
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

	def List<InfRow> exportInfluenceBubblesPng(
	  Resource res,
	  Map<String, LinkedHashSet<String>> reqToSRs,
	  Map<String, LinkedHashSet<String>> inEdges,
	  IFileSystemAccess2 fsa, String path, int w, int h
	) {
		val rows = bestCompensatorPerInfluence(res, reqToSRs, inEdges)
		if (rows.isEmpty) return rows
		
		  // 1) Names universe and indexes
		val names = new TreeSet<String>()
		for (r : rows) { names.add(r.originator); names.add(r.compensator) }
		val nameToIdx = new LinkedHashMap<String, Integer>()
		var idx = 0
		for (n : names) { 
			nameToIdx.put(n, idx); 
			idx = idx + 1
		}
		
		  // 2) XYZ arrays
		val N = rows.size
		val X = newDoubleArrayOfSize(N)
		val Y = newDoubleArrayOfSize(N)
		val Z = newDoubleArrayOfSize(N)
		var i = 0
		for (r : rows) {
			X.set(i, nameToIdx.get(r.originator).doubleValue)
		    Y.set(i, nameToIdx.get(r.compensator).doubleValue)
		    Z.set(i, r.changeability)
		    i = i + 1
		  }
		
		val ds = new DefaultXYZDataset
		ds.addSeries("Influences", #[X, Y, Z])
		
		  // numeric axes + item labels
		val xAxis = new NumberAxis("Originator")
		xAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits())
		val yAxis = new NumberAxis("Compensator")
		yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits())
		
		val renderer = new XYBubbleRenderer(XYBubbleRenderer.SCALE_ON_BOTH_AXES)
		
	  // index -> name array for labels
		val idxToName = new java.util.LinkedHashMap<Integer, String>()
		var j = 0
		for (nm : names) { // 'names' TreeSet<String>
  			idxToName.put(j, nm)
  			j = j + 1
		}

		renderer.setDefaultItemLabelsVisible(true)
		renderer.setDefaultItemLabelGenerator(new XYItemLabelGenerator() {
			
		override generateLabel(XYDataset dataset, int series, int item) {
			val ox = dataset.getX(series, item).intValue
			val oy = dataset.getY(series, item).intValue
			val orgName = idxToName.containsKey(ox) ? idxToName.get(ox) : String.valueOf(ox)
			val cmpName = idxToName.containsKey(oy) ? idxToName.get(oy) : String.valueOf(oy)
			val z = (dataset as XYZDataset).getZValue(series, item)
			"originator " + orgName + " -> " + " compensator " + cmpName + " [" + new DecimalFormat("#.##").format(z) + "]"
	    	}
	  		})
		renderer.setDefaultToolTipGenerator(new StandardXYToolTipGenerator())
	
		val plot = new XYPlot(ds, xAxis, yAxis, renderer)
		val chart = new JFreeChart(
		    "Originator vs Compensator (bubble size = changeability)",
		    JFreeChart.DEFAULT_TITLE_FONT, plot, false
	  )
	
		val baos = new ByteArrayOutputStream
		ChartUtils.writeChartAsPNG(baos, chart, w, h)
		writeBinary(fsa, path, baos.toByteArray)
		  rows
		}


 // Index all DesignArtifacts by name
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

  // Read a collection-typed feature and collect DesignArtifact names
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

 // Read a 'name' attribute reflectively from any EObject
	private def String readName(EObject obj) {
	    val nf = obj.eClass.getEStructuralFeature("name")
	    if (nf === null) return null
	    val nv = obj.eGet(nf)
	    if (nv instanceof String) nv as String else null
	  }

  // Read DesignArtifact.changeability with default 1.0
	private def double readChangeability(DesignArtifact da) {
		var double c = 1.0
	    val sf = da.eClass?.getEStructuralFeature("changeability")
	    if (sf !== null && da.eIsSet(sf)) {
	      val v = da.eGet(sf)
	      if (v instanceof Number) c = (v as Number).doubleValue
	    }
	    c
	  }

  // Robust binary writer: try generateFile(String, InputStream); else, write a .txt note
	private def void writeBinary(IFileSystemAccess2 fsa, String path, byte[] bytes) {
	    try {
	      // look for a generateFile(String, InputStream) method
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
	        // last resort: leave a marker text file instead of failing
	        fsa.generateFile(path + ".txt", "Binary output not supported by this IFileSystemAccess.")
	      }
	    } catch (Exception e) {
	      fsa.generateFile(path + ".txt", "Binary output failed: " + e.class.simpleName + ": " + e.message)
    	}
  }
}

