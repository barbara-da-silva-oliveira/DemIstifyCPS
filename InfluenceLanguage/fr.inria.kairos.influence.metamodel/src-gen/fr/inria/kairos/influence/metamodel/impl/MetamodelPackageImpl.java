/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.CompositeFunction;
import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Function;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelFactory;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.NamedElement;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass influenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPhenomenaEClass = null;

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
	private EClass designArtifactEClass = null;

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
	public EReference getInfluenceModel_OwnedPhysicalPhenomena() {
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
	public EClass getAbstractInfluence() {
		return abstractInfluenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractInfluence_RelatedTo() {
		return (EReference) abstractInfluenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractInfluence_Affects() {
		return (EReference) abstractInfluenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractInfluence_Description() {
		return (EAttribute) abstractInfluenceEClass.getEStructuralFeatures().get(2);
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
	public EReference getInfluence_OriginatorPhenomena() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluence_OriginatorArtifact() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluence_OriginatorSystemResponse() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluence_OwnedFunction() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Definition() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeFunction() {
		return compositeFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeFunction_Inputs() {
		return (EReference) compositeFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemResponse() {
		return systemResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemResponse_Description() {
		return (EAttribute) systemResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemResponse_UsedIn() {
		return (EReference) systemResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysicalPhenomena() {
		return physicalPhenomenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysicalPhenomena_Description() {
		return (EAttribute) physicalPhenomenaEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getRequirement_Satisfaction() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(0);
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
	public EReference getCompositeInfluence_OwnedFunction() {
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
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_PHYSICAL_PHENOMENA);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_ARTIFACTS);

		abstractInfluenceEClass = createEClass(ABSTRACT_INFLUENCE);
		createEReference(abstractInfluenceEClass, ABSTRACT_INFLUENCE__RELATED_TO);
		createEReference(abstractInfluenceEClass, ABSTRACT_INFLUENCE__AFFECTS);
		createEAttribute(abstractInfluenceEClass, ABSTRACT_INFLUENCE__DESCRIPTION);

		systemResponseEClass = createEClass(SYSTEM_RESPONSE);
		createEAttribute(systemResponseEClass, SYSTEM_RESPONSE__DESCRIPTION);
		createEReference(systemResponseEClass, SYSTEM_RESPONSE__USED_IN);

		physicalPhenomenaEClass = createEClass(PHYSICAL_PHENOMENA);
		createEAttribute(physicalPhenomenaEClass, PHYSICAL_PHENOMENA__DESCRIPTION);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__SATISFACTION);

		designArtifactEClass = createEClass(DESIGN_ARTIFACT);
		createEReference(designArtifactEClass, DESIGN_ARTIFACT__REF);

		compositeInfluenceEClass = createEClass(COMPOSITE_INFLUENCE);
		createEReference(compositeInfluenceEClass, COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES);
		createEReference(compositeInfluenceEClass, COMPOSITE_INFLUENCE__OWNED_FUNCTION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		influenceEClass = createEClass(INFLUENCE);
		createEReference(influenceEClass, INFLUENCE__ORIGINATOR_PHENOMENA);
		createEReference(influenceEClass, INFLUENCE__ORIGINATOR_ARTIFACT);
		createEReference(influenceEClass, INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE);
		createEReference(influenceEClass, INFLUENCE__OWNED_FUNCTION);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__DEFINITION);

		compositeFunctionEClass = createEClass(COMPOSITE_FUNCTION);
		createEReference(compositeFunctionEClass, COMPOSITE_FUNCTION__INPUTS);
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
		systemResponseEClass.getESuperTypes().add(this.getNamedElement());
		physicalPhenomenaEClass.getESuperTypes().add(this.getNamedElement());
		requirementEClass.getESuperTypes().add(this.getNamedElement());
		designArtifactEClass.getESuperTypes().add(this.getNamedElement());
		compositeInfluenceEClass.getESuperTypes().add(this.getAbstractInfluence());
		influenceEClass.getESuperTypes().add(this.getAbstractInfluence());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		compositeFunctionEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(influenceModelEClass, InfluenceModel.class, "InfluenceModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluenceModel_OwnedInfluences(), this.getAbstractInfluence(), null, "ownedInfluences", null,
				0, -1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedRequirements(), this.getRequirement(), null, "ownedRequirements", null, 0,
				-1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedPhysicalPhenomena(), this.getPhysicalPhenomena(), null,
				"ownedPhysicalPhenomena", null, 0, -1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedArtifacts(), this.getDesignArtifact(), null, "ownedArtifacts", null, 0,
				-1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInfluenceEClass, AbstractInfluence.class, "AbstractInfluence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractInfluence_RelatedTo(), this.getRequirement(), null, "relatedTo", null, 0, -1,
				AbstractInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractInfluence_Affects(), this.getSystemResponse(), null, "affects", null, 1, -1,
				AbstractInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInfluence_Description(), ecorePackage.getEString(), "description", null, 1, -1,
				AbstractInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(systemResponseEClass, SystemResponse.class, "SystemResponse", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemResponse_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SystemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSystemResponse_UsedIn(), this.getRequirement(), null, "usedIn", null, 0, -1,
				SystemResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalPhenomenaEClass, PhysicalPhenomena.class, "PhysicalPhenomena", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalPhenomena_Description(), ecorePackage.getEString(), "description", null, 0, -1,
				PhysicalPhenomena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Satisfaction(), ecorePackage.getEString(), "satisfaction", null, 1, -1,
				Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(designArtifactEClass, DesignArtifact.class, "DesignArtifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignArtifact_Ref(), ecorePackage.getEObject(), null, "ref", null, 0, 1,
				DesignArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeInfluenceEClass, CompositeInfluence.class, "CompositeInfluence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeInfluence_InternalInfluences(), this.getAbstractInfluence(), null,
				"internalInfluences", null, 2, -1, CompositeInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeInfluence_OwnedFunction(), this.getCompositeFunction(), null, "ownedFunction", null,
				1, 1, CompositeInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(influenceEClass, Influence.class, "Influence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluence_OriginatorPhenomena(), this.getPhysicalPhenomena(), null, "originatorPhenomena",
				null, 0, -1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_OriginatorArtifact(), this.getDesignArtifact(), null, "originatorArtifact", null, 0,
				-1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_OriginatorSystemResponse(), this.getSystemResponse(), null,
				"originatorSystemResponse", null, 0, -1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluence_OwnedFunction(), this.getFunction(), null, "ownedFunction", null, 1, 1,
				Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, Function.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeFunctionEClass, CompositeFunction.class, "CompositeFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeFunction_Inputs(), this.getSystemResponse(), null, "inputs", null, 0, -1,
				CompositeFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelPackageImpl
