/**
 */
package fr.inria.kairos.influence.metamodel.influenceMetamodel.provider;

import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodel;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelFactory;
import fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.inria.kairos.influence.metamodel.influenceMetamodel.InfluenceMetamodel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InfluenceMetamodelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfluenceMetamodelItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedInfluencesPropertyDescriptor(object);
			addOwnedArtifactsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Influences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedInfluencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InfluenceMetamodel_ownedInfluences_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_InfluenceMetamodel_ownedInfluences_feature", "_UI_InfluenceMetamodel_type"),
						InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_INFLUENCES, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owned Artifacts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedArtifactsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_InfluenceMetamodel_ownedArtifacts_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_InfluenceMetamodel_ownedArtifacts_feature",
								"_UI_InfluenceMetamodel_type"),
						InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_ARTIFACTS, true, false, true,
						null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION);
			childrenFeatures
					.add(InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns InfluenceMetamodel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InfluenceMetamodel"));
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
		return getString("_UI_InfluenceMetamodel_type");
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

		switch (notification.getFeatureID(InfluenceMetamodel.class)) {
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION:
		case InfluenceMetamodelPackage.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_REQUIREMENT_SATISFACTION,
				InfluenceMetamodelFactory.eINSTANCE.createRequirementSatisfaction()));

		newChildDescriptors.add(createChildParameter(
				InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA,
				InfluenceMetamodelFactory.eINSTANCE.createCyberPhysicalPhenomena()));

		newChildDescriptors.add(createChildParameter(
				InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA,
				InfluenceMetamodelFactory.eINSTANCE.createMultiPhenomenon()));

		newChildDescriptors.add(createChildParameter(
				InfluenceMetamodelPackage.Literals.INFLUENCE_METAMODEL__OWNED_CYBER_PHYSICAL_PHENOMENA,
				InfluenceMetamodelFactory.eINSTANCE.createSimplePhenomenon()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return InfluenceMetamodelEditPlugin.INSTANCE;
	}

}
