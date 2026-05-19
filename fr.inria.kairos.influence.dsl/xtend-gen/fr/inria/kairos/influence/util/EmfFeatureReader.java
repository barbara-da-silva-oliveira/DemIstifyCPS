package fr.inria.kairos.influence.util;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EmfFeatureReader {
  public static String stringFeature(final EObject o, final String featureName) {
    Object _xblockexpression = null;
    {
      if ((o == null)) {
        return null;
      }
      EClass _eClass = o.eClass();
      EStructuralFeature _eStructuralFeature = null;
      if (_eClass!=null) {
        _eStructuralFeature=_eClass.getEStructuralFeature(featureName);
      }
      final EStructuralFeature f = _eStructuralFeature;
      if ((f == null)) {
        return null;
      }
      final Object v = o.eGet(f);
      if ((v instanceof String)) {
        return ((String) v);
      }
      if ((v instanceof List<?>)) {
        final Function1<Object, Boolean> _function = (Object it) -> {
          return Boolean.valueOf((it != null));
        };
        final Function1<Object, String> _function_1 = (Object it) -> {
          return String.valueOf(it);
        };
        return IterableExtensions.join(IterableExtensions.map(IterableExtensions.filter(((List<?>) v), _function), _function_1), ", ");
      }
      _xblockexpression = null;
    }
    return ((String)_xblockexpression);
  }
}
