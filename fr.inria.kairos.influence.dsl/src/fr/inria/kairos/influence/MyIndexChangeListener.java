package fr.inria.kairos.influence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import fr.inria.kairos.influence.metamodel.InfluenceModel;
import jakarta.inject.Inject;
import jakarta.inject.Provider;

public class MyIndexChangeListener implements IResourceDescription.Event.Listener {

	public MyIndexChangeListener() {
//	    System.out.println(">>> MyIndexChangeListener initialized");
	}

	@Inject
	private XtextDocumentProvider documentProvider;

	@Inject
	private IWorkbench workbench;

	@Inject
	private IResourceDescriptions resourceDescriptions;

	@Inject
	Provider<XtextResourceSet> resourceSetProvider;

	HashMap<URI, EObject> oldObjects = new HashMap<URI, EObject>();

	@Override
	public void descriptionsChanged(IResourceDescription.Event event) {
		Set<URI> referencedUris = getReferencedArtifacts();
		System.out.println(">>> number of referenced artifacts: " + referencedUris.size());

		for (IResourceDescription.Delta delta : event.getDeltas()) {
			IResourceDescription newDescription = delta.getNew();
			IResourceDescription oldDescription = delta.getOld();

			if (newDescription != null) {
				for (IEObjectDescription newEODesc : newDescription.getExportedObjects()) {
					URI exportedUri = newEODesc.getEObjectURI();
					if (referencedUris.contains(exportedUri)) {
						// need to compare before and after
//                    	System.out.println(">>> referenced object found "+referencedUris);
						EObject oldObj = oldObjects.get(exportedUri);
						if (oldObj == null) {
							for (IEObjectDescription oldEODesc : oldDescription.getExportedObjects()) {
								if (oldEODesc.getEObjectURI().toString().compareTo(exportedUri.toString()) == 0) {
									oldObj = oldEODesc.getEObjectOrProxy();
									oldObj = resolveIfProxy(oldObj);
									if (oldObj.eIsProxy()) {
										XtextResourceSet rs = resourceSetProvider.get();
										oldObj = resolveFromDescription(oldEODesc, rs);
									}
									oldObjects.put(exportedUri, oldObj);
								}
							}
						} else {
							EObject newObj = newEODesc.getEObjectOrProxy();
							newObj = resolveIfProxy(newObj);
							if (newObj.eIsProxy()) {
								XtextResourceSet rs = resourceSetProvider.get();
								newObj = resolveFromDescription(newEODesc, rs);
							}

							boolean equal = EObjectDeepComparator.deepEquals(oldObj, newObj);
							if (!equal) {
								System.out.println(">> Object content changed: " + EObjectPrinter.toString(oldObj)
										+ "  --  " + EObjectPrinter.toString(newObj));
								oldObjects.remove(exportedUri);
								oldObjects.put(exportedUri, newObj);
							} 
//							else {
//								System.out.println(">> Object did not changed: " + EObjectPrinter.toString(oldObj)
//										+ "  --  " + EObjectPrinter.toString(newObj));
//							}

						}
					}
				}
			}

		}
	}

	private static EObject resolveIfProxy(EObject obj) {
		if (obj == null || !obj.eIsProxy())
			return obj;

		Resource resource = obj.eResource();
		if (resource == null)
			return obj; // Can't resolve

		ResourceSet rs = resource.getResourceSet();
		if (rs == null)
			return obj; // Can't resolve

		return rs.getEObject(EcoreUtil.getURI(obj), true);
	}

	private EObject resolveFromDescription(IEObjectDescription desc, ResourceSet resourceSet) {
		URI uri = desc.getEObjectURI();
		return resourceSet.getEObject(uri, true); // true = load if needed
	}

	private Set<URI> getReferencedArtifacts() {
		Set<URI> referencedUris = new HashSet<>();
		List<InfluenceModel> influenceModels = getOpenedInfluenceModels();
		System.out.println(">>> number of opened InfluenceModels: " + influenceModels.size());
		for (InfluenceModel yourModel : influenceModels) {

			TreeIterator<EObject> it = yourModel.eAllContents();
			while (it.hasNext()) {
				EObject e = it.next();
				for (EReference ref : e.eClass().getEAllReferences()) {
					if (!ref.isContainment()) {
						Object value = e.eGet(ref, false);
						if (value instanceof EObject) {
							referencedUris.add(EcoreUtil.getURI((EObject) value));
						} else if (value instanceof List) {
							for (Object o : (List<?>) value) {
								if (o instanceof EObject) {
									referencedUris.add(EcoreUtil.getURI((EObject) o));
								}
							}
						}
					}
				}
			}
		}

		return referencedUris;
	}

	private List<InfluenceModel> getOpenedInfluenceModels() {
		List<InfluenceModel> res = new ArrayList<InfluenceModel>();
		IWorkbenchWindow[] windows = workbench.getWorkbenchWindows();
		for (IWorkbenchWindow window : windows) {
			IWorkbenchPage[] pages = window.getPages();
			for (IWorkbenchPage page : pages) {
				IEditorReference[] editors = page.getEditorReferences();
				for (IEditorReference editorRef : editors) {
					IEditorInput input = null;
					try {
						input = editorRef.getEditorInput();
					} catch (PartInitException e) {
						// Auto-generated catch block
						e.printStackTrace();
					}
					if (input instanceof IFileEditorInput) {
						IEditorPart editor = editorRef.getEditor(false);
						if (editor instanceof XtextEditor) {
							IXtextDocument document = ((XtextEditor) editor).getDocument();
							EObject model = document.readOnly((IUnitOfWork<EObject, XtextResource>) resource -> {
								return resource.getContents().get(0);
							});
							if (model instanceof InfluenceModel) {
								res.add((InfluenceModel) model);
							}
						}
					}
				}
			}
		}
		return res;
	}

}
