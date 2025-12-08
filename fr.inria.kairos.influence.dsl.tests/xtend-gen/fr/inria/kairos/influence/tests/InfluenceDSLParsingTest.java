package fr.inria.kairos.influence.tests;

import com.google.inject.Inject;
import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(InfluenceDSLInjectorProvider.class)
@SuppressWarnings("all")
public class InfluenceDSLParsingTest {
  @Inject
  private ParseHelper<InfluenceModel> parseHelper;

  @Inject
  private ValidationTestHelper validationHelper;

  @BeforeEach
  public void registerMetamodel() {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey("http://kairos.inria.fr/influences");
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put("http://kairos.inria.fr/influences", MetamodelPackage.eINSTANCE);
    }
  }

  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("InfluenceModel testInfluenceModel");
      _builder.newLine();
      _builder.append("DesignArtifact testArtifact -> \"testArtifact\", ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("EnvironmentalFactor testEF     ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("description \"TestEF\"  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("flexibility 0.4        ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("value 0.6,");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Requirement ReqTest ");
      _builder.newLine();
      _builder.append("description \"Test shall pass\" ");
      _builder.newLine();
      _builder.append("satisfied when \"TestResult < 1\" ");
      _builder.newLine();
      _builder.append("languageType JavaNumericExpression,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("SystemResponseProperty TestSRP ");
      _builder.newLine();
      _builder.append("description \"TestDescription\" ");
      _builder.newLine();
      _builder.append("constrainedBy ReqTest,");
      _builder.newLine();
      _builder.append(" \t\t\t ");
      _builder.newLine();
      _builder.append("Influence TestInfluence");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("#** \"Test description\" **#");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("participants:");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("ArtifactParticipant testArtifact  confidence 1.0\t,");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("EnvironmentalFactorParticipant testEF confidence 0.5;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("influenceFunction \"f1\":");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("definition \"Text Definition\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("returnType Real ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("languageType JavaNumericExpression;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("affects TestSRP ,");
      _builder.newLine();
      final InfluenceModel model = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(model, "Model should not be null");
      boolean _isEmpty = model.eResource().getErrors().isEmpty();
      EList<Resource.Diagnostic> _errors = model.eResource().getErrors();
      String _plus = ("Syntax errors found: " + _errors);
      Assertions.assertTrue(_isEmpty, _plus);
      Assertions.assertEquals(1, model.getOwnedSRPs().size());
      Assertions.assertEquals(1, model.getOwnedRequirements().size());
      Assertions.assertEquals(1, model.getOwnedInfluences().size());
      final SystemResponseProperty inTestSRP = model.getOwnedSRPs().get(0);
      final Requirement inReqTest = model.getOwnedRequirements().get(0);
      AbstractInfluence _get = model.getOwnedInfluences().get(0);
      final Influence inTestInfluence = ((Influence) _get);
      Assertions.assertEquals(inReqTest, inTestSRP.getConstrainedBy().get(0), 
        "SRP \'TestSRP\' should be constrained by \'ReqTest\'");
      Assertions.assertEquals(inTestSRP, inTestInfluence.getOutputSRP(), 
        "Influence \'TestModel\' should affect \'TestSRP\'");
      Participant _get_1 = inTestInfluence.getOwnedParticipants().get(0);
      final ArtifactParticipant part = ((ArtifactParticipant) _get_1);
      Assertions.assertEquals("testArtifact", part.getTarget().getName(), 
        "Participant should point to \'testArtifact\'");
      this.validationHelper.assertNoIssues(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
