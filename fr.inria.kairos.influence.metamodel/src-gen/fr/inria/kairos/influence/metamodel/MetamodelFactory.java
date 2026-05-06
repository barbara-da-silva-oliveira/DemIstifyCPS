/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage
 * @generated
 */
public interface MetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelFactory eINSTANCE = fr.inria.kairos.influence.metamodel.impl.MetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Influence Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influence Model</em>'.
	 * @generated
	 */
	InfluenceModel createInfluenceModel();

	/**
	 * Returns a new object of class '<em>SRP Input Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SRP Input Participant</em>'.
	 * @generated
	 */
	SRPInputParticipant createSRPInputParticipant();

	/**
	 * Returns a new object of class '<em>Environmental Factor Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environmental Factor Participant</em>'.
	 * @generated
	 */
	EnvironmentalFactorParticipant createEnvironmentalFactorParticipant();

	/**
	 * Returns a new object of class '<em>Satisfaction Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfaction Criterion</em>'.
	 * @generated
	 */
	SatisfactionCriterion createSatisfactionCriterion();

	/**
	 * Returns a new object of class '<em>Influence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influence</em>'.
	 * @generated
	 */
	Influence createInfluence();

	/**
	 * Returns a new object of class '<em>Artifact Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artifact Participant</em>'.
	 * @generated
	 */
	ArtifactParticipant createArtifactParticipant();

	/**
	 * Returns a new object of class '<em>Design Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Artifact</em>'.
	 * @generated
	 */
	DesignArtifact createDesignArtifact();

	/**
	 * Returns a new object of class '<em>System Response Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Response Property</em>'.
	 * @generated
	 */
	SystemResponseProperty createSystemResponseProperty();

	/**
	 * Returns a new object of class '<em>Environmental Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environmental Factor</em>'.
	 * @generated
	 */
	EnvironmentalFactor createEnvironmentalFactor();

	/**
	 * Returns a new object of class '<em>Participant Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Range</em>'.
	 * @generated
	 */
	ParticipantRange createParticipantRange();

	/**
	 * Returns a new object of class '<em>Scalar Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar Value</em>'.
	 * @generated
	 */
	ScalarValue createScalarValue();

	/**
	 * Returns a new object of class '<em>Range Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Value</em>'.
	 * @generated
	 */
	RangeValue createRangeValue();

	/**
	 * Returns a new object of class '<em>Natural Language Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Language Function</em>'.
	 * @generated
	 */
	NaturalLanguageFunction createNaturalLanguageFunction();

	/**
	 * Returns a new object of class '<em>Participant Impact Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Impact Function</em>'.
	 * @generated
	 */
	ParticipantImpactFunction createParticipantImpactFunction();

	/**
	 * Returns a new object of class '<em>Participant Relative Impact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Participant Relative Impact</em>'.
	 * @generated
	 */
	ParticipantRelativeImpact createParticipantRelativeImpact();

	/**
	 * Returns a new object of class '<em>Analytic Expression Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analytic Expression Function</em>'.
	 * @generated
	 */
	AnalyticExpressionFunction createAnalyticExpressionFunction();

	/**
	 * Returns a new object of class '<em>Monotonicity Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monotonicity Table</em>'.
	 * @generated
	 */
	MonotonicityTable createMonotonicityTable();

	/**
	 * Returns a new object of class '<em>Monotonicity Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monotonicity Row</em>'.
	 * @generated
	 */
	MonotonicityRow createMonotonicityRow();

	/**
	 * Returns a new object of class '<em>Composite Influence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Influence</em>'.
	 * @generated
	 */
	CompositeInfluence createCompositeInfluence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelPackage getMetamodelPackage();

} //MetamodelFactory
