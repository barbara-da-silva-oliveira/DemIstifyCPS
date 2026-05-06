/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getApplicabilityDomain <em>Applicability Domain</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getFunctionRepresentation()
 * @model abstract="true"
 * @generated
 */
public interface FunctionRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Uri</em>' attribute.
	 * @see #setSourceUri(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getFunctionRepresentation_SourceUri()
	 * @model
	 * @generated
	 */
	String getSourceUri();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getSourceUri <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Uri</em>' attribute.
	 * @see #getSourceUri()
	 * @generated
	 */
	void setSourceUri(String value);

	/**
	 * Returns the value of the '<em><b>Applicability Domain</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.ParticipantRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability Domain</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getFunctionRepresentation_ApplicabilityDomain()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParticipantRange> getApplicabilityDomain();

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getFunctionRepresentation_Confidence()
	 * @model
	 * @generated
	 */
	double getConfidence();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.FunctionRepresentation#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(double value);

} // FunctionRepresentation
