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
	int NAMED_ELEMENT = 0;

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
	int INFLUENCE_MODEL = 1;

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
	 * The feature id for the '<em><b>Owned Environmental Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_ARTIFACTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned SR Ps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_SR_PS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Satisfaction Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_SATISFACTION_CRITERIA = NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	int ABSTRACT_INFLUENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
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
	int PARTICIPANT = 4;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.SRPInputParticipantImpl <em>SRP Input Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.SRPInputParticipantImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSRPInputParticipant()
	 * @generated
	 */
	int SRP_INPUT_PARTICIPANT = 5;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl <em>Environmental Factor Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getEnvironmentalFactorParticipant()
	 * @generated
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT = 7;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl <em>Satisfaction Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSatisfactionCriterion()
	 * @generated
	 */
	int SATISFACTION_CRITERION = 8;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl <em>Influence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.InfluenceImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getInfluence()
	 * @generated
	 */
	int INFLUENCE = 3;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ArtifactParticipantImpl <em>Artifact Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ArtifactParticipantImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getArtifactParticipant()
	 * @generated
	 */
	int ARTIFACT_PARTICIPANT = 6;

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
	int COMPOSITE_INFLUENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__NAME = ABSTRACT_INFLUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__CONFIDENCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRP_INPUT_PARTICIPANT__NAME = PARTICIPANT__NAME;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_PARTICIPANT__NAME = PARTICIPANT__NAME;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT__NAME = PARTICIPANT__NAME;

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
	 * The feature id for the '<em><b>Admissible Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE = PARTICIPANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environmental Factor Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT_FEATURE_COUNT = PARTICIPANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Environmental Factor Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_PARTICIPANT_OPERATION_COUNT = PARTICIPANT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_CRITERION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Requirement Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_CRITERION__REQUIREMENT_REF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_CRITERION__LANGUAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margin Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_CRITERION__MARGIN_DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constrained SR Ps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_CRITERION__CONSTRAINED_SR_PS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Satisfaction Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_CRITERION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Satisfaction Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFACTION_CRITERION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__NAME = ABSTRACT_INFLUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_PROPERTY__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Response Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Flexibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR__FLEXIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Environmental Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTAL_FACTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Representations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION__REPRESENTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Influence Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Influence Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRangeImpl <em>Participant Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantRangeImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipantRange()
	 * @generated
	 */
	int PARTICIPANT_RANGE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RANGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RANGE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RANGE__PARTICIPANT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participant Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RANGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Participant Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RANGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ValueSpecImpl <em>Value Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ValueSpecImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getValueSpec()
	 * @generated
	 */
	int VALUE_SPEC = 15;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPEC__UNIT = 0;

	/**
	 * The number of structural features of the '<em>Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ScalarValueImpl <em>Scalar Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ScalarValueImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getScalarValue()
	 * @generated
	 */
	int SCALAR_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE__UNIT = VALUE_SPEC__UNIT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE__VALUE = VALUE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scalar Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE_FEATURE_COUNT = VALUE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scalar Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_VALUE_OPERATION_COUNT = VALUE_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl <em>Range Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.RangeValueImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getRangeValue()
	 * @generated
	 */
	int RANGE_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE__UNIT = VALUE_SPEC__UNIT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE__LOWER = VALUE_SPEC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE__UPPER = VALUE_SPEC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nominal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE__NOMINAL = VALUE_SPEC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE__STEP = VALUE_SPEC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inclusive Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE__INCLUSIVE_LOWER = VALUE_SPEC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inclusive Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE__INCLUSIVE_UPPER = VALUE_SPEC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Range Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_FEATURE_COUNT = VALUE_SPEC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Range Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_VALUE_OPERATION_COUNT = VALUE_SPEC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.FunctionRepresentationImpl <em>Function Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.FunctionRepresentationImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getFunctionRepresentation()
	 * @generated
	 */
	int FUNCTION_REPRESENTATION = 18;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REPRESENTATION__SOURCE_URI = 0;

	/**
	 * The feature id for the '<em><b>Applicability Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REPRESENTATION__CONFIDENCE = 2;

	/**
	 * The number of structural features of the '<em>Function Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REPRESENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.NaturalLanguageFunctionImpl <em>Natural Language Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.NaturalLanguageFunctionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getNaturalLanguageFunction()
	 * @generated
	 */
	int NATURAL_LANGUAGE_FUNCTION = 19;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FUNCTION__SOURCE_URI = FUNCTION_REPRESENTATION__SOURCE_URI;

	/**
	 * The feature id for the '<em><b>Applicability Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FUNCTION__APPLICABILITY_DOMAIN = FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FUNCTION__CONFIDENCE = FUNCTION_REPRESENTATION__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FUNCTION__NAME = FUNCTION_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FUNCTION__DEFINITION = FUNCTION_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Natural Language Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FUNCTION_FEATURE_COUNT = FUNCTION_REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Natural Language Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_FUNCTION_OPERATION_COUNT = FUNCTION_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantImpactFunctionImpl <em>Participant Impact Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantImpactFunctionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipantImpactFunction()
	 * @generated
	 */
	int PARTICIPANT_IMPACT_FUNCTION = 20;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_IMPACT_FUNCTION__SOURCE_URI = FUNCTION_REPRESENTATION__SOURCE_URI;

	/**
	 * The feature id for the '<em><b>Applicability Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_IMPACT_FUNCTION__APPLICABILITY_DOMAIN = FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_IMPACT_FUNCTION__CONFIDENCE = FUNCTION_REPRESENTATION__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_IMPACT_FUNCTION__NAME = FUNCTION_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant Contribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION = FUNCTION_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participant Impact Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_IMPACT_FUNCTION_FEATURE_COUNT = FUNCTION_REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Participant Impact Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_IMPACT_FUNCTION_OPERATION_COUNT = FUNCTION_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl <em>Participant Relative Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipantRelativeImpact()
	 * @generated
	 */
	int PARTICIPANT_RELATIVE_IMPACT = 21;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT = 0;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RELATIVE_IMPACT__DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RELATIVE_IMPACT__RATIONALE = 3;

	/**
	 * The number of structural features of the '<em>Participant Relative Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RELATIVE_IMPACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Participant Relative Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_RELATIVE_IMPACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.AnalyticExpressionFunctionImpl <em>Analytic Expression Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.AnalyticExpressionFunctionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getAnalyticExpressionFunction()
	 * @generated
	 */
	int ANALYTIC_EXPRESSION_FUNCTION = 22;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION__SOURCE_URI = FUNCTION_REPRESENTATION__SOURCE_URI;

	/**
	 * The feature id for the '<em><b>Applicability Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION__APPLICABILITY_DOMAIN = FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION__CONFIDENCE = FUNCTION_REPRESENTATION__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION__NAME = FUNCTION_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION = FUNCTION_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION_LANGUAGE = FUNCTION_REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Analytic Expression Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION_FEATURE_COUNT = FUNCTION_REPRESENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Analytic Expression Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTIC_EXPRESSION_FUNCTION_OPERATION_COUNT = FUNCTION_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityTableImpl <em>Monotonicity Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.MonotonicityTableImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMonotonicityTable()
	 * @generated
	 */
	int MONOTONICITY_TABLE = 23;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_TABLE__SOURCE_URI = FUNCTION_REPRESENTATION__SOURCE_URI;

	/**
	 * The feature id for the '<em><b>Applicability Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_TABLE__APPLICABILITY_DOMAIN = FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_TABLE__CONFIDENCE = FUNCTION_REPRESENTATION__CONFIDENCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_TABLE__NAME = FUNCTION_REPRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_TABLE__TABLE_ROWS = FUNCTION_REPRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monotonicity Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_TABLE_FEATURE_COUNT = FUNCTION_REPRESENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Monotonicity Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_TABLE_OPERATION_COUNT = FUNCTION_REPRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl <em>Monotonicity Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMonotonicityRow()
	 * @generated
	 */
	int MONOTONICITY_ROW = 24;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_ROW__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Trend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_ROW__TREND = 1;

	/**
	 * The feature id for the '<em><b>Varied Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_ROW__VARIED_PARTICIPANT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_ROW__OUTPUT = 3;

	/**
	 * The number of structural features of the '<em>Monotonicity Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_ROW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Monotonicity Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONOTONICITY_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 25;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.TrendType <em>Trend Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.TrendType
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getTrendType()
	 * @generated
	 */
	int TREND_TYPE = 26;

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
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedSatisfactionCriteria <em>Owned Satisfaction Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Satisfaction Criteria</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedSatisfactionCriteria()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedSatisfactionCriteria();

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
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
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
	 * Returns the meta object for the containment reference '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant#getAdmissibleSpace <em>Admissible Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admissible Space</em>'.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant#getAdmissibleSpace()
	 * @see #getEnvironmentalFactorParticipant()
	 * @generated
	 */
	EReference getEnvironmentalFactorParticipant_AdmissibleSpace();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion <em>Satisfaction Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfaction Criterion</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SatisfactionCriterion
	 * @generated
	 */
	EClass getSatisfactionCriterion();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getRequirementRef <em>Requirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Ref</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getRequirementRef()
	 * @see #getSatisfactionCriterion()
	 * @generated
	 */
	EReference getSatisfactionCriterion_RequirementRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getLanguage()
	 * @see #getSatisfactionCriterion()
	 * @generated
	 */
	EAttribute getSatisfactionCriterion_Language();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getMarginDefinition <em>Margin Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Definition</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getMarginDefinition()
	 * @see #getSatisfactionCriterion()
	 * @generated
	 */
	EAttribute getSatisfactionCriterion_MarginDefinition();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getConstrainedSRPs <em>Constrained SR Ps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained SR Ps</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SatisfactionCriterion#getConstrainedSRPs()
	 * @see #getSatisfactionCriterion()
	 * @generated
	 */
	EReference getSatisfactionCriterion_ConstrainedSRPs();

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
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getRepresentations <em>Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representations</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceFunction#getRepresentations()
	 * @see #getInfluenceFunction()
	 * @generated
	 */
	EReference getInfluenceFunction_Representations();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.ParticipantRange <em>Participant Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Range</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRange
	 * @generated
	 */
	EClass getParticipantRange();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.kairos.influence.metamodel.ParticipantRange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRange#getValue()
	 * @see #getParticipantRange()
	 * @generated
	 */
	EReference getParticipantRange_Value();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.ParticipantRange#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participant</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRange#getParticipant()
	 * @see #getParticipantRange()
	 * @generated
	 */
	EReference getParticipantRange_Participant();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.ValueSpec <em>Value Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Spec</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ValueSpec
	 * @generated
	 */
	EClass getValueSpec();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.ValueSpec#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ValueSpec#getUnit()
	 * @see #getValueSpec()
	 * @generated
	 */
	EAttribute getValueSpec_Unit();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.ScalarValue <em>Scalar Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Value</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ScalarValue
	 * @generated
	 */
	EClass getScalarValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.ScalarValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ScalarValue#getValue()
	 * @see #getScalarValue()
	 * @generated
	 */
	EAttribute getScalarValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.RangeValue <em>Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Value</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue
	 * @generated
	 */
	EClass getRangeValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RangeValue#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue#getLower()
	 * @see #getRangeValue()
	 * @generated
	 */
	EAttribute getRangeValue_Lower();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RangeValue#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue#getUpper()
	 * @see #getRangeValue()
	 * @generated
	 */
	EAttribute getRangeValue_Upper();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RangeValue#getNominal <em>Nominal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue#getNominal()
	 * @see #getRangeValue()
	 * @generated
	 */
	EAttribute getRangeValue_Nominal();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RangeValue#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue#getStep()
	 * @see #getRangeValue()
	 * @generated
	 */
	EAttribute getRangeValue_Step();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveLower <em>Inclusive Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive Lower</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveLower()
	 * @see #getRangeValue()
	 * @generated
	 */
	EAttribute getRangeValue_InclusiveLower();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveUpper <em>Inclusive Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inclusive Upper</em>'.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue#isInclusiveUpper()
	 * @see #getRangeValue()
	 * @generated
	 */
	EAttribute getRangeValue_InclusiveUpper();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation <em>Function Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Representation</em>'.
	 * @see fr.inria.kairos.influence.metamodel.FunctionRepresentation
	 * @generated
	 */
	EClass getFunctionRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getSourceUri <em>Source Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Uri</em>'.
	 * @see fr.inria.kairos.influence.metamodel.FunctionRepresentation#getSourceUri()
	 * @see #getFunctionRepresentation()
	 * @generated
	 */
	EAttribute getFunctionRepresentation_SourceUri();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getApplicabilityDomain <em>Applicability Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicability Domain</em>'.
	 * @see fr.inria.kairos.influence.metamodel.FunctionRepresentation#getApplicabilityDomain()
	 * @see #getFunctionRepresentation()
	 * @generated
	 */
	EReference getFunctionRepresentation_ApplicabilityDomain();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.FunctionRepresentation#getConfidence()
	 * @see #getFunctionRepresentation()
	 * @generated
	 */
	EAttribute getFunctionRepresentation_Confidence();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.NaturalLanguageFunction <em>Natural Language Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Language Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.NaturalLanguageFunction
	 * @generated
	 */
	EClass getNaturalLanguageFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.NaturalLanguageFunction#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see fr.inria.kairos.influence.metamodel.NaturalLanguageFunction#getDefinition()
	 * @see #getNaturalLanguageFunction()
	 * @generated
	 */
	EAttribute getNaturalLanguageFunction_Definition();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.ParticipantImpactFunction <em>Participant Impact Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Impact Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantImpactFunction
	 * @generated
	 */
	EClass getParticipantImpactFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.ParticipantImpactFunction#getParticipantContribution <em>Participant Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Contribution</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantImpactFunction#getParticipantContribution()
	 * @see #getParticipantImpactFunction()
	 * @generated
	 */
	EReference getParticipantImpactFunction_ParticipantContribution();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact <em>Participant Relative Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Relative Impact</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact
	 * @generated
	 */
	EClass getParticipantRelativeImpact();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participant</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getParticipant()
	 * @see #getParticipantRelativeImpact()
	 * @generated
	 */
	EReference getParticipantRelativeImpact_Participant();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getImportance <em>Importance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importance</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getImportance()
	 * @see #getParticipantRelativeImpact()
	 * @generated
	 */
	EAttribute getParticipantRelativeImpact_Importance();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getDirection()
	 * @see #getParticipantRelativeImpact()
	 * @generated
	 */
	EAttribute getParticipantRelativeImpact_Direction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact#getRationale()
	 * @see #getParticipantRelativeImpact()
	 * @generated
	 */
	EAttribute getParticipantRelativeImpact_Rationale();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction <em>Analytic Expression Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analytic Expression Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction
	 * @generated
	 */
	EClass getAnalyticExpressionFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpression()
	 * @see #getAnalyticExpressionFunction()
	 * @generated
	 */
	EAttribute getAnalyticExpressionFunction_Expression();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction#getExpressionLanguage()
	 * @see #getAnalyticExpressionFunction()
	 * @generated
	 */
	EAttribute getAnalyticExpressionFunction_ExpressionLanguage();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.MonotonicityTable <em>Monotonicity Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monotonicity Table</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityTable
	 * @generated
	 */
	EClass getMonotonicityTable();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.MonotonicityTable#getTableRows <em>Table Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityTable#getTableRows()
	 * @see #getMonotonicityTable()
	 * @generated
	 */
	EReference getMonotonicityTable_TableRows();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow <em>Monotonicity Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monotonicity Row</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityRow
	 * @generated
	 */
	EClass getMonotonicityRow();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityRow#getCondition()
	 * @see #getMonotonicityRow()
	 * @generated
	 */
	EReference getMonotonicityRow_Condition();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getTrend <em>Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trend</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityRow#getTrend()
	 * @see #getMonotonicityRow()
	 * @generated
	 */
	EAttribute getMonotonicityRow_Trend();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getVariedParticipant <em>Varied Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Varied Participant</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityRow#getVariedParticipant()
	 * @see #getMonotonicityRow()
	 * @generated
	 */
	EReference getMonotonicityRow_VariedParticipant();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityRow#getOutput()
	 * @see #getMonotonicityRow()
	 * @generated
	 */
	EReference getMonotonicityRow_Output();

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
	 * Returns the meta object for enum '{@link fr.inria.kairos.influence.metamodel.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see fr.inria.kairos.influence.metamodel.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the meta object for enum '{@link fr.inria.kairos.influence.metamodel.TrendType <em>Trend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trend Type</em>'.
	 * @see fr.inria.kairos.influence.metamodel.TrendType
	 * @generated
	 */
	EEnum getTrendType();

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
		 * The meta object literal for the '<em><b>Owned Satisfaction Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_SATISFACTION_CRITERIA = eINSTANCE
				.getInfluenceModel_OwnedSatisfactionCriteria();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
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
		 * The meta object literal for the '<em><b>Admissible Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE = eINSTANCE
				.getEnvironmentalFactorParticipant_AdmissibleSpace();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl <em>Satisfaction Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSatisfactionCriterion()
		 * @generated
		 */
		EClass SATISFACTION_CRITERION = eINSTANCE.getSatisfactionCriterion();

		/**
		 * The meta object literal for the '<em><b>Requirement Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFACTION_CRITERION__REQUIREMENT_REF = eINSTANCE.getSatisfactionCriterion_RequirementRef();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATISFACTION_CRITERION__LANGUAGE = eINSTANCE.getSatisfactionCriterion_Language();

		/**
		 * The meta object literal for the '<em><b>Margin Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATISFACTION_CRITERION__MARGIN_DEFINITION = eINSTANCE.getSatisfactionCriterion_MarginDefinition();

		/**
		 * The meta object literal for the '<em><b>Constrained SR Ps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFACTION_CRITERION__CONSTRAINED_SR_PS = eINSTANCE.getSatisfactionCriterion_ConstrainedSRPs();

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
		 * The meta object literal for the '<em><b>Representations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_FUNCTION__REPRESENTATIONS = eINSTANCE.getInfluenceFunction_Representations();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRangeImpl <em>Participant Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantRangeImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipantRange()
		 * @generated
		 */
		EClass PARTICIPANT_RANGE = eINSTANCE.getParticipantRange();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_RANGE__VALUE = eINSTANCE.getParticipantRange_Value();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_RANGE__PARTICIPANT = eINSTANCE.getParticipantRange_Participant();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ValueSpecImpl <em>Value Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ValueSpecImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getValueSpec()
		 * @generated
		 */
		EClass VALUE_SPEC = eINSTANCE.getValueSpec();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPEC__UNIT = eINSTANCE.getValueSpec_Unit();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ScalarValueImpl <em>Scalar Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ScalarValueImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getScalarValue()
		 * @generated
		 */
		EClass SCALAR_VALUE = eINSTANCE.getScalarValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALAR_VALUE__VALUE = eINSTANCE.getScalarValue_Value();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl <em>Range Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.RangeValueImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getRangeValue()
		 * @generated
		 */
		EClass RANGE_VALUE = eINSTANCE.getRangeValue();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE__LOWER = eINSTANCE.getRangeValue_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE__UPPER = eINSTANCE.getRangeValue_Upper();

		/**
		 * The meta object literal for the '<em><b>Nominal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE__NOMINAL = eINSTANCE.getRangeValue_Nominal();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE__STEP = eINSTANCE.getRangeValue_Step();

		/**
		 * The meta object literal for the '<em><b>Inclusive Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE__INCLUSIVE_LOWER = eINSTANCE.getRangeValue_InclusiveLower();

		/**
		 * The meta object literal for the '<em><b>Inclusive Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_VALUE__INCLUSIVE_UPPER = eINSTANCE.getRangeValue_InclusiveUpper();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.FunctionRepresentationImpl <em>Function Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.FunctionRepresentationImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getFunctionRepresentation()
		 * @generated
		 */
		EClass FUNCTION_REPRESENTATION = eINSTANCE.getFunctionRepresentation();

		/**
		 * The meta object literal for the '<em><b>Source Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_REPRESENTATION__SOURCE_URI = eINSTANCE.getFunctionRepresentation_SourceUri();

		/**
		 * The meta object literal for the '<em><b>Applicability Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN = eINSTANCE
				.getFunctionRepresentation_ApplicabilityDomain();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_REPRESENTATION__CONFIDENCE = eINSTANCE.getFunctionRepresentation_Confidence();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.NaturalLanguageFunctionImpl <em>Natural Language Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.NaturalLanguageFunctionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getNaturalLanguageFunction()
		 * @generated
		 */
		EClass NATURAL_LANGUAGE_FUNCTION = eINSTANCE.getNaturalLanguageFunction();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_LANGUAGE_FUNCTION__DEFINITION = eINSTANCE.getNaturalLanguageFunction_Definition();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantImpactFunctionImpl <em>Participant Impact Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantImpactFunctionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipantImpactFunction()
		 * @generated
		 */
		EClass PARTICIPANT_IMPACT_FUNCTION = eINSTANCE.getParticipantImpactFunction();

		/**
		 * The meta object literal for the '<em><b>Participant Contribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION = eINSTANCE
				.getParticipantImpactFunction_ParticipantContribution();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl <em>Participant Relative Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getParticipantRelativeImpact()
		 * @generated
		 */
		EClass PARTICIPANT_RELATIVE_IMPACT = eINSTANCE.getParticipantRelativeImpact();

		/**
		 * The meta object literal for the '<em><b>Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT = eINSTANCE.getParticipantRelativeImpact_Participant();

		/**
		 * The meta object literal for the '<em><b>Importance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE = eINSTANCE.getParticipantRelativeImpact_Importance();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_RELATIVE_IMPACT__DIRECTION = eINSTANCE.getParticipantRelativeImpact_Direction();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_RELATIVE_IMPACT__RATIONALE = eINSTANCE.getParticipantRelativeImpact_Rationale();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.AnalyticExpressionFunctionImpl <em>Analytic Expression Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.AnalyticExpressionFunctionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getAnalyticExpressionFunction()
		 * @generated
		 */
		EClass ANALYTIC_EXPRESSION_FUNCTION = eINSTANCE.getAnalyticExpressionFunction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION = eINSTANCE.getAnalyticExpressionFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION_LANGUAGE = eINSTANCE
				.getAnalyticExpressionFunction_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityTableImpl <em>Monotonicity Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.MonotonicityTableImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMonotonicityTable()
		 * @generated
		 */
		EClass MONOTONICITY_TABLE = eINSTANCE.getMonotonicityTable();

		/**
		 * The meta object literal for the '<em><b>Table Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOTONICITY_TABLE__TABLE_ROWS = eINSTANCE.getMonotonicityTable_TableRows();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl <em>Monotonicity Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMonotonicityRow()
		 * @generated
		 */
		EClass MONOTONICITY_ROW = eINSTANCE.getMonotonicityRow();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOTONICITY_ROW__CONDITION = eINSTANCE.getMonotonicityRow_Condition();

		/**
		 * The meta object literal for the '<em><b>Trend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONOTONICITY_ROW__TREND = eINSTANCE.getMonotonicityRow_Trend();

		/**
		 * The meta object literal for the '<em><b>Varied Participant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOTONICITY_ROW__VARIED_PARTICIPANT = eINSTANCE.getMonotonicityRow_VariedParticipant();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONOTONICITY_ROW__OUTPUT = eINSTANCE.getMonotonicityRow_Output();

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
		 * The meta object literal for the '<em><b>Flexibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENTAL_FACTOR__FLEXIBILITY = eINSTANCE.getEnvironmentalFactor_Flexibility();

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
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.TrendType <em>Trend Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.TrendType
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getTrendType()
		 * @generated
		 */
		EEnum TREND_TYPE = eINSTANCE.getTrendType();

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
