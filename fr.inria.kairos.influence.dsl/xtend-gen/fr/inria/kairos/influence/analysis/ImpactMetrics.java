package fr.inria.kairos.influence.analysis;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

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

  private static final double DEFAULT_IMPACT_WEIGHT = 1.0;

  private static final double MISSING_CONTRIBUTION_WEIGHT = 0.0;

  public ImpactMetrics.Result compute(final Resource resource, final GraphBuilder.Result graphBundle) {
    ImpactMetrics.Result _xblockexpression = null;
    {
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      final InfluenceModel modelRoot = ((InfluenceModel) _head);
      final HashMap<String, Integer> impactArtifacts = new HashMap<String, Integer>();
      final HashMap<String, Integer> impactEnvFactors = new HashMap<String, Integer>();
      final HashMap<String, Integer> sensRequirements = new HashMap<String, Integer>();
      final HashMap<String, Double> impactArtifactsW = new HashMap<String, Double>();
      final HashMap<String, Double> impactEnvFactorsW = new HashMap<String, Double>();
      final HashMap<String, Double> sensRequirementsW = new HashMap<String, Double>();
      final HashMap<String, Double> edgeImpactWeights = new HashMap<String, Double>();
      Iterable<Influence> _filter = Iterables.<Influence>filter(modelRoot.getOwnedInfluences(), Influence.class);
      for (final Influence inf : _filter) {
        {
          final HashSet<String> seenArtifacts = new HashSet<String>();
          final HashSet<String> seenEnvFactors = new HashSet<String>();
          final HashSet<String> seenRequirements = new HashSet<String>();
          final HashMap<String, Double> directArtifactWeights = new HashMap<String, Double>();
          final HashMap<String, Double> directEnvWeights = new HashMap<String, Double>();
          double influenceIncomingImpact = 0.0;
          EList<Participant> _ownedParticipants = inf.getOwnedParticipants();
          for (final Participant p : _ownedParticipants) {
            {
              final double participantWeight = this.participantImpactWeight(inf, p);
              double _influenceIncomingImpact = influenceIncomingImpact;
              influenceIncomingImpact = (_influenceIncomingImpact + participantWeight);
              boolean _matched = false;
              if (p instanceof ArtifactParticipant) {
                _matched=true;
                final DesignArtifact artifact = ((ArtifactParticipant)p).getTarget();
                if (((artifact != null) && (artifact.getName() != null))) {
                  final String artifactName = artifact.getName();
                  final String artifactNode = ("A:" + artifactName);
                  String _name = inf.getName();
                  final String influenceNode = ("I:" + _name);
                  seenArtifacts.add(artifactName);
                  this.addDouble(directArtifactWeights, artifactName, participantWeight);
                  edgeImpactWeights.put(this.edgeKey(artifactNode, influenceNode), Double.valueOf(participantWeight));
                }
              }
              if (!_matched) {
                if (p instanceof EnvironmentalFactorParticipant) {
                  _matched=true;
                  final EnvironmentalFactor env = ((EnvironmentalFactorParticipant)p).getTarget();
                  if (((env != null) && (env.getName() != null))) {
                    final String envName = env.getName();
                    final String envNode = ("E:" + envName);
                    String _name = inf.getName();
                    final String influenceNode = ("I:" + _name);
                    seenEnvFactors.add(envName);
                    this.addDouble(directEnvWeights, envName, participantWeight);
                    edgeImpactWeights.put(this.edgeKey(envNode, influenceNode), Double.valueOf(participantWeight));
                  }
                }
              }
              if (!_matched) {
                if (p instanceof SRPInputParticipant) {
                  _matched=true;
                  final SystemResponseProperty srp = ((SRPInputParticipant)p).getTarget();
                  if (((srp != null) && (srp.getName() != null))) {
                    String _name = srp.getName();
                    final String srpNode = ("SR:" + _name);
                    String _name_1 = inf.getName();
                    final String influenceNode = ("I:" + _name_1);
                    edgeImpactWeights.put(this.edgeKey(srpNode, influenceNode), Double.valueOf(participantWeight));
                  }
                }
              }
            }
          }
          final SystemResponseProperty output = inf.getOutputSRP();
          if ((output != null)) {
            Iterable<SatisfactionCriterion> _criteriaForSrp = this.criteriaForSrp(resource, output);
            for (final SatisfactionCriterion criterion : _criteriaForSrp) {
              {
                final String requirementName = this.requirementLabel(this.requirementRefOf(criterion));
                if ((requirementName != null)) {
                  seenRequirements.add(requirementName);
                }
              }
            }
          }
          for (final String artifactName : seenArtifacts) {
            Integer _orDefault = impactArtifacts.getOrDefault(artifactName, Integer.valueOf(0));
            int _plus = ((_orDefault).intValue() + 1);
            impactArtifacts.put(artifactName, Integer.valueOf(_plus));
          }
          for (final String envName : seenEnvFactors) {
            Integer _orDefault_1 = impactEnvFactors.getOrDefault(envName, Integer.valueOf(0));
            int _plus_1 = ((_orDefault_1).intValue() + 1);
            impactEnvFactors.put(envName, Integer.valueOf(_plus_1));
          }
          for (final String requirementName : seenRequirements) {
            Integer _orDefault_2 = sensRequirements.getOrDefault(requirementName, Integer.valueOf(0));
            int _plus_2 = ((_orDefault_2).intValue() + 1);
            sensRequirements.put(requirementName, Integer.valueOf(_plus_2));
          }
          Set<Map.Entry<String, Double>> _entrySet = directArtifactWeights.entrySet();
          for (final Map.Entry<String, Double> entry : _entrySet) {
            this.addDouble(impactArtifactsW, entry.getKey(), (entry.getValue()).doubleValue());
          }
          Set<Map.Entry<String, Double>> _entrySet_1 = directEnvWeights.entrySet();
          for (final Map.Entry<String, Double> entry_1 : _entrySet_1) {
            this.addDouble(impactEnvFactorsW, entry_1.getKey(), (entry_1.getValue()).doubleValue());
          }
          for (final String requirementName_1 : seenRequirements) {
            this.addDouble(sensRequirementsW, requirementName_1, influenceIncomingImpact);
          }
        }
      }
      final LinkedHashSet<String> allArtifacts = this.collectAllArtifacts(modelRoot);
      final LinkedHashSet<String> allEnvFactors = this.collectAllEnvironmentalFactors(modelRoot);
      final HashMap<String, Integer> impactArtifactsPropagated = new HashMap<String, Integer>();
      for (final String artifactName : allArtifacts) {
        {
          final String startNodeId = ("A:" + artifactName);
          final int count = this.countReachableInfluences(startNodeId, graphBundle.outEdges);
          impactArtifactsPropagated.put(artifactName, Integer.valueOf(count));
        }
      }
      final HashMap<String, Integer> impactEnvFactorsPropagated = new HashMap<String, Integer>();
      for (final String envName : allEnvFactors) {
        {
          final String startNodeId = ("E:" + envName);
          final int count = this.countReachableInfluences(startNodeId, graphBundle.outEdges);
          impactEnvFactorsPropagated.put(envName, Integer.valueOf(count));
        }
      }
      final HashMap<String, Double> impactArtifactsPropagatedW = new HashMap<String, Double>();
      for (final String artifactName_1 : allArtifacts) {
        {
          final String startNodeId = ("A:" + artifactName_1);
          final double weightedSum = this.sumBestProductWeightedInfluences(startNodeId, 
            graphBundle.outEdges, edgeImpactWeights);
          impactArtifactsPropagatedW.put(artifactName_1, Double.valueOf(weightedSum));
        }
      }
      final HashMap<String, Double> impactEnvFactorsPropagatedW = new HashMap<String, Double>();
      for (final String envName_1 : allEnvFactors) {
        {
          final String startNodeId = ("E:" + envName_1);
          final double weightedSum = this.sumBestProductWeightedInfluences(startNodeId, 
            graphBundle.outEdges, edgeImpactWeights);
          impactEnvFactorsPropagatedW.put(envName_1, Double.valueOf(weightedSum));
        }
      }
      final HashMap<String, Integer> impactArtifactsIndirect = new HashMap<String, Integer>();
      Set<Map.Entry<String, Integer>> _entrySet = impactArtifactsPropagated.entrySet();
      for (final Map.Entry<String, Integer> entry : _entrySet) {
        {
          final Integer direct = impactArtifacts.getOrDefault(entry.getKey(), Integer.valueOf(0));
          Integer _value = entry.getValue();
          final int indirectOnly = ((_value).intValue() - (direct).intValue());
          String _key = entry.getKey();
          int _xifexpression = (int) 0;
          if ((indirectOnly > 0)) {
            _xifexpression = indirectOnly;
          } else {
            _xifexpression = 0;
          }
          impactArtifactsIndirect.put(_key, Integer.valueOf(_xifexpression));
        }
      }
      final HashMap<String, Integer> impactEnvFactorsIndirect = new HashMap<String, Integer>();
      Set<Map.Entry<String, Integer>> _entrySet_1 = impactEnvFactorsPropagated.entrySet();
      for (final Map.Entry<String, Integer> entry_1 : _entrySet_1) {
        {
          final Integer direct = impactEnvFactors.getOrDefault(entry_1.getKey(), Integer.valueOf(0));
          Integer _value = entry_1.getValue();
          final int indirectOnly = ((_value).intValue() - (direct).intValue());
          String _key = entry_1.getKey();
          int _xifexpression = (int) 0;
          if ((indirectOnly > 0)) {
            _xifexpression = indirectOnly;
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

  private LinkedHashSet<String> collectAllArtifacts(final InfluenceModel modelRoot) {
    LinkedHashSet<String> _xblockexpression = null;
    {
      final LinkedHashSet<String> allArtifacts = new LinkedHashSet<String>();
      EList<DesignArtifact> _ownedArtifacts = modelRoot.getOwnedArtifacts();
      for (final DesignArtifact artifact : _ownedArtifacts) {
        if (((artifact instanceof DesignArtifact) && (artifact.getName() != null))) {
          allArtifacts.add(artifact.getName());
        }
      }
      _xblockexpression = allArtifacts;
    }
    return _xblockexpression;
  }

  private LinkedHashSet<String> collectAllEnvironmentalFactors(final InfluenceModel modelRoot) {
    LinkedHashSet<String> _xblockexpression = null;
    {
      final LinkedHashSet<String> allEnvFactors = new LinkedHashSet<String>();
      EList<EnvironmentalFactor> _ownedEnvironmentalFactors = modelRoot.getOwnedEnvironmentalFactors();
      for (final EnvironmentalFactor env : _ownedEnvironmentalFactors) {
        if (((env instanceof EnvironmentalFactor) && (env.getName() != null))) {
          allEnvFactors.add(env.getName());
        }
      }
      _xblockexpression = allEnvFactors;
    }
    return _xblockexpression;
  }

  private double participantImpactWeight(final Influence influence, final Participant participant) {
    double _xblockexpression = (double) 0;
    {
      final ParticipantImpactFunction impactFunction = this.bestParticipantImpactFunction(influence);
      if ((impactFunction == null)) {
        return ImpactMetrics.DEFAULT_IMPACT_WEIGHT;
      }
      final Function1<ParticipantRelativeImpact, Boolean> _function = (ParticipantRelativeImpact c) -> {
        Participant _participant = c.getParticipant();
        return Boolean.valueOf((_participant == participant));
      };
      final ParticipantRelativeImpact contribution = IterableExtensions.<ParticipantRelativeImpact>findFirst(this.participantContributions(impactFunction), _function);
      if ((contribution == null)) {
        return ImpactMetrics.MISSING_CONTRIBUTION_WEIGHT;
      }
      _xblockexpression = this.sanitizeWeight(contribution.getImportance());
    }
    return _xblockexpression;
  }

  private ParticipantImpactFunction bestParticipantImpactFunction(final Influence influence) {
    ParticipantImpactFunction _xblockexpression = null;
    {
      final InfluenceFunction function = influence.getOwnedInfluenceFunction();
      if (((function == null) || (function.getRepresentations() == null))) {
        return null;
      }
      final List<ParticipantImpactFunction> impactFunctions = IterableExtensions.<ParticipantImpactFunction>toList(Iterables.<ParticipantImpactFunction>filter(function.getRepresentations(), ParticipantImpactFunction.class));
      boolean _isEmpty = impactFunctions.isEmpty();
      if (_isEmpty) {
        return null;
      }
      final Comparator<ParticipantImpactFunction> _function = (ParticipantImpactFunction a, ParticipantImpactFunction b) -> {
        return Double.compare(b.getConfidence(), a.getConfidence());
      };
      impactFunctions.sort(_function);
      _xblockexpression = IterableExtensions.<ParticipantImpactFunction>head(impactFunctions);
    }
    return _xblockexpression;
  }

  /**
   * Helpers
   */
  private List<ParticipantRelativeImpact> participantContributions(final ParticipantImpactFunction function) {
    ArrayList<ParticipantRelativeImpact> _xblockexpression = null;
    {
      final ArrayList<ParticipantRelativeImpact> result = new ArrayList<ParticipantRelativeImpact>();
      if ((function == null)) {
        return result;
      }
      final EStructuralFeature feature = function.eClass().getEStructuralFeature("participantContribution");
      if (((feature == null) || (!function.eIsSet(feature)))) {
        return result;
      }
      final Object value = function.eGet(feature);
      if ((value instanceof Collection<?>)) {
        for (final Object item : ((Collection<?>) value)) {
          if ((item instanceof ParticipantRelativeImpact)) {
            result.add(((ParticipantRelativeImpact) item));
          }
        }
      } else {
        if ((value instanceof ParticipantRelativeImpact)) {
          result.add(((ParticipantRelativeImpact) value));
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }

  private double sanitizeWeight(final double rawWeight) {
    double _xblockexpression = (double) 0;
    {
      boolean _isNaN = Double.isNaN(rawWeight);
      if (_isNaN) {
        return ImpactMetrics.DEFAULT_IMPACT_WEIGHT;
      }
      if ((rawWeight < 0.0)) {
        return 0.0;
      }
      if ((rawWeight > 1.0)) {
        return 1.0;
      }
      _xblockexpression = rawWeight;
    }
    return _xblockexpression;
  }

  private Iterable<SatisfactionCriterion> criteriaForSrp(final Resource resource, final SystemResponseProperty srp) {
    final Function1<SatisfactionCriterion, Boolean> _function = (SatisfactionCriterion criterion) -> {
      return Boolean.valueOf(this.criterionConstrainsSrp(criterion, srp));
    };
    return IterableExtensions.<SatisfactionCriterion>filter(Iterables.<SatisfactionCriterion>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), SatisfactionCriterion.class), _function);
  }

  private boolean criterionConstrainsSrp(final SatisfactionCriterion criterion, final SystemResponseProperty srp) {
    boolean _xblockexpression = false;
    {
      if (((criterion == null) || (srp == null))) {
        return false;
      }
      final EStructuralFeature feature = criterion.eClass().getEStructuralFeature("constrainedSRPs");
      if (((feature == null) || (!criterion.eIsSet(feature)))) {
        return false;
      }
      final Object value = criterion.eGet(feature);
      if ((value instanceof Collection<?>)) {
        return ((Collection<?>) value).contains(srp);
      }
      _xblockexpression = (value == srp);
    }
    return _xblockexpression;
  }

  /**
   * requirementRef is an EObject reference.
   */
  private EObject requirementRefOf(final SatisfactionCriterion criterion) {
    Object _xblockexpression = null;
    {
      if ((criterion == null)) {
        return null;
      }
      final EStructuralFeature feature = criterion.eClass().getEStructuralFeature("requirementRef");
      if (((feature == null) || (!criterion.eIsSet(feature)))) {
        return null;
      }
      final Object value = criterion.eGet(feature);
      if ((value instanceof EObject)) {
        return ((EObject) value);
      }
      if ((value instanceof Collection<?>)) {
        for (final Object item : ((Collection<?>) value)) {
          if ((item instanceof EObject)) {
            return ((EObject) item);
          }
        }
      }
      _xblockexpression = null;
    }
    return ((EObject)_xblockexpression);
  }

  private String requirementLabel(final EObject requirementRef) {
    String _xblockexpression = null;
    {
      if ((requirementRef == null)) {
        return "<unknown-requirement>";
      }
      final EStructuralFeature nameFeature = requirementRef.eClass().getEStructuralFeature("name");
      if ((nameFeature != null)) {
        final Object value = requirementRef.eGet(nameFeature);
        if ((value != null)) {
          return String.valueOf(value);
        }
      }
      final URI uri = EcoreUtil.getURI(requirementRef);
      if ((uri != null)) {
        return uri.toString();
      }
      _xblockexpression = requirementRef.toString();
    }
    return _xblockexpression;
  }

  private int countReachableInfluences(final String startNodeId, final Map<String, LinkedHashSet<String>> outEdges) {
    int _xblockexpression = (int) 0;
    {
      final HashSet<String> visited = new HashSet<String>();
      final ArrayDeque<String> queue = new ArrayDeque<String>();
      final HashSet<String> influences = new HashSet<String>();
      visited.add(startNodeId);
      queue.add(startNodeId);
      while ((!queue.isEmpty())) {
        {
          final String current = queue.removeFirst();
          final LinkedHashSet<String> successors = outEdges.get(current);
          if ((successors != null)) {
            for (final String next : successors) {
              boolean _add = visited.add(next);
              if (_add) {
                boolean _startsWith = next.startsWith("I:");
                if (_startsWith) {
                  influences.add(next);
                }
                queue.add(next);
              }
            }
          }
        }
      }
      _xblockexpression = influences.size();
    }
    return _xblockexpression;
  }

  /**
   * Propagated weighted impact.
   * 
   * Uses product along paths:
   *   A -> I1 weight 0.7
   *   I1 -> SR1 weight 1.0
   *   SR1 -> I2 weight 0.4
   * 
   * Score reaching I2 = 0.7 * 1.0 * 0.4 = 0.28
   * 
   * For each node, we keep the best product score found so far.
   */
  private double sumBestProductWeightedInfluences(final String startNodeId, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, Double> edgeImpactWeights) {
    double _xblockexpression = (double) 0;
    {
      final HashMap<String, Double> best = new HashMap<String, Double>();
      final ArrayDeque<String> queue = new ArrayDeque<String>();
      best.put(startNodeId, Double.valueOf(1.0));
      queue.add(startNodeId);
      while ((!queue.isEmpty())) {
        {
          final String current = queue.removeFirst();
          final Double currentScore = best.getOrDefault(current, Double.valueOf(0.0));
          final LinkedHashSet<String> successors = outEdges.get(current);
          if ((successors != null)) {
            for (final String next : successors) {
              {
                final double edgeWeight = this.weightForEdge(current, next, edgeImpactWeights);
                final double newScore = ((currentScore).doubleValue() * edgeWeight);
                Double _orDefault = best.getOrDefault(next, Double.valueOf(Double.NEGATIVE_INFINITY));
                boolean _greaterThan = (newScore > (_orDefault).doubleValue());
                if (_greaterThan) {
                  best.put(next, Double.valueOf(newScore));
                  queue.add(next);
                }
              }
            }
          }
        }
      }
      double total = 0.0;
      Set<Map.Entry<String, Double>> _entrySet = best.entrySet();
      for (final Map.Entry<String, Double> entry : _entrySet) {
        boolean _startsWith = entry.getKey().startsWith("I:");
        if (_startsWith) {
          double _tal = total;
          Double _value = entry.getValue();
          total = (_tal + (_value).doubleValue());
        }
      }
      _xblockexpression = total;
    }
    return _xblockexpression;
  }

  private double weightForEdge(final String from, final String to, final Map<String, Double> edgeImpactWeights) {
    double _xblockexpression = (double) 0;
    {
      final Double explicit = edgeImpactWeights.get(this.edgeKey(from, to));
      if ((explicit != null)) {
        return this.sanitizeWeight((explicit).doubleValue());
      }
      _xblockexpression = 1.0;
    }
    return _xblockexpression;
  }

  private String edgeKey(final String from, final String to) {
    return ((from + "->") + to);
  }

  private void addDouble(final Map<String, Double> map, final String key, final double value) {
    Double _orDefault = map.getOrDefault(key, Double.valueOf(0.0));
    double _plus = ((_orDefault).doubleValue() + value);
    map.put(key, Double.valueOf(_plus));
  }
}
