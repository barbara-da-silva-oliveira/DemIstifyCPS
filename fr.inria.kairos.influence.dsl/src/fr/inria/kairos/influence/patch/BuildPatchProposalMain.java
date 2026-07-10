package fr.inria.kairos.influence.patch;

import java.nio.file.Path;

public class BuildPatchProposalMain {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: BuildPatchProposalMain <analysis-folder>");
            System.exit(1);
        }

        Path analysisFolder = Path.of(args[0]);

        FunctionalRefinementPatchBuilder builder =
            new FunctionalRefinementPatchBuilder();

        InfluencePatchProposal proposal =
            builder.buildFromAnalysisFolder(analysisFolder);

        Path proposalPath =
            analysisFolder.resolve("model_patch_proposal.json");

        Path reviewPath =
            analysisFolder.resolve("patch_review.md");

        PatchJsonIO.writeProposal(proposalPath, proposal);

        PatchReviewMarkdownExporter exporter =
            new PatchReviewMarkdownExporter();

        exporter.export(proposal, reviewPath);

        System.out.println("Patch proposal written to: " + proposalPath);
        System.out.println("Review file written to: " + reviewPath);
    }
}