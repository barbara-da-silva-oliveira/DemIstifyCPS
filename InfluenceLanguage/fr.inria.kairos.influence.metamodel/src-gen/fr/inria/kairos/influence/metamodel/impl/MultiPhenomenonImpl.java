/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.MultiPhenomenon;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MultiPhenomenonImpl#getAggregationOf <em>Aggregation Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPhenomenonImpl extends CyberPhysicalPhenomenaImpl implements MultiPhenomenon {
	/**
	 * The cached value of the '{@link #getAggregationOf() <em>Aggregation Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationOf()
	 * @generated
	 * @ordered
	 */
	protected EList<CyberPhysicalPhenomena> aggregationOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPhenomenonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MULTI_PHENOMENON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CyberPhysicalPhenomena> getAggregationOf() {
		if (aggregationOf == null) {
			aggregationOf = new EObjectResolvingEList<CyberPhysicalPhenomena>(CyberPhysicalPhenomena.class, this,
					MetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF);
		}
		return aggregationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
			return getAggregationOf();
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
		case MetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
			getAggregationOf().clear();
			getAggregationOf().addAll((Collection<? extends CyberPhysicalPhenomena>) newValue);
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
		case MetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
			getAggregationOf().clear();
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
		case MetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
			return aggregationOf != null && !aggregationOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiPhenomenonImpl
