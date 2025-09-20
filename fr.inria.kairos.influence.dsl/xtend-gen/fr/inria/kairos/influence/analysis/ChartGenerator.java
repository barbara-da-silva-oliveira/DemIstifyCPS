package fr.inria.kairos.influence.analysis;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBubbleRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYZDataset;

@SuppressWarnings("all")
public class ChartGenerator {
  public static class InfRow {
    public final String originator;

    public final String compensator;

    public final double changeability;

    public InfRow(final String o, final String c, final double z) {
      this.originator = o;
      this.compensator = c;
      this.changeability = z;
    }
  }

  public void exportImpactBarPng(final Resource res, final IFileSystemAccess2 fsa, final String path, final int w, final int h) {
    try {
      final Map<String, Integer> impact = new ImpactMetrics().compute(res).impactArtifacts;
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
      final Map<String, Integer> impact = new ImpactMetrics().compute(res).impactArtifactsPropagated;
      boolean _isEmpty = impact.isEmpty();
      if (_isEmpty) {
        return;
      }
      final DefaultCategoryDataset ds = new DefaultCategoryDataset();
      Set<Map.Entry<String, Integer>> _entrySet = new TreeMap<String, Integer>(impact).entrySet();
      for (final Map.Entry<String, Integer> e : _entrySet) {
        Integer _value = e.getValue();
        ds.addValue(((Number) _value), "Direct+Indirect", e.getKey());
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
      final Map<String, Integer> impact = new ImpactMetrics().compute(res).impactArtifactsPropagated;
      boolean _isEmpty = impact.isEmpty();
      if (_isEmpty) {
        return;
      }
      final DefaultCategoryDataset ds = new DefaultCategoryDataset();
      Set<Map.Entry<String, Integer>> _entrySet = new TreeMap<String, Integer>(impact).entrySet();
      for (final Map.Entry<String, Integer> e : _entrySet) {
        Integer _value = e.getValue();
        ds.addValue(((Number) _value), "Direct+Indirect", e.getKey());
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
      final Map<String, Integer> impact = new ImpactMetrics().compute(res).impactPhenomena;
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
        "Impact by Phenomena", "Phenomena", "Origin count", ds);
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
      final RequirementTraceability tracer = new RequirementTraceability();
      final Map<String, DesignArtifact> daIndex = this.indexArtifacts(res);
      Iterable<Influence> _filter = Iterables.<Influence>filter(IteratorExtensions.<EObject>toIterable(res.getAllContents()), Influence.class);
      for (final Influence inf : _filter) {
        {
          final LinkedHashSet<String> originators = this.namesFromArtifactFeature(inf, "originatorArtifact");
          boolean _isEmpty = originators.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            final LinkedHashSet<String> cand = new LinkedHashSet<String>();
            final EStructuralFeature affectsF = inf.eClass().getEStructuralFeature("affects");
            if ((affectsF != null)) {
              Object _eGet = inf.eGet(affectsF);
              final Collection<?> srs = ((Collection<?>) _eGet);
              if ((srs != null)) {
                for (final Object sr : srs) {
                  {
                    final String srName = this.readName(((EObject) sr));
                    if ((srName != null)) {
                      cand.addAll(tracer.upstreamArtifacts(("SR:" + srName), inEdges).keySet());
                    }
                  }
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

  public List<ChartGenerator.InfRow> exportInfluenceBubblesPng(final Resource res, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges, final IFileSystemAccess2 fsa, final String path, final int w, final int h) {
    try {
      List<ChartGenerator.InfRow> _xblockexpression = null;
      {
        final List<ChartGenerator.InfRow> rows = this.bestCompensatorPerInfluence(res, reqToSRs, inEdges);
        boolean _isEmpty = rows.isEmpty();
        if (_isEmpty) {
          return rows;
        }
        final TreeSet<String> names = new TreeSet<String>();
        for (final ChartGenerator.InfRow r : rows) {
          {
            names.add(r.originator);
            names.add(r.compensator);
          }
        }
        final LinkedHashMap<String, Integer> nameToIdx = new LinkedHashMap<String, Integer>();
        int idx = 0;
        for (final String n : names) {
          {
            nameToIdx.put(n, Integer.valueOf(idx));
            idx = (idx + 1);
          }
        }
        final int N = rows.size();
        final double[] X = new double[N];
        final double[] Y = new double[N];
        final double[] Z = new double[N];
        int i = 0;
        for (final ChartGenerator.InfRow r_1 : rows) {
          {
            X[i] = nameToIdx.get(r_1.originator).doubleValue();
            Y[i] = nameToIdx.get(r_1.compensator).doubleValue();
            Z[i] = r_1.changeability;
            i = (i + 1);
          }
        }
        final DefaultXYZDataset ds = new DefaultXYZDataset();
        ds.addSeries("Influences", new double[][] { X, Y, Z });
        final NumberAxis xAxis = new NumberAxis("Originator");
        xAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        final NumberAxis yAxis = new NumberAxis("Compensator");
        yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        final XYBubbleRenderer renderer = new XYBubbleRenderer(XYBubbleRenderer.SCALE_ON_BOTH_AXES);
        final LinkedHashMap<Integer, String> idxToName = new LinkedHashMap<Integer, String>();
        int j = 0;
        for (final String nm : names) {
          {
            idxToName.put(Integer.valueOf(j), nm);
            j = (j + 1);
          }
        }
        renderer.setDefaultItemLabelsVisible(true);
        renderer.setDefaultItemLabelGenerator(new XYItemLabelGenerator() {
          @Override
          public String generateLabel(final XYDataset dataset, final int series, final int item) {
            String _xblockexpression = null;
            {
              final int ox = dataset.getX(series, item).intValue();
              final int oy = dataset.getY(series, item).intValue();
              String _xifexpression = null;
              boolean _containsKey = idxToName.containsKey(Integer.valueOf(ox));
              if (_containsKey) {
                _xifexpression = idxToName.get(Integer.valueOf(ox));
              } else {
                _xifexpression = String.valueOf(ox);
              }
              final String orgName = _xifexpression;
              String _xifexpression_1 = null;
              boolean _containsKey_1 = idxToName.containsKey(Integer.valueOf(oy));
              if (_containsKey_1) {
                _xifexpression_1 = idxToName.get(Integer.valueOf(oy));
              } else {
                _xifexpression_1 = String.valueOf(oy);
              }
              final String cmpName = _xifexpression_1;
              final double z = ((XYZDataset) dataset).getZValue(series, item);
              String _format = new DecimalFormat("#.##").format(z);
              String _plus = (((((("originator " + orgName) + " -> ") + " compensator ") + cmpName) + " [") + _format);
              _xblockexpression = (_plus + "]");
            }
            return _xblockexpression;
          }
        });
        StandardXYToolTipGenerator _standardXYToolTipGenerator = new StandardXYToolTipGenerator();
        renderer.setDefaultToolTipGenerator(_standardXYToolTipGenerator);
        final XYPlot plot = new XYPlot(ds, xAxis, yAxis, renderer);
        final JFreeChart chart = new JFreeChart(
          "Originator vs Compensator (bubble size = changeability)", 
          JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ChartUtils.writeChartAsPNG(baos, chart, w, h);
        this.writeBinary(fsa, path, baos.toByteArray());
        _xblockexpression = rows;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
}
