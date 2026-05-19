package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.analysis.GraphBuilder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("all")
public class CandidateCompensatorAnalyzer {
  public static class Result {
    public final Map<String, Map<String, Integer>> candidatesByRequirement;

    public Result(final Map<String, Map<String, Integer>> candidatesByRequirement) {
      this.candidatesByRequirement = candidatesByRequirement;
    }
  }

  public CandidateCompensatorAnalyzer.Result analyze(final GraphBuilder.Result graphBundle) {
    CandidateCompensatorAnalyzer.Result _xblockexpression = null;
    {
      final LinkedHashMap<String, Map<String, Integer>> result = new LinkedHashMap<String, Map<String, Integer>>();
      final UpstreamDistanceAnalyzer distanceAnalyzer = new UpstreamDistanceAnalyzer();
      Set<String> _keySet = graphBundle.reqToSRs.keySet();
      TreeSet<String> _treeSet = new TreeSet<String>(_keySet);
      for (final String requirementName : _treeSet) {
        {
          final HashMap<String, Integer> minHopByNode = new HashMap<String, Integer>();
          final LinkedHashSet<String> srpNames = graphBundle.reqToSRs.get(requirementName);
          if ((srpNames != null)) {
            for (final String srpSimpleName : srpNames) {
              {
                this.addMinDistances(minHopByNode, 
                  distanceAnalyzer.computeUpstreamDistancesFromSrp(
                    ("SR:" + srpSimpleName), 
                    graphBundle.inEdges, 
                    graphBundle.srp2inf, 
                    "A:"));
                this.addMinDistances(minHopByNode, 
                  distanceAnalyzer.computeUpstreamDistancesFromSrp(
                    ("SR:" + srpSimpleName), 
                    graphBundle.inEdges, 
                    graphBundle.srp2inf, 
                    "E:"));
              }
            }
          }
          result.put(requirementName, minHopByNode);
        }
      }
      _xblockexpression = new CandidateCompensatorAnalyzer.Result(result);
    }
    return _xblockexpression;
  }

  private void addMinDistances(final Map<String, Integer> target, final Map<String, Integer> source) {
    Set<Map.Entry<String, Integer>> _entrySet = source.entrySet();
    for (final Map.Entry<String, Integer> entry : _entrySet) {
      {
        final Integer previous = target.get(entry.getKey());
        if (((previous == null) || (entry.getValue().compareTo(previous) < 0))) {
          target.put(entry.getKey(), entry.getValue());
        }
      }
    }
  }
}
