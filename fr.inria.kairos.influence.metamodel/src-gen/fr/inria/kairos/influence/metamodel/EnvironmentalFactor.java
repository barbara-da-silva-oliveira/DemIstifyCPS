/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environmental Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getFlexibility <em>Flexibility</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactor()
 * @model
 * @generated
 */
public interface EnvironmentalFactor extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactor_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Flexibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flexibility</em>' attribute.
	 * @see #setFlexibility(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactor_Flexibility()
	 * @model
	 * @generated
	 */
	double getFlexibility();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getFlexibility <em>Flexibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flexibility</em>' attribute.
	 * @see #getFlexibility()
	 * @generated
	 */
	void setFlexibility(double value);
} // EnvironmentalFactor
