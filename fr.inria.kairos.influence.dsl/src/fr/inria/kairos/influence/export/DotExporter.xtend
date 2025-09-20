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
	      a
	    ])

	    dot.setEdgeAttributeProvider([ e |
	      val a = new java.util.LinkedHashMap<String, Attribute>()
	      val lbl = edgeLabels?.get(e)
	      if (lbl !== null) a.put("label", DefaultAttribute.createAttribute(lbl))
	      a
	    ])

	    val w = new java.io.StringWriter
	    dot.exportGraph(graph, w)
	    fsa.generateFile(filename, w.toString)
  	}

	private def static String safeId(String v) {
	    if (v === null) return "n"
	    var base = v.replaceAll("[^A-Za-z0-9_]", "_")
	    if (base.empty) base = "n"
	    if (!base.matches("[A-Za-z_].*")) base = "n_" + base
	    base + "_" + Integer.toHexString(v.hashCode).toLowerCase
  	}
}
