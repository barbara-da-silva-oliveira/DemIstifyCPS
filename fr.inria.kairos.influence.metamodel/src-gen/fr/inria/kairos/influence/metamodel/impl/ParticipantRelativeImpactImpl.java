/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import fr.inria.kairos.influence.metamodel.TrendType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Relative Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRelativeImpactImpl#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantRelativeImpactImpl extends MinimalEObjectImpl.Container implements ParticipantRelativeImpact {
	/**
	 * The cached value of the '{@link #getParticipant() <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipant()
	 * @generated
	 * @ordered
	 */
	protected Participant participant;

	/**
	 * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected static final double IMPORTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportance()
	 * @generated
	 * @ordered
	 */
	protected double importance = IMPORTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TrendType DIRECTION_EDEFAULT = TrendType.INCREASING;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected TrendType direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantRelativeImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PARTICIPANT_RELATIVE_IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant getParticipant() {
		if (participant != null && participant.eIsProxy()) {
			InternalEObject oldParticipant = (InternalEObject) participant;
			participant = (Participant) eResolveProxy(oldParticipant);
			if (participant != oldParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT, oldParticipant, participant));
			}
		}
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetParticipant() {
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipant(Participant newParticipant) {
		Participant oldParticipant = participant;
		participant = newParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT, oldParticipant, participant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getImportance() {
		return importance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportance(double newImportance) {
		double oldImportance = importance;
		importance = newImportance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE, oldImportance, importance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrendType getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(TrendType newDirection) {
		TrendType oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT:
			if (resolve)
				return getParticipant();
			return basicGetParticipant();
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE:
			return getImportance();
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__DIRECTION:
			return getDirection();
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__RATIONALE:
			return getRationale();
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
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT:
			setParticipant((Participant) newValue);
			return;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE:
			setImportance((Double) newValue);
			return;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__DIRECTION:
			setDirection((TrendType) newValue);
			return;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__RATIONALE:
			setRationale((String) newValue);
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
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT:
			setParticipant((Participant) null);
			return;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE:
			setImportance(IMPORTANCE_EDEFAULT);
			return;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__RATIONALE:
			setRationale(RATIONALE_EDEFAULT);
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
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__PARTICIPANT:
			return participant != null;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__IMPORTANCE:
			return importance != IMPORTANCE_EDEFAULT;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case MetamodelPackage.PARTICIPANT_RELATIVE_IMPACT__RATIONALE:
			return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
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
		result.append(" (importance: ");
		result.append(importance);
		result.append(", direction: ");
		result.append(direction);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(')');
		return result.toString();
	}

} //ParticipantRelativeImpactImpl
