package fr.inria.kairos.influence.validation;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;

import fr.inria.kairos.influence.metamodel.*;


public class InfluenceDSLValidator extends AbstractInfluenceDSLValidator {
	
	private static final int MAX_SOURCE = 2;
	private static final int MAX_TARGET = 1;

	
	@Check
	public void checkParticipantPattern(Influence inf) {
		var ps = inf.getOwnedParticipants();
		boolean hasArtifact = false;
		boolean hasEnv = false;
		boolean hasInputSRP = false;
			for (Participant p: ps) {
				if (p instanceof ArtifactParticipant) {
				  hasArtifact = true;
				} else if (p instanceof EnvironmentalFactorParticipant) {
				  hasEnv = true;
				} else if (p instanceof SRPInputParticipant) {
				  hasInputSRP = true;
			  }
			}
			if (hasArtifact && (hasEnv || hasInputSRP)) {
	            return;
	        }
			if (!hasArtifact) {
				error(
		            "Invalid participants: require at least one ArtifactParticipant.",
		            inf,
		            MetamodelPackage.Literals.INFLUENCE__OWNED_PARTICIPANTS
		        );
		        return;
		    }
		  error(
		        "Invalid participants: you must also include an EnvironmentalFactorParticipant or an SRPInputParticipant.",
		        inf,
		        MetamodelPackage.Literals.INFLUENCE__OWNED_PARTICIPANTS
		    );
	  }
	  
	@Check
	public void checkSourceArtifactImpact(InfluenceModel model) {
        Map<DesignArtifact, Integer> impactCount = new HashMap<>();

        for (AbstractInfluence ai : model.getOwnedInfluences()) {
            if (ai instanceof Influence) {
                Influence inf = (Influence) ai;
                for (var p : inf.getOwnedParticipants()) {
                    if (p instanceof ArtifactParticipant) {
                        DesignArtifact da = ((ArtifactParticipant) p).getTarget();
                        if (da != null) {
                            impactCount.put(da, impactCount.getOrDefault(da, 0) + 1);
                        }
                    }
                }
            } else {
                System.err.println("warning: CompositeInfluence not handled in checkSourceArtifactImpact");
            }
        }

        for (Map.Entry<DesignArtifact, Integer> e : impactCount.entrySet()) {
            if (e.getValue() > MAX_SOURCE) {
                warning(
                    "Artifact '" + e.getKey().getName() + "' is used as input in " + e.getValue() + " influences",
                    model,
                    null,
                    -1
                );
            }
        }
	    }
	  
	@Check
	public void checkSystemResponseImpact(InfluenceModel model) {
        Map<SystemResponseProperty, Integer> impactCount = new HashMap<>();

        for (AbstractInfluence ai : model.getOwnedInfluences()) {
        	if (ai instanceof Influence) {
                Influence inf = (Influence) ai;
                for (var p : inf.getOwnedParticipants()) {
                    if (p instanceof SRPInputParticipant) {
                        SystemResponseProperty srp = ((SRPInputParticipant) p).getTarget();
                        if (srp != null) {
                            impactCount.put(srp, impactCount.getOrDefault(srp, 0) + 1);
                        }
                    }
                }
            } else {
                System.err.println("warning: CompositeInfluence not handled in checkSystemResponseImpact");
            }
        }

        for (Map.Entry<SystemResponseProperty, Integer> e : impactCount.entrySet()) {
            if (e.getValue() > MAX_TARGET) {
                warning(
                    "System Response Property '" + e.getKey().getName() + "' is used as input in " + e.getValue() + " influences",
                    e.getKey(),
                    null,
                    -1
                );
            }
        }
	    }
	  
	  
	@Check
	public void checkChangeArtifact(Influence inf) {
        // Output SRP of this influence
		  final SystemResponseProperty tgt = inf.getOutputSRP();
		  if (tgt == null) return;

        // Count how many influences consume this SRP as input (fan-out)
		  final int tgtImpact = countFanOutAcrossResourceSet(tgt);
//        if (inf.eContainer() instanceof InfluenceModel) {
//            InfluenceModel model = (InfluenceModel) inf.eContainer();
//            for (AbstractInfluence ai : model.getOwnedInfluences()) {
//                if (ai instanceof Influence) {
//                    Influence other = (Influence) ai;
//                    boolean consumes = other.getOwnedParticipants().stream()
//                        .filter(SRPInputParticipant.class::isInstance)
//                        .map(SRPInputParticipant.class::cast)
//                        .anyMatch(sp -> tgt.equals(sp.getTarget()));
//                    if (consumes) tgtImpact++;
//                } else {
//                    System.err.println("warning: CompositeInfluence not handled in checkChangeArtifact (fan-out count)");
//                }
//            }
//        } else {
//            info("checkChangeArtifact: composite influences not handled", inf,
//                 MetamodelPackage.Literals.INFLUENCE__OWNED_PARTICIPANTS);
//        }
        
//        String reqSummary = "(no linked requirements)";
//        if (tgt.getConstrainedBy() != null && !tgt.getConstrainedBy().isEmpty()) {
//            reqSummary = "linked to requirement(s): " +
//                tgt.getConstrainedBy().stream()
//                   .map(r -> r.getName() + " satisfied when " + r.getSatisfaction().toString())
//                   .collect(Collectors.joining(", "));
//        }
        Set<Requirement> direct = new LinkedHashSet<>(
				tgt.getConstrainedBy() == null ? Set.<Requirement>of() : tgt.getConstrainedBy()
	        	);
        Set<Requirement> indirect = new LinkedHashSet<>(collectIndirectRequirements(tgt));
		indirect.removeAll(direct);
		String reqSummary;
		if (!direct.isEmpty() || !indirect.isEmpty()) {
			String d = direct.isEmpty() ? "" :
	        	"directly linked to requirement(s): " + direct.stream()
	        		.map(r -> r.getName() + " satisfied when " + r.getSatisfaction())
	        	    .collect(Collectors.joining(", "));
	        String i = indirect.isEmpty() ? "" :
	        	 "indirectly linked to: " + indirect.stream()
	        	 	.map(r -> r.getName() + " satisfied when " + r.getSatisfaction())
	        	    .collect(Collectors.joining(", "));
	        	    reqSummary = (d + (d.isEmpty() || i.isEmpty() ? "" : "; ") + i);
			} else {
	        	    reqSummary = "(no direct or indirect linked requirements)";
	        	}
	        
	        // For every ArtifactParticipant in this influence, add info on both the influence and the artifact's ref
			for (var p : inf.getOwnedParticipants()) {
	            if (p instanceof ArtifactParticipant) {
	            	DesignArtifact src = ((ArtifactParticipant) p).getTarget();
	                if (src == null) continue;
	
	                String msg = "If you modify artifact '" + src.getName() + "', you will affect SRP '" + tgt.getName() +
	                        "', which is used as input in " + tgtImpact + " other influence(s); " + reqSummary;
	
	
	                info(
	//                    "If you modify artifact '" + src.getName() + "', you will affect SRP '" + tgt.getName() +
	//                    "', which is used as input in " + tgtImpact + " other influence(s); " + reqSummary,
	                	msg,
	                    inf,
	                    MetamodelPackage.Literals.INFLUENCE__OWNED_PARTICIPANTS
	                );
	
	                // Also create an Eclipse marker on the external referenced element (if resolvable)
	                IResource resource = getIResource(src.getRef());
	                if (resource != null) {
	                    try {
	                        upsertExternalMarker(
	                            resource,
	                            inf.getName(),
	                            src.getName(),
	                            msg, // same message => consistent numbers & wording
	                            getLineNumber(src.getRef())
	                        );
	                    } catch (CoreException e) {
	                        e.printStackTrace();
	                    }

//                if (resource != null) {
//                    try {
//                        resource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
//                        IMarker marker = resource.createMarker(IMarker.PROBLEM);
//                        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
//                        marker.setAttribute(
//                            IMarker.MESSAGE,
//                            "Changing artifact '" + src.getName() + "' affects SRP '" + tgt.getName() +
//                            "', which is used as input in " + tgtImpact + " influence(s); " + reqSummary
//                        );
//                        marker.setAttribute(IMarker.LINE_NUMBER, getLineNumber(src.getRef()));
//                    } catch (CoreException e) {
//                        e.printStackTrace();
//                    }
//                }
            }
           } 
        }
    }

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
	  
	private int countFanOutAcrossResourceSet(SystemResponseProperty tgt) {
		if (tgt == null || tgt.eResource() == null || tgt.eResource().getResourceSet() == null) return 0;
		int count = 0;
		var rs = tgt.eResource().getResourceSet();

		for (var r : rs.getResources()) {
			var it = r.getAllContents();
		  	while (it.hasNext()) {
		  		var obj = it.next();
		  		if (obj instanceof InfluenceModel) {
		  			InfluenceModel m = (InfluenceModel) obj;
		  			for (AbstractInfluence ai : m.getOwnedInfluences()) {
		  				if (ai instanceof Influence) {
		  					Influence other = (Influence) ai;
		  					boolean consumes = other.getOwnedParticipants().stream()
		  							.filter(SRPInputParticipant.class::isInstance)
		                            .map(SRPInputParticipant.class::cast)
		                            .anyMatch(sp -> tgt.equals(sp.getTarget()));
		  					if (consumes) count++;
		                    }
		                }
		            }
		        }
		    }
		    return count;
		}
	  
	private static final String ATTR_INFLUENCE = "kairos.influence.name";
	  private static final String ATTR_ARTIFACT  = "kairos.influence.artifact";
	  private static final String ATTR_KIND      = "kairos.influence.kind"; // e.g., "change-impact"

	  private IMarker upsertExternalMarker(
	      IResource resource,
	      String influenceName,
	      String artifactName,
	      String message,
	      int lineNumber
	  ) throws CoreException {
	      IMarker existing = null;
	      for (IMarker m : resource.findMarkers(IMarker.PROBLEM, false, IResource.DEPTH_ZERO)) {
	          if (influenceName.equals(m.getAttribute(ATTR_INFLUENCE, null)) &&
	              artifactName.equals(m.getAttribute(ATTR_ARTIFACT,  null))   &&
	              "change-impact".equals(m.getAttribute(ATTR_KIND,    null))) {
	              existing = m;
	              break;
	          }
	      }
	      IMarker marker = (existing != null) ? existing : resource.createMarker(IMarker.PROBLEM);
	      marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
	      marker.setAttribute(ATTR_INFLUENCE, influenceName);
	      marker.setAttribute(ATTR_ARTIFACT,  artifactName);
	      marker.setAttribute(ATTR_KIND,      "change-impact");
	      marker.setAttribute(IMarker.MESSAGE, message);
	      if (lineNumber > 0) marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
	      return marker;
	  }
	  
	private Set<Requirement> collectIndirectRequirements(SystemResponseProperty start) {
		var rs = (start != null && start.eResource() != null) ? start.eResource().getResourceSet() : null;
		if (rs == null) return Set.of();

		    // Build indices: SRP -> consuming influences, Influence -> output SRP
		Map<SystemResponseProperty, Set<Influence>> consumers = new HashMap<>();
		Map<Influence, SystemResponseProperty> outSRP = new HashMap<>();

		for (var r : rs.getResources()) {
			var it = r.getAllContents();
		    while (it.hasNext()) {
		    	var obj = it.next();
		    	if (obj instanceof InfluenceModel) {
		    		InfluenceModel m = (InfluenceModel) obj;
		    		for (AbstractInfluence ai : m.getOwnedInfluences()) {
		    			if (ai instanceof Influence) {
		    				Influence inf = (Influence) ai;
		    				outSRP.put(inf, inf.getOutputSRP());
		    				for (Participant p : inf.getOwnedParticipants()) {
		    					if (p instanceof SRPInputParticipant) {
		    						var s = ((SRPInputParticipant) p).getTarget();
		    						if (s != null) {
		    							consumers.computeIfAbsent(s, k -> new LinkedHashSet<>()).add(inf);
		                                }
		                            }
		                        }
		                    }
		                }
		            }
		        }
		    }

		    // BFS over SRPs following SRP -> (consuming influences) -> output SRP
		Set<SystemResponseProperty> visited = new LinkedHashSet<>();
		Set<Requirement> reqs = new LinkedHashSet<>();
		ArrayDeque<SystemResponseProperty> q = new ArrayDeque<>();
		if (start != null) {
			visited.add(start);
			q.add(start);
		    }
		while (!q.isEmpty()) {
			var s = q.removeFirst();
		    if (s.getConstrainedBy() != null) reqs.addAll(s.getConstrainedBy());
		    for (Influence inf : consumers.getOrDefault(s, Set.of())) {
		    	var next = outSRP.get(inf);
		        if (next != null && visited.add(next)) {
		        	q.add(next);
		        }
		    }
		 }
		    return reqs;
		    }

    

}