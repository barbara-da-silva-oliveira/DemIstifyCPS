/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Function;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.Metadata;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.SystemResponse;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getOwnedFunction <em>Owned Function</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.InfluenceImpl#getPerElementMetadata <em>Per Element Metadata</em>}</li>
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
	 * The cached value of the '{@link #getOwnedFunction() <em>Owned Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunction()
	 * @generated
	 * @ordered
	 */
	protected Function ownedFunction;

	/**
	 * The cached value of the '{@link #getPerElementMetadata() <em>Per Element Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerElementMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> perElementMetadata;

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
	public Function getOwnedFunction() {
		return ownedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedFunction(Function newOwnedFunction, NotificationChain msgs) {
		Function oldOwnedFunction = ownedFunction;
		ownedFunction = newOwnedFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.INFLUENCE__OWNED_FUNCTION, oldOwnedFunction, newOwnedFunction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedFunction(Function newOwnedFunction) {
		if (newOwnedFunction != ownedFunction) {
			NotificationChain msgs = null;
			if (ownedFunction != null)
				msgs = ((InternalEObject) ownedFunction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.INFLUENCE__OWNED_FUNCTION, null, msgs);
			if (newOwnedFunction != null)
				msgs = ((InternalEObject) newOwnedFunction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.INFLUENCE__OWNED_FUNCTION, null, msgs);
			msgs = basicSetOwnedFunction(newOwnedFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INFLUENCE__OWNED_FUNCTION,
					newOwnedFunction, newOwnedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metadata> getPerElementMetadata() {
		if (perElementMetadata == null) {
			perElementMetadata = new EObjectContainmentEList<Metadata>(Metadata.class, this,
					MetamodelPackage.INFLUENCE__PER_ELEMENT_METADATA);
		}
		return perElementMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.INFLUENCE__OWNED_FUNCTION:
			return basicSetOwnedFunction(null, msgs);
		case MetamodelPackage.INFLUENCE__PER_ELEMENT_METADATA:
			return ((InternalEList<?>) getPerElementMetadata()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case MetamodelPackage.INFLUENCE__OWNED_FUNCTION:
			return getOwnedFunction();
		case MetamodelPackage.INFLUENCE__PER_ELEMENT_METADATA:
			return getPerElementMetadata();
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
		case MetamodelPackage.INFLUENCE__OWNED_FUNCTION:
			setOwnedFunction((Function) newValue);
			return;
		case MetamodelPackage.INFLUENCE__PER_ELEMENT_METADATA:
			getPerElementMetadata().clear();
			getPerElementMetadata().addAll((Collection<? extends Metadata>) newValue);
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
		case MetamodelPackage.INFLUENCE__OWNED_FUNCTION:
			setOwnedFunction((Function) null);
			return;
		case MetamodelPackage.INFLUENCE__PER_ELEMENT_METADATA:
			getPerElementMetadata().clear();
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
		case MetamodelPackage.INFLUENCE__OWNED_FUNCTION:
			return ownedFunction != null;
		case MetamodelPackage.INFLUENCE__PER_ELEMENT_METADATA:
			return perElementMetadata != null && !perElementMetadata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfluenceImpl
