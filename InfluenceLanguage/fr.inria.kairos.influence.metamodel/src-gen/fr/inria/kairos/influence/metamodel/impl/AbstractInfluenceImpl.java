/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
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
 * An implementation of the model object '<em><b>Abstract Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractInfluenceImpl extends NamedElementImpl implements AbstractInfluence {
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
	protected AbstractInfluenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ABSTRACT_INFLUENCE;
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
					MetamodelPackage.ABSTRACT_INFLUENCE__RELATED_TO);
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
					MetamodelPackage.ABSTRACT_INFLUENCE__AFFECTS);
		}
		return affects;
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
					MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION);
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__AFFECTS:
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__RELATED_TO:
			return getRelatedTo();
		case MetamodelPackage.ABSTRACT_INFLUENCE__AFFECTS:
			return getAffects();
		case MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION:
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__RELATED_TO:
			getRelatedTo().clear();
			getRelatedTo().addAll((Collection<? extends Requirement>) newValue);
			return;
		case MetamodelPackage.ABSTRACT_INFLUENCE__AFFECTS:
			getAffects().clear();
			getAffects().addAll((Collection<? extends SystemResponse>) newValue);
			return;
		case MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION:
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__RELATED_TO:
			getRelatedTo().clear();
			return;
		case MetamodelPackage.ABSTRACT_INFLUENCE__AFFECTS:
			getAffects().clear();
			return;
		case MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION:
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__RELATED_TO:
			return relatedTo != null && !relatedTo.isEmpty();
		case MetamodelPackage.ABSTRACT_INFLUENCE__AFFECTS:
			return affects != null && !affects.isEmpty();
		case MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION:
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AbstractInfluenceImpl
