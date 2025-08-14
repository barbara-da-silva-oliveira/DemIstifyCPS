package fr.inria.kairos.influence;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EObjectPrinter {

    public static String toString(EObject obj) {
        return toString(obj, new HashSet<>(), 0);
    }

    private static String toString(EObject obj, Set<EObject> visited, int indent) {
        if (obj == null) return indent(indent, "null");
        if (visited.contains(obj)) return indent(indent, "<already visited> " + label(obj));

        visited.add(obj);
        StringBuilder sb = new StringBuilder();
        sb.append(indent(indent, label(obj)));

        for (EStructuralFeature feature : obj.eClass().getEAllStructuralFeatures()) {
            if (feature.isTransient() || feature.isDerived()) continue;

            Object value = obj.eGet(feature);
//            System.out.println("obj is proxy ?"+obj.eIsProxy()+ " its value of"+feature.getName()+" is "+value);
            String name = feature.getName();

            if (feature instanceof EReference && ((EReference) feature).isContainment()) {
                if (feature.isMany()) {
                    List<?> list = (List<?>) value;
                    sb.append(indent(indent + 1, name + " ["));
                    for (Object child : list) {
                        if (child instanceof EObject) {
                            sb.append(toString((EObject) child, visited, indent + 2));
                        }
                    }
                    sb.append(indent(indent + 1, "]"));
                } else {
                    sb.append(indent(indent + 1, name + ":"));
                    sb.append(toString((EObject) value, visited, indent + 2));
                }
            } else {
                sb.append(indent(indent + 1, name + ": " + formatValue(value)));
            }
        }

        return sb.toString();
    }

    private static String label(EObject obj) {
        String className = obj.eClass().getName();
        URI uri = EcoreUtil.getURI(obj);
        return className + " (" + uri + ")";
    }

    private static String indent(int level, String line) {
        return "  ".repeat(level) + line + "\n";
    }

    private static String formatValue(Object value) {
        if (value == null) return "null!!";
        if (value instanceof List<?>) return value.toString(); // basic list formatting
        if (value instanceof EObject) return label((EObject) value);
        return value.toString();
    }
}
