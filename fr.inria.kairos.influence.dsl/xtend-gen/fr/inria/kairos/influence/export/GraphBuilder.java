package fr.inria.kairos.influence.export;

import fr.inria.kairos.influence.MetadataUtil;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponse;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
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

    public Result(final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> inEdges, final Map<String, LinkedHashSet<String>> reqToSRs) {
      this.graph = graph;
      this.vertexLabels = vertexLabels;
      this.edgeLabels = edgeLabels;
      this.outEdges = outEdges;
      this.inEdges = inEdges;
      this.reqToSRs = reqToSRs;
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
      final TreeIterator<EObject> it = resource.getAllContents();
      while (it.hasNext()) {
        {
          final EObject o = it.next();
          if ((o instanceof Influence)) {
            final Influence inf = ((Influence) o);
            final MetadataUtil.PerElement L = MetadataUtil.parsePerElement(inf.getLikelihoodPerElement());
            final String iNode = GraphBuilder.toI(inf.getName());
            graph.addVertex(iNode);
            vertexLabels.put(iNode, GraphBuilder.influenceLabel(inf));
            EList<DesignArtifact> _originatorArtifact = inf.getOriginatorArtifact();
            for (final DesignArtifact a : _originatorArtifact) {
              if (((a != null) && (a.getName() != null))) {
                final String aNode = GraphBuilder.toA(a.getName());
                graph.addVertex(aNode);
                vertexLabels.putIfAbsent(aNode, aNode);
                final DefaultEdge e = graph.addEdge(aNode, iNode);
                if ((e != null)) {
                  edgeLabels.put(e, GraphBuilder.fmtD((L.getArtifacts().getOrDefault(a.getName(), Double.valueOf(1.0))).doubleValue()));
                }
                GraphBuilder.addAdjEdge(outEdges, inEdges, aNode, iNode);
              }
            }
            EList<PhysicalPhenomena> _originatorPhenomena = inf.getOriginatorPhenomena();
            for (final PhysicalPhenomena p : _originatorPhenomena) {
              if (((p != null) && (p.getName() != null))) {
                final String pNode = GraphBuilder.toP(p.getName());
                graph.addVertex(pNode);
                vertexLabels.putIfAbsent(pNode, pNode);
                final DefaultEdge e_1 = graph.addEdge(pNode, iNode);
                if ((e_1 != null)) {
                  edgeLabels.put(e_1, GraphBuilder.fmtD((L.getPhenomena().getOrDefault(p.getName(), Double.valueOf(1.0))).doubleValue()));
                }
                GraphBuilder.addAdjEdge(outEdges, inEdges, pNode, iNode);
              }
            }
            EList<SystemResponse> _originatorSystemResponse = inf.getOriginatorSystemResponse();
            for (final SystemResponse sr0 : _originatorSystemResponse) {
              if (((sr0 != null) && (sr0.getName() != null))) {
                final String sr0Node = GraphBuilder.toSR(sr0.getName());
                graph.addVertex(sr0Node);
                vertexLabels.putIfAbsent(sr0Node, sr0Node);
                final DefaultEdge e_2 = graph.addEdge(sr0Node, iNode);
                if ((e_2 != null)) {
                  edgeLabels.put(e_2, "origin");
                }
                GraphBuilder.addAdjEdge(outEdges, inEdges, sr0Node, iNode);
              }
            }
            EList<SystemResponse> _affects = inf.getAffects();
            for (final SystemResponse sr : _affects) {
              if (((sr != null) && (sr.getName() != null))) {
                final String srNode = GraphBuilder.toSR(sr.getName());
                graph.addVertex(srNode);
                vertexLabels.putIfAbsent(srNode, srNode);
                final DefaultEdge e_3 = graph.addEdge(iNode, srNode);
                if ((e_3 != null)) {
                  edgeLabels.put(e_3, "affects");
                }
                GraphBuilder.addAdjEdge(outEdges, inEdges, iNode, srNode);
                EList<Requirement> _usedIn = sr.getUsedIn();
                for (final Requirement r : _usedIn) {
                  if (((r != null) && (r.getName() != null))) {
                    final String rNode = GraphBuilder.toR(r.getName());
                    graph.addVertex(rNode);
                    vertexLabels.putIfAbsent(rNode, rNode);
                    final DefaultEdge e2 = graph.addEdge(srNode, rNode);
                    if ((e2 != null)) {
                      edgeLabels.put(e2, "usedIn");
                    }
                    GraphBuilder.addAdjEdge(outEdges, inEdges, srNode, rNode);
                    final Function<String, LinkedHashSet<String>> _function = (String it_1) -> {
                      return new LinkedHashSet<String>();
                    };
                    reqToSRs.computeIfAbsent(r.getName(), _function).add(sr.getName());
                  }
                }
                EList<DesignArtifact> _originatorArtifact_1 = inf.getOriginatorArtifact();
                for (final DesignArtifact a_1 : _originatorArtifact_1) {
                  if (((a_1 != null) && (a_1.getName() != null))) {
                    GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toA(a_1.getName()), srNode);
                  }
                }
                EList<PhysicalPhenomena> _originatorPhenomena_1 = inf.getOriginatorPhenomena();
                for (final PhysicalPhenomena p_1 : _originatorPhenomena_1) {
                  if (((p_1 != null) && (p_1.getName() != null))) {
                    GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toP(p_1.getName()), srNode);
                  }
                }
                EList<SystemResponse> _originatorSystemResponse_1 = inf.getOriginatorSystemResponse();
                for (final SystemResponse sr0_1 : _originatorSystemResponse_1) {
                  if (((sr0_1 != null) && (sr0_1.getName() != null))) {
                    GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toSR(sr0_1.getName()), srNode);
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = new GraphBuilder.Result(graph, vertexLabels, edgeLabels, outEdges, inEdges, reqToSRs);
    }
    return _xblockexpression;
  }

  private static void addAdjEdge(final Map<String, LinkedHashSet<String>> outE, final Map<String, LinkedHashSet<String>> inE, final String from, final String to) {
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

  private static String influenceLabel(final Influence inf) {
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

  private static String metadataSafe(final EObject o) {
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

  private static String fmtD(final double d) {
    return String.format("%.3f", Double.valueOf(d));
  }
}
