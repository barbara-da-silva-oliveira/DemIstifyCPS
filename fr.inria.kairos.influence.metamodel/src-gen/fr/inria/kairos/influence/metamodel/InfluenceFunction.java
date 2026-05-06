/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.InfluenceFunction#getRepresentations <em>Representations</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceFunction()
 * @model abstract="true"
 * @generated
 */
public interface InfluenceFunction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Representations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.FunctionRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representations</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluenceFunction_Representations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionRepresentation> getRepresentations();

} // InfluenceFunction
