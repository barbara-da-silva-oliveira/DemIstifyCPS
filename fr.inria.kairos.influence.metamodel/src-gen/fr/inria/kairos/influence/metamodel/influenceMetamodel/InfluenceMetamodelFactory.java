/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage
 * @generated
 */
public interface InfluenceMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfluenceMetamodelFactory eINSTANCE = fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceMetamodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Influence Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influence Metamodel</em>'.
	 * @generated
	 */
	InfluenceMetamodel createInfluenceMetamodel();

	/**
	 * Returns a new object of class '<em>Influence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Influence</em>'.
	 * @generated
	 */
	Influence createInfluence();

	/**
	 * Returns a new object of class '<em>Emergent Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emergent Behavior</em>'.
	 * @generated
	 */
	EmergentBehavior createEmergentBehavior();

	/**
	 * Returns a new object of class '<em>System Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Response</em>'.
	 * @generated
	 */
	SystemResponse createSystemResponse();

	/**
	 * Returns a new object of class '<em>Cyber Physical Phenomena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cyber Physical Phenomena</em>'.
	 * @generated
	 */
	CyberPhysicalPhenomena createCyberPhysicalPhenomena();

	/**
	 * Returns a new object of class '<em>Requirement Satisfaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Satisfaction</em>'.
	 * @generated
	 */
	RequirementSatisfaction createRequirementSatisfaction();

	/**
	 * Returns a new object of class '<em>Multi Phenomenon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Phenomenon</em>'.
	 * @generated
	 */
	MultiPhenomenon createMultiPhenomenon();

	/**
	 * Returns a new object of class '<em>Simple Phenomenon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Phenomenon</em>'.
	 * @generated
	 */
	SimplePhenomenon createSimplePhenomenon();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InfluenceMetamodelPackage getInfluenceMetamodelPackage();

} //InfluenceMetamodelFactory
