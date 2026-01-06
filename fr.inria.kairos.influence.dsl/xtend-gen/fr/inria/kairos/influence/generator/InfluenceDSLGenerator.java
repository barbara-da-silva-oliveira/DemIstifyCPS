package fr.inria.kairos.influence.generator;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.analysis.DesignValueArtifacts;
import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.analysis.ImpactMetrics;
import fr.inria.kairos.influence.analysis.InfluenceEvaluator;
import fr.inria.kairos.influence.analysis.RequirementTraceability;
import fr.inria.kairos.influence.analysis.StakeholdersOwner;
import fr.inria.kairos.influence.analysis.StructuralRequirementEvaluation;
import fr.inria.kairos.influence.export.DotExporter;
import fr.inria.kairos.influence.export.InfoExporter;
import fr.inria.kairos.influence.export.JsonExporter;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.ValueType;
import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

@SuppressWarnings("all")
public class InfluenceDSLGenerator extends AbstractGenerator {
  public static class PairNode {
    public final String nodeId;

    public final int hops;

    public PairNode(final String nodeId, final int hops) {
      this.nodeId = nodeId;
      this.hops = hops;
    }
  }

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final GraphBuilder graphBuilder = new GraphBuilder();
    final GraphBuilder.Result graphBundle = graphBuilder.build(resource);
    final DefaultDirectedGraph<String, DefaultEdge> jgraphtGraph = graphBundle.graph;
    final Map<String, String> vertexLabels = graphBundle.vertexLabels;
    final Map<DefaultEdge, String> edgeLabels = graphBundle.edgeLabels;
    final Map<String, LinkedHashSet<String>> incomingAdjacency = graphBundle.inEdges;
    final Map<String, LinkedHashSet<String>> outgoingAdjacency = graphBundle.outEdges;
    final Map<String, LinkedHashSet<String>> reqToSrpMap = graphBundle.reqToSRs;
    final Map<String, String> srpToInfluence = graphBundle.srp2inf;
    final Map<String, String> nodeToOrigin = graphBundle.nodeToOrigin;
    final Map<DefaultEdge, String> edgeToOrigin = graphBundle.edgeToOrigin;
    final Map<DefaultEdge, Double> edgeWeights = graphBundle.edgeWeights;
    final Map<String, String> nodeSourceModel = graphBundle.nodeSourceModel;
    new DotExporter().exportGraphToDot(jgraphtGraph, vertexLabels, edgeLabels, fsa, "graph/influenceHypergraph.dot");
    new DotExporter().exportGraphToDot(jgraphtGraph, vertexLabels, edgeLabels, nodeToOrigin, nodeSourceModel, edgeToOrigin, edgeWeights, fsa, "graph/influenceHypergraph_origin.dot");
    new JsonExporter().exportInfluences(resource, fsa);
    final ImpactMetrics.Result metrics = new ImpactMetrics().compute(resource, graphBundle);
    final StringBuilder reportBuilder = new StringBuilder("Metrics on the Influences:\n");
    final InfoExporter infoExporter = new InfoExporter();
    reportBuilder.append("\nImpact of Artifacts (origin count):\n");
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>(metrics.impactArtifacts);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap);
    reportBuilder.append("\nImpact of Environment Factor (origin count):\n");
    HashMap<String, Integer> _hashMap_1 = new HashMap<String, Integer>(metrics.impactEnvFactors);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_1);
    reportBuilder.append("\nImpact of Artifacts Propagated (origin count):\n");
    HashMap<String, Integer> _hashMap_2 = new HashMap<String, Integer>(metrics.impactArtifactsPropagated);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_2);
    reportBuilder.append("\nImpact of Environment Factor Propagated (origin count):\n");
    HashMap<String, Integer> _hashMap_3 = new HashMap<String, Integer>(metrics.impactEnvFactorsPropagated);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_3);
    reportBuilder.append("\nSensibility of Requirements (counts):\n");
    HashMap<String, Integer> _hashMap_4 = new HashMap<String, Integer>(metrics.sensRequirements);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_4);
    reportBuilder.append("\nImpact of Artifacts Progagated (weighted):\n");
    HashMap<String, Double> _hashMap_5 = new HashMap<String, Double>(metrics.impactArtifactsPropagatedW);
    infoExporter.appendSortedDoubleMap(reportBuilder, _hashMap_5);
    reportBuilder.append("\nImpact of Environment Factor Progagated (weighted):\n");
    HashMap<String, Double> _hashMap_6 = new HashMap<String, Double>(metrics.impactEnvFactorsPropagatedW);
    infoExporter.appendSortedDoubleMap(reportBuilder, _hashMap_6);
    reportBuilder.append("\nCandidate potential beneficial changes on participants traced per requirement:\n");
    final RequirementTraceability traceQueries = new RequirementTraceability(graphBundle);
    Set<String> _keySet = reqToSrpMap.keySet();
    TreeSet<String> _treeSet = new TreeSet<String>(_keySet);
    for (final String requirementName : _treeSet) {
      {
        final Map<String, Integer> minHopByNode = new HashMap<String, Integer>();
        final LinkedHashSet<String> srpNames = reqToSrpMap.get(requirementName);
        if ((srpNames != null)) {
          for (final String srpSimpleName : srpNames) {
            {
              final Map<String, Integer> artifactDistances = this.computeUpstreamDistancesFromSrp(
                ("SR:" + srpSimpleName), incomingAdjacency, srpToInfluence, "A:");
              Set<Map.Entry<String, Integer>> _entrySet = artifactDistances.entrySet();
              for (final Map.Entry<String, Integer> entry : _entrySet) {
                {
                  final Integer previous = minHopByNode.get(entry.getKey());
                  if (((previous == null) || (entry.getValue().compareTo(previous) < 0))) {
                    minHopByNode.put(entry.getKey(), entry.getValue());
                  } else {
                  }
                }
              }
              final Map<String, Integer> factorDistances = this.computeUpstreamDistancesFromSrp(
                ("SR:" + srpSimpleName), incomingAdjacency, srpToInfluence, "E:");
              Set<Map.Entry<String, Integer>> _entrySet_1 = factorDistances.entrySet();
              for (final Map.Entry<String, Integer> entry_1 : _entrySet_1) {
                {
                  final Integer previous = minHopByNode.get(entry_1.getKey());
                  if (((previous == null) || (entry_1.getValue().compareTo(previous) < 0))) {
                    minHopByNode.put(entry_1.getKey(), entry_1.getValue());
                  } else {
                  }
                }
              }
            }
          }
        } else {
        }
        final List<Map.Entry<String, Integer>> items = IterableExtensions.<Map.Entry<String, Integer>>toList(minHopByNode.entrySet());
        final Comparator<Map.Entry<String, Integer>> _function = (Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> {
          int _xblockexpression = (int) 0;
          {
            final int cmp = Integer.compare((a.getValue()).intValue(), (b.getValue()).intValue());
            int _xifexpression = (int) 0;
            if ((cmp != 0)) {
              _xifexpression = cmp;
            } else {
              _xifexpression = a.getKey().compareTo(b.getKey());
            }
            _xblockexpression = _xifexpression;
          }
          return _xblockexpression;
        };
        items.sort(_function);
        reportBuilder.append("  ").append(requirementName).append(": ");
        boolean _isEmpty = items.isEmpty();
        if (_isEmpty) {
          reportBuilder.append("(none)\n");
        } else {
          final Function1<Map.Entry<String, Integer>, String> _function_1 = (Map.Entry<String, Integer> e) -> {
            String _xblockexpression = null;
            {
              final Integer hop = e.getValue();
              String _xifexpression = null;
              if (((hop).intValue() == 1)) {
                _xifexpression = "";
              } else {
                _xifexpression = "s";
              }
              final String plural = _xifexpression;
              String _key = e.getKey();
              String _plus = (_key + " (");
              String _plus_1 = (_plus + hop);
              String _plus_2 = (_plus_1 + " hop");
              String _plus_3 = (_plus_2 + plural);
              _xblockexpression = (_plus_3 + ")");
            }
            return _xblockexpression;
          };
          final List<String> parts = ListExtensions.<Map.Entry<String, Integer>, String>map(items, _function_1);
          reportBuilder.append(IterableExtensions.join(parts, ", ")).append("\n");
        }
      }
    }
    new StakeholdersOwner().exportCSV(resource, fsa, "tables/influence_model_spread.csv");
    fsa.generateFile("file/info.txt", reportBuilder.toString());
    InfluenceDSLGenerator.detectCycle(jgraphtGraph);
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final InfluenceModel modelRoot = ((InfluenceModel) _head);
    final LinkedHashMap<String, Double> globalScenario = new LinkedHashMap<String, Double>();
    EList<EnvironmentalFactor> _ownedEnvironmentalFactors = modelRoot.getOwnedEnvironmentalFactors();
    for (final EnvironmentalFactor ef : _ownedEnvironmentalFactors) {
      boolean _isNaN = Double.isNaN(ef.getValue());
      boolean _not = (!_isNaN);
      if (_not) {
        globalScenario.put(ef.getName(), Double.valueOf(ef.getValue()));
      } else {
      }
    }
    EList<DesignArtifact> _ownedArtifacts = modelRoot.getOwnedArtifacts();
    for (final DesignArtifact da : _ownedArtifacts) {
      {
        final EObject ref = da.getRef();
        if ((ref != null)) {
          final OptionalDouble opt = DesignValueArtifacts.resolveNumeric(ref);
          boolean _isPresent = opt.isPresent();
          if (_isPresent) {
            globalScenario.put(da.getName(), Double.valueOf(opt.getAsDouble()));
          } else {
          }
        } else {
        }
      }
    }
    final StructuralRequirementEvaluation structural = new StructuralRequirementEvaluation();
    final StringBuilder numericLog = new StringBuilder("Requirement Evaluation\n\n");
    numericLog.append(" Structural evaluation per requirement \n");
    structural.appendPerRequirement(resource, graphBundle, numericLog);
    numericLog.append("\n Each influence evaluation \n");
    Iterable<Influence> _filter = Iterables.<Influence>filter(modelRoot.getOwnedInfluences(), Influence.class);
    for (final Influence inf : _filter) {
      {
        final LinkedHashMap<String, Double> localScenario = new LinkedHashMap<String, Double>(globalScenario);
        final InfluenceFunction fn = inf.getOwnedInfluenceFunction();
        ValueType _returnType = fn.getReturnType();
        if (_returnType != null) {
          switch (_returnType) {
            case TEXT:
              numericLog.append("## ").append(inf.getName()).append("\n").append(" Skipped function numeric evaluation, since returnType = Text.\n").append(" Structural advice based on graph topology:\n");
              structural.appendForInfluence(resource, graphBundle, inf, numericLog);
              break;
            case REAL:
              try {
                final InfluenceEvaluator.EvalResult res = InfluenceEvaluator.evaluateChainWithRequirement(modelRoot, inf, localScenario);
                final String srpName = inf.getOutputSRP().getName();
                numericLog.append(inf.getName()).append("\n");
                numericLog.append("SRP `").append(srpName).append("` = ").append(String.format(Locale.US, "%.6f", Double.valueOf(res.srpValue))).append("\n");
                numericLog.append("Inputs:\n");
                EList<Participant> _ownedParticipants = inf.getOwnedParticipants();
                for (final Participant p : _ownedParticipants) {
                  {
                    String _switchResult_1 = null;
                    boolean _matched = false;
                    if (p instanceof ArtifactParticipant) {
                      _matched=true;
                      _switchResult_1 = ((ArtifactParticipant)p).getTarget().getName();
                    }
                    if (!_matched) {
                      if (p instanceof EnvironmentalFactorParticipant) {
                        _matched=true;
                        _switchResult_1 = ((EnvironmentalFactorParticipant)p).getTarget().getName();
                      }
                    }
                    if (!_matched) {
                      if (p instanceof SRPInputParticipant) {
                        _matched=true;
                        _switchResult_1 = ((SRPInputParticipant)p).getTarget().getName();
                      }
                    }
                    if (!_matched) {
                      _switchResult_1 = p.eClass().getName();
                    }
                    final String name = _switchResult_1;
                    Double v = localScenario.get(name);
                    if (((v == null) && (p instanceof SRPInputParticipant))) {
                      final Function1<Influence, Boolean> _function = (Influence it) -> {
                        String _name = it.getOutputSRP().getName();
                        return Boolean.valueOf(Objects.equals(_name, name));
                      };
                      final Influence up = IterableExtensions.<Influence>findFirst(Iterables.<Influence>filter(modelRoot.getOwnedInfluences(), Influence.class), _function);
                      if ((up != null)) {
                        final InfluenceEvaluator.EvalResult upRes = InfluenceEvaluator.evaluateChainWithRequirement(modelRoot, up, localScenario);
                        v = Double.valueOf(upRes.srpValue);
                      } else {
                      }
                    } else {
                    }
                    StringBuilder _append = numericLog.append(" ").append(name).append(" = ");
                    String _xifexpression = null;
                    if ((v == null)) {
                      _xifexpression = "NA";
                    } else {
                      _xifexpression = String.format(Locale.US, "%.6f", v);
                    }
                    _append.append(_xifexpression).append("\n");
                  }
                }
                numericLog.append(" Changeability / Flexibility (if available):\n");
                EList<Participant> _ownedParticipants_1 = inf.getOwnedParticipants();
                for (final Participant p_1 : _ownedParticipants_1) {
                  boolean _matched = false;
                  if (p_1 instanceof ArtifactParticipant) {
                    _matched=true;
                    DesignArtifact _target = ((ArtifactParticipant)p_1).getTarget();
                    final EObject obj = ((EObject) _target);
                    EClass _eClass = null;
                    if (obj!=null) {
                      _eClass=obj.eClass();
                    }
                    EStructuralFeature _eStructuralFeature = null;
                    if (_eClass!=null) {
                      _eStructuralFeature=_eClass.getEStructuralFeature("changeability");
                    }
                    final EStructuralFeature f = _eStructuralFeature;
                    Object _xifexpression = null;
                    if ((f != null)) {
                      _xifexpression = obj.eGet(f);
                    } else {
                      _xifexpression = null;
                    }
                    final Object v = _xifexpression;
                    StringBuilder _append = numericLog.append(" ").append(((ArtifactParticipant)p_1).getTarget().getName()).append(" = ");
                    String _xifexpression_1 = null;
                    if ((v instanceof Number)) {
                      _xifexpression_1 = String.format(Locale.US, "%.2f", Double.valueOf(((Number) v).doubleValue()));
                    } else {
                      String _xifexpression_2 = null;
                      if ((v instanceof String)) {
                        _xifexpression_2 = ((String) v);
                      } else {
                        _xifexpression_2 = "NA";
                      }
                      _xifexpression_1 = _xifexpression_2;
                    }
                    _append.append(_xifexpression_1).append("\n");
                  }
                  if (!_matched) {
                    if (p_1 instanceof EnvironmentalFactorParticipant) {
                      _matched=true;
                      EnvironmentalFactor _target = ((EnvironmentalFactorParticipant)p_1).getTarget();
                      final EObject obj = ((EObject) _target);
                      EClass _eClass = null;
                      if (obj!=null) {
                        _eClass=obj.eClass();
                      }
                      EStructuralFeature _eStructuralFeature = null;
                      if (_eClass!=null) {
                        _eStructuralFeature=_eClass.getEStructuralFeature("flexibility");
                      }
                      final EStructuralFeature f = _eStructuralFeature;
                      Object _xifexpression = null;
                      if ((f != null)) {
                        _xifexpression = obj.eGet(f);
                      } else {
                        _xifexpression = null;
                      }
                      final Object v = _xifexpression;
                      StringBuilder _append = numericLog.append(" ").append(((EnvironmentalFactorParticipant)p_1).getTarget().getName()).append(" = ");
                      String _xifexpression_1 = null;
                      if ((v instanceof Number)) {
                        _xifexpression_1 = String.format(Locale.US, "%.2f", Double.valueOf(((Number) v).doubleValue()));
                      } else {
                        String _xifexpression_2 = null;
                        if ((v instanceof String)) {
                          _xifexpression_2 = ((String) v);
                        } else {
                          _xifexpression_2 = "NA";
                        }
                        _xifexpression_1 = _xifexpression_2;
                      }
                      _append.append(_xifexpression_1).append("\n");
                    }
                  }
                  if (!_matched) {
                  }
                }
                boolean _isNaN_1 = Double.isNaN(res.margin);
                if (_isNaN_1) {
                  numericLog.append(" Margin: N/A (no requirement linked)\n");
                } else {
                  numericLog.append(" Margin = ").append(String.format(Locale.US, "%.6f", Double.valueOf(res.margin))).append("\n");
                }
                boolean _isEmpty = res.grad.isEmpty();
                boolean _not_1 = (!_isEmpty);
                if (_not_1) {
                  numericLog.append(" Sensitivities:\n");
                  Set<Map.Entry<String, Double>> _entrySet = res.grad.entrySet();
                  for (final Map.Entry<String, Double> e : _entrySet) {
                    numericLog.append(" ").append(e.getKey()).append(" = ").append(String.format(Locale.US, "%.6f", e.getValue())).append("\n");
                  }
                  numericLog.append(" Classification (increase ↑):\n");
                  Set<Map.Entry<String, String>> _entrySet_1 = res.label.entrySet();
                  for (final Map.Entry<String, String> e_1 : _entrySet_1) {
                    numericLog.append("  ").append(e_1.getKey()).append(": ").append(e_1.getValue()).append("\n");
                  }
                }
                numericLog.append("\n");
                numericLog.append(" Structural advice based on graph topology:\n");
                structural.appendForInfluence(resource, graphBundle, inf, numericLog);
              } catch (final Throwable _t) {
                if (_t instanceof Throwable) {
                  final Throwable t = (Throwable)_t;
                  final StringWriter sw = new StringWriter();
                  PrintWriter _printWriter = new PrintWriter(sw);
                  t.printStackTrace(_printWriter);
                  numericLog.append(inf.getName()).append(" (error)\n").append(sw.toString()).append("\n");
                } else {
                  throw Exceptions.sneakyThrow(_t);
                }
              }
              break;
            default:
              break;
          }
        }
      }
    }
    byte[] _bytes = numericLog.toString().getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    fsa.generateFile("eval/numeric.txt", _byteArrayInputStream);
  }

  public static boolean detectCycle(final DefaultDirectedGraph<String, DefaultEdge> graph) {
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

  public static String metadataSafe(final EObject o) {
    String _xifexpression = null;
    if ((o == null)) {
      return null;
    } else {
      String _xblockexpression = null;
      {
        EClass _eClass = o.eClass();
        EStructuralFeature _eStructuralFeature = null;
        if (_eClass!=null) {
          _eStructuralFeature=_eClass.getEStructuralFeature("metadata");
        }
        final EStructuralFeature f = _eStructuralFeature;
        String _xifexpression_1 = null;
        if ((f == null)) {
          return null;
        } else {
          String _xblockexpression_1 = null;
          {
            final Object v = o.eGet(f);
            String _xifexpression_2 = null;
            if ((v instanceof String)) {
              _xifexpression_2 = ((String) v);
            } else {
              String _xifexpression_3 = null;
              if ((v instanceof List<?>)) {
                final Function1<Object, Boolean> _function = (Object it) -> {
                  return Boolean.valueOf((it != null));
                };
                final Function1<Object, String> _function_1 = (Object it) -> {
                  return String.valueOf(it);
                };
                _xifexpression_3 = IterableExtensions.join(IterableExtensions.map(IterableExtensions.filter(((List<?>) v), _function), _function_1), ", ");
              } else {
                _xifexpression_3 = null;
              }
              _xifexpression_2 = _xifexpression_3;
            }
            _xblockexpression_1 = _xifexpression_2;
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }

  private Map<String, Integer> computeUpstreamDistancesFromSrp(final String srpId, final Map<String, LinkedHashSet<String>> incomingAdjacency, final Map<String, String> srpToInfluence, final String targetPrefix) {
    final HashMap<String, Integer> distances = new HashMap<String, Integer>();
    final HashSet<String> visitedSrps = new HashSet<String>();
    final ArrayDeque<InfluenceDSLGenerator.PairNode> worklist = new ArrayDeque<InfluenceDSLGenerator.PairNode>();
    final String producerInfluenceId = srpToInfluence.get(srpId);
    if ((producerInfluenceId != null)) {
      InfluenceDSLGenerator.PairNode _pairNode = new InfluenceDSLGenerator.PairNode(producerInfluenceId, 0);
      worklist.add(_pairNode);
    } else {
    }
    while ((!worklist.isEmpty())) {
      {
        final InfluenceDSLGenerator.PairNode current = worklist.removeFirst();
        final String currentInfluenceId = current.nodeId;
        final int currentHops = current.hops;
        final LinkedHashSet<String> upstreamNodes = incomingAdjacency.get(currentInfluenceId);
        if ((upstreamNodes != null)) {
          for (final String upstreamNodeId : upstreamNodes) {
            {
              final int nextHops = (currentHops + 1);
              boolean _startsWith = upstreamNodeId.startsWith(targetPrefix);
              if (_startsWith) {
                final Integer prev = distances.get(upstreamNodeId);
                if (((prev == null) || (nextHops < (prev).intValue()))) {
                  distances.put(upstreamNodeId, Integer.valueOf(nextHops));
                } else {
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
                      InfluenceDSLGenerator.PairNode _pairNode_1 = new InfluenceDSLGenerator.PairNode(upstreamProducer, nextHops);
                      worklist.add(_pairNode_1);
                    } else {
                    }
                  } else {
                  }
                } else {
                }
              }
            }
          }
        } else {
        }
      }
    }
    return distances;
  }
}
