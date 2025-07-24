/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 * </ul>
 *
 * @generated
 */
public class CompositeInfluenceImpl extends InfluenceImpl implements CompositeInfluence {
	/**
	 * The cached value of the '{@link #getInternalInfluences() <em>Internal Influences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalInfluences()
	 * @generated
	 * @ordered
	 */
	protected EList<Influence> internalInfluences;

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
	public EList<Influence> getInternalInfluences() {
		if (internalInfluences == null) {
			internalInfluences = new EObjectResolvingEList<Influence>(Influence.class, this,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.COMPOSITE_INFLUENCE__INTERNAL_INFLUENCES:
			return getInternalInfluences();
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
			getInternalInfluences().addAll((Collection<? extends Influence>) newValue);
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
		}
		return super.eIsSet(featureID);
	}

} //CompositeInfluenceImpl
