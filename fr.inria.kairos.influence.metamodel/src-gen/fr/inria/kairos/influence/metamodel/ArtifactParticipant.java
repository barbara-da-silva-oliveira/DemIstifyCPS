/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.ArtifactParticipant#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getArtifactParticipant()
 * @model
 * @generated
 */
public interface ArtifactParticipant extends Participant {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DesignArtifact)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getArtifactParticipant_Target()
	 * @model required="true"
	 * @generated
	 */
	DesignArtifact getTarget();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.ArtifactParticipant#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DesignArtifact value);

} // ArtifactParticipant
