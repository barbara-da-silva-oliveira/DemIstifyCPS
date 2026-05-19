/**
 */
package fr.inria.kairos.influence.metamodel.util;

import fr.inria.kairos.influence.metamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage
 * @generated
 */
public class MetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelSwitch<Adapter> modelSwitch = new MetamodelSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseInfluenceModel(InfluenceModel object) {
			return createInfluenceModelAdapter();
		}

		@Override
		public Adapter caseAbstractInfluence(AbstractInfluence object) {
			return createAbstractInfluenceAdapter();
		}

		@Override
		public Adapter caseInfluence(Influence object) {
			return createInfluenceAdapter();
		}

		@Override
		public Adapter caseParticipant(Participant object) {
			return createParticipantAdapter();
		}

		@Override
		public Adapter caseSRPInputParticipant(SRPInputParticipant object) {
			return createSRPInputParticipantAdapter();
		}

		@Override
		public Adapter caseArtifactParticipant(ArtifactParticipant object) {
			return createArtifactParticipantAdapter();
		}

		@Override
		public Adapter caseEnvironmentalFactorParticipant(EnvironmentalFactorParticipant object) {
			return createEnvironmentalFactorParticipantAdapter();
		}

		@Override
		public Adapter caseSatisfactionCriterion(SatisfactionCriterion object) {
			return createSatisfactionCriterionAdapter();
		}

		@Override
		public Adapter caseCompositeInfluence(CompositeInfluence object) {
			return createCompositeInfluenceAdapter();
		}

		@Override
		public Adapter caseDesignArtifact(DesignArtifact object) {
			return createDesignArtifactAdapter();
		}

		@Override
		public Adapter caseSystemResponseProperty(SystemResponseProperty object) {
			return createSystemResponsePropertyAdapter();
		}

		@Override
		public Adapter caseEnvironmentalFactor(EnvironmentalFactor object) {
			return createEnvironmentalFactorAdapter();
		}

		@Override
		public Adapter caseInfluenceFunction(InfluenceFunction object) {
			return createInfluenceFunctionAdapter();
		}

		@Override
		public Adapter caseParticipantRange(ParticipantRange object) {
			return createParticipantRangeAdapter();
		}

		@Override
		public Adapter caseValueSpec(ValueSpec object) {
			return createValueSpecAdapter();
		}

		@Override
		public Adapter caseScalarValue(ScalarValue object) {
			return createScalarValueAdapter();
		}

		@Override
		public Adapter caseRangeValue(RangeValue object) {
			return createRangeValueAdapter();
		}

		@Override
		public Adapter caseFunctionRepresentation(FunctionRepresentation object) {
			return createFunctionRepresentationAdapter();
		}

		@Override
		public Adapter caseNaturalLanguageFunction(NaturalLanguageFunction object) {
			return createNaturalLanguageFunctionAdapter();
		}

		@Override
		public Adapter caseParticipantImpactFunction(ParticipantImpactFunction object) {
			return createParticipantImpactFunctionAdapter();
		}

		@Override
		public Adapter caseParticipantRelativeImpact(ParticipantRelativeImpact object) {
			return createParticipantRelativeImpactAdapter();
		}

		@Override
		public Adapter caseAnalyticExpressionFunction(AnalyticExpressionFunction object) {
			return createAnalyticExpressionFunctionAdapter();
		}

		@Override
		public Adapter caseMonotonicityTable(MonotonicityTable object) {
			return createMonotonicityTableAdapter();
		}

		@Override
		public Adapter caseMonotonicityRow(MonotonicityRow object) {
			return createMonotonicityRowAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.InfluenceModel <em>Influence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceModel
	 * @generated
	 */
	public Adapter createInfluenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence <em>Abstract Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.AbstractInfluence
	 * @generated
	 */
	public Adapter createAbstractInfluenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.Influence <em>Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.Influence
	 * @generated
	 */
	public Adapter createInfluenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.SRPInputParticipant <em>SRP Input Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.SRPInputParticipant
	 * @generated
	 */
	public Adapter createSRPInputParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.ArtifactParticipant <em>Artifact Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.ArtifactParticipant
	 * @generated
	 */
	public Adapter createArtifactParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant <em>Environmental Factor Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
	 * @generated
	 */
	public Adapter createEnvironmentalFactorParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.SatisfactionCriterion <em>Satisfaction Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.SatisfactionCriterion
	 * @generated
	 */
	public Adapter createSatisfactionCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.CompositeInfluence <em>Composite Influence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.CompositeInfluence
	 * @generated
	 */
	public Adapter createCompositeInfluenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.DesignArtifact <em>Design Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.DesignArtifact
	 * @generated
	 */
	public Adapter createDesignArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.SystemResponseProperty <em>System Response Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.SystemResponseProperty
	 * @generated
	 */
	public Adapter createSystemResponsePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.EnvironmentalFactor <em>Environmental Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.EnvironmentalFactor
	 * @generated
	 */
	public Adapter createEnvironmentalFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.InfluenceFunction <em>Influence Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.InfluenceFunction
	 * @generated
	 */
	public Adapter createInfluenceFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.ParticipantRange <em>Participant Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRange
	 * @generated
	 */
	public Adapter createParticipantRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.ValueSpec <em>Value Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.ValueSpec
	 * @generated
	 */
	public Adapter createValueSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.ScalarValue <em>Scalar Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.ScalarValue
	 * @generated
	 */
	public Adapter createScalarValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.RangeValue <em>Range Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.RangeValue
	 * @generated
	 */
	public Adapter createRangeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation <em>Function Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.FunctionRepresentation
	 * @generated
	 */
	public Adapter createFunctionRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.NaturalLanguageFunction <em>Natural Language Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.NaturalLanguageFunction
	 * @generated
	 */
	public Adapter createNaturalLanguageFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.ParticipantImpactFunction <em>Participant Impact Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantImpactFunction
	 * @generated
	 */
	public Adapter createParticipantImpactFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact <em>Participant Relative Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact
	 * @generated
	 */
	public Adapter createParticipantRelativeImpactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction <em>Analytic Expression Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction
	 * @generated
	 */
	public Adapter createAnalyticExpressionFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.MonotonicityTable <em>Monotonicity Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityTable
	 * @generated
	 */
	public Adapter createMonotonicityTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.kairos.influence.metamodel.MonotonicityRow <em>Monotonicity Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.kairos.influence.metamodel.MonotonicityRow
	 * @generated
	 */
	public Adapter createMonotonicityRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetamodelAdapterFactory
