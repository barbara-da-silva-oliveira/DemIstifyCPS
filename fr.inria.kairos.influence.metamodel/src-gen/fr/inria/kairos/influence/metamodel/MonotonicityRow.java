/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monotonicity Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getTrend <em>Trend</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getVariedParticipant <em>Varied Participant</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getLocalSlope <em>Local Slope</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getNLevels <em>NLevels</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow()
 * @model
 * @generated
 */
public interface MonotonicityRow extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.ParticipantRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParticipantRange> getCondition();

	/**
	 * Returns the value of the '<em><b>Trend</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.kairos.influence.metamodel.TrendType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trend</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.TrendType
	 * @see #setTrend(TrendType)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow_Trend()
	 * @model
	 * @generated
	 */
	TrendType getTrend();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getTrend <em>Trend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trend</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.TrendType
	 * @see #getTrend()
	 * @generated
	 */
	void setTrend(TrendType value);

	/**
	 * Returns the value of the '<em><b>Varied Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varied Participant</em>' reference.
	 * @see #setVariedParticipant(Participant)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow_VariedParticipant()
	 * @model
	 * @generated
	 */
	Participant getVariedParticipant();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getVariedParticipant <em>Varied Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varied Participant</em>' reference.
	 * @see #getVariedParticipant()
	 * @generated
	 */
	void setVariedParticipant(Participant value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(SystemResponseProperty)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow_Output()
	 * @model
	 * @generated
	 */
	SystemResponseProperty getOutput();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(SystemResponseProperty value);

	/**
	 * Returns the value of the '<em><b>Local Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Slope</em>' attribute.
	 * @see #setLocalSlope(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow_LocalSlope()
	 * @model
	 * @generated
	 */
	double getLocalSlope();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getLocalSlope <em>Local Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Slope</em>' attribute.
	 * @see #getLocalSlope()
	 * @generated
	 */
	void setLocalSlope(double value);

	/**
	 * Returns the value of the '<em><b>NLevels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NLevels</em>' attribute.
	 * @see #setNLevels(int)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow_NLevels()
	 * @model
	 * @generated
	 */
	int getNLevels();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getNLevels <em>NLevels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NLevels</em>' attribute.
	 * @see #getNLevels()
	 * @generated
	 */
	void setNLevels(int value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityRow_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

} // MonotonicityRow
