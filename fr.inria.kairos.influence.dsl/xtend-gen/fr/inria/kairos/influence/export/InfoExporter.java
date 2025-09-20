package fr.inria.kairos.influence.export;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class InfoExporter {
  public void appendSortedIntMap(final StringBuilder sb, final HashMap<String, Integer> map) {
    Set<Map.Entry<String, Integer>> _entrySet = map.entrySet();
    final ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(_entrySet);
    final Comparator<Map.Entry<String, Integer>> _function = (Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> {
      int _xblockexpression = (int) 0;
      {
        final int c = Integer.compare((b.getValue()).intValue(), (a.getValue()).intValue());
        int _xifexpression = (int) 0;
        if ((c != 0)) {
          _xifexpression = c;
        } else {
          _xifexpression = a.getKey().compareTo(b.getKey());
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    list.sort(_function);
    for (final Map.Entry<String, Integer> e : list) {
      sb.append("  ").append(e.getKey()).append(" -> ").append(e.getValue()).append("\n");
    }
  }

  public void appendSortedDoubleMap(final StringBuilder sb, final HashMap<String, Double> map) {
    Set<Map.Entry<String, Double>> _entrySet = map.entrySet();
    final ArrayList<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(_entrySet);
    final Comparator<Map.Entry<String, Double>> _function = (Map.Entry<String, Double> a, Map.Entry<String, Double> b) -> {
      int _xblockexpression = (int) 0;
      {
        final int c = Double.compare((b.getValue()).doubleValue(), (a.getValue()).doubleValue());
        int _xifexpression = (int) 0;
        if ((c != 0)) {
          _xifexpression = c;
        } else {
          _xifexpression = a.getKey().compareTo(b.getKey());
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    list.sort(_function);
    for (final Map.Entry<String, Double> e : list) {
      sb.append("  ").append(e.getKey()).append(" -> ").append(e.getValue()).append("\n");
    }
  }
}
