/**
 */
package fr.inria.kairos.influence.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Metadata#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Metadata#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Metadata#getStrength <em>Strength</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Metadata#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see #setLikelihood(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMetadata_Likelihood()
	 * @model
	 * @generated
	 */
	double getLikelihood();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Metadata#getLikelihood <em>Likelihood</em>}' attribute.
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
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMetadata_Confidence()
	 * @model
	 * @generated
	 */
	double getConfidence();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Metadata#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(double value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see #setStrength(double)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMetadata_Strength()
	 * @model
	 * @generated
	 */
	double getStrength();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Metadata#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(double value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(NamedElement)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getMetadata_Element()
	 * @model
	 * @generated
	 */
	NamedElement getElement();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Metadata#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(NamedElement value);

} // Metadata
