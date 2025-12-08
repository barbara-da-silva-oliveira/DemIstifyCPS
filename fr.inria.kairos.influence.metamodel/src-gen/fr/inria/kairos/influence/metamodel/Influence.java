/**
 */
package fr.inria.kairos.influence.metamodel;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedParticipants <em>Owned Participants</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.Influence#getOutputSRP <em>Output SRP</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ParticipationPattern'"
 * @generated
 */
public interface Influence extends AbstractInfluence {

	/**
	 * Returns the value of the '<em><b>Owned Influence Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Influence Function</em>' containment reference.
	 * @see #setOwnedInfluenceFunction(InfluenceFunction)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_OwnedInfluenceFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InfluenceFunction getOwnedInfluenceFunction();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Influence#getOwnedInfluenceFunction <em>Owned Influence Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Influence Function</em>' containment reference.
	 * @see #getOwnedInfluenceFunction()
	 * @generated
	 */
	void setOwnedInfluenceFunction(InfluenceFunction value);

	/**
	 * Returns the value of the '<em><b>Owned Participants</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.influence.metamodel.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Participants</em>' containment reference list.
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_OwnedParticipants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Participant> getOwnedParticipants();

	/**
	 * Returns the value of the '<em><b>Output SRP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output SRP</em>' reference.
	 * @see #setOutputSRP(SystemResponseProperty)
	 * @see fr.inria.kairos.influence.metamodel.MetamodelPackage#getInfluence_OutputSRP()
	 * @model required="true"
	 * @generated
	 */
	SystemResponseProperty getOutputSRP();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.influence.metamodel.Influence#getOutputSRP <em>Output SRP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output SRP</em>' reference.
	 * @see #getOutputSRP()
	 * @generated
	 */
	void setOutputSRP(SystemResponseProperty value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.ownedParticipants-&gt;exists(p | p.oclIsKindOf(ArtifactParticipant)) and \n\t\t\t(self.ownedParticipants-&gt;exists(p | p.oclIsKindOf(EnvironmentalFactorParticipant)))\n\t\t\tor self.ownedParticipants-&gt;exists(p |p.oclIsKindOf(SRPInputParticipant))'"
	 * @generated
	 */
	boolean ParticipationPattern(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Influence
