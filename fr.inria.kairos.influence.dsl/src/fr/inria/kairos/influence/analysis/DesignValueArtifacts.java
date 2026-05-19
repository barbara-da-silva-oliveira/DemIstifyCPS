package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.metamodel.DesignArtifact;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.regex.Pattern;

/*
 * Best-effort extraction of numeric values from external design model objects.
 *
 * DSL semantics:
 *
 *   DesignArtifact.ref : EObject
 *
 * The numeric value of an ArtifactParticipant is obtained from the referenced
 * design EObject, not from the Influence DSL itself.
 *
 */
public final class DesignValueArtifacts {

	private static final int MAX_RECURSION_DEPTH = 4;

	private static final Set<String> PREFERRED_NAMES = Set.of(
		"value",
		"default",
		"defaultValue",
		"initialValue",
		"initial",
		"literal",
		"val",
		"numericValue",
		"realValue",
		"doubleValue",
		"configuredValue",
		"parameterValue",
		"nominal",
		"nominalValue"
	);

	private static final Pattern NUM = Pattern.compile(
		"^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$"
	);

	/**
	 * Preferred entry point for the Influence DSL.
	 *
	 * Reads the numeric value from:
	 *
	 *   DesignArtifact.ref
	 */
	public static OptionalDouble resolveNumeric(DesignArtifact artifact) {
		if (artifact == null) {
			return OptionalDouble.empty();
		}

		EObject ref = artifact.getRef();

		if (ref == null) {
			return OptionalDouble.empty();
		}

		return resolveNumeric(ref);
	}

	/*
	 * Try best-effort to extract a double from an EObject.
	 */
	public static OptionalDouble resolveNumeric(EObject object) {
		Set<EObject> visited = Collections.newSetFromMap(new IdentityHashMap<>());
		return resolveNumeric(object, visited, 0);
	}

	private static OptionalDouble resolveNumeric(
		EObject object,
		Set<EObject> visited,
		int depth
	) {
		if (object == null) {
			return OptionalDouble.empty();
		}

		if (depth > MAX_RECURSION_DEPTH) {
			return OptionalDouble.empty();
		}

		EObject resolved = resolveProxyIfNeeded(object);

		if (resolved == null) {
			return OptionalDouble.empty();
		}

		if (visited.contains(resolved)) {
			return OptionalDouble.empty();
		}

		visited.add(resolved);

		/*
		 * 1. Preferred feature names, exact match.
		 */
		for (String name : PREFERRED_NAMES) {
			EStructuralFeature feature = resolved.eClass().getEStructuralFeature(name);
			OptionalDouble value = readFeature(resolved, feature, visited, depth + 1);

			if (value.isPresent()) {
				return value;
			}
		}

		/*
		 * 2. Preferred feature names, case-insensitive match.
		 */
		for (String preferred : PREFERRED_NAMES) {
			for (EStructuralFeature feature : resolved.eClass().getEAllStructuralFeatures()) {
				if (
					feature.getName() != null
					&& feature.getName().equalsIgnoreCase(preferred)
				) {
					OptionalDouble value = readFeature(resolved, feature, visited, depth + 1);

					if (value.isPresent()) {
						return value;
					}
				}
			}
		}

		/*
		 * 3. Any numeric attribute that is set.
		 *
		 * No feature-name filtering here: the referenced EObject belongs to the
		 * developer's design model, so the model semantics are trusted.
		 */
		for (EAttribute attribute : resolved.eClass().getEAllAttributes()) {
			Object value = safeGet(resolved, attribute);

			if (value != null) {
				OptionalDouble numeric = coerceNumberOrParse(value);

				if (numeric.isPresent()) {
					return numeric;
				}
			}
		}

		/*
		 * 4. Numeric default/default literal on attributes.
		 */
		for (EAttribute attribute : resolved.eClass().getEAllAttributes()) {
			Object defaultValue = attribute.getDefaultValue();

			if (defaultValue instanceof Number number) {
				return OptionalDouble.of(number.doubleValue());
			}

			String defaultLiteral = attribute.getDefaultValueLiteral();

			if (isNumericString(defaultLiteral)) {
				return OptionalDouble.of(Double.parseDouble(defaultLiteral.trim()));
			}
		}

		/*
		 * 5. If a structural feature references another EObject, try following it.
		 *
		 * Models where a parameter points to a literal/value object.
		 */
		for (EStructuralFeature feature : resolved.eClass().getEAllStructuralFeatures()) {
			Object value = safeGet(resolved, feature);

			OptionalDouble numeric = readNestedValue(value, visited, depth + 1);

			if (numeric.isPresent()) {
				return numeric;
			}
		}

		/*
		 * 6. Search contained children.
		 */
		EList<EObject> contents = resolved.eContents();

		if (contents != null) {
			for (EObject child : contents) {
				OptionalDouble numeric = resolveNumeric(child, visited, depth + 1);

				if (numeric.isPresent()) {
					return numeric;
				}
			}
		}

		/*
		 * 7. Read annotations on the EObject if it is an EModelElement.
		 */
		if (resolved instanceof EModelElement modelElement) {
			OptionalDouble numeric = readAnnotations(modelElement);

			if (numeric.isPresent()) {
				return numeric;
			}
		}

		/*
		 * 8. Read annotations on the EClass.
		 */
		OptionalDouble classAnnotationValue = readAnnotations(resolved.eClass());

		if (classAnnotationValue.isPresent()) {
			return classAnnotationValue;
		}

		return OptionalDouble.empty();
	}

	private static OptionalDouble readFeature(
		EObject object,
		EStructuralFeature feature,
		Set<EObject> visited,
		int depth
	) {
		if (object == null || feature == null) {
			return OptionalDouble.empty();
		}

		Object value = safeGet(object, feature);

		if (value == null) {
			return OptionalDouble.empty();
		}

		OptionalDouble direct = coerceNumberOrParse(value);

		if (direct.isPresent()) {
			return direct;
		}

		return readNestedValue(value, visited, depth);
	}

	private static OptionalDouble readNestedValue(
		Object value,
		Set<EObject> visited,
		int depth
	) {
		if (value == null) {
			return OptionalDouble.empty();
		}

		if (value instanceof EObject nestedObject) {
			return resolveNumeric(nestedObject, visited, depth);
		}

		if (value instanceof Collection<?> collection) {
			for (Object item : collection) {
				OptionalDouble numeric = readNestedValue(item, visited, depth);

				if (numeric.isPresent()) {
					return numeric;
				}
			}
		}

		return OptionalDouble.empty();
	}

	private static OptionalDouble coerceNumberOrParse(Object value) {
		if (value instanceof Number number) {
			return OptionalDouble.of(number.doubleValue());
		}

		if (value instanceof String string && isNumericString(string)) {
			return OptionalDouble.of(Double.parseDouble(string.trim()));
		}

		return OptionalDouble.empty();
	}

	private static Object safeGet(EObject object, EStructuralFeature feature) {
		try {
			if (object == null || feature == null) {
				return null;
			}

			if (!object.eIsSet(feature)) {
				return null;
			}

			return object.eGet(feature);
		} catch (Exception ignored) {
			return null;
		}
	}

	private static OptionalDouble readAnnotations(EModelElement element) {
		if (element == null || element.getEAnnotations() == null) {
			return OptionalDouble.empty();
		}

		/*
		 * First prefer details with meaningful names.
		 */
		for (EAnnotation annotation : element.getEAnnotations()) {
			for (String preferred : PREFERRED_NAMES) {
				String value = annotation.getDetails().get(preferred);

				if (isNumericString(value)) {
					return OptionalDouble.of(Double.parseDouble(value.trim()));
				}
			}
		}

		/*
		 * Then accept any numeric annotation detail.
		 */
		for (EAnnotation annotation : element.getEAnnotations()) {
			for (Map.Entry<String, String> entry : annotation.getDetails().entrySet()) {
				String value = entry.getValue();

				if (isNumericString(value)) {
					return OptionalDouble.of(Double.parseDouble(value.trim()));
				}
			}
		}

		return OptionalDouble.empty();
	}

	private static EObject resolveProxyIfNeeded(EObject object) {
		if (object == null) {
			return null;
		}

		if (!object.eIsProxy()) {
			return object;
		}

		try {
			Resource resource = object.eResource();

			if (resource == null) {
				return object;
			}

			ResourceSet resourceSet = resource.getResourceSet();

			if (resourceSet == null) {
				return object;
			}

			EObject resolved = EcoreUtil.resolve(object, resourceSet);

			if (resolved != null && !resolved.eIsProxy()) {
				return resolved;
			}

			if (object instanceof InternalEObject internal) {
				EObject viaUri = resourceSet.getEObject(internal.eProxyURI(), true);

				if (viaUri != null) {
					return viaUri;
				}
			}
		} catch (Exception ignored) {
			return object;
		}

		return object;
	}

	private static boolean isNumericString(String value) {
		return value != null && NUM.matcher(value.trim()).matches();
	}

	private DesignValueArtifacts() {
		// Utility class.
	}
}
