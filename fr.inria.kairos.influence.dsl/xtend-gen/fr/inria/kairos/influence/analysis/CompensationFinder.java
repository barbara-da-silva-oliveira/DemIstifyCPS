package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.metamodel.DesignArtifact;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class CompensationFinder {
  public void appendCompensatorsByChangeability(final Resource resource, final StringBuilder infoFile, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    final HashMap<String, DesignArtifact> daIndex = new HashMap<String, DesignArtifact>();
    final TreeIterator<EObject> it = resource.getAllContents();
    while (it.hasNext()) {
      {
        final EObject o = it.next();
        if ((o instanceof DesignArtifact)) {
          final DesignArtifact da = ((DesignArtifact) o);
          String _name = da.getName();
          boolean _tripleNotEquals = (_name != null);
          if (_tripleNotEquals) {
            daIndex.put(da.getName(), da);
          }
        }
      }
    }
    infoFile.append("\nCompensators ranked by changeability:\n");
    Set<String> _keySet = reqToSRs.keySet();
    TreeSet<String> _treeSet = new TreeSet<String>(_keySet);
    for (final String reqName : _treeSet) {
      {
        final HashMap<String, Integer> agg = new HashMap<String, Integer>();
        final LinkedHashSet<String> srs = reqToSRs.get(reqName);
        if ((srs != null)) {
          final RequirementTraceability tracer = new RequirementTraceability();
          for (final String srName : srs) {
            {
              final HashMap<String, Integer> m = tracer.upstreamArtifacts(CompensationFinder.toSR(srName), inEdges);
              Set<Map.Entry<String, Integer>> _entrySet = m.entrySet();
              for (final Map.Entry<String, Integer> e : _entrySet) {
                {
                  final Integer prev = agg.get(e.getKey());
                  if (((prev == null) || (e.getValue().compareTo(prev) < 0))) {
                    agg.put(e.getKey(), e.getValue());
                  }
                }
              }
            }
          }
        }
        final ArrayList<List<Object>> rows = CollectionLiterals.<List<Object>>newArrayList();
        Set<String> _keySet_1 = agg.keySet();
        for (final String name : _keySet_1) {
          {
            final DesignArtifact da = daIndex.get(name);
            double c = 0.5;
            if ((da != null)) {
              EClass _eClass = da.eClass();
              EStructuralFeature _eStructuralFeature = null;
              if (_eClass!=null) {
                _eStructuralFeature=_eClass.getEStructuralFeature("changeability");
              }
              final EStructuralFeature sf = _eStructuralFeature;
              if (((sf != null) && da.eIsSet(sf))) {
                final Object v = da.eGet(sf);
                if ((v instanceof Number)) {
                  c = ((Number) v).doubleValue();
                }
              }
            }
            rows.add(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(name, Double.valueOf(c))));
          }
        }
        final Comparator<List<Object>> _function = (List<Object> a, List<Object> b) -> {
          int _xblockexpression = (int) 0;
          {
            Object _get = b.get(1);
            Object _get_1 = a.get(1);
            final int cmp = Double.compare((((Double) _get)).doubleValue(), (((Double) _get_1)).doubleValue());
            int _xifexpression = (int) 0;
            if ((cmp != 0)) {
              _xifexpression = cmp;
            } else {
              Object _get_2 = a.get(0);
              Object _get_3 = b.get(0);
              _xifexpression = ((String) _get_2).compareTo(((String) _get_3));
            }
            _xblockexpression = _xifexpression;
          }
          return _xblockexpression;
        };
        rows.sort(_function);
        infoFile.append("  ").append(reqName).append(": ");
        boolean _isEmpty = rows.isEmpty();
        if (_isEmpty) {
          infoFile.append("(none)\n");
        } else {
          final Function1<List<Object>, String> _function_1 = (List<Object> it_1) -> {
            Object _get = it_1.get(0);
            String _plus = (((String) _get) + " (changeability=");
            String _format = String.format("%.2f", it_1.get(1));
            String _plus_1 = (_plus + _format);
            return (_plus_1 + ")");
          };
          final String line = IterableExtensions.join(ListExtensions.<List<Object>, String>map(rows, _function_1), ", ");
          infoFile.append(line).append("\n");
        }
      }
    }
  }

  public Map<String, Pair<String, Double>> bestCompensatorByChangeability(final Resource resource, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    LinkedHashMap<String, Pair<String, Double>> _xblockexpression = null;
    {
      final HashMap<String, DesignArtifact> daIndex = new HashMap<String, DesignArtifact>();
      final TreeIterator<EObject> it = resource.getAllContents();
      while (it.hasNext()) {
        {
          final EObject o = it.next();
          if ((o instanceof DesignArtifact)) {
            final DesignArtifact da = ((DesignArtifact) o);
            String _name = da.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              daIndex.put(da.getName(), da);
            }
          }
        }
      }
      final LinkedHashMap<String, Pair<String, Double>> result = new LinkedHashMap<String, Pair<String, Double>>();
      Set<String> _keySet = reqToSRs.keySet();
      TreeSet<String> _treeSet = new TreeSet<String>(_keySet);
      for (final String reqName : _treeSet) {
        {
          final HashMap<String, Integer> agg = new HashMap<String, Integer>();
          final LinkedHashSet<String> srs = reqToSRs.get(reqName);
          if ((srs != null)) {
            final RequirementTraceability tracer = new RequirementTraceability();
            for (final String srName : srs) {
              {
                final HashMap<String, Integer> m = tracer.upstreamArtifacts(CompensationFinder.toSR(srName), inEdges);
                Set<Map.Entry<String, Integer>> _entrySet = m.entrySet();
                for (final Map.Entry<String, Integer> e : _entrySet) {
                  {
                    final Integer prev = agg.get(e.getKey());
                    if (((prev == null) || (e.getValue().compareTo(prev) < 0))) {
                      agg.put(e.getKey(), e.getValue());
                    }
                  }
                }
              }
            }
          }
          final ArrayList<Pair<String, Double>> rows = new ArrayList<Pair<String, Double>>();
          Set<String> _keySet_1 = agg.keySet();
          for (final String name : _keySet_1) {
            {
              final DesignArtifact da = daIndex.get(name);
              double c = 0.5;
              if ((da != null)) {
                EClass _eClass = da.eClass();
                EStructuralFeature _eStructuralFeature = null;
                if (_eClass!=null) {
                  _eStructuralFeature=_eClass.getEStructuralFeature("changeability");
                }
                final EStructuralFeature sf = _eStructuralFeature;
                if (((sf != null) && da.eIsSet(sf))) {
                  final Object v = da.eGet(sf);
                  if ((v instanceof Number)) {
                    c = ((Number) v).doubleValue();
                  }
                }
              }
              Pair<String, Double> _pair = new Pair<String, Double>(name, Double.valueOf(c));
              rows.add(_pair);
            }
          }
          final Comparator<Pair<String, Double>> _function = (Pair<String, Double> a, Pair<String, Double> b) -> {
            int _xblockexpression_1 = (int) 0;
            {
              final int cmp = Double.compare((b.getValue()).doubleValue(), (a.getValue()).doubleValue());
              int _xifexpression = (int) 0;
              if ((cmp != 0)) {
                _xifexpression = cmp;
              } else {
                _xifexpression = a.getKey().compareTo(b.getKey());
              }
              _xblockexpression_1 = _xifexpression;
            }
            return _xblockexpression_1;
          };
          rows.sort(_function);
          boolean _isEmpty = rows.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            result.put(reqName, rows.get(0));
          }
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }

  private static String toSR(final String n) {
    return ("SR:" + n);
  }
}
