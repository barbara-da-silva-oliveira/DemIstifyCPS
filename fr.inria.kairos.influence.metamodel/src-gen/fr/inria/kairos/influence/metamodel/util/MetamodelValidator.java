/**
 */
package fr.inria.kairos.influence.metamodel.util;

import fr.inria.kairos.influence.metamodel.*;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetamodelValidator INSTANCE = new MetamodelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.inria.kairos.influence.metamodel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participation Pattern' of 'Influence'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INFLUENCE__PARTICIPATION_PATTERN = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return MetamodelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case MetamodelPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case MetamodelPackage.INFLUENCE_MODEL:
			return validateInfluenceModel((InfluenceModel) value, diagnostics, context);
		case MetamodelPackage.ABSTRACT_INFLUENCE:
			return validateAbstractInfluence((AbstractInfluence) value, diagnostics, context);
		case MetamodelPackage.INFLUENCE:
			return validateInfluence((Influence) value, diagnostics, context);
		case MetamodelPackage.PARTICIPANT:
			return validateParticipant((Participant) value, diagnostics, context);
		case MetamodelPackage.SRP_INPUT_PARTICIPANT:
			return validateSRPInputParticipant((SRPInputParticipant) value, diagnostics, context);
		case MetamodelPackage.ARTIFACT_PARTICIPANT:
			return validateArtifactParticipant((ArtifactParticipant) value, diagnostics, context);
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT:
			return validateEnvironmentalFactorParticipant((EnvironmentalFactorParticipant) value, diagnostics, context);
		case MetamodelPackage.SATISFACTION_CRITERION:
			return validateSatisfactionCriterion((SatisfactionCriterion) value, diagnostics, context);
		case MetamodelPackage.COMPOSITE_INFLUENCE:
			return validateCompositeInfluence((CompositeInfluence) value, diagnostics, context);
		case MetamodelPackage.DESIGN_ARTIFACT:
			return validateDesignArtifact((DesignArtifact) value, diagnostics, context);
		case MetamodelPackage.SYSTEM_RESPONSE_PROPERTY:
			return validateSystemResponseProperty((SystemResponseProperty) value, diagnostics, context);
		case MetamodelPackage.ENVIRONMENTAL_FACTOR:
			return validateEnvironmentalFactor((EnvironmentalFactor) value, diagnostics, context);
		case MetamodelPackage.INFLUENCE_FUNCTION:
			return validateInfluenceFunction((InfluenceFunction) value, diagnostics, context);
		case MetamodelPackage.PARTICIPANT_RANGE:
			return validateParticipantRange((ParticipantRange) value, diagnostics, context);
		case MetamodelPackage.VALUE_SPEC:
			return validateValueSpec((ValueSpec) value, diagnostics, context);
		case MetamodelPackage.SCALAR_VALUE:
			return validateScalarValue((ScalarValue) value, diagnostics, context);
		case MetamodelPackage.RANGE_VALUE:
			return validateRangeValue((RangeValue) value, diagnostics, context);
		case MetamodelPackage.FUNCTION_REPRESENTATION:
			return validateFunctionRepresentation((FunctionRepresentation) value, diagnostics, context);
		case MetamodelPackage.NATURAL_LANGUAGE_FUNCTION:
			return validateNaturalLanguageFunction((NaturalLanguageFunction) value, diagnostics, context);
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION:
			return validateParticipantImpactFunction((ParticipantImpactFunction) value, diagnostics, context);
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT:
			return validateParticipantRelativeImpact((ParticipantRelativeImpact) value, diagnostics, context);
		case MetamodelPackage.ANALYTIC_EXPRESSION_FUNCTION:
			return validateAnalyticExpressionFunction((AnalyticExpressionFunction) value, diagnostics, context);
		case MetamodelPackage.MONOTONICITY_TABLE:
			return validateMonotonicityTable((MonotonicityTable) value, diagnostics, context);
		case MetamodelPackage.MONOTONICITY_ROW:
			return validateMonotonicityRow((MonotonicityRow) value, diagnostics, context);
		case MetamodelPackage.LANGUAGE_TYPE:
			return validateLanguageType((LanguageType) value, diagnostics, context);
		case MetamodelPackage.TREND_TYPE:
			return validateTrendType((TrendType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenceModel(InfluenceModel influenceModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(influenceModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInfluence(AbstractInfluence abstractInfluence, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractInfluence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSRPInputParticipant(SRPInputParticipant srpInputParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(srpInputParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalFactorParticipant(EnvironmentalFactorParticipant environmentalFactorParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentalFactorParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSatisfactionCriterion(SatisfactionCriterion satisfactionCriterion,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(satisfactionCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactParticipant(ArtifactParticipant artifactParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeInfluence(CompositeInfluence compositeInfluence, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeInfluence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluence(Influence influence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(influence, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(influence, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateInfluence_ParticipationPattern(influence, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ParticipationPattern constraint of '<em>Influence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluence_ParticipationPattern(Influence influence, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return influence.ParticipationPattern(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant(Participant participant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfluenceFunction(InfluenceFunction influenceFunction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(influenceFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRange(ParticipantRange participantRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueSpec(ValueSpec valueSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalarValue(ScalarValue scalarValue, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalarValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeValue(RangeValue rangeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionRepresentation(FunctionRepresentation functionRepresentation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNaturalLanguageFunction(NaturalLanguageFunction naturalLanguageFunction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(naturalLanguageFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantImpactFunction(ParticipantImpactFunction participantImpactFunction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantImpactFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantRelativeImpact(ParticipantRelativeImpact participantRelativeImpact,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantRelativeImpact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalyticExpressionFunction(AnalyticExpressionFunction analyticExpressionFunction,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analyticExpressionFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonotonicityTable(MonotonicityTable monotonicityTable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monotonicityTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonotonicityRow(MonotonicityRow monotonicityRow, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monotonicityRow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignArtifact(DesignArtifact designArtifact, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(designArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemResponseProperty(SystemResponseProperty systemResponseProperty,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemResponseProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalFactor(EnvironmentalFactor environmentalFactor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentalFactor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageType(LanguageType languageType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrendType(TrendType trendType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MetamodelValidator
