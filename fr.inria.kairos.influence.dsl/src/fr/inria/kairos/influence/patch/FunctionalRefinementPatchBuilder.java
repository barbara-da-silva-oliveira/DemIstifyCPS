package fr.inria.kairos.influence.patch;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FunctionalRefinementPatchBuilder {
	// 1. Lire influence_feedback.json
	// 2. Lire monotonicity_table.csv
	// 3. Lire accepted_function.txt si disponible
	// 4. Lire participant_impact.csv si disponible
	// 5. Construire InfluencePatchProposal
	// 6. status = "proposed"
    public InfluencePatchProposal buildFromAnalysisFolder(Path analysisFolder) throws IOException {
        InfluencePatchProposal proposal = new InfluencePatchProposal();

        proposal.status = "proposed";
        proposal.patchType = "functional-refinement";
        proposal.sourceUri = normalizePath(analysisFolder);

        JsonObject feedback = readFeedbackIfExists(analysisFolder.resolve("influence_feedback.json"));

        String influenceName = getStringAt(feedback, "influence", "name");
        String participant = getStringAt(feedback, "influence", "participant");
        String srp = getStringAt(feedback, "influence", "srp");

        if (isBlank(influenceName)) {
            influenceName = getStringAt(feedback, "targetInfluence");
        }

        if (isBlank(influenceName)) {
            influenceName = PatchNames.defaultInfluenceName(participant, srp);
        }

        proposal.targetInfluence = influenceName;

        Path monotonicityPath = analysisFolder.resolve("monotonicity_table.csv");

        if (Files.exists(monotonicityPath)) {
            InfluencePatchChange monotonicityChange =
                buildMonotonicityChange(proposal, monotonicityPath);

            if (!monotonicityChange.rows.isEmpty()) {
                proposal.changes.add(monotonicityChange);
            }
        }

        Path acceptedFunctionPath = analysisFolder.resolve("accepted_function.txt");

        if (Files.exists(acceptedFunctionPath)) {
            InfluencePatchChange analyticChange =
                buildAnalyticExpressionChange(proposal, acceptedFunctionPath);

            if (analyticChange != null) {
                proposal.changes.add(analyticChange);
            }
        }

        Path impactPath = analysisFolder.resolve("participant_impact.csv");

        if (Files.exists(impactPath)) {
            InfluencePatchChange impactChange =
                buildParticipantImpactChange(proposal, impactPath);

            if (!impactChange.impacts.isEmpty()) {
                proposal.changes.add(impactChange);
            }
        }

        return proposal;
    }

    private InfluencePatchChange buildMonotonicityChange(
        InfluencePatchProposal proposal,
        Path monotonicityPath
    ) throws IOException {

        List<Map<String, String>> csvRows = SimpleCsv.read(monotonicityPath);

        InfluencePatchChange change = new InfluencePatchChange();
        change.changeType = "add-or-replace-function-representation";
        change.representationType = "MonotonicityTable";
        change.representationName = "MT_" + PatchNames.safeName(proposal.targetInfluence);
        change.sourceUri = normalizePath(monotonicityPath);
        change.rationale = "Generated from functional monotonicity analysis.";

        double minConfidence = 1.0;

        for (Map<String, String> csv : csvRows) {
            InfluencePatchRow row = new InfluencePatchRow();

            String x = get(csv, "x");
            String y = get(csv, "y");
            String envFactor = get(csv, "envFactor");

            row.variedParticipant = x;
            row.output = y;
            row.condition = isBlank(envFactor) ? "overall" : envFactor;

            row.xMin = parseDouble(get(csv, "x_min"));
            row.xMax = parseDouble(get(csv, "x_max"));

            row.trend = PatchNames.normalizeTrend(get(csv, "trend"));
            row.effect = get(csv, "effect");

            row.localSlope = parseDouble(get(csv, "local_slope"));
            row.r2 = parseDouble(get(csv, "r2"));
            row.nLevels = parseInteger(get(csv, "n_levels"));

            row.rowName = "row_"
                + PatchNames.safeName(x)
                + "_"
                + PatchNames.safeName(y)
                + "_"
                + PatchNames.safeName(row.condition);

            row.rationale = buildMonotonicityRationale(row);

            minConfidence = Math.min(minConfidence, PatchNames.confidenceFromR2(row.r2));

            change.rows.add(row);
        }

        change.confidence = minConfidence == 1.0 ? 0.1 : minConfidence;

        return change;
    }

    private InfluencePatchChange buildAnalyticExpressionChange(
        InfluencePatchProposal proposal,
        Path acceptedFunctionPath
    ) throws IOException {

        String expression = Files.readString(acceptedFunctionPath, StandardCharsets.UTF_8).trim();

        if (isBlank(expression)) {
            return null;
        }

        String lower = expression.toLowerCase();

        if (lower.contains("no accepted")
            || lower.contains("none")
            || lower.contains("not accepted")) {
            return null;
        }

        InfluencePatchChange change = new InfluencePatchChange();
        change.changeType = "add-or-replace-function-representation";
        change.representationType = "AnalyticExpressionFunction";
        change.representationName = "AF_" + PatchNames.safeName(proposal.targetInfluence);
        change.sourceUri = normalizePath(acceptedFunctionPath);
        change.confidence = 0.9;
        change.expression = expression;
        change.expressionLanguage = "Text";
        change.rationale = "Analytical expression accepted by the functional analysis.";

        return change;
    }

    private InfluencePatchChange buildParticipantImpactChange(
        InfluencePatchProposal proposal,
        Path impactPath
    ) throws IOException {

        List<Map<String, String>> csvRows = SimpleCsv.read(impactPath);

        InfluencePatchChange change = new InfluencePatchChange();
        change.changeType = "add-or-replace-function-representation";
        change.representationType = "ParticipantImpactFunction";
        change.representationName = "PIF_" + PatchNames.safeName(proposal.targetInfluence);
        change.sourceUri = normalizePath(impactPath);
        change.confidence = 0.7;
        change.rationale = "Generated from observed participant impact analysis.";

        for (Map<String, String> csv : csvRows) {
            InfluencePatchImpact impact = new InfluencePatchImpact();

            impact.participant = get(csv, "participant");

            Double weight = parseDouble(get(csv, "weight_sum_norm"));

            if (weight == null) {
                weight = parseDouble(get(csv, "standardized_impact"));
            }

            impact.importance = weight;
            impact.direction = PatchNames.normalizeTrend(get(csv, "trend_if_participant_increases"));
            impact.rationale = get(csv, "rationale");

            if (!isBlank(impact.participant)) {
                change.impacts.add(impact);
            }
        }

        return change;
    }

    private String buildMonotonicityRationale(InfluencePatchRow row) {
        StringBuilder sb = new StringBuilder();

        sb.append("Increasing ")
            .append(row.variedParticipant)
            .append(" shows a ")
            .append(row.trend)
            .append(" tendency on ")
            .append(row.output)
            .append(".");

        if (!isBlank(row.effect)) {
            sb.append(" This was classified as ")
                .append(row.effect)
                .append(" with respect to the SRP objective.");
        }

        if (row.localSlope != null) {
            sb.append(" The estimated local slope is ")
                .append(row.localSlope)
                .append(".");
        }

        if (row.r2 != null) {
            sb.append(" The R2 value is ")
                .append(row.r2)
                .append(".");

            if (row.r2 < 0.3) {
                sb.append(" This indicates weak explanatory evidence.");
            }
        }

        return sb.toString();
    }

    private JsonObject readFeedbackIfExists(Path path) throws IOException {
        if (!Files.exists(path)) {
            return new JsonObject();
        }

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            JsonElement element = JsonParser.parseReader(reader);

            if (element != null && element.isJsonObject()) {
                return element.getAsJsonObject();
            }

            return new JsonObject();
        }
    }

    private String getStringAt(JsonObject object, String... path) {
        if (object == null || path == null || path.length == 0) {
            return null;
        }

        JsonElement current = object;

        for (String p : path) {
            if (current == null || !current.isJsonObject()) {
                return null;
            }

            current = current.getAsJsonObject().get(p);
        }

        if (current == null || current.isJsonNull()) {
            return null;
        }

        return current.getAsString();
    }

    private static String get(Map<String, String> row, String key) {
        String value = row.get(key);

        if (value == null) {
            return "";
        }

        return value.trim();
    }

    private static Double parseDouble(String text) {
        if (isBlank(text)) {
            return null;
        }

        try {
            return Double.parseDouble(text.trim());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private static Integer parseInteger(String text) {
        if (isBlank(text)) {
            return null;
        }

        try {
            return Integer.parseInt(text.trim());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private static boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }

    private static String normalizePath(Path path) {
        return path.toString().replace("\\", "/");
    }
}