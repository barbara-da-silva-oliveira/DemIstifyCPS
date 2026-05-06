/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.RangeValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl#getNominal <em>Nominal</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl#getStep <em>Step</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl#isInclusiveLower <em>Inclusive Lower</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RangeValueImpl#isInclusiveUpper <em>Inclusive Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeValueImpl extends ValueSpecImpl implements RangeValue {
	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected double lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final double UPPER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected double upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominal() <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominal() <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal()
	 * @generated
	 * @ordered
	 */
	protected double nominal = NOMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #isInclusiveLower() <em>Inclusive Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusiveLower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUSIVE_LOWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInclusiveLower() <em>Inclusive Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusiveLower()
	 * @generated
	 * @ordered
	 */
	protected boolean inclusiveLower = INCLUSIVE_LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #isInclusiveUpper() <em>Inclusive Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusiveUpper()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUSIVE_UPPER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInclusiveUpper() <em>Inclusive Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInclusiveUpper()
	 * @generated
	 * @ordered
	 */
	protected boolean inclusiveUpper = INCLUSIVE_UPPER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.RANGE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower(double newLower) {
		double oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RANGE_VALUE__LOWER, oldLower,
					lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpper(double newUpper) {
		double oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RANGE_VALUE__UPPER, oldUpper,
					upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNominal() {
		return nominal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNominal(double newNominal) {
		double oldNominal = nominal;
		nominal = newNominal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RANGE_VALUE__NOMINAL, oldNominal,
					nominal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RANGE_VALUE__STEP, oldStep, step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInclusiveLower() {
		return inclusiveLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclusiveLower(boolean newInclusiveLower) {
		boolean oldInclusiveLower = inclusiveLower;
		inclusiveLower = newInclusiveLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RANGE_VALUE__INCLUSIVE_LOWER,
					oldInclusiveLower, inclusiveLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInclusiveUpper() {
		return inclusiveUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclusiveUpper(boolean newInclusiveUpper) {
		boolean oldInclusiveUpper = inclusiveUpper;
		inclusiveUpper = newInclusiveUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RANGE_VALUE__INCLUSIVE_UPPER,
					oldInclusiveUpper, inclusiveUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.RANGE_VALUE__LOWER:
			return getLower();
		case MetamodelPackage.RANGE_VALUE__UPPER:
			return getUpper();
		case MetamodelPackage.RANGE_VALUE__NOMINAL:
			return getNominal();
		case MetamodelPackage.RANGE_VALUE__STEP:
			return getStep();
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_LOWER:
			return isInclusiveLower();
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_UPPER:
			return isInclusiveUpper();
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
		case MetamodelPackage.RANGE_VALUE__LOWER:
			setLower((Double) newValue);
			return;
		case MetamodelPackage.RANGE_VALUE__UPPER:
			setUpper((Double) newValue);
			return;
		case MetamodelPackage.RANGE_VALUE__NOMINAL:
			setNominal((Double) newValue);
			return;
		case MetamodelPackage.RANGE_VALUE__STEP:
			setStep((Double) newValue);
			return;
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_LOWER:
			setInclusiveLower((Boolean) newValue);
			return;
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_UPPER:
			setInclusiveUpper((Boolean) newValue);
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
		case MetamodelPackage.RANGE_VALUE__LOWER:
			setLower(LOWER_EDEFAULT);
			return;
		case MetamodelPackage.RANGE_VALUE__UPPER:
			setUpper(UPPER_EDEFAULT);
			return;
		case MetamodelPackage.RANGE_VALUE__NOMINAL:
			setNominal(NOMINAL_EDEFAULT);
			return;
		case MetamodelPackage.RANGE_VALUE__STEP:
			setStep(STEP_EDEFAULT);
			return;
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_LOWER:
			setInclusiveLower(INCLUSIVE_LOWER_EDEFAULT);
			return;
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_UPPER:
			setInclusiveUpper(INCLUSIVE_UPPER_EDEFAULT);
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
		case MetamodelPackage.RANGE_VALUE__LOWER:
			return lower != LOWER_EDEFAULT;
		case MetamodelPackage.RANGE_VALUE__UPPER:
			return upper != UPPER_EDEFAULT;
		case MetamodelPackage.RANGE_VALUE__NOMINAL:
			return nominal != NOMINAL_EDEFAULT;
		case MetamodelPackage.RANGE_VALUE__STEP:
			return step != STEP_EDEFAULT;
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_LOWER:
			return inclusiveLower != INCLUSIVE_LOWER_EDEFAULT;
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_UPPER:
			return inclusiveUpper != INCLUSIVE_UPPER_EDEFAULT;
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
		result.append(" (lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", nominal: ");
		result.append(nominal);
		result.append(", step: ");
		result.append(step);
		result.append(", inclusiveLower: ");
		result.append(inclusiveLower);
		result.append(", inclusiveUpper: ");
		result.append(inclusiveUpper);
		result.append(')');
		return result.toString();
	}

} //RangeValueImpl
