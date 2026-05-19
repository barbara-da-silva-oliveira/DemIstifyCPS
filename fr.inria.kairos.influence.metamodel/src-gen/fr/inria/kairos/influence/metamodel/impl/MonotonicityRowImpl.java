/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.MonotonicityRow;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantRange;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import fr.inria.kairos.influence.metamodel.TrendType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monotonicity Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl#getTrend <em>Trend</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl#getVariedParticipant <em>Varied Participant</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MonotonicityRowImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonotonicityRowImpl extends MinimalEObjectImpl.Container implements MonotonicityRow {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantRange> condition;

	/**
	 * The default value of the '{@link #getTrend() <em>Trend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrend()
	 * @generated
	 * @ordered
	 */
	protected static final TrendType TREND_EDEFAULT = TrendType.INCREASING;

	/**
	 * The cached value of the '{@link #getTrend() <em>Trend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrend()
	 * @generated
	 * @ordered
	 */
	protected TrendType trend = TREND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariedParticipant() <em>Varied Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariedParticipant()
	 * @generated
	 * @ordered
	 */
	protected Participant variedParticipant;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected SystemResponseProperty output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonotonicityRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MONOTONICITY_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParticipantRange> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<ParticipantRange>(ParticipantRange.class, this,
					MetamodelPackage.MONOTONICITY_ROW__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrendType getTrend() {
		return trend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrend(TrendType newTrend) {
		TrendType oldTrend = trend;
		trend = newTrend == null ? TREND_EDEFAULT : newTrend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MONOTONICITY_ROW__TREND, oldTrend,
					trend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant getVariedParticipant() {
		if (variedParticipant != null && variedParticipant.eIsProxy()) {
			InternalEObject oldVariedParticipant = (InternalEObject) variedParticipant;
			variedParticipant = (Participant) eResolveProxy(oldVariedParticipant);
			if (variedParticipant != oldVariedParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.MONOTONICITY_ROW__VARIED_PARTICIPANT, oldVariedParticipant,
							variedParticipant));
			}
		}
		return variedParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetVariedParticipant() {
		return variedParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariedParticipant(Participant newVariedParticipant) {
		Participant oldVariedParticipant = variedParticipant;
		variedParticipant = newVariedParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MONOTONICITY_ROW__VARIED_PARTICIPANT,
					oldVariedParticipant, variedParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemResponseProperty getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (SystemResponseProperty) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.MONOTONICITY_ROW__OUTPUT,
							oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemResponseProperty basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(SystemResponseProperty newOutput) {
		SystemResponseProperty oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MONOTONICITY_ROW__OUTPUT, oldOutput,
					output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.MONOTONICITY_ROW__CONDITION:
			return ((InternalEList<?>) getCondition()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.MONOTONICITY_ROW__CONDITION:
			return getCondition();
		case MetamodelPackage.MONOTONICITY_ROW__TREND:
			return getTrend();
		case MetamodelPackage.MONOTONICITY_ROW__VARIED_PARTICIPANT:
			if (resolve)
				return getVariedParticipant();
			return basicGetVariedParticipant();
		case MetamodelPackage.MONOTONICITY_ROW__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.MONOTONICITY_ROW__CONDITION:
			getCondition().clear();
			getCondition().addAll((Collection<? extends ParticipantRange>) newValue);
			return;
		case MetamodelPackage.MONOTONICITY_ROW__TREND:
			setTrend((TrendType) newValue);
			return;
		case MetamodelPackage.MONOTONICITY_ROW__VARIED_PARTICIPANT:
			setVariedParticipant((Participant) newValue);
			return;
		case MetamodelPackage.MONOTONICITY_ROW__OUTPUT:
			setOutput((SystemResponseProperty) newValue);
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
		case MetamodelPackage.MONOTONICITY_ROW__CONDITION:
			getCondition().clear();
			return;
		case MetamodelPackage.MONOTONICITY_ROW__TREND:
			setTrend(TREND_EDEFAULT);
			return;
		case MetamodelPackage.MONOTONICITY_ROW__VARIED_PARTICIPANT:
			setVariedParticipant((Participant) null);
			return;
		case MetamodelPackage.MONOTONICITY_ROW__OUTPUT:
			setOutput((SystemResponseProperty) null);
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
		case MetamodelPackage.MONOTONICITY_ROW__CONDITION:
			return condition != null && !condition.isEmpty();
		case MetamodelPackage.MONOTONICITY_ROW__TREND:
			return trend != TREND_EDEFAULT;
		case MetamodelPackage.MONOTONICITY_ROW__VARIED_PARTICIPANT:
			return variedParticipant != null;
		case MetamodelPackage.MONOTONICITY_ROW__OUTPUT:
			return output != null;
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
		result.append(" (trend: ");
		result.append(trend);
		result.append(')');
		return result.toString();
	}

} //MonotonicityRowImpl
