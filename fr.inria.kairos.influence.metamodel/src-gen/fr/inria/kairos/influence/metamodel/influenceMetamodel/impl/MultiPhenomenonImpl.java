/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel.impl;

import fr.inria.kairos.influence.metamodel.influenceMetamodel.CyberPhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.MultiPhenomenon;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.MultiPhenomenonImpl#getCompositionOf <em>Composition Of</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.impl.MultiPhenomenonImpl#getAggregationOf <em>Aggregation Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPhenomenonImpl extends CyberPhysicalPhenomenaImpl implements MultiPhenomenon {
	/**
	 * The cached value of the '{@link #getCompositionOf() <em>Composition Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositionOf()
	 * @generated
	 * @ordered
	 */
	protected EList<CyberPhysicalPhenomena> compositionOf;

	/**
	 * The cached value of the '{@link #getAggregationOf() <em>Aggregation Of</em>}' containment reference list.
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
		return InfluenceMetamodelPackage.Literals.MULTI_PHENOMENON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CyberPhysicalPhenomena> getCompositionOf() {
		if (compositionOf == null) {
			compositionOf = new EObjectContainmentEList<CyberPhysicalPhenomena>(CyberPhysicalPhenomena.class, this,
					InfluenceMetamodelPackage.MULTI_PHENOMENON__COMPOSITION_OF);
		}
		return compositionOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CyberPhysicalPhenomena> getAggregationOf() {
		if (aggregationOf == null) {
			aggregationOf = new EObjectContainmentEList<CyberPhysicalPhenomena>(CyberPhysicalPhenomena.class, this,
					InfluenceMetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF);
		}
		return aggregationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__COMPOSITION_OF:
			return ((InternalEList<?>) getCompositionOf()).basicRemove(otherEnd, msgs);
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
			return ((InternalEList<?>) getAggregationOf()).basicRemove(otherEnd, msgs);
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
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__COMPOSITION_OF:
			return getCompositionOf();
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
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
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__COMPOSITION_OF:
			getCompositionOf().clear();
			getCompositionOf().addAll((Collection<? extends CyberPhysicalPhenomena>) newValue);
			return;
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
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
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__COMPOSITION_OF:
			getCompositionOf().clear();
			return;
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
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
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__COMPOSITION_OF:
			return compositionOf != null && !compositionOf.isEmpty();
		case InfluenceMetamodelPackage.MULTI_PHENOMENON__AGGREGATION_OF:
			return aggregationOf != null && !aggregationOf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiPhenomenonImpl
