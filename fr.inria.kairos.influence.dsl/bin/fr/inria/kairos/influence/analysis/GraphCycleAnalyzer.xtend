package fr.inria.kairos.influence.analysis

import org.jgrapht.alg.cycle.CycleDetector
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge

class GraphCycleAnalyzer {

	def boolean detectCycle(DefaultDirectedGraph<String, DefaultEdge> graph) {
		val cycleDetector = new CycleDetector<String, DefaultEdge>(graph)

		if (cycleDetector.detectCycles()) {
			println("Cycle detected " + cycleDetector.findCycles())
			true
		 } else {
			println("No cycles detected")
			false
		}
	}
}