/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.SystemResponse#getObservation <em>Observation</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage#getSystemResponse()
 * @model
 * @generated
 */
public interface SystemResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' attribute.
	 * @see #setObservation(String)
	 * @see fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage#getSystemResponse_Observation()
	 * @model
	 * @generated
	 */
	String getObservation();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.influenceMetamodel.SystemResponse#getObservation <em>Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' attribute.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(String value);

} // SystemResponse
