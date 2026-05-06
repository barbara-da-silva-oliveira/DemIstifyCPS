/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantRange;
import fr.inria.kairos.influence.metamodel.ValueSpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRangeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantRangeImpl#getParticipant <em>Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantRangeImpl extends NamedElementImpl implements ParticipantRange {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpec value;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PARTICIPANT_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpec getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueSpec newValue, NotificationChain msgs) {
		ValueSpec oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.PARTICIPANT_RANGE__VALUE, oldValue, newValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(ValueSpec newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject) value).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.PARTICIPANT_RANGE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject) newValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.PARTICIPANT_RANGE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PARTICIPANT_RANGE__VALUE, newValue,
					newValue));
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
							MetamodelPackage.PARTICIPANT_RANGE__PARTICIPANT, oldParticipant, participant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PARTICIPANT_RANGE__PARTICIPANT,
					oldParticipant, participant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.PARTICIPANT_RANGE__VALUE:
			return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.PARTICIPANT_RANGE__VALUE:
			return getValue();
		case MetamodelPackage.PARTICIPANT_RANGE__PARTICIPANT:
			if (resolve)
				return getParticipant();
			return basicGetParticipant();
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
		case MetamodelPackage.PARTICIPANT_RANGE__VALUE:
			setValue((ValueSpec) newValue);
			return;
		case MetamodelPackage.PARTICIPANT_RANGE__PARTICIPANT:
			setParticipant((Participant) newValue);
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
		case MetamodelPackage.PARTICIPANT_RANGE__VALUE:
			setValue((ValueSpec) null);
			return;
		case MetamodelPackage.PARTICIPANT_RANGE__PARTICIPANT:
			setParticipant((Participant) null);
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
		case MetamodelPackage.PARTICIPANT_RANGE__VALUE:
			return value != null;
		case MetamodelPackage.PARTICIPANT_RANGE__PARTICIPANT:
			return participant != null;
		}
		return super.eIsSet(featureID);
	}

} //ParticipantRangeImpl
