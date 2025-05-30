package fr.inria.kairos.influence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class InfluenceQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

    
    @Override
    public QualifiedName getFullyQualifiedName(EObject obj) {
        EStructuralFeature nameFeature = obj.eClass().getEStructuralFeature("name");

        String name = "noName";
        if (nameFeature != null) {
            Object rawName = obj.eGet(nameFeature);
            if (rawName instanceof String && !((String) rawName).isEmpty()) {
                name = (String) rawName;
            }
        }

        if (obj.eContainer() != null) {
            QualifiedName parentFQN = getFullyQualifiedName(obj.eContainer());
            if (parentFQN != null) {
                return parentFQN.append(name);
            }
        }

        return QualifiedName.create(name);
    }
    
}