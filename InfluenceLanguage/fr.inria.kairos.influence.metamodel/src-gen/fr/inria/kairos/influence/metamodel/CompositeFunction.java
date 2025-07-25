/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.CompositeFunction#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getCompositeFunction()
 * @model
 * @generated
 */
public interface CompositeFunction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.SystemResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getCompositeFunction_Inputs()
	 * @model
	 * @generated
	 */
	EList<SystemResponse> getInputs();

} // CompositeFunction
