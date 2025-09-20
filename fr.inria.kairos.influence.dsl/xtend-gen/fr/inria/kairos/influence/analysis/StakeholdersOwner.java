package fr.inria.kairos.influence.analysis;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class StakeholdersOwner {
  public static class Row {
    public final String influence;

    public final int modelCount;

    public final String modelsCsv;

    public Row(final String influence, final int modelCount, final String modelsCsv) {
      this.influence = influence;
      this.modelCount = modelCount;
      this.modelsCsv = modelsCsv;
    }
  }

  public List<StakeholdersOwner.Row> analyze(final Resource res) {
    ArrayList<StakeholdersOwner.Row> _xblockexpression = null;
    {
      final ArrayList<StakeholdersOwner.Row> rows = new ArrayList<StakeholdersOwner.Row>();
      Iterable<Influence> _filter = Iterables.<Influence>filter(IteratorExtensions.<EObject>toIterable(res.getAllContents()), Influence.class);
      for (final Influence inf : _filter) {
        {
          final String iName = this.safeName(inf);
          final LinkedHashSet<DesignArtifact> originators = this.readArtifactsFeature(inf, "originatorArtifact");
          boolean _isEmpty = originators.isEmpty();
          if (_isEmpty) {
            StakeholdersOwner.Row _row = new StakeholdersOwner.Row(iName, 0, "");
            rows.add(_row);
          } else {
            final TreeSet<String> modelUris = new TreeSet<String>();
            for (final DesignArtifact da : originators) {
              {
                final EObject target = this.readRefEObject(da);
                if ((target != null)) {
                  modelUris.add(this.modelUriOf(target));
                }
              }
            }
            int _size = modelUris.size();
            String _joinSemi = this.joinSemi(modelUris);
            StakeholdersOwner.Row _row_1 = new StakeholdersOwner.Row(iName, _size, _joinSemi);
            rows.add(_row_1);
          }
        }
      }
      _xblockexpression = rows;
    }
    return _xblockexpression;
  }

  public void exportCSV(final Resource res, final IFileSystemAccess2 fsa, final String outPath) {
    final List<StakeholdersOwner.Row> rows = this.analyze(res);
    final StringBuilder sb = new StringBuilder("influence,model_count,models\n");
    for (final StakeholdersOwner.Row r : rows) {
      sb.append(this.csv(r.influence)).append(",").append(String.valueOf(r.modelCount)).append(",").append(this.csv(r.modelsCsv)).append("\n");
    }
    fsa.generateFile(outPath, sb.toString());
  }

  private String safeName(final Influence inf) {
    String _xblockexpression = null;
    {
      String _name = null;
      if (inf!=null) {
        _name=inf.getName();
      }
      final String n = _name;
      String _xifexpression = null;
      if ((n != null)) {
        _xifexpression = n;
      } else {
        _xifexpression = "<unnamed-influence>";
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  private LinkedHashSet<DesignArtifact> readArtifactsFeature(final EObject host, final String featureName) {
    LinkedHashSet<DesignArtifact> _xblockexpression = null;
    {
      final LinkedHashSet<DesignArtifact> out = new LinkedHashSet<DesignArtifact>();
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
            out.add(((DesignArtifact) e));
          }
        }
      }
      if (!_matched) {
        if (v instanceof DesignArtifact) {
          _matched=true;
          out.add(((DesignArtifact) v));
        }
      }
      if (!_matched) {
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }

  private EObject readRefEObject(final DesignArtifact da) {
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
    return _xifexpression;
  }

  private String modelUriOf(final EObject target) {
    URI _xifexpression = null;
    boolean _eIsProxy = target.eIsProxy();
    if (_eIsProxy) {
      _xifexpression = ((InternalEObject) target).eProxyURI();
    } else {
      _xifexpression = EcoreUtil.getURI(target);
    }
    final URI u = _xifexpression;
    URI _trimFragment = null;
    if (u!=null) {
      _trimFragment=u.trimFragment();
    }
    final URI base = _trimFragment;
    String _xifexpression_1 = null;
    if ((base != null)) {
      _xifexpression_1 = base.toString();
    } else {
      _xifexpression_1 = "<unknown>";
    }
    return _xifexpression_1;
  }

  private String joinSemi(final Iterable<String> xs) {
    String _xblockexpression = null;
    {
      if ((xs == null)) {
        return "";
      }
      final Iterator<String> it = xs.iterator();
      boolean _hasNext = it.hasNext();
      boolean _not = (!_hasNext);
      if (_not) {
        return "";
      }
      final StringBuilder sb = new StringBuilder();
      sb.append(it.next());
      while (it.hasNext()) {
        sb.append("; ").append(it.next());
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
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
}
