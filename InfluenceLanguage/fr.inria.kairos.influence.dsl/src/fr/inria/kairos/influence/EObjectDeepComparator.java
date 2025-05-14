package fr.inria.kairos.influence;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EObjectDeepComparator {

    public static boolean deepEquals(EObject obj1, EObject obj2) {
        return deepEquals(obj1, obj2, new HashSet<>());
    }

    private static boolean deepEquals(EObject obj1, EObject obj2, Set<VisitedPair> visited) {
        if (obj1 == obj2) return true;
        if (obj1 == null || obj2 == null) return false;
        if (!obj1.eClass().equals(obj2.eClass())) return false;

        VisitedPair pair = new VisitedPair(obj1, obj2);
        if (visited.contains(pair)) return true; // Prevent cycles
        visited.add(pair);

        for (EStructuralFeature feature : obj1.eClass().getEAllStructuralFeatures()) {
            if (feature.isTransient() || feature.isDerived()) continue;

            Object val1 = obj1.eGet(feature);
            Object val2 = obj2.eGet(feature);

            if (feature instanceof EReference) {
                EReference ref = (EReference) feature;
                if (ref.isContainment()) {
                    // Deep compare contained references
                    if (feature.isMany()) {
                        if (!compareEObjectLists((List<?>) val1, (List<?>) val2, visited)) return false;
                    } else {
                        if (!deepEquals((EObject) val1, (EObject) val2, visited)) return false;
                    }
                } else {
                    // For non-containment (cross refs), just compare URIs
                    URI uri1 = (val1 instanceof EObject) ? EcoreUtil.getURI((EObject) val1) : null;
                    URI uri2 = (val2 instanceof EObject) ? EcoreUtil.getURI((EObject) val2) : null;
                    if (!Objects.equals(uri1, uri2)) return false;
                }
            } else {
                // EAttribute
                if (!Objects.equals(val1, val2)) return false;
            }
        }

        return true;
    }

    private static boolean compareEObjectLists(List<?> list1, List<?> list2, Set<VisitedPair> visited) {
        if (list1 == list2) return true;
        if (list1 == null || list2 == null || list1.size() != list2.size()) return false;

        for (int i = 0; i < list1.size(); i++) {
            EObject e1 = (EObject) list1.get(i);
            EObject e2 = (EObject) list2.get(i);
            if (!deepEquals(e1, e2, visited)) return false;
        }

        return true;
    }

    // Helper to avoid revisiting same object pairs (cycle protection)
    private static class VisitedPair {
        private final EObject obj1;
        private final EObject obj2;

        public VisitedPair(EObject obj1, EObject obj2) {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof VisitedPair)) return false;
            VisitedPair other = (VisitedPair) o;
            return obj1 == other.obj1 && obj2 == other.obj2;
        }

        @Override
        public int hashCode() {
            return System.identityHashCode(obj1) * 31 + System.identityHashCode(obj2);
        }
    }
}
