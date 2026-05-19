package fr.inria.kairos.influence.export;

import fr.inria.kairos.influence.analysis.CandidateCompensatorAnalyzer;
import fr.inria.kairos.influence.analysis.ImpactMetrics;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class MetricsReportExporter {
  public void export(final ImpactMetrics.Result metrics, final CandidateCompensatorAnalyzer.Result compensators, final IFileSystemAccess2 fsa, final String outPath) {
    final StringBuilder reportBuilder = new StringBuilder("Metrics on the Influences:\n");
    final InfoExporter infoExporter = new InfoExporter();
    reportBuilder.append("\nImpact of Artifacts (origin count):\n");
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>(metrics.impactArtifacts);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap);
    reportBuilder.append("\nImpact of Environment Factor (origin count):\n");
    HashMap<String, Integer> _hashMap_1 = new HashMap<String, Integer>(metrics.impactEnvFactors);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_1);
    reportBuilder.append("\nImpact of Artifacts Propagated (origin count):\n");
    HashMap<String, Integer> _hashMap_2 = new HashMap<String, Integer>(metrics.impactArtifactsPropagated);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_2);
    reportBuilder.append("\nImpact of Environment Factor Propagated (origin count):\n");
    HashMap<String, Integer> _hashMap_3 = new HashMap<String, Integer>(metrics.impactEnvFactorsPropagated);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_3);
    reportBuilder.append("\nSensibility of Requirements (counts):\n");
    HashMap<String, Integer> _hashMap_4 = new HashMap<String, Integer>(metrics.sensRequirements);
    infoExporter.appendSortedIntMap(reportBuilder, _hashMap_4);
    reportBuilder.append("\nImpact of Artifacts Propagated (weighted):\n");
    HashMap<String, Double> _hashMap_5 = new HashMap<String, Double>(metrics.impactArtifactsPropagatedW);
    infoExporter.appendSortedDoubleMap(reportBuilder, _hashMap_5);
    reportBuilder.append("\nImpact of Environment Factor Propagated (weighted):\n");
    HashMap<String, Double> _hashMap_6 = new HashMap<String, Double>(metrics.impactEnvFactorsPropagatedW);
    infoExporter.appendSortedDoubleMap(reportBuilder, _hashMap_6);
    this.appendCandidateCompensators(reportBuilder, compensators);
    fsa.generateFile(outPath, reportBuilder.toString());
  }

  private void appendCandidateCompensators(final StringBuilder reportBuilder, final CandidateCompensatorAnalyzer.Result compensators) {
    reportBuilder.append("\nCandidate potential beneficial changes on participants traced per requirement:\n");
    Set<Map.Entry<String, Map<String, Integer>>> _entrySet = compensators.candidatesByRequirement.entrySet();
    for (final Map.Entry<String, Map<String, Integer>> entry : _entrySet) {
      {
        final String requirementName = entry.getKey();
        final Map<String, Integer> candidates = entry.getValue();
        final List<Map.Entry<String, Integer>> items = IterableExtensions.<Map.Entry<String, Integer>>toList(candidates.entrySet());
        final Comparator<Map.Entry<String, Integer>> _function = (Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> {
          int _xblockexpression = (int) 0;
          {
            final int cmp = Integer.compare((a.getValue()).intValue(), (b.getValue()).intValue());
            int _xifexpression = (int) 0;
            if ((cmp != 0)) {
              _xifexpression = cmp;
            } else {
              _xifexpression = a.getKey().compareTo(b.getKey());
            }
            _xblockexpression = _xifexpression;
          }
          return _xblockexpression;
        };
        items.sort(_function);
        reportBuilder.append("  ").append(requirementName).append(": ");
        boolean _isEmpty = items.isEmpty();
        if (_isEmpty) {
          reportBuilder.append("(none)\n");
        } else {
          final Function1<Map.Entry<String, Integer>, String> _function_1 = (Map.Entry<String, Integer> e) -> {
            String _xblockexpression = null;
            {
              final Integer hop = e.getValue();
              String _xifexpression = null;
              if (((hop).intValue() == 1)) {
                _xifexpression = "";
              } else {
                _xifexpression = "s";
              }
              final String plural = _xifexpression;
              String _key = e.getKey();
              String _plus = (_key + " (");
              String _plus_1 = (_plus + hop);
              String _plus_2 = (_plus_1 + " hop");
              String _plus_3 = (_plus_2 + plural);
              _xblockexpression = (_plus_3 + ")");
            }
            return _xblockexpression;
          };
          final List<String> parts = ListExtensions.<Map.Entry<String, Integer>, String>map(items, _function_1);
          reportBuilder.append(IterableExtensions.join(parts, ", ")).append("\n");
        }
      }
    }
  }
}
