package fr.inria.kairos.influence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MetadataUtil {
  @Accessors
  public static class Weights {
    private final double likelihood = 1.0;

    private final double strength = 1.0;

    private final double confidence = 1.0;

    @Pure
    public double getLikelihood() {
      return this.likelihood;
    }

    @Pure
    public double getStrength() {
      return this.strength;
    }

    @Pure
    public double getConfidence() {
      return this.confidence;
    }
  }

  /**
   * Parsed likelihoods per element type.
   */
  @Accessors
  public static class PerElement {
    private final HashMap<String, Double> artifacts = new HashMap<String, Double>();

    private final HashMap<String, Double> phenomena = new HashMap<String, Double>();

    private final HashMap<String, Double> systemResponses = new HashMap<String, Double>();

    @Pure
    public HashMap<String, Double> getArtifacts() {
      return this.artifacts;
    }

    @Pure
    public HashMap<String, Double> getPhenomena() {
      return this.phenomena;
    }

    @Pure
    public HashMap<String, Double> getSystemResponses() {
      return this.systemResponses;
    }
  }

  private static final String NUMBER = "[-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?";

  /**
   * Accept items like: "artifact motorSpeed 0.8", "system response \"TTC\" 0.9", "phenomena 'wind' 0.3"
   */
  private static final Pattern ITEM = Pattern.compile(
    (((("(?is)^\\s*(artifact|phenomena|system\\s+response)\\s+" + 
      "(?:\"([^\"]+)\"|\'([^\']+)\'|(.+?))\\s+") + 
      "(") + MetadataUtil.NUMBER) + ")\\s*$"));

  public static MetadataUtil.PerElement parsePerElement(final List<String> items) {
    MetadataUtil.PerElement _xblockexpression = null;
    {
      final MetadataUtil.PerElement out = new MetadataUtil.PerElement();
      if ((items == null)) {
        return out;
      }
      for (final String raw : items) {
        if ((raw != null)) {
          final String s = raw.trim();
          boolean _isEmpty = s.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            final Matcher m = MetadataUtil.ITEM.matcher(s);
            boolean _matches = m.matches();
            if (_matches) {
              final String kind = m.group(1).toLowerCase();
              String _xifexpression = null;
              String _group = m.group(2);
              boolean _tripleNotEquals = (_group != null);
              if (_tripleNotEquals) {
                _xifexpression = m.group(2);
              } else {
                String _xifexpression_1 = null;
                String _group_1 = m.group(3);
                boolean _tripleNotEquals_1 = (_group_1 != null);
                if (_tripleNotEquals_1) {
                  _xifexpression_1 = m.group(3);
                } else {
                  String _xifexpression_2 = null;
                  String _group_2 = m.group(4);
                  boolean _tripleNotEquals_2 = (_group_2 != null);
                  if (_tripleNotEquals_2) {
                    _xifexpression_2 = m.group(4);
                  } else {
                    _xifexpression_2 = "";
                  }
                  _xifexpression_1 = _xifexpression_2;
                }
                _xifexpression = _xifexpression_1;
              }
              final String name = _xifexpression.trim();
              final double v = Double.parseDouble(m.group(5));
              if (kind != null) {
                switch (kind) {
                  case "artifact":
                    out.artifacts.put(name, Double.valueOf(v));
                    break;
                  case "phenomena":
                    out.phenomena.put(name, Double.valueOf(v));
                    break;
                  case "system response":
                    out.systemResponses.put(name, Double.valueOf(v));
                    break;
                }
              }
            }
          }
        }
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }

  /**
   * Convenience if you store a single CSV string instead of a list attribute.
   */
  public static MetadataUtil.PerElement parsePerElementCSV(final String csv) {
    MetadataUtil.PerElement _xblockexpression = null;
    {
      if (((csv == null) || csv.trim().isEmpty())) {
        return new MetadataUtil.PerElement();
      }
      _xblockexpression = MetadataUtil.parsePerElement(Arrays.<String>asList(csv.split("\\s*,\\s*")));
    }
    return _xblockexpression;
  }

  public static Double extractPriorityNumber(final String meta) {
    return MetadataUtil.extractDouble(meta, "priority");
  }

  public static String extractPriorityLabel(final String meta) {
    return MetadataUtil.extractWord(meta, "priority");
  }

  public static Double extractDouble(final String meta, final String key) {
    Double _xblockexpression = null;
    {
      if ((meta == null)) {
        return null;
      }
      String _quote = Pattern.quote(key);
      String _plus = ("(?i)\\b" + _quote);
      String _plus_1 = (_plus + "\\b\\s*=\\s*(");
      String _plus_2 = (_plus_1 + MetadataUtil.NUMBER);
      String _plus_3 = (_plus_2 + ")");
      final Pattern p = Pattern.compile(_plus_3);
      final Matcher m = p.matcher(MetadataUtil.sanitize(meta));
      Double _xifexpression = null;
      boolean _find = m.find();
      if (_find) {
        _xifexpression = Double.valueOf(m.group(1));
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public static String extractWord(final String meta, final String key) {
    String _xblockexpression = null;
    {
      if ((meta == null)) {
        return null;
      }
      String _quote = Pattern.quote(key);
      String _plus = ("(?i)\\b" + _quote);
      String _plus_1 = (_plus + "\\b\\s*=\\s*(\"?)([A-Za-z]+)\\1");
      final Pattern p = Pattern.compile(_plus_1);
      final Matcher m = p.matcher(MetadataUtil.sanitize(meta));
      String _xifexpression = null;
      boolean _find = m.find();
      if (_find) {
        _xifexpression = m.group(2);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  private static String sanitize(final String meta) {
    String _xblockexpression = null;
    {
      String s = meta.trim();
      if ((s.startsWith("{") && s.endsWith("}"))) {
        int _length = s.length();
        int _minus = (_length - 1);
        s = s.substring(1, _minus).trim();
      }
      if (((s.startsWith("\"") && s.endsWith("\"")) || (s.startsWith("\'") && s.endsWith("\'")))) {
        int _length_1 = s.length();
        int _minus_1 = (_length_1 - 1);
        s = s.substring(1, _minus_1);
      }
      _xblockexpression = s;
    }
    return _xblockexpression;
  }

  public static double priorityWeight(final String meta) {
    double _xblockexpression = (double) 0;
    {
      final String w = MetadataUtil.extractPriorityLabel(meta);
      double _xifexpression = (double) 0;
      if ((w == null)) {
        _xifexpression = 1.0;
      } else {
        double _switchResult = (double) 0;
        String _lowerCase = w.toLowerCase();
        if (_lowerCase != null) {
          switch (_lowerCase) {
            case "high":
              _switchResult = 1.0;
              break;
            case "medium":
              _switchResult = 0.66;
              break;
            case "low":
              _switchResult = 0.33;
              break;
            default:
              _switchResult = 1.0;
              break;
          }
        } else {
          _switchResult = 1.0;
        }
        _xifexpression = _switchResult;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  /**
   * Requirement metadata lists.
   */
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
      String _switchResult = null;
      boolean _matched = false;
      if ((v instanceof String)) {
        _matched=true;
        _switchResult = ((String) v);
      }
      if (!_matched) {
        if ((v instanceof List<?>)) {
          _matched=true;
          final Function1<Object, Boolean> _function = (Object it) -> {
            return Boolean.valueOf((it != null));
          };
          final Function1<Object, String> _function_1 = (Object it) -> {
            return String.valueOf(it);
          };
          _switchResult = IterableExtensions.join(IterableExtensions.map(IterableExtensions.filter(((List<?>) v), _function), _function_1), ", ");
        }
      }
      if (!_matched) {
        _switchResult = null;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
