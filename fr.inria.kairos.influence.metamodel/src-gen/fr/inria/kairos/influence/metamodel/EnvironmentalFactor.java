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
 *   <li>{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getUnit <em>Unit</em>}</li>
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
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactor_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactor_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Flexibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flexibility</em>' attribute.
	 * @see #setFlexibility(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactor_Flexibility()
	 * @model required="true"
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
