/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRP Input Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.SRPInputParticipant#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSRPInputParticipant()
 * @model
 * @generated
 */
public interface SRPInputParticipant extends Participant {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SystemResponseProperty)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getSRPInputParticipant_Target()
	 * @model required="true"
	 * @generated
	 */
	SystemResponseProperty getTarget();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.SRPInputParticipant#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SystemResponseProperty value);

} // SRPInputParticipant
