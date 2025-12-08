package fr.inria.kairos.influence.tests

import com.google.inject.Inject
import fr.inria.kairos.influence.metamodel.InfluenceModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import java.util.HashMap
import fr.inria.kairos.influence.metamodel.Influence

import fr.inria.kairos.influence.analysis.InfluenceEvaluator
import fr.inria.kairos.influence.analysis.JavaExprEvaluator
import org.junit.jupiter.api.BeforeEach
import org.eclipse.emf.ecore.EPackage
import fr.inria.kairos.influence.metamodel.MetamodelPackage

@ExtendWith(InjectionExtension)
@InjectWith(InfluenceDSLInjectorProvider)
class InfluenceDSLMathTest {

    @Inject
    ParseHelper<InfluenceModel> parseHelper

    /**
     * TEST 1: Unit Test for the Math Engine (JavaExprEvaluator)
     */
     
     @BeforeEach
    def void registerMetamodel() {
        // This forces the EPackage to initialize and register itself in the global registry
        if (!EPackage.Registry.INSTANCE.containsKey("http://kairos.inria.fr/influences")) {
            EPackage.Registry.INSTANCE.put("http://kairos.inria.fr/influences", MetamodelPackage.eINSTANCE)
        }
    }
    @Test
    def void testMathEngine() {
        // 1. Test basic arithmetic and precedence
        val expr1 = "10 + 5 * 2" 
        val ast1 = JavaExprEvaluator.compile(expr1)
        Assertions.assertEquals(20.0, JavaExprEvaluator.eval(ast1, new HashMap()), 0.001)

        // 2. Test functions (min/max)
        val expr2 = "max(10, 20) + min(5, 1)"
        val ast2 = JavaExprEvaluator.compile(expr2)
        Assertions.assertEquals(21.0, JavaExprEvaluator.eval(ast2, new HashMap()), 0.001)

        // 3. Test Variable Substitution
        val expr3 = "(A + B) * 2"
        val vars = new HashMap<String, Double>()
        vars.put("A", 10.0)
        vars.put("B", 5.0)
        
        val ast3 = JavaExprEvaluator.compile(expr3)
        Assertions.assertEquals(30.0, JavaExprEvaluator.eval(ast3, vars), 0.001)
    }

    /**
     * TEST 2: Full Integration Test (InfluenceEvaluator)
     * Propagation, Requirement Margin, and Sensitivity Analysis.
     */
    @Test
    def void testFullInfluenceChain() {
        // --- 1. Define the Model ---
        // Scenario: Car Braking System
        // Speed (Artifact) -> BrakingDistance (SRP)
        // Requirement: BrakingDistance must be < 50 meters.
        
        val model = parseHelper.parse('''
				InfluenceModel testInfluenceModel
				DesignArtifact CarSpeed -> "CarSpeed",
				
				EnvironmentalFactor testEF     
				description "TestEF"  
				flexibility 0.4
				value 0.6,
				Requirement SafetyReq 
				description "Must stop in time" 
				// SATISFIED IF: 50 - BrakingDistance > 0
			    satisfied when "BrakingDistance < 50" languageType JavaNumericExpression,
			
			SystemResponseProperty BrakingDistance 
			    description "Distance to stop" 
			    constrainedBy SafetyReq,
			    
			Influence ComputeBraking
			 #** "Test description" **#
			    participants:
			        ArtifactParticipant CarSpeed confidence 1.0,
			        EnvironmentalFactorParticipant testEF confidence 0.5;
			    influenceFunction "physics":
			        // Formula: Distance = Speed * 2 (Simplified physics)
			        definition "CarSpeed * 2 * testEF" 
			        returnType Real 
			        languageType JavaNumericExpression;
			    affects BrakingDistance
        ''')
        val errors = model.eResource.errors
        Assertions.assertTrue(errors.isEmpty, 
            "Parser failed with errors: " + errors.join(", "))
            
        // --- 2. Setup the Input Scenario ---
        val scenario = new HashMap<String, Double>()
        scenario.put("CarSpeed", 20.0) // Input Speed = 20
        scenario.put("testEF", 0.6) 
       
        // --- 3. Identify the Terminal Influence ---
        // We need to tell the evaluator which 'Influence' block calculates our target SRP
        
        val terminalInf = model.ownedInfluences
        .filter(Influence)
        .findFirst[it.outputSRP !== null && it.outputSRP.name == "BrakingDistance"]

        Assertions.assertNotNull(terminalInf, "Could not find Influence affecting 'BrakingDistance'")

        // --- 4. Run the Evaluator ---
        val result = InfluenceEvaluator.evaluateChainWithRequirement(
            model, 
            terminalInf, 
            scenario
        )

        println(result.trace)

        // --- 6. Assertions ---

        // A. Verify SRP Calculation
        // Formula: CarSpeed * 2  => 20 * 2 = 40.0
         Assertions.assertEquals(24.0, result.srpValue, 0.001, "SRP Value calculation incorrect")

        // B. Verify Margin Calculation
        // Requirement: "BrakingDistance < 50"
        //Margin: 50 - 24.0 = 26.0
        // Since 10.0 > 0, it is Satisfied.
        Assertions.assertEquals(26.0, result.margin, 0.001, "Margin calculation incorrect")
        
        // C. Verify Sensitivity / Classification
        // Logic: if 'CarSpeed' INCREASES, 'BrakingDistance' INCREASES (via formula speed * 2)
        //  'Margin' (50 - Dist) DECREASES.
        // Therefore, 'CarSpeed' hurts the requirement (prejudices).
        
        // Logic:If 'CarSpeed' INCREASES...
        // 2. 'BrakingDistance' INCREASES (via formula speed * 2)
        val classification = result.label.get("CarSpeed")
        Assertions.assertNotNull(classification, "CarSpeed was not classified")
        Assertions.assertTrue(classification.contains("prejudices") || classification.contains("hurts"), 
            "CarSpeed should prejudice the safety requirement (increasing speed reduces safety margin). Actual: " + classification)
            
        // D. Verify Gradient Value
        // M = 50 - (2 * testEF * CarSpeed)
        // dM / dCarSpeed = -2 * testEF
        // dM / dCarSpeed = -2 * 0.6 = -1.2
        val gradient = result.grad.get("CarSpeed")
        Assertions.assertEquals(-1.2, gradient, 0.001, "Gradient calculation incorrect")
        
        
    }
}