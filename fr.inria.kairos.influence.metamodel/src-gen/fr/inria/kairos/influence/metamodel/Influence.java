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
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedFunction <em>Owned Function</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getPerElementMetadata <em>Per Element Metadata</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Owned Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Function</em>' containment reference.
	 * @see #setOwnedFunction(Function)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_OwnedFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Function getOwnedFunction();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedFunction <em>Owned Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Function</em>' containment reference.
	 * @see #getOwnedFunction()
	 * @generated
	 */
	void setOwnedFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Per Element Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Element Metadata</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_PerElementMetadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getPerElementMetadata();

} // Influence
