package fr.inria.kairos.influence.export;

import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JsonExporter {
  public void exportInfluences(final Resource resource, final IFileSystemAccess2 fsa) {
    final StringBuilder sb = new StringBuilder();
    sb.append("{\n\t\"influences\": [\n");
    boolean firstInfluence = true;
    final TreeIterator<EObject> it = resource.getAllContents();
    while (it.hasNext()) {
      {
        final EObject o = it.next();
        if ((o instanceof Influence)) {
          final Influence inf = ((Influence) o);
          if ((!firstInfluence)) {
            sb.append(",\n");
          }
          sb.append("\t\t{\n");
          sb.append("\t\t\t\"name\": \"").append(inf.getName()).append("\",\n");
          final Function1<DesignArtifact, Boolean> _function = (DesignArtifact it_1) -> {
            return Boolean.valueOf(((it_1 != null) && (it_1.getName() != null)));
          };
          final Function1<DesignArtifact, String> _function_1 = (DesignArtifact it_1) -> {
            return it_1.getName();
          };
          final Function1<String, CharSequence> _function_2 = (String it_1) -> {
            return "\"«it»\"";
          };
          sb.append("\t\t\t\"artifactSources\": [").append(IterableExtensions.<String>join(IterableExtensions.<DesignArtifact, String>map(IterableExtensions.<DesignArtifact>filter(inf.getOriginatorArtifact(), _function), _function_1), ", ", _function_2)).append("],\n");
          final Function1<PhysicalPhenomena, Boolean> _function_3 = (PhysicalPhenomena it_1) -> {
            return Boolean.valueOf(((it_1 != null) && (it_1.getName() != null)));
          };
          final Function1<PhysicalPhenomena, String> _function_4 = (PhysicalPhenomena it_1) -> {
            return it_1.getName();
          };
          final Function1<String, CharSequence> _function_5 = (String it_1) -> {
            return "\"«it»\"";
          };
          sb.append("\t\t\t\"phenomenaSources\": [").append(IterableExtensions.<String>join(IterableExtensions.<PhysicalPhenomena, String>map(IterableExtensions.<PhysicalPhenomena>filter(inf.getOriginatorPhenomena(), _function_3), _function_4), ", ", _function_5)).append("]\n");
          sb.append("\t\t}");
          firstInfluence = false;
        }
      }
    }
    sb.append("\n\t]\n}\n");
    fsa.generateFile("influences.json", sb.toString());
  }
}
