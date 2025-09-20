package fr.inria.kairos.influence.analysis;

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
import java.util.function.Function;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class RequirementTraceability {
  private static class NodeDepth {
    private final String node;

    private final int depth;

    public NodeDepth(final String n, final int d) {
      this.node = n;
      this.depth = d;
    }
  }

  public static class TraceData {
    public final Map<String, LinkedHashSet<String>> inEdges;

    public final Map<String, LinkedHashSet<String>> outEdges;

    public final Map<String, LinkedHashSet<String>> reqToSRs;

    public TraceData(final Map<String, LinkedHashSet<String>> inEdges, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> reqToSRs) {
      this.inEdges = inEdges;
      this.outEdges = outEdges;
      this.reqToSRs = reqToSRs;
    }
  }

  public RequirementTraceability.TraceData buildTrace(final Resource resource) {
    RequirementTraceability.TraceData _xblockexpression = null;
    {
      final HashMap<String, LinkedHashSet<String>> outEdges = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, LinkedHashSet<String>> inEdges = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, LinkedHashSet<String>> reqToSRs = new HashMap<String, LinkedHashSet<String>>();
      final TreeIterator<EObject> it = resource.getAllContents();
      while (it.hasNext()) {
        {
          final EObject o = it.next();
          if ((o instanceof Influence)) {
            final Influence inf = ((Influence) o);
            EList<SystemResponse> _affects = inf.getAffects();
            for (final SystemResponse sr : _affects) {
              if (((sr != null) && (sr.getName() != null))) {
                RequirementTraceability.addAdj(outEdges, inEdges, RequirementTraceability.toI(inf.getName()), RequirementTraceability.toSR(sr.getName()));
                EList<Requirement> _usedIn = sr.getUsedIn();
                for (final Requirement r : _usedIn) {
                  if (((r != null) && (r.getName() != null))) {
                    RequirementTraceability.addAdj(outEdges, inEdges, RequirementTraceability.toSR(sr.getName()), RequirementTraceability.toR(r.getName()));
                    final Function<String, LinkedHashSet<String>> _function = (String it_1) -> {
                      return new LinkedHashSet<String>();
                    };
                    reqToSRs.computeIfAbsent(r.getName(), _function).add(sr.getName());
                  }
                }
              }
            }
            EList<DesignArtifact> _originatorArtifact = inf.getOriginatorArtifact();
            for (final DesignArtifact a : _originatorArtifact) {
              String _name = null;
              if (a!=null) {
                _name=a.getName();
              }
              boolean _tripleNotEquals = (_name != null);
              if (_tripleNotEquals) {
                RequirementTraceability.addAdj(outEdges, inEdges, RequirementTraceability.toA(a.getName()), RequirementTraceability.toI(inf.getName()));
              }
            }
            EList<PhysicalPhenomena> _originatorPhenomena = inf.getOriginatorPhenomena();
            for (final PhysicalPhenomena p : _originatorPhenomena) {
              String _name_1 = null;
              if (p!=null) {
                _name_1=p.getName();
              }
              boolean _tripleNotEquals_1 = (_name_1 != null);
              if (_tripleNotEquals_1) {
                RequirementTraceability.addAdj(outEdges, inEdges, RequirementTraceability.toP(p.getName()), RequirementTraceability.toI(inf.getName()));
              }
            }
            EList<SystemResponse> _originatorSystemResponse = inf.getOriginatorSystemResponse();
            for (final SystemResponse sr0 : _originatorSystemResponse) {
              String _name_2 = null;
              if (sr0!=null) {
                _name_2=sr0.getName();
              }
              boolean _tripleNotEquals_2 = (_name_2 != null);
              if (_tripleNotEquals_2) {
                RequirementTraceability.addAdj(outEdges, inEdges, RequirementTraceability.toSR(sr0.getName()), RequirementTraceability.toI(inf.getName()));
              }
            }
            EList<SystemResponse> _affects_1 = inf.getAffects();
            for (final SystemResponse sr_1 : _affects_1) {
              EList<SystemResponse> _originatorSystemResponse_1 = inf.getOriginatorSystemResponse();
              for (final SystemResponse sr0_1 : _originatorSystemResponse_1) {
                boolean _and = false;
                String _name_3 = null;
                if (sr_1!=null) {
                  _name_3=sr_1.getName();
                }
                boolean _tripleNotEquals_3 = (_name_3 != null);
                if (!_tripleNotEquals_3) {
                  _and = false;
                } else {
                  String _name_4 = null;
                  if (sr0_1!=null) {
                    _name_4=sr0_1.getName();
                  }
                  boolean _tripleNotEquals_4 = (_name_4 != null);
                  _and = _tripleNotEquals_4;
                }
                if (_and) {
                  RequirementTraceability.addAdj(outEdges, inEdges, RequirementTraceability.toSR(sr0_1.getName()), RequirementTraceability.toSR(sr_1.getName()));
                }
              }
            }
          }
        }
      }
      _xblockexpression = new RequirementTraceability.TraceData(inEdges, outEdges, reqToSRs);
    }
    return _xblockexpression;
  }

  public HashMap<String, Integer> upstreamArtifacts(final String srNode, final Map<String, LinkedHashSet<String>> inEdges) {
    HashMap<String, Integer> _xblockexpression = null;
    {
      final HashMap<String, Integer> result = new HashMap<String, Integer>();
      final HashSet<String> visited = new HashSet<String>();
      final ArrayDeque<RequirementTraceability.NodeDepth> q = new ArrayDeque<RequirementTraceability.NodeDepth>();
      visited.add(srNode);
      RequirementTraceability.NodeDepth _nodeDepth = new RequirementTraceability.NodeDepth(srNode, 0);
      q.add(_nodeDepth);
      while ((!q.isEmpty())) {
        {
          final RequirementTraceability.NodeDepth cur = q.removeFirst();
          final LinkedHashSet<String> preds = inEdges.get(cur.node);
          if ((preds != null)) {
            for (final String p : preds) {
              boolean _add = visited.add(p);
              if (_add) {
                boolean _startsWith = p.startsWith("A:");
                if (_startsWith) {
                  final String name = p.substring(2);
                  final Integer old = result.get(name);
                  if (((old == null) || ((cur.depth + 1) < (old).intValue()))) {
                    result.put(name, Integer.valueOf((cur.depth + 1)));
                  }
                }
                RequirementTraceability.NodeDepth _nodeDepth_1 = new RequirementTraceability.NodeDepth(p, (cur.depth + 1));
                q.add(_nodeDepth_1);
              }
            }
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }

  private static void addAdj(final Map<String, LinkedHashSet<String>> outE, final Map<String, LinkedHashSet<String>> inE, final String from, final String to) {
    LinkedHashSet<String> os = outE.get(from);
    if ((os == null)) {
      LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>();
      os = _linkedHashSet;
      outE.put(from, os);
    }
    os.add(to);
    LinkedHashSet<String> is = inE.get(to);
    if ((is == null)) {
      LinkedHashSet<String> _linkedHashSet_1 = new LinkedHashSet<String>();
      is = _linkedHashSet_1;
      inE.put(to, is);
    }
    is.add(from);
  }

  private static String toA(final String n) {
    return ("A:" + n);
  }

  private static String toP(final String n) {
    return ("P:" + n);
  }

  private static String toSR(final String n) {
    return ("SR:" + n);
  }

  private static String toR(final String n) {
    return ("R:" + n);
  }

  private static String toI(final String n) {
    return ("I:" + n);
  }
}
