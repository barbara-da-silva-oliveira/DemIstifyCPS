/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monotonicity Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.MonotonicityTable#getTableRows <em>Table Rows</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityTable()
 * @model
 * @generated
 */
public interface MonotonicityTable extends FunctionRepresentation, NamedElement {
	/**
	 * Returns the value of the '<em><b>Table Rows</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.MonotonicityRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Rows</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMonotonicityTable_TableRows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MonotonicityRow> getTableRows();

} // MonotonicityTable
