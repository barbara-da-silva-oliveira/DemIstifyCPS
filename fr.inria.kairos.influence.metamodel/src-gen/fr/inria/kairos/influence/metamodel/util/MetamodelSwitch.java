/**
 */
package fr.inria.kairos.influence.metamodel.util;

import fr.inria.kairos.influence.metamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MetamodelPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.INFLUENCE_MODEL: {
			InfluenceModel influenceModel = (InfluenceModel) theEObject;
			T result = caseInfluenceModel(influenceModel);
			if (result == null)
				result = caseNamedElement(influenceModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ABSTRACT_INFLUENCE: {
			AbstractInfluence abstractInfluence = (AbstractInfluence) theEObject;
			T result = caseAbstractInfluence(abstractInfluence);
			if (result == null)
				result = caseNamedElement(abstractInfluence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.INFLUENCE: {
			Influence influence = (Influence) theEObject;
			T result = caseInfluence(influence);
			if (result == null)
				result = caseAbstractInfluence(influence);
			if (result == null)
				result = caseNamedElement(influence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.PARTICIPANT: {
			Participant participant = (Participant) theEObject;
			T result = caseParticipant(participant);
			if (result == null)
				result = caseNamedElement(participant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.SRP_INPUT_PARTICIPANT: {
			SRPInputParticipant srpInputParticipant = (SRPInputParticipant) theEObject;
			T result = caseSRPInputParticipant(srpInputParticipant);
			if (result == null)
				result = caseParticipant(srpInputParticipant);
			if (result == null)
				result = caseNamedElement(srpInputParticipant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ARTIFACT_PARTICIPANT: {
			ArtifactParticipant artifactParticipant = (ArtifactParticipant) theEObject;
			T result = caseArtifactParticipant(artifactParticipant);
			if (result == null)
				result = caseParticipant(artifactParticipant);
			if (result == null)
				result = caseNamedElement(artifactParticipant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT: {
			EnvironmentalFactorParticipant environmentalFactorParticipant = (EnvironmentalFactorParticipant) theEObject;
			T result = caseEnvironmentalFactorParticipant(environmentalFactorParticipant);
			if (result == null)
				result = caseParticipant(environmentalFactorParticipant);
			if (result == null)
				result = caseNamedElement(environmentalFactorParticipant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.SATISFACTION_CRITERION: {
			SatisfactionCriterion satisfactionCriterion = (SatisfactionCriterion) theEObject;
			T result = caseSatisfactionCriterion(satisfactionCriterion);
			if (result == null)
				result = caseNamedElement(satisfactionCriterion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.COMPOSITE_INFLUENCE: {
			CompositeInfluence compositeInfluence = (CompositeInfluence) theEObject;
			T result = caseCompositeInfluence(compositeInfluence);
			if (result == null)
				result = caseAbstractInfluence(compositeInfluence);
			if (result == null)
				result = caseNamedElement(compositeInfluence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.DESIGN_ARTIFACT: {
			DesignArtifact designArtifact = (DesignArtifact) theEObject;
			T result = caseDesignArtifact(designArtifact);
			if (result == null)
				result = caseNamedElement(designArtifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.SYSTEM_RESPONSE_PROPERTY: {
			SystemResponseProperty systemResponseProperty = (SystemResponseProperty) theEObject;
			T result = caseSystemResponseProperty(systemResponseProperty);
			if (result == null)
				result = caseNamedElement(systemResponseProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ENVIRONMENTAL_FACTOR: {
			EnvironmentalFactor environmentalFactor = (EnvironmentalFactor) theEObject;
			T result = caseEnvironmentalFactor(environmentalFactor);
			if (result == null)
				result = caseNamedElement(environmentalFactor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.INFLUENCE_FUNCTION: {
			InfluenceFunction influenceFunction = (InfluenceFunction) theEObject;
			T result = caseInfluenceFunction(influenceFunction);
			if (result == null)
				result = caseNamedElement(influenceFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.PARTICIPANT_RANGE: {
			ParticipantRange participantRange = (ParticipantRange) theEObject;
			T result = caseParticipantRange(participantRange);
			if (result == null)
				result = caseNamedElement(participantRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.VALUE_SPEC: {
			ValueSpec valueSpec = (ValueSpec) theEObject;
			T result = caseValueSpec(valueSpec);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.SCALAR_VALUE: {
			ScalarValue scalarValue = (ScalarValue) theEObject;
			T result = caseScalarValue(scalarValue);
			if (result == null)
				result = caseValueSpec(scalarValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.RANGE_VALUE: {
			RangeValue rangeValue = (RangeValue) theEObject;
			T result = caseRangeValue(rangeValue);
			if (result == null)
				result = caseValueSpec(rangeValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.FUNCTION_REPRESENTATION: {
			FunctionRepresentation functionRepresentation = (FunctionRepresentation) theEObject;
			T result = caseFunctionRepresentation(functionRepresentation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.NATURAL_LANGUAGE_FUNCTION: {
			NaturalLanguageFunction naturalLanguageFunction = (NaturalLanguageFunction) theEObject;
			T result = caseNaturalLanguageFunction(naturalLanguageFunction);
			if (result == null)
				result = caseFunctionRepresentation(naturalLanguageFunction);
			if (result == null)
				result = caseNamedElement(naturalLanguageFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION: {
			ParticipantImpactFunction participantImpactFunction = (ParticipantImpactFunction) theEObject;
			T result = caseParticipantImpactFunction(participantImpactFunction);
			if (result == null)
				result = caseFunctionRepresentation(participantImpactFunction);
			if (result == null)
				result = caseNamedElement(participantImpactFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT: {
			ParticipantRelativeImpact participantRelativeImpact = (ParticipantRelativeImpact) theEObject;
			T result = caseParticipantRelativeImpact(participantRelativeImpact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ANALYTIC_EXPRESSION_FUNCTION: {
			AnalyticExpressionFunction analyticExpressionFunction = (AnalyticExpressionFunction) theEObject;
			T result = caseAnalyticExpressionFunction(analyticExpressionFunction);
			if (result == null)
				result = caseFunctionRepresentation(analyticExpressionFunction);
			if (result == null)
				result = caseNamedElement(analyticExpressionFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.MONOTONICITY_TABLE: {
			MonotonicityTable monotonicityTable = (MonotonicityTable) theEObject;
			T result = caseMonotonicityTable(monotonicityTable);
			if (result == null)
				result = caseFunctionRepresentation(monotonicityTable);
			if (result == null)
				result = caseNamedElement(monotonicityTable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.MONOTONICITY_ROW: {
			MonotonicityRow monotonicityRow = (MonotonicityRow) theEObject;
			T result = caseMonotonicityRow(monotonicityRow);
			if (result == null)
				result = caseNamedElement(monotonicityRow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influence Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influence Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenceModel(InfluenceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Influence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Influence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInfluence(AbstractInfluence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluence(Influence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant(Participant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRP Input Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRP Input Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRPInputParticipant(SRPInputParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactParticipant(ArtifactParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environmental Factor Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environmental Factor Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentalFactorParticipant(EnvironmentalFactorParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfaction Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfaction Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfactionCriterion(SatisfactionCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Influence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Influence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeInfluence(CompositeInfluence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignArtifact(DesignArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Response Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Response Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemResponseProperty(SystemResponseProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environmental Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environmental Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentalFactor(EnvironmentalFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Influence Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Influence Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfluenceFunction(InfluenceFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRange(ParticipantRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpec(ValueSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarValue(ScalarValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeValue(RangeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionRepresentation(FunctionRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Language Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Language Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalLanguageFunction(NaturalLanguageFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Impact Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Impact Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantImpactFunction(ParticipantImpactFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Relative Impact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Relative Impact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRelativeImpact(ParticipantRelativeImpact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analytic Expression Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analytic Expression Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalyticExpressionFunction(AnalyticExpressionFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monotonicity Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monotonicity Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonotonicityTable(MonotonicityTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monotonicity Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monotonicity Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonotonicityRow(MonotonicityRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetamodelSwitch
