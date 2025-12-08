package fr.inria.kairos.influence.export

import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import org.jgrapht.nio.dot.DOTExporter
import org.jgrapht.nio.DefaultAttribute
import org.jgrapht.nio.Attribute
import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.Map

class DotExporter {

	def void exportGraphToDot(DefaultDirectedGraph<String, DefaultEdge> graph,
                            Map<String, String> vertexLabels,
                            Map<DefaultEdge, String> edgeLabels,
                            Map<String, String> nodeToOrigin,
                            Map<String, String> nodeSourceModel,
                            Map<DefaultEdge, String> edgeToOrigin,
						    Map<DefaultEdge, Double> edgeWeights,
						    IFileSystemAccess2 fsa, String filename) {

		val dot = new DOTExporter<String, DefaultEdge>([ v | safeId(v) ])
	
	    dot.setGraphAttributeProvider([
	      val a = new java.util.LinkedHashMap<String, Attribute>()
	      a.put("rankdir", DefaultAttribute.createAttribute("LR"))
	      a
	    ])

		dot.setVertexAttributeProvider([ v |
	    	val a = new java.util.LinkedHashMap<String, Attribute>()
	    	val lbl = vertexLabels?.getOrDefault(v, v)
	    	a.put("label", DefaultAttribute.createAttribute(lbl))
	    	
	    	
	    	val srcModel = nodeSourceModel?.get(v)
				if (srcModel !== null) {
        			a.put("srcModel",      DefaultAttribute.createAttribute(srcModel))    
        			a.put("tooltip",  DefaultAttribute.createAttribute(srcModel))     
      			}
	      		a
	    	])

	    dot.setEdgeAttributeProvider([ e |
	      val a = new java.util.LinkedHashMap<String, Attribute>()
	      val lbl = edgeLabels?.get(e)
	      if (lbl !== null) a.put("label", DefaultAttribute.createAttribute(lbl))
	      val src = edgeToOrigin?.get(e)
      		if (src !== null) {
        		a.put("src",     DefaultAttribute.createAttribute(src))
        		a.put("tooltip", DefaultAttribute.createAttribute(src))
      		}
      		val w = edgeWeights?.get(e)
			if (w !== null) {
        	val ws = String.format(java.util.Locale.ROOT, "%.3f", w)
        	a.put("weight",   DefaultAttribute.createAttribute(ws))             // Graphviz weight
      }
	      	a
	    ])
	    
	    val w = new java.io.StringWriter
	    dot.exportGraph(graph, w)
	    fsa.generateFile(filename, w.toString)
  	}
	
	def void exportGraphToDot(
		DefaultDirectedGraph<String, DefaultEdge> graph,
    	Map<String, String> vertexLabels,
    	Map<DefaultEdge, String> edgeLabels,
    	IFileSystemAccess2 fsa, String filename
  		) {
  			
		exportGraphToDot(graph, vertexLabels, edgeLabels,
     	java.util.Collections.emptyMap, 
     	java.util.Collections.emptyMap,
     	java.util.Collections.emptyMap,
     	java.util.Collections.emptyMap,
      	fsa, filename)
  	}
		
	private def static String safeId(String v) {
	    if (v === null) return "n"
	    var base = v.replaceAll("[^A-Za-z0-9_]", "_")
	    if (base.empty) base = "n"
	    if (!base.matches("[A-Za-z_].*")) base = "n_" + base
	    base + "_" + Integer.toHexString(v.hashCode).toLowerCase
  	}
  	
		
	}