package fr.inria.kairos.influence.tests;

import com.google.inject.Inject;
import fr.inria.kairos.influence.analysis.GraphBuilder;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.^extension.ExtendWith;
import fr.inria.kairos.influence.metamodel.InfluenceModel
import org.jgrapht.Graph
import org.jgrapht.graph.DefaultEdge
import org.junit.jupiter.api.BeforeEach
import org.eclipse.emf.ecore.EPackage
import fr.inria.kairos.influence.metamodel.MetamodelPackage

@ExtendWith(InjectionExtension)
@InjectWith(InfluenceDSLInjectorProvider)
class InfluenceDSLGraphTest {
	

    @Inject
	ParseHelper<InfluenceModel> parseHelper
	
	@BeforeEach
    def void registerMetamodel() {
        // This forces the EPackage to initialize and register itself in the global registry
        if (!EPackage.Registry.INSTANCE.containsKey("http://kairos.inria.fr/influences")) {
            EPackage.Registry.INSTANCE.put("http://kairos.inria.fr/influences", MetamodelPackage.eINSTANCE)
        }
    }

    @Test
    def void testGraphTopology() throws Exception {
        val model = parseHelper.parse('''
			InfluenceModel testInfluenceModel
			DesignArtifact testArtifact -> "testArtifact",
			
			EnvironmentalFactor testEF     
				description "TestEF"  
				flexibility 0.4        
				value 0.6,
				
			Requirement ReqTest 
			description "Test shall pass" 
			satisfied when "TestResult < 1" 
			languageType JavaNumericExpression,
			
			SystemResponseProperty TestSRP 
			description "TestDescription" 
			constrainedBy ReqTest,
			 			 
			Influence TestModel
			  #** "Test description" **#
			    participants:
			    ArtifactParticipant testArtifact  confidence 1.0	,
			    EnvironmentalFactorParticipant testEF confidence 0.5;
			  influenceFunction "f1":
			    definition "Text Definition"
			    returnType Real 
			    languageType JavaNumericExpression;
			  affects TestSRP ,
		''')
        
        
        // 1. Run the GraphBuilder
        val builder = new GraphBuilder();
        val result = builder.build(model.eResource()); //         
        
		val Graph<String, DefaultEdge> graph = result.graph
        // 2. Assert Vertex Existence (GraphBuilder adds prefixes A:, I:, SR:)
		Assertions.assertTrue(graph.containsVertex("A:testArtifact"), "Graph should contain artifact")
        Assertions.assertTrue(graph.containsVertex("I:TestModel"), "Graph should contain influence") 
        Assertions.assertTrue(graph.containsVertex("SR:TestSRP"), "Graph should contain SRP")
        // 3. Assert Edges exist
		Assertions.assertTrue(graph.containsEdge("A:testArtifact", "I:TestModel"))        
		Assertions.assertTrue(result.graph.containsEdge("I:TestModel", "SR:TestSRP"));
    }
}