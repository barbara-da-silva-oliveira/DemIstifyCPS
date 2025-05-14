/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.Artifact;
import fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.RequirementSatisfaction;

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
 * An implementation of the model object '<em><b>Influence Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedInfluences <em>Owned Influences</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedRequirementSatisfaction <em>Owned Requirement Satisfaction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedCyberPhysicalPhenomena <em>Owned Cyber Physical Phenomena</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedArtifacts <em>Owned Artifacts</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceModelImpl extends MinimalEObjectImpl.Container implements InfluenceModel {
	/**
	 * The cached value of the '{@link #getOwnedInfluences() <em>Owned Influences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInfluences()
	 * @generated
	 * @ordered
	 */
	protected EList<Influence> ownedInfluences;

	/**
	 * The cached value of the '{@link #getOwnedRequirementSatisfaction() <em>Owned Requirement Satisfaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirementSatisfaction()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementSatisfaction> ownedRequirementSatisfaction;

	/**
	 * The cached value of the '{@link #getOwnedCyberPhysicalPhenomena() <em>Owned Cyber Physical Phenomena</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCyberPhysicalPhenomena()
	 * @generated
	 * @ordered
	 */
	protected EList<CyberPhysicalPhenomena> ownedCyberPhysicalPhenomena;

	/**
	 * The cached value of the '{@link #getOwnedArtifacts() <em>Owned Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> ownedArtifacts;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.INFLUENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Influence> getOwnedInfluences() {
		if (ownedInfluences == null) {
			ownedInfluences = new EObjectContainmentEList<Influence>(Influence.class, this,
					MetamodelPackage.INFLUENCE_MODEL__OWNED_INFLUENCES);
		}
		return ownedInfluences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementSatisfaction> getOwnedRequirementSatisfaction() {
		if (ownedRequirementSatisfaction == null) {
			ownedRequirementSatisfaction = new EObjectContainmentEList<RequirementSatisfaction>(
					RequirementSatisfaction.class, this,
					MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION);
		}
		return ownedRequirementSatisfaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CyberPhysicalPhenomena> getOwnedCyberPhysicalPhenomena() {
		if (ownedCyberPhysicalPhenomena == null) {
			ownedCyberPhysicalPhenomena = new EObjectContainmentEList<CyberPhysicalPhenomena>(
					CyberPhysicalPhenomena.class, this,
					MetamodelPackage.INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA);
		}
		return ownedCyberPhysicalPhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getOwnedArtifacts() {
		if (ownedArtifacts == null) {
			ownedArtifacts = new EObjectContainmentEList<Artifact>(Artifact.class, this,
					MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS);
		}
		return ownedArtifacts;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INFLUENCE_MODEL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_INFLUENCES:
			return ((InternalEList<?>) getOwnedInfluences()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION:
			return ((InternalEList<?>) getOwnedRequirementSatisfaction()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			return ((InternalEList<?>) getOwnedCyberPhysicalPhenomena()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			return ((InternalEList<?>) getOwnedArtifacts()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_INFLUENCES:
			return getOwnedInfluences();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION:
			return getOwnedRequirementSatisfaction();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			return getOwnedCyberPhysicalPhenomena();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			return getOwnedArtifacts();
		case MetamodelPackage.INFLUENCE_MODEL__NAME:
			return getName();
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_INFLUENCES:
			getOwnedInfluences().clear();
			getOwnedInfluences().addAll((Collection<? extends Influence>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION:
			getOwnedRequirementSatisfaction().clear();
			getOwnedRequirementSatisfaction().addAll((Collection<? extends RequirementSatisfaction>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			getOwnedCyberPhysicalPhenomena().clear();
			getOwnedCyberPhysicalPhenomena().addAll((Collection<? extends CyberPhysicalPhenomena>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			getOwnedArtifacts().clear();
			getOwnedArtifacts().addAll((Collection<? extends Artifact>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__NAME:
			setName((String) newValue);
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_INFLUENCES:
			getOwnedInfluences().clear();
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION:
			getOwnedRequirementSatisfaction().clear();
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			getOwnedCyberPhysicalPhenomena().clear();
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			getOwnedArtifacts().clear();
			return;
		case MetamodelPackage.INFLUENCE_MODEL__NAME:
			setName(NAME_EDEFAULT);
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_INFLUENCES:
			return ownedInfluences != null && !ownedInfluences.isEmpty();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENT_SATISFACTION:
			return ownedRequirementSatisfaction != null && !ownedRequirementSatisfaction.isEmpty();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			return ownedCyberPhysicalPhenomena != null && !ownedCyberPhysicalPhenomena.isEmpty();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			return ownedArtifacts != null && !ownedArtifacts.isEmpty();
		case MetamodelPackage.INFLUENCE_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //InfluenceModelImpl
