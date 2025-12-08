/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedRequirements <em>Owned Requirements</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedEnvironmentalFactors <em>Owned Environmental Factors</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedArtifacts <em>Owned Artifacts</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedSRPs <em>Owned SR Ps</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel()
 * @model
 * @generated
 */
public interface InfluenceModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Influences</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.AbstractInfluence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Influences</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedInfluences()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractInfluence> getOwnedInfluences();

	/**
	 * Returns the value of the '<em><b>Owned Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirements</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getOwnedRequirements();

	/**
	 * Returns the value of the '<em><b>Owned Environmental Factors</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Environmental Factors</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedEnvironmentalFactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentalFactor> getOwnedEnvironmentalFactors();

	/**
	 * Returns the value of the '<em><b>Owned Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.DesignArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Artifacts</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedArtifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesignArtifact> getOwnedArtifacts();

	/**
	 * Returns the value of the '<em><b>Owned SR Ps</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.SystemResponseProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned SR Ps</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceModel_OwnedSRPs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemResponseProperty> getOwnedSRPs();

} // InfluenceModel
