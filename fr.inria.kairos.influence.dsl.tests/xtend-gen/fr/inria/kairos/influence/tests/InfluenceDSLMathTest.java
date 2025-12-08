package fr.inria.kairos.influence.tests;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import fr.inria.kairos.influence.analysis.InfluenceEvaluator;
import fr.inria.kairos.influence.analysis.JavaExprEvaluator;
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
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(InfluenceDSLInjectorProvider.class)
@SuppressWarnings("all")
public class InfluenceDSLMathTest {
  @Inject
  private ParseHelper<InfluenceModel> parseHelper;

  /**
   * TEST 1: Unit Test for the Math Engine (JavaExprEvaluator)
   */
  @BeforeEach
  public void registerMetamodel() {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey("http://kairos.inria.fr/influences");
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put("http://kairos.inria.fr/influences", MetamodelPackage.eINSTANCE);
    }
  }

  @Test
  public void testMathEngine() {
    final String expr1 = "10 + 5 * 2";
    final JavaExprEvaluator.Expr ast1 = JavaExprEvaluator.compile(expr1);
    HashMap<String, Double> _hashMap = new HashMap<String, Double>();
    Assertions.assertEquals(20.0, JavaExprEvaluator.eval(ast1, _hashMap), 0.001);
    final String expr2 = "max(10, 20) + min(5, 1)";
    final JavaExprEvaluator.Expr ast2 = JavaExprEvaluator.compile(expr2);
    HashMap<String, Double> _hashMap_1 = new HashMap<String, Double>();
    Assertions.assertEquals(21.0, JavaExprEvaluator.eval(ast2, _hashMap_1), 0.001);
    final String expr3 = "(A + B) * 2";
    final HashMap<String, Double> vars = new HashMap<String, Double>();
    vars.put("A", Double.valueOf(10.0));
    vars.put("B", Double.valueOf(5.0));
    final JavaExprEvaluator.Expr ast3 = JavaExprEvaluator.compile(expr3);
    Assertions.assertEquals(30.0, JavaExprEvaluator.eval(ast3, vars), 0.001);
  }

  /**
   * TEST 2: Full Integration Test (InfluenceEvaluator)
   * Propagation, Requirement Margin, and Sensitivity Analysis.
   */
  @Test
  public void testFullInfluenceChain() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("InfluenceModel testInfluenceModel");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("DesignArtifact CarSpeed -> \"CarSpeed\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("EnvironmentalFactor testEF     ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("description \"TestEF\"  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("flexibility 0.4");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("value 0.6,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Requirement SafetyReq ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("description \"Must stop in time\" ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("// SATISFIED IF: 50 - BrakingDistance > 0");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("satisfied when \"BrakingDistance < 50\" languageType JavaNumericExpression,");
      _builder.newLine();
      _builder.newLine();
      _builder.append("SystemResponseProperty BrakingDistance ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("description \"Distance to stop\" ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("constrainedBy SafetyReq,");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("Influence ComputeBraking");
      _builder.newLine();
      _builder.append(" ");
      _builder.append("#** \"Test description\" **#");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("participants:");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("ArtifactParticipant CarSpeed confidence 1.0,");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("EnvironmentalFactorParticipant testEF confidence 0.5;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("influenceFunction \"physics\":");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("// Formula: Distance = Speed * 2 (Simplified physics)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("definition \"CarSpeed * 2 * testEF\" ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("returnType Real ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("languageType JavaNumericExpression;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("affects BrakingDistance");
      _builder.newLine();
      final InfluenceModel model = this.parseHelper.parse(_builder);
      final EList<Resource.Diagnostic> errors = model.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      String _join = IterableExtensions.join(errors, ", ");
      String _plus = ("Parser failed with errors: " + _join);
      Assertions.assertTrue(_isEmpty, _plus);
      final HashMap<String, Double> scenario = new HashMap<String, Double>();
      scenario.put("CarSpeed", Double.valueOf(20.0));
      scenario.put("testEF", Double.valueOf(0.6));
      final Function1<Influence, Boolean> _function = (Influence it) -> {
        return Boolean.valueOf(((it.getOutputSRP() != null) && Objects.equals(it.getOutputSRP().getName(), "BrakingDistance")));
      };
      final Influence terminalInf = IterableExtensions.<Influence>findFirst(Iterables.<Influence>filter(model.getOwnedInfluences(), Influence.class), _function);
      Assertions.assertNotNull(terminalInf, "Could not find Influence affecting \'BrakingDistance\'");
      final InfluenceEvaluator.EvalResult result = InfluenceEvaluator.evaluateChainWithRequirement(model, terminalInf, scenario);
      InputOutput.<String>println(result.trace);
      Assertions.assertEquals(24.0, result.srpValue, 0.001, "SRP Value calculation incorrect");
      Assertions.assertEquals(26.0, result.margin, 0.001, "Margin calculation incorrect");
      final String classification = result.label.get("CarSpeed");
      Assertions.assertNotNull(classification, "CarSpeed was not classified");
      Assertions.assertTrue((classification.contains("prejudices") || classification.contains("hurts")), 
        ("CarSpeed should prejudice the safety requirement (increasing speed reduces safety margin). Actual: " + classification));
      final Double gradient = result.grad.get("CarSpeed");
      Assertions.assertEquals((-1.2), (gradient).doubleValue(), 0.001, "Gradient calculation incorrect");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
