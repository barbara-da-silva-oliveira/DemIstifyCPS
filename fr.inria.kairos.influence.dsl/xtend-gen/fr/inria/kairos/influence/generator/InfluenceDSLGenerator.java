package fr.inria.kairos.influence.generator;

import fr.inria.kairos.influence.analysis.ChartGenerator;
import fr.inria.kairos.influence.analysis.CompensationFinder;
import fr.inria.kairos.influence.analysis.ImpactMetrics;
import fr.inria.kairos.influence.analysis.RequirementTraceability;
import fr.inria.kairos.influence.analysis.StakeholdersOwner;
import fr.inria.kairos.influence.analysis.TradeOff;
import fr.inria.kairos.influence.export.DotExporter;
import fr.inria.kairos.influence.export.GraphBuilder;
import fr.inria.kairos.influence.export.InfoExporter;
import fr.inria.kairos.influence.export.JsonExporter;
import fr.inria.kairos.influence.export.TablesExporter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

@SuppressWarnings("all")
public class InfluenceDSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final GraphBuilder gb = new GraphBuilder();
    final GraphBuilder.Result built = gb.build(resource);
    final DefaultDirectedGraph<String, DefaultEdge> graph = built.graph;
    final Map<String, String> vertexLabels = built.vertexLabels;
    final Map<DefaultEdge, String> edgeLabels = built.edgeLabels;
    final Map<String, LinkedHashSet<String>> inEdges = built.inEdges;
    final Map<String, LinkedHashSet<String>> reqToSRs = built.reqToSRs;
    new DotExporter().exportGraphToDot(graph, vertexLabels, edgeLabels, fsa, "graph/influenceHypergraph.dot");
    new JsonExporter().exportInfluences(resource, fsa);
    final ImpactMetrics.Result metrics = new ImpactMetrics().compute(resource);
    final StringBuilder sb = new StringBuilder("Metrics on the Influences:\n");
    final InfoExporter out = new InfoExporter();
    sb.append("\nImpact of Artifacts (origin count):\n");
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>(metrics.impactArtifacts);
    out.appendSortedIntMap(sb, _hashMap);
    sb.append("\nImpact of Phenomena (origin count):\n");
    HashMap<String, Integer> _hashMap_1 = new HashMap<String, Integer>(metrics.impactPhenomena);
    out.appendSortedIntMap(sb, _hashMap_1);
    sb.append("\nSensibility of Requirements (counts):\n");
    HashMap<String, Integer> _hashMap_2 = new HashMap<String, Integer>(metrics.sensRequirements);
    out.appendSortedIntMap(sb, _hashMap_2);
    sb.append("\nImpact of Artifacts (likelihood-weighted):\n");
    HashMap<String, Double> _hashMap_3 = new HashMap<String, Double>(metrics.impactArtifactsW);
    out.appendSortedDoubleMap(sb, _hashMap_3);
    sb.append("\nImpact of Phenomena (likelihood-weighted):\n");
    HashMap<String, Double> _hashMap_4 = new HashMap<String, Double>(metrics.impactPhenomenaW);
    out.appendSortedDoubleMap(sb, _hashMap_4);
    sb.append("\nSensibility of Requirements (priority-weighted):\n");
    HashMap<String, Double> _hashMap_5 = new HashMap<String, Double>(metrics.sensRequirementsW);
    out.appendSortedDoubleMap(sb, _hashMap_5);
    sb.append("\nCandidate of compensators traced per requirement:\n");
    final RequirementTraceability trace = new RequirementTraceability();
    Set<String> _keySet = reqToSRs.keySet();
    TreeSet<String> _treeSet = new TreeSet<String>(_keySet);
    for (final String reqName : _treeSet) {
      {
        final HashMap<String, Integer> agg = new HashMap<String, Integer>();
        final LinkedHashSet<String> srs = reqToSRs.get(reqName);
        if ((srs != null)) {
          for (final String srName : srs) {
            {
              final HashMap<String, Integer> m = trace.upstreamArtifacts(("SR:" + srName), inEdges);
              Set<Map.Entry<String, Integer>> _entrySet = m.entrySet();
              for (final Map.Entry<String, Integer> e : _entrySet) {
                {
                  final Integer prev = agg.get(e.getKey());
                  if (((prev == null) || (e.getValue().compareTo(prev) < 0))) {
                    agg.put(e.getKey(), e.getValue());
                  }
                }
              }
            }
          }
        }
        Set<Map.Entry<String, Integer>> _entrySet = agg.entrySet();
        final ArrayList<Map.Entry<String, Integer>> items = new ArrayList<Map.Entry<String, Integer>>(_entrySet);
        final Comparator<Map.Entry<String, Integer>> _function = (Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> {
          int _xblockexpression = (int) 0;
          {
            final int c = Integer.compare((a.getValue()).intValue(), (b.getValue()).intValue());
            int _xifexpression = (int) 0;
            if ((c != 0)) {
              _xifexpression = c;
            } else {
              _xifexpression = a.getKey().compareTo(b.getKey());
            }
            _xblockexpression = _xifexpression;
          }
          return _xblockexpression;
        };
        items.sort(_function);
        sb.append("  ").append(reqName).append(": ");
        boolean _isEmpty = items.isEmpty();
        if (_isEmpty) {
          sb.append("(none)\n");
        } else {
          final Function1<Map.Entry<String, Integer>, String> _function_1 = (Map.Entry<String, Integer> it) -> {
            String _key = it.getKey();
            String _plus = (_key + " (");
            Integer _value = it.getValue();
            String _plus_1 = (_plus + _value);
            String _plus_2 = (_plus_1 + " hop");
            String _xifexpression = null;
            Integer _value_1 = it.getValue();
            boolean _equals = ((_value_1).intValue() == 1);
            if (_equals) {
              _xifexpression = "";
            } else {
              _xifexpression = "s";
            }
            String _plus_3 = (_plus_2 + _xifexpression);
            return (_plus_3 + ")");
          };
          final String line = IterableExtensions.join(ListExtensions.<Map.Entry<String, Integer>, String>map(items, _function_1), ", ");
          sb.append(line).append("\n");
        }
      }
    }
    new CompensationFinder().appendCompensatorsByChangeability(resource, sb, reqToSRs, inEdges);
    final CompensationFinder cfinder = new CompensationFinder();
    final Map<String, Pair<String, Double>> hardest = cfinder.bestCompensatorByChangeability(resource, reqToSRs, inEdges);
    sb.append("\nLess costly compensator per requirement:\n");
    Set<String> _keySet_1 = hardest.keySet();
    TreeSet<String> _treeSet_1 = new TreeSet<String>(_keySet_1);
    for (final String reqName_1 : _treeSet_1) {
      {
        final Pair<String, Double> p = hardest.get(reqName_1);
        final String name = p.getKey();
        final Double cval = p.getValue();
        sb.append("  ").append(reqName_1).append(": ").append(name).append(" (changeability=").append(String.format(Locale.US, "%.2f", cval)).append(")\n");
      }
    }
    final ChartGenerator charts = new ChartGenerator();
    charts.exportImpactBarPng(resource, fsa, "charts/impactArtifact.png", 1100, 650);
    charts.exportPropagationImpactBarPng(resource, fsa, "charts/impactPropagationArtifact.png", 1100, 650);
    charts.exportPhenomenaBarPng(resource, fsa, "charts/impactPhenomena.png", 1100, 650);
    final List<ChartGenerator.InfRow> perInf = charts.exportInfluenceBubblesPng(resource, reqToSRs, inEdges, fsa, 
      "charts/influence_compensation_bubbles.png", 1200, 900);
    boolean _isEmpty = perInf.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      sb.append("\n Less costly compensator per influence (originator -> compensator, changeability):\n");
      for (final ChartGenerator.InfRow r : perInf) {
        sb.append("  ").append(r.originator).append(" -> ").append(r.compensator).append("  (").append(String.format(Locale.US, "%.2f", Double.valueOf(r.changeability))).append(")\n");
      }
    }
    final TablesExporter tables = new TablesExporter();
    final RequirementTraceability.TraceData traceData = new RequirementTraceability().buildTrace(resource);
    final TradeOff trade = new TradeOff();
    trade.exportCSV(resource, fsa, "tables/tradeoffs_compensator_is_originator.csv", traceData.reqToSRs, traceData.inEdges);
    tables.exportCandidatesByReqCSV(resource, fsa, "tables/candidates_by_req.csv", 
      traceData.reqToSRs, traceData.inEdges);
    tables.exportCompensatorRankingByReqCSV(resource, fsa, "tables/compensator_ranking_by_req.csv", 
      traceData.reqToSRs, traceData.inEdges);
    tables.exportHardestCompensatorByReqCSV(resource, fsa, "tables/best_compensator_by_req.csv", 
      traceData.reqToSRs, traceData.inEdges);
    new StakeholdersOwner().exportCSV(resource, fsa, "tables/influence_model_spread.csv");
    fsa.generateFile("file/info.txt", sb.toString());
    InfluenceDSLGenerator.detectCycle(graph);
  }

  public static boolean detectCycle(final DefaultDirectedGraph<String, DefaultEdge> graph) {
    final CycleDetector<String, DefaultEdge> cycleDetector = new CycleDetector<String, DefaultEdge>(graph);
    boolean _detectCycles = cycleDetector.detectCycles();
    if (_detectCycles) {
      Set<String> _findCycles = cycleDetector.findCycles();
      String _plus = ("Cycle detected" + _findCycles);
      InputOutput.<String>println(_plus);
      return true;
    } else {
      InputOutput.<String>println("No cycles detected");
      return false;
    }
  }

  public static String metadataSafe(final EObject o) {
    String _xblockexpression = null;
    {
      if ((o == null)) {
        return null;
      }
      EClass _eClass = o.eClass();
      EStructuralFeature _eStructuralFeature = null;
      if (_eClass!=null) {
        _eStructuralFeature=_eClass.getEStructuralFeature("metadata");
      }
      final EStructuralFeature f = _eStructuralFeature;
      if ((f == null)) {
        return null;
      }
      final Object v = o.eGet(f);
      String _xifexpression = null;
      if ((v instanceof String)) {
        _xifexpression = ((String) v);
      } else {
        String _xifexpression_1 = null;
        if ((v instanceof List<?>)) {
          final Function1<Object, Boolean> _function = (Object it) -> {
            return Boolean.valueOf((it != null));
          };
          final Function1<Object, String> _function_1 = (Object it) -> {
            return String.valueOf(it);
          };
          _xifexpression_1 = IterableExtensions.join(IterableExtensions.map(IterableExtensions.filter(((List<?>) v), _function), _function_1), ", ");
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
