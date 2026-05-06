/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.NamedElement;
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Impact Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantImpactFunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.ParticipantImpactFunctionImpl#getParticipantContribution <em>Participant Contribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpactFunctionImpl extends FunctionRepresentationImpl implements ParticipantImpactFunction {
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
	 * The cached value of the '{@link #getParticipantContribution() <em>Participant Contribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantContribution()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantRelativeImpact> participantContribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpactFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PARTICIPANT_IMPACT_FUNCTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParticipantRelativeImpact> getParticipantContribution() {
		if (participantContribution == null) {
			participantContribution = new EObjectContainmentEList<ParticipantRelativeImpact>(
					ParticipantRelativeImpact.class, this,
					MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION);
		}
		return participantContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION:
			return ((InternalEList<?>) getParticipantContribution()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__NAME:
			return getName();
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION:
			return getParticipantContribution();
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
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION:
			getParticipantContribution().clear();
			getParticipantContribution().addAll((Collection<? extends ParticipantRelativeImpact>) newValue);
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
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION:
			getParticipantContribution().clear();
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
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__PARTICIPANT_CONTRIBUTION:
			return participantContribution != null && !participantContribution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__NAME:
				return MetamodelPackage.NAMED_ELEMENT__NAME;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
			case MetamodelPackage.NAMED_ELEMENT__NAME:
				return MetamodelPackage.PARTICIPANT_IMPACT_FUNCTION__NAME;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //ParticipantImpactFunctionImpl
