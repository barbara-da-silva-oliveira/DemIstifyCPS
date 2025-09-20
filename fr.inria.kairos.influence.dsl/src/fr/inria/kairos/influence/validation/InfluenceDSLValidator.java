package fr.inria.kairos.influence.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponse;

public class InfluenceDSLValidator extends AbstractInfluenceDSLValidator {

    private static final int MAX_SOURCE= 2;
    private static final int MAX_TARGET = 1;

    @Check
    public void checkSourceArtifactImpact(InfluenceModel model) {
        Map<DesignArtifact, Integer> impactCount = new HashMap<>();

        for (AbstractInfluence inf : model.getOwnedInfluences()) {
        	if (inf instanceof Influence) {
        		for (DesignArtifact src : ((Influence) inf).getOriginatorArtifact()) {
        			impactCount.put(src, impactCount.getOrDefault(src, 0) + 1);
        		}
        	}else {
            	System.err.println("warning: Composite Influences in /fr.inria.kairos.influence.dsl/src/fr/inria/kairos/influence/validation/InfluenceDSLValidator.java is not handled");
            }
            
        }

        for (Map.Entry<DesignArtifact, Integer> entry : impactCount.entrySet()) {
            if (entry.getValue() > MAX_SOURCE) {
                warning(
                		"Artifact '" + entry.getKey().getName() + "' is the source of " + entry.getValue() + " influences",
                		model,
                		null,
                		-1
                		);
            }
        }
    }
    
    
    @Check
    public void checkSystemResponseImpact(InfluenceModel model) {
        Map<SystemResponse, Integer> impactCount = new HashMap<>();

        for (AbstractInfluence inf : model.getOwnedInfluences()) {
        	if (inf instanceof Influence) {
        		for (SystemResponse tgt : ((Influence) inf).getOriginatorSystemResponse()) {
        			impactCount.put(tgt, impactCount.getOrDefault(tgt, 0) + 1);
        		}
        	}else {
            	System.err.println("warning: Composite Influences in /fr.inria.kairos.influence.dsl/src/fr/inria/kairos/influence/validation/InfluenceDSLValidator.java is not handled");
            }
            
        }

        for (Map.Entry<SystemResponse, Integer> entry : impactCount.entrySet()) {
            if (entry.getValue() > MAX_TARGET) {
                warning(
                		"System Response '" + entry.getKey().getName() + "' is the originator of " + entry.getValue() + " influences",
                		entry.getKey(),
                		null,
                		-1
                		);
            }
        }
    }
    
//    @Check
//    public void checkRedundantInfluence(Influence inf) {
//        for (Artifact src : inf.getSourceArtifact()) {
//            for (Artifact tgt : inf.getTargetArtifact()) {
//                if (src.equals(tgt)) {
//                    warning("Source and target artifact are the same: '" + src + "'.", 
//                            inf, 
//                            MetamodelPackage.Literals.INFLUENCE__SOURCE_ARTIFACT);
//                }
//            }
//        }
//    }
    
    
    private IResource getIResource(EObject eObject) {
        if (eObject == null || eObject.eResource() == null) {
            return null;
        }
        URI emfUri = eObject.eResource().getURI();
        // Only works for platform:/resource URIs (workspace files)
        if (emfUri.isPlatformResource()) {
            String platformString = emfUri.toPlatformString(true);
            return ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
        }
        return null;
    }
    
    private int getLineNumber(EObject eObject) {
        INode node = NodeModelUtils.findActualNodeFor(eObject);
        if (node != null) {
            return node.getStartLine(); // 1-based line number
        }
        return -1; // Unknown
    }

    
    @Check
    public void checkChangeArtifact(Influence inf) {
        for (DesignArtifact src : inf.getOriginatorArtifact()) {
            for (SystemResponse tgt : inf.getAffects()) {
            	
            	Integer tgtImpact = 0;
            	if (inf.eContainer() instanceof InfluenceModel) {
	            	for (AbstractInfluence inf2 : ((InfluenceModel)inf.eContainer()).getOwnedInfluences()) {
	                    if (inf2 instanceof Influence) {
		            		if (((Influence) inf2).getOriginatorSystemResponse().contains(tgt)) {    
		                    	tgtImpact++;
		                    }
	                    }else {
	                    	System.err.println("warning: Composite Influences in /fr.inria.kairos.influence.dsl/src/fr/inria/kairos/influence/validation/InfluenceDSLValidator.java is not handled");
	                    }
	                }
            	}else {
            		info(
                			"checkChangeArtifact should be adapted tohandle Composite influence" , inf, 
                            MetamodelPackage.Literals.INFLUENCE__ORIGINATOR_ARTIFACT
                        );
            	}
            	
            	info(
            			"If you modify artifact '" + src.getName() + "', you will affect '" + tgt.getName() + " which itself originates "+ tgtImpact, inf, 
                        MetamodelPackage.Literals.INFLUENCE__ORIGINATOR_ARTIFACT
                    );
            	
            	info(
            			"If you modify artifact '" + src.getName() + "', you will affect '" + tgt.getName() + " which itself originates "+ tgtImpact,
            			src, 
            			MetamodelPackage.Literals.DESIGN_ARTIFACT__REF
                    );
            	IResource resource = getIResource(src.getRef()); // Get the Eclipse IResource for the imported EObject
            	IMarker marker;
				try {
					resource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
					marker = resource.createMarker(IMarker.PROBLEM);
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
					marker.setAttribute(IMarker.MESSAGE, "If you modify this artifact (" + src.getName() + 
	            										 "), you will affect '" + tgt.getName() + ", a system response which "+
	            										 (tgt.getUsedIn().size()==0?("itself has impact "+ tgtImpact):"") + 
	            										 (tgt.getUsedIn().size()>0?("is linked to requirement "+tgt.getUsedIn().stream().map(r -> r.getName()+" statified when "+r.getSatisfaction().toString()).collect(Collectors.joining(", "))):""));
	            	marker.setAttribute(IMarker.LINE_NUMBER, getLineNumber(src.getRef()));
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
            	

            }
        }
    }
    
    
    @Check
    public void checkPhenomena(Influence inf) {
        for (PhysicalPhenomena src : inf.getOriginatorPhenomena()) {
            for (SystemResponse tgt : inf.getAffects()) {
            	
            	Integer tgtImpact = 0;
            	if (inf.eContainer() instanceof InfluenceModel) {
	            	for (AbstractInfluence inf2 : ((InfluenceModel)inf.eContainer()).getOwnedInfluences()) {
	                    if (inf2 instanceof Influence) {
		            		if (((Influence) inf2).getOriginatorSystemResponse().contains(tgt)) {    
		                    	tgtImpact++;
		                    }
	                    }else {
	                    	System.err.println("warning: Composite Influences in /fr.inria.kairos.influence.dsl/src/fr/inria/kairos/influence/validation/InfluenceDSLValidator.java is not handled");
	                    }
	                }
            	}else {
            		info(
                			"checkChangePhenomena should be adapted tohandle Composite influence" , inf, 
                            MetamodelPackage.Literals.INFLUENCE__ORIGINATOR_PHENOMENA
                        );
            	}
            	
            	info(
            			"Phenomena '" + src.getName() + "', affects '" + tgt.getName() + " which itself originates "+ tgtImpact, inf, 
                        MetamodelPackage.Literals.INFLUENCE__ORIGINATOR_PHENOMENA
                    );
            	
            	info(
            			"Phenomena '" + src.getName() + "',  affects '" + tgt.getName() + " which itself originates "+ tgtImpact,
            			src, 
            			MetamodelPackage.Literals.PHYSICAL_PHENOMENA__DESCRIPTION
                    );
            	
            	

            }
        }
    }
    
   
    
    @Check
    public void checkRequirementSensibility(Requirement req) {
        int reqSens = 0;
        java.util.Set<String> srNames = new java.util.LinkedHashSet<>();
        InfluenceModel model = org.eclipse.xtext.EcoreUtil2.getContainerOfType(req, InfluenceModel.class);
        if (model != null) {
            for (AbstractInfluence inf2 : model.getOwnedInfluences()) {
                if (inf2 instanceof Influence) {
                    for (SystemResponse sr : ((Influence) inf2).getAffects()) {
                        if (sr.getUsedIn() != null && sr.getUsedIn().contains(req)) { 
                        	reqSens++;
                        	String n = sr.getName();
                        	srNames.add(n);
                        }
                    }

                    
                }
                
            }
        }
        String list = srNames.isEmpty() ? "" : " via: " + String.join(", ", srNames);
        info("Requirement affected by " + reqSens + " system response(s): " + list + "." ,
                req, 
                MetamodelPackage.Literals.NAMED_ELEMENT__NAME,
                -1);
        
    }
    
    
}
            	
//            	
//            	EObject ref = src.getRef();
//            	IResource resource = (ref != null) ? getIResource(ref) : null;
//
//            	if (resource == null) {
//            	    // Fallback: attach to the current .inf file so we still show something
//            	    EObject current = getCurrentObject();
//            	    if (current != null && current.eResource() != null && current.eResource().getURI().isPlatformResource()) {
//            	        String platform = current.eResource().getURI().toPlatformString(true);
//            	        resource = ResourcesPlugin.getWorkspace().getRoot().findMember(platform);
//            	    }
//            	}
//
//            	if (resource != null) {
//            	    try {
//            	        resource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
//            	        IMarker marker = resource.createMarker(IMarker.PROBLEM);
//            	        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
//            	        marker.setAttribute(
//            	            IMarker.MESSAGE,
//            	            "If you modify this artifact (" + src.getName()
//            	            + "), you will affect '" + tgt.getName()
//            	            + ", a system response which "
//            	            + (tgt.getUsedIn().isEmpty() ? ("itself has impact " + tgtImpact) : "")
//            	            + (!tgt.getUsedIn().isEmpty()
//            	                ? ("is linked to requirement "
//            	                    + tgt.getUsedIn().stream()
//            	                        .map(r -> r.getName() + " statified when " + r.getSatisfaction())
//            	                        .collect(Collectors.joining(", ")))
//            	                : "")
//            	        );
//            	        int line = (ref != null) ? getLineNumber(ref) : -1;
//            	        marker.setAttribute(IMarker.LINE_NUMBER, (line > 0) ? line : 1);
//            	    } catch (CoreException e) {
//            	        e.printStackTrace();
//            	    }
//            	}


//            }
//        }
//    }
    
    
//    @Override
//    protected void checkIsFromCurrentlyCheckedResource(EObject eObject) throws IllegalArgumentException {
//        // NO-OP: do not enforce that the target object belongs to the current resource.
//    }
//    
//    @Override
//    public void warning(String message, EObject object, EStructuralFeature feature, int index) {
//        super.warning(message, redirectIfExternal(object, feature), feature, index);
//    }
//
//    @Override
//    public void warning(String message, EObject object, EStructuralFeature feature) {
//        super.warning(message, redirectIfExternal(object, feature), feature);
//    }
//
//    @Override
//    public void info(String message, EObject object, EStructuralFeature feature, int index) {
//        super.info(message, redirectIfExternal(object, feature), feature, index);
//    }
//
//    @Override
//    public void info(String message, EObject object, EStructuralFeature feature) {
//        super.info(message, redirectIfExternal(object, feature), feature);
//    }
//    
//    private EObject redirectIfExternal(EObject object, EStructuralFeature feature) {
//        // If caller anchored to a specific feature, don't redirect (feature must belong to that object's EClass)
//        if (feature != null) return object;
//
//        final EObject current = getCurrentObject();
//        if (current == null || current.eResource() == null) return object;
//
//        if (object == null || object.eResource() == null || object.eResource() != current.eResource()) {
//            // Redirect to the currently validated element so the marker attaches to this file
//            return current;
//        }
//        return object;
//    }
    

    

//}