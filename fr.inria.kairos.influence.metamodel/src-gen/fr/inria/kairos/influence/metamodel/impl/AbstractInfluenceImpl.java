/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl#getOwnedInfluenceFunction <em>Owned Influence Function</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.AbstractInfluenceImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractInfluenceImpl extends NamedElementImpl implements AbstractInfluence {
	/**
	 * The cached value of the '{@link #getOwnedInfluenceFunction() <em>Owned Influence Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInfluenceFunction()
	 * @generated
	 * @ordered
	 */
	protected InfluenceFunction ownedInfluenceFunction;

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
	public InfluenceFunction getOwnedInfluenceFunction() {
		return ownedInfluenceFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInfluenceFunction(InfluenceFunction newOwnedInfluenceFunction,
			NotificationChain msgs) {
		InfluenceFunction oldOwnedInfluenceFunction = ownedInfluenceFunction;
		ownedInfluenceFunction = newOwnedInfluenceFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION, oldOwnedInfluenceFunction,
					newOwnedInfluenceFunction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedInfluenceFunction(InfluenceFunction newOwnedInfluenceFunction) {
		if (newOwnedInfluenceFunction != ownedInfluenceFunction) {
			NotificationChain msgs = null;
			if (ownedInfluenceFunction != null)
				msgs = ((InternalEObject) ownedInfluenceFunction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION, null,
						msgs);
			if (newOwnedInfluenceFunction != null)
				msgs = ((InternalEObject) newOwnedInfluenceFunction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION, null,
						msgs);
			msgs = basicSetOwnedInfluenceFunction(newOwnedInfluenceFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION, newOwnedInfluenceFunction,
					newOwnedInfluenceFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return basicSetOwnedInfluenceFunction(null, msgs);
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return getOwnedInfluenceFunction();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			setOwnedInfluenceFunction((InfluenceFunction) newValue);
			return;
		case MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION:
			setDescription((String) newValue);
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			setOwnedInfluenceFunction((InfluenceFunction) null);
			return;
		case MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case MetamodelPackage.ABSTRACT_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return ownedInfluenceFunction != null;
		case MetamodelPackage.ABSTRACT_INFLUENCE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
