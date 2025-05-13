/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel.impl;

import fr.inria.kairos.influence.metamodel.influenceMetamodel.CyberPhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.Influence;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodel;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage;

import fr.inria.kairos.influence.metamodel.influenceMetamodel.RequirementSatisfaction;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceMetamodelImpl#getOwnedInfluences <em>Owned Influences</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceMetamodelImpl#getOwnedRequirementSatisfaction <em>Owned Requirement Satisfaction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceMetamodelImpl#getOwnedCyberPhysicalPhenomena <em>Owned Cyber Physical Phenomena</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceMetamodelImpl extends MinimalEObjectImpl.Container implements InfluenceMetamodel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenceMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL;
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
					InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_INFLUENCES);
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
					InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION);
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
					InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA);
		}
		return ownedCyberPhysicalPhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_INFLUENCES:
			return ((InternalEList<?>) getOwnedInfluences()).basicRemove(otherEnd, msgs);
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION:
			return ((InternalEList<?>) getOwnedRequirementSatisfaction()).basicRemove(otherEnd, msgs);
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			return ((InternalEList<?>) getOwnedCyberPhysicalPhenomena()).basicRemove(otherEnd, msgs);
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
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_INFLUENCES:
			return getOwnedInfluences();
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION:
			return getOwnedRequirementSatisfaction();
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			return getOwnedCyberPhysicalPhenomena();
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
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_INFLUENCES:
			getOwnedInfluences().clear();
			getOwnedInfluences().addAll((Collection<? extends Influence>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION:
			getOwnedRequirementSatisfaction().clear();
			getOwnedRequirementSatisfaction().addAll((Collection<? extends RequirementSatisfaction>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			getOwnedCyberPhysicalPhenomena().clear();
			getOwnedCyberPhysicalPhenomena().addAll((Collection<? extends CyberPhysicalPhenomena>) newValue);
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
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_INFLUENCES:
			getOwnedInfluences().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION:
			getOwnedRequirementSatisfaction().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			getOwnedCyberPhysicalPhenomena().clear();
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
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_INFLUENCES:
			return ownedInfluences != null && !ownedInfluences.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION:
			return ownedRequirementSatisfaction != null && !ownedRequirementSatisfaction.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			return ownedCyberPhysicalPhenomena != null && !ownedCyberPhysicalPhenomena.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfluenceMetamodelImpl
