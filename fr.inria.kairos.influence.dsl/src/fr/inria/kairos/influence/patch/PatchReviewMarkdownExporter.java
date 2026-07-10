package fr.inria.kairos.influence.patch;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class PatchReviewMarkdownExporter {

    public void export(InfluencePatchProposal proposal, Path outputPath) throws IOException {
        Path parent = outputPath.getParent();

        if (parent != null && !Files.exists(parent)) {
            Files.createDirectories(parent);
        }

        Files.writeString(outputPath, toMarkdown(proposal), StandardCharsets.UTF_8);
    }

    public String toMarkdown(InfluencePatchProposal proposal) {
        StringBuilder sb = new StringBuilder();

        sb.append("# Patch review proposal\n\n");

        sb.append("## Target influence\n\n");
        sb.append("- **Influence:** `").append(safe(proposal.targetInfluence)).append("`\n");
        sb.append("- **Patch type:** `").append(safe(proposal.patchType)).append("`\n");
        sb.append("- **Status:** `").append(safe(proposal.status)).append("`\n");
        sb.append("- **Schema version:** `").append(safe(proposal.schemaVersion)).append("`\n");
        sb.append("- **Evidence source:** `").append(safe(proposal.sourceUri)).append("`\n\n");

        sb.append("## Developer decision\n\n");
        sb.append("- [ ] Accept\n");
        sb.append("- [ ] Accept with edits\n");
        sb.append("- [ ] Reject\n\n");
        sb.append("**Reviewed by:**  \n");
        sb.append("**Review comment:**  \n\n");

        sb.append("## Proposed changes\n\n");

        if (proposal.changes == null || proposal.changes.isEmpty()) {
            sb.append("No proposed change found.\n");
            return sb.toString();
        }

        for (InfluencePatchChange change : proposal.changes) {
            appendChange(sb, change);
        }

        sb.append("\n## Review note\n\n");
        sb.append("This patch is only a proposal. It should be applied to the `.inf` model only after developer approval.\n");

        return sb.toString();
    }

    private void appendChange(StringBuilder sb, InfluencePatchChange change) {
        sb.append("### Change: `").append(safe(change.representationName)).append("`\n\n");

        sb.append("- **Change type:** `").append(safe(change.changeType)).append("`\n");
        sb.append("- **Representation type:** `").append(safe(change.representationType)).append("`\n");
        sb.append("- **Representation name:** `").append(safe(change.representationName)).append("`\n");
        sb.append("- **Confidence:** `").append(format(change.confidence)).append("`\n\n");

        if (!isBlank(change.rationale)) {
            sb.append("**Rationale:**  \n");
            sb.append(change.rationale).append("\n\n");
        }

        if (!isBlank(change.expression)) {
            sb.append("#### Analytical expression\n\n");
            sb.append("- **Language:** `").append(safe(change.expressionLanguage)).append("`\n\n");
            sb.append("```text\n");
            sb.append(change.expression).append("\n");
            sb.append("```\n\n");
        }

        if (change.rows != null && !change.rows.isEmpty()) {
            sb.append("#### Monotonicity rows\n\n");
            sb.append("| Row | Participant | Output SRP | Condition | Range | Trend | Effect | Local slope | R2 | Levels |\n");
            sb.append("|---|---|---|---|---|---|---|---:|---:|---:|\n");

            for (InfluencePatchRow row : change.rows) {
                sb.append("| `").append(safe(row.rowName)).append("` ");
                sb.append("| `").append(safe(row.variedParticipant)).append("` ");
                sb.append("| `").append(safe(row.output)).append("` ");
                sb.append("| `").append(safe(row.condition)).append("` ");
                sb.append("| [`").append(format(row.xMin)).append("`, `").append(format(row.xMax)).append("`] ");
                sb.append("| `").append(safe(row.trend)).append("` ");
                sb.append("| `").append(safe(row.effect)).append("` ");
                sb.append("| ").append(format(row.localSlope)).append(" ");
                sb.append("| ").append(format(row.r2)).append(" ");
                sb.append("| ").append(row.nLevels == null ? "-" : row.nLevels).append(" |\n");
            }

            sb.append("\n");

            for (InfluencePatchRow row : change.rows) {
                if (!isBlank(row.rationale)) {
                    sb.append("**Rationale for `").append(safe(row.rowName)).append("`:**  \n");
                    sb.append(row.rationale).append("\n\n");
                }
            }
        }

        if (change.impacts != null && !change.impacts.isEmpty()) {
            sb.append("#### Participant impacts\n\n");
            sb.append("| Participant | Importance | Direction | Rationale |\n");
            sb.append("|---|---:|---|---|\n");

            for (InfluencePatchImpact impact : change.impacts) {
                sb.append("| `").append(safe(impact.participant)).append("` ");
                sb.append("| ").append(format(impact.importance)).append(" ");
                sb.append("| `").append(safe(impact.direction)).append("` ");
                sb.append("| ").append(safe(impact.rationale)).append(" |\n");
            }

            sb.append("\n");
        }
    }

    private String safe(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "-";
        }

        return value;
    }

    private String format(Double value) {
        if (value == null) {
            return "-";
        }

        if (Double.isNaN(value)) {
            return "NaN";
        }

        if (Double.isInfinite(value)) {
            return value.toString();
        }

        return String.format(java.util.Locale.US, "%.6g", value);
    }

    private boolean isBlank(String text) {
        return text == null || text.trim().isEmpty();
    }
}