/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.SystemResponse;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOriginatorPhenomena <em>Originator Phenomena</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOriginatorArtifact <em>Originator Artifact</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOriginatorSystemResponse <em>Originator System Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfluenceImpl extends AbstractInfluenceImpl implements Influence {
	/**
	 * The cached value of the '{@link #getOriginatorPhenomena() <em>Originator Phenomena</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorPhenomena()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPhenomena> originatorPhenomena;
	/**
	 * The cached value of the '{@link #getOriginatorArtifact() <em>Originator Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignArtifact> originatorArtifact;
	/**
	 * The cached value of the '{@link #getOriginatorSystemResponse() <em>Originator System Response</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatorSystemResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemResponse> originatorSystemResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfluenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.INFLUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PhysicalPhenomena> getOriginatorPhenomena() {
		if (originatorPhenomena == null) {
			originatorPhenomena = new EObjectResolvingEList<PhysicalPhenomena>(PhysicalPhenomena.class, this,
					MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA);
		}
		return originatorPhenomena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DesignArtifact> getOriginatorArtifact() {
		if (originatorArtifact == null) {
			originatorArtifact = new EObjectResolvingEList<DesignArtifact>(DesignArtifact.class, this,
					MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT);
		}
		return originatorArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemResponse> getOriginatorSystemResponse() {
		if (originatorSystemResponse == null) {
			originatorSystemResponse = new EObjectResolvingEList<SystemResponse>(SystemResponse.class, this,
					MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE);
		}
		return originatorSystemResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			return getOriginatorPhenomena();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			return getOriginatorArtifact();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			return getOriginatorSystemResponse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			getOriginatorPhenomena().clear();
			getOriginatorPhenomena().addAll((Collection<? extends PhysicalPhenomena>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			getOriginatorArtifact().clear();
			getOriginatorArtifact().addAll((Collection<? extends DesignArtifact>) newValue);
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			getOriginatorSystemResponse().clear();
			getOriginatorSystemResponse().addAll((Collection<? extends SystemResponse>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			getOriginatorPhenomena().clear();
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			getOriginatorArtifact().clear();
			return;
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			getOriginatorSystemResponse().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__ORIGINATOR_PHENOMENA:
			return originatorPhenomena != null && !originatorPhenomena.isEmpty();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_ARTIFACT:
			return originatorArtifact != null && !originatorArtifact.isEmpty();
		case MetamodelPackage.INFLUENCE__ORIGINATOR_SYSTEM_RESPONSE:
			return originatorSystemResponse != null && !originatorSystemResponse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfluenceImpl
