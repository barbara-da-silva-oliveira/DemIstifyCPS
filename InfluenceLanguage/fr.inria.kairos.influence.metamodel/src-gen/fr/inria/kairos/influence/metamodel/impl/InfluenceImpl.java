/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponse;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOriginatorPhenomena <em>Originator Phenomena</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOriginatorArtifact <em>Originator Artifact</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOriginatorSystemResponse <em>Originator System Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceImpl extends NamedElementImpl implements Influence {
	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> relatedTo;

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
	 * The cached value of the '{@link #getOriginatorPhenomena() <em>Originator Phenomena</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorPhenomena()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPhenomena> originatorPhenomena;

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
	 * The cached value of the '{@link #getOriginatorArtifact() <em>Originator Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignArtifact> originatorArtifact;

	/**
	 * The cached value of the '{@link #getOriginatorSystemResponse() <em>Originator System Response</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorSystemResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemResponse> originatorSystemResponse;

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
		return MetamodelPackage.Literals.INFLUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRelatedTo() {
		if (relatedTo == null) {
			relatedTo = new EObjectResolvingEList<Requirement>(Requirement.class, this,
					MetamodelPackage.INFLUENCE__RELATED_TO);
		}
		return relatedTo;
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
					MetamodelPackage.INFLUENCE__AFFECTS);
		}
		return affects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPhenomena> getOriginatorPhenomena() {
		if (originatorPhenomena == null) {
			originatorPhenomena = new EObjectResolvingEList<PhysicalPhenomena>(PhysicalPhenomena.class, this,
					MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA);
		}
		return originatorPhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescription() {
		if (description == null) {
			description = new EDataTypeUniqueEList<String>(String.class, this, MetamodelPackage.INFLUENCE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DesignArtifact> getOriginatorArtifact() {
		if (originatorArtifact == null) {
			originatorArtifact = new EObjectResolvingEList<DesignArtifact>(DesignArtifact.class, this,
					MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT);
		}
		return originatorArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemResponse> getOriginatorSystemResponse() {
		if (originatorSystemResponse == null) {
			originatorSystemResponse = new EObjectResolvingEList<SystemResponse>(SystemResponse.class, this,
					MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE);
		}
		return originatorSystemResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__AFFECTS:
			return ((InternalEList<?>) getAffects()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.INFLUENCE__RELATED_TO:
			return getRelatedTo();
		case MetamodelPackage.INFLUENCE__AFFECTS:
			return getAffects();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			return getOriginatorPhenomena();
		case MetamodelPackage.INFLUENCE__DESCRIPTION:
			return getDescription();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			return getOriginatorArtifact();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			return getOriginatorSystemResponse();
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
		case MetamodelPackage.INFLUENCE__RELATED_TO:
			getRelatedTo().clear();
			getRelatedTo().addAll((Collection<? extends Requirement>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__AFFECTS:
			getAffects().clear();
			getAffects().addAll((Collection<? extends SystemResponse>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			getOriginatorPhenomena().clear();
			getOriginatorPhenomena().addAll((Collection<? extends PhysicalPhenomena>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__DESCRIPTION:
			getDescription().clear();
			getDescription().addAll((Collection<? extends String>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			getOriginatorArtifact().clear();
			getOriginatorArtifact().addAll((Collection<? extends DesignArtifact>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			getOriginatorSystemResponse().clear();
			getOriginatorSystemResponse().addAll((Collection<? extends SystemResponse>) newValue);
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
		case MetamodelPackage.INFLUENCE__RELATED_TO:
			getRelatedTo().clear();
			return;
		case MetamodelPackage.INFLUENCE__AFFECTS:
			getAffects().clear();
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			getOriginatorPhenomena().clear();
			return;
		case MetamodelPackage.INFLUENCE__DESCRIPTION:
			getDescription().clear();
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			getOriginatorArtifact().clear();
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			getOriginatorSystemResponse().clear();
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
		case MetamodelPackage.INFLUENCE__RELATED_TO:
			return relatedTo != null && !relatedTo.isEmpty();
		case MetamodelPackage.INFLUENCE__AFFECTS:
			return affects != null && !affects.isEmpty();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			return originatorPhenomena != null && !originatorPhenomena.isEmpty();
		case MetamodelPackage.INFLUENCE__DESCRIPTION:
			return description != null && !description.isEmpty();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			return originatorArtifact != null && !originatorArtifact.isEmpty();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			return originatorSystemResponse != null && !originatorSystemResponse.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //InfluenceImpl
