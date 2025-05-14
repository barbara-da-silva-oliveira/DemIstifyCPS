/**
 */
package fr.inria.kairos.influence.metamodel;

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
 *   <li>{@link fr.inria.kairos.influence.metamodel.MultiPhenomenon#getAggregationOf <em>Aggregation Of</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMultiPhenomenon()
 * @model
 * @generated
 */
public interface MultiPhenomenon extends CyberPhysicalPhenomena {
	/**
	 * Returns the value of the '<em><b>Aggregation Of</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.CyberPhysicalPhenomena}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Of</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMultiPhenomenon_AggregationOf()
	 * @model
	 * @generated
	 */
	EList<CyberPhysicalPhenomena> getAggregationOf();

} // MultiPhenomenon
