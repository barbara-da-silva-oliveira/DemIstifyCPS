/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Phenomena</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.PhysicalPhenomena#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.PhysicalPhenomena#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPhysicalPhenomena()
 * @model
 * @generated
 */
public interface PhysicalPhenomena extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPhysicalPhenomena_Description()
	 * @model
	 * @generated
	 */
	EList<String> getDescription();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPhysicalPhenomena_Metadata()
	 * @model
	 * @generated
	 */
	EList<String> getMetadata();

} // PhysicalPhenomena
