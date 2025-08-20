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
	 * The feature id for the '<em><b>Owned Physical Phenomena</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_PHYSICAL_PHENOMENA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL__OWNED_ARTIFACTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Influence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

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
	 * The feature id for the '<em><b>Related To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE__RELATED_TO = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE__AFFECTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INFLUENCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.SystemResponseImpl <em>System Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.SystemResponseImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getSystemResponse()
	 * @generated
	 */
	int SYSTEM_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE__USED_IN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESPONSE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.PhysicalPhenomenaImpl <em>Physical Phenomena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.PhysicalPhenomenaImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getPhysicalPhenomena()
	 * @generated
	 */
	int PHYSICAL_PHENOMENA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PHENOMENA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PHENOMENA__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physical Phenomena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PHENOMENA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physical Phenomena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PHENOMENA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Satisfaction</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__METADATA = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.DesignArtifactImpl <em>Design Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.DesignArtifactImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getDesignArtifact()
	 * @generated
	 */
	int DESIGN_ARTIFACT = 5;

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
	 * The number of structural features of the '<em>Design Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ARTIFACT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Design Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ARTIFACT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Related To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__RELATED_TO = ABSTRACT_INFLUENCE__RELATED_TO;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__AFFECTS = ABSTRACT_INFLUENCE__AFFECTS;

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
	 * The feature id for the '<em><b>Owned Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INFLUENCE__OWNED_FUNCTION = ABSTRACT_INFLUENCE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Related To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__RELATED_TO = ABSTRACT_INFLUENCE__RELATED_TO;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__AFFECTS = ABSTRACT_INFLUENCE__AFFECTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__DESCRIPTION = ABSTRACT_INFLUENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Originator Phenomena</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__ORIGINATOR_PHENOMENA = ABSTRACT_INFLUENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Originator Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__ORIGINATOR_ARTIFACT = ABSTRACT_INFLUENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Originator System Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE = ABSTRACT_INFLUENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__OWNED_FUNCTION = ABSTRACT_INFLUENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Per Element Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE__PER_ELEMENT_METADATA = ABSTRACT_INFLUENCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_FEATURE_COUNT = ABSTRACT_INFLUENCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Influence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFLUENCE_OPERATION_COUNT = ABSTRACT_INFLUENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.FunctionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.CompositeFunctionImpl <em>Composite Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.CompositeFunctionImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getCompositeFunction()
	 * @generated
	 */
	int COMPOSITE_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FUNCTION__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.kairos.influence.metamodel.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.kairos.influence.metamodel.impl.MetadataImpl
	 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 11;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__LIKELIHOOD = 0;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__CONFIDENCE = 1;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__STRENGTH = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedPhysicalPhenomena <em>Owned Physical Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Physical Phenomena</em>'.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel#getOwnedPhysicalPhenomena()
	 * @see #getInfluenceModel()
	 * @generated
	 */
	EReference getInfluenceModel_OwnedPhysicalPhenomena();

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
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence <em>Abstract Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Influence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AbstractInfluence
	 * @generated
	 */
	EClass getAbstractInfluence();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related To</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AbstractInfluence#getRelatedTo()
	 * @see #getAbstractInfluence()
	 * @generated
	 */
	EReference getAbstractInfluence_RelatedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affects</em>'.
	 * @see fr.inria.kairos.influence.metamodel.AbstractInfluence#getAffects()
	 * @see #getAbstractInfluence()
	 * @generated
	 */
	EReference getAbstractInfluence_Affects();

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
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.Influence <em>Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Influence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence
	 * @generated
	 */
	EClass getInfluence();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getOriginatorPhenomena <em>Originator Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Originator Phenomena</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getOriginatorPhenomena()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_OriginatorPhenomena();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getOriginatorArtifact <em>Originator Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Originator Artifact</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getOriginatorArtifact()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_OriginatorArtifact();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getOriginatorSystemResponse <em>Originator System Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Originator System Response</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getOriginatorSystemResponse()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_OriginatorSystemResponse();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedFunction <em>Owned Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getOwnedFunction()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_OwnedFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.kairos.influence.metamodel.Influence#getPerElementMetadata <em>Per Element Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Per Element Metadata</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Influence#getPerElementMetadata()
	 * @see #getInfluence()
	 * @generated
	 */
	EReference getInfluence_PerElementMetadata();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Function#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Function#getDefinition()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Definition();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.CompositeFunction <em>Composite Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CompositeFunction
	 * @generated
	 */
	EClass getCompositeFunction();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.CompositeFunction#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CompositeFunction#getInputs()
	 * @see #getCompositeFunction()
	 * @generated
	 */
	EReference getCompositeFunction_Inputs();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Metadata#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Likelihood</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Metadata#getLikelihood()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Likelihood();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Metadata#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Metadata#getConfidence()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.Metadata#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Metadata#getStrength()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Strength();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.kairos.influence.metamodel.Metadata#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Metadata#getElement()
	 * @see #getMetadata()
	 * @generated
	 */
	EReference getMetadata_Element();

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
	 * Returns the meta object for the attribute '{@link fr.inria.kairos.influence.metamodel.SystemResponse#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponse#getDescription()
	 * @see #getSystemResponse()
	 * @generated
	 */
	EAttribute getSystemResponse_Description();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.kairos.influence.metamodel.SystemResponse#getUsedIn <em>Used In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used In</em>'.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponse#getUsedIn()
	 * @see #getSystemResponse()
	 * @generated
	 */
	EReference getSystemResponse_UsedIn();

	/**
	 * Returns the meta object for class '{@link fr.inria.kairos.influence.metamodel.PhysicalPhenomena <em>Physical Phenomena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Phenomena</em>'.
	 * @see fr.inria.kairos.influence.metamodel.PhysicalPhenomena
	 * @generated
	 */
	EClass getPhysicalPhenomena();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.kairos.influence.metamodel.PhysicalPhenomena#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see fr.inria.kairos.influence.metamodel.PhysicalPhenomena#getDescription()
	 * @see #getPhysicalPhenomena()
	 * @generated
	 */
	EAttribute getPhysicalPhenomena_Description();

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
	 * Returns the meta object for the attribute list '{@link fr.inria.kairos.influence.metamodel.Requirement#getSatisfaction <em>Satisfaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Satisfaction</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Requirement#getSatisfaction()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Satisfaction();

	/**
	 * Returns the meta object for the attribute list '{@link fr.inria.kairos.influence.metamodel.Requirement#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Metadata</em>'.
	 * @see fr.inria.kairos.influence.metamodel.Requirement#getMetadata()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Metadata();

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
	 * Returns the meta object for the containment reference '{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedFunction <em>Owned Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Function</em>'.
	 * @see fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedFunction()
	 * @see #getCompositeInfluence()
	 * @generated
	 */
	EReference getCompositeInfluence_OwnedFunction();

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
		 * The meta object literal for the '<em><b>Owned Physical Phenomena</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_PHYSICAL_PHENOMENA = eINSTANCE.getInfluenceModel_OwnedPhysicalPhenomena();

		/**
		 * The meta object literal for the '<em><b>Owned Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE_MODEL__OWNED_ARTIFACTS = eINSTANCE.getInfluenceModel_OwnedArtifacts();

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
		 * The meta object literal for the '<em><b>Related To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INFLUENCE__RELATED_TO = eINSTANCE.getAbstractInfluence_RelatedTo();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INFLUENCE__AFFECTS = eINSTANCE.getAbstractInfluence_Affects();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INFLUENCE__DESCRIPTION = eINSTANCE.getAbstractInfluence_Description();

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
		 * The meta object literal for the '<em><b>Originator Phenomena</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__ORIGINATOR_PHENOMENA = eINSTANCE.getInfluence_OriginatorPhenomena();

		/**
		 * The meta object literal for the '<em><b>Originator Artifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__ORIGINATOR_ARTIFACT = eINSTANCE.getInfluence_OriginatorArtifact();

		/**
		 * The meta object literal for the '<em><b>Originator System Response</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE = eINSTANCE.getInfluence_OriginatorSystemResponse();

		/**
		 * The meta object literal for the '<em><b>Owned Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__OWNED_FUNCTION = eINSTANCE.getInfluence_OwnedFunction();

		/**
		 * The meta object literal for the '<em><b>Per Element Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFLUENCE__PER_ELEMENT_METADATA = eINSTANCE.getInfluence_PerElementMetadata();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.FunctionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__DEFINITION = eINSTANCE.getFunction_Definition();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.CompositeFunctionImpl <em>Composite Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.CompositeFunctionImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getCompositeFunction()
		 * @generated
		 */
		EClass COMPOSITE_FUNCTION = eINSTANCE.getCompositeFunction();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_FUNCTION__INPUTS = eINSTANCE.getCompositeFunction_Inputs();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.MetadataImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__LIKELIHOOD = eINSTANCE.getMetadata_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__CONFIDENCE = eINSTANCE.getMetadata_Confidence();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__STRENGTH = eINSTANCE.getMetadata_Strength();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA__ELEMENT = eINSTANCE.getMetadata_Element();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_RESPONSE__DESCRIPTION = eINSTANCE.getSystemResponse_Description();

		/**
		 * The meta object literal for the '<em><b>Used In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_RESPONSE__USED_IN = eINSTANCE.getSystemResponse_UsedIn();

		/**
		 * The meta object literal for the '{@link fr.inria.kairos.influence.metamodel.impl.PhysicalPhenomenaImpl <em>Physical Phenomena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.kairos.influence.metamodel.impl.PhysicalPhenomenaImpl
		 * @see fr.inria.kairos.influence.metamodel.impl.MetamodelPackageImpl#getPhysicalPhenomena()
		 * @generated
		 */
		EClass PHYSICAL_PHENOMENA = eINSTANCE.getPhysicalPhenomena();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PHENOMENA__DESCRIPTION = eINSTANCE.getPhysicalPhenomena_Description();

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
		 * The meta object literal for the '<em><b>Satisfaction</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SATISFACTION = eINSTANCE.getRequirement_Satisfaction();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__METADATA = eINSTANCE.getRequirement_Metadata();

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
		 * The meta object literal for the '<em><b>Owned Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INFLUENCE__OWNED_FUNCTION = eINSTANCE.getCompositeInfluence_OwnedFunction();

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
