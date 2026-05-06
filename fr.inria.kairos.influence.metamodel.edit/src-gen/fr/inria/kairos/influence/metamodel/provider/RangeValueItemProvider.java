/**
 */
package fr.inria.kairos.influence.metamodel.provider;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.RangeValue;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.kairos.influence.metamodel.RangeValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeValueItemProvider extends ValueSpecItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeValueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLowerPropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addNominalPropertyDescriptor(object);
			addStepPropertyDescriptor(object);
			addInclusiveLowerPropertyDescriptor(object);
			addInclusiveUpperPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RangeValue_lower_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RangeValue_lower_feature",
								"_UI_RangeValue_type"),
						MetamodelPackage.Literals.RANGE_VALUE__LOWER, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RangeValue_upper_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RangeValue_upper_feature",
								"_UI_RangeValue_type"),
						MetamodelPackage.Literals.RANGE_VALUE__UPPER, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Nominal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNominalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RangeValue_nominal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RangeValue_nominal_feature",
								"_UI_RangeValue_type"),
						MetamodelPackage.Literals.RANGE_VALUE__NOMINAL, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RangeValue_step_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RangeValue_step_feature",
								"_UI_RangeValue_type"),
						MetamodelPackage.Literals.RANGE_VALUE__STEP, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Inclusive Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInclusiveLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RangeValue_inclusiveLower_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RangeValue_inclusiveLower_feature",
								"_UI_RangeValue_type"),
						MetamodelPackage.Literals.RANGE_VALUE__INCLUSIVE_LOWER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Inclusive Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInclusiveUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_RangeValue_inclusiveUpper_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_RangeValue_inclusiveUpper_feature",
								"_UI_RangeValue_type"),
						MetamodelPackage.Literals.RANGE_VALUE__INCLUSIVE_UPPER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns RangeValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RangeValue"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RangeValue) object).getUnit();
		return label == null || label.length() == 0 ? getString("_UI_RangeValue_type")
				: getString("_UI_RangeValue_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RangeValue.class)) {
		case MetamodelPackage.RANGE_VALUE__LOWER:
		case MetamodelPackage.RANGE_VALUE__UPPER:
		case MetamodelPackage.RANGE_VALUE__NOMINAL:
		case MetamodelPackage.RANGE_VALUE__STEP:
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_LOWER:
		case MetamodelPackage.RANGE_VALUE__INCLUSIVE_UPPER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
