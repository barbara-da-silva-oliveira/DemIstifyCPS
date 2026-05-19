/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.LanguageType;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfaction Criterion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl#getRequirementRef <em>Requirement Ref</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl#getMarginDefinition <em>Margin Definition</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.SatisfactionCriterionImpl#getConstrainedSRPs <em>Constrained SR Ps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatisfactionCriterionImpl extends NamedElementImpl implements SatisfactionCriterion {
	/**
	 * The cached value of the '{@link #getRequirementRef() <em>Requirement Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementRef()
	 * @generated
	 * @ordered
	 */
	protected EObject requirementRef;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageType LANGUAGE_EDEFAULT = LanguageType.NATURAL_LANGUAGE;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageType language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginDefinition() <em>Margin Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginDefinition() <em>Margin Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginDefinition()
	 * @generated
	 * @ordered
	 */
	protected String marginDefinition = MARGIN_DEFINITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstrainedSRPs() <em>Constrained SR Ps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedSRPs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemResponseProperty> constrainedSRPs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfactionCriterionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.SATISFACTION_CRITERION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getRequirementRef() {
		if (requirementRef != null && requirementRef.eIsProxy()) {
			InternalEObject oldRequirementRef = (InternalEObject) requirementRef;
			requirementRef = eResolveProxy(oldRequirementRef);
			if (requirementRef != oldRequirementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.SATISFACTION_CRITERION__REQUIREMENT_REF, oldRequirementRef,
							requirementRef));
			}
		}
		return requirementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRequirementRef() {
		return requirementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementRef(EObject newRequirementRef) {
		EObject oldRequirementRef = requirementRef;
		requirementRef = newRequirementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SATISFACTION_CRITERION__REQUIREMENT_REF, oldRequirementRef, requirementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageType getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(LanguageType newLanguage) {
		LanguageType oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SATISFACTION_CRITERION__LANGUAGE,
					oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarginDefinition() {
		return marginDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarginDefinition(String newMarginDefinition) {
		String oldMarginDefinition = marginDefinition;
		marginDefinition = newMarginDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SATISFACTION_CRITERION__MARGIN_DEFINITION, oldMarginDefinition, marginDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemResponseProperty> getConstrainedSRPs() {
		if (constrainedSRPs == null) {
			constrainedSRPs = new EObjectResolvingEList<SystemResponseProperty>(SystemResponseProperty.class, this,
					MetamodelPackage.SATISFACTION_CRITERION__CONSTRAINED_SR_PS);
		}
		return constrainedSRPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.SATISFACTION_CRITERION__REQUIREMENT_REF:
			if (resolve)
				return getRequirementRef();
			return basicGetRequirementRef();
		case MetamodelPackage.SATISFACTION_CRITERION__LANGUAGE:
			return getLanguage();
		case MetamodelPackage.SATISFACTION_CRITERION__MARGIN_DEFINITION:
			return getMarginDefinition();
		case MetamodelPackage.SATISFACTION_CRITERION__CONSTRAINED_SR_PS:
			return getConstrainedSRPs();
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
		case MetamodelPackage.SATISFACTION_CRITERION__REQUIREMENT_REF:
			setRequirementRef((EObject) newValue);
			return;
		case MetamodelPackage.SATISFACTION_CRITERION__LANGUAGE:
			setLanguage((LanguageType) newValue);
			return;
		case MetamodelPackage.SATISFACTION_CRITERION__MARGIN_DEFINITION:
			setMarginDefinition((String) newValue);
			return;
		case MetamodelPackage.SATISFACTION_CRITERION__CONSTRAINED_SR_PS:
			getConstrainedSRPs().clear();
			getConstrainedSRPs().addAll((Collection<? extends SystemResponseProperty>) newValue);
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
		case MetamodelPackage.SATISFACTION_CRITERION__REQUIREMENT_REF:
			setRequirementRef((EObject) null);
			return;
		case MetamodelPackage.SATISFACTION_CRITERION__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case MetamodelPackage.SATISFACTION_CRITERION__MARGIN_DEFINITION:
			setMarginDefinition(MARGIN_DEFINITION_EDEFAULT);
			return;
		case MetamodelPackage.SATISFACTION_CRITERION__CONSTRAINED_SR_PS:
			getConstrainedSRPs().clear();
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
		case MetamodelPackage.SATISFACTION_CRITERION__REQUIREMENT_REF:
			return requirementRef != null;
		case MetamodelPackage.SATISFACTION_CRITERION__LANGUAGE:
			return language != LANGUAGE_EDEFAULT;
		case MetamodelPackage.SATISFACTION_CRITERION__MARGIN_DEFINITION:
			return MARGIN_DEFINITION_EDEFAULT == null ? marginDefinition != null
					: !MARGIN_DEFINITION_EDEFAULT.equals(marginDefinition);
		case MetamodelPackage.SATISFACTION_CRITERION__CONSTRAINED_SR_PS:
			return constrainedSRPs != null && !constrainedSRPs.isEmpty();
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
		result.append(" (language: ");
		result.append(language);
		result.append(", marginDefinition: ");
		result.append(marginDefinition);
		result.append(')');
		return result.toString();
	}

} //SatisfactionCriterionImpl
