package fr.inria.kairos.influence.analysis;

import org.eclipse.emf.ecore.*;
import java.util.*;
import java.util.regex.Pattern;

// Extract numeric values from external design EObjects
public final class DesignValueArtifacts {

  private static final Set<String> PREFERRED_NAMES = Set.of(
      "value","default","defaultValue","initialValue","initial","literal","val"
  );

  private static final Pattern NUM = Pattern.compile(
      "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$"
  );

// Try best-effort to extract a double from an EObject
  public static OptionalDouble resolveNumeric(EObject obj) {
    if (obj == null) return OptionalDouble.empty();

    // 1) Preferred-named features first (exact matches)
    for (String name : PREFERRED_NAMES) {
      EStructuralFeature f = obj.eClass().getEStructuralFeature(name);
      OptionalDouble got = readFeature(obj, f);
      if (got.isPresent()) return got;
    }

    // 2) Any numeric EAttribute that is set (or has a numeric default/default literal)
    for (EAttribute a : obj.eClass().getEAllAttributes()) {
      Object v = safeGet(obj, a);
      if (v != null) {
        OptionalDouble got = coerceNumberOrParse(v);
        if (got.isPresent()) return got;
      }
      Object def = a.getDefaultValue();
      if (def instanceof Number n) return OptionalDouble.of(n.doubleValue());
      String lit = a.getDefaultValueLiteral();
      if (lit != null && NUM.matcher(lit.trim()).matches())
        return OptionalDouble.of(Double.parseDouble(lit.trim()));
    }

    // 3) Look one level down in contents for a child holding a numeric literal (e.g., UML LiteralReal.value)
    for (EObject c : obj.eContents()) {
      OptionalDouble got = resolveNumeric(c);
      if (got.isPresent()) return got;
    }

    // 4) Read meta-level (EClass) annotations, not EObject annotations
    //    EClass with a numeric detail, source="influence"  details: {"value"="0.15"}
    for (EAnnotation ann : obj.eClass().getEAnnotations()) {
      for (Map.Entry<String, String> e : ann.getDetails().entrySet()) {
        String sv = String.valueOf(e.getValue()).trim();
        if (NUM.matcher(sv).matches())
          return OptionalDouble.of(Double.parseDouble(sv));
      }
    }

    return OptionalDouble.empty();
  }

  // --- helpers ---

  private static OptionalDouble readFeature(EObject obj, EStructuralFeature f) {
    if (f == null) return OptionalDouble.empty();
    Object v = safeGet(obj, f);
    if (v == null) return OptionalDouble.empty();

    if (v instanceof Number n) return OptionalDouble.of(n.doubleValue());
    if (v instanceof String s && NUM.matcher(s.trim()).matches())
      return OptionalDouble.of(Double.parseDouble(s.trim()));
    if (v instanceof EObject eo) return resolveNumeric(eo); 

    return OptionalDouble.empty();
  }

  private static OptionalDouble coerceNumberOrParse(Object v) {
    if (v instanceof Number n) return OptionalDouble.of(n.doubleValue());
    if (v instanceof String s && NUM.matcher(s.trim()).matches())
      return OptionalDouble.of(Double.parseDouble(s.trim()));
    return OptionalDouble.empty();
  }

  private static Object safeGet(EObject obj, EStructuralFeature f) {
    try {
      if (f == null) return null;
      return obj.eIsSet(f) ? obj.eGet(f) : null;
    } catch (Exception ignore) {
      return null;
    }
  }

  private DesignValueArtifacts() {}
}

