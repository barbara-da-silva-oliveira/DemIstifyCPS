package fr.inria.kairos.influence.export;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JsonExporter {
  public void exportInfluences(final Resource resource, final IFileSystemAccess2 fsa) {
    final StringBuilder sb = new StringBuilder();
    sb.append("{\n  \"influences\": [\n");
    boolean first = true;
    final TreeIterator<EObject> it = resource.getAllContents();
    while (it.hasNext()) {
      {
        final EObject o = it.next();
        if ((o instanceof Influence)) {
          final Influence inf = ((Influence) o);
          if ((!first)) {
            sb.append(",\n");
          }
          first = false;
          final Function1<ArtifactParticipant, DesignArtifact> _function = (ArtifactParticipant it_1) -> {
            return it_1.getTarget();
          };
          final Function1<DesignArtifact, Boolean> _function_1 = (DesignArtifact it_1) -> {
            return Boolean.valueOf(((it_1 != null) && (it_1.getName() != null)));
          };
          final Function1<DesignArtifact, String> _function_2 = (DesignArtifact it_1) -> {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("{\"name\":\"");
            String _esc = JsonExporter.esc(it_1.getName());
            _builder.append(_esc);
            _builder.append("\",\"origin\":\"");
            String _uriOf = JsonExporter.uriOf(it_1);
            _builder.append(_uriOf);
            _builder.append("\"}");
            return _builder.toString();
          };
          final String arts = IterableExtensions.join(IterableExtensions.<DesignArtifact, String>map(IterableExtensions.<DesignArtifact>filter(IterableExtensions.<ArtifactParticipant, DesignArtifact>map(Iterables.<ArtifactParticipant>filter(inf.getOwnedParticipants(), ArtifactParticipant.class), _function), _function_1), _function_2), ", ");
          final Function1<EnvironmentalFactorParticipant, EnvironmentalFactor> _function_3 = (EnvironmentalFactorParticipant it_1) -> {
            return it_1.getTarget();
          };
          final Function1<EnvironmentalFactor, Boolean> _function_4 = (EnvironmentalFactor it_1) -> {
            return Boolean.valueOf(((it_1 != null) && (it_1.getName() != null)));
          };
          final Function1<EnvironmentalFactor, String> _function_5 = (EnvironmentalFactor it_1) -> {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("{\"name\":\"");
            String _esc = JsonExporter.esc(it_1.getName());
            _builder.append(_esc);
            _builder.append("\",\"origin\":\"");
            String _uriOf = JsonExporter.uriOf(it_1);
            _builder.append(_uriOf);
            _builder.append("\"}");
            return _builder.toString();
          };
          final String envs = IterableExtensions.join(IterableExtensions.<EnvironmentalFactor, String>map(IterableExtensions.<EnvironmentalFactor>filter(IterableExtensions.<EnvironmentalFactorParticipant, EnvironmentalFactor>map(Iterables.<EnvironmentalFactorParticipant>filter(inf.getOwnedParticipants(), EnvironmentalFactorParticipant.class), _function_3), _function_4), _function_5), ", ");
          final Function1<SRPInputParticipant, SystemResponseProperty> _function_6 = (SRPInputParticipant it_1) -> {
            return it_1.getTarget();
          };
          final Function1<SystemResponseProperty, Boolean> _function_7 = (SystemResponseProperty it_1) -> {
            return Boolean.valueOf(((it_1 != null) && (it_1.getName() != null)));
          };
          final Function1<SystemResponseProperty, String> _function_8 = (SystemResponseProperty it_1) -> {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("{\"name\":\"");
            String _esc = JsonExporter.esc(it_1.getName());
            _builder.append(_esc);
            _builder.append("\",\"origin\":\"");
            String _uriOf = JsonExporter.uriOf(it_1);
            _builder.append(_uriOf);
            _builder.append("\"}");
            return _builder.toString();
          };
          final String srInputs = IterableExtensions.join(IterableExtensions.<SystemResponseProperty, String>map(IterableExtensions.<SystemResponseProperty>filter(IterableExtensions.<SRPInputParticipant, SystemResponseProperty>map(Iterables.<SRPInputParticipant>filter(inf.getOwnedParticipants(), SRPInputParticipant.class), _function_6), _function_7), _function_8), ", ");
          final SystemResponseProperty outSR = inf.getOutputSRP();
          String _xifexpression = null;
          if (((outSR != null) && (outSR.getName() != null))) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("{\"name\":\"");
            String _esc = JsonExporter.esc(outSR.getName());
            _builder.append(_esc);
            _builder.append("\",\"origin\":\"");
            String _uriOf = JsonExporter.uriOf(outSR);
            _builder.append(_uriOf);
            _builder.append("\"}");
            _xifexpression = _builder.toString();
          } else {
            _xifexpression = "null";
          }
          final String outSRJson = _xifexpression;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("    ");
          _builder_1.append("{");
          _builder_1.newLine();
          _builder_1.append("\t      ");
          _builder_1.append("\"name\": \"");
          String _esc_1 = JsonExporter.esc(inf.getName());
          _builder_1.append(_esc_1, "\t      ");
          _builder_1.append("\",");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t      ");
          _builder_1.append("\"origin\": \"");
          String _uriOf_1 = JsonExporter.uriOf(inf);
          _builder_1.append(_uriOf_1, "\t      ");
          _builder_1.append("\",");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t      ");
          _builder_1.append("\"designArtifacts\": [");
          _builder_1.append(arts, "\t      ");
          _builder_1.append("],");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t      ");
          _builder_1.append("\"environmentalFactors\": [");
          _builder_1.append(envs, "\t      ");
          _builder_1.append("],");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t      ");
          _builder_1.append("\"srpInputs\": [");
          _builder_1.append(srInputs, "\t      ");
          _builder_1.append("],");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t      ");
          _builder_1.append("\"outputSRP\": ");
          _builder_1.append(outSRJson, "\t      ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t    ");
          _builder_1.append("}");
          sb.append(_builder_1);
        }
      }
    }
    sb.append("\n  ]\n}\n");
    fsa.generateFile("influences.json", sb.toString());
  }

  private static String esc(final String s) {
    String _xblockexpression = null;
    {
      if ((s == null)) {
        return "";
      }
      _xblockexpression = s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }
    return _xblockexpression;
  }

  private static String uriOf(final EObject e) {
    String _xblockexpression = null;
    {
      if ((e == null)) {
        return null;
      }
      _xblockexpression = EcoreUtil.getURI(e).toString();
    }
    return _xblockexpression;
  }
}
