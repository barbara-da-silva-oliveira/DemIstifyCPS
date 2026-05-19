package fr.inria.kairos.influence.generator

import fr.inria.kairos.influence.analysis.ImpactMetrics
import fr.inria.kairos.influence.analysis.RequirementTraceability
import fr.inria.kairos.influence.export.DotExporter
import fr.inria.kairos.influence.analysis.GraphBuilder
import fr.inria.kairos.influence.export.InfoExporter
import fr.inria.kairos.influence.export.JsonExporter
import fr.inria.kairos.influence.export.TablesExporter
import java.io.ByteArrayInputStream
import java.util.ArrayDeque
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map
import java.util.Map.Entry
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.jgrapht.alg.cycle.CycleDetector
import org.jgrapht.graph.DefaultDirectedGraph
import org.jgrapht.graph.DefaultEdge
import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
import fr.inria.kairos.influence.metamodel.SRPInputParticipant

import fr.inria.kairos.influence.metamodel.InfluenceModel
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.Participant
import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
import fr.inria.kairos.influence.metamodel.SRPInputParticipant
import fr.inria.kairos.influence.metamodel.SystemResponseProperty
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion

import fr.inria.kairos.influence.metamodel.ValueSpec
import fr.inria.kairos.influence.metamodel.ScalarValue
import fr.inria.kairos.influence.metamodel.RangeValue

import fr.inria.kairos.influence.metamodel.FunctionRepresentation
import fr.inria.kairos.influence.metamodel.NaturalLanguageFunction
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact
import fr.inria.kairos.influence.metamodel.MonotonicityTable
import fr.inria.kairos.influence.metamodel.MonotonicityRow
import fr.inria.kairos.influence.export.InfluenceArtifactOriginExporter

//import fr.inria.kairos.influence.metamodel.ValueType
//import fr.inria.kairos.influence.analysis.StructuralRequirementEvaluation

class InfluenceDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		new InfluenceGenerationPipeline().generate(resource, fsa)
	}
}
