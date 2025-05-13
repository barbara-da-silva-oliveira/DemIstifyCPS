/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel.impl;

import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.SystemResponse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.SystemResponseImpl#getObservation <em>Observation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemResponseImpl extends MinimalEObjectImpl.Container implements SystemResponse {
	/**
	 * The default value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected String observation = OBSERVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfluenceMetamodelPackage.Literals.SYSTEM_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservation(String newObservation) {
		String oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InfluenceMetamodelPackage.SYSTEM_RESPONSE__OBSERVATION, oldObservation, observation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InfluenceMetamodelPackage.SYSTEM_RESPONSE__OBSERVATION:
			return getObservation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InfluenceMetamodelPackage.SYSTEM_RESPONSE__OBSERVATION:
			setObservation((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case InfluenceMetamodelPackage.SYSTEM_RESPONSE__OBSERVATION:
			setObservation(OBSERVATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case InfluenceMetamodelPackage.SYSTEM_RESPONSE__OBSERVATION:
			return OBSERVATION_EDEFAULT == null ? observation != null : !OBSERVATION_EDEFAULT.equals(observation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (observation: ");
		result.append(observation);
		result.append(')');
		return result.toString();
	}

} //SystemResponseImpl
