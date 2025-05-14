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
		case MetamodelPackage.INFLUENCE_MODEL: {
			InfluenceModel influenceModel = (InfluenceModel) theEObject;
			T result = caseInfluenceModel(influenceModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.INFLUENCE: {
			Influence influence = (Influence) theEObject;
			T result = caseInfluence(influence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.EMERGENT_BEHAVIOR: {
			EmergentBehavior emergentBehavior = (EmergentBehavior) theEObject;
			T result = caseEmergentBehavior(emergentBehavior);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.SYSTEM_RESPONSE: {
			SystemResponse systemResponse = (SystemResponse) theEObject;
			T result = caseSystemResponse(systemResponse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.CYBER_PHYSICAL_PHENOMENA: {
			CyberPhysicalPhenomena cyberPhysicalPhenomena = (CyberPhysicalPhenomena) theEObject;
			T result = caseCyberPhysicalPhenomena(cyberPhysicalPhenomena);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.REQUIREMENT_SATISFACTION: {
			RequirementSatisfaction requirementSatisfaction = (RequirementSatisfaction) theEObject;
			T result = caseRequirementSatisfaction(requirementSatisfaction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.MULTI_PHENOMENON: {
			MultiPhenomenon multiPhenomenon = (MultiPhenomenon) theEObject;
			T result = caseMultiPhenomenon(multiPhenomenon);
			if (result == null)
				result = caseCyberPhysicalPhenomena(multiPhenomenon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.SIMPLE_PHENOMENON: {
			SimplePhenomenon simplePhenomenon = (SimplePhenomenon) theEObject;
			T result = caseSimplePhenomenon(simplePhenomenon);
			if (result == null)
				result = caseCyberPhysicalPhenomena(simplePhenomenon);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetamodelPackage.ARTIFACT: {
			Artifact artifact = (Artifact) theEObject;
			T result = caseArtifact(artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Emergent Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emergent Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmergentBehavior(EmergentBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemResponse(SystemResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cyber Physical Phenomena</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cyber Physical Phenomena</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCyberPhysicalPhenomena(CyberPhysicalPhenomena object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Satisfaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Satisfaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementSatisfaction(RequirementSatisfaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Phenomenon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Phenomenon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPhenomenon(MultiPhenomenon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Phenomenon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Phenomenon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplePhenomenon(SimplePhenomenon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
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
