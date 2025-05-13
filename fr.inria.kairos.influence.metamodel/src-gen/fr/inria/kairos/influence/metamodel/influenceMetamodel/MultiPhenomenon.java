/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Phenomenon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.MultiPhenomenon#getCompositionOf <em>Composition Of</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.MultiPhenomenon#getAggregationOf <em>Aggregation Of</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage#getMultiPhenomenon()
 * @model
 * @generated
 */
public interface MultiPhenomenon extends CyberPhysicalPhenomena {
	/**
	 * Returns the value of the '<em><b>Composition Of</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.influenceMetamodel.CyberPhysicalPhenomena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Of</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage#getMultiPhenomenon_CompositionOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<CyberPhysicalPhenomena> getCompositionOf();

	/**
	 * Returns the value of the '<em><b>Aggregation Of</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.influenceMetamodel.CyberPhysicalPhenomena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Of</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage#getMultiPhenomenon_AggregationOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<CyberPhysicalPhenomena> getAggregationOf();

} // MultiPhenomenon
