package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

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
    ImpactMetrics.Result _xblockexpression = null;
    {
      final HashMap<String, Integer> impactArtifacts = new HashMap<String, Integer>();
      final HashMap<String, Integer> impactEnvFactors = new HashMap<String, Integer>();
      final HashMap<String, Integer> sensRequirements = new HashMap<String, Integer>();
      final HashMap<String, Double> partToInfWeight = new HashMap<String, Double>();
      final HashMap<String, Double> influenceWeight = new HashMap<String, Double>();
      final HashMap<String, Double> impactArtifactsW = new HashMap<String, Double>();
      final HashMap<String, Double> impactEnvFactorsW = new HashMap<String, Double>();
      final HashMap<String, Double> sensRequirementsW = new HashMap<String, Double>();
      final TreeIterator<EObject> it = resource.getAllContents();
      while (it.hasNext()) {
        {
          final EObject o = it.next();
          if ((o instanceof Influence)) {
            final Influence inf = ((Influence) o);
            final HashSet<String> seenA = new HashSet<String>();
            final HashSet<String> seenE = new HashSet<String>();
            final HashSet<String> seenR = new HashSet<String>();
            final HashMap<String, Double> wA = new HashMap<String, Double>();
            final HashMap<String, Double> wE = new HashMap<String, Double>();
            double sumIW = 0.0;
            EList<Participant> _ownedParticipants = inf.getOwnedParticipants();
            for (final Participant p : _ownedParticipants) {
              if ((p instanceof ArtifactParticipant)) {
                final ArtifactParticipant ap = ((ArtifactParticipant) p);
                final DesignArtifact a = ap.getTarget();
                if (((a != null) && (a.getName() != null))) {
                  seenA.add(a.getName());
                  double _xifexpression = (double) 0;
                  double _confidence = ap.getConfidence();
                  boolean _equals = (_confidence == 0.0);
                  if (_equals) {
                    _xifexpression = 1.0;
                  } else {
                    _xifexpression = ap.getConfidence();
                  }
                  final double w = _xifexpression;
                  String _name = a.getName();
                  Double _orDefault = wA.getOrDefault(a.getName(), Double.valueOf(0d));
                  double _plus = ((_orDefault).doubleValue() + w);
                  wA.put(_name, Double.valueOf(_plus));
                  String _name_1 = a.getName();
                  String _plus_1 = ("A:" + _name_1);
                  String _plus_2 = (_plus_1 + "->I:");
                  String _name_2 = inf.getName();
                  String _plus_3 = (_plus_2 + _name_2);
                  partToInfWeight.put(_plus_3, Double.valueOf(w));
                  double _sumIW = sumIW;
                  sumIW = (_sumIW + w);
                }
              } else {
                if ((p instanceof EnvironmentalFactorParticipant)) {
                  final EnvironmentalFactorParticipant ep = ((EnvironmentalFactorParticipant) p);
                  final EnvironmentalFactor e = ep.getTarget();
                  if (((e != null) && (e.getName() != null))) {
                    seenE.add(e.getName());
                    double _xifexpression_1 = (double) 0;
                    double _confidence_1 = ep.getConfidence();
                    boolean _equals_1 = (_confidence_1 == 0.0);
                    if (_equals_1) {
                      _xifexpression_1 = 1.0;
                    } else {
                      _xifexpression_1 = ep.getConfidence();
                    }
                    final double w_1 = _xifexpression_1;
                    String _name_3 = e.getName();
                    Double _orDefault_1 = wE.getOrDefault(e.getName(), Double.valueOf(0d));
                    double _plus_4 = ((_orDefault_1).doubleValue() + w_1);
                    wE.put(_name_3, Double.valueOf(_plus_4));
                    String _name_4 = e.getName();
                    String _plus_5 = ("E:" + _name_4);
                    String _plus_6 = (_plus_5 + "->I:");
                    String _name_5 = inf.getName();
                    String _plus_7 = (_plus_6 + _name_5);
                    partToInfWeight.put(_plus_7, Double.valueOf(w_1));
                    double _sumIW_1 = sumIW;
                    sumIW = (_sumIW_1 + w_1);
                  }
                } else {
                  if ((p instanceof SRPInputParticipant)) {
                  }
                }
              }
            }
            String _name_6 = inf.getName();
            String _plus_8 = ("I:" + _name_6);
            influenceWeight.put(_plus_8, Double.valueOf(sumIW));
            final SystemResponseProperty sr = inf.getOutputSRP();
            if ((sr != null)) {
              EList<Requirement> _constrainedBy = sr.getConstrainedBy();
              for (final Requirement r : _constrainedBy) {
                if (((r != null) && (r.getName() != null))) {
                  seenR.add(r.getName());
                }
              }
            }
            for (final String k : seenA) {
              Integer _orDefault_2 = impactArtifacts.getOrDefault(k, Integer.valueOf(0));
              int _plus_9 = ((_orDefault_2).intValue() + 1);
              impactArtifacts.put(k, Integer.valueOf(_plus_9));
            }
            for (final String k_1 : seenE) {
              Integer _orDefault_3 = impactEnvFactors.getOrDefault(k_1, Integer.valueOf(0));
              int _plus_10 = ((_orDefault_3).intValue() + 1);
              impactEnvFactors.put(k_1, Integer.valueOf(_plus_10));
            }
            for (final String k_2 : seenR) {
              Integer _orDefault_4 = sensRequirements.getOrDefault(k_2, Integer.valueOf(0));
              int _plus_11 = ((_orDefault_4).intValue() + 1);
              sensRequirements.put(k_2, Integer.valueOf(_plus_11));
            }
            Set<Map.Entry<String, Double>> _entrySet = wA.entrySet();
            for (final Map.Entry<String, Double> e_1 : _entrySet) {
              String _key = e_1.getKey();
              Double _orDefault_5 = impactArtifactsW.getOrDefault(e_1.getKey(), Double.valueOf(0d));
              Double _value = e_1.getValue();
              double _plus_12 = DoubleExtensions.operator_plus(_orDefault_5, _value);
              impactArtifactsW.put(_key, Double.valueOf(_plus_12));
            }
            Set<Map.Entry<String, Double>> _entrySet_1 = wE.entrySet();
            for (final Map.Entry<String, Double> e_2 : _entrySet_1) {
              String _key_1 = e_2.getKey();
              Double _orDefault_6 = impactEnvFactorsW.getOrDefault(e_2.getKey(), Double.valueOf(0d));
              Double _value_1 = e_2.getValue();
              double _plus_13 = DoubleExtensions.operator_plus(_orDefault_6, _value_1);
              impactEnvFactorsW.put(_key_1, Double.valueOf(_plus_13));
            }
          }
        }
      }
      final LinkedHashSet<String> allArtifacts = new LinkedHashSet<String>();
      final TreeIterator<EObject> it2 = resource.getAllContents();
      while (it2.hasNext()) {
        {
          final EObject any = it2.next();
          if ((any instanceof DesignArtifact)) {
            final DesignArtifact da = ((DesignArtifact) any);
            String _name = da.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              allArtifacts.add(da.getName());
            }
          }
        }
      }
      final LinkedHashSet<String> allEnvFactors = new LinkedHashSet<String>();
      final TreeIterator<EObject> it3 = resource.getAllContents();
      while (it3.hasNext()) {
        {
          final EObject any2 = it3.next();
          if ((any2 instanceof EnvironmentalFactor)) {
            final EnvironmentalFactor ef = ((EnvironmentalFactor) any2);
            String _name = ef.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              allEnvFactors.add(ef.getName());
            }
          }
        }
      }
      final HashMap<String, Integer> impactArtifactsPropagated = new HashMap<String, Integer>();
      for (final String aName : allArtifacts) {
        {
          final String startNodeId = ("A:" + aName);
          final int count = this.countReachableInfluences(startNodeId, graphBundle.outEdges);
          impactArtifactsPropagated.put(aName, Integer.valueOf(count));
        }
      }
      final HashMap<String, Double> impactArtifactsPropagatedW = new HashMap<String, Double>();
      for (final String aName_1 : allArtifacts) {
        {
          final String startNodeId = ("A:" + aName_1);
          final double wsum = this.sumPathWeightedInfluences(startNodeId, 
            graphBundle.outEdges, partToInfWeight, influenceWeight);
          impactArtifactsPropagatedW.put(aName_1, Double.valueOf(wsum));
        }
      }
      final HashMap<String, Integer> impactEnvFactorsPropagated = new HashMap<String, Integer>();
      for (final String eName : allEnvFactors) {
        {
          final String startNodeId = ("E:" + eName);
          final int count = this.countReachableInfluences(startNodeId, graphBundle.outEdges);
          impactEnvFactorsPropagated.put(eName, Integer.valueOf(count));
        }
      }
      final HashMap<String, Double> impactEnvFactorsPropagatedW = new HashMap<String, Double>();
      for (final String eName_1 : allEnvFactors) {
        {
          final String startNodeId = ("E:" + eName_1);
          final double wsum = this.sumPathWeightedInfluences(startNodeId, 
            graphBundle.outEdges, partToInfWeight, influenceWeight);
          impactEnvFactorsPropagatedW.put(eName_1, Double.valueOf(wsum));
        }
      }
      final HashMap<String, Integer> impactArtifactsIndirect = new HashMap<String, Integer>();
      Set<Map.Entry<String, Integer>> _entrySet = impactArtifactsPropagated.entrySet();
      for (final Map.Entry<String, Integer> e : _entrySet) {
        {
          final Integer direct = impactArtifacts.getOrDefault(e.getKey(), Integer.valueOf(0));
          Integer _value = e.getValue();
          final int only = ((_value).intValue() - (direct).intValue());
          String _key = e.getKey();
          int _xifexpression = (int) 0;
          if ((only > 0)) {
            _xifexpression = only;
          } else {
            _xifexpression = 0;
          }
          impactArtifactsIndirect.put(_key, Integer.valueOf(_xifexpression));
        }
      }
      final HashMap<String, Integer> impactEnvFactorsIndirect = new HashMap<String, Integer>();
      Set<Map.Entry<String, Integer>> _entrySet_1 = impactEnvFactorsPropagated.entrySet();
      for (final Map.Entry<String, Integer> e_1 : _entrySet_1) {
        {
          final Integer direct = impactEnvFactors.getOrDefault(e_1.getKey(), Integer.valueOf(0));
          Integer _value = e_1.getValue();
          final int only = ((_value).intValue() - (direct).intValue());
          String _key = e_1.getKey();
          int _xifexpression = (int) 0;
          if ((only > 0)) {
            _xifexpression = only;
          } else {
            _xifexpression = 0;
          }
          impactEnvFactorsIndirect.put(_key, Integer.valueOf(_xifexpression));
        }
      }
      _xblockexpression = new ImpactMetrics.Result(impactArtifacts, impactEnvFactors, sensRequirements, impactArtifactsW, impactEnvFactorsW, sensRequirementsW, impactArtifactsPropagated, impactArtifactsIndirect, impactArtifactsPropagatedW, impactEnvFactorsPropagated, impactEnvFactorsIndirect, impactEnvFactorsPropagatedW);
    }
    return _xblockexpression;
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
