/**
 */
package fr.inria.kairos.influence.metamodel.impl;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Phenomena</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.PhysicalPhenomenaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.inria.kairos.influence.metamodel.impl.PhysicalPhenomenaImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalPhenomenaImpl extends NamedElementImpl implements PhysicalPhenomena {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> description;

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
	protected PhysicalPhenomenaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PHYSICAL_PHENOMENA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescription() {
		if (description == null) {
			description = new EDataTypeUniqueEList<String>(String.class, this,
					MetamodelPackage.PHYSICAL_PHENOMENA__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMetadata() {
		if (metadata == null) {
			metadata = new EDataTypeUniqueEList<String>(String.class, this,
					MetamodelPackage.PHYSICAL_PHENOMENA__METADATA);
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
		case MetamodelPackage.PHYSICAL_PHENOMENA__DESCRIPTION:
			return getDescription();
		case MetamodelPackage.PHYSICAL_PHENOMENA__METADATA:
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
		case MetamodelPackage.PHYSICAL_PHENOMENA__DESCRIPTION:
			getDescription().clear();
			getDescription().addAll((Collection<? extends String>) newValue);
			return;
		case MetamodelPackage.PHYSICAL_PHENOMENA__METADATA:
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
		case MetamodelPackage.PHYSICAL_PHENOMENA__DESCRIPTION:
			getDescription().clear();
			return;
		case MetamodelPackage.PHYSICAL_PHENOMENA__METADATA:
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
		case MetamodelPackage.PHYSICAL_PHENOMENA__DESCRIPTION:
			return description != null && !description.isEmpty();
		case MetamodelPackage.PHYSICAL_PHENOMENA__METADATA:
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
		result.append(" (description: ");
		result.append(description);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(')');
		return result.toString();
	}

} //PhysicalPhenomenaImpl
