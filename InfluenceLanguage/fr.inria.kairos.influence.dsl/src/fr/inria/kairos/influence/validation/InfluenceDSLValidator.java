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
            			"If you modify artifact '" + src.getName() + "', you will affect '" + tgt.getName() + " which itself has impact "+ tgtImpact, inf, 
                        MetamodelPackage.Literals.INFLUENCE__ORIGINATOR_ARTIFACT
                    );
            	
            	info(
            			"If you modify artifact '" + src.getName() + "', you will affect '" + tgt.getName() + " which itself has impact "+ tgtImpact,
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

}