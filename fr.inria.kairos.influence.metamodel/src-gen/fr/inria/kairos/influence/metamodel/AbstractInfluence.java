/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInfluence extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Influence Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Influence Function</em>' containment reference.
	 * @see #setOwnedInfluenceFunction(InfluenceFunction)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence_OwnedInfluenceFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InfluenceFunction getOwnedInfluenceFunction();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Influence Function</em>' containment reference.
	 * @see #getOwnedInfluenceFunction()
	 * @generated
	 */
	void setOwnedInfluenceFunction(InfluenceFunction value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // AbstractInfluence
