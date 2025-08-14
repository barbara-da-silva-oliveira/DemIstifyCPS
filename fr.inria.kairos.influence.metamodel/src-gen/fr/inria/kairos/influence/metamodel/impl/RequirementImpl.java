/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.Requirement;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RequirementImpl#getSatisfaction <em>Satisfaction</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.RequirementImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends NamedElementImpl implements Requirement {
	/**
	 * The cached value of the '{@link #getSatisfaction() <em>Satisfaction</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfaction()
	 * @generated
	 * @ordered
	 */
	protected EList<String> satisfaction;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<String> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSatisfaction() {
		if (satisfaction == null) {
			satisfaction = new EDataTypeUniqueEList<String>(String.class, this,
					MetamodelPackage.REQUIREMENT__SATISFACTION);
		}
		return satisfaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMetadata() {
		if (metadata == null) {
			metadata = new EDataTypeUniqueEList<String>(String.class, this, MetamodelPackage.REQUIREMENT__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.REQUIREMENT__SATISFACTION:
			return getSatisfaction();
		case MetamodelPackage.REQUIREMENT__METADATA:
			return getMetadata();
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
		case MetamodelPackage.REQUIREMENT__SATISFACTION:
			getSatisfaction().clear();
			getSatisfaction().addAll((Collection<? extends String>) newValue);
			return;
		case MetamodelPackage.REQUIREMENT__METADATA:
			getMetadata().clear();
			getMetadata().addAll((Collection<? extends String>) newValue);
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
		case MetamodelPackage.REQUIREMENT__SATISFACTION:
			getSatisfaction().clear();
			return;
		case MetamodelPackage.REQUIREMENT__METADATA:
			getMetadata().clear();
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
		case MetamodelPackage.REQUIREMENT__SATISFACTION:
			return satisfaction != null && !satisfaction.isEmpty();
		case MetamodelPackage.REQUIREMENT__METADATA:
			return metadata != null && !metadata.isEmpty();
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
		result.append(" (satisfaction: ");
		result.append(satisfaction);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
