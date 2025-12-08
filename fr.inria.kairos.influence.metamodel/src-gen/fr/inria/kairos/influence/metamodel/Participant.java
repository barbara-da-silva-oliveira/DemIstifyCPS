/**
 */
package fr.inria.kairos.influence.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Participant#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Participant#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Participant#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipant()
 * @model abstract="true"
 * @generated
 */
public interface Participant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipant_Weight()
	 * @model required="true"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Participant#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see #setLikelihood(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipant_Likelihood()
	 * @model required="true"
	 * @generated
	 */
	double getLikelihood();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Participant#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(double value);

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getParticipant_Confidence()
	 * @model required="true"
	 * @generated
	 */
	double getConfidence();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Participant#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(double value);

} // Participant
