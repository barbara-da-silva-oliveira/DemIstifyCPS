/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel.impl;

import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.RequirementSatisfaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Satisfaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.RequirementSatisfactionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.RequirementSatisfactionImpl#getConcerningRequirement <em>Concerning Requirement</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.RequirementSatisfactionImpl#getSatisfaction <em>Satisfaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementSatisfactionImpl extends MinimalEObjectImpl.Container implements RequirementSatisfaction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcerningRequirement() <em>Concerning Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerningRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCERNING_REQUIREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcerningRequirement() <em>Concerning Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerningRequirement()
	 * @generated
	 * @ordered
	 */
	protected String concerningRequirement = CONCERNING_REQUIREMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSatisfaction() <em>Satisfaction</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfaction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> satisfaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementSatisfactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfluenceMetamodelPackage.Literals.REQUIREMENT_SATISFACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConcerningRequirement() {
		return concerningRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConcerningRequirement(String newConcerningRequirement) {
		String oldConcerningRequirement = concerningRequirement;
		concerningRequirement = newConcerningRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__CONCERNING_REQUIREMENT,
					oldConcerningRequirement, concerningRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSatisfaction() {
		if (satisfaction == null) {
			satisfaction = new EDataTypeUniqueEList<String>(String.class, this,
					InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__SATISFACTION);
		}
		return satisfaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__NAME:
			return getName();
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__CONCERNING_REQUIREMENT:
			return getConcerningRequirement();
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__SATISFACTION:
			return getSatisfaction();
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
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__NAME:
			setName((String) newValue);
			return;
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__CONCERNING_REQUIREMENT:
			setConcerningRequirement((String) newValue);
			return;
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__SATISFACTION:
			getSatisfaction().clear();
			getSatisfaction().addAll((Collection<? extends String>) newValue);
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
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__CONCERNING_REQUIREMENT:
			setConcerningRequirement(CONCERNING_REQUIREMENT_EDEFAULT);
			return;
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__SATISFACTION:
			getSatisfaction().clear();
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
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__CONCERNING_REQUIREMENT:
			return CONCERNING_REQUIREMENT_EDEFAULT == null ? concerningRequirement != null
					: !CONCERNING_REQUIREMENT_EDEFAULT.equals(concerningRequirement);
		case InfluenceMetamodelPackage.REQUIREMENT_SATISFACTION__SATISFACTION:
			return satisfaction != null && !satisfaction.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", concerningRequirement: ");
		result.append(concerningRequirement);
		result.append(", satisfaction: ");
		result.append(satisfaction);
		result.append(')');
		return result.toString();
	}

} //RequirementSatisfactionImpl
