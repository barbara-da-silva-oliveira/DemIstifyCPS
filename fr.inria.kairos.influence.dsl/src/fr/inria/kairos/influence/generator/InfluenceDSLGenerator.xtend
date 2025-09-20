package fr.inria.kairos.influence.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.inria.kairos.influence.export.GraphBuilder
import fr.inria.kairos.influence.export.DotExporter
import fr.inria.kairos.influence.export.JsonExporter
import fr.inria.kairos.influence.export.InfoExporter

import fr.inria.kairos.influence.analysis.ImpactMetrics
import fr.inria.kairos.influence.analysis.RequirementTraceability
import fr.inria.kairos.influence.analysis.CompensationFinder
import org.eclipse.emf.ecore.EObject
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.alg.cycle.CycleDetector
import org.jgrapht.graph.DefaultEdge

import org.jfree.data.category.DefaultCategoryDataset
import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartUtils
import java.io.ByteArrayOutputStream
import java.io.ByteArrayInputStream
import fr.inria.kairos.influence.analysis.ChartGenerator
import fr.inria.kairos.influence.export.TablesExporter
import fr.inria.kairos.influence.analysis.TradeOff
import fr.inria.kairos.influence.analysis.StakeholdersOwner

class InfluenceDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val gb     = new GraphBuilder
	    val built  = gb.build(resource)
	
	    val graph = built.graph
	    val vertexLabels = built.vertexLabels
	    val edgeLabels = built.edgeLabels
	    val inEdges = built.inEdges
		val reqToSRs = built.reqToSRs
	
	    new DotExporter().exportGraphToDot(graph, vertexLabels, edgeLabels, fsa, "graph/influenceHypergraph.dot")
	    new JsonExporter().exportInfluences(resource, fsa)
	
	    val metrics = new ImpactMetrics().compute(resource)
	
	    val sb  = new StringBuilder("Metrics on the Influences:\n")
	    val out = new InfoExporter
	
	    sb.append("\nImpact of Artifacts (origin count):\n")
	    out.appendSortedIntMap(sb, new java.util.HashMap<String, Integer>(metrics.impactArtifacts))
	
	    sb.append("\nImpact of Phenomena (origin count):\n")
	    out.appendSortedIntMap(sb, new java.util.HashMap<String, Integer>(metrics.impactPhenomena))
	
	    sb.append("\nSensibility of Requirements (counts):\n")
	    out.appendSortedIntMap(sb, new java.util.HashMap<String, Integer>(metrics.sensRequirements))
	
	    sb.append("\nImpact of Artifacts (likelihood-weighted):\n")
	    out.appendSortedDoubleMap(sb, new java.util.HashMap<String, Double>(metrics.impactArtifactsW))
	
	    sb.append("\nImpact of Phenomena (likelihood-weighted):\n")
	    out.appendSortedDoubleMap(sb, new java.util.HashMap<String, Double>(metrics.impactPhenomenaW))
	
	    sb.append("\nSensibility of Requirements (priority-weighted):\n")
	    out.appendSortedDoubleMap(sb, new java.util.HashMap<String, Double>(metrics.sensRequirementsW))
	
	    sb.append("\nCandidate of compensators traced per requirement:\n")
	    val trace = new RequirementTraceability
		for (reqName : new java.util.TreeSet<String>(reqToSRs.keySet)) {
	      val agg = new java.util.HashMap<String, Integer>()
	      val srs = reqToSRs.get(reqName)
	      if (srs !== null) {
	        for (srName : srs) {
	          val m = trace.upstreamArtifacts("SR:" + srName, inEdges)
	          for (e : m.entrySet) {
	            val prev = agg.get(e.key)
	            if (prev === null || e.value < prev) agg.put(e.key, e.value)
	          }
	        }
	      }
	      val items = new java.util.ArrayList<java.util.Map$Entry<String, Integer>>(agg.entrySet)
	      items.sort [ a, b |
	        val c = Integer.compare(a.value, b.value)
	        if (c != 0) c else a.key.compareTo(b.key)
	      ]
	      sb.append("  ").append(reqName).append(": ")
	      if (items.empty) {
	        sb.append("(none)\n")
	      } else {
	        val line = items.map [ it.key + " (" + it.value + " hop" + (it.value == 1 ? "" : "s") + ")" ].join(", ")
	        sb.append(line).append("\n")
	      }
	    }
	
	    new CompensationFinder().appendCompensatorsByChangeability(resource, sb, reqToSRs, inEdges)  
//     
//	  val impact = new fr.inria.kairos.influence.analysis.ImpactMetrics().compute(resource).impactArtifacts
//	  val ds1 = new DefaultCategoryDataset
//	  for (e : new java.util.TreeMap<String, Integer>(impact).entrySet) {
//	  	ds1.addValue(e.value as Number, "Impact", e.key)
//  		}
//  		
//	  val chart1 = ChartFactory.createBarChart(
//	    "Impact by Artifact",
//	    "Artifact",
//	    "Origin count",
//	    ds1
//	  )
//	  val baos1 = new ByteArrayOutputStream
//	  ChartUtils.writeChartAsPNG(baos1, chart1, 1100, 650)
//	  fsa.generateFile("charts/impact.png", new ByteArrayInputStream(baos1.toByteArray))
//	  
		val cfinder = new fr.inria.kairos.influence.analysis.CompensationFinder
		val hardest = cfinder.bestCompensatorByChangeability(resource, reqToSRs, inEdges)
		  
	    sb.append("\nLess costly compensator per requirement:\n")
	    for (reqName : new java.util.TreeSet<String>(hardest.keySet)) {
	    	val p = hardest.get(reqName)     // Pair<String, Double>
	        val name = p.key
	        val cval = p.value
	        sb.append("  ").append(reqName).append(": ")
	          .append(name).append(" (changeability=")
	          .append(String.format(java.util.Locale.US, "%.2f", cval))
	          .append(")\n")
	      }
	      
		val charts = new ChartGenerator
		charts.exportImpactBarPng(resource, fsa, "charts/impactArtifact.png", 1100, 650)
		charts.exportPropagationImpactBarPng(resource, fsa, "charts/impactPropagationArtifact.png", 1100, 650)
	
		charts.exportPhenomenaBarPng(resource, fsa, "charts/impactPhenomena.png", 1100, 650)

		val perInf = charts.exportInfluenceBubblesPng(
	    resource, reqToSRs, inEdges, fsa,
	    "charts/influence_compensation_bubbles.png", 1200, 900
	  	)
		if (!perInf.isEmpty) {
	    sb.append("\n Less costly compensator per influence (originator -> compensator, changeability):\n")
		    for (r : perInf) {
		      sb.append("  ").append(r.originator).append(" -> ").append(r.compensator)
		        .append("  (").append(String.format(java.util.Locale.US, "%.2f", r.changeability)).append(")\n")
		    }
    	}
	    
	    
		val tables = new TablesExporter
		val traceData = new RequirementTraceability().buildTrace(resource)
		val trade = new TradeOff
		trade.exportCSV(resource, fsa, "tables/tradeoffs_compensator_is_originator.csv", traceData.reqToSRs, traceData.inEdges)
		
		// now pass the fields from TraceData:
		tables.exportCandidatesByReqCSV(
		  resource, fsa, "tables/candidates_by_req.csv",
		  traceData.reqToSRs, traceData.inEdges
		)
		
		tables.exportCompensatorRankingByReqCSV(
		  resource, fsa, "tables/compensator_ranking_by_req.csv",
		  traceData.reqToSRs, traceData.inEdges
		)
		
		tables.exportHardestCompensatorByReqCSV(
		  resource, fsa, "tables/best_compensator_by_req.csv",
		  traceData.reqToSRs, traceData.inEdges
		)
		
		new StakeholdersOwner().exportCSV(resource, fsa, "tables/influence_model_spread.csv")
		
		fsa.generateFile("file/info.txt", sb.toString)
		detectCycle(graph)
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
  
  
	def static String metadataSafe(EObject o) {
	    if (o === null) return null
	    val f = o.eClass?.getEStructuralFeature("metadata")
		if (f === null) return null
		val v = o.eGet(f)
		if (v instanceof String) {
		  v as String
		  } else if (v instanceof java.util.List<?>) {
		  	(v as java.util.List<?>)
		    .filter[it !== null]
		    .map[String.valueOf(it)]
		    .join(", ")
		    } else null
		    }
	}