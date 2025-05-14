/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kairos.inria.fr/influences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl <em>Influence Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluenceModel()
	 * @generated
	 */
	int INFLUENCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Owned Influences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_INFLUENCES = 0;

	/**
	 * The feature id for the '<em><b>Owned Requirement Satisfaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION = 1;

	/**
	 * The feature id for the '<em><b>Owned Cyber Physical Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA = 2;

	/**
	 * The feature id for the '<em><b>Owned Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_ARTIFACTS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__NAME = 4;

	/**
	 * The number of structural features of the '<em>Influence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Influence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl <em>Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluence()
	 * @generated
	 */
	int INFLUENCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Evaluated By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__EVALUATED_BY = 1;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__AFFECTS = 2;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__PRODUCES = 3;

	/**
	 * The feature id for the '<em><b>Source Phenomena</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__SOURCE_PHENOMENA = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Source Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__SOURCE_ARTIFACT = 6;

	/**
	 * The feature id for the '<em><b>Target Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__TARGET_ARTIFACT = 7;

	/**
	 * The number of structural features of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.EmergentBehaviorImpl <em>Emergent Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.EmergentBehaviorImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getEmergentBehavior()
	 * @generated
	 */
	int EMERGENT_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Emergent Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Emergent Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMERGENT_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.SystemResponseImpl <em>System Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.SystemResponseImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSystemResponse()
	 * @generated
	 */
	int SYSTEM_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE__OBSERVATION = 0;

	/**
	 * The number of structural features of the '<em>System Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.CyberPhysicalPhenomenaImpl <em>Cyber Physical Phenomena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.CyberPhysicalPhenomenaImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getCyberPhysicalPhenomena()
	 * @generated
	 */
	int CYBER_PHYSICAL_PHENOMENA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_PHENOMENA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_PHENOMENA__CONFIGURATION = 1;

	/**
	 * The number of structural features of the '<em>Cyber Physical Phenomena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_PHENOMENA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cyber Physical Phenomena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYBER_PHYSICAL_PHENOMENA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.RequirementSatisfactionImpl <em>Requirement Satisfaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.RequirementSatisfactionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getRequirementSatisfaction()
	 * @generated
	 */
	int REQUIREMENT_SATISFACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SATISFACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Concerning Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SATISFACTION__CONCERNING_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Satisfaction</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SATISFACTION__SATISFACTION = 2;

	/**
	 * The number of structural features of the '<em>Requirement Satisfaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SATISFACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirement Satisfaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_SATISFACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.MultiPhenomenonImpl <em>Multi Phenomenon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.MultiPhenomenonImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMultiPhenomenon()
	 * @generated
	 */
	int MULTI_PHENOMENON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PHENOMENON__NAME = CYBER_PHYSICAL_PHENOMENA__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PHENOMENON__CONFIGURATION = CYBER_PHYSICAL_PHENOMENA__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Aggregation Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PHENOMENON__AGGREGATION_OF = CYBER_PHYSICAL_PHENOMENA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Phenomenon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PHENOMENON_FEATURE_COUNT = CYBER_PHYSICAL_PHENOMENA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Phenomenon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PHENOMENON_OPERATION_COUNT = CYBER_PHYSICAL_PHENOMENA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.SimplePhenomenonImpl <em>Simple Phenomenon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.SimplePhenomenonImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSimplePhenomenon()
	 * @generated
	 */
	int SIMPLE_PHENOMENON = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PHENOMENON__NAME = CYBER_PHYSICAL_PHENOMENA__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PHENOMENON__CONFIGURATION = CYBER_PHYSICAL_PHENOMENA__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Simple Phenomenon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PHENOMENON_FEATURE_COUNT = CYBER_PHYSICAL_PHENOMENA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Phenomenon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PHENOMENON_OPERATION_COUNT = CYBER_PHYSICAL_PHENOMENA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ArtifactImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__REF = 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.InfluenceModel <em>Influence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence Model</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel
	 * @generated
	 */
	EClass getInfluenceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedInfluences <em>Owned Influences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Influences</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedInfluences()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedInfluences();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedRequirementSatisfaction <em>Owned Requirement Satisfaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirement Satisfaction</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedRequirementSatisfaction()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedRequirementSatisfaction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedCyberPhysicalPhenomena <em>Owned Cyber Physical Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Cyber Physical Phenomena</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedCyberPhysicalPhenomena()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedCyberPhysicalPhenomena();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedArtifacts <em>Owned Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Artifacts</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedArtifacts()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getName()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EAttribute getInfluenceModel_Name();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.Influence <em>Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence
	 * @generated
	 */
	EClass getInfluence();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Influence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getName()
	 * @see #getInfluence()
	 * @generated
	 */
	EAttribute getInfluence_Name();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getEvaluatedBy <em>Evaluated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evaluated By</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getEvaluatedBy()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_EvaluatedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affects</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getAffects()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_Affects();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Produces</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getProduces()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_Produces();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getSourceArtifact <em>Source Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Artifact</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getSourceArtifact()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_SourceArtifact();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getTargetArtifact <em>Target Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Artifact</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getTargetArtifact()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_TargetArtifact();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getSourcePhenomena <em>Source Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Phenomena</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getSourcePhenomena()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_SourcePhenomena();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.kairos.influence.metamodel.Influence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getDescription()
	 * @see #getInfluence()
	 * @generated
	 */
	EAttribute getInfluence_Description();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.EmergentBehavior <em>Emergent Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emergent Behavior</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EmergentBehavior
	 * @generated
	 */
	EClass getEmergentBehavior();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.EmergentBehavior#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EmergentBehavior#getDescription()
	 * @see #getEmergentBehavior()
	 * @generated
	 */
	EAttribute getEmergentBehavior_Description();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.SystemResponse <em>System Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Response</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponse
	 * @generated
	 */
	EClass getSystemResponse();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.SystemResponse#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observation</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponse#getObservation()
	 * @see #getSystemResponse()
	 * @generated
	 */
	EAttribute getSystemResponse_Observation();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena <em>Cyber Physical Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cyber Physical Phenomena</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena
	 * @generated
	 */
	EClass getCyberPhysicalPhenomena();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena#getName()
	 * @see #getCyberPhysicalPhenomena()
	 * @generated
	 */
	EAttribute getCyberPhysicalPhenomena_Name();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Configuration</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena#getConfiguration()
	 * @see #getCyberPhysicalPhenomena()
	 * @generated
	 */
	EAttribute getCyberPhysicalPhenomena_Configuration();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction <em>Requirement Satisfaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Satisfaction</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RequirementSatisfaction
	 * @generated
	 */
	EClass getRequirementSatisfaction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getName()
	 * @see #getRequirementSatisfaction()
	 * @generated
	 */
	EAttribute getRequirementSatisfaction_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getConcerningRequirement <em>Concerning Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concerning Requirement</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getConcerningRequirement()
	 * @see #getRequirementSatisfaction()
	 * @generated
	 */
	EAttribute getRequirementSatisfaction_ConcerningRequirement();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getSatisfaction <em>Satisfaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Satisfaction</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RequirementSatisfaction#getSatisfaction()
	 * @see #getRequirementSatisfaction()
	 * @generated
	 */
	EAttribute getRequirementSatisfaction_Satisfaction();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.MultiPhenomenon <em>Multi Phenomenon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Phenomenon</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MultiPhenomenon
	 * @generated
	 */
	EClass getMultiPhenomenon();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.MultiPhenomenon#getAggregationOf <em>Aggregation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregation Of</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MultiPhenomenon#getAggregationOf()
	 * @see #getMultiPhenomenon()
	 * @generated
	 */
	EReference getMultiPhenomenon_AggregationOf();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.SimplePhenomenon <em>Simple Phenomenon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Phenomenon</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SimplePhenomenon
	 * @generated
	 */
	EClass getSimplePhenomenon();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Artifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Artifact#getName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.Artifact#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Artifact#getRef()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl <em>Influence Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluenceModel()
		 * @generated
		 */
		EClass INFLUENCE_MODEL = eINSTANCE.getInfluenceModel();

		/**
		 * The meta object literal for the '<em><b>Owned Influences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_INFLUENCES = eINSTANCE.getInfluenceModel_OwnedInfluences();

		/**
		 * The meta object literal for the '<em><b>Owned Requirement Satisfaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION = eINSTANCE
				.getInfluenceModel_OwnedRequirementSatisfaction();

		/**
		 * The meta object literal for the '<em><b>Owned Cyber Physical Phenomena</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA = eINSTANCE
				.getInfluenceModel_OwnedCyberPhysicalPhenomena();

		/**
		 * The meta object literal for the '<em><b>Owned Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_ARTIFACTS = eINSTANCE.getInfluenceModel_OwnedArtifacts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE_MODEL__NAME = eINSTANCE.getInfluenceModel_Name();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl <em>Influence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluence()
		 * @generated
		 */
		EClass INFLUENCE = eINSTANCE.getInfluence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE__NAME = eINSTANCE.getInfluence_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluated By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__EVALUATED_BY = eINSTANCE.getInfluence_EvaluatedBy();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__AFFECTS = eINSTANCE.getInfluence_Affects();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__PRODUCES = eINSTANCE.getInfluence_Produces();

		/**
		 * The meta object literal for the '<em><b>Source Artifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__SOURCE_ARTIFACT = eINSTANCE.getInfluence_SourceArtifact();

		/**
		 * The meta object literal for the '<em><b>Target Artifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__TARGET_ARTIFACT = eINSTANCE.getInfluence_TargetArtifact();

		/**
		 * The meta object literal for the '<em><b>Source Phenomena</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__SOURCE_PHENOMENA = eINSTANCE.getInfluence_SourcePhenomena();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE__DESCRIPTION = eINSTANCE.getInfluence_Description();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.EmergentBehaviorImpl <em>Emergent Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.EmergentBehaviorImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getEmergentBehavior()
		 * @generated
		 */
		EClass EMERGENT_BEHAVIOR = eINSTANCE.getEmergentBehavior();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMERGENT_BEHAVIOR__DESCRIPTION = eINSTANCE.getEmergentBehavior_Description();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.SystemResponseImpl <em>System Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.SystemResponseImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSystemResponse()
		 * @generated
		 */
		EClass SYSTEM_RESPONSE = eINSTANCE.getSystemResponse();

		/**
		 * The meta object literal for the '<em><b>Observation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_RESPONSE__OBSERVATION = eINSTANCE.getSystemResponse_Observation();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.CyberPhysicalPhenomenaImpl <em>Cyber Physical Phenomena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.CyberPhysicalPhenomenaImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getCyberPhysicalPhenomena()
		 * @generated
		 */
		EClass CYBER_PHYSICAL_PHENOMENA = eINSTANCE.getCyberPhysicalPhenomena();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYBER_PHYSICAL_PHENOMENA__NAME = eINSTANCE.getCyberPhysicalPhenomena_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYBER_PHYSICAL_PHENOMENA__CONFIGURATION = eINSTANCE.getCyberPhysicalPhenomena_Configuration();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.RequirementSatisfactionImpl <em>Requirement Satisfaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.RequirementSatisfactionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getRequirementSatisfaction()
		 * @generated
		 */
		EClass REQUIREMENT_SATISFACTION = eINSTANCE.getRequirementSatisfaction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_SATISFACTION__NAME = eINSTANCE.getRequirementSatisfaction_Name();

		/**
		 * The meta object literal for the '<em><b>Concerning Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_SATISFACTION__CONCERNING_REQUIREMENT = eINSTANCE
				.getRequirementSatisfaction_ConcerningRequirement();

		/**
		 * The meta object literal for the '<em><b>Satisfaction</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_SATISFACTION__SATISFACTION = eINSTANCE.getRequirementSatisfaction_Satisfaction();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.MultiPhenomenonImpl <em>Multi Phenomenon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.MultiPhenomenonImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMultiPhenomenon()
		 * @generated
		 */
		EClass MULTI_PHENOMENON = eINSTANCE.getMultiPhenomenon();

		/**
		 * The meta object literal for the '<em><b>Aggregation Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PHENOMENON__AGGREGATION_OF = eINSTANCE.getMultiPhenomenon_AggregationOf();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.SimplePhenomenonImpl <em>Simple Phenomenon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.SimplePhenomenonImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSimplePhenomenon()
		 * @generated
		 */
		EClass SIMPLE_PHENOMENON = eINSTANCE.getSimplePhenomenon();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ArtifactImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__REF = eINSTANCE.getArtifact_Ref();

	}

} //MetamodelPackage
