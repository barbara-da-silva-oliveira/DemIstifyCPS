package fr.inria.kairos.influence;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MetadataUtil {
  /**
   * Artifact/phenomenon weights.
   */
  @Accessors(AccessorType.PUBLIC_GETTER)
  public static class Weights {
    private double likelihood = 1.0;

    private double strength = 1.0;

    private double confidence = 1.0;

    @Override
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(likelihood=");
      _builder.append(this.likelihood);
      _builder.append(", strength=");
      _builder.append(this.strength);
      _builder.append(", confidence=");
      _builder.append(this.confidence);
      _builder.append(")");
      return _builder.toString();
    }

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

  private static final String NUMBER = "[-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?";

  private static final Pattern KEYVAL_LSC = Pattern.compile(
    (("(?i)\\b(likelihood|strength|confidence)\\b\\s*=\\s*(" + MetadataUtil.NUMBER) + ")"));

  /**
   * Parse artifact/phenomenon/system-response metadata: "likelihood=0.7, strength=0.8, confidence=0.9".
   */
  public static MetadataUtil.Weights parseWeights(final String meta) {
    MetadataUtil.Weights _xblockexpression = null;
    {
      final MetadataUtil.Weights w = new MetadataUtil.Weights();
      if ((meta == null)) {
        return w;
      }
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
      final Matcher m = MetadataUtil.KEYVAL_LSC.matcher(s);
      while (m.find()) {
        {
          final String key = m.group(1).toLowerCase();
          final double v = Double.parseDouble(m.group(2));
          if (key != null) {
            switch (key) {
              case "likelihood":
                w.likelihood = v;
                break;
              case "strength":
                w.strength = v;
                break;
              case "confidence":
                w.confidence = v;
                break;
            }
          }
        }
      }
      _xblockexpression = w;
    }
    return _xblockexpression;
  }

  /**
   * Returns numeric requirement priority if present (null if absent). Accepts: priority=0.85
   */
  public static Double extractPriorityNumber(final String meta) {
    return MetadataUtil.extractDouble(meta, "priority");
  }

  /**
   * Returns labeled requirement priority if present (null if absent). Accepts: priority=high|medium|low
   */
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

  /**
   * key = word or key = "word"  String or null if absent.
   */
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

  /**
   * trims and strips surrounding braces/quotes if the dev added them.
   */
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
   * Safely get 'metadata' as a single String from any EObject. Joins lists with ", ".
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
