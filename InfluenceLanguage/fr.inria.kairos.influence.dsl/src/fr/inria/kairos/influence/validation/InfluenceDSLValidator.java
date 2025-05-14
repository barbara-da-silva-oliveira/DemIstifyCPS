package fr.inria.kairos.influence.validation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.validation.Check;

import fr.inria.kairos.influence.metamodel.Artifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;

public class InfluenceDSLValidator extends AbstractInfluenceDSLValidator {

    private static final int MAX_SOURCE= 2;
    private static final int MAX_TARGET = 1;

    @Check
    public void checkSourceArtifactImpact(InfluenceModel model) {
        Map<Artifact, Integer> impactCount = new HashMap<>();

        for (Influence inf : model.getOwnedInfluences()) {
            for (Artifact src : inf.getSourceArtifact()) {
                impactCount.put(src, impactCount.getOrDefault(src, 0) + 1);
            }
        }

        for (Map.Entry<Artifact, Integer> entry : impactCount.entrySet()) {
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
    public void checkTargetArtifactImpact(InfluenceModel model) {
        Map<Artifact, Integer> impactCount = new HashMap<>();

        for (Influence inf : model.getOwnedInfluences()) {
            for (Artifact tgt : inf.getTargetArtifact()) {
                impactCount.put(tgt, impactCount.getOrDefault(tgt, 0) + 1);
            }
        }

        for (Map.Entry<Artifact, Integer> entry : impactCount.entrySet()) {
            if (entry.getValue() > MAX_TARGET) {
                warning(
                		"Artifact '" + entry.getKey() + "' is the target of " + entry.getValue() + " influences",
                		model,
                		null,
                		-1
                		);
            }
        }
    }
    
    @Check
    public void checkRedundantInfluence(Influence inf) {
        for (Artifact src : inf.getSourceArtifact()) {
            for (Artifact tgt : inf.getTargetArtifact()) {
                if (src.equals(tgt)) {
                    warning("Source and target artifact are the same: '" + src + "'.", 
                            inf, 
                            MetamodelPackage.Literals.INFLUENCE__SOURCE_ARTIFACT);
                }
            }
        }
    }
    
    @Check
    public void checkChangeArtifact(Influence inf) {
        for (Artifact src : inf.getSourceArtifact()) {
            for (Artifact tgt : inf.getTargetArtifact()) {
            	info(
            			"If you modify artifact '" + src + "', you need to contact with the developer responsible for '" + tgt , inf, 
                        MetamodelPackage.Literals.INFLUENCE__SOURCE_ARTIFACT
                    );

            }
        }
    }

}