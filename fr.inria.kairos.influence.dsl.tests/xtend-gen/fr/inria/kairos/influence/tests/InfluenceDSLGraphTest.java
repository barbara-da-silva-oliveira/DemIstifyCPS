package fr.inria.kairos.influence.tests;

import com.google.inject.Inject;
import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(InfluenceDSLInjectorProvider.class)
@SuppressWarnings("all")
public class InfluenceDSLGraphTest {
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

  @Test
  public void testGraphTopology() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("InfluenceModel testInfluenceModel");
    _builder.newLine();
    _builder.append("DesignArtifact testArtifact -> \"testArtifact\",");
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
    _builder.append("Influence TestModel");
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
    final GraphBuilder builder = new GraphBuilder();
    final GraphBuilder.Result result = builder.build(model.eResource());
    final Graph<String, DefaultEdge> graph = result.graph;
    Assertions.assertTrue(graph.containsVertex("A:testArtifact"), "Graph should contain artifact");
    Assertions.assertTrue(graph.containsVertex("I:TestModel"), "Graph should contain influence");
    Assertions.assertTrue(graph.containsVertex("SR:TestSRP"), "Graph should contain SRP");
    Assertions.assertTrue(graph.containsEdge("A:testArtifact", "I:TestModel"));
    Assertions.assertTrue(result.graph.containsEdge("I:TestModel", "SR:TestSRP"));
  }
}
