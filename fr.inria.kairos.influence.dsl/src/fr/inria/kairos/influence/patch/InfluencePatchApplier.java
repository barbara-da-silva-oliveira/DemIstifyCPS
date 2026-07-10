package fr.inria.kairos.influence.patch;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction;
import fr.inria.kairos.influence.metamodel.FunctionRepresentation;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.LanguageType;
import fr.inria.kairos.influence.metamodel.MetamodelFactory;
import fr.inria.kairos.influence.metamodel.MonotonicityRow;
import fr.inria.kairos.influence.metamodel.MonotonicityTable;
import fr.inria.kairos.influence.metamodel.NamedElement;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction;
import fr.inria.kairos.influence.metamodel.ParticipantRange;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import fr.inria.kairos.influence.metamodel.RangeValue;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import fr.inria.kairos.influence.metamodel.TrendType;

public class InfluencePatchApplier {

    private final InfluenceModelResolver resolver = new InfluenceModelResolver();

    public PatchApplicationLog applyPatch(
        Resource modelResource,
        InfluencePatchProposal proposal,
        boolean save
    ) throws IOException {

        PatchApplicationLog log = new PatchApplicationLog();

        log.targetInfluence = proposal.targetInfluence;

        if (modelResource == null) {
            log.status = "failed";
            log.error("Model resource is null.");
            return log;
        }

        if (proposal == null) {
            log.status = "failed";
            log.error("Patch proposal is null.");
            return log;
        }

        if (!proposal.isApproved()) {
            log.status = "rejected";
            log.error("Patch is not approved. Current status: " + proposal.status);
            return log;
        }

        if (modelResource.getContents().isEmpty()) {
            log.status = "failed";
            log.error("Model resource has no root object.");
            return log;
        }

        EObject root = modelResource.getContents().get(0);

        AbstractInfluence target =
            resolver.findInfluenceByName(root, proposal.targetInfluence);

        if (target == null) {
            log.status = "failed";
            log.error("Target influence not found: " + proposal.targetInfluence);
            return log;
        }

        InfluenceFunction function = getOrCreateInfluenceFunction(target, log);

        for (InfluencePatchChange change : proposal.changes) {
            applyChange(root, target, function, proposal, change, log);

            if (log.hasErrors()) {
                log.status = "failed";
                return log;
            }
        }

        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);

        boolean hasBlockingErrors = collectBlockingDiagnostics(diagnostic, log, "");

        if (hasBlockingErrors) {
            log.status = "failed";
            log.error("Model validation failed after applying patch with blocking errors.");
            return log;
        }

        
        if (save) {
            modelResource.save(Collections.emptyMap());
            log.applied("Saved patched model resource.");
        }

        log.status = "applied";

        return log;
    }

    private InfluenceFunction getOrCreateInfluenceFunction(
        AbstractInfluence influence,
        PatchApplicationLog log
    ) {
        InfluenceFunction function = influence.getOwnedInfluenceFunction();

        if (function == null) {
            function = MetamodelFactory.eINSTANCE.createInfluenceFunction();
            function.setName(influence.getName() + "_function");
            influence.setOwnedInfluenceFunction(function);

            log.applied("Created InfluenceFunction for " + influence.getName());
        }

        return function;
    }

    private boolean collectBlockingDiagnostics(
    	    Diagnostic diagnostic,
    	    PatchApplicationLog log,
    	    String indent
    	) {
    	    if (diagnostic == null) {
    	        return false;
    	    }

    	    boolean hasBlockingErrors = false;

    	    if (diagnostic.getChildren() != null && !diagnostic.getChildren().isEmpty()) {
    	        for (Diagnostic child : diagnostic.getChildren()) {
    	            hasBlockingErrors |= collectBlockingDiagnostics(child, log, indent + "  ");
    	        }
    	        return hasBlockingErrors;
    	    }

    	    if (diagnostic.getSeverity() == Diagnostic.ERROR) {
    	        if (isExpectedExternalArtifactReferenceError(diagnostic)) {
    	            log.warning(indent + "Ignored external artifact reference diagnostic: "
    	                + diagnostic.getMessage());
    	            return false;
    	        }

    	        log.error(indent + "ERROR: " + diagnostic.getMessage());
    	        return true;
    	    }

    	    if (diagnostic.getSeverity() == Diagnostic.WARNING) {
    	        log.warning(indent + "WARNING: " + diagnostic.getMessage());
    	    }

    	    return false;
    	}

    	private boolean isExpectedExternalArtifactReferenceError(Diagnostic diagnostic) {
    	    if (diagnostic == null || diagnostic.getMessage() == null) {
    	        return false;
    	    }

    	    String message = diagnostic.getMessage();

    	    return message.contains("The feature 'ref'")
    	        && message.contains("DesignArtifact")
    	        && message.contains("unresolved proxy");
    	}
    private void applyChange(
        EObject root,
        AbstractInfluence target,
        InfluenceFunction function,
        InfluencePatchProposal proposal,
        InfluencePatchChange change,
        PatchApplicationLog log
    ) {
        if ("MonotonicityTable".equals(change.representationType)) {
            applyMonotonicityTable(root, target, function, proposal, change, log);
            return;
        }

        if ("AnalyticExpressionFunction".equals(change.representationType)) {
            applyAnalyticExpression(function, proposal, change, log);
            return;
        }

        if ("ParticipantImpactFunction".equals(change.representationType)) {
            applyParticipantImpact(target, function, proposal, change, log);
            return;
        }

        log.warning("Unsupported representation type: " + change.representationType);
    }

    private void applyMonotonicityTable(
        EObject root,
        AbstractInfluence target,
        InfluenceFunction function,
        InfluencePatchProposal proposal,
        InfluencePatchChange change,
        PatchApplicationLog log
    ) {
        removeExistingRepresentation(function, change.representationName, log);

        MonotonicityTable table =
            MetamodelFactory.eINSTANCE.createMonotonicityTable();

        table.setName(change.representationName);
        table.setSourceUri(nonNull(change.sourceUri, proposal.sourceUri));
        table.setConfidence(doubleOrDefault(change.confidence, 0.1));

        for (InfluencePatchRow patchRow : change.rows) {
            MonotonicityRow row =
                MetamodelFactory.eINSTANCE.createMonotonicityRow();

            row.setName(nonNull(
                patchRow.rowName,
                "row_" + PatchNames.safeName(patchRow.variedParticipant)
                    + "_" + PatchNames.safeName(patchRow.output)
            ));

            Participant participant =
                resolver.findParticipantInInfluence(target, patchRow.variedParticipant);

            if (participant == null) {
                log.error("Participant not found in target influence: " + patchRow.variedParticipant);
                return;
            }

            SystemResponseProperty output =
                resolver.findSRPByName(root, patchRow.output);

            if (output == null) {
                log.error("Output SRP not found: " + patchRow.output);
                return;
            }

            row.setVariedParticipant(participant);
            row.setOutput(output);
            row.setTrend(toTrendType(patchRow.trend));

            if (patchRow.xMin != null && patchRow.xMax != null) {
                ParticipantRange observedRange =
                    createObservedRange(participant, patchRow);

                row.getCondition().add(observedRange);
            }

            if (patchRow.localSlope != null) {
                row.setLocalSlope(patchRow.localSlope);
            }

            if (patchRow.nLevels != null) {
                row.setNLevels(patchRow.nLevels);
            }

            if (patchRow.rationale != null) {
                row.setRationale(patchRow.rationale);
            }

            table.getTableRows().add(row);
        }

        function.getRepresentations().add(table);

        log.applied("Added MonotonicityTable: " + change.representationName);
    }

    private void applyAnalyticExpression(
        InfluenceFunction function,
        InfluencePatchProposal proposal,
        InfluencePatchChange change,
        PatchApplicationLog log
    ) {
        if (isBlank(change.expression)) {
            log.warning("Skipped empty analytic expression: " + change.representationName);
            return;
        }

        removeExistingRepresentation(function, change.representationName, log);

        AnalyticExpressionFunction analytic =
            MetamodelFactory.eINSTANCE.createAnalyticExpressionFunction();

        analytic.setName(change.representationName);
        analytic.setSourceUri(nonNull(change.sourceUri, proposal.sourceUri));
        analytic.setConfidence(doubleOrDefault(change.confidence, 0.9));

        analytic.setExpression(change.expression);

        LanguageType language = toLanguageType(change.expressionLanguage);

        if (language != null) {
            analytic.setExpressionLanguage(language);
        }

        function.getRepresentations().add(analytic);

        log.applied("Added AnalyticExpressionFunction: " + change.representationName);
    }

    private void applyParticipantImpact(
        AbstractInfluence target,
        InfluenceFunction function,
        InfluencePatchProposal proposal,
        InfluencePatchChange change,
        PatchApplicationLog log
    ) {
        removeExistingRepresentation(function, change.representationName, log);

        ParticipantImpactFunction impactFunction =
            MetamodelFactory.eINSTANCE.createParticipantImpactFunction();

        impactFunction.setName(change.representationName);
        impactFunction.setSourceUri(nonNull(change.sourceUri, proposal.sourceUri));
        impactFunction.setConfidence(doubleOrDefault(change.confidence, 0.7));

        for (InfluencePatchImpact patchImpact : change.impacts) {
            Participant participant =
                resolver.findParticipantInInfluence(target, patchImpact.participant);

            if (participant == null) {
                log.warning("Skipped impact for unknown participant: " + patchImpact.participant);
                continue;
            }

            ParticipantRelativeImpact impact =
                MetamodelFactory.eINSTANCE.createParticipantRelativeImpact();

            impact.setParticipant(participant);

            if (patchImpact.importance != null) {
                impact.setImportance(patchImpact.importance);
            }

            impact.setDirection(toTrendType(patchImpact.direction));

            if (patchImpact.rationale != null) {
                impact.setRationale(patchImpact.rationale);
            }

            impactFunction.getParticipantContribution().add(impact);
        }

        function.getRepresentations().add(impactFunction);

        log.applied("Added ParticipantImpactFunction: " + change.representationName);
    }

    private ParticipantRange createObservedRange(
        Participant participant,
        InfluencePatchRow patchRow
    ) {
        ParticipantRange range =
            MetamodelFactory.eINSTANCE.createParticipantRange();

        range.setName(
            "range_"
                + PatchNames.safeName(patchRow.variedParticipant)
                + "_"
                + PatchNames.safeName(String.valueOf(patchRow.xMin))
                + "_"
                + PatchNames.safeName(String.valueOf(patchRow.xMax))
        );

        range.setParticipant(participant);

        RangeValue value =
            MetamodelFactory.eINSTANCE.createRangeValue();

        value.setLower(patchRow.xMin);
        value.setUpper(patchRow.xMax);
        value.setInclusiveLower(true);
        value.setInclusiveUpper(true);

        range.setValue(value);

        return range;
    }

    private void removeExistingRepresentation(
        InfluenceFunction function,
        String representationName,
        PatchApplicationLog log
    ) {
        if (function == null || representationName == null) {
            return;
        }

        FunctionRepresentation existing =
            resolver.findRepresentationByName(function, representationName);

        if (existing != null) {
            function.getRepresentations().remove(existing);
            log.applied("Removed existing representation: " + representationName);
        }
    }

    private TrendType toTrendType(String trend) {
        if (trend == null) {
            return TrendType.NOT_MONOTONIC;
        }

        String normalized = trend.trim().toLowerCase();

        if ("increasing".equals(normalized)) {
            return TrendType.INCREASING;
        }

        if ("decreasing".equals(normalized)) {
            return TrendType.DECREASING;
        }

        if ("flat".equals(normalized)) {
            return TrendType.FLAT;
        }

        return TrendType.NOT_MONOTONIC;
    }

    private LanguageType toLanguageType(String language) {
        if (language == null || LanguageType.VALUES == null || LanguageType.VALUES.isEmpty()) {
            return null;
        }

        for (LanguageType value : LanguageType.VALUES) {
            if (value.getName().equalsIgnoreCase(language)
                || value.getLiteral().equalsIgnoreCase(language)) {
                return value;
            }
        }

        return LanguageType.VALUES.get(0);
    }

    
    private void collectDiagnostics(
    	    Diagnostic diagnostic,
    	    PatchApplicationLog log,
    	    String indent
    	) {
    	    if (diagnostic == null) {
    	        return;
    	    }

    	    String severity = severityName(diagnostic.getSeverity());

    	    if (diagnostic.getSeverity() == Diagnostic.ERROR) {
    	        log.error(indent + severity + ": " + diagnostic.getMessage());
    	    } else if (diagnostic.getSeverity() == Diagnostic.WARNING) {
    	        log.warning(indent + severity + ": " + diagnostic.getMessage());
    	    }

    	    for (Diagnostic child : diagnostic.getChildren()) {
    	        collectDiagnostics(child, log, indent + "  ");
    	    }
    	}

    private String severityName(int severity) {
    	    switch (severity) {
    	        case Diagnostic.ERROR:
    	            return "ERROR";
    	        case Diagnostic.WARNING:
    	            return "WARNING";
    	        case Diagnostic.INFO:
    	            return "INFO";
    	        case Diagnostic.OK:
    	            return "OK";
    	        case Diagnostic.CANCEL:
    	            return "CANCEL";
    	        default:
    	            return "UNKNOWN";
    	    }
    	}
    private boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }

    private String nonNull(String value, String fallback) {
        if (value == null || value.trim().isEmpty()) {
            return fallback;
        }

        return value;
    }

    private double doubleOrDefault(Double value, double fallback) {
        return value == null ? fallback : value;
    }
}