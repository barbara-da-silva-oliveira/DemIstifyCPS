package fr.inria.kairos.influence.export;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.FunctionRepresentation;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MonotonicityRow;
import fr.inria.kairos.influence.metamodel.MonotonicityTable;
import fr.inria.kairos.influence.metamodel.NaturalLanguageFunction;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import fr.inria.kairos.influence.metamodel.TrendType;
import fr.inria.kairos.influence.metamodel.ValueSpec;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class InfluenceReportExporter {
  public void export(final Resource resource, final IFileSystemAccess2 fsa, final String outPath) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final InfluenceModel model = ((InfluenceModel) _head);
    final StringBuilder sb = new StringBuilder("Influence Knowledge Report\n\n");
    Iterable<Influence> _filter = Iterables.<Influence>filter(model.getOwnedInfluences(), Influence.class);
    for (final Influence inf : _filter) {
      this.appendInfluence(model, inf, sb);
    }
    fsa.generateFile(outPath, sb.toString());
  }

  private void appendInfluence(final InfluenceModel model, final Influence inf, final StringBuilder sb) {
    sb.append("## ").append(inf.getName()).append("\n");
    SystemResponseProperty _outputSRP = inf.getOutputSRP();
    boolean _tripleNotEquals = (_outputSRP != null);
    if (_tripleNotEquals) {
      sb.append("Output SRP: ").append(inf.getOutputSRP().getName()).append("\n");
    }
    sb.append("Participants:\n");
    EList<Participant> _ownedParticipants = inf.getOwnedParticipants();
    for (final Participant p : _ownedParticipants) {
      boolean _matched = false;
      if (p instanceof ArtifactParticipant) {
        _matched=true;
        StringBuilder _append = sb.append(" - ArtifactParticipant ").append(((ArtifactParticipant)p).getName()).append(" -> ");
        DesignArtifact _target = ((ArtifactParticipant)p).getTarget();
        String _name = null;
        if (_target!=null) {
          _name=_target.getName();
        }
        _append.append(_name).append("\n");
      }
      if (!_matched) {
        if (p instanceof EnvironmentalFactorParticipant) {
          _matched=true;
          StringBuilder _append = sb.append(" - EnvironmentalFactorParticipant ").append(((EnvironmentalFactorParticipant)p).getName()).append(" -> ");
          EnvironmentalFactor _target = ((EnvironmentalFactorParticipant)p).getTarget();
          String _name = null;
          if (_target!=null) {
            _name=_target.getName();
          }
          _append.append(_name);
          ValueSpec _admissibleSpace = ((EnvironmentalFactorParticipant)p).getAdmissibleSpace();
          boolean _tripleNotEquals_1 = (_admissibleSpace != null);
          if (_tripleNotEquals_1) {
            sb.append(" admissibleSpace=").append(ValueSpecPrinter.label(((EnvironmentalFactorParticipant)p).getAdmissibleSpace()));
          }
          sb.append("\n");
        }
      }
      if (!_matched) {
        if (p instanceof SRPInputParticipant) {
          _matched=true;
          StringBuilder _append = sb.append(" - SRPInputParticipant ").append(((SRPInputParticipant)p).getName()).append(" -> ");
          SystemResponseProperty _target = ((SRPInputParticipant)p).getTarget();
          String _name = null;
          if (_target!=null) {
            _name=_target.getName();
          }
          _append.append(_name).append("\n");
        }
      }
    }
    this.appendFunctionRepresentations(inf, sb);
    sb.append("\n");
  }

  private void appendFunctionRepresentations(final Influence inf, final StringBuilder sb) {
    final InfluenceFunction fn = inf.getOwnedInfluenceFunction();
    if (((fn == null) || fn.getRepresentations().isEmpty())) {
      sb.append("No function representations.\n");
      return;
    }
    sb.append("Function representations:\n");
    EList<FunctionRepresentation> _representations = fn.getRepresentations();
    for (final FunctionRepresentation rep : _representations) {
      boolean _matched = false;
      if (rep instanceof NaturalLanguageFunction) {
        _matched=true;
        sb.append(" - NaturalLanguageFunction: ").append(((NaturalLanguageFunction)rep).getDefinition()).append("\n");
      }
      if (!_matched) {
        if (rep instanceof ParticipantImpactFunction) {
          _matched=true;
          sb.append(" - ParticipantImpactFunction\n");
          EList<ParticipantRelativeImpact> _participantContribution = ((ParticipantImpactFunction)rep).getParticipantContribution();
          for (final ParticipantRelativeImpact impact : _participantContribution) {
            {
              StringBuilder _append = sb.append("    ");
              Participant _participant = impact.getParticipant();
              String _name = null;
              if (_participant!=null) {
                _name=_participant.getName();
              }
              _append.append(_name).append(" importance=").append(impact.getImportance());
              TrendType _direction = impact.getDirection();
              boolean _tripleNotEquals = (_direction != null);
              if (_tripleNotEquals) {
                sb.append(" direction=").append(impact.getDirection());
              }
              String _rationale = impact.getRationale();
              boolean _tripleNotEquals_1 = (_rationale != null);
              if (_tripleNotEquals_1) {
                sb.append(" rationale=").append(impact.getRationale());
              }
              sb.append("\n");
            }
          }
        }
      }
      if (!_matched) {
        if (rep instanceof AnalyticExpressionFunction) {
          _matched=true;
          sb.append(" - AnalyticExpressionFunction: ").append(((AnalyticExpressionFunction)rep).getExpression()).append(" [").append(((AnalyticExpressionFunction)rep).getExpressionLanguage()).append("]\n");
        }
      }
      if (!_matched) {
        if (rep instanceof MonotonicityTable) {
          _matched=true;
          sb.append(" - MonotonicityTable\n");
          EList<MonotonicityRow> _tableRows = ((MonotonicityTable)rep).getTableRows();
          for (final MonotonicityRow row : _tableRows) {
            {
              StringBuilder _append = sb.append("    varied=");
              Participant _variedParticipant = row.getVariedParticipant();
              String _name = null;
              if (_variedParticipant!=null) {
                _name=_variedParticipant.getName();
              }
              _append.append(_name).append(" trend=").append(row.getTrend());
              SystemResponseProperty _output = row.getOutput();
              boolean _tripleNotEquals = (_output != null);
              if (_tripleNotEquals) {
                sb.append(" output=").append(row.getOutput().getName());
              }
              sb.append("\n");
            }
          }
        }
      }
      if (!_matched) {
        sb.append(" - ").append(rep.eClass().getName()).append("\n");
      }
    }
  }
}
