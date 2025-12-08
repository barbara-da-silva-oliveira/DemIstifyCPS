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
 *   <li>{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}</li>
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
	 * Returns the value of the '<em><b>Owned Influence Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Influence Function</em>' containment reference.
	 * @see #setOwnedInfluenceFunction(InfluenceFunction)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getCompositeInfluence_OwnedInfluenceFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InfluenceFunction getOwnedInfluenceFunction();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.CompositeInfluence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Influence Function</em>' containment reference.
	 * @see #getOwnedInfluenceFunction()
	 * @generated
	 */
	void setOwnedInfluenceFunction(InfluenceFunction value);

} // CompositeInfluence
