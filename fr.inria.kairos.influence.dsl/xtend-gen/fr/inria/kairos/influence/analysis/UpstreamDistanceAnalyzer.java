package fr.inria.kairos.influence.analysis;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

@SuppressWarnings("all")
public class UpstreamDistanceAnalyzer {
  public static class PairNode {
    public final String nodeId;

    public final int hops;

    public PairNode(final String nodeId, final int hops) {
      this.nodeId = nodeId;
      this.hops = hops;
    }
  }

  public Map<String, Integer> computeUpstreamDistancesFromSrp(final String srpId, final Map<String, LinkedHashSet<String>> incomingAdjacency, final Map<String, String> srpToInfluence, final String targetPrefix) {
    HashMap<String, Integer> _xblockexpression = null;
    {
      final HashMap<String, Integer> distances = new HashMap<String, Integer>();
      final HashSet<String> visitedSrps = new HashSet<String>();
      final ArrayDeque<UpstreamDistanceAnalyzer.PairNode> worklist = new ArrayDeque<UpstreamDistanceAnalyzer.PairNode>();
      final String producerInfluenceId = srpToInfluence.get(srpId);
      if ((producerInfluenceId != null)) {
        UpstreamDistanceAnalyzer.PairNode _pairNode = new UpstreamDistanceAnalyzer.PairNode(producerInfluenceId, 0);
        worklist.add(_pairNode);
      }
      while ((!worklist.isEmpty())) {
        {
          final UpstreamDistanceAnalyzer.PairNode current = worklist.removeFirst();
          final String currentInfluenceId = current.nodeId;
          final int currentHops = current.hops;
          final LinkedHashSet<String> upstreamNodes = incomingAdjacency.get(currentInfluenceId);
          if ((upstreamNodes != null)) {
            for (final String upstreamNodeId : upstreamNodes) {
              {
                final int nextHops = (currentHops + 1);
                boolean _startsWith = upstreamNodeId.startsWith(targetPrefix);
                if (_startsWith) {
                  final Integer previous = distances.get(upstreamNodeId);
                  if (((previous == null) || (nextHops < (previous).intValue()))) {
                    distances.put(upstreamNodeId, Integer.valueOf(nextHops));
                  }
                } else {
                  boolean _startsWith_1 = upstreamNodeId.startsWith("SR:");
                  if (_startsWith_1) {
                    boolean _contains = visitedSrps.contains(upstreamNodeId);
                    boolean _not = (!_contains);
                    if (_not) {
                      visitedSrps.add(upstreamNodeId);
                      final String upstreamProducer = srpToInfluence.get(upstreamNodeId);
                      if ((upstreamProducer != null)) {
                        UpstreamDistanceAnalyzer.PairNode _pairNode_1 = new UpstreamDistanceAnalyzer.PairNode(upstreamProducer, nextHops);
                        worklist.add(_pairNode_1);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = distances;
    }
    return _xblockexpression;
  }
}
