package fr.inria.kairos.influence.tests;

import com.google.inject.Inject;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MetamodelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)/* 
@InjectWith(_InfluenceDSLInjectorProvider) */
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getOwnedRequirements() is undefined for the type InfluenceModel"
      + "\nThe method getOwnedRequirements() is undefined for the type InfluenceModel"
      + "\nThe method getConstrainedBy() is undefined for the type SystemResponseProperty"
      + "\nsize cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved");
  }
}
