package fr.inria.kairos.influence.tests;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import fr.inria.kairos.influence.analysis.InfluenceEvaluator;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import java.util.HashMap;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(InfluenceDSLInjectorProvider.class)
@SuppressWarnings("all")
public class InfluenceDSLTraceabilityTest {
  @Inject
  private ParseHelper<InfluenceModel> parseHelper;

  @BeforeEach
  public void registerMetamodel() {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey("http://kairos.inria.fr/influences");
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put("http://kairos.inria.fr/influences", MetamodelPackage.eINSTANCE);
    }
  }

  /**
   * TEST 1: Transitive Traceability (Multi-step Chain)
   * Verify that an Artifact input is detected as a sensitivity factor
   * for a Requirement, even if it goes through an intermediate SRP.
   * [WheelSize] - (Inf1) -> [CarSpeed]  - (Inf2) -> [BrakingDist] -(Req) -> [Safety]
   */
  @Test
  public void testTransitiveTraceability() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("InfluenceModel TraceModel");
      _builder.newLine();
      _builder.append("DesignArtifact WheelSize -> \"WheelSize\",");
      _builder.newLine();
      _builder.append("EnvironmentalFactor Rain description \"D\" flexibility 0.1 value 1.0,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("// Intermediate SRP");
      _builder.newLine();
      _builder.append("SystemResponseProperty CarSpeed description \"Intermediate Step\" constrainedBy ReqNone,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("// Final SRP");
      _builder.newLine();
      _builder.append("Requirement SafetyReq ");
      _builder.newLine();
      _builder.append("description \"Stop safe\" ");
      _builder.newLine();
      _builder.append("satisfied when \"BrakingDist < 50\"");
      _builder.newLine();
      _builder.append("languageType JavaNumericExpression,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("SystemResponseProperty BrakingDist ");
      _builder.newLine();
      _builder.append("description \"Final Step\" ");
      _builder.newLine();
      _builder.append("constrainedBy SafetyReq,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("// Dummy req for intermediate (syntax requirement)");
      _builder.newLine();
      _builder.append("Requirement ReqNone ");
      _builder.newLine();
      _builder.append("description \"None\" ");
      _builder.newLine();
      _builder.append("satisfied when \"1\" languageType JavaNumericExpression,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("// Step 1: WheelSize -> CarSpeed");
      _builder.newLine();
      _builder.append("Influence StepOne");
      _builder.newLine();
      _builder.append("#** \"Test description\" **#");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("participants: ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("ArtifactParticipant WheelSize confidence 1.0,");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("EnvironmentalFactorParticipant Rain confidence 1.0;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("influenceFunction \"f1\":");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("definition \"WheelSize * 10\" // Speed = Size * 10");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("returnType Real ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("languageType JavaNumericExpression;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("affects CarSpeed,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("// Step 2: CarSpeed + Rain -> BrakingDist");
      _builder.newLine();
      _builder.append("Influence StepTwo");
      _builder.newLine();
      _builder.append("#** \"Test description\" **#");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("participants: ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("SRPInputParticipant CarSpeed confidence 1.0, // Chained Input");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("EnvironmentalFactorParticipant Rain confidence 1.0;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("influenceFunction \"f2\":");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("definition \"CarSpeed * Rain\" ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("returnType Real ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("languageType JavaNumericExpression;");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("affects BrakingDist ");
      _builder.newLine();
      final InfluenceModel model = this.parseHelper.parse(_builder);
      final EList<Resource.Diagnostic> errors = model.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      String _join = IterableExtensions.join(errors, ", ");
      String _plus = ("Parser errors: " + _join);
      Assertions.assertTrue(_isEmpty, _plus);
      final HashMap<String, Double> scenario = new HashMap<String, Double>();
      scenario.put("WheelSize", Double.valueOf(2.0));
      scenario.put("Rain", Double.valueOf(1.5));
      final Function1<Influence, Boolean> _function = (Influence it) -> {
        String _name = it.getOutputSRP().getName();
        return Boolean.valueOf(Objects.equals(_name, "BrakingDist"));
      };
      final Influence terminalInf = IterableExtensions.<Influence>findFirst(Iterables.<Influence>filter(model.getOwnedInfluences(), Influence.class), _function);
      final InfluenceEvaluator.EvalResult result = InfluenceEvaluator.evaluateChainWithRequirement(model, terminalInf, scenario);
      Assertions.assertTrue(result.grad.containsKey("WheelSize"), 
        "Traceability Failed: WheelSize (Root) not found in sensitivity analysis of BrakingDist (Leaf)");
      Assertions.assertTrue(result.grad.containsKey("Rain"), 
        "Traceability Failed: Rain not found");
      Assertions.assertEquals(30.0, result.srpValue, 0.001);
      Assertions.assertEquals((-15.0), (result.grad.get("WheelSize")).doubleValue(), 0.001, "Transitive gradient calculation incorrect");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
