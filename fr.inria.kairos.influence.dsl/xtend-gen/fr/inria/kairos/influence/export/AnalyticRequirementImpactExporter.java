package fr.inria.kairos.influence.export;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.analysis.AnalyticRequirementImpactAnalyzer;
import fr.inria.kairos.influence.analysis.DesignValueArtifacts;
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.FunctionRepresentation;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class AnalyticRequirementImpactExporter {
  private static final double TOL = 1e-12;

  public void export(final Resource resource, final IFileSystemAccess2 fsa, final String outputPath) {
    final StringBuilder report = new StringBuilder();
    report.append("Analytic Requirement Impact Analysis\n");
    report.append("====================================\n\n");
    if (((resource == null) || resource.getContents().isEmpty())) {
      report.append("No resource content. Nothing to analyze.\n");
      fsa.generateFile(outputPath, report.toString());
      return;
    }
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    boolean _not = (!(_head instanceof InfluenceModel));
    if (_not) {
      report.append("Root object is not an InfluenceModel. Nothing to analyze.\n");
      fsa.generateFile(outputPath, report.toString());
      return;
    }
    EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
    final InfluenceModel model = ((InfluenceModel) _head_1);
    final Map<String, Double> scenario = this.buildScenario(model, report);
    final ArrayList<AnalyticRequirementImpactAnalyzer.CriterionAnalysisResult> allCriterionResults = new ArrayList<AnalyticRequirementImpactAnalyzer.CriterionAnalysisResult>();
    report.append("\n\nAnalytic influence evaluations\n");
    report.append("==============================\n\n");
    Iterable<Influence> _filter = Iterables.<Influence>filter(model.getOwnedInfluences(), Influence.class);
    for (final Influence influence : _filter) {
      boolean _hasAnalyticRepresentation = this.hasAnalyticRepresentation(influence);
      if (_hasAnalyticRepresentation) {
        report.append("------------------------------------------------------------\n");
        report.append("Influence: ").append(influence.getName()).append("\n");
        report.append("------------------------------------------------------------\n\n");
        try {
          final AnalyticRequirementImpactAnalyzer.MultiCriterionAnalysisResult result = AnalyticRequirementImpactAnalyzer.evaluateInfluenceForAllRequirements(model, influence, scenario);
          report.append(result.trace).append("\n");
          allCriterionResults.addAll(result.resultsByCriterion.values());
        } catch (final Throwable _t) {
          if (_t instanceof Throwable) {
            final Throwable t = (Throwable)_t;
            report.append("ERROR while evaluating influence ").append(influence.getName()).append(": ").append(t.getClass().getSimpleName()).append(" - ").append(t.getMessage()).append("\n\n");
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      } else {
        report.append("Skipping influence ").append(influence.getName()).append(": no AnalyticExpressionFunction representation.\n\n");
      }
    }
    this.appendGlobalTradeoffSummary(allCriterionResults, report);
    fsa.generateFile(outputPath, report.toString());
  }

  private Map<String, Double> buildScenario(final InfluenceModel model, final StringBuilder report) {
    final LinkedHashMap<String, Double> scenario = new LinkedHashMap<String, Double>();
    report.append("Scenario construction\n");
    report.append("=====================\n\n");
    report.append("Artifact values extracted from DesignArtifact.ref:\n");
    EList<DesignArtifact> _ownedArtifacts = model.getOwnedArtifacts();
    for (final DesignArtifact artifact : _ownedArtifacts) {
      {
        final Double value = this.readArtifactNumericValue(artifact);
        if ((value != null)) {
          scenario.put(artifact.getName(), value);
          report.append("  ").append(artifact.getName()).append(" = ").append(String.format(Locale.US, "%.6f", value)).append("\n");
        } else {
          report.append("  ").append(artifact.getName()).append(" = <missing numeric value from referenced EObject>\n");
        }
      }
    }
    report.append("\nEnvironmental factors:\n");
    report.append("  Values are taken from EnvironmentalFactorParticipant.admissibleSpace when available.\n");
    report.append("  If a factor has no admissibleSpace and no scenario value, the analytic evaluation will fail for that influence.\n");
    return scenario;
  }

  private Double readArtifactNumericValue(final DesignArtifact artifact) {
    if (((artifact == null) || (artifact.getRef() == null))) {
      return null;
    }
    try {
      final OptionalDouble optional = DesignValueArtifacts.resolveNumeric(artifact.getRef());
      if (((optional != null) && optional.isPresent())) {
        return Double.valueOf(optional.getAsDouble());
      }
    } catch (final Throwable _t) {
      if (_t instanceof Throwable) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }

  private boolean hasAnalyticRepresentation(final Influence influence) {
    if (((influence == null) || (influence.getOwnedInfluenceFunction() == null))) {
      return false;
    }
    EList<FunctionRepresentation> _representations = influence.getOwnedInfluenceFunction().getRepresentations();
    boolean _tripleEquals = (_representations == null);
    if (_tripleEquals) {
      return false;
    }
    final Function1<FunctionRepresentation, Boolean> _function = (FunctionRepresentation it) -> {
      return Boolean.valueOf((it instanceof AnalyticExpressionFunction));
    };
    return IterableExtensions.<FunctionRepresentation>exists(influence.getOwnedInfluenceFunction().getRepresentations(), _function);
  }

  private void appendGlobalTradeoffSummary(final Iterable<AnalyticRequirementImpactAnalyzer.CriterionAnalysisResult> results, final StringBuilder report) {
    final LinkedHashMap<String, Set<String>> benefits = new LinkedHashMap<String, Set<String>>();
    final LinkedHashMap<String, Set<String>> prejudices = new LinkedHashMap<String, Set<String>>();
    final LinkedHashMap<String, Set<String>> neutral = new LinkedHashMap<String, Set<String>>();
    for (final AnalyticRequirementImpactAnalyzer.CriterionAnalysisResult result : results) {
      {
        String _xifexpression = null;
        if ((result.requirementLabel != null)) {
          _xifexpression = result.requirementLabel;
        } else {
          _xifexpression = "<unknown-requirement>";
        }
        final String requirement = _xifexpression;
        Set<Map.Entry<String, Double>> _entrySet = result.grad.entrySet();
        for (final Map.Entry<String, Double> entry : _entrySet) {
          {
            final String variable = entry.getKey();
            final Double gradient = entry.getValue();
            double _abs = Math.abs((gradient).doubleValue());
            boolean _lessThan = (_abs < AnalyticRequirementImpactExporter.TOL);
            if (_lessThan) {
              this.addToSet(neutral, variable, requirement);
            } else {
              if (((gradient).doubleValue() > 0.0)) {
                this.addToSet(benefits, variable, requirement);
              } else {
                this.addToSet(prejudices, variable, requirement);
              }
            }
          }
        }
      }
    }
    final TreeSet<String> variables = new TreeSet<String>();
    variables.addAll(benefits.keySet());
    variables.addAll(prejudices.keySet());
    variables.addAll(neutral.keySet());
    report.append("\n\nGlobal cross-requirement trade-off summary\n");
    report.append("==========================================\n\n");
    int conflictCount = 0;
    for (final String variable : variables) {
      {
        final Set<String> b = benefits.get(variable);
        final Set<String> p = prejudices.get(variable);
        if (((((b != null) && (!b.isEmpty())) && (p != null)) && (!p.isEmpty()))) {
          conflictCount++;
          report.append("Variable ").append(variable).append(" benefits ").append(b).append(" but prejudices ").append(p).append(".\n");
        }
      }
    }
    if ((conflictCount == 0)) {
      report.append("No cross-requirement trade-off detected from analytic evaluations.\n");
    }
    report.append("\nInterpretation:\n");
    report.append("  positive dM/dx => increasing x helps satisfaction\n");
    report.append("  negative dM/dx => increasing x hurts satisfaction\n");
    report.append("  M >= 0 => satisfied\n");
    report.append("  M < 0  => violated\n");
  }

  private void addToSet(final Map<String, Set<String>> map, final String key, final String value) {
    Set<String> set = map.get(key);
    if ((set == null)) {
      LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>();
      set = _linkedHashSet;
      map.put(key, set);
    }
    set.add(value);
  }
}
