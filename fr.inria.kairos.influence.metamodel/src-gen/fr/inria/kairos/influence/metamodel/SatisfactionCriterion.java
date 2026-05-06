/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satisfaction Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getRequirementRef <em>Requirement Ref</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getMarginDefinition <em>Margin Definition</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getConstrainedSRPs <em>Constrained SR Ps</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSatisfactionCriterion()
 * @model
 * @generated
 */
public interface SatisfactionCriterion extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Requirement Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Ref</em>' reference.
	 * @see #setRequirementRef(EObject)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSatisfactionCriterion_RequirementRef()
	 * @model
	 * @generated
	 */
	EObject getRequirementRef();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getRequirementRef <em>Requirement Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Ref</em>' reference.
	 * @see #getRequirementRef()
	 * @generated
	 */
	void setRequirementRef(EObject value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.kairos.influence.metamodel.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #setLanguage(LanguageType)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSatisfactionCriterion_Language()
	 * @model required="true"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

	/**
	 * Returns the value of the '<em><b>Margin Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Definition</em>' attribute.
	 * @see #setMarginDefinition(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSatisfactionCriterion_MarginDefinition()
	 * @model required="true"
	 * @generated
	 */
	String getMarginDefinition();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getMarginDefinition <em>Margin Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Definition</em>' attribute.
	 * @see #getMarginDefinition()
	 * @generated
	 */
	void setMarginDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Constrained SR Ps</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.SystemResponseProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained SR Ps</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSatisfactionCriterion_ConstrainedSRPs()
	 * @model
	 * @generated
	 */
	EList<SystemResponseProperty> getConstrainedSRPs();

} // SatisfactionCriterion
