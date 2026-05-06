package fr.inria.kairos.influence.generator;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field value is undefined for the type EnvironmentalFactor"
      + "\nThe method or field value is undefined for the type EnvironmentalFactor"
      + "\nThe method or field returnType is undefined for the type InfluenceFunction");
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
