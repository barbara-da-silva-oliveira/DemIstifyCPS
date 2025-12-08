package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

@SuppressWarnings("all")
public class GraphBuilder {
  public static class Result {
    public final DefaultDirectedGraph<String, DefaultEdge> graph;

    public final Map<String, String> vertexLabels;

    public final Map<DefaultEdge, String> edgeLabels;

    public final Map<String, LinkedHashSet<String>> outEdges;

    public final Map<String, LinkedHashSet<String>> inEdges;

    public final Map<String, LinkedHashSet<String>> reqToSRs;

    public final Map<String, String> srp2inf;

    public final Map<String, String> nodeToOrigin;

    public final Map<String, String> originToNode;

    public final Map<DefaultEdge, String> edgeToOrigin;

    public final Map<DefaultEdge, Double> edgeWeights;

    public final Map<String, String> nodeSourceModel;

    public Result(final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> inEdges, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, String> srp2inf, final Map<String, String> nodeToOrigin, final Map<String, String> originToNode, final Map<DefaultEdge, String> edgeToOrigin, final Map<DefaultEdge, Double> edgeWeights, final Map<String, String> nodeSourceModel) {
      this.graph = graph;
      this.vertexLabels = vertexLabels;
      this.edgeLabels = edgeLabels;
      this.outEdges = outEdges;
      this.inEdges = inEdges;
      this.reqToSRs = reqToSRs;
      this.srp2inf = srp2inf;
      this.nodeToOrigin = nodeToOrigin;
      this.originToNode = originToNode;
      this.edgeToOrigin = edgeToOrigin;
      this.edgeWeights = edgeWeights;
      this.nodeSourceModel = nodeSourceModel;
    }
  }

  public GraphBuilder.Result build(final Resource resource) {
    GraphBuilder.Result _xblockexpression = null;
    {
      final DefaultDirectedGraph<String, DefaultEdge> graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
      final HashMap<String, String> vertexLabels = new HashMap<String, String>();
      final HashMap<DefaultEdge, String> edgeLabels = new HashMap<DefaultEdge, String>();
      final HashMap<String, LinkedHashSet<String>> outEdges = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, LinkedHashSet<String>> inEdges = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, LinkedHashSet<String>> reqToSRs = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, String> nodeToOrigin = new HashMap<String, String>();
      final HashMap<String, String> originToNode = new HashMap<String, String>();
      final HashMap<DefaultEdge, String> edgeToOrigin = new HashMap<DefaultEdge, String>();
      final HashMap<DefaultEdge, Double> edgeWeights = new HashMap<DefaultEdge, Double>();
      final HashMap<String, String> nodeSourceModel = new HashMap<String, String>();
      final HashMap<String, String> srp2inf = new HashMap<String, String>();
      final TreeIterator<EObject> it = resource.getAllContents();
      while (it.hasNext()) {
        {
          final EObject o = it.next();
          if ((o instanceof Influence)) {
            final Influence inf = ((Influence) o);
            final String iNode = GraphBuilder.toI(inf.getName());
            graph.addVertex(iNode);
            vertexLabels.put(iNode, GraphBuilder.influenceLabel(inf));
            GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, iNode, inf);
            EList<Participant> _ownedParticipants = inf.getOwnedParticipants();
            for (final Participant p : _ownedParticipants) {
              if ((p instanceof ArtifactParticipant)) {
                final ArtifactParticipant ap = ((ArtifactParticipant) p);
                final DesignArtifact a = ap.getTarget();
                if (((a != null) && (a.getName() != null))) {
                  final String aNode = GraphBuilder.toA(a.getName());
                  graph.addVertex(aNode);
                  vertexLabels.putIfAbsent(aNode, aNode);
                  GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, aNode, a);
                  final DefaultEdge e = graph.addEdge(aNode, iNode);
                  if ((e != null)) {
                    final Double w0 = GraphBuilder.pickAnyWeight(ap);
                    Double _xifexpression = null;
                    if ((w0 == null)) {
                      _xifexpression = null;
                    } else {
                      Double _xifexpression_1 = null;
                      if (((w0).doubleValue() == 0.0)) {
                        _xifexpression_1 = Double.valueOf(1.0);
                      } else {
                        _xifexpression_1 = w0;
                      }
                      _xifexpression = _xifexpression_1;
                    }
                    final Double w = _xifexpression;
                    if ((w != null)) {
                      edgeLabels.put(e, GraphBuilder.fmtD((w).doubleValue()));
                      edgeWeights.put(e, w);
                    }
                    GraphBuilder.setEdgeOrigin(edgeToOrigin, e, ap);
                  }
                  GraphBuilder.addAdjEdge(outEdges, inEdges, aNode, iNode);
                  final EObject target = GraphBuilder.readRefEObject(a);
                  final String mUri = GraphBuilder.modelUriOf(target);
                  if ((mUri != null)) {
                    nodeSourceModel.put(aNode, mUri);
                  }
                }
              } else {
                if ((p instanceof EnvironmentalFactorParticipant)) {
                  final EnvironmentalFactorParticipant ep = ((EnvironmentalFactorParticipant) p);
                  final EnvironmentalFactor ef = ep.getTarget();
                  if (((ef != null) && (ef.getName() != null))) {
                    final String eNode = GraphBuilder.toE(ef.getName());
                    graph.addVertex(eNode);
                    vertexLabels.putIfAbsent(eNode, eNode);
                    GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, eNode, ef);
                    final DefaultEdge e_1 = graph.addEdge(eNode, iNode);
                    if ((e_1 != null)) {
                      final Double w0_1 = GraphBuilder.pickAnyWeight(ep);
                      Double _xifexpression_2 = null;
                      if ((w0_1 == null)) {
                        _xifexpression_2 = null;
                      } else {
                        Double _xifexpression_3 = null;
                        if (((w0_1).doubleValue() == 0.0)) {
                          _xifexpression_3 = Double.valueOf(1.0);
                        } else {
                          _xifexpression_3 = w0_1;
                        }
                        _xifexpression_2 = _xifexpression_3;
                      }
                      final Double w_1 = _xifexpression_2;
                      if ((w_1 != null)) {
                        edgeLabels.put(e_1, GraphBuilder.fmtD((w_1).doubleValue()));
                        edgeWeights.put(e_1, w_1);
                      }
                      GraphBuilder.setEdgeOrigin(edgeToOrigin, e_1, ep);
                    }
                    GraphBuilder.addAdjEdge(outEdges, inEdges, eNode, iNode);
                  }
                } else {
                  if ((p instanceof SRPInputParticipant)) {
                    final SRPInputParticipant sp = ((SRPInputParticipant) p);
                    final SystemResponseProperty s = sp.getTarget();
                    if (((s != null) && (s.getName() != null))) {
                      final String srNode = GraphBuilder.toSR(s.getName());
                      graph.addVertex(srNode);
                      vertexLabels.putIfAbsent(srNode, srNode);
                      GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, srNode, s);
                      final DefaultEdge e_2 = graph.addEdge(srNode, iNode);
                      if ((e_2 != null)) {
                        edgeLabels.put(e_2, "input");
                        GraphBuilder.setEdgeOrigin(edgeToOrigin, e_2, sp);
                      }
                      GraphBuilder.addAdjEdge(outEdges, inEdges, srNode, iNode);
                      EList<Requirement> _constrainedBy = s.getConstrainedBy();
                      for (final Requirement r : _constrainedBy) {
                        if (((r != null) && (r.getName() != null))) {
                          final String rNode = GraphBuilder.toR(r.getName());
                          graph.addVertex(rNode);
                          vertexLabels.putIfAbsent(rNode, rNode);
                          GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, rNode, r);
                          final DefaultEdge e2 = graph.addEdge(srNode, rNode);
                          if ((e2 != null)) {
                            edgeLabels.put(e2, "constrains");
                            GraphBuilder.setEdgeOrigin(edgeToOrigin, e2, r);
                          }
                          GraphBuilder.addAdjEdge(outEdges, inEdges, srNode, rNode);
                          final Function<String, LinkedHashSet<String>> _function = (String it_1) -> {
                            return new LinkedHashSet<String>();
                          };
                          reqToSRs.computeIfAbsent(r.getName(), _function).add(s.getName());
                        }
                      }
                    }
                  }
                }
              }
            }
            final SystemResponseProperty out = inf.getOutputSRP();
            if (((out != null) && (out.getName() != null))) {
              final String srOut = GraphBuilder.toSR(out.getName());
              graph.addVertex(srOut);
              vertexLabels.putIfAbsent(srOut, srOut);
              final DefaultEdge e_3 = graph.addEdge(iNode, srOut);
              if ((e_3 != null)) {
                edgeLabels.put(e_3, "produces");
                GraphBuilder.setEdgeOrigin(edgeToOrigin, e_3, inf);
              }
              GraphBuilder.addAdjEdge(outEdges, inEdges, iNode, srOut);
              srp2inf.put(srOut, iNode);
              EList<Requirement> _constrainedBy_1 = out.getConstrainedBy();
              for (final Requirement r_1 : _constrainedBy_1) {
                if (((r_1 != null) && (r_1.getName() != null))) {
                  final String rNode_1 = GraphBuilder.toR(r_1.getName());
                  graph.addVertex(rNode_1);
                  vertexLabels.putIfAbsent(rNode_1, rNode_1);
                  final DefaultEdge e2_1 = graph.addEdge(srOut, rNode_1);
                  if ((e2_1 != null)) {
                    edgeLabels.put(e2_1, "constrains");
                    GraphBuilder.setEdgeOrigin(edgeToOrigin, e2_1, r_1);
                  }
                  GraphBuilder.addAdjEdge(outEdges, inEdges, srOut, rNode_1);
                  final Function<String, LinkedHashSet<String>> _function_1 = (String it_1) -> {
                    return new LinkedHashSet<String>();
                  };
                  reqToSRs.computeIfAbsent(r_1.getName(), _function_1).add(out.getName());
                }
              }
              EList<Participant> _ownedParticipants_1 = inf.getOwnedParticipants();
              for (final Participant p_1 : _ownedParticipants_1) {
                if ((p_1 instanceof ArtifactParticipant)) {
                  final DesignArtifact a_1 = ((ArtifactParticipant) p_1).getTarget();
                  String _name = null;
                  if (a_1!=null) {
                    _name=a_1.getName();
                  }
                  boolean _tripleNotEquals = (_name != null);
                  if (_tripleNotEquals) {
                    GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toA(a_1.getName()), srOut);
                  }
                } else {
                  if ((p_1 instanceof EnvironmentalFactorParticipant)) {
                    final EnvironmentalFactor ef_1 = ((EnvironmentalFactorParticipant) p_1).getTarget();
                    String _name_1 = null;
                    if (ef_1!=null) {
                      _name_1=ef_1.getName();
                    }
                    boolean _tripleNotEquals_1 = (_name_1 != null);
                    if (_tripleNotEquals_1) {
                      GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toE(ef_1.getName()), srOut);
                    }
                  } else {
                    if ((p_1 instanceof SRPInputParticipant)) {
                      final SystemResponseProperty s_1 = ((SRPInputParticipant) p_1).getTarget();
                      String _name_2 = null;
                      if (s_1!=null) {
                        _name_2=s_1.getName();
                      }
                      boolean _tripleNotEquals_2 = (_name_2 != null);
                      if (_tripleNotEquals_2) {
                        GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toSR(s_1.getName()), srOut);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = new GraphBuilder.Result(graph, vertexLabels, edgeLabels, outEdges, inEdges, reqToSRs, srp2inf, nodeToOrigin, originToNode, edgeToOrigin, edgeWeights, nodeSourceModel);
    }
    return _xblockexpression;
  }

  public static void addAdjEdge(final Map<String, LinkedHashSet<String>> outE, final Map<String, LinkedHashSet<String>> inE, final String from, final String to) {
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

  public static String influenceLabel(final Influence inf) {
    String _xblockexpression = null;
    {
      String _name = inf.getName();
      String s = ("I:" + _name);
      EClass _eClass = inf.eClass();
      EStructuralFeature _eStructuralFeature = null;
      if (_eClass!=null) {
        _eStructuralFeature=_eClass.getEStructuralFeature("confidence");
      }
      final EStructuralFeature confSF = _eStructuralFeature;
      if (((confSF != null) && inf.eIsSet(confSF))) {
        final Object v = inf.eGet(confSF);
        if ((v instanceof Number)) {
          String _format = String.format(Locale.US, "%.3f", Double.valueOf(((Number) v).doubleValue()));
          String _plus = ((s + "\\nconf=") + _format);
          s = _plus;
        } else {
          String _valueOf = String.valueOf(v);
          String _plus_1 = ((s + "\\nconf=") + _valueOf);
          s = _plus_1;
        }
      }
      final String meta = GraphBuilder.metadataSafe(inf);
      if (((meta != null) && (!meta.trim().isEmpty()))) {
        s = ((s + "\\n") + meta);
      }
      _xblockexpression = s;
    }
    return _xblockexpression;
  }

  public static String metadataSafe(final EObject o) {
    String _xblockexpression = null;
    {
      if ((o == null)) {
        return null;
      }
      EClass _eClass = o.eClass();
      EStructuralFeature _eStructuralFeature = null;
      if (_eClass!=null) {
        _eStructuralFeature=_eClass.getEStructuralFeature("metadata");
      }
      final EStructuralFeature f = _eStructuralFeature;
      if ((f == null)) {
        return null;
      }
      final Object v = o.eGet(f);
      String _xifexpression = null;
      if ((v instanceof String)) {
        _xifexpression = ((String) v);
      } else {
        String _xifexpression_1 = null;
        if ((v instanceof List<?>)) {
          final Function1<Object, Boolean> _function = (Object it) -> {
            return Boolean.valueOf((it != null));
          };
          final Function1<Object, String> _function_1 = (Object it) -> {
            return String.valueOf(it);
          };
          _xifexpression_1 = IterableExtensions.join(IterableExtensions.map(IterableExtensions.filter(((List<?>) v), _function), _function_1), ", ");
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public static String originOf(final EObject e) {
    String _xblockexpression = null;
    {
      if ((e == null)) {
        return null;
      }
      _xblockexpression = EcoreUtil.getURI(e).toString();
    }
    return _xblockexpression;
  }

  public static void setNodeOrigin(final Map<String, String> n2o, final Map<String, String> o2n, final String nodeId, final EObject src) {
    final String oid = GraphBuilder.originOf(src);
    if (((oid != null) && (nodeId != null))) {
      boolean _containsKey = n2o.containsKey(nodeId);
      boolean _not = (!_containsKey);
      if (_not) {
        n2o.put(nodeId, oid);
      }
      boolean _containsKey_1 = o2n.containsKey(oid);
      boolean _not_1 = (!_containsKey_1);
      if (_not_1) {
        o2n.put(oid, nodeId);
      }
    }
  }

  public static void setEdgeOrigin(final Map<DefaultEdge, String> e2o, final DefaultEdge e, final EObject src) {
    if (((e != null) && (src != null))) {
      e2o.put(e, GraphBuilder.originOf(src));
    }
  }

  public static Double readDoubleFeature(final EObject o, final String fn) {
    Double _xblockexpression = null;
    {
      if ((o == null)) {
        return null;
      }
      EClass _eClass = o.eClass();
      EStructuralFeature _eStructuralFeature = null;
      if (_eClass!=null) {
        _eStructuralFeature=_eClass.getEStructuralFeature(fn);
      }
      final EStructuralFeature f = _eStructuralFeature;
      if (((f == null) || (!o.eIsSet(f)))) {
        return null;
      }
      final Object v = o.eGet(f);
      Double _xifexpression = null;
      if ((v instanceof Number)) {
        _xifexpression = Double.valueOf(((Number) v).doubleValue());
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public static Double pickAnyWeight(final EObject participant) {
    final Double c = GraphBuilder.readDoubleFeature(participant, "confidence");
    if ((c != null)) {
      return c;
    }
    final Double l = GraphBuilder.readDoubleFeature(participant, "likelihood");
    if ((l != null)) {
      return l;
    }
    final Double g = GraphBuilder.readDoubleFeature(participant, "weight");
    return g;
  }

  public static EObject readRefEObject(final DesignArtifact da) {
    EObject _xblockexpression = null;
    {
      if ((da == null)) {
        return null;
      }
      final EStructuralFeature f = da.eClass().getEStructuralFeature("ref");
      if (((f == null) || (!da.eIsSet(f)))) {
        return null;
      }
      final Object v = da.eGet(f);
      EObject _xifexpression = null;
      if ((v instanceof EObject)) {
        _xifexpression = ((EObject) v);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public static String modelUriOf(final EObject e) {
    String _xblockexpression = null;
    {
      if ((e == null)) {
        return null;
      }
      final URI u = EcoreUtil.getURI(e);
      URI _trimFragment = null;
      if (u!=null) {
        _trimFragment=u.trimFragment();
      }
      final URI base = _trimFragment;
      String _xifexpression = null;
      if ((base != null)) {
        _xifexpression = base.toString();
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public static String toA(final String n) {
    return ("A:" + n);
  }

  public static String toE(final String n) {
    return ("E:" + n);
  }

  public static String toSR(final String n) {
    return ("SR:" + n);
  }

  public static String toR(final String n) {
    return ("R:" + n);
  }

  public static String toI(final String n) {
    return ("I:" + n);
  }

  public static String fmtD(final double d) {
    return String.format("%.3f", Double.valueOf(d));
  }
}
