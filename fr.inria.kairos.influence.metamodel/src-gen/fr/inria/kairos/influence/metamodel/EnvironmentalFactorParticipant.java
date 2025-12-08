/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environmental Factor Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactorParticipant()
 * @model
 * @generated
 */
public interface EnvironmentalFactorParticipant extends Participant {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EnvironmentalFactor)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getEnvironmentalFactorParticipant_Target()
	 * @model required="true"
	 * @generated
	 */
	EnvironmentalFactor getTarget();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EnvironmentalFactor value);

} // EnvironmentalFactorParticipant
