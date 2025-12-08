/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.Requirement;

import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedRequirements <em>Owned Requirements</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedEnvironmentalFactors <em>Owned Environmental Factors</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedArtifacts <em>Owned Artifacts</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceModelImpl#getOwnedSRPs <em>Owned SR Ps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceModelImpl extends NamedElementImpl implements InfluenceModel {
	/**
	 * The cached value of the '{@link #getOwnedInfluences() <em>Owned Influences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInfluences()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInfluence> ownedInfluences;

	/**
	 * The cached value of the '{@link #getOwnedRequirements() <em>Owned Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> ownedRequirements;

	/**
	 * The cached value of the '{@link #getOwnedEnvironmentalFactors() <em>Owned Environmental Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnvironmentalFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentalFactor> ownedEnvironmentalFactors;

	/**
	 * The cached value of the '{@link #getOwnedArtifacts() <em>Owned Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignArtifact> ownedArtifacts;

	/**
	 * The cached value of the '{@link #getOwnedSRPs() <em>Owned SR Ps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSRPs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemResponseProperty> ownedSRPs;

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
	public EList<AbstractInfluence> getOwnedInfluences() {
		if (ownedInfluences == null) {
			ownedInfluences = new EObjectContainmentEList<AbstractInfluence>(AbstractInfluence.class, this,
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
	public EList<Requirement> getOwnedRequirements() {
		if (ownedRequirements == null) {
			ownedRequirements = new EObjectContainmentEList<Requirement>(Requirement.class, this,
					MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENTS);
		}
		return ownedRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvironmentalFactor> getOwnedEnvironmentalFactors() {
		if (ownedEnvironmentalFactors == null) {
			ownedEnvironmentalFactors = new EObjectContainmentEList<EnvironmentalFactor>(EnvironmentalFactor.class,
					this, MetamodelPackage.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS);
		}
		return ownedEnvironmentalFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DesignArtifact> getOwnedArtifacts() {
		if (ownedArtifacts == null) {
			ownedArtifacts = new EObjectContainmentEList<DesignArtifact>(DesignArtifact.class, this,
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
	public EList<SystemResponseProperty> getOwnedSRPs() {
		if (ownedSRPs == null) {
			ownedSRPs = new EObjectContainmentEList<SystemResponseProperty>(SystemResponseProperty.class, this,
					MetamodelPackage.INFLUENCE_MODEL__OWNED_SR_PS);
		}
		return ownedSRPs;
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENTS:
			return ((InternalEList<?>) getOwnedRequirements()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS:
			return ((InternalEList<?>) getOwnedEnvironmentalFactors()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			return ((InternalEList<?>) getOwnedArtifacts()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_SR_PS:
			return ((InternalEList<?>) getOwnedSRPs()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENTS:
			return getOwnedRequirements();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS:
			return getOwnedEnvironmentalFactors();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			return getOwnedArtifacts();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_SR_PS:
			return getOwnedSRPs();
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
			getOwnedInfluences().addAll((Collection<? extends AbstractInfluence>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENTS:
			getOwnedRequirements().clear();
			getOwnedRequirements().addAll((Collection<? extends Requirement>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS:
			getOwnedEnvironmentalFactors().clear();
			getOwnedEnvironmentalFactors().addAll((Collection<? extends EnvironmentalFactor>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			getOwnedArtifacts().clear();
			getOwnedArtifacts().addAll((Collection<? extends DesignArtifact>) newValue);
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_SR_PS:
			getOwnedSRPs().clear();
			getOwnedSRPs().addAll((Collection<? extends SystemResponseProperty>) newValue);
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENTS:
			getOwnedRequirements().clear();
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS:
			getOwnedEnvironmentalFactors().clear();
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			getOwnedArtifacts().clear();
			return;
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_SR_PS:
			getOwnedSRPs().clear();
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
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_REQUIREMENTS:
			return ownedRequirements != null && !ownedRequirements.isEmpty();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ENVIRONMENTAL_FACTORS:
			return ownedEnvironmentalFactors != null && !ownedEnvironmentalFactors.isEmpty();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_ARTIFACTS:
			return ownedArtifacts != null && !ownedArtifacts.isEmpty();
		case MetamodelPackage.INFLUENCE_MODEL__OWNED_SR_PS:
			return ownedSRPs != null && !ownedSRPs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfluenceModelImpl
