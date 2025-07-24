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
 *   <li>{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getRelatedTo <em>Related To</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getAffects <em>Affects</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.AbstractInfluence#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence()
 * @model abstract="true"
 * @generated
 */
public interface AbstractInfluence extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Related To</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence_RelatedTo()
	 * @model derived="true"
	 * @generated
	 */
	EList<Requirement> getRelatedTo();

	/**
	 * Returns the value of the '<em><b>Affects</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.SystemResponse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getAbstractInfluence_Affects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SystemResponse> getAffects();

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
