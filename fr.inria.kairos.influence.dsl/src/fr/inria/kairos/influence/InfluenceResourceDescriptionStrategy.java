package fr.inria.kairos.influence;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;


public class InfluenceResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	
	@Override
    public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
        boolean result = super.createEObjectDescriptions(eObject, acceptor);

     // Generic: include any EObject with a "name" attribute
        EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
        if (nameFeature != null) {
            Object nameValue = eObject.eGet(nameFeature);
            if (nameValue instanceof String) {
                QualifiedName qualifiedName = qualifiedNameProvider.getFullyQualifiedName(eObject);
                if (qualifiedName != null) {
                    acceptor.accept(EObjectDescription.create(qualifiedName, eObject));
                    result = true;
                }
            }
        }
    
        return result;
    }
}