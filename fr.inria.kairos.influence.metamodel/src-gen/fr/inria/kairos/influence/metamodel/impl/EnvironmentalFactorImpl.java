/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environmental Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.EnvironmentalFactorImpl#getFlexibility <em>Flexibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentalFactorImpl extends NamedElementImpl implements EnvironmentalFactor {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlexibility() <em>Flexibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexibility()
	 * @generated
	 * @ordered
	 */
	protected static final double FLEXIBILITY_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFlexibility() <em>Flexibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlexibility()
	 * @generated
	 * @ordered
	 */
	protected double flexibility = FLEXIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentalFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ENVIRONMENTAL_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENVIRONMENTAL_FACTOR__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENVIRONMENTAL_FACTOR__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENVIRONMENTAL_FACTOR__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFlexibility() {
		return flexibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlexibility(double newFlexibility) {
		double oldFlexibility = flexibility;
		flexibility = newFlexibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENVIRONMENTAL_FACTOR__FLEXIBILITY,
					oldFlexibility, flexibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__DESCRIPTION:
			return getDescription();
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__VALUE:
			return getValue();
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__UNIT:
			return getUnit();
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__FLEXIBILITY:
			return getFlexibility();
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
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__VALUE:
			setValue((Double) newValue);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__UNIT:
			setUnit((String) newValue);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__FLEXIBILITY:
			setFlexibility((Double) newValue);
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
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__FLEXIBILITY:
			setFlexibility(FLEXIBILITY_EDEFAULT);
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
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__VALUE:
			return value != VALUE_EDEFAULT;
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case MetamodelPackage.ENVIRONMENTAL_FACTOR__FLEXIBILITY:
			return flexibility != FLEXIBILITY_EDEFAULT;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(", flexibility: ");
		result.append(flexibility);
		result.append(')');
		return result.toString();
	}

} //EnvironmentalFactorImpl
