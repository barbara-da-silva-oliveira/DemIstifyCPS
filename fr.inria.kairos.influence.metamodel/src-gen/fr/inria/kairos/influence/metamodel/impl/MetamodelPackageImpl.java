/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.FunctionRepresentation;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.LanguageType;
import fr.inria.kairos.influence.metamodel.MetamodelFactory;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.MonotonicityRow;
import fr.inria.kairos.influence.metamodel.MonotonicityTable;
import fr.inria.kairos.influence.metamodel.NamedElement;
import fr.inria.kairos.influence.metamodel.NaturalLanguageFunction;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction;
import fr.inria.kairos.influence.metamodel.ParticipantRange;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import fr.inria.kairos.influence.metamodel.RangeValue;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion;
import fr.inria.kairos.influence.metamodel.ScalarValue;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import fr.inria.kairos.influence.metamodel.TrendType;
import fr.inria.kairos.influence.metamodel.ValueSpec;

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
	private EClass namedElementEClass = null;

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
	private EClass participantEClass = null;

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
	private EClass artifactParticipantEClass = null;

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
	private EClass satisfactionCriterionEClass = null;

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
	private EClass influenceFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalarValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalLanguageFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantImpactFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantRelativeImpactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyticExpressionFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monotonicityTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monotonicityRowEClass = null;

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
	private EEnum trendTypeEEnum = null;

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
	public EReference getInfluenceModel_OwnedEnvironmentalFactors() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedArtifacts() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedSRPs() {
		return (EReference) influenceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluenceModel_OwnedSatisfactionCriteria() {
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
	public EReference getAbstractInfluence_OwnedInfluenceFunction() {
		return (EReference) abstractInfluenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractInfluence_Description() {
		return (EAttribute) abstractInfluenceEClass.getEStructuralFeatures().get(1);
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
	public EReference getInfluence_OwnedParticipants() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfluence_OutputSRP() {
		return (EReference) influenceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getParticipant_Confidence() {
		return (EAttribute) participantEClass.getEStructuralFeatures().get(0);
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
	public EReference getEnvironmentalFactorParticipant_AdmissibleSpace() {
		return (EReference) environmentalFactorParticipantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSatisfactionCriterion() {
		return satisfactionCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfactionCriterion_RequirementRef() {
		return (EReference) satisfactionCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfactionCriterion_Language() {
		return (EAttribute) satisfactionCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfactionCriterion_CriterionDefinition() {
		return (EAttribute) satisfactionCriterionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfactionCriterion_ConstrainedSRPs() {
		return (EReference) satisfactionCriterionEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getSystemResponseProperty_Description() {
		return (EAttribute) systemResponsePropertyEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getEnvironmentalFactor_Flexibility() {
		return (EAttribute) environmentalFactorEClass.getEStructuralFeatures().get(1);
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
	public EReference getInfluenceFunction_Representations() {
		return (EReference) influenceFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipantRange() {
		return participantRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipantRange_Value() {
		return (EReference) participantRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipantRange_Participant() {
		return (EReference) participantRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueSpec() {
		return valueSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueSpec_Unit() {
		return (EAttribute) valueSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScalarValue() {
		return scalarValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScalarValue_Value() {
		return (EAttribute) scalarValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRangeValue() {
		return rangeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeValue_Lower() {
		return (EAttribute) rangeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeValue_Upper() {
		return (EAttribute) rangeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeValue_Nominal() {
		return (EAttribute) rangeValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeValue_Step() {
		return (EAttribute) rangeValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeValue_InclusiveLower() {
		return (EAttribute) rangeValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRangeValue_InclusiveUpper() {
		return (EAttribute) rangeValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionRepresentation() {
		return functionRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionRepresentation_SourceUri() {
		return (EAttribute) functionRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionRepresentation_ApplicabilityDomain() {
		return (EReference) functionRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionRepresentation_Confidence() {
		return (EAttribute) functionRepresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNaturalLanguageFunction() {
		return naturalLanguageFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNaturalLanguageFunction_Definition() {
		return (EAttribute) naturalLanguageFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipantImpactFunction() {
		return participantImpactFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipantImpactFunction_ParticipantContribution() {
		return (EReference) participantImpactFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParticipantRelativeImpact() {
		return participantRelativeImpactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParticipantRelativeImpact_Participant() {
		return (EReference) participantRelativeImpactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParticipantRelativeImpact_Importance() {
		return (EAttribute) participantRelativeImpactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParticipantRelativeImpact_Direction() {
		return (EAttribute) participantRelativeImpactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParticipantRelativeImpact_Rationale() {
		return (EAttribute) participantRelativeImpactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalyticExpressionFunction() {
		return analyticExpressionFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalyticExpressionFunction_Expression() {
		return (EAttribute) analyticExpressionFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalyticExpressionFunction_ExpressionLanguage() {
		return (EAttribute) analyticExpressionFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonotonicityTable() {
		return monotonicityTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonotonicityTable_TableRows() {
		return (EReference) monotonicityTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonotonicityRow() {
		return monotonicityRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonotonicityRow_Condition() {
		return (EReference) monotonicityRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonotonicityRow_Trend() {
		return (EAttribute) monotonicityRowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonotonicityRow_VariedParticipant() {
		return (EReference) monotonicityRowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMonotonicityRow_Output() {
		return (EReference) monotonicityRowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonotonicityRow_LocalSlope() {
		return (EAttribute) monotonicityRowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonotonicityRow_NLevels() {
		return (EAttribute) monotonicityRowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMonotonicityRow_Rationale() {
		return (EAttribute) monotonicityRowEClass.getEStructuralFeatures().get(6);
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
	public EEnum getTrendType() {
		return trendTypeEEnum;
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		influenceModelEClass = createEClass(INFLUENCE_MODEL);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_INFLUENCES);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_ARTIFACTS);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_SR_PS);
		createEReference(influenceModelEClass, INFLUENCE_MODEL__OWNED_SATISFACTION_CRITERIA);

		abstractInfluenceEClass = createEClass(ABSTRACT_INFLUENCE);
		createEReference(abstractInfluenceEClass, ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION);
		createEAttribute(abstractInfluenceEClass, ABSTRACT_INFLUENCE__DESCRIPTION);

		influenceEClass = createEClass(INFLUENCE);
		createEReference(influenceEClass, INFLUENCE__OWNED_PARTICIPANTS);
		createEReference(influenceEClass, INFLUENCE__OUTPUT_SRP);
		createEOperation(influenceEClass, INFLUENCE___PARTICIPATION_PATTERN__DIAGNOSTICCHAIN_MAP);

		participantEClass = createEClass(PARTICIPANT);
		createEAttribute(participantEClass, PARTICIPANT__CONFIDENCE);

		srpInputParticipantEClass = createEClass(SRP_INPUT_PARTICIPANT);
		createEReference(srpInputParticipantEClass, SRP_INPUT_PARTICIPANT__TARGET);

		artifactParticipantEClass = createEClass(ARTIFACT_PARTICIPANT);
		createEReference(artifactParticipantEClass, ARTIFACT_PARTICIPANT__TARGET);

		environmentalFactorParticipantEClass = createEClass(ENVIRONMENTAL_FACTOR_PARTICIPANT);
		createEReference(environmentalFactorParticipantEClass, ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET);
		createEReference(environmentalFactorParticipantEClass, ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE);

		satisfactionCriterionEClass = createEClass(SATISFACTION_CRITERION);
		createEReference(satisfactionCriterionEClass, SATISFACTION_CRITERION__REQUIREMENT_REF);
		createEAttribute(satisfactionCriterionEClass, SATISFACTION_CRITERION__LANGUAGE);
		createEAttribute(satisfactionCriterionEClass, SATISFACTION_CRITERION__CRITERION_DEFINITION);
		createEReference(satisfactionCriterionEClass, SATISFACTION_CRITERION__CONSTRAINED_SR_PS);

		compositeInfluenceEClass = createEClass(COMPOSITE_INFLUENCE);
		createEReference(compositeInfluenceEClass, COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES);

		designArtifactEClass = createEClass(DESIGN_ARTIFACT);
		createEReference(designArtifactEClass, DESIGN_ARTIFACT__REF);
		createEAttribute(designArtifactEClass, DESIGN_ARTIFACT__CHANGEABILITY);

		systemResponsePropertyEClass = createEClass(SYSTEM_RESPONSE_PROPERTY);
		createEAttribute(systemResponsePropertyEClass, SYSTEM_RESPONSE_PROPERTY__DESCRIPTION);

		environmentalFactorEClass = createEClass(ENVIRONMENTAL_FACTOR);
		createEAttribute(environmentalFactorEClass, ENVIRONMENTAL_FACTOR__DESCRIPTION);
		createEAttribute(environmentalFactorEClass, ENVIRONMENTAL_FACTOR__FLEXIBILITY);

		influenceFunctionEClass = createEClass(INFLUENCE_FUNCTION);
		createEReference(influenceFunctionEClass, INFLUENCE_FUNCTION__REPRESENTATIONS);

		participantRangeEClass = createEClass(PARTICIPANT_RANGE);
		createEReference(participantRangeEClass, PARTICIPANT_RANGE__VALUE);
		createEReference(participantRangeEClass, PARTICIPANT_RANGE__PARTICIPANT);

		valueSpecEClass = createEClass(VALUE_SPEC);
		createEAttribute(valueSpecEClass, VALUE_SPEC__UNIT);

		scalarValueEClass = createEClass(SCALAR_VALUE);
		createEAttribute(scalarValueEClass, SCALAR_VALUE__VALUE);

		rangeValueEClass = createEClass(RANGE_VALUE);
		createEAttribute(rangeValueEClass, RANGE_VALUE__LOWER);
		createEAttribute(rangeValueEClass, RANGE_VALUE__UPPER);
		createEAttribute(rangeValueEClass, RANGE_VALUE__NOMINAL);
		createEAttribute(rangeValueEClass, RANGE_VALUE__STEP);
		createEAttribute(rangeValueEClass, RANGE_VALUE__INCLUSIVE_LOWER);
		createEAttribute(rangeValueEClass, RANGE_VALUE__INCLUSIVE_UPPER);

		functionRepresentationEClass = createEClass(FUNCTION_REPRESENTATION);
		createEAttribute(functionRepresentationEClass, FUNCTION_REPRESENTATION__SOURCE_URI);
		createEReference(functionRepresentationEClass, FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN);
		createEAttribute(functionRepresentationEClass, FUNCTION_REPRESENTATION__CONFIDENCE);

		naturalLanguageFunctionEClass = createEClass(NATURAL_LANGUAGE_FUNCTION);
		createEAttribute(naturalLanguageFunctionEClass, NATURAL_LANGUAGE_FUNCTION__DEFINITION);

		participantImpactFunctionEClass = createEClass(PARTICIPANT_IMPACT_FUNCTION);
		createEReference(participantImpactFunctionEClass, PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION);

		participantRelativeImpactEClass = createEClass(PARTICIPANT_RELATIVE_IMPACT);
		createEReference(participantRelativeImpactEClass, PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT);
		createEAttribute(participantRelativeImpactEClass, PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE);
		createEAttribute(participantRelativeImpactEClass, PARTICIPANT_RELATIVE_IMPACT__DIRECTION);
		createEAttribute(participantRelativeImpactEClass, PARTICIPANT_RELATIVE_IMPACT__RATIONALE);

		analyticExpressionFunctionEClass = createEClass(ANALYTIC_EXPRESSION_FUNCTION);
		createEAttribute(analyticExpressionFunctionEClass, ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION);
		createEAttribute(analyticExpressionFunctionEClass, ANALYTIC_EXPRESSION_FUNCTION__EXPRESSION_LANGUAGE);

		monotonicityTableEClass = createEClass(MONOTONICITY_TABLE);
		createEReference(monotonicityTableEClass, MONOTONICITY_TABLE__TABLE_ROWS);

		monotonicityRowEClass = createEClass(MONOTONICITY_ROW);
		createEReference(monotonicityRowEClass, MONOTONICITY_ROW__CONDITION);
		createEAttribute(monotonicityRowEClass, MONOTONICITY_ROW__TREND);
		createEReference(monotonicityRowEClass, MONOTONICITY_ROW__VARIED_PARTICIPANT);
		createEReference(monotonicityRowEClass, MONOTONICITY_ROW__OUTPUT);
		createEAttribute(monotonicityRowEClass, MONOTONICITY_ROW__LOCAL_SLOPE);
		createEAttribute(monotonicityRowEClass, MONOTONICITY_ROW__NLEVELS);
		createEAttribute(monotonicityRowEClass, MONOTONICITY_ROW__RATIONALE);

		// Create enums
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
		trendTypeEEnum = createEEnum(TREND_TYPE);
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
		influenceEClass.getESuperTypes().add(this.getAbstractInfluence());
		participantEClass.getESuperTypes().add(this.getNamedElement());
		srpInputParticipantEClass.getESuperTypes().add(this.getParticipant());
		artifactParticipantEClass.getESuperTypes().add(this.getParticipant());
		environmentalFactorParticipantEClass.getESuperTypes().add(this.getParticipant());
		satisfactionCriterionEClass.getESuperTypes().add(this.getNamedElement());
		compositeInfluenceEClass.getESuperTypes().add(this.getAbstractInfluence());
		designArtifactEClass.getESuperTypes().add(this.getNamedElement());
		systemResponsePropertyEClass.getESuperTypes().add(this.getNamedElement());
		environmentalFactorEClass.getESuperTypes().add(this.getNamedElement());
		influenceFunctionEClass.getESuperTypes().add(this.getNamedElement());
		participantRangeEClass.getESuperTypes().add(this.getNamedElement());
		scalarValueEClass.getESuperTypes().add(this.getValueSpec());
		rangeValueEClass.getESuperTypes().add(this.getValueSpec());
		naturalLanguageFunctionEClass.getESuperTypes().add(this.getFunctionRepresentation());
		naturalLanguageFunctionEClass.getESuperTypes().add(this.getNamedElement());
		participantImpactFunctionEClass.getESuperTypes().add(this.getFunctionRepresentation());
		participantImpactFunctionEClass.getESuperTypes().add(this.getNamedElement());
		analyticExpressionFunctionEClass.getESuperTypes().add(this.getFunctionRepresentation());
		analyticExpressionFunctionEClass.getESuperTypes().add(this.getNamedElement());
		monotonicityTableEClass.getESuperTypes().add(this.getFunctionRepresentation());
		monotonicityTableEClass.getESuperTypes().add(this.getNamedElement());
		monotonicityRowEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(influenceModelEClass, InfluenceModel.class, "InfluenceModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluenceModel_OwnedInfluences(), this.getAbstractInfluence(), null, "ownedInfluences", null,
				0, -1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedEnvironmentalFactors(), this.getEnvironmentalFactor(), null,
				"ownedEnvironmentalFactors", null, 0, -1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedArtifacts(), this.getDesignArtifact(), null, "ownedArtifacts", null, 0,
				-1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedSRPs(), this.getSystemResponseProperty(), null, "ownedSRPs", null, 0, -1,
				InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfluenceModel_OwnedSatisfactionCriteria(), this.getSatisfactionCriterion(), null,
				"ownedSatisfactionCriteria", null, 0, -1, InfluenceModel.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInfluenceEClass, AbstractInfluence.class, "AbstractInfluence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractInfluence_OwnedInfluenceFunction(), this.getInfluenceFunction(), null,
				"ownedInfluenceFunction", null, 1, 1, AbstractInfluence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInfluence_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				AbstractInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(influenceEClass, Influence.class, "Influence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
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
		initEAttribute(getParticipant_Confidence(), ecorePackage.getEDouble(), "confidence", null, 0, 1,
				Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(srpInputParticipantEClass, SRPInputParticipant.class, "SRPInputParticipant", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSRPInputParticipant_Target(), this.getSystemResponseProperty(), null, "target", null, 1, 1,
				SRPInputParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactParticipantEClass, ArtifactParticipant.class, "ArtifactParticipant", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactParticipant_Target(), this.getDesignArtifact(), null, "target", null, 1, 1,
				ArtifactParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentalFactorParticipantEClass, EnvironmentalFactorParticipant.class,
				"EnvironmentalFactorParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentalFactorParticipant_Target(), this.getEnvironmentalFactor(), null, "target", null,
				1, 1, EnvironmentalFactorParticipant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentalFactorParticipant_AdmissibleSpace(), this.getValueSpec(), null,
				"admissibleSpace", null, 0, 1, EnvironmentalFactorParticipant.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satisfactionCriterionEClass, SatisfactionCriterion.class, "SatisfactionCriterion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatisfactionCriterion_RequirementRef(), ecorePackage.getEObject(), null, "requirementRef",
				null, 0, 1, SatisfactionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatisfactionCriterion_Language(), this.getLanguageType(), "language", null, 1, 1,
				SatisfactionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSatisfactionCriterion_CriterionDefinition(), ecorePackage.getEString(), "criterionDefinition",
				null, 1, 1, SatisfactionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatisfactionCriterion_ConstrainedSRPs(), this.getSystemResponseProperty(), null,
				"constrainedSRPs", null, 0, -1, SatisfactionCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeInfluenceEClass, CompositeInfluence.class, "CompositeInfluence", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeInfluence_InternalInfluences(), this.getAbstractInfluence(), null,
				"internalInfluences", null, 2, -1, CompositeInfluence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designArtifactEClass, DesignArtifact.class, "DesignArtifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignArtifact_Ref(), ecorePackage.getEObject(), null, "ref", null, 1, 1,
				DesignArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignArtifact_Changeability(), ecorePackage.getEDouble(), "changeability", null, 0, 1,
				DesignArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(systemResponsePropertyEClass, SystemResponseProperty.class, "SystemResponseProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemResponseProperty_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				SystemResponseProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentalFactorEClass, EnvironmentalFactor.class, "EnvironmentalFactor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentalFactor_Description(), ecorePackage.getEString(), "description", null, 1, 1,
				EnvironmentalFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentalFactor_Flexibility(), ecorePackage.getEDouble(), "flexibility", null, 0, 1,
				EnvironmentalFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(influenceFunctionEClass, InfluenceFunction.class, "InfluenceFunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfluenceFunction_Representations(), this.getFunctionRepresentation(), null,
				"representations", null, 0, -1, InfluenceFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantRangeEClass, ParticipantRange.class, "ParticipantRange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipantRange_Value(), this.getValueSpec(), null, "value", null, 0, 1,
				ParticipantRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParticipantRange_Participant(), this.getParticipant(), null, "participant", null, 0, 1,
				ParticipantRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecEClass, ValueSpec.class, "ValueSpec", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSpec_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, ValueSpec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scalarValueEClass, ScalarValue.class, "ScalarValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScalarValue_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, ScalarValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeValueEClass, RangeValue.class, "RangeValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeValue_Lower(), ecorePackage.getEDouble(), "lower", null, 0, 1, RangeValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeValue_Upper(), ecorePackage.getEDouble(), "upper", null, 0, 1, RangeValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeValue_Nominal(), ecorePackage.getEDouble(), "nominal", null, 0, 1, RangeValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeValue_Step(), ecorePackage.getEDouble(), "step", null, 0, 1, RangeValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeValue_InclusiveLower(), ecorePackage.getEBoolean(), "inclusiveLower", null, 0, 1,
				RangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeValue_InclusiveUpper(), ecorePackage.getEBoolean(), "inclusiveUpper", null, 0, 1,
				RangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(functionRepresentationEClass, FunctionRepresentation.class, "FunctionRepresentation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionRepresentation_SourceUri(), ecorePackage.getEString(), "sourceUri", null, 0, 1,
				FunctionRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionRepresentation_ApplicabilityDomain(), this.getParticipantRange(), null,
				"applicabilityDomain", null, 0, -1, FunctionRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionRepresentation_Confidence(), ecorePackage.getEDouble(), "confidence", null, 0, 1,
				FunctionRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naturalLanguageFunctionEClass, NaturalLanguageFunction.class, "NaturalLanguageFunction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNaturalLanguageFunction_Definition(), ecorePackage.getEString(), "definition", null, 0, 1,
				NaturalLanguageFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(participantImpactFunctionEClass, ParticipantImpactFunction.class, "ParticipantImpactFunction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipantImpactFunction_ParticipantContribution(), this.getParticipantRelativeImpact(),
				null, "participantContribution", null, 0, -1, ParticipantImpactFunction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(participantRelativeImpactEClass, ParticipantRelativeImpact.class, "ParticipantRelativeImpact",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParticipantRelativeImpact_Participant(), this.getParticipant(), null, "participant", null, 0,
				1, ParticipantRelativeImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipantRelativeImpact_Importance(), ecorePackage.getEDouble(), "importance", null, 0, 1,
				ParticipantRelativeImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipantRelativeImpact_Direction(), this.getTrendType(), "direction", null, 0, 1,
				ParticipantRelativeImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParticipantRelativeImpact_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1,
				ParticipantRelativeImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analyticExpressionFunctionEClass, AnalyticExpressionFunction.class, "AnalyticExpressionFunction",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalyticExpressionFunction_Expression(), ecorePackage.getEString(), "expression", null, 0, 1,
				AnalyticExpressionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyticExpressionFunction_ExpressionLanguage(), this.getLanguageType(), "expressionLanguage",
				null, 0, 1, AnalyticExpressionFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monotonicityTableEClass, MonotonicityTable.class, "MonotonicityTable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonotonicityTable_TableRows(), this.getMonotonicityRow(), null, "tableRows", null, 1, -1,
				MonotonicityTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monotonicityRowEClass, MonotonicityRow.class, "MonotonicityRow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonotonicityRow_Condition(), this.getParticipantRange(), null, "condition", null, 0, -1,
				MonotonicityRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonotonicityRow_Trend(), this.getTrendType(), "trend", null, 0, 1, MonotonicityRow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonotonicityRow_VariedParticipant(), this.getParticipant(), null, "variedParticipant", null,
				0, 1, MonotonicityRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonotonicityRow_Output(), this.getSystemResponseProperty(), null, "output", null, 0, 1,
				MonotonicityRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonotonicityRow_LocalSlope(), ecorePackage.getEDouble(), "localSlope", null, 0, 1,
				MonotonicityRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonotonicityRow_NLevels(), ecorePackage.getEInt(), "nLevels", null, 0, 1,
				MonotonicityRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMonotonicityRow_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1,
				MonotonicityRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.JAVA_NUMERIC_EXPRESSION);
		addEEnumLiteral(languageTypeEEnum, LanguageType.OCL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.NATURAL_LANGUAGE);

		initEEnum(trendTypeEEnum, TrendType.class, "TrendType");
		addEEnumLiteral(trendTypeEEnum, TrendType.INCREASING);
		addEEnumLiteral(trendTypeEEnum, TrendType.DECREASING);
		addEEnumLiteral(trendTypeEEnum, TrendType.FLAT);
		addEEnumLiteral(trendTypeEEnum, TrendType.NOT_MONOTONIC);

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
	}

} //MetamodelPackageImpl
