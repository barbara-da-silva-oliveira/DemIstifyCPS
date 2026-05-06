/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.ScalarValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getScalarValue()
 * @model
 * @generated
 */
public interface ScalarValue extends ValueSpec {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getScalarValue_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.ScalarValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // ScalarValue
