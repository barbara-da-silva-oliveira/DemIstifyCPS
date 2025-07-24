/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getOriginatorPhenomena <em>Originator Phenomena</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getOriginatorArtifact <em>Originator Artifact</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getOriginatorSystemResponse <em>Originator System Response</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence()
 * @model
 * @generated
 */
public interface Influence extends AbstractInfluence {

	/**
	 * Returns the value of the '<em><b>Originator Phenomena</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.PhysicalPhenomena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originator Phenomena</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_OriginatorPhenomena()
	 * @model
	 * @generated
	 */
	EList<PhysicalPhenomena> getOriginatorPhenomena();

	/**
	 * Returns the value of the '<em><b>Originator Artifact</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.DesignArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originator Artifact</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_OriginatorArtifact()
	 * @model
	 * @generated
	 */
	EList<DesignArtifact> getOriginatorArtifact();

	/**
	 * Returns the value of the '<em><b>Originator System Response</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.SystemResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originator System Response</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_OriginatorSystemResponse()
	 * @model
	 * @generated
	 */
	EList<SystemResponse> getOriginatorSystemResponse();

} // Influence
