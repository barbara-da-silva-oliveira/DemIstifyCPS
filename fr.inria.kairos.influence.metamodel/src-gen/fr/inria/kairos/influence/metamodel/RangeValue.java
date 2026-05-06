/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RangeValue#getLower <em>Lower</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RangeValue#getUpper <em>Upper</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RangeValue#getNominal <em>Nominal</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RangeValue#getStep <em>Step</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveLower <em>Inclusive Lower</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveUpper <em>Inclusive Upper</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRangeValue()
 * @model
 * @generated
 */
public interface RangeValue extends ValueSpec {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRangeValue_Lower()
	 * @model
	 * @generated
	 */
	double getLower();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RangeValue#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(double value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRangeValue_Upper()
	 * @model
	 * @generated
	 */
	double getUpper();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RangeValue#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(double value);

	/**
	 * Returns the value of the '<em><b>Nominal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal</em>' attribute.
	 * @see #setNominal(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRangeValue_Nominal()
	 * @model
	 * @generated
	 */
	double getNominal();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RangeValue#getNominal <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal</em>' attribute.
	 * @see #getNominal()
	 * @generated
	 */
	void setNominal(double value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRangeValue_Step()
	 * @model
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RangeValue#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Returns the value of the '<em><b>Inclusive Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusive Lower</em>' attribute.
	 * @see #setInclusiveLower(boolean)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRangeValue_InclusiveLower()
	 * @model
	 * @generated
	 */
	boolean isInclusiveLower();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveLower <em>Inclusive Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusive Lower</em>' attribute.
	 * @see #isInclusiveLower()
	 * @generated
	 */
	void setInclusiveLower(boolean value);

	/**
	 * Returns the value of the '<em><b>Inclusive Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclusive Upper</em>' attribute.
	 * @see #setInclusiveUpper(boolean)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getRangeValue_InclusiveUpper()
	 * @model
	 * @generated
	 */
	boolean isInclusiveUpper();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveUpper <em>Inclusive Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusive Upper</em>' attribute.
	 * @see #isInclusiveUpper()
	 * @generated
	 */
	void setInclusiveUpper(boolean value);

} // RangeValue
