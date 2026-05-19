package fr.inria.kairos.influence.generator;

import fr.inria.kairos.influence.analysis.CandidateCompensatorAnalyzer;
import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.analysis.GraphCycleAnalyzer;
import fr.inria.kairos.influence.analysis.ImpactMetrics;
import fr.inria.kairos.influence.export.AnalyticRequirementImpactExporter;
import fr.inria.kairos.influence.export.DotExporter;
import fr.inria.kairos.influence.export.InfluenceArtifactOriginExporter;
import fr.inria.kairos.influence.export.InfluenceReportExporter;
import fr.inria.kairos.influence.export.JsonExporter;
import fr.inria.kairos.influence.export.MetricsReportExporter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;

@SuppressWarnings("all")
public class InfluenceGenerationPipeline {
  public void generate(final Resource resource, final IFileSystemAccess2 fsa) {
    final GraphBuilder.Result graphBundle = new GraphBuilder().build(resource);
    this.exportGraphs(graphBundle, fsa);
    this.exportJson(resource, fsa);
    this.exportMetrics(resource, graphBundle, fsa);
    this.exportArtifactOrigins(resource, fsa);
    this.exportInfluenceKnowledge(resource, fsa);
    this.exportAnalyticRequirementImpact(resource, fsa);
    this.runGraphDiagnostics(graphBundle);
  }

  private void exportGraphs(final GraphBuilder.Result graphBundle, final IFileSystemAccess2 fsa) {
    new DotExporter().exportGraphToDot(
      graphBundle.graph, 
      graphBundle.vertexLabels, 
      graphBundle.edgeLabels, fsa, 
      "graph/influenceHypergraph.dot");
    new DotExporter().exportGraphToDot(
      graphBundle.graph, 
      graphBundle.vertexLabels, 
      graphBundle.edgeLabels, 
      graphBundle.nodeToOrigin, 
      graphBundle.nodeSourceModel, 
      graphBundle.edgeToOrigin, 
      graphBundle.edgeWeights, fsa, 
      "graph/influenceHypergraph_origin.dot");
  }

  private void exportJson(final Resource resource, final IFileSystemAccess2 fsa) {
    new JsonExporter().exportInfluences(resource, fsa);
  }

  private void exportMetrics(final Resource resource, final GraphBuilder.Result graphBundle, final IFileSystemAccess2 fsa) {
    final ImpactMetrics.Result metrics = new ImpactMetrics().compute(resource, graphBundle);
    final CandidateCompensatorAnalyzer.Result candidateCompensators = new CandidateCompensatorAnalyzer().analyze(graphBundle);
    new MetricsReportExporter().export(metrics, candidateCompensators, fsa, 
      "file/info.txt");
  }

  private void exportArtifactOrigins(final Resource resource, final IFileSystemAccess2 fsa) {
    new InfluenceArtifactOriginExporter().exportCSV(resource, fsa, "tables/influence_artifact_origins.csv");
  }

  private void exportInfluenceKnowledge(final Resource resource, final IFileSystemAccess2 fsa) {
    new InfluenceReportExporter().export(resource, fsa, "eval/influence_knowledge.txt");
  }

  private void exportAnalyticRequirementImpact(final Resource resource, final IFileSystemAccess2 fsa) {
    new AnalyticRequirementImpactExporter().export(resource, fsa, "eval/analytic_requirement_impact.txt");
  }

  private void runGraphDiagnostics(final GraphBuilder.Result graphBundle) {
    new GraphCycleAnalyzer().detectCycle(graphBundle.graph);
  }
}
