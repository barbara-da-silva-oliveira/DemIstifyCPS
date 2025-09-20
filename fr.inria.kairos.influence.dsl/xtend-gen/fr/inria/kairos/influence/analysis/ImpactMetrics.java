package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.MetadataUtil;
import fr.inria.kairos.influence.generator.InfluenceDSLGenerator;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponse;
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

    public final Map<String, Integer> impactPhenomena;

    public final Map<String, Integer> sensRequirements;

    public final Map<String, Double> impactArtifactsW;

    public final Map<String, Double> impactPhenomenaW;

    public final Map<String, Double> sensRequirementsW;

    public final Map<String, Integer> impactArtifactsPropagated;

    public final Map<String, Integer> impactArtifactsIndirect;

    public Result(final Map<String, Integer> impactArtifacts, final Map<String, Integer> impactPhenomena, final Map<String, Integer> sensRequirements, final Map<String, Double> impactArtifactsW, final Map<String, Double> impactPhenomenaW, final Map<String, Double> sensRequirementsW, final Map<String, Integer> impactArtifactsPropagated, final Map<String, Integer> impactArtifactsIndirect) {
      this.impactArtifacts = impactArtifacts;
      this.impactPhenomena = impactPhenomena;
      this.sensRequirements = sensRequirements;
      this.impactArtifactsW = impactArtifactsW;
      this.impactPhenomenaW = impactPhenomenaW;
      this.sensRequirementsW = sensRequirementsW;
      this.impactArtifactsPropagated = impactArtifactsPropagated;
      this.impactArtifactsIndirect = impactArtifactsIndirect;
    }
  }

  public ImpactMetrics.Result compute(final Resource resource) {
    ImpactMetrics.Result _xblockexpression = null;
    {
      final HashMap<String, Integer> impactArtifacts = new HashMap<String, Integer>();
      final HashMap<String, Integer> impactPhenomena = new HashMap<String, Integer>();
      final HashMap<String, Integer> sensRequirements = new HashMap<String, Integer>();
      final HashMap<String, Double> impactArtifactsW = new HashMap<String, Double>();
      final HashMap<String, Double> impactPhenomenaW = new HashMap<String, Double>();
      final HashMap<String, Double> sensRequirementsW = new HashMap<String, Double>();
      final TreeIterator<EObject> it = resource.getAllContents();
      while (it.hasNext()) {
        {
          final EObject o = it.next();
          if ((o instanceof Influence)) {
            final Influence inf = ((Influence) o);
            final MetadataUtil.PerElement L = MetadataUtil.parsePerElement(inf.getLikelihoodPerElement());
            final HashSet<String> seenA = new HashSet<String>();
            final HashSet<String> seenP = new HashSet<String>();
            final HashSet<String> seenR = new HashSet<String>();
            EList<DesignArtifact> _originatorArtifact = inf.getOriginatorArtifact();
            for (final DesignArtifact a : _originatorArtifact) {
              if (((a != null) && (a.getName() != null))) {
                seenA.add(a.getName());
              }
            }
            EList<PhysicalPhenomena> _originatorPhenomena = inf.getOriginatorPhenomena();
            for (final PhysicalPhenomena p : _originatorPhenomena) {
              if (((p != null) && (p.getName() != null))) {
                seenP.add(p.getName());
              }
            }
            EList<SystemResponse> _affects = inf.getAffects();
            for (final SystemResponse sr : _affects) {
              EList<Requirement> _usedIn = sr.getUsedIn();
              for (final Requirement r : _usedIn) {
                if (((r != null) && (r.getName() != null))) {
                  seenR.add(r.getName());
                }
              }
            }
            for (final String k : seenA) {
              Integer _orDefault = impactArtifacts.getOrDefault(k, Integer.valueOf(0));
              int _plus = ((_orDefault).intValue() + 1);
              impactArtifacts.put(k, Integer.valueOf(_plus));
            }
            for (final String k_1 : seenP) {
              Integer _orDefault_1 = impactPhenomena.getOrDefault(k_1, Integer.valueOf(0));
              int _plus_1 = ((_orDefault_1).intValue() + 1);
              impactPhenomena.put(k_1, Integer.valueOf(_plus_1));
            }
            for (final String k_2 : seenR) {
              Integer _orDefault_2 = sensRequirements.getOrDefault(k_2, Integer.valueOf(0));
              int _plus_2 = ((_orDefault_2).intValue() + 1);
              sensRequirements.put(k_2, Integer.valueOf(_plus_2));
            }
            EList<DesignArtifact> _originatorArtifact_1 = inf.getOriginatorArtifact();
            for (final DesignArtifact a_1 : _originatorArtifact_1) {
              boolean _and = false;
              String _name = null;
              if (a_1!=null) {
                _name=a_1.getName();
              }
              boolean _tripleNotEquals = (_name != null);
              if (!_tripleNotEquals) {
                _and = false;
              } else {
                boolean _contains = seenA.contains(a_1.getName());
                _and = _contains;
              }
              if (_and) {
                String _name_1 = a_1.getName();
                Double _orDefault_3 = impactArtifactsW.getOrDefault(a_1.getName(), Double.valueOf(0d));
                Double _orDefault_4 = L.getArtifacts().getOrDefault(a_1.getName(), Double.valueOf(1.0));
                double _plus_3 = DoubleExtensions.operator_plus(_orDefault_3, _orDefault_4);
                impactArtifactsW.put(_name_1, Double.valueOf(_plus_3));
              }
            }
            EList<PhysicalPhenomena> _originatorPhenomena_1 = inf.getOriginatorPhenomena();
            for (final PhysicalPhenomena p_1 : _originatorPhenomena_1) {
              boolean _and_1 = false;
              String _name_2 = null;
              if (p_1!=null) {
                _name_2=p_1.getName();
              }
              boolean _tripleNotEquals_1 = (_name_2 != null);
              if (!_tripleNotEquals_1) {
                _and_1 = false;
              } else {
                boolean _contains_1 = seenP.contains(p_1.getName());
                _and_1 = _contains_1;
              }
              if (_and_1) {
                String _name_3 = p_1.getName();
                Double _orDefault_5 = impactPhenomenaW.getOrDefault(p_1.getName(), Double.valueOf(0d));
                Double _orDefault_6 = L.getPhenomena().getOrDefault(p_1.getName(), Double.valueOf(1.0));
                double _plus_4 = DoubleExtensions.operator_plus(_orDefault_5, _orDefault_6);
                impactPhenomenaW.put(_name_3, Double.valueOf(_plus_4));
              }
            }
            EList<Requirement> _relatedTo = inf.getRelatedTo();
            for (final Requirement t : _relatedTo) {
              if ((t instanceof Requirement)) {
                final Requirement r_1 = ((Requirement) t);
                if (((r_1.getName() != null) && seenR.contains(r_1.getName()))) {
                  final double pw = MetadataUtil.priorityWeight(InfluenceDSLGenerator.metadataSafe(r_1));
                  String _name_4 = r_1.getName();
                  Double _orDefault_7 = sensRequirementsW.getOrDefault(r_1.getName(), Double.valueOf(0d));
                  double _plus_5 = ((_orDefault_7).doubleValue() + pw);
                  sensRequirementsW.put(_name_4, Double.valueOf(_plus_5));
                }
              }
            }
          }
        }
      }
      final RequirementTraceability.TraceData trace = new RequirementTraceability().buildTrace(resource);
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
      final HashMap<String, Integer> impactArtifactsPropagated = new HashMap<String, Integer>();
      for (final String aName : allArtifacts) {
        {
          final String start = ("A:" + aName);
          final int count = this.countReachableInfluences(start, trace.outEdges);
          impactArtifactsPropagated.put(aName, Integer.valueOf(count));
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
      _xblockexpression = new ImpactMetrics.Result(impactArtifacts, impactPhenomena, sensRequirements, impactArtifactsW, impactPhenomenaW, sensRequirementsW, impactArtifactsPropagated, impactArtifactsIndirect);
    }
    return _xblockexpression;
  }

  private int countReachableInfluences(final String start, final Map<String, LinkedHashSet<String>> outEdges) {
    int _xblockexpression = (int) 0;
    {
      final HashSet<String> visited = new HashSet<String>();
      final ArrayDeque<String> q = new ArrayDeque<String>();
      final HashSet<String> influences = new HashSet<String>();
      visited.add(start);
      q.add(start);
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
}
