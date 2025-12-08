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
import org.junit.jupiter.api.BeforeEach
import org.eclipse.emf.ecore.EPackage
import fr.inria.kairos.influence.metamodel.MetamodelPackage

@ExtendWith(InjectionExtension)
@InjectWith(InfluenceDSLInjectorProvider)
class InfluenceDSLTraceabilityTest {

    @Inject
    ParseHelper<InfluenceModel> parseHelper
    	
	@BeforeEach
    def void registerMetamodel() {
        // This forces the EPackage to initialize and register itself in the global registry
        if (!EPackage.Registry.INSTANCE.containsKey("http://kairos.inria.fr/influences")) {
            EPackage.Registry.INSTANCE.put("http://kairos.inria.fr/influences", MetamodelPackage.eINSTANCE)
        }
    }
    

    /**
     * TEST 1: Transitive Traceability (Multi-step Chain)
     * Verify that an Artifact input is detected as a sensitivity factor
     * for a Requirement, even if it goes through an intermediate SRP.
     * [WheelSize] - (Inf1) -> [CarSpeed]  - (Inf2) -> [BrakingDist] -(Req) -> [Safety]
     */
    @Test
    def void testTransitiveTraceability() {
        val model = parseHelper.parse('''
            InfluenceModel TraceModel
            DesignArtifact WheelSize -> "WheelSize",
            EnvironmentalFactor Rain description "D" flexibility 0.1 value 1.0,
            
            // Intermediate SRP
            SystemResponseProperty CarSpeed description "Intermediate Step" constrainedBy ReqNone,
            
            // Final SRP
            Requirement SafetyReq 
            description "Stop safe" 
            satisfied when "BrakingDist < 50"
            languageType JavaNumericExpression,
            
            SystemResponseProperty BrakingDist 
            description "Final Step" 
            constrainedBy SafetyReq,
            
            // Dummy req for intermediate (syntax requirement)
            Requirement ReqNone 
            description "None" 
            satisfied when "1" languageType JavaNumericExpression,

            // Step 1: WheelSize -> CarSpeed
            Influence StepOne
            #** "Test description" **#
              participants: 
              ArtifactParticipant WheelSize confidence 1.0,
              EnvironmentalFactorParticipant Rain confidence 1.0;
              influenceFunction "f1":
                definition "WheelSize * 10" // Speed = Size * 10
                returnType Real 
                languageType JavaNumericExpression;
              affects CarSpeed,

            // Step 2: CarSpeed + Rain -> BrakingDist
            Influence StepTwo
            #** "Test description" **#
              participants: 
                SRPInputParticipant CarSpeed confidence 1.0, // Chained Input
                EnvironmentalFactorParticipant Rain confidence 1.0;
              influenceFunction "f2":
                definition "CarSpeed * Rain" 
                returnType Real 
                languageType JavaNumericExpression;
              affects BrakingDist 
        ''')
        
        val errors = model.eResource.errors
		Assertions.assertTrue(errors.isEmpty, "Parser errors: " + errors.join(", "))
        // 1. Setup Scenario (Values for Roots only)
        val scenario = new HashMap<String, Double>()
        scenario.put("WheelSize", 2.0)
        scenario.put("Rain", 1.5)

        // 2. Target the End of the Chain
        val terminalInf = model.ownedInfluences
            .filter(Influence)
            .findFirst[it.outputSRP.name == "BrakingDist"]

        // 3. Evaluate
        val result = InfluenceEvaluator.evaluateChainWithRequirement(model, terminalInf, scenario)

        // 4. Assert Traceability
        // The gradient map contains keys for ALL variables that affect the outcome.
        // We verify that 'WheelSize' is found, even though it belongs to the previous step.
        Assertions.assertTrue(result.grad.containsKey("WheelSize"), 
            "Traceability Failed: WheelSize (Root) not found in sensitivity analysis of BrakingDist (Leaf)")
            
        Assertions.assertTrue(result.grad.containsKey("Rain"), 
            "Traceability Failed: Rain not found")
            
        // 5. Verify Calculation confirms the chain
        // Speed = 2.0 * 10 = 20
        // Dist  = 20 * 1.5 = 30
        Assertions.assertEquals(30.0, result.srpValue, 0.001)
        
        // 6. Verify Gradient Value (Chain Rule)
        // Dist = (WheelSize * 10) * Rain
        // dDist/dWheel = 10 * Rain = 10 * 1.5 = 15.0
        // Margin = 50 - Dist
        // dMargin/dWheel = -15.0
        Assertions.assertEquals(-15.0, result.grad.get("WheelSize"), 0.001, "Transitive gradient calculation incorrect")
    }

}