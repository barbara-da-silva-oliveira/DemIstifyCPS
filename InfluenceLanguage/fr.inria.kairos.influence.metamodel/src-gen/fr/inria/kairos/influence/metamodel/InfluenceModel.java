/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedInfluences <em>Owned Influences</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedRequirementSatisfaction <em>Owned Requirement Satisfaction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedCyberPhysicalPhenomena <em>Owned Cyber Physical Phenomena</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedArtifacts <em>Owned Artifacts</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel()
 * @model
 * @generated
 */
public interface InfluenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Influences</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Influence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Influences</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedInfluences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Influence> getOwnedInfluences();

	/**
	 * Returns the value of the '<em><b>Owned Requirement Satisfaction</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement Satisfaction</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedRequirementSatisfaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementSatisfaction> getOwnedRequirementSatisfaction();

	/**
	 * Returns the value of the '<em><b>Owned Cyber Physical Phenomena</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Cyber Physical Phenomena</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedCyberPhysicalPhenomena()
	 * @model containment="true"
	 * @generated
	 */
	EList<CyberPhysicalPhenomena> getOwnedCyberPhysicalPhenomena();

	/**
	 * Returns the value of the '<em><b>Owned Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Artifacts</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedArtifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getOwnedArtifacts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // InfluenceModel
