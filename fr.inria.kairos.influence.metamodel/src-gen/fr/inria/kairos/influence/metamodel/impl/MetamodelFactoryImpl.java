/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelFactory init() {
		try {
			MetamodelFactory theMetamodelFactory = (MetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelPackage.eNS_URI);
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetamodelPackage.INFLUENCE_MODEL:
			return createInfluenceModel();
		case MetamodelPackage.INFLUENCE:
			return createInfluence();
		case MetamodelPackage.SRP_INPUT_PARTICIPANT:
			return createSRPInputParticipant();
		case MetamodelPackage.ARTIFACT_PARTICIPANT:
			return createArtifactParticipant();
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT:
			return createEnvironmentalFactorParticipant();
		case MetamodelPackage.SATISFACTION_CRITERION:
			return createSatisfactionCriterion();
		case MetamodelPackage.COMPOSITE_INFLUENCE:
			return createCompositeInfluence();
		case MetamodelPackage.DESIGN_ARTIFACT:
			return createDesignArtifact();
		case MetamodelPackage.SYSTEM_RESPONSE_PROPERTY:
			return createSystemResponseProperty();
		case MetamodelPackage.ENVIRONMENTAL_FACTOR:
			return createEnvironmentalFactor();
		case MetamodelPackage.INFLUENCE_FUNCTION:
			return createInfluenceFunction();
		case MetamodelPackage.PARTICIPANT_RANGE:
			return createParticipantRange();
		case MetamodelPackage.SCALAR_VALUE:
			return createScalarValue();
		case MetamodelPackage.RANGE_VALUE:
			return createRangeValue();
		case MetamodelPackage.NATURAL_LANGUAGE_FUNCTION:
			return createNaturalLanguageFunction();
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION:
			return createParticipantImpactFunction();
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT:
			return createParticipantRelativeImpact();
		case MetamodelPackage.ANALYTIC_EXPRESSION_FUNCTION:
			return createAnalyticExpressionFunction();
		case MetamodelPackage.MONOTONICITY_TABLE:
			return createMonotonicityTable();
		case MetamodelPackage.MONOTONICITY_ROW:
			return createMonotonicityRow();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MetamodelPackage.LANGUAGE_TYPE:
			return createLanguageTypeFromString(eDataType, initialValue);
		case MetamodelPackage.TREND_TYPE:
			return createTrendTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MetamodelPackage.LANGUAGE_TYPE:
			return convertLanguageTypeToString(eDataType, instanceValue);
		case MetamodelPackage.TREND_TYPE:
			return convertTrendTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfluenceModel createInfluenceModel() {
		InfluenceModelImpl influenceModel = new InfluenceModelImpl();
		return influenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Influence createInfluence() {
		InfluenceImpl influence = new InfluenceImpl();
		return influence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SRPInputParticipant createSRPInputParticipant() {
		SRPInputParticipantImpl srpInputParticipant = new SRPInputParticipantImpl();
		return srpInputParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactParticipant createArtifactParticipant() {
		ArtifactParticipantImpl artifactParticipant = new ArtifactParticipantImpl();
		return artifactParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentalFactorParticipant createEnvironmentalFactorParticipant() {
		EnvironmentalFactorParticipantImpl environmentalFactorParticipant = new EnvironmentalFactorParticipantImpl();
		return environmentalFactorParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SatisfactionCriterion createSatisfactionCriterion() {
		SatisfactionCriterionImpl satisfactionCriterion = new SatisfactionCriterionImpl();
		return satisfactionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeInfluence createCompositeInfluence() {
		CompositeInfluenceImpl compositeInfluence = new CompositeInfluenceImpl();
		return compositeInfluence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignArtifact createDesignArtifact() {
		DesignArtifactImpl designArtifact = new DesignArtifactImpl();
		return designArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemResponseProperty createSystemResponseProperty() {
		SystemResponsePropertyImpl systemResponseProperty = new SystemResponsePropertyImpl();
		return systemResponseProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentalFactor createEnvironmentalFactor() {
		EnvironmentalFactorImpl environmentalFactor = new EnvironmentalFactorImpl();
		return environmentalFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfluenceFunction createInfluenceFunction() {
		InfluenceFunctionImpl influenceFunction = new InfluenceFunctionImpl();
		return influenceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipantRange createParticipantRange() {
		ParticipantRangeImpl participantRange = new ParticipantRangeImpl();
		return participantRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalarValue createScalarValue() {
		ScalarValueImpl scalarValue = new ScalarValueImpl();
		return scalarValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeValue createRangeValue() {
		RangeValueImpl rangeValue = new RangeValueImpl();
		return rangeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaturalLanguageFunction createNaturalLanguageFunction() {
		NaturalLanguageFunctionImpl naturalLanguageFunction = new NaturalLanguageFunctionImpl();
		return naturalLanguageFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipantImpactFunction createParticipantImpactFunction() {
		ParticipantImpactFunctionImpl participantImpactFunction = new ParticipantImpactFunctionImpl();
		return participantImpactFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParticipantRelativeImpact createParticipantRelativeImpact() {
		ParticipantRelativeImpactImpl participantRelativeImpact = new ParticipantRelativeImpactImpl();
		return participantRelativeImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalyticExpressionFunction createAnalyticExpressionFunction() {
		AnalyticExpressionFunctionImpl analyticExpressionFunction = new AnalyticExpressionFunctionImpl();
		return analyticExpressionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonotonicityTable createMonotonicityTable() {
		MonotonicityTableImpl monotonicityTable = new MonotonicityTableImpl();
		return monotonicityTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonotonicityRow createMonotonicityRow() {
		MonotonicityRowImpl monotonicityRow = new MonotonicityRowImpl();
		return monotonicityRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType createLanguageTypeFromString(EDataType eDataType, String initialValue) {
		LanguageType result = LanguageType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrendType createTrendTypeFromString(EDataType eDataType, String initialValue) {
		TrendType result = TrendType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrendTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelPackage getMetamodelPackage() {
		return (MetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage() {
		return MetamodelPackage.eINSTANCE;
	}

} //MetamodelFactoryImpl
