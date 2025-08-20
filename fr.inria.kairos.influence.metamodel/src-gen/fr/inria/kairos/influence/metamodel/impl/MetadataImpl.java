/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.Metadata;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.NamedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MetadataImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MetadataImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MetadataImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.MetadataImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata {
	/**
	 * The default value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final double LIKELIHOOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected double likelihood = LIKELIHOOD_EDEFAULT;

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
	 * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected static final double STRENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected double strength = STRENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLikelihood() {
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLikelihood(double newLikelihood) {
		double oldLikelihood = likelihood;
		likelihood = newLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.METADATA__LIKELIHOOD, oldLikelihood,
					likelihood));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.METADATA__CONFIDENCE, oldConfidence,
					confidence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrength(double newStrength) {
		double oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.METADATA__STRENGTH, oldStrength,
					strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = (NamedElement) eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.METADATA__ELEMENT,
							oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(NamedElement newElement) {
		NamedElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.METADATA__ELEMENT, oldElement,
					element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.METADATA__LIKELIHOOD:
			return getLikelihood();
		case MetamodelPackage.METADATA__CONFIDENCE:
			return getConfidence();
		case MetamodelPackage.METADATA__STRENGTH:
			return getStrength();
		case MetamodelPackage.METADATA__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.METADATA__LIKELIHOOD:
			setLikelihood((Double) newValue);
			return;
		case MetamodelPackage.METADATA__CONFIDENCE:
			setConfidence((Double) newValue);
			return;
		case MetamodelPackage.METADATA__STRENGTH:
			setStrength((Double) newValue);
			return;
		case MetamodelPackage.METADATA__ELEMENT:
			setElement((NamedElement) newValue);
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
		case MetamodelPackage.METADATA__LIKELIHOOD:
			setLikelihood(LIKELIHOOD_EDEFAULT);
			return;
		case MetamodelPackage.METADATA__CONFIDENCE:
			setConfidence(CONFIDENCE_EDEFAULT);
			return;
		case MetamodelPackage.METADATA__STRENGTH:
			setStrength(STRENGTH_EDEFAULT);
			return;
		case MetamodelPackage.METADATA__ELEMENT:
			setElement((NamedElement) null);
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
		case MetamodelPackage.METADATA__LIKELIHOOD:
			return likelihood != LIKELIHOOD_EDEFAULT;
		case MetamodelPackage.METADATA__CONFIDENCE:
			return confidence != CONFIDENCE_EDEFAULT;
		case MetamodelPackage.METADATA__STRENGTH:
			return strength != STRENGTH_EDEFAULT;
		case MetamodelPackage.METADATA__ELEMENT:
			return element != null;
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
		result.append(" (likelihood: ");
		result.append(likelihood);
		result.append(", confidence: ");
		result.append(confidence);
		result.append(", strength: ");
		result.append(strength);
		result.append(')');
		return result.toString();
	}

} //MetadataImpl
