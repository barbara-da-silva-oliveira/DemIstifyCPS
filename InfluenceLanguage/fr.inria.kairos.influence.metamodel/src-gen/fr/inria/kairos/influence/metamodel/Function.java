/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Function#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getFunction_Definition()
	 * @model
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Function#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

} // Function
