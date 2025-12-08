package fr.inria.kairos.influence.tests

import com.google.inject.Inject
import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.InfluenceModel
import fr.inria.kairos.influence.metamodel.MetamodelPackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(InfluenceDSLInjectorProvider)

class InfluenceDSLParsingTest {
	@Inject
	ParseHelper<InfluenceModel> parseHelper
	
	@Inject
    ValidationTestHelper validationHelper;
	
//	@Inject
//	Provider<XtextResourceSet> resourceSetProvider;
	
	@BeforeEach
    def void registerMetamodel() {
        // This forces the EPackage to initialize and register itself in the global registry
        if (!EPackage.Registry.INSTANCE.containsKey("http://kairos.inria.fr/influences")) {
            EPackage.Registry.INSTANCE.put("http://kairos.inria.fr/influences", MetamodelPackage.eINSTANCE)
        }
    }
	@Test
	def void loadModel() {
//Using self reference of DesignArtifact - testArtifact is a eobject itself
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
			 			 
			Influence TestInfluence
			  #** "Test description" **#
			    participants:
			    ArtifactParticipant testArtifact  confidence 1.0	,
			    EnvironmentalFactorParticipant testEF confidence 0.5;
			  influenceFunction "f1":
			    definition "Text Definition"
			    returnType Real 
			    languageType JavaNumericExpression;
			  affects TestSRP ,
		''')//, resourceSet) 
		// Test Syntax Errors:
		Assertions.assertNotNull(model, "Model should not be null");
        Assertions.assertTrue(model.eResource().getErrors().isEmpty(), 
            "Syntax errors found: " + model.eResource().getErrors());
//		val errors = model.eResource.errors
//		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')

		// Test correct number of elements
		Assertions.assertEquals(1, model.getOwnedSRPs().size());
        Assertions.assertEquals(1, model.getOwnedRequirements().size());
        Assertions.assertEquals(1, model.getOwnedInfluences().size());
        
		// Objects to test relationships from influence model
        val inTestSRP = model.getOwnedSRPs().get(0);
        val inReqTest = model.getOwnedRequirements().get(0);
        val inTestInfluence = model.getOwnedInfluences().get(0) as Influence;

		// Testing References
        // ConstrainedBy ReqSpeed actually point to the ReqTest
        Assertions.assertEquals(inReqTest, inTestSRP.getConstrainedBy().get(0), 
            "SRP 'TestSRP' should be constrained by 'ReqTest'");

        // Affects TestSRP point to the inTestSRP object
        Assertions.assertEquals(inTestSRP, inTestInfluence.getOutputSRP(), 
            "Influence 'TestModel' should affect 'TestSRP'");
            
        // Reference Participant to artifact
        val part = inTestInfluence.ownedParticipants.get(0) as ArtifactParticipant
        Assertions.assertEquals("testArtifact", part.getTarget().getName(),
            "Participant should point to 'testArtifact'");
      //  val parsedArtifact = model.ownedArtifacts.head
       //println(" URI: " + parsedArtifact.eResource().getURIFragment(parsedArtifact))
		//Test validation 
        // There are no semantic errors (like duplicate names)
        validationHelper.assertNoIssues(model);
		
	}
}
 