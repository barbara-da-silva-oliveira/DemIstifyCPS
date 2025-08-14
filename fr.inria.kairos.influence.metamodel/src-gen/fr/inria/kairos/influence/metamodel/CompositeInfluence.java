/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getInternalInfluences <em>Internal Influences</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedFunction <em>Owned Function</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getCompositeInfluence()
 * @model
 * @generated
 */
public interface CompositeInfluence extends AbstractInfluence {
	/**
	 * Returns the value of the '<em><b>Internal Influences</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.AbstractInfluence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Influences</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getCompositeInfluence_InternalInfluences()
	 * @model lower="2"
	 * @generated
	 */
	EList<AbstractInfluence> getInternalInfluences();

	/**
	 * Returns the value of the '<em><b>Owned Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Function</em>' containment reference.
	 * @see #setOwnedFunction(CompositeFunction)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getCompositeInfluence_OwnedFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CompositeFunction getOwnedFunction();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedFunction <em>Owned Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Function</em>' containment reference.
	 * @see #getOwnedFunction()
	 * @generated
	 */
	void setOwnedFunction(CompositeFunction value);

} // CompositeInfluence
