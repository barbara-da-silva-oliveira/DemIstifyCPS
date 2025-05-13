/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel.impl;

import fr.inria.kairos.influence.metamodel.influenceMetamodel.CyberPhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.EmergentBehavior;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.Influence;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.RequirementSatisfaction;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.SystemResponse;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getEvaluatedBy <em>Evaluated By</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getSourceArtifact <em>Source Artifact</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getTargetArtifact <em>Target Artifact</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getSourcePhenomena <em>Source Phenomena</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.InfluenceImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceImpl extends MinimalEObjectImpl.Container implements Influence {
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
	 * The cached value of the '{@link #getEvaluatedBy() <em>Evaluated By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementSatisfaction> evaluatedBy;

	/**
	 * The cached value of the '{@link #getAffects() <em>Affects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffects()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemResponse> affects;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<EmergentBehavior> produces;

	/**
	 * The cached value of the '{@link #getSourceArtifact() <em>Source Artifact</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sourceArtifact;

	/**
	 * The cached value of the '{@link #getTargetArtifact() <em>Target Artifact</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<String> targetArtifact;

	/**
	 * The cached value of the '{@link #getSourcePhenomena() <em>Source Phenomena</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePhenomena()
	 * @generated
	 * @ordered
	 */
	protected EList<CyberPhysicalPhenomena> sourcePhenomena;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfluenceMetamodelPackage.Literals.INFLUENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InfluenceMetamodelPackage.INFLUENCE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementSatisfaction> getEvaluatedBy() {
		if (evaluatedBy == null) {
			evaluatedBy = new EObjectResolvingEList<RequirementSatisfaction>(RequirementSatisfaction.class, this,
					InfluenceMetamodelPackage.INFLUENCE__EVALUATED_BY);
		}
		return evaluatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemResponse> getAffects() {
		if (affects == null) {
			affects = new EObjectContainmentEList<SystemResponse>(SystemResponse.class, this,
					InfluenceMetamodelPackage.INFLUENCE__AFFECTS);
		}
		return affects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EmergentBehavior> getProduces() {
		if (produces == null) {
			produces = new EObjectContainmentEList<EmergentBehavior>(EmergentBehavior.class, this,
					InfluenceMetamodelPackage.INFLUENCE__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSourceArtifact() {
		if (sourceArtifact == null) {
			sourceArtifact = new EDataTypeUniqueEList<String>(String.class, this,
					InfluenceMetamodelPackage.INFLUENCE__SOURCE_ARTIFACT);
		}
		return sourceArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTargetArtifact() {
		if (targetArtifact == null) {
			targetArtifact = new EDataTypeUniqueEList<String>(String.class, this,
					InfluenceMetamodelPackage.INFLUENCE__TARGET_ARTIFACT);
		}
		return targetArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CyberPhysicalPhenomena> getSourcePhenomena() {
		if (sourcePhenomena == null) {
			sourcePhenomena = new EObjectResolvingEList<CyberPhysicalPhenomena>(CyberPhysicalPhenomena.class, this,
					InfluenceMetamodelPackage.INFLUENCE__SOURCE_PHENOMENA);
		}
		return sourcePhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescription() {
		if (description == null) {
			description = new EDataTypeUniqueEList<String>(String.class, this,
					InfluenceMetamodelPackage.INFLUENCE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InfluenceMetamodelPackage.INFLUENCE__AFFECTS:
			return ((InternalEList<?>) getAffects()).basicRemove(otherEnd, msgs);
		case InfluenceMetamodelPackage.INFLUENCE__PRODUCES:
			return ((InternalEList<?>) getProduces()).basicRemove(otherEnd, msgs);
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
		case InfluenceMetamodelPackage.INFLUENCE__NAME:
			return getName();
		case InfluenceMetamodelPackage.INFLUENCE__EVALUATED_BY:
			return getEvaluatedBy();
		case InfluenceMetamodelPackage.INFLUENCE__AFFECTS:
			return getAffects();
		case InfluenceMetamodelPackage.INFLUENCE__PRODUCES:
			return getProduces();
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_ARTIFACT:
			return getSourceArtifact();
		case InfluenceMetamodelPackage.INFLUENCE__TARGET_ARTIFACT:
			return getTargetArtifact();
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_PHENOMENA:
			return getSourcePhenomena();
		case InfluenceMetamodelPackage.INFLUENCE__DESCRIPTION:
			return getDescription();
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
		case InfluenceMetamodelPackage.INFLUENCE__NAME:
			setName((String) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__EVALUATED_BY:
			getEvaluatedBy().clear();
			getEvaluatedBy().addAll((Collection<? extends RequirementSatisfaction>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__AFFECTS:
			getAffects().clear();
			getAffects().addAll((Collection<? extends SystemResponse>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__PRODUCES:
			getProduces().clear();
			getProduces().addAll((Collection<? extends EmergentBehavior>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_ARTIFACT:
			getSourceArtifact().clear();
			getSourceArtifact().addAll((Collection<? extends String>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__TARGET_ARTIFACT:
			getTargetArtifact().clear();
			getTargetArtifact().addAll((Collection<? extends String>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_PHENOMENA:
			getSourcePhenomena().clear();
			getSourcePhenomena().addAll((Collection<? extends CyberPhysicalPhenomena>) newValue);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__DESCRIPTION:
			getDescription().clear();
			getDescription().addAll((Collection<? extends String>) newValue);
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
		case InfluenceMetamodelPackage.INFLUENCE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case InfluenceMetamodelPackage.INFLUENCE__EVALUATED_BY:
			getEvaluatedBy().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE__AFFECTS:
			getAffects().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE__PRODUCES:
			getProduces().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_ARTIFACT:
			getSourceArtifact().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE__TARGET_ARTIFACT:
			getTargetArtifact().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_PHENOMENA:
			getSourcePhenomena().clear();
			return;
		case InfluenceMetamodelPackage.INFLUENCE__DESCRIPTION:
			getDescription().clear();
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
		case InfluenceMetamodelPackage.INFLUENCE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case InfluenceMetamodelPackage.INFLUENCE__EVALUATED_BY:
			return evaluatedBy != null && !evaluatedBy.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE__AFFECTS:
			return affects != null && !affects.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE__PRODUCES:
			return produces != null && !produces.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_ARTIFACT:
			return sourceArtifact != null && !sourceArtifact.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE__TARGET_ARTIFACT:
			return targetArtifact != null && !targetArtifact.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE__SOURCE_PHENOMENA:
			return sourcePhenomena != null && !sourcePhenomena.isEmpty();
		case InfluenceMetamodelPackage.INFLUENCE__DESCRIPTION:
			return description != null && !description.isEmpty();
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
		result.append(", sourceArtifact: ");
		result.append(sourceArtifact);
		result.append(", targetArtifact: ");
		result.append(targetArtifact);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //InfluenceImpl
