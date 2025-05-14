/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Satisfaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getConcerningRequirement <em>Concerning Requirement</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getSatisfaction <em>Satisfaction</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirementSatisfaction()
 * @model
 * @generated
 */
public interface RequirementSatisfaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirementSatisfaction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Concerning Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerning Requirement</em>' attribute.
	 * @see #setConcerningRequirement(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirementSatisfaction_ConcerningRequirement()
	 * @model required="true"
	 * @generated
	 */
	String getConcerningRequirement();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getConcerningRequirement <em>Concerning Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerning Requirement</em>' attribute.
	 * @see #getConcerningRequirement()
	 * @generated
	 */
	void setConcerningRequirement(String value);

	/**
	 * Returns the value of the '<em><b>Satisfaction</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirementSatisfaction_Satisfaction()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getSatisfaction();

} // RequirementSatisfaction
