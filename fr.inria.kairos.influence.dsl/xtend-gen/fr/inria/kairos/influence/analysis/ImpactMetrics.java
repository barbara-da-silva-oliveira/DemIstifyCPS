package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.analysis.GraphBuilder;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class ImpactMetrics {
  public static class Result {
    public final Map<String, Integer> impactArtifacts;

    public final Map<String, Integer> impactEnvFactors;

    public final Map<String, Integer> sensRequirements;

    public final Map<String, Double> impactArtifactsW;

    public final Map<String, Double> impactEnvFactorsW;

    public final Map<String, Double> sensRequirementsW;

    public final Map<String, Integer> impactArtifactsPropagated;

    public final Map<String, Integer> impactArtifactsIndirect;

    public final Map<String, Double> impactArtifactsPropagatedW;

    public final Map<String, Integer> impactEnvFactorsPropagated;

    public final Map<String, Integer> impactEnvFactorsIndirect;

    public final Map<String, Double> impactEnvFactorsPropagatedW;

    public Result(final Map<String, Integer> impactArtifacts, final Map<String, Integer> impactEnvFactors, final Map<String, Integer> sensRequirements, final Map<String, Double> impactArtifactsW, final Map<String, Double> impactEnvFactorsW, final Map<String, Double> sensRequirementsW, final Map<String, Integer> impactArtifactsPropagated, final Map<String, Integer> impactArtifactsIndirect, final Map<String, Double> impactArtifactsPropagatedW, final Map<String, Integer> impactEnvFactorsPropagated, final Map<String, Integer> impactEnvFactorsIndirect, final Map<String, Double> impactEnvFactorsPropagatedW) {
      this.impactArtifacts = impactArtifacts;
      this.impactEnvFactors = impactEnvFactors;
      this.sensRequirements = sensRequirements;
      this.impactArtifactsW = impactArtifactsW;
      this.impactEnvFactorsW = impactEnvFactorsW;
      this.sensRequirementsW = sensRequirementsW;
      this.impactArtifactsPropagated = impactArtifactsPropagated;
      this.impactArtifactsIndirect = impactArtifactsIndirect;
      this.impactArtifactsPropagatedW = impactArtifactsPropagatedW;
      this.impactEnvFactorsPropagated = impactEnvFactorsPropagated;
      this.impactEnvFactorsIndirect = impactEnvFactorsIndirect;
      this.impactEnvFactorsPropagatedW = impactEnvFactorsPropagatedW;
    }
  }

  public ImpactMetrics.Result compute(final Resource resource, final GraphBuilder.Result graphBundle) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field constrainedBy is undefined for the type SystemResponseProperty"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved");
  }

  private int countReachableInfluences(final String startNodeId, final Map<String, LinkedHashSet<String>> outEdges) {
    int _xblockexpression = (int) 0;
    {
      final HashSet<String> visited = new HashSet<String>();
      final ArrayDeque<String> q = new ArrayDeque<String>();
      final HashSet<String> influences = new HashSet<String>();
      visited.add(startNodeId);
      q.add(startNodeId);
      while ((!q.isEmpty())) {
        {
          final String cur = q.removeFirst();
          final LinkedHashSet<String> succ = outEdges.get(cur);
          if ((succ != null)) {
            for (final String n : succ) {
              boolean _add = visited.add(n);
              if (_add) {
                boolean _startsWith = n.startsWith("I:");
                if (_startsWith) {
                  influences.add(n);
                }
                q.add(n);
              }
            }
          }
        }
      }
      _xblockexpression = influences.size();
    }
    return _xblockexpression;
  }

  private double sumPathWeightedInfluences(final String startNodeId, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, Double> partToInfWeight, final Map<String, Double> influenceWeight) {
    double _xblockexpression = (double) 0;
    {
      final HashMap<String, Double> best = new HashMap<String, Double>();
      final ArrayDeque<String> q = new ArrayDeque<String>();
      best.put(startNodeId, Double.valueOf(0d));
      q.add(startNodeId);
      while ((!q.isEmpty())) {
        {
          final String cur = q.removeFirst();
          final Double curScore = best.getOrDefault(cur, Double.valueOf(0d));
          final LinkedHashSet<String> succ = outEdges.get(cur);
          if ((succ != null)) {
            for (final String n : succ) {
              {
                double add = 0d;
                if (((cur.startsWith("A:") || cur.startsWith("E:")) && n.startsWith("I:"))) {
                  final String key = ((cur + "->") + n);
                  add = (partToInfWeight.getOrDefault(key, Double.valueOf(1.0))).doubleValue();
                } else {
                  if ((cur.startsWith("S:") && n.startsWith("I:"))) {
                    add = (influenceWeight.getOrDefault(n, Double.valueOf(0d))).doubleValue();
                  }
                }
                final double newScore = ((curScore).doubleValue() + add);
                Double _orDefault = best.getOrDefault(n, Double.valueOf(Double.NEGATIVE_INFINITY));
                boolean _greaterThan = (newScore > (_orDefault).doubleValue());
                if (_greaterThan) {
                  best.put(n, Double.valueOf(newScore));
                  q.add(n);
                }
              }
            }
          }
        }
      }
      double total = 0d;
      Set<Map.Entry<String, Double>> _entrySet = best.entrySet();
      for (final Map.Entry<String, Double> e : _entrySet) {
        boolean _startsWith = e.getKey().startsWith("I:");
        if (_startsWith) {
          double _tal = total;
          Double _value = e.getValue();
          total = (_tal + (_value).doubleValue());
        }
      }
      _xblockexpression = total;
    }
    return _xblockexpression;
  }
}
