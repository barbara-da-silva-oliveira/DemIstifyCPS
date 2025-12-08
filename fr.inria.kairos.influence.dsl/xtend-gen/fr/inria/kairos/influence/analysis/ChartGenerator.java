package fr.inria.kairos.influence.analysis;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

@SuppressWarnings("all")
public class ChartGenerator {
  public static class InfRow {
    public final String prejudicial;

    public final String compensator;

    public final double changeability;

    public InfRow(final String o, final String c, final double z) {
      this.prejudicial = o;
      this.compensator = c;
      this.changeability = z;
    }
  }

  private GraphBuilder.Result buildGraph(final Resource res) {
    return new GraphBuilder().build(res);
  }

  private ImpactMetrics.Result metrics(final Resource res) {
    ImpactMetrics.Result _xblockexpression = null;
    {
      final GraphBuilder.Result gb = this.buildGraph(res);
      _xblockexpression = new ImpactMetrics().compute(res, gb);
    }
    return _xblockexpression;
  }

  public void exportImpactBarPng(final Resource res, final IFileSystemAccess2 fsa, final String path, final int w, final int h) {
    try {
      final ImpactMetrics.Result m = this.metrics(res);
      final Map<String, Integer> impact = m.impactArtifacts;
      boolean _isEmpty = impact.isEmpty();
      if (_isEmpty) {
        return;
      }
      final DefaultCategoryDataset ds = new DefaultCategoryDataset();
      Set<Map.Entry<String, Integer>> _entrySet = new TreeMap<String, Integer>(impact).entrySet();
      for (final Map.Entry<String, Integer> e : _entrySet) {
        Integer _value = e.getValue();
        ds.addValue(((Number) _value), "Impact", e.getKey());
      }
      final JFreeChart chart = ChartFactory.createBarChart(
        "Impact by Artifact", "Artifact", "Origin count", ds);
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ChartUtils.writeChartAsPNG(baos, chart, w, h);
      this.writeBinary(fsa, path, baos.toByteArray());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public void exportPropagationImpactBarPng(final Resource res, final IFileSystemAccess2 fsa, final String path, final int w, final int h) {
    try {
      final ImpactMetrics.Result m = this.metrics(res);
      final Map<String, Integer> prop = m.impactArtifactsPropagated;
      if (((prop == null) || prop.isEmpty())) {
        return;
      }
      final DefaultCategoryDataset ds = new DefaultCategoryDataset();
      final TreeMap<String, Number> sorted = new TreeMap<String, Number>();
      Set<Map.Entry<String, Integer>> _entrySet = prop.entrySet();
      for (final Map.Entry<String, Integer> e : _entrySet) {
        Integer _value = e.getValue();
        sorted.put(e.getKey(), ((Number) _value));
      }
      Set<Map.Entry<String, Number>> _entrySet_1 = sorted.entrySet();
      for (final Map.Entry<String, Number> e_1 : _entrySet_1) {
        ds.addValue(e_1.getValue(), "Direct + Indirect", e_1.getKey());
      }
      final JFreeChart chart = ChartFactory.createBarChart(
        "Propagated Impact by Artifact", "Artifact", "Influences (direct + cascaded)", ds);
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ChartUtils.writeChartAsPNG(baos, chart, w, h);
      this.writeBinary(fsa, path, baos.toByteArray());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public void exportOnlyIndirectImpactBarPng(final Resource res, final IFileSystemAccess2 fsa, final String path, final int w, final int h) {
    try {
      final ImpactMetrics.Result m = this.metrics(res);
      final Map<String, Integer> ind = m.impactArtifactsIndirect;
      if (((ind == null) || ind.isEmpty())) {
        return;
      }
      final DefaultCategoryDataset ds = new DefaultCategoryDataset();
      final TreeMap<String, Number> sorted = new TreeMap<String, Number>();
      Set<Map.Entry<String, Integer>> _entrySet = ind.entrySet();
      for (final Map.Entry<String, Integer> e : _entrySet) {
        Integer _value = e.getValue();
        sorted.put(e.getKey(), ((Number) _value));
      }
      Set<Map.Entry<String, Number>> _entrySet_1 = sorted.entrySet();
      for (final Map.Entry<String, Number> e_1 : _entrySet_1) {
        ds.addValue(e_1.getValue(), "Indirect only", e_1.getKey());
      }
      final JFreeChart chart = ChartFactory.createBarChart(
        "Propagated Impact by Artifact", "Artifact", "Influences (direct + cascaded)", ds);
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ChartUtils.writeChartAsPNG(baos, chart, w, h);
      this.writeBinary(fsa, path, baos.toByteArray());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public void exportPhenomenaBarPng(final Resource res, final IFileSystemAccess2 fsa, final String path, final int w, final int h) {
    try {
      final ImpactMetrics.Result m = this.metrics(res);
      final Map<String, Integer> impact = m.impactEnvFactors;
      if (((impact == null) || impact.isEmpty())) {
        return;
      }
      final DefaultCategoryDataset ds = new DefaultCategoryDataset();
      Set<Map.Entry<String, Integer>> _entrySet = new TreeMap<String, Integer>(impact).entrySet();
      for (final Map.Entry<String, Integer> e : _entrySet) {
        Integer _value = e.getValue();
        ds.addValue(((Number) _value), "Impact", e.getKey());
      }
      final JFreeChart chart = ChartFactory.createBarChart(
        "Impact by Environment Factor", "Environment Factor", "Participant count", ds);
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      ChartUtils.writeChartAsPNG(baos, chart, w, h);
      this.writeBinary(fsa, path, baos.toByteArray());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public List<ChartGenerator.InfRow> bestCompensatorPerInfluence(final Resource res, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    ArrayList<ChartGenerator.InfRow> _xblockexpression = null;
    {
      final ArrayList<ChartGenerator.InfRow> out = new ArrayList<ChartGenerator.InfRow>();
      final GraphBuilder.Result graph = this.buildGraph(res);
      final RequirementTraceability tracer = new RequirementTraceability(graph);
      final Map<String, DesignArtifact> daIndex = this.indexArtifacts(res);
      Iterable<Influence> _filter = Iterables.<Influence>filter(IteratorExtensions.<EObject>toIterable(res.getAllContents()), Influence.class);
      for (final Influence inf : _filter) {
        {
          final LinkedHashSet<String> originators = this.namesFromArtifactFeature(inf, "originatorArtifact");
          boolean _isEmpty = originators.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            final LinkedHashSet<String> cand = new LinkedHashSet<String>();
            final ArrayList<EObject> srs = this.srsFromInfluence(inf);
            for (final EObject sr : srs) {
              {
                final String srName = this.readName(((EObject) sr));
                if ((srName != null)) {
                  cand.addAll(tracer.upstreamArtifacts(("SR:" + srName), inEdges).keySet());
                }
              }
            }
            boolean _isEmpty_1 = cand.isEmpty();
            boolean _not_1 = (!_isEmpty_1);
            if (_not_1) {
              String bestName = null;
              Double bestVal = null;
              for (final String nm : cand) {
                {
                  final DesignArtifact da = daIndex.get(nm);
                  double c = 0.5;
                  if ((da != null)) {
                    c = this.readChangeability(da);
                  }
                  if (((bestVal == null) || (c > (bestVal).doubleValue()))) {
                    bestVal = Double.valueOf(c);
                    bestName = nm;
                  }
                }
              }
              if (((bestName != null) && (bestVal != null))) {
                for (final String o : originators) {
                  ChartGenerator.InfRow _infRow = new ChartGenerator.InfRow(o, bestName, (bestVal).doubleValue());
                  out.add(_infRow);
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

  public Map<String, LinkedHashMap<String, Double>> allCompensatorsByOriginator(final Resource res, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    LinkedHashMap<String, LinkedHashMap<String, Double>> _xblockexpression = null;
    {
      final LinkedHashMap<String, LinkedHashMap<String, Double>> out = new LinkedHashMap<String, LinkedHashMap<String, Double>>();
      final GraphBuilder.Result graph = this.buildGraph(res);
      final RequirementTraceability tracer = new RequirementTraceability(graph);
      final Map<String, DesignArtifact> daIndex = this.indexArtifacts(res);
      Iterable<Influence> _filter = Iterables.<Influence>filter(IteratorExtensions.<EObject>toIterable(res.getAllContents()), Influence.class);
      for (final Influence inf : _filter) {
        {
          final LinkedHashSet<String> originators = this.namesFromArtifactFeature(inf, "originatorArtifact");
          boolean _isEmpty = originators.isEmpty();
          if (_isEmpty) {
          } else {
            final LinkedHashSet<String> cand = new LinkedHashSet<String>();
            final ArrayList<EObject> srs = this.srsFromInfluence(inf);
            for (final EObject sr : srs) {
              {
                final String srName = this.readName(((EObject) sr));
                if ((srName != null)) {
                  cand.addAll(tracer.upstreamArtifacts(("SR:" + srName), inEdges).keySet());
                }
              }
            }
            boolean _isEmpty_1 = cand.isEmpty();
            if (_isEmpty_1) {
            } else {
              final LinkedHashMap<String, Double> compToChange = new LinkedHashMap<String, Double>();
              for (final String nm : cand) {
                {
                  final DesignArtifact da = daIndex.get(nm);
                  double c = 0.5;
                  if ((da != null)) {
                    c = this.readChangeability(da);
                  }
                  final Double prev = compToChange.get(nm);
                  if (((prev == null) || (c > (prev).doubleValue()))) {
                    compToChange.put(nm, Double.valueOf(c));
                  }
                }
              }
              for (final String o : originators) {
                {
                  LinkedHashMap<String, Double> bucket = out.get(o);
                  if ((bucket == null)) {
                    LinkedHashMap<String, Double> _linkedHashMap = new LinkedHashMap<String, Double>();
                    bucket = _linkedHashMap;
                    out.put(o, bucket);
                  }
                  Set<Map.Entry<String, Double>> _entrySet = compToChange.entrySet();
                  for (final Map.Entry<String, Double> e : _entrySet) {
                    {
                      final Double prev = bucket.get(e.getKey());
                      if (((prev == null) || (e.getValue().compareTo(prev) > 0))) {
                        bucket.put(e.getKey(), e.getValue());
                      }
                    }
                  }
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

  private LinkedHashSet<String> namesFromArtifactFeature(final EObject host, final String featureName) {
    LinkedHashSet<String> _xblockexpression = null;
    {
      final LinkedHashSet<String> out = new LinkedHashSet<String>();
      final EStructuralFeature f = host.eClass().getEStructuralFeature(featureName);
      if ((f == null)) {
        return out;
      }
      final Object v = host.eGet(f);
      boolean _matched = false;
      if (v instanceof Collection) {
        _matched=true;
        for (final Object e : ((Collection<?>)v)) {
          if ((e instanceof DesignArtifact)) {
            final String nm = ((DesignArtifact) e).getName();
            if ((nm != null)) {
              out.add(nm);
            }
          }
        }
      }
      if (!_matched) {
        if (v instanceof DesignArtifact) {
          _matched=true;
          final String nm = ((DesignArtifact) v).getName();
          if ((nm != null)) {
            out.add(nm);
          }
        }
      }
      if (!_matched) {
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }

  private String readName(final EObject obj) {
    String _xblockexpression = null;
    {
      final EStructuralFeature nf = obj.eClass().getEStructuralFeature("name");
      if ((nf == null)) {
        return null;
      }
      final Object nv = obj.eGet(nf);
      String _xifexpression = null;
      if ((nv instanceof String)) {
        _xifexpression = ((String) nv);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  private double readChangeability(final DesignArtifact da) {
    double _xblockexpression = (double) 0;
    {
      double c = 1.0;
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

  private void writeBinary(final IFileSystemAccess2 fsa, final String path, final byte[] bytes) {
    try {
      final Method[] methods = fsa.getClass().getMethods();
      Method mi = null;
      for (final Method m : methods) {
        if ((Objects.equals(m.getName(), "generateFile") && (m.getParameterTypes().length == 2))) {
          if ((Objects.equals(m.getParameterTypes()[0], String.class) && 
            (m.getParameterTypes()[1]).getName().contains("InputStream"))) {
            mi = m;
          }
        }
      }
      if ((mi != null)) {
        ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(bytes);
        mi.invoke(fsa, path, _byteArrayInputStream);
      } else {
        fsa.generateFile((path + ".txt"), "Binary output not supported by this IFileSystemAccess.");
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _simpleName = e.getClass().getSimpleName();
        String _plus = ("Binary output failed: " + _simpleName);
        String _plus_1 = (_plus + ": ");
        String _message = e.getMessage();
        String _plus_2 = (_plus_1 + _message);
        fsa.generateFile((path + ".txt"), _plus_2);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }

  private ArrayList<EObject> srsFromInfluence(final EObject inf) {
    ArrayList<EObject> _xblockexpression = null;
    {
      final ArrayList<EObject> out = new ArrayList<EObject>();
      if ((inf == null)) {
        return out;
      }
      for (final String fn : Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("affects", "affectsSR", "affectsSRP", "affectedSRs", "affectsSystemResponse"))) {
        {
          EClass _eClass = inf.eClass();
          EStructuralFeature _eStructuralFeature = null;
          if (_eClass!=null) {
            _eStructuralFeature=_eClass.getEStructuralFeature(fn);
          }
          final EStructuralFeature f = _eStructuralFeature;
          if ((f != null)) {
            final Object v = inf.eGet(f);
            boolean _matched = false;
            if (v instanceof Collection) {
              _matched=true;
              for (final Object e : ((Collection<?>)v)) {
                if ((e instanceof EObject)) {
                  out.add(((EObject) e));
                }
              }
            }
            if (!_matched) {
              if (v instanceof EObject) {
                _matched=true;
                out.add(((EObject) v));
              }
            }
            if (!_matched) {
            }
            boolean _isEmpty = out.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              return out;
            }
          }
        }
      }
      for (final String fn_1 : Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("outputSRP", "output", "resultSR", "resultSRP"))) {
        {
          EClass _eClass = inf.eClass();
          EStructuralFeature _eStructuralFeature = null;
          if (_eClass!=null) {
            _eStructuralFeature=_eClass.getEStructuralFeature(fn_1);
          }
          final EStructuralFeature f = _eStructuralFeature;
          if ((f != null)) {
            final Object v = inf.eGet(f);
            if ((v instanceof EObject)) {
              out.add(((EObject) v));
            }
            boolean _isEmpty = out.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              return out;
            }
          }
        }
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
}
