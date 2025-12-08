/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInfluence extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence_Description()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getDescription();

} // AbstractInfluence
