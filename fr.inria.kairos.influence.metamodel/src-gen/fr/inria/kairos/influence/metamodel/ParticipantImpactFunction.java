/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Impact Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.ParticipantImpactFunction#getParticipantContribution <em>Participant Contribution</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipantImpactFunction()
 * @model
 * @generated
 */
public interface ParticipantImpactFunction extends FunctionRepresentation, NamedElement {
	/**
	 * Returns the value of the '<em><b>Participant Contribution</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Contribution</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipantImpactFunction_ParticipantContribution()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParticipantRelativeImpact> getParticipantContribution();

} // ParticipantImpactFunction
