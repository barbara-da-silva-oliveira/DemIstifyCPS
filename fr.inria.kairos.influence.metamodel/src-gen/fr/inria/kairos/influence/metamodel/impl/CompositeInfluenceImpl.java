/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.CompositeInfluenceImpl#getInternalInfluences <em>Internal Influences</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.CompositeInfluenceImpl#getOwnedInfluenceFunction <em>Owned Influence Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeInfluenceImpl extends AbstractInfluenceImpl implements CompositeInfluence {
	/**
	 * The cached value of the '{@link #getInternalInfluences() <em>Internal Influences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInfluences()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInfluence> internalInfluences;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeInfluenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.COMPOSITE_INFLUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractInfluence> getInternalInfluences() {
		if (internalInfluences == null) {
			internalInfluences = new EObjectResolvingEList<AbstractInfluence>(AbstractInfluence.class, this,
					MetamodelPackage.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES);
		}
		return internalInfluences;
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
					MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION, oldOwnedInfluenceFunction,
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
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION, null,
						msgs);
			if (newOwnedInfluenceFunction != null)
				msgs = ((InternalEObject) newOwnedInfluenceFunction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION, null,
						msgs);
			msgs = basicSetOwnedInfluenceFunction(newOwnedInfluenceFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION, newOwnedInfluenceFunction,
					newOwnedInfluenceFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
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
		case MetamodelPackage.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES:
			return getInternalInfluences();
		case MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return getOwnedInfluenceFunction();
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
		case MetamodelPackage.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES:
			getInternalInfluences().clear();
			getInternalInfluences().addAll((Collection<? extends AbstractInfluence>) newValue);
			return;
		case MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			setOwnedInfluenceFunction((InfluenceFunction) newValue);
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
		case MetamodelPackage.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES:
			getInternalInfluences().clear();
			return;
		case MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			setOwnedInfluenceFunction((InfluenceFunction) null);
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
		case MetamodelPackage.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES:
			return internalInfluences != null && !internalInfluences.isEmpty();
		case MetamodelPackage.COMPOSITE_INFLUENCE__OWNED_INFLUENCE_FUNCTION:
			return ownedInfluenceFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeInfluenceImpl
