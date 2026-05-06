package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field constrainedBy is undefined for the type SystemResponseProperty"
      + "\nThe method or field constrainedBy is undefined for the type SystemResponseProperty"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\nname cannot be resolved"
      + "\n!== cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved");
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
