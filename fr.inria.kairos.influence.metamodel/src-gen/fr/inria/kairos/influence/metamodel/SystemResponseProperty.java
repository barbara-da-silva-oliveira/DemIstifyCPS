/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Response Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SystemResponseProperty#getConstrainedBy <em>Constrained By</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SystemResponseProperty#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSystemResponseProperty()
 * @model
 * @generated
 */
public interface SystemResponseProperty extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constrained By</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained By</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSystemResponseProperty_ConstrainedBy()
	 * @model
	 * @generated
	 */
	EList<Requirement> getConstrainedBy();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSystemResponseProperty_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.SystemResponseProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SystemResponseProperty
