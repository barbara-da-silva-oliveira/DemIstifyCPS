package fr.inria.kairos.influence.export;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.analysis.ImpactMetrics;
import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.FunctionRepresentation;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.MonotonicityTable;
import fr.inria.kairos.influence.metamodel.NaturalLanguageFunction;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jgrapht.graph.DefaultEdge;

@SuppressWarnings("all")
public class DashboardDataExporter {
  public static class DeveloperView {
    public final String id;

    public final Set<String> artifacts = new LinkedHashSet<String>();

    public final Set<String> influences = new LinkedHashSet<String>();

    public final Set<String> srps = new LinkedHashSet<String>();

    public final Set<String> requirements = new LinkedHashSet<String>();

    public DeveloperView(final String id) {
      this.id = id;
    }
  }

  public void export(final Resource resource, final GraphBuilder.Result graphBundle, final IFileSystemAccess2 fsa, final String basePath) {
    final InfluenceModel model = this.rootModel(resource);
    final String base = this.normalizeBasePath(basePath);
    if ((model == null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("\"error\": \"No InfluenceModel found\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      fsa.generateFile((base + "/dashboard-data.json"), _builder);
      return;
    }
    final ImpactMetrics.Result metrics = new ImpactMetrics().compute(resource, graphBundle);
    fsa.generateFile(
      (base + "/dashboard-data.json"), 
      this.buildDashboardData(model, graphBundle, metrics));
    fsa.generateFile(
      (base + "/graph.json"), 
      this.buildGraphData(graphBundle));
  }

  private InfluenceModel rootModel(final Resource resource) {
    if ((((resource == null) || (resource.getContents() == null)) || resource.getContents().isEmpty())) {
      return null;
    }
    final EObject root = IterableExtensions.<EObject>head(resource.getContents());
    if ((root instanceof InfluenceModel)) {
      return ((InfluenceModel) root);
    }
    return null;
  }

  private String normalizeBasePath(final String basePath) {
    if (((basePath == null) || basePath.trim().isEmpty())) {
      return "dashboard/data";
    }
    boolean _endsWith = basePath.endsWith("/");
    if (_endsWith) {
      int _length = basePath.length();
      int _minus = (_length - 1);
      return basePath.substring(0, _minus);
    }
    return basePath;
  }

  private String buildDashboardData(final InfluenceModel model, final GraphBuilder.Result graphBundle, final ImpactMetrics.Result metrics) {
    final StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("  \"model\": ");
    this.appendModelSummary(sb, model);
    sb.append(",\n");
    sb.append("  \"artifacts\": ");
    this.appendArtifacts(sb, model);
    sb.append(",\n");
    sb.append("  \"environmentalFactors\": ");
    this.appendEnvironmentalFactors(sb, model);
    sb.append(",\n");
    sb.append("  \"systemResponseProperties\": ");
    this.appendSystemResponseProperties(sb, model);
    sb.append(",\n");
    sb.append("  \"satisfactionCriteria\": ");
    this.appendSatisfactionCriteria(sb, model);
    sb.append(",\n");
    sb.append("  \"influences\": ");
    this.appendInfluences(sb, model);
    sb.append(",\n");
    sb.append("  \"metrics\": ");
    this.appendMetrics(sb, metrics);
    sb.append(",\n");
    sb.append("  \"developerViews\": ");
    this.appendDeveloperViews(sb, model);
    sb.append("\n}\n");
    return sb.toString();
  }

  private void appendModelSummary(final StringBuilder sb, final InfluenceModel model) {
    final int influenceCount = IterableExtensions.size(Iterables.<Influence>filter(model.getOwnedInfluences(), Influence.class));
    final int compositeInfluenceCount = IterableExtensions.size(Iterables.<CompositeInfluence>filter(model.getOwnedInfluences(), CompositeInfluence.class));
    final Function1<Influence, Boolean> _function = (Influence it) -> {
      return Boolean.valueOf(this.hasAnalyticFunction(it));
    };
    final int analyticInfluenceCount = IterableExtensions.size(IterableExtensions.<Influence>filter(Iterables.<Influence>filter(model.getOwnedInfluences(), Influence.class), _function));
    sb.append("{\n");
    sb.append("    \"name\": ").append(this.jsonString(model.getName())).append(",\n");
    sb.append("    \"counts\": {\n");
    sb.append("      \"artifacts\": ").append(model.getOwnedArtifacts().size()).append(",\n");
    sb.append("      \"environmentalFactors\": ").append(model.getOwnedEnvironmentalFactors().size()).append(",\n");
    sb.append("      \"systemResponseProperties\": ").append(model.getOwnedSRPs().size()).append(",\n");
    sb.append("      \"satisfactionCriteria\": ").append(model.getOwnedSatisfactionCriteria().size()).append(",\n");
    sb.append("      \"influences\": ").append(influenceCount).append(",\n");
    sb.append("      \"compositeInfluences\": ").append(compositeInfluenceCount).append(",\n");
    sb.append("      \"analyticInfluences\": ").append(analyticInfluenceCount).append("\n");
    sb.append("    }\n");
    sb.append("  }");
  }

  private void appendArtifacts(final StringBuilder sb, final InfluenceModel model) {
    sb.append("[\n");
    boolean first = true;
    EList<DesignArtifact> _ownedArtifacts = model.getOwnedArtifacts();
    for (final DesignArtifact artifact : _ownedArtifacts) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("    {\n");
        sb.append("      \"name\": ").append(this.jsonString(artifact.getName())).append(",\n");
        sb.append("      \"externalReference\": ").append(this.jsonString(this.externalReferenceLabel(artifact.getRef()))).append(",\n");
        sb.append("      \"externalUri\": ").append(this.jsonString(this.uriOf(artifact.getRef()))).append(",\n");
        sb.append("      \"owner\": ").append(this.jsonString(this.ownerOfArtifact(artifact))).append(",\n");
        sb.append("      \"changeability\": ").append(this.jsonNumber(artifact.getChangeability())).append("\n");
        sb.append("    }");
      }
    }
    sb.append("\n  ]");
  }

  private void appendEnvironmentalFactors(final StringBuilder sb, final InfluenceModel model) {
    sb.append("[\n");
    boolean first = true;
    EList<EnvironmentalFactor> _ownedEnvironmentalFactors = model.getOwnedEnvironmentalFactors();
    for (final EnvironmentalFactor factor : _ownedEnvironmentalFactors) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("    {\n");
        sb.append("      \"name\": ").append(this.jsonString(factor.getName())).append(",\n");
        sb.append("      \"description\": ").append(this.jsonString(factor.getDescription())).append(",\n");
        sb.append("      \"flexibility\": ").append(this.jsonNumber(factor.getFlexibility())).append("\n");
        sb.append("    }");
      }
    }
    sb.append("\n  ]");
  }

  private void appendSystemResponseProperties(final StringBuilder sb, final InfluenceModel model) {
    sb.append("[\n");
    boolean first = true;
    EList<SystemResponseProperty> _ownedSRPs = model.getOwnedSRPs();
    for (final SystemResponseProperty srp : _ownedSRPs) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("    {\n");
        sb.append("      \"name\": ").append(this.jsonString(srp.getName())).append(",\n");
        sb.append("      \"description\": ").append(this.jsonString(srp.getDescription())).append(",\n");
        sb.append("      \"satisfactionCriteria\": ");
        final Iterable<SatisfactionCriterion> criteria = this.criteriaConstraining(model, srp);
        final Function1<SatisfactionCriterion, String> _function = (SatisfactionCriterion it) -> {
          return it.getName();
        };
        this.appendStringArray(sb, IterableExtensions.<SatisfactionCriterion, String>map(criteria, _function));
        sb.append("\n");
        sb.append("    }");
      }
    }
    sb.append("\n  ]");
  }

  private void appendSatisfactionCriteria(final StringBuilder sb, final InfluenceModel model) {
    sb.append("[\n");
    boolean first = true;
    EList<SatisfactionCriterion> _ownedSatisfactionCriteria = model.getOwnedSatisfactionCriteria();
    for (final SatisfactionCriterion criterion : _ownedSatisfactionCriteria) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("    {\n");
        sb.append("      \"name\": ").append(this.jsonString(criterion.getName())).append(",\n");
        sb.append("      \"requirement\": ").append(this.jsonString(this.requirementLabel(criterion.getRequirementRef()))).append(",\n");
        sb.append("      \"requirementUri\": ").append(this.jsonString(this.uriOf(criterion.getRequirementRef()))).append(",\n");
        sb.append("      \"marginDefinition\": ").append(this.jsonString(criterion.getMarginDefinition())).append(",\n");
        sb.append("      \"language\": ").append(this.jsonString(String.valueOf(criterion.getLanguage()))).append(",\n");
        sb.append("      \"constrainedSRPs\": ");
        final Function1<SystemResponseProperty, String> _function = (SystemResponseProperty it) -> {
          return it.getName();
        };
        this.appendStringArray(sb, ListExtensions.<SystemResponseProperty, String>map(criterion.getConstrainedSRPs(), _function));
        sb.append("\n");
        sb.append("    }");
      }
    }
    sb.append("\n  ]");
  }

  private void appendInfluences(final StringBuilder sb, final InfluenceModel model) {
    sb.append("[\n");
    boolean first = true;
    EList<AbstractInfluence> _ownedInfluences = model.getOwnedInfluences();
    for (final AbstractInfluence abstractInfluence : _ownedInfluences) {
      if ((abstractInfluence instanceof Influence)) {
        final Influence influence = ((Influence) abstractInfluence);
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        this.appendInfluence(sb, model, influence);
      }
    }
    sb.append("\n  ]");
  }

  private void appendInfluence(final StringBuilder sb, final InfluenceModel model, final Influence influence) {
    sb.append("    {\n");
    sb.append("      \"name\": ").append(this.jsonString(influence.getName())).append(",\n");
    sb.append("      \"description\": ").append(this.jsonString(this.descriptionOf(influence))).append(",\n");
    String _xifexpression = null;
    SystemResponseProperty _outputSRP = influence.getOutputSRP();
    boolean _tripleNotEquals = (_outputSRP != null);
    if (_tripleNotEquals) {
      _xifexpression = influence.getOutputSRP().getName();
    } else {
      _xifexpression = null;
    }
    sb.append("      \"outputSRP\": ").append(this.jsonString(_xifexpression)).append(",\n");
    sb.append("      \"linkedCriteria\": ");
    Iterable<SatisfactionCriterion> _xifexpression_1 = null;
    SystemResponseProperty _outputSRP_1 = influence.getOutputSRP();
    boolean _tripleNotEquals_1 = (_outputSRP_1 != null);
    if (_tripleNotEquals_1) {
      _xifexpression_1 = this.criteriaConstraining(model, influence.getOutputSRP());
    } else {
      _xifexpression_1 = CollectionLiterals.<SatisfactionCriterion>newArrayList();
    }
    final Iterable<SatisfactionCriterion> criteria = _xifexpression_1;
    final Function1<SatisfactionCriterion, String> _function = (SatisfactionCriterion it) -> {
      return it.getName();
    };
    this.appendStringArray(sb, IterableExtensions.<SatisfactionCriterion, String>map(criteria, _function));
    sb.append(",\n");
    sb.append("      \"linkedRequirements\": ");
    final Function1<SatisfactionCriterion, String> _function_1 = (SatisfactionCriterion it) -> {
      return this.requirementLabel(it.getRequirementRef());
    };
    this.appendStringArray(sb, IterableExtensions.<SatisfactionCriterion, String>map(criteria, _function_1));
    sb.append(",\n");
    sb.append("      \"participants\": ");
    this.appendParticipants(sb, influence);
    sb.append(",\n");
    sb.append("      \"function\": ");
    this.appendInfluenceFunction(sb, influence.getOwnedInfluenceFunction());
    sb.append("\n");
    sb.append("    }");
  }

  private void appendParticipants(final StringBuilder sb, final Influence influence) {
    sb.append("[\n");
    boolean first = true;
    EList<Participant> _ownedParticipants = influence.getOwnedParticipants();
    for (final Participant participant : _ownedParticipants) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("        {\n");
        sb.append("          \"name\": ").append(this.jsonString(this.nameOf(participant))).append(",\n");
        sb.append("          \"type\": ").append(this.jsonString(participant.eClass().getName())).append(",\n");
        sb.append("          \"target\": ").append(this.jsonString(this.participantTargetName(participant))).append(",\n");
        sb.append("          \"confidence\": ").append(this.jsonNumber(this.doubleFeature(participant, "confidence"))).append(",\n");
        sb.append("          \"admissibleSpace\": ");
        this.appendAdmissibleSpace(sb, participant);
        sb.append("\n");
        sb.append("        }");
      }
    }
    sb.append("\n      ]");
  }

  private void appendInfluenceFunction(final StringBuilder sb, final InfluenceFunction function) {
    if ((function == null)) {
      sb.append("null");
      return;
    }
    sb.append("{\n");
    sb.append("        \"name\": ").append(this.jsonString(function.getName())).append(",\n");
    sb.append("        \"representations\": ");
    this.appendFunctionRepresentations(sb, function);
    sb.append("\n");
    sb.append("      }");
  }

  private void appendFunctionRepresentations(final StringBuilder sb, final InfluenceFunction function) {
    sb.append("[\n");
    boolean first = true;
    EList<FunctionRepresentation> _representations = function.getRepresentations();
    for (final FunctionRepresentation representation : _representations) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("          {\n");
        sb.append("            \"name\": ").append(this.jsonString(this.nameOf(representation))).append(",\n");
        sb.append("            \"type\": ").append(this.jsonString(representation.eClass().getName())).append(",\n");
        sb.append("            \"confidence\": ").append(this.jsonNumber(this.doubleFeature(representation, "confidence")));
        if ((representation instanceof AnalyticExpressionFunction)) {
          final AnalyticExpressionFunction analytic = ((AnalyticExpressionFunction) representation);
          sb.append(",\n");
          sb.append("            \"expression\": ").append(this.jsonString(analytic.getExpression())).append(",\n");
          sb.append("            \"expressionLanguage\": ").append(this.jsonString(String.valueOf(analytic.getExpressionLanguage())));
        } else {
          if ((representation instanceof NaturalLanguageFunction)) {
            sb.append(",\n");
            sb.append("            \"definition\": ").append(this.jsonString(this.stringFeature(representation, "definition")));
          } else {
            if ((representation instanceof ParticipantImpactFunction)) {
              final ParticipantImpactFunction impactFunction = ((ParticipantImpactFunction) representation);
              sb.append(",\n");
              sb.append("            \"participantContributions\": ");
              this.appendParticipantContributions(sb, impactFunction);
            } else {
              if ((representation instanceof MonotonicityTable)) {
                sb.append(",\n");
                sb.append("            \"rowsCount\": ").append(this.collectionSize(representation, "tableRows"));
              }
            }
          }
        }
        sb.append("\n");
        sb.append("          }");
      }
    }
    sb.append("\n        ]");
  }

  private void appendParticipantContributions(final StringBuilder sb, final ParticipantImpactFunction impactFunction) {
    sb.append("[\n");
    boolean first = true;
    EList<ParticipantRelativeImpact> _participantContribution = impactFunction.getParticipantContribution();
    for (final ParticipantRelativeImpact impact : _participantContribution) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("              {\n");
        String _xifexpression = null;
        Participant _participant = impact.getParticipant();
        boolean _tripleNotEquals = (_participant != null);
        if (_tripleNotEquals) {
          _xifexpression = this.nameOf(impact.getParticipant());
        } else {
          _xifexpression = null;
        }
        sb.append("                \"participant\": ").append(this.jsonString(_xifexpression)).append(",\n");
        String _xifexpression_1 = null;
        Participant _participant_1 = impact.getParticipant();
        boolean _tripleNotEquals_1 = (_participant_1 != null);
        if (_tripleNotEquals_1) {
          _xifexpression_1 = this.participantTargetName(impact.getParticipant());
        } else {
          _xifexpression_1 = null;
        }
        sb.append("                \"target\": ").append(this.jsonString(_xifexpression_1)).append(",\n");
        sb.append("                \"importance\": ").append(this.jsonNumber(impact.getImportance())).append(",\n");
        sb.append("                \"direction\": ").append(this.jsonString(String.valueOf(impact.getDirection()))).append(",\n");
        sb.append("                \"rationale\": ").append(this.jsonString(impact.getRationale())).append("\n");
        sb.append("              }");
      }
    }
    sb.append("\n            ]");
  }

  private void appendMetrics(final StringBuilder sb, final ImpactMetrics.Result metrics) {
    sb.append("{\n");
    sb.append("    \"impactArtifacts\": ");
    this.appendIntMap(sb, metrics.impactArtifacts);
    sb.append(",\n");
    sb.append("    \"impactEnvironmentalFactors\": ");
    this.appendIntMap(sb, metrics.impactEnvFactors);
    sb.append(",\n");
    sb.append("    \"sensitiveRequirements\": ");
    this.appendIntMap(sb, metrics.sensRequirements);
    sb.append(",\n");
    sb.append("    \"impactArtifactsWeighted\": ");
    this.appendDoubleMap(sb, metrics.impactArtifactsW);
    sb.append(",\n");
    sb.append("    \"impactEnvironmentalFactorsWeighted\": ");
    this.appendDoubleMap(sb, metrics.impactEnvFactorsW);
    sb.append(",\n");
    sb.append("    \"impactArtifactsPropagated\": ");
    this.appendIntMap(sb, metrics.impactArtifactsPropagated);
    sb.append(",\n");
    sb.append("    \"impactArtifactsIndirect\": ");
    this.appendIntMap(sb, metrics.impactArtifactsIndirect);
    sb.append(",\n");
    sb.append("    \"impactArtifactsPropagatedWeighted\": ");
    this.appendDoubleMap(sb, metrics.impactArtifactsPropagatedW);
    sb.append(",\n");
    sb.append("    \"impactEnvironmentalFactorsPropagated\": ");
    this.appendIntMap(sb, metrics.impactEnvFactorsPropagated);
    sb.append(",\n");
    sb.append("    \"impactEnvironmentalFactorsIndirect\": ");
    this.appendIntMap(sb, metrics.impactEnvFactorsIndirect);
    sb.append(",\n");
    sb.append("    \"impactEnvironmentalFactorsPropagatedWeighted\": ");
    this.appendDoubleMap(sb, metrics.impactEnvFactorsPropagatedW);
    sb.append("\n");
    sb.append("  }");
  }

  private void appendDeveloperViews(final StringBuilder sb, final InfluenceModel model) {
    final Map<String, DashboardDataExporter.DeveloperView> views = this.buildDeveloperViews(model);
    sb.append("[\n");
    boolean first = true;
    Collection<DashboardDataExporter.DeveloperView> _values = views.values();
    for (final DashboardDataExporter.DeveloperView view : _values) {
      {
        if ((!first)) {
          sb.append(",\n");
        }
        first = false;
        sb.append("    {\n");
        sb.append("      \"id\": ").append(this.jsonString(view.id)).append(",\n");
        sb.append("      \"displayName\": ").append(this.jsonString(view.id)).append(",\n");
        sb.append("      \"ownedArtifacts\": ");
        this.appendStringArray(sb, view.artifacts);
        sb.append(",\n");
        sb.append("      \"influences\": ");
        this.appendStringArray(sb, view.influences);
        sb.append(",\n");
        sb.append("      \"systemResponseProperties\": ");
        this.appendStringArray(sb, view.srps);
        sb.append(",\n");
        sb.append("      \"requirements\": ");
        this.appendStringArray(sb, view.requirements);
        sb.append("\n");
        sb.append("    }");
      }
    }
    sb.append("\n  ]");
  }

  private Map<String, DashboardDataExporter.DeveloperView> buildDeveloperViews(final InfluenceModel model) {
    final LinkedHashMap<String, DashboardDataExporter.DeveloperView> views = new LinkedHashMap<String, DashboardDataExporter.DeveloperView>();
    final LinkedHashMap<DesignArtifact, String> artifactOwners = new LinkedHashMap<DesignArtifact, String>();
    EList<DesignArtifact> _ownedArtifacts = model.getOwnedArtifacts();
    for (final DesignArtifact artifact : _ownedArtifacts) {
      {
        final String owner = this.ownerOfArtifact(artifact);
        artifactOwners.put(artifact, owner);
        this.getOrCreateView(views, owner).artifacts.add(artifact.getName());
      }
    }
    EList<AbstractInfluence> _ownedInfluences = model.getOwnedInfluences();
    for (final AbstractInfluence abstractInfluence : _ownedInfluences) {
      if ((abstractInfluence instanceof Influence)) {
        final Influence influence = ((Influence) abstractInfluence);
        final LinkedHashSet<String> linkedRequirements = this.requirementLabelsForInfluence(model, influence);
        EList<Participant> _ownedParticipants = influence.getOwnedParticipants();
        for (final Participant participant : _ownedParticipants) {
          if ((participant instanceof ArtifactParticipant)) {
            final DesignArtifact artifact_1 = ((ArtifactParticipant)participant).getTarget();
            if ((artifact_1 != null)) {
              String _xifexpression = null;
              boolean _containsKey = artifactOwners.containsKey(artifact_1);
              if (_containsKey) {
                _xifexpression = artifactOwners.get(artifact_1);
              } else {
                _xifexpression = this.ownerOfArtifact(artifact_1);
              }
              final String owner = _xifexpression;
              final DashboardDataExporter.DeveloperView view = this.getOrCreateView(views, owner);
              view.influences.add(influence.getName());
              SystemResponseProperty _outputSRP = influence.getOutputSRP();
              boolean _tripleNotEquals = (_outputSRP != null);
              if (_tripleNotEquals) {
                view.srps.add(influence.getOutputSRP().getName());
              }
              view.requirements.addAll(linkedRequirements);
            }
          }
        }
      }
    }
    return views;
  }

  private DashboardDataExporter.DeveloperView getOrCreateView(final Map<String, DashboardDataExporter.DeveloperView> views, final String id) {
    String _xifexpression = null;
    if (((id == null) || id.trim().isEmpty())) {
      _xifexpression = "Unknown";
    } else {
      _xifexpression = id;
    }
    final String safeId = _xifexpression;
    DashboardDataExporter.DeveloperView view = views.get(safeId);
    if ((view == null)) {
      DashboardDataExporter.DeveloperView _developerView = new DashboardDataExporter.DeveloperView(safeId);
      view = _developerView;
      views.put(safeId, view);
    }
    return view;
  }

  private LinkedHashSet<String> requirementLabelsForInfluence(final InfluenceModel model, final Influence influence) {
    final LinkedHashSet<String> out = new LinkedHashSet<String>();
    if (((influence != null) && (influence.getOutputSRP() != null))) {
      Iterable<SatisfactionCriterion> _criteriaConstraining = this.criteriaConstraining(model, influence.getOutputSRP());
      for (final SatisfactionCriterion criterion : _criteriaConstraining) {
        out.add(this.requirementLabel(criterion.getRequirementRef()));
      }
    }
    return out;
  }

  private String buildGraphData(final GraphBuilder.Result graphBundle) {
    final StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("  \"nodes\": [\n");
    Set<String> _keySet = graphBundle.vertexLabels.keySet();
    final ArrayList<String> nodes = new ArrayList<String>(_keySet);
    Collections.<String>sort(nodes);
    boolean firstNode = true;
    for (final String nodeId : nodes) {
      {
        if ((!firstNode)) {
          sb.append(",\n");
        }
        firstNode = false;
        sb.append("    {\n");
        sb.append("      \"id\": ").append(this.jsonString(nodeId)).append(",\n");
        sb.append("      \"label\": ").append(this.jsonString(graphBundle.vertexLabels.get(nodeId))).append(",\n");
        sb.append("      \"type\": ").append(this.jsonString(this.nodeType(nodeId))).append(",\n");
        sb.append("      \"origin\": ").append(this.jsonString(graphBundle.nodeToOrigin.get(nodeId))).append(",\n");
        sb.append("      \"sourceModel\": ").append(this.jsonString(graphBundle.nodeSourceModel.get(nodeId))).append("\n");
        sb.append("    }");
      }
    }
    sb.append("\n  ],\n");
    sb.append("  \"edges\": [\n");
    boolean firstEdge = true;
    Set<DefaultEdge> _edgeSet = graphBundle.graph.edgeSet();
    for (final DefaultEdge edge : _edgeSet) {
      {
        if ((!firstEdge)) {
          sb.append(",\n");
        }
        firstEdge = false;
        final String source = graphBundle.graph.getEdgeSource(edge);
        final String target = graphBundle.graph.getEdgeTarget(edge);
        sb.append("    {\n");
        sb.append("      \"source\": ").append(this.jsonString(source)).append(",\n");
        sb.append("      \"target\": ").append(this.jsonString(target)).append(",\n");
        sb.append("      \"label\": ").append(this.jsonString(graphBundle.edgeLabels.get(edge))).append(",\n");
        sb.append("      \"origin\": ").append(this.jsonString(graphBundle.edgeToOrigin.get(edge))).append(",\n");
        sb.append("      \"weight\": ").append(this.jsonNumber(graphBundle.edgeWeights.get(edge))).append("\n");
        sb.append("    }");
      }
    }
    sb.append("\n  ]\n");
    sb.append("}\n");
    return sb.toString();
  }

  private Iterable<SatisfactionCriterion> criteriaConstraining(final InfluenceModel model, final SystemResponseProperty srp) {
    final ArrayList<SatisfactionCriterion> out = new ArrayList<SatisfactionCriterion>();
    if (((model != null) && (srp != null))) {
      EList<SatisfactionCriterion> _ownedSatisfactionCriteria = model.getOwnedSatisfactionCriteria();
      for (final SatisfactionCriterion criterion : _ownedSatisfactionCriteria) {
        if (((criterion.getConstrainedSRPs() != null) && criterion.getConstrainedSRPs().contains(srp))) {
          out.add(criterion);
        }
      }
    }
    return out;
  }

  private boolean hasAnalyticFunction(final Influence influence) {
    if (((influence == null) || (influence.getOwnedInfluenceFunction() == null))) {
      return false;
    }
    EList<FunctionRepresentation> _representations = influence.getOwnedInfluenceFunction().getRepresentations();
    boolean _tripleEquals = (_representations == null);
    if (_tripleEquals) {
      return false;
    }
    EList<FunctionRepresentation> _representations_1 = influence.getOwnedInfluenceFunction().getRepresentations();
    for (final FunctionRepresentation representation : _representations_1) {
      if ((representation instanceof AnalyticExpressionFunction)) {
        return true;
      }
    }
    return false;
  }

  private String participantTargetName(final Participant participant) {
    if ((participant instanceof ArtifactParticipant)) {
      String _xifexpression = null;
      DesignArtifact _target = ((ArtifactParticipant)participant).getTarget();
      boolean _tripleNotEquals = (_target != null);
      if (_tripleNotEquals) {
        _xifexpression = ((ArtifactParticipant)participant).getTarget().getName();
      } else {
        _xifexpression = null;
      }
      return _xifexpression;
    }
    if ((participant instanceof EnvironmentalFactorParticipant)) {
      String _xifexpression_1 = null;
      EnvironmentalFactor _target_1 = ((EnvironmentalFactorParticipant)participant).getTarget();
      boolean _tripleNotEquals_1 = (_target_1 != null);
      if (_tripleNotEquals_1) {
        _xifexpression_1 = ((EnvironmentalFactorParticipant)participant).getTarget().getName();
      } else {
        _xifexpression_1 = null;
      }
      return _xifexpression_1;
    }
    if ((participant instanceof SRPInputParticipant)) {
      String _xifexpression_2 = null;
      SystemResponseProperty _target_2 = ((SRPInputParticipant)participant).getTarget();
      boolean _tripleNotEquals_2 = (_target_2 != null);
      if (_tripleNotEquals_2) {
        _xifexpression_2 = ((SRPInputParticipant)participant).getTarget().getName();
      } else {
        _xifexpression_2 = null;
      }
      return _xifexpression_2;
    }
    return null;
  }

  private void appendAdmissibleSpace(final StringBuilder sb, final EObject participant) {
    final EObject value = this.objectFeature(participant, "admissibleSpace");
    if ((value == null)) {
      sb.append("null");
      return;
    }
    sb.append("{\n");
    sb.append("            \"type\": ").append(this.jsonString(value.eClass().getName())).append(",\n");
    sb.append("            \"lower\": ").append(this.jsonNumber(this.firstDoubleFeature(value, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("lower", "lowerBound", "min", "minimum"))))).append(",\n");
    sb.append("            \"upper\": ").append(this.jsonNumber(this.firstDoubleFeature(value, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("upper", "upperBound", "max", "maximum"))))).append(",\n");
    sb.append("            \"nominal\": ").append(this.jsonNumber(this.firstDoubleFeature(value, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("nominal", "nominalValue"))))).append(",\n");
    sb.append("            \"step\": ").append(this.jsonNumber(this.firstDoubleFeature(value, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("step", "stepSize"))))).append(",\n");
    sb.append("            \"unit\": ").append(this.jsonString(this.firstStringFeature(value, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("unit"))))).append("\n");
    sb.append("          }");
  }

  private String ownerOfArtifact(final DesignArtifact artifact) {
    if ((artifact == null)) {
      return "Unknown";
    }
    final String refLabel = this.externalReferenceLabel(artifact.getRef());
    if (((refLabel != null) && refLabel.contains("."))) {
      return refLabel.substring(0, refLabel.indexOf("."));
    }
    final String uri = this.uriOf(artifact.getRef());
    if (((uri != null) && (!uri.trim().isEmpty()))) {
      int _lastIndexOf = uri.lastIndexOf("/");
      int _plus = (_lastIndexOf + 1);
      final String simple = uri.substring(_plus);
      final int dot = simple.indexOf(".");
      if ((dot > 0)) {
        return simple.substring(0, dot);
      }
      return simple;
    }
    return "Unknown";
  }

  private String externalReferenceLabel(final EObject obj) {
    if ((obj == null)) {
      return null;
    }
    final ArrayList<String> names = new ArrayList<String>();
    EObject current = obj;
    while ((current != null)) {
      {
        final String n = this.nameOf(current);
        if (((n != null) && (!n.trim().isEmpty()))) {
          names.add(0, n);
        }
        current = current.eContainer();
      }
    }
    boolean _isEmpty = names.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      return IterableExtensions.join(names, ".");
    }
    return this.uriOf(obj);
  }

  private String requirementLabel(final EObject requirementRef) {
    final String label = this.externalReferenceLabel(requirementRef);
    if (((label == null) || label.trim().isEmpty())) {
      return "UnknownRequirement";
    }
    return label;
  }

  private String uriOf(final EObject obj) {
    if ((obj == null)) {
      return null;
    }
    try {
      final URI uri = EcoreUtil.getURI(obj);
      if ((uri != null)) {
        return uri.toString();
      }
    } catch (final Throwable _t) {
      if (_t instanceof Throwable) {
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }

  private String descriptionOf(final EObject obj) {
    return this.stringFeature(obj, "description");
  }

  private String nameOf(final EObject obj) {
    return this.stringFeature(obj, "name");
  }

  private EObject objectFeature(final EObject obj, final String featureName) {
    if (((obj == null) || (featureName == null))) {
      return null;
    }
    final EStructuralFeature feature = obj.eClass().getEStructuralFeature(featureName);
    if (((feature == null) || (!obj.eIsSet(feature)))) {
      return null;
    }
    final Object value = obj.eGet(feature);
    if ((value instanceof EObject)) {
      return ((EObject) value);
    }
    return null;
  }

  private String stringFeature(final EObject obj, final String featureName) {
    if (((obj == null) || (featureName == null))) {
      return null;
    }
    final EStructuralFeature feature = obj.eClass().getEStructuralFeature(featureName);
    if (((feature == null) || (!obj.eIsSet(feature)))) {
      return null;
    }
    final Object value = obj.eGet(feature);
    if ((value != null)) {
      return String.valueOf(value);
    }
    return null;
  }

  private Double doubleFeature(final EObject obj, final String featureName) {
    if (((obj == null) || (featureName == null))) {
      return null;
    }
    final EStructuralFeature feature = obj.eClass().getEStructuralFeature(featureName);
    if (((feature == null) || (!obj.eIsSet(feature)))) {
      return null;
    }
    final Object value = obj.eGet(feature);
    if ((value instanceof Number)) {
      return Double.valueOf(((Number) value).doubleValue());
    }
    if ((value instanceof String)) {
      try {
        return Double.valueOf(Double.parseDouble(((String) value)));
      } catch (final Throwable _t) {
        if (_t instanceof Throwable) {
          return null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return null;
  }

  private Double firstDoubleFeature(final EObject obj, final Iterable<String> featureNames) {
    for (final String featureName : featureNames) {
      {
        final Double value = this.doubleFeature(obj, featureName);
        if ((value != null)) {
          return value;
        }
      }
    }
    return null;
  }

  private String firstStringFeature(final EObject obj, final Iterable<String> featureNames) {
    for (final String featureName : featureNames) {
      {
        final String value = this.stringFeature(obj, featureName);
        if ((value != null)) {
          return value;
        }
      }
    }
    return null;
  }

  private int collectionSize(final EObject obj, final String featureName) {
    if (((obj == null) || (featureName == null))) {
      return 0;
    }
    final EStructuralFeature feature = obj.eClass().getEStructuralFeature(featureName);
    if (((feature == null) || (!obj.eIsSet(feature)))) {
      return 0;
    }
    final Object value = obj.eGet(feature);
    if ((value instanceof Collection<?>)) {
      return ((Collection<?>) value).size();
    }
    if ((value != null)) {
      return 1;
    }
    return 0;
  }

  private String nodeType(final String nodeId) {
    if ((nodeId == null)) {
      return "Unknown";
    }
    boolean _startsWith = nodeId.startsWith("A:");
    if (_startsWith) {
      return "Artifact";
    }
    boolean _startsWith_1 = nodeId.startsWith("E:");
    if (_startsWith_1) {
      return "EnvironmentalFactor";
    }
    boolean _startsWith_2 = nodeId.startsWith("SR:");
    if (_startsWith_2) {
      return "SystemResponseProperty";
    }
    boolean _startsWith_3 = nodeId.startsWith("I:");
    if (_startsWith_3) {
      return "Influence";
    }
    boolean _startsWith_4 = nodeId.startsWith("R:");
    if (_startsWith_4) {
      return "Requirement";
    }
    return "Unknown";
  }

  private void appendStringArray(final StringBuilder sb, final Iterable<String> values) {
    sb.append("[");
    boolean first = true;
    for (final String value : values) {
      {
        if ((!first)) {
          sb.append(", ");
        }
        first = false;
        sb.append(this.jsonString(value));
      }
    }
    sb.append("]");
  }

  private void appendIntMap(final StringBuilder sb, final Map<String, Integer> map) {
    sb.append("{");
    if ((map != null)) {
      Set<String> _keySet = map.keySet();
      final ArrayList<String> keys = new ArrayList<String>(_keySet);
      Collections.<String>sort(keys);
      boolean first = true;
      for (final String key : keys) {
        {
          if ((!first)) {
            sb.append(", ");
          }
          first = false;
          sb.append(this.jsonString(key));
          sb.append(": ");
          sb.append(map.get(key));
        }
      }
    }
    sb.append("}");
  }

  private void appendDoubleMap(final StringBuilder sb, final Map<String, Double> map) {
    sb.append("{");
    if ((map != null)) {
      Set<String> _keySet = map.keySet();
      final ArrayList<String> keys = new ArrayList<String>(_keySet);
      Collections.<String>sort(keys);
      boolean first = true;
      for (final String key : keys) {
        {
          if ((!first)) {
            sb.append(", ");
          }
          first = false;
          sb.append(this.jsonString(key));
          sb.append(": ");
          sb.append(this.jsonNumber(map.get(key)));
        }
      }
    }
    sb.append("}");
  }

  private String jsonString(final String value) {
    if ((value == null)) {
      return "null";
    }
    final String escaped = value.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    return (("\"" + escaped) + "\"");
  }

  private String jsonNumber(final Double value) {
    if ((value == null)) {
      return "null";
    }
    if ((Double.isNaN(value.doubleValue()) || Double.isInfinite(value.doubleValue()))) {
      return "null";
    }
    return String.format(Locale.US, "%.6f", Double.valueOf(value.doubleValue()));
  }

  private String jsonNumber(final double value) {
    if ((Double.isNaN(value) || Double.isInfinite(value))) {
      return "null";
    }
    return String.format(Locale.US, "%.6f", Double.valueOf(value));
  }
}
