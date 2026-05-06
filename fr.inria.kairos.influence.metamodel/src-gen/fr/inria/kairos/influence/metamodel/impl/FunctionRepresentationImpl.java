/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.FunctionRepresentation;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.ParticipantRange;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.FunctionRepresentationImpl#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.FunctionRepresentationImpl#getApplicabilityDomain <em>Applicability Domain</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.FunctionRepresentationImpl#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionRepresentationImpl extends MinimalEObjectImpl.Container
		implements FunctionRepresentation {
	/**
	 * The default value of the '{@link #getSourceUri() <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceUri() <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected String sourceUri = SOURCE_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicabilityDomain() <em>Applicability Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicabilityDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantRange> applicabilityDomain;

	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final double CONFIDENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected double confidence = CONFIDENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.FUNCTION_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceUri() {
		return sourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceUri(String newSourceUri) {
		String oldSourceUri = sourceUri;
		sourceUri = newSourceUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION_REPRESENTATION__SOURCE_URI,
					oldSourceUri, sourceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParticipantRange> getApplicabilityDomain() {
		if (applicabilityDomain == null) {
			applicabilityDomain = new EObjectContainmentEList<ParticipantRange>(ParticipantRange.class, this,
					MetamodelPackage.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN);
		}
		return applicabilityDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getConfidence() {
		return confidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(double newConfidence) {
		double oldConfidence = confidence;
		confidence = newConfidence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FUNCTION_REPRESENTATION__CONFIDENCE,
					oldConfidence, confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN:
			return ((InternalEList<?>) getApplicabilityDomain()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.FUNCTION_REPRESENTATION__SOURCE_URI:
			return getSourceUri();
		case MetamodelPackage.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN:
			return getApplicabilityDomain();
		case MetamodelPackage.FUNCTION_REPRESENTATION__CONFIDENCE:
			return getConfidence();
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
		case MetamodelPackage.FUNCTION_REPRESENTATION__SOURCE_URI:
			setSourceUri((String) newValue);
			return;
		case MetamodelPackage.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN:
			getApplicabilityDomain().clear();
			getApplicabilityDomain().addAll((Collection<? extends ParticipantRange>) newValue);
			return;
		case MetamodelPackage.FUNCTION_REPRESENTATION__CONFIDENCE:
			setConfidence((Double) newValue);
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
		case MetamodelPackage.FUNCTION_REPRESENTATION__SOURCE_URI:
			setSourceUri(SOURCE_URI_EDEFAULT);
			return;
		case MetamodelPackage.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN:
			getApplicabilityDomain().clear();
			return;
		case MetamodelPackage.FUNCTION_REPRESENTATION__CONFIDENCE:
			setConfidence(CONFIDENCE_EDEFAULT);
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
		case MetamodelPackage.FUNCTION_REPRESENTATION__SOURCE_URI:
			return SOURCE_URI_EDEFAULT == null ? sourceUri != null : !SOURCE_URI_EDEFAULT.equals(sourceUri);
		case MetamodelPackage.FUNCTION_REPRESENTATION__APPLICABILITY_DOMAIN:
			return applicabilityDomain != null && !applicabilityDomain.isEmpty();
		case MetamodelPackage.FUNCTION_REPRESENTATION__CONFIDENCE:
			return confidence != CONFIDENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sourceUri: ");
		result.append(sourceUri);
		result.append(", confidence: ");
		result.append(confidence);
		result.append(')');
		return result.toString();
	}

} //FunctionRepresentationImpl
