package fr.inria.kairos.influence.analysis;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class TradeOff {
  public static class TradeoffRow {
    public final String influence;

    public final String originator;

    public final String compensator;

    public final double changeability;

    public final int alsoOriginatorCount;

    public final String alsoOriginatorIn;

    public TradeoffRow(final String influence, final String originator, final String compensator, final double changeability, final int alsoOriginatorCount, final String alsoOriginatorIn) {
      this.influence = influence;
      this.originator = originator;
      this.compensator = compensator;
      this.changeability = changeability;
      this.alsoOriginatorCount = alsoOriginatorCount;
      this.alsoOriginatorIn = alsoOriginatorIn;
    }
  }

  public List<TradeOff.TradeoffRow> analyze(final Resource res, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    ArrayList<TradeOff.TradeoffRow> _xblockexpression = null;
    {
      final ArrayList<TradeOff.TradeoffRow> rows = new ArrayList<TradeOff.TradeoffRow>();
      final Map<String, DesignArtifact> daIndex = this.indexArtifacts(res);
      final LinkedHashMap<String, LinkedHashSet<String>> inflToOriginators = new LinkedHashMap<String, LinkedHashSet<String>>();
      final LinkedHashMap<String, LinkedHashSet<String>> artToInfluences = new LinkedHashMap<String, LinkedHashSet<String>>();
      Iterable<Influence> _filter = Iterables.<Influence>filter(IteratorExtensions.<EObject>toIterable(res.getAllContents()), Influence.class);
      for (final Influence inf : _filter) {
        {
          final String iName = inf.getName();
          final LinkedHashSet<String> originators = this.namesFromArtifactFeature(inf, "originatorArtifact");
          boolean _isEmpty = originators.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            inflToOriginators.put(iName, originators);
            for (final String a : originators) {
              {
                LinkedHashSet<String> s = artToInfluences.get(a);
                if ((s == null)) {
                  LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>();
                  s = _linkedHashSet;
                  artToInfluences.put(a, s);
                }
                s.add(iName);
              }
            }
          }
        }
      }
      final RequirementTraceability tracer = new RequirementTraceability();
      Iterable<Influence> _filter_1 = Iterables.<Influence>filter(IteratorExtensions.<EObject>toIterable(res.getAllContents()), Influence.class);
      for (final Influence inf_1 : _filter_1) {
        {
          final String iName = inf_1.getName();
          final LinkedHashSet<String> originators = inflToOriginators.get(iName);
          if (((originators == null) || originators.isEmpty())) {
          } else {
            final LinkedHashSet<String> cand = new LinkedHashSet<String>();
            final EStructuralFeature affectsF = inf_1.eClass().getEStructuralFeature("affects");
            if ((affectsF != null)) {
              Object _eGet = inf_1.eGet(affectsF);
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
            boolean _isEmpty = cand.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
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
                LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>();
                LinkedHashSet<String> _orDefault = artToInfluences.getOrDefault(bestName, _linkedHashSet);
                final TreeSet<String> whereCompIsOrigin = new TreeSet<String>(_orDefault);
                whereCompIsOrigin.remove(iName);
                final String joined = IterableExtensions.join(whereCompIsOrigin, "; ");
                for (final String o : originators) {
                  int _size = whereCompIsOrigin.size();
                  TradeOff.TradeoffRow _tradeoffRow = new TradeOff.TradeoffRow(iName, o, bestName, (bestVal).doubleValue(), _size, joined);
                  rows.add(_tradeoffRow);
                }
              }
            }
          }
        }
      }
      _xblockexpression = rows;
    }
    return _xblockexpression;
  }

  public void exportCSV(final Resource res, final IFileSystemAccess2 fsa, final String path, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, LinkedHashSet<String>> inEdges) {
    final List<TradeOff.TradeoffRow> rows = this.analyze(res, reqToSRs, inEdges);
    final StringBuilder sb = new StringBuilder(
      "influence,compensator,count,influence_originator\n");
    for (final TradeOff.TradeoffRow r : rows) {
      sb.append(this.csv(r.influence)).append(",").append(this.csv(r.compensator)).append(",").append(String.valueOf(r.alsoOriginatorCount)).append(",").append(this.csv(r.alsoOriginatorIn)).append("\n");
    }
    fsa.generateFile(path, sb.toString());
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

  private String csv(final String s) {
    String _xblockexpression = null;
    {
      final boolean needs = ((((s.indexOf(",") >= 0) || (s.indexOf("\"") >= 0)) || (s.indexOf("\\n") >= 0)) || (s.indexOf("\\r") >= 0));
      final String esc = s;
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
}
