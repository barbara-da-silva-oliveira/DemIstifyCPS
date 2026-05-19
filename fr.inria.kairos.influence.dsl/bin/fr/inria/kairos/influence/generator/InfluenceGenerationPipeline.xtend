package fr.inria.kairos.influence.generator

import fr.inria.kairos.influence.analysis.CandidateCompensatorAnalyzer
import fr.inria.kairos.influence.analysis.GraphBuilder
import fr.inria.kairos.influence.analysis.GraphCycleAnalyzer
import fr.inria.kairos.influence.analysis.ImpactMetrics
import fr.inria.kairos.influence.export.AnalyticRequirementImpactExporter
import fr.inria.kairos.influence.export.DotExporter
import fr.inria.kairos.influence.export.InfluenceArtifactOriginExporter
import fr.inria.kairos.influence.export.InfluenceReportExporter
import fr.inria.kairos.influence.export.JsonExporter
import fr.inria.kairos.influence.export.MetricsReportExporter
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import fr.inria.kairos.influence.export.DashboardDataExporter
import fr.inria.kairos.influence.export.GentelellaDashboardExporter

class InfluenceGenerationPipeline {

	def void generate(Resource resource, IFileSystemAccess2 fsa) {
		val graphBundle = new GraphBuilder().build(resource)

		exportGraphs(graphBundle, fsa)
		exportJson(resource, fsa)
		exportMetrics(resource, graphBundle, fsa)
		exportArtifactOrigins(resource, fsa)
		exportInfluenceKnowledge(resource, fsa)
		exportAnalyticRequirementImpact(resource, fsa)
		runGraphDiagnostics(graphBundle)
		exportDashboard(resource, graphBundle, fsa)
	}

	private def void exportGraphs(GraphBuilder.Result graphBundle, IFileSystemAccess2 fsa) {
		new DotExporter().exportGraphToDot(
			graphBundle.graph,
			graphBundle.vertexLabels,
			graphBundle.edgeLabels,
			fsa,
			"graph/influenceHypergraph.dot"
		)

		new DotExporter().exportGraphToDot(
			graphBundle.graph,
			graphBundle.vertexLabels,
			graphBundle.edgeLabels,
			graphBundle.nodeToOrigin,
			graphBundle.nodeSourceModel,
			graphBundle.edgeToOrigin,
			graphBundle.edgeWeights,
			fsa,
			"graph/influenceHypergraph_origin.dot"
		)
	}

	private def void exportJson(Resource resource, IFileSystemAccess2 fsa) {
		new JsonExporter().exportInfluences(resource, fsa)
	}

	private def void exportMetrics(Resource resource, GraphBuilder.Result graphBundle, IFileSystemAccess2 fsa) {
		val metrics = new ImpactMetrics().compute(resource, graphBundle)

		val candidateCompensators = new CandidateCompensatorAnalyzer()
			.analyze(graphBundle)

		new MetricsReportExporter().export(
			metrics,
			candidateCompensators,
			fsa,
			"file/info.txt"
		)
	}

	private def void exportArtifactOrigins(Resource resource, IFileSystemAccess2 fsa) {
		new InfluenceArtifactOriginExporter()
			.exportCSV(resource, fsa, "tables/influence_artifact_origins.csv")
	}

	private def void exportInfluenceKnowledge(Resource resource, IFileSystemAccess2 fsa) {
		new InfluenceReportExporter()
			.export(resource, fsa, "eval/influence_knowledge.txt")
	}

	private def void exportAnalyticRequirementImpact(Resource resource, IFileSystemAccess2 fsa) {
		new AnalyticRequirementImpactExporter()
			.export(resource, fsa, "eval/analytic_requirement_impact.txt")
	}

	private def void runGraphDiagnostics(GraphBuilder.Result graphBundle) {
		new GraphCycleAnalyzer().detectCycle(graphBundle.graph)
	}
	
	private def void exportDashboard(Resource resource, GraphBuilder.Result graphBundle, IFileSystemAccess2 fsa) {
    	new DashboardDataExporter()
        	.export(resource, graphBundle, fsa, "dashboard/data")
        	
        new GentelellaDashboardExporter()
			.export(fsa, "dashboard/site")
        	
	}

}
