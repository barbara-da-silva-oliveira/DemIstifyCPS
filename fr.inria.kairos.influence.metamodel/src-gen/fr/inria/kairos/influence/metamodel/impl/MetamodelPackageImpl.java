/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.LanguageType;
import fr.inria.kairos.influence.metamodel.MetamodelFactory;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.NamedElement;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import fr.inria.kairos.influence.metamodel.ValueType;
import fr.inria.kairos.influence.metamodel.util.MetamodelValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelPackageImpl extends EPackageImpl implements MetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInfluenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srpInputParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalFactorParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass influenceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemResponsePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeInfluenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelPackageImpl() {
		super(eNS_URI, MetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodelPackage init() {
		if (isInited)
			return (MetamodelPackage) EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetamodelPackageImpl theMetamodelPackage = registeredMetamodelPackage instanceof MetamodelPackageImpl
				? (MetamodelPackageImpl) registeredMetamodelPackage
				: new MetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMetamodelPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return MetamodelValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodelPackage.eNS_URI, theMetamodelPackage);
		return theMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfluenceModel() {
		return influenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedInfluences() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedRequirements() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedEnvironmentalFactors() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedArtifacts() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedSRPs() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractInfluence() {
		return abstractInfluenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractInfluence_Description() {
		return (EAttribute) abstractInfluenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSRPInputParticipant() {
		return srpInputParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSRPInputParticipant_Target() {
		return (EReference) srpInputParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentalFactorParticipant() {
		return environmentalFactorParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironmentalFactorParticipant_Target() {
		return (EReference) environmentalFactorParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfluence() {
		return influenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluence_OwnedInfluenceFunction() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluence_OwnedParticipants() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluence_OutputSRP() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInfluence__ParticipationPattern__DiagnosticChain_Map() {
		return influenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipant() {
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParticipant_Weight() {
		return (EAttribute) participantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParticipant_Likelihood() {
		return (EAttribute) participantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParticipant_Confidence() {
		return (EAttribute) participantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfluenceFunction() {
		return influenceFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfluenceFunction_Definition() {
		return (EAttribute) influenceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfluenceFunction_ReturnType() {
		return (EAttribute) influenceFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfluenceFunction_Language() {
		return (EAttribute) influenceFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInfluenceFunction__LanguageReturn__DiagnosticChain_Map() {
		return influenceFunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Description() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Satisfaction() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Language() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifactParticipant() {
		return artifactParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactParticipant_Target() {
		return (EReference) artifactParticipantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesignArtifact() {
		return designArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignArtifact_Ref() {
		return (EReference) designArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignArtifact_Changeability() {
		return (EAttribute) designArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemResponseProperty() {
		return systemResponsePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemResponseProperty_ConstrainedBy() {
		return (EReference) systemResponsePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemResponseProperty_Description() {
		return (EAttribute) systemResponsePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentalFactor() {
		return environmentalFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentalFactor_Description() {
		return (EAttribute) environmentalFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentalFactor_Value() {
		return (EAttribute) environmentalFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentalFactor_Unit() {
		return (EAttribute) environmentalFactorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentalFactor_Flexibility() {
		return (EAttribute) environmentalFactorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getValueType() {
		return valueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeInfluence() {
		return compositeInfluenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeInfluence_InternalInfluences() {
		return (EReference) compositeInfluenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeInfluence_OwnedInfluenceFunction() {
		return (EReference) compositeInfluenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelFactory getMetamodelFactory() {
		return (MetamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		influenceModelEClass = createEClass(INFLUENCE_MODEL);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_INFLUENCES);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_REQUIREMENTS);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_ARTIFACTS);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_SR_PS);

		abstractInfluenceEClass = createEClass(ABSTRACT_INFLUENCE);
		createEAttribute(abstractInfluenceEClass, ABSTRACT_INFLUENCE__DESCRIPTION);

		srpInputParticipantEClass = createEClass(SRP_INPUT_PARTICIPANT);
		createEReference(srpInputParticipantEClass, SRP_INPUT_PARTICIPANT__TARGET);

		environmentalFactorParticipantEClass = createEClass(ENVIRONMENTAL_FACTOR_PARTICIPANT);
		createEReference(environmentalFactorParticipantEClass, ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);
		createEAttribute(requirementEClass, REQUIREMENT__SATISFACTION);
		createEAttribute(requirementEClass, REQUIREMENT__LANGUAGE);

		artifactParticipantEClass = createEClass(ARTIFACT_PARTICIPANT);
		createEReference(artifactParticipantEClass, ARTIFACT_PARTICIPANT__TARGET);

		compositeInfluenceEClass = createEClass(COMPOSITE_INFLUENCE);
		createEReference(compositeInfluenceEClass, COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES);
		createEReference(compositeInfluenceEClass, COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		influenceEClass = createEClass(INFLUENCE);
		createEReference(influenceEClass, INFLUENCE__OWNED_INFLUENCE_FUNCTION);
		createEReference(influenceEClass, INFLUENCE__OWNED_PARTICIPANTS);
		createEReference(influenceEClass, INFLUENCE__OUTPUT_SRP);
		createEOperation(influenceEClass, INFLUENCE___PARTICIPATION_PATTERN__DIAGNOSTICCHAIN_MAP);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__WEIGHT);
		createEAttribute(participantEClass, PARTICIPANT__LIKELIHOOD);
		createEAttribute(participantEClass, PARTICIPANT__CONFIDENCE);

		designArtifactEClass = createEClass(DESIGN_ARTIFACT);
		createEReference(designArtifactEClass, DESIGN_ARTIFACT__REF);
		createEAttribute(designArtifactEClass, DESIGN_ARTIFACT__CHANGEABILITY);

		systemResponsePropertyEClass = createEClass(SYSTEM_RESPONSE_PROPERTY);
		createEReference(systemResponsePropertyEClass, SYSTEM_RESPONSE_PROPERTY__CONSTRAINED_BY);
		createEAttribute(systemResponsePropertyEClass, SYSTEM_RESPONSE_PROPERTY__DESCRIPTION);

		environmentalFactorEClass = createEClass(ENVIRONMENTAL_FACTOR);
		createEAttribute(environmentalFactorEClass, ENVIRONMENTAL_FACTOR__DESCRIPTION);
		createEAttribute(environmentalFactorEClass, ENVIRONMENTAL_FACTOR__VALUE);
		createEAttribute(environmentalFactorEClass, ENVIRONMENTAL_FACTOR__UNIT);
		createEAttribute(environmentalFactorEClass, ENVIRONMENTAL_FACTOR__FLEXIBILITY);

		influenceFunctionEClass = createEClass(INFLUENCE_FUNCTION);
		createEAttribute(influenceFunctionEClass, INFLUENCE_FUNCTION__DEFINITION);
		createEAttribute(influenceFunctionEClass, INFLUENCE_FUNCTION__RETURN_TYPE);
		createEAttribute(influenceFunctionEClass, INFLUENCE_FUNCTION__LANGUAGE);
		createEOperation(influenceFunctionEClass, INFLUENCE_FUNCTION___LANGUAGE_RETURN__DIAGNOSTICCHAIN_MAP);

		// Create enums
		valueTypeEEnum = createEEnum(VALUE_TYPE);
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		influenceModelEClass.getESuperTypes().add(this.getNamedElement());
		abstractInfluenceEClass.getESuperTypes().add(this.getNamedElement());
		srpInputParticipantEClass.getESuperTypes().add(this.getParticipant());
		environmentalFactorParticipantEClass.getESuperTypes().add(this.getParticipant());
		requirementEClass.getESuperTypes().add(this.getNamedElement());
		artifactParticipantEClass.getESuperTypes().add(this.getParticipant());
		compositeInfluenceEClass.getESuperTypes().add(this.getAbstractInfluence());
		influenceEClass.getESuperTypes().add(this.getAbstractInfluence());
		participantEClass.getESuperTypes().add(this.getNamedElement());
		designArtifactEClass.getESuperTypes().add(this.getNamedElement());
		systemResponsePropertyEClass.getESuperTypes().add(this.getNamedElement());
		environmentalFactorEClass.getESuperTypes().add(this.getNamedElement());
		influenceFunctionEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(influenceModelEClass, InfluenceModel.class, "InfluenceModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluenceModel_OwnedInfluences(), this.getAbstractInfluence(), null, "ownedInfluences", null,
				0, -1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedRequirements(), this.getRequirement(), null, "ownedRequirements", null, 0,
				-1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedEnvironmentalFactors(), this.getEnvironmentalFactor(), null,
				"ownedEnvironmentalFactors", null, 0, -1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedArtifacts(), this.getDesignArtifact(), null, "ownedArtifacts", null, 0,
				-1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedSRPs(), this.getSystemResponseProperty(), null, "ownedSRPs", null, 0, -1,
				InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInfluenceEClass, AbstractInfluence.class, "AbstractInfluence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractInfluence_Description(), ecorePackage.getEString(), "description", null, 1, -1,
				AbstractInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(srpInputParticipantEClass, SRPInputParticipant.class, "SRPInputParticipant", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSRPInputParticipant_Target(), this.getSystemResponseProperty(), null, "target", null, 1, 1,
				SRPInputParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentalFactorParticipantEClass, EnvironmentalFactorParticipant.class,
				"EnvironmentalFactorParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentalFactorParticipant_Target(), this.getEnvironmentalFactor(), null, "target", null,
				1, 1, EnvironmentalFactorParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Satisfaction(), ecorePackage.getEString(), "satisfaction", null, 1, 1,
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Language(), this.getLanguageType(), "language", null, 1, 1, Requirement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactParticipantEClass, ArtifactParticipant.class, "ArtifactParticipant", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactParticipant_Target(), this.getDesignArtifact(), null, "target", null, 1, 1,
				ArtifactParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeInfluenceEClass, CompositeInfluence.class, "CompositeInfluence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeInfluence_InternalInfluences(), this.getAbstractInfluence(), null,
				"internalInfluences", null, 2, -1, CompositeInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeInfluence_OwnedInfluenceFunction(), this.getInfluenceFunction(), null,
				"ownedInfluenceFunction", null, 1, 1, CompositeInfluence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(influenceEClass, Influence.class, "Influence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluence_OwnedInfluenceFunction(), this.getInfluenceFunction(), null,
				"ownedInfluenceFunction", null, 1, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_OwnedParticipants(), this.getParticipant(), null, "ownedParticipants", null, 1, -1,
				Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_OutputSRP(), this.getSystemResponseProperty(), null, "outputSRP", null, 1, 1,
				Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getInfluence__ParticipationPattern__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "ParticipationPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(participantEClass, Participant.class, "Participant", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParticipant_Weight(), ecorePackage.getEDouble(), "weight", null, 1, 1, Participant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_Likelihood(), ecorePackage.getEDouble(), "likelihood", null, 1, 1,
				Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipant_Confidence(), ecorePackage.getEDouble(), "confidence", null, 1, 1,
				Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(designArtifactEClass, DesignArtifact.class, "DesignArtifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignArtifact_Ref(), ecorePackage.getEObject(), null, "ref", null, 1, 1,
				DesignArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignArtifact_Changeability(), ecorePackage.getEDouble(), "changeability", null, 1, 1,
				DesignArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(systemResponsePropertyEClass, SystemResponseProperty.class, "SystemResponseProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemResponseProperty_ConstrainedBy(), this.getRequirement(), null, "constrainedBy", null, 0,
				-1, SystemResponseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemResponseProperty_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				SystemResponseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentalFactorEClass, EnvironmentalFactor.class, "EnvironmentalFactor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentalFactor_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				EnvironmentalFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentalFactor_Value(), ecorePackage.getEDouble(), "value", null, 1, 1,
				EnvironmentalFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentalFactor_Unit(), ecorePackage.getEString(), "unit", null, 0, 1,
				EnvironmentalFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentalFactor_Flexibility(), ecorePackage.getEDouble(), "flexibility", null, 1, 1,
				EnvironmentalFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(influenceFunctionEClass, InfluenceFunction.class, "InfluenceFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfluenceFunction_Definition(), ecorePackage.getEString(), "definition", null, 1, 1,
				InfluenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfluenceFunction_ReturnType(), this.getValueType(), "returnType", null, 1, 1,
				InfluenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfluenceFunction_Language(), this.getLanguageType(), "language", null, 1, 1,
				InfluenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInfluenceFunction__LanguageReturn__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"LanguageReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
		addEEnumLiteral(valueTypeEEnum, ValueType.REAL);
		addEEnumLiteral(valueTypeEEnum, ValueType.TEXT);

		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.NATURAL_LANGUAGE);
		addEEnumLiteral(languageTypeEEnum, LanguageType.JAVA_NUMERIC_EXPRESSION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(influenceEClass, source, new String[] { "constraints", "ParticipationPattern" });
		addAnnotation(influenceFunctionEClass, source, new String[] { "constraints", "LanguageReturn" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getInfluence__ParticipationPattern__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tself.ownedParticipants->exists(p | p.oclIsKindOf(ArtifactParticipant)) and \n\t\t\t(self.ownedParticipants->exists(p | p.oclIsKindOf(EnvironmentalFactorParticipant)))\n\t\t\tor self.ownedParticipants->exists(p |p.oclIsKindOf(SRPInputParticipant))" });
		addAnnotation(getInfluenceFunction__LanguageReturn__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tif self.language = LanguageType::JavaNumericExpression then\n\t        \tself.returnType = ValueType::Real\n\t        else \n\t        \tself.returnType = ValueType::Text\n\t        endif\n        " });
	}

} //MetamodelPackageImpl
