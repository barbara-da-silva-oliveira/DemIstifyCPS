package fr.inria.kairos.influence.export;

import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.nio.Attribute;
import org.jgrapht.nio.DefaultAttribute;
import org.jgrapht.nio.dot.DOTExporter;

@SuppressWarnings("all")
public class DotExporter {
  public void exportGraphToDot(final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final IFileSystemAccess2 fsa, final String filename) {
    final Function<String, String> _function = (String v) -> {
      return DotExporter.safeId(v);
    };
    final DOTExporter<String, DefaultEdge> dot = new DOTExporter<String, DefaultEdge>(_function);
    final Supplier<Map<String, Attribute>> _function_1 = () -> {
      LinkedHashMap<String, Attribute> _xblockexpression = null;
      {
        final LinkedHashMap<String, Attribute> a = new LinkedHashMap<String, Attribute>();
        a.put("rankdir", DefaultAttribute.createAttribute("LR"));
        _xblockexpression = a;
      }
      return _xblockexpression;
    };
    dot.setGraphAttributeProvider(_function_1);
    final Function<String, Map<String, Attribute>> _function_2 = (String v) -> {
      LinkedHashMap<String, Attribute> _xblockexpression = null;
      {
        final LinkedHashMap<String, Attribute> a = new LinkedHashMap<String, Attribute>();
        String _orDefault = null;
        if (vertexLabels!=null) {
          _orDefault=vertexLabels.getOrDefault(v, v);
        }
        final String lbl = _orDefault;
        a.put("label", DefaultAttribute.createAttribute(lbl));
        _xblockexpression = a;
      }
      return _xblockexpression;
    };
    dot.setVertexAttributeProvider(_function_2);
    final Function<DefaultEdge, Map<String, Attribute>> _function_3 = (DefaultEdge e) -> {
      LinkedHashMap<String, Attribute> _xblockexpression = null;
      {
        final LinkedHashMap<String, Attribute> a = new LinkedHashMap<String, Attribute>();
        String _get = null;
        if (edgeLabels!=null) {
          _get=edgeLabels.get(e);
        }
        final String lbl = _get;
        if ((lbl != null)) {
          a.put("label", DefaultAttribute.createAttribute(lbl));
        }
        _xblockexpression = a;
      }
      return _xblockexpression;
    };
    dot.setEdgeAttributeProvider(_function_3);
    final StringWriter w = new StringWriter();
    dot.exportGraph(graph, w);
    fsa.generateFile(filename, w.toString());
  }

  private static String safeId(final String v) {
    String _xblockexpression = null;
    {
      if ((v == null)) {
        return "n";
      }
      String base = v.replaceAll("[^A-Za-z0-9_]", "_");
      boolean _isEmpty = base.isEmpty();
      if (_isEmpty) {
        base = "n";
      }
      boolean _matches = base.matches("[A-Za-z_].*");
      boolean _not = (!_matches);
      if (_not) {
        base = ("n_" + base);
      }
      String _lowerCase = Integer.toHexString(v.hashCode()).toLowerCase();
      _xblockexpression = ((base + "_") + _lowerCase);
    }
    return _xblockexpression;
  }
}
