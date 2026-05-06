/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partipant Relative Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getParticipant <em>Participant</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getImportance <em>Importance</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getRationale <em>Rationale</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPartipantRelativeImpact()
 * @model
 * @generated
 */
public interface PartipantRelativeImpact extends EObject {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant</em>' reference.
	 * @see #setParticipant(Participant)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPartipantRelativeImpact_Participant()
	 * @model
	 * @generated
	 */
	Participant getParticipant();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getParticipant <em>Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant</em>' reference.
	 * @see #getParticipant()
	 * @generated
	 */
	void setParticipant(Participant value);

	/**
	 * Returns the value of the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance</em>' attribute.
	 * @see #setImportance(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPartipantRelativeImpact_Importance()
	 * @model
	 * @generated
	 */
	double getImportance();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getImportance <em>Importance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance</em>' attribute.
	 * @see #getImportance()
	 * @generated
	 */
	void setImportance(double value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.kairos.influence.metamodel.TrendType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.TrendType
	 * @see #setDirection(TrendType)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPartipantRelativeImpact_Direction()
	 * @model
	 * @generated
	 */
	TrendType getDirection();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see fr.inria.kairos.influence.metamodel.TrendType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(TrendType value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getPartipantRelativeImpact_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.PartipantRelativeImpact#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

} // PartipantRelativeImpact
