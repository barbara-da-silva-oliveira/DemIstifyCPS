/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SystemResponse#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SystemResponse#getUsedIn <em>Used In</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSystemResponse()
 * @model
 * @generated
 */
public interface SystemResponse extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSystemResponse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.SystemResponse#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Used In</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used In</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSystemResponse_UsedIn()
	 * @model
	 * @generated
	 */
	EList<Requirement> getUsedIn();

} // SystemResponse
