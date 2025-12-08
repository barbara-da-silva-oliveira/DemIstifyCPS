/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Requirement#getSatisfaction <em>Satisfaction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Requirement#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirement_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Satisfaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfaction</em>' attribute.
	 * @see #setSatisfaction(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirement_Satisfaction()
	 * @model required="true"
	 * @generated
	 */
	String getSatisfaction();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Requirement#getSatisfaction <em>Satisfaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfaction</em>' attribute.
	 * @see #getSatisfaction()
	 * @generated
	 */
	void setSatisfaction(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.kairos.influence.metamodel.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #setLanguage(LanguageType)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRequirement_Language()
	 * @model required="true"
	 * @generated
	 */
	LanguageType getLanguage();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Requirement#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType value);

} // Requirement
