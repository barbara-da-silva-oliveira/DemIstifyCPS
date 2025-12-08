/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
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
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.NamedElementImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Influences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_INFLUENCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Environmental Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_ARTIFACTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned SR Ps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_SR_PS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Influence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Influence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl <em>Abstract Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getAbstractInfluence()
	 * @generated
	 */
	int ABSTRACT_INFLUENCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__WEIGHT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__LIKELIHOOD = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONFIDENCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.SRPInputParticipantImpl <em>SRP Input Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.SRPInputParticipantImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSRPInputParticipant()
	 * @generated
	 */
	int SRP_INPUT_PARTICIPANT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT__NAME = PARTICIPANT__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT__WEIGHT = PARTICIPANT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT__LIKELIHOOD = PARTICIPANT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT__CONFIDENCE = PARTICIPANT__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT__TARGET = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SRP Input Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>SRP Input Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl <em>Environmental Factor Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getEnvironmentalFactorParticipant()
	 * @generated
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT__NAME = PARTICIPANT__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT__WEIGHT = PARTICIPANT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT__LIKELIHOOD = PARTICIPANT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT__CONFIDENCE = PARTICIPANT__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Environmental Factor Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Environmental Factor Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl <em>Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluence()
	 * @generated
	 */
	int INFLUENCE = 8;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.RequirementImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LANGUAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ArtifactParticipantImpl <em>Artifact Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ArtifactParticipantImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getArtifactParticipant()
	 * @generated
	 */
	int ARTIFACT_PARTICIPANT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT__NAME = PARTICIPANT__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT__WEIGHT = PARTICIPANT__WEIGHT;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT__LIKELIHOOD = PARTICIPANT__LIKELIHOOD;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT__CONFIDENCE = PARTICIPANT__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT__TARGET = PARTICIPANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Artifact Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Artifact Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.DesignArtifactImpl <em>Design Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.DesignArtifactImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getDesignArtifact()
	 * @generated
	 */
	int DESIGN_ARTIFACT = 10;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.SystemResponsePropertyImpl <em>System Response Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.SystemResponsePropertyImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSystemResponseProperty()
	 * @generated
	 */
	int SYSTEM_RESPONSE_PROPERTY = 11;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl <em>Environmental Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getEnvironmentalFactor()
	 * @generated
	 */
	int ENVIRONMENTAL_FACTOR = 12;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.CompositeInfluenceImpl <em>Composite Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.CompositeInfluenceImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getCompositeInfluence()
	 * @generated
	 */
	int COMPOSITE_INFLUENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__NAME = ABSTRACT_INFLUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__DESCRIPTION = ABSTRACT_INFLUENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Internal Influences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES = ABSTRACT_INFLUENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Influence Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION = ABSTRACT_INFLUENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE_FEATURE_COUNT = ABSTRACT_INFLUENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE_OPERATION_COUNT = ABSTRACT_INFLUENCE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__NAME = ABSTRACT_INFLUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__DESCRIPTION = ABSTRACT_INFLUENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned Influence Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__OWNED_INFLUENCE_FUNCTION = ABSTRACT_INFLUENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__OWNED_PARTICIPANTS = ABSTRACT_INFLUENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output SRP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__OUTPUT_SRP = ABSTRACT_INFLUENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FEATURE_COUNT = ABSTRACT_INFLUENCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Participation Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE___PARTICIPATION_PATTERN__DIAGNOSTICCHAIN_MAP = ABSTRACT_INFLUENCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_OPERATION_COUNT = ABSTRACT_INFLUENCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceFunctionImpl <em>Influence Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceFunctionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluenceFunction()
	 * @generated
	 */
	int INFLUENCE_FUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ARTIFACT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ARTIFACT__REF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ARTIFACT__CHANGEABILITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Design Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ARTIFACT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Design Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ARTIFACT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constrained By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_PROPERTY__CONSTRAINED_BY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_PROPERTY__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Response Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Response Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR__UNIT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flexibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR__FLEXIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Environmental Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Environmental Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION__RETURN_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION__LANGUAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Influence Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Language Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION___LANGUAGE_RETURN__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Influence Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.ValueType
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 14;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 15;

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
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedRequirements <em>Owned Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirements</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedRequirements()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedEnvironmentalFactors <em>Owned Environmental Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Environmental Factors</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedEnvironmentalFactors()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedEnvironmentalFactors();

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
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedSRPs <em>Owned SR Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned SR Ps</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedSRPs()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedSRPs();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence <em>Abstract Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Influence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AbstractInfluence
	 * @generated
	 */
	EClass getAbstractInfluence();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AbstractInfluence#getDescription()
	 * @see #getAbstractInfluence()
	 * @generated
	 */
	EAttribute getAbstractInfluence_Description();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.SRPInputParticipant <em>SRP Input Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SRP Input Participant</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SRPInputParticipant
	 * @generated
	 */
	EClass getSRPInputParticipant();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.SRPInputParticipant#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SRPInputParticipant#getTarget()
	 * @see #getSRPInputParticipant()
	 * @generated
	 */
	EReference getSRPInputParticipant_Target();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant <em>Environmental Factor Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environmental Factor Participant</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
	 * @generated
	 */
	EClass getEnvironmentalFactorParticipant();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant#getTarget()
	 * @see #getEnvironmentalFactorParticipant()
	 * @generated
	 */
	EReference getEnvironmentalFactorParticipant_Target();

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
	 * Returns the meta object for the containment reference '{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Influence Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getOwnedInfluenceFunction()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_OwnedInfluenceFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedParticipants <em>Owned Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Participants</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getOwnedParticipants()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_OwnedParticipants();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.Influence#getOutputSRP <em>Output SRP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output SRP</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getOutputSRP()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_OutputSRP();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.influence.metamodel.Influence#ParticipationPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Participation Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Participation Pattern</em>' operation.
	 * @see fr.inria.kairos.influence.metamodel.Influence#ParticipationPattern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInfluence__ParticipationPattern__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Participant#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Participant#getWeight()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Weight();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Participant#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Participant#getLikelihood()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Likelihood();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Participant#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Participant#getConfidence()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Confidence();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction <em>Influence Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceFunction
	 * @generated
	 */
	EClass getInfluenceFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceFunction#getDefinition()
	 * @see #getInfluenceFunction()
	 * @generated
	 */
	EAttribute getInfluenceFunction_Definition();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceFunction#getReturnType()
	 * @see #getInfluenceFunction()
	 * @generated
	 */
	EAttribute getInfluenceFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceFunction#getLanguage()
	 * @see #getInfluenceFunction()
	 * @generated
	 */
	EAttribute getInfluenceFunction_Language();

	/**
	 * Returns the meta object for the '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#LanguageReturn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Language Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Language Return</em>' operation.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceFunction#LanguageReturn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInfluenceFunction__LanguageReturn__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Requirement#getSatisfaction <em>Satisfaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Requirement#getSatisfaction()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Satisfaction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Requirement#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Requirement#getLanguage()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Language();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.ArtifactParticipant <em>Artifact Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Participant</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ArtifactParticipant
	 * @generated
	 */
	EClass getArtifactParticipant();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.ArtifactParticipant#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ArtifactParticipant#getTarget()
	 * @see #getArtifactParticipant()
	 * @generated
	 */
	EReference getArtifactParticipant_Target();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.DesignArtifact <em>Design Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Artifact</em>'.
	 * @see fr.inria.kairos.influence.metamodel.DesignArtifact
	 * @generated
	 */
	EClass getDesignArtifact();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.DesignArtifact#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see fr.inria.kairos.influence.metamodel.DesignArtifact#getRef()
	 * @see #getDesignArtifact()
	 * @generated
	 */
	EReference getDesignArtifact_Ref();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.DesignArtifact#getChangeability <em>Changeability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeability</em>'.
	 * @see fr.inria.kairos.influence.metamodel.DesignArtifact#getChangeability()
	 * @see #getDesignArtifact()
	 * @generated
	 */
	EAttribute getDesignArtifact_Changeability();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.SystemResponseProperty <em>System Response Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Response Property</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponseProperty
	 * @generated
	 */
	EClass getSystemResponseProperty();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.SystemResponseProperty#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained By</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponseProperty#getConstrainedBy()
	 * @see #getSystemResponseProperty()
	 * @generated
	 */
	EReference getSystemResponseProperty_ConstrainedBy();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.SystemResponseProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponseProperty#getDescription()
	 * @see #getSystemResponseProperty()
	 * @generated
	 */
	EAttribute getSystemResponseProperty_Description();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor <em>Environmental Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environmental Factor</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactor
	 * @generated
	 */
	EClass getEnvironmentalFactor();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getDescription()
	 * @see #getEnvironmentalFactor()
	 * @generated
	 */
	EAttribute getEnvironmentalFactor_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getValue()
	 * @see #getEnvironmentalFactor()
	 * @generated
	 */
	EAttribute getEnvironmentalFactor_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getUnit()
	 * @see #getEnvironmentalFactor()
	 * @generated
	 */
	EAttribute getEnvironmentalFactor_Unit();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getFlexibility <em>Flexibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flexibility</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactor#getFlexibility()
	 * @see #getEnvironmentalFactor()
	 * @generated
	 */
	EAttribute getEnvironmentalFactor_Flexibility();

	/**
	 * Returns the meta object for enum '{@link fr.inria.kairos.influence.metamodel.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.kairos.influence.metamodel.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.CompositeInfluence <em>Composite Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Influence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CompositeInfluence
	 * @generated
	 */
	EClass getCompositeInfluence();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getInternalInfluences <em>Internal Influences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Influences</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CompositeInfluence#getInternalInfluences()
	 * @see #getCompositeInfluence()
	 * @generated
	 */
	EReference getCompositeInfluence_InternalInfluences();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Influence Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedInfluenceFunction()
	 * @see #getCompositeInfluence()
	 * @generated
	 */
	EReference getCompositeInfluence_OwnedInfluenceFunction();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.kairos.influence.metamodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.kairos.influence.metamodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

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
		 * The meta object literal for the '<em><b>Owned Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_REQUIREMENTS = eINSTANCE.getInfluenceModel_OwnedRequirements();

		/**
		 * The meta object literal for the '<em><b>Owned Environmental Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS = eINSTANCE
				.getInfluenceModel_OwnedEnvironmentalFactors();

		/**
		 * The meta object literal for the '<em><b>Owned Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_ARTIFACTS = eINSTANCE.getInfluenceModel_OwnedArtifacts();

		/**
		 * The meta object literal for the '<em><b>Owned SR Ps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_SR_PS = eINSTANCE.getInfluenceModel_OwnedSRPs();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl <em>Abstract Influence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getAbstractInfluence()
		 * @generated
		 */
		EClass ABSTRACT_INFLUENCE = eINSTANCE.getAbstractInfluence();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INFLUENCE__DESCRIPTION = eINSTANCE.getAbstractInfluence_Description();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.SRPInputParticipantImpl <em>SRP Input Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.SRPInputParticipantImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSRPInputParticipant()
		 * @generated
		 */
		EClass SRP_INPUT_PARTICIPANT = eINSTANCE.getSRPInputParticipant();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRP_INPUT_PARTICIPANT__TARGET = eINSTANCE.getSRPInputParticipant_Target();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl <em>Environmental Factor Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getEnvironmentalFactorParticipant()
		 * @generated
		 */
		EClass ENVIRONMENTAL_FACTOR_PARTICIPANT = eINSTANCE.getEnvironmentalFactorParticipant();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET = eINSTANCE.getEnvironmentalFactorParticipant_Target();

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
		 * The meta object literal for the '<em><b>Owned Influence Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__OWNED_INFLUENCE_FUNCTION = eINSTANCE.getInfluence_OwnedInfluenceFunction();

		/**
		 * The meta object literal for the '<em><b>Owned Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__OWNED_PARTICIPANTS = eINSTANCE.getInfluence_OwnedParticipants();

		/**
		 * The meta object literal for the '<em><b>Output SRP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__OUTPUT_SRP = eINSTANCE.getInfluence_OutputSRP();

		/**
		 * The meta object literal for the '<em><b>Participation Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFLUENCE___PARTICIPATION_PATTERN__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getInfluence__ParticipationPattern__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__WEIGHT = eINSTANCE.getParticipant_Weight();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__LIKELIHOOD = eINSTANCE.getParticipant_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__CONFIDENCE = eINSTANCE.getParticipant_Confidence();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceFunctionImpl <em>Influence Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceFunctionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluenceFunction()
		 * @generated
		 */
		EClass INFLUENCE_FUNCTION = eINSTANCE.getInfluenceFunction();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE_FUNCTION__DEFINITION = eINSTANCE.getInfluenceFunction_Definition();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE_FUNCTION__RETURN_TYPE = eINSTANCE.getInfluenceFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFLUENCE_FUNCTION__LANGUAGE = eINSTANCE.getInfluenceFunction_Language();

		/**
		 * The meta object literal for the '<em><b>Language Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFLUENCE_FUNCTION___LANGUAGE_RETURN__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getInfluenceFunction__LanguageReturn__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.RequirementImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Satisfaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SATISFACTION = eINSTANCE.getRequirement_Satisfaction();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LANGUAGE = eINSTANCE.getRequirement_Language();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ArtifactParticipantImpl <em>Artifact Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ArtifactParticipantImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getArtifactParticipant()
		 * @generated
		 */
		EClass ARTIFACT_PARTICIPANT = eINSTANCE.getArtifactParticipant();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_PARTICIPANT__TARGET = eINSTANCE.getArtifactParticipant_Target();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.DesignArtifactImpl <em>Design Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.DesignArtifactImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getDesignArtifact()
		 * @generated
		 */
		EClass DESIGN_ARTIFACT = eINSTANCE.getDesignArtifact();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ARTIFACT__REF = eINSTANCE.getDesignArtifact_Ref();

		/**
		 * The meta object literal for the '<em><b>Changeability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ARTIFACT__CHANGEABILITY = eINSTANCE.getDesignArtifact_Changeability();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.SystemResponsePropertyImpl <em>System Response Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.SystemResponsePropertyImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSystemResponseProperty()
		 * @generated
		 */
		EClass SYSTEM_RESPONSE_PROPERTY = eINSTANCE.getSystemResponseProperty();

		/**
		 * The meta object literal for the '<em><b>Constrained By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_RESPONSE_PROPERTY__CONSTRAINED_BY = eINSTANCE.getSystemResponseProperty_ConstrainedBy();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_RESPONSE_PROPERTY__DESCRIPTION = eINSTANCE.getSystemResponseProperty_Description();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl <em>Environmental Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getEnvironmentalFactor()
		 * @generated
		 */
		EClass ENVIRONMENTAL_FACTOR = eINSTANCE.getEnvironmentalFactor();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENTAL_FACTOR__DESCRIPTION = eINSTANCE.getEnvironmentalFactor_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENTAL_FACTOR__VALUE = eINSTANCE.getEnvironmentalFactor_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENTAL_FACTOR__UNIT = eINSTANCE.getEnvironmentalFactor_Unit();

		/**
		 * The meta object literal for the '<em><b>Flexibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENTAL_FACTOR__FLEXIBILITY = eINSTANCE.getEnvironmentalFactor_Flexibility();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.ValueType
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.LanguageType <em>Language Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.LanguageType
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getLanguageType()
		 * @generated
		 */
		EEnum LANGUAGE_TYPE = eINSTANCE.getLanguageType();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.CompositeInfluenceImpl <em>Composite Influence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.CompositeInfluenceImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getCompositeInfluence()
		 * @generated
		 */
		EClass COMPOSITE_INFLUENCE = eINSTANCE.getCompositeInfluence();

		/**
		 * The meta object literal for the '<em><b>Internal Influences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES = eINSTANCE.getCompositeInfluence_InternalInfluences();

		/**
		 * The meta object literal for the '<em><b>Owned Influence Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION = eINSTANCE
				.getCompositeInfluence_OwnedInfluenceFunction();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.NamedElementImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

	}

} //MetamodelPackage
