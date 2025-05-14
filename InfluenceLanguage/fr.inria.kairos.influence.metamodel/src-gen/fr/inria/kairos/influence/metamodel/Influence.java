/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getEvaluatedBy <em>Evaluated By</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getAffects <em>Affects</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getProduces <em>Produces</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getSourcePhenomena <em>Source Phenomena</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getSourceArtifact <em>Source Artifact</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getTargetArtifact <em>Target Artifact</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence()
 * @model
 * @generated
 */
public interface Influence extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Influence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evaluated By</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluated By</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_EvaluatedBy()
	 * @model required="true"
	 * @generated
	 */
	EList<RequirementSatisfaction> getEvaluatedBy();

	/**
	 * Returns the value of the '<em><b>Affects</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.SystemResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_Affects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SystemResponse> getAffects();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.EmergentBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_Produces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EmergentBehavior> getProduces();

	/**
	 * Returns the value of the '<em><b>Source Artifact</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Artifact</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_SourceArtifact()
	 * @model
	 * @generated
	 */
	EList<Artifact> getSourceArtifact();

	/**
	 * Returns the value of the '<em><b>Target Artifact</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Artifact</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_TargetArtifact()
	 * @model
	 * @generated
	 */
	EList<Artifact> getTargetArtifact();

	/**
	 * Returns the value of the '<em><b>Source Phenomena</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Phenomena</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_SourcePhenomena()
	 * @model required="true"
	 * @generated
	 */
	EList<CyberPhysicalPhenomena> getSourcePhenomena();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_Description()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getDescription();

} // Influence
