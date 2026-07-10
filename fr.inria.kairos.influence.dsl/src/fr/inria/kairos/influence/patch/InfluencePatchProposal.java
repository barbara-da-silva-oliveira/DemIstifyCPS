package fr.inria.kairos.influence.patch;

import java.util.ArrayList;
import java.util.List;

public class InfluencePatchProposal {

    public String schemaVersion = "influence-patch-v1";
    public String status = "proposed";

    public String patchType = "functional-refinement";
    public String targetInfluence;
    public String sourceUri;

    public String reviewedBy;
    public String reviewDecision;
    public String reviewComment;

    public List<InfluencePatchChange> changes = new ArrayList<>();

    public boolean isApproved() {
        return "approved".equalsIgnoreCase(status)
            || "approved-with-edits".equalsIgnoreCase(status);
    }

    public boolean isRejected() {
        return "rejected".equalsIgnoreCase(status);
    }

    public boolean isProposed() {
        return "proposed".equalsIgnoreCase(status);
    }
}