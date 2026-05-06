/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;

import fr.inria.kairos.influence.metamodel.ValueSpec;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environmental Factor Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorParticipantImpl#getAdmissibleSpace <em>Admissible Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentalFactorParticipantImpl extends ParticipantImpl implements EnvironmentalFactorParticipant {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentalFactor target;

	/**
	 * The cached value of the '{@link #getAdmissibleSpace() <em>Admissible Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissibleSpace()
	 * @generated
	 * @ordered
	 */
	protected ValueSpec admissibleSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentalFactorParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentalFactor getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (EnvironmentalFactor) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentalFactor basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(EnvironmentalFactor newTarget) {
		EnvironmentalFactor oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpec getAdmissibleSpace() {
		return admissibleSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdmissibleSpace(ValueSpec newAdmissibleSpace, NotificationChain msgs) {
		ValueSpec oldAdmissibleSpace = admissibleSpace;
		admissibleSpace = newAdmissibleSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE, oldAdmissibleSpace,
					newAdmissibleSpace);
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
	public void setAdmissibleSpace(ValueSpec newAdmissibleSpace) {
		if (newAdmissibleSpace != admissibleSpace) {
			NotificationChain msgs = null;
			if (admissibleSpace != null)
				msgs = ((InternalEObject) admissibleSpace).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE,
						null, msgs);
			if (newAdmissibleSpace != null)
				msgs = ((InternalEObject) newAdmissibleSpace).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE,
						null, msgs);
			msgs = basicSetAdmissibleSpace(newAdmissibleSpace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE, newAdmissibleSpace,
					newAdmissibleSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE:
			return basicSetAdmissibleSpace(null, msgs);
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
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE:
			return getAdmissibleSpace();
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
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET:
			setTarget((EnvironmentalFactor) newValue);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE:
			setAdmissibleSpace((ValueSpec) newValue);
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
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET:
			setTarget((EnvironmentalFactor) null);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE:
			setAdmissibleSpace((ValueSpec) null);
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
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__TARGET:
			return target != null;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR_PARTICIPANT__ADMISSIBLE_SPACE:
			return admissibleSpace != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentalFactorParticipantImpl
