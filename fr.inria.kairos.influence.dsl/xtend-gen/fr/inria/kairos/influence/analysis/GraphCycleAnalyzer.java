package fr.inria.kairos.influence.analysis;

import java.util.Set;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

@SuppressWarnings("all")
public class GraphCycleAnalyzer {
  public boolean detectCycle(final DefaultDirectedGraph<String, DefaultEdge> graph) {
    boolean _xblockexpression = false;
    {
      final CycleDetector<String, DefaultEdge> cycleDetector = new CycleDetector<String, DefaultEdge>(graph);
      boolean _xifexpression = false;
      boolean _detectCycles = cycleDetector.detectCycles();
      if (_detectCycles) {
        boolean _xblockexpression_1 = false;
        {
          Set<String> _findCycles = cycleDetector.findCycles();
          String _plus = ("Cycle detected " + _findCycles);
          InputOutput.<String>println(_plus);
          _xblockexpression_1 = true;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        boolean _xblockexpression_2 = false;
        {
          InputOutput.<String>println("No cycles detected");
          _xblockexpression_2 = false;
        }
        _xifexpression = _xblockexpression_2;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
