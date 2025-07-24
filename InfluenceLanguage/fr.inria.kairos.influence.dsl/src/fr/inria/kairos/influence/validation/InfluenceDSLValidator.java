package fr.inria.kairos.influence.validation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.validation.Check;

import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.SystemResponse;

public class InfluenceDSLValidator extends AbstractInfluenceDSLValidator {

    private static final int MAX_SOURCE= 2;
    private static final int MAX_TARGET = 1;

    @Check
    public void checkSourceArtifactImpact(InfluenceModel model) {
        Map<DesignArtifact, Integer> impactCount = new HashMap<>();

        for (Influence inf : model.getOwnedInfluences()) {
            for (DesignArtifact src : inf.getOriginatorArtifact()) {
                impactCount.put(src, impactCount.getOrDefault(src, 0) + 1);
            }
        }

        for (Map.Entry<DesignArtifact, Integer> entry : impactCount.entrySet()) {
            if (entry.getValue() > MAX_SOURCE) {
                warning(
                		"Artifact '" + entry.getKey() + "' is the source of " + entry.getValue() + " influences",
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

        for (Influence inf : model.getOwnedInfluences()) {
            for (SystemResponse tgt : inf.getOriginatorSystemResponse()) {
                impactCount.put(tgt, impactCount.getOrDefault(tgt, 0) + 1);
            }
        }

        for (Map.Entry<SystemResponse, Integer> entry : impactCount.entrySet()) {
            if (entry.getValue() > MAX_TARGET) {
                warning(
                		"System Response '" + entry.getKey() + "' is the originator of " + entry.getValue() + " influences",
                		model,
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
    
    @Check
    public void checkChangeArtifact(Influence inf) {
        for (DesignArtifact src : inf.getOriginatorArtifact()) {
            for (SystemResponse tgt : inf.getAffects()) {
            	
            	Integer tgtImpact = 0;
            	if (inf.eContainer() instanceof InfluenceModel) {
	            	for (Influence inf2 : ((InfluenceModel)inf.eContainer()).getOwnedInfluences()) {
	                    if (inf2.getOriginatorSystemResponse().contains(tgt)) {    
	                    	tgtImpact++;
	                    }
	                }
            	}else {
            		info(
                			"checkChangeArtifact should be adapted tohandle Composite influence" , inf, 
                            MetamodelPackage.Literals.INFLUENCE__ORIGINATOR_ARTIFACT
                        );
            	}
            	
            	info(
            			"If you modify artifact '" + src + "', you will affect '" + tgt+ "which intself has impact "+ tgtImpact, inf, 
                        MetamodelPackage.Literals.INFLUENCE__ORIGINATOR_ARTIFACT
                    );

            }
        }
    }

}