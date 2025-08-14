/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Requirement#getSatisfaction <em>Satisfaction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Requirement#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Satisfaction</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirement_Satisfaction()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSatisfaction();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirement_Metadata()
	 * @model
	 * @generated
	 */
	EList<String> getMetadata();

} // Requirement
