/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link fr.inria.kairos.influence.metamodel.DesignArtifact#getMetadata <em>Metadata</em>}</li>
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
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getDesignArtifact_Metadata()
	 * @model
	 * @generated
	 */
	EList<String> getMetadata();

} // DesignArtifact
