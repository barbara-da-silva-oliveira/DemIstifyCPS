package fr.inria.kairos.influence.export;

import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.analysis.ImpactMetrics;
import fr.inria.kairos.influence.analysis.RequirementTraceability;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class TablesExporter {
  private GraphBuilder.Result buildGraph(final Resource res) {
    return new GraphBuilder().build(res);
  }

  private ImpactMetrics.Result metrics(final Resource res) {
    return new ImpactMetrics().compute(res, this.buildGraph(res));
  }

  public void exportImpactCSVs(final Resource res, final IFileSystemAccess2 fsa, final String folder) {
    final ImpactMetrics.Result m = this.metrics(res);
    TreeMap<String, Integer> _treeMap = new TreeMap<String, Integer>(m.impactArtifacts);
    this.writeMapIntCSV(fsa, (folder + "/impact_artifacts.csv"), 
      "artifact,count", _treeMap);
    TreeMap<String, Integer> _treeMap_1 = new TreeMap<String, Integer>(m.impactEnvFactors);
    this.writeMapIntCSV(fsa, (folder + "/impact_env.csv"), 
      "phenomenon,count", _treeMap_1);
    TreeMap<String, Integer> _treeMap_2 = new TreeMap<String, Integer>(m.sensRequirements);
    this.writeMapIntCSV(fsa, (folder + "/sensitive_requirements.csv"), 
      "requirement,count", _treeMap_2);
    TreeMap<String, Double> _treeMap_3 = new TreeMap<String, Double>(m.impactArtifactsW);
    this.writeMapDoubleCSV(fsa, (folder + "/impact_artifacts_weighted.csv"), 
      "artifact,weight", _treeMap_3);
    TreeMap<String, Double> _treeMap_4 = new TreeMap<String, Double>(m.impactEnvFactorsW);
    this.writeMapDoubleCSV(fsa, (folder + "/impact_env_weighted.csv"), 
      "phenomenon,weight", _treeMap_4);
    TreeMap<String, Double> _treeMap_5 = new TreeMap<String, Double>(m.sensRequirementsW);
    this.writeMapDoubleCSV(fsa, (folder + "/sensitive_requirements_weighted.csv"), 
      "requirement,weight", _treeMap_5);
  }

  public void exportCandidatesByReqCSV(final Resource res, final IFileSystemAccess2 fsa, final String outPath, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    final GraphBuilder.Result graph = this.buildGraph(res);
    final RequirementTraceability tracer = new RequirementTraceability(graph);
    final StringBuilder sb = new StringBuilder("requirement,artifact,min_hops\n");
    Set<String> _keySet = reqToSRs.keySet();
    TreeSet<String> _treeSet = new TreeSet<String>(_keySet);
    for (final String reqName : _treeSet) {
      {
        final HashMap<String, Integer> agg = new HashMap<String, Integer>();
        final LinkedHashSet<String> srs = reqToSRs.get(reqName);
        if ((srs != null)) {
          for (final String srName : srs) {
            {
              final Map<String, Integer> m = tracer.upstreamArtifacts(("SR:" + srName), inEdges);
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
        final ArrayList<Pair<String, Integer>> rows = new ArrayList<Pair<String, Integer>>();
        Set<String> _keySet_1 = agg.keySet();
        for (final String name : _keySet_1) {
          Integer _get = agg.get(name);
          Pair<String, Integer> _pair = new Pair<String, Integer>(name, _get);
          rows.add(_pair);
        }
        final Comparator<Pair<String, Integer>> _function = (Pair<String, Integer> a, Pair<String, Integer> b) -> {
          int _xblockexpression = (int) 0;
          {
            final int c = Integer.compare((a.getValue()).intValue(), (b.getValue()).intValue());
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
        rows.sort(_function);
        boolean _isEmpty = rows.isEmpty();
        if (_isEmpty) {
          sb.append(this.csv(reqName)).append(",(none),").append("").append("\n");
        } else {
          for (final Pair<String, Integer> r : rows) {
            sb.append(this.csv(reqName)).append(",").append(this.csv(r.getKey())).append(",").append(String.valueOf(r.getValue())).append("\n");
          }
        }
      }
    }
    fsa.generateFile(outPath, sb.toString());
  }

  public void exportCompensatorRankingByReqCSV(final Resource res, final IFileSystemAccess2 fsa, final String outPath, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    final Map<String, DesignArtifact> daIndex = this.indexArtifacts(res);
    final StringBuilder sb = new StringBuilder("requirement,artifact,changeability\n");
    Set<String> _keySet = reqToSRs.keySet();
    TreeSet<String> _treeSet = new TreeSet<String>(_keySet);
    for (final String reqName : _treeSet) {
      {
        final HashMap<String, Integer> agg = new HashMap<String, Integer>();
        final LinkedHashSet<String> srs = reqToSRs.get(reqName);
        if ((srs != null)) {
          final GraphBuilder.Result graph = this.buildGraph(res);
          final RequirementTraceability tracer = new RequirementTraceability(graph);
          for (final String srName : srs) {
            {
              final Map<String, Integer> m = tracer.upstreamArtifacts(("SR:" + srName), inEdges);
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
              c = this.readChangeability(da);
            }
            Pair<String, Double> _pair = new Pair<String, Double>(name, Double.valueOf(c));
            rows.add(_pair);
          }
        }
        final Comparator<Pair<String, Double>> _function = (Pair<String, Double> a, Pair<String, Double> b) -> {
          int _xblockexpression = (int) 0;
          {
            final int cmp = Double.compare((b.getValue()).doubleValue(), (a.getValue()).doubleValue());
            int _xifexpression = (int) 0;
            if ((cmp != 0)) {
              _xifexpression = cmp;
            } else {
              _xifexpression = a.getKey().compareTo(b.getKey());
            }
            _xblockexpression = _xifexpression;
          }
          return _xblockexpression;
        };
        rows.sort(_function);
        boolean _isEmpty = rows.isEmpty();
        if (_isEmpty) {
          sb.append(this.csv(reqName)).append(",(none),").append("").append("\n");
        } else {
          for (final Pair<String, Double> r : rows) {
            sb.append(this.csv(reqName)).append(",").append(this.csv(r.getKey())).append(",").append(this.fmtDouble(r.getValue())).append("\n");
          }
        }
      }
    }
    fsa.generateFile(outPath, sb.toString());
  }

  private void writeMapIntCSV(final IFileSystemAccess2 fsa, final String path, final String header, final Map<String, Integer> m) {
    final StringBuilder sb = new StringBuilder(header).append("\n");
    Set<Map.Entry<String, Integer>> _entrySet = m.entrySet();
    for (final Map.Entry<String, Integer> e : _entrySet) {
      sb.append(this.csv(e.getKey())).append(",").append(String.valueOf(e.getValue())).append("\n");
    }
    fsa.generateFile(path, sb.toString());
  }

  private void writeMapDoubleCSV(final IFileSystemAccess2 fsa, final String path, final String header, final Map<String, Double> m) {
    final StringBuilder sb = new StringBuilder(header).append("\n");
    Set<Map.Entry<String, Double>> _entrySet = m.entrySet();
    for (final Map.Entry<String, Double> e : _entrySet) {
      sb.append(this.csv(e.getKey())).append(",").append(this.fmtDouble(e.getValue())).append("\n");
    }
    fsa.generateFile(path, sb.toString());
  }

  private String csv(final String s) {
    String _xblockexpression = null;
    {
      if ((s == null)) {
        return "";
      }
      final boolean needs = ((((s.indexOf(",") >= 0) || (s.indexOf("\"") >= 0)) || (s.indexOf("\n") >= 0)) || (s.indexOf("\r") >= 0));
      final String esc = s.replace("\"", "\"\"");
      String _xifexpression = null;
      if (needs) {
        _xifexpression = (("\"" + esc) + "\"");
      } else {
        _xifexpression = esc;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  private String fmtDouble(final Double d) {
    String _xblockexpression = null;
    {
      if ((d == null)) {
        return "";
      }
      _xblockexpression = String.format(Locale.US, "%.4f", Double.valueOf(d.doubleValue()));
    }
    return _xblockexpression;
  }

  private Map<String, DesignArtifact> indexArtifacts(final Resource res) {
    LinkedHashMap<String, DesignArtifact> _xblockexpression = null;
    {
      final LinkedHashMap<String, DesignArtifact> map = new LinkedHashMap<String, DesignArtifact>();
      final TreeIterator<EObject> it = res.getAllContents();
      while (it.hasNext()) {
        {
          final EObject any = it.next();
          if ((any instanceof DesignArtifact)) {
            final DesignArtifact da = ((DesignArtifact) any);
            String _name = da.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              map.put(da.getName(), da);
            }
          }
        }
      }
      _xblockexpression = map;
    }
    return _xblockexpression;
  }

  private double readChangeability(final DesignArtifact da) {
    double _xblockexpression = (double) 0;
    {
      double c = 0.5;
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
      _xblockexpression = c;
    }
    return _xblockexpression;
  }
}
