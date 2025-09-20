/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.DesignArtifact#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.DesignArtifact#getChangeability <em>Changeability</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getDesignArtifact()
 * @model
 * @generated
 */
public interface DesignArtifact extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(EObject)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getDesignArtifact_Ref()
	 * @model
	 * @generated
	 */
	EObject getRef();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.DesignArtifact#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(EObject value);

	/**
	 * Returns the value of the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeability</em>' attribute.
	 * @see #setChangeability(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getDesignArtifact_Changeability()
	 * @model
	 * @generated
	 */
	double getChangeability();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.DesignArtifact#getChangeability <em>Changeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeability</em>' attribute.
	 * @see #getChangeability()
	 * @generated
	 */
	void setChangeability(double value);

} // DesignArtifact
