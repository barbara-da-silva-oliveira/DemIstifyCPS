/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.ParticipantRange#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.ParticipantRange#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipantRange()
 * @model
 * @generated
 */
public interface ParticipantRange extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueSpec)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipantRange_Value()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpec getValue();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.ParticipantRange#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpec value);

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference.
	 * @see #setParticipant(Participant)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipantRange_Participant()
	 * @model
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.ParticipantRange#getParticipant <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Participant value);

} // ParticipantRange
