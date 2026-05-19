package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.analysis.GraphBuilder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Traceability queries over the canonical graph produced by GraphBuilder.
 * 
 * Requirements are graph nodes created from SatisfactionCriterion.requirementRef
 * by GraphBuilder:
 * 
 *   SR:<srpName> -> R:<requirementLabel>
 * 
 * The requirement label can be a local name, an external model name,
 * or an URI-derived label.
 */
@SuppressWarnings("all")
public class RequirementTraceability {
  public static class TracePath {
    public final String requirementId;

    public final String srpId;

    public final String influenceId;

    /**
     * Can be:
     *   A:<artifact>
     *   E:<environmentalFactor>
     * 
     * Historically this field was named artifactId.
     * Keep getArtifactId() below for compatibility with old code.
     */
    public final String sourceId;

    public TracePath(final String requirementId, final String srpId, final String influenceId, final String sourceId) {
      this.requirementId = requirementId;
      this.srpId = srpId;
      this.influenceId = influenceId;
      this.sourceId = sourceId;
    }

    public String getArtifactId() {
      return this.sourceId;
    }

    public String getFactorId() {
      return this.sourceId;
    }
  }

  public static class UpstreamVariables {
    public final Iterable<String> artifactIds;

    public final Iterable<String> factorIds;

    public UpstreamVariables(final Iterable<String> artifactIds, final Iterable<String> factorIds) {
      this.artifactIds = artifactIds;
      this.factorIds = factorIds;
    }
  }

  public static class WorkItem {
    public final String nodeId;

    public final int hops;

    public WorkItem(final String nodeId, final int hops) {
      this.nodeId = nodeId;
      this.hops = hops;
    }
  }

  private final GraphBuilder.Result canonicalGraph;

  public RequirementTraceability(final GraphBuilder.Result graphBundle) {
    this.canonicalGraph = graphBundle;
  }

  /**
   * Resolve requirement -> artifacts as explicit path tuples:
   * 
   *   R <- SR <- I <- A
   * 
   * Returned tuple is stored as:
   *   requirementId, srpId, influenceId, artifactId
   */
  public Iterable<RequirementTraceability.TracePath> traceRequirementToArtifacts(final String requirementNameOrId) {
    ArrayList<RequirementTraceability.TracePath> _xblockexpression = null;
    {
      final ArrayList<RequirementTraceability.TracePath> collectedPaths = new ArrayList<RequirementTraceability.TracePath>();
      if ((this.canonicalGraph == null)) {
        return collectedPaths;
      }
      final String requirementId = RequirementTraceability.normalizeRequirementId(requirementNameOrId);
      final LinkedHashSet<String> srpIdsConstrainedByRequirement = this.canonicalGraph.inEdges.get(requirementId);
      if ((srpIdsConstrainedByRequirement != null)) {
        for (final String srpId : srpIdsConstrainedByRequirement) {
          if (((srpId != null) && srpId.startsWith("SR:"))) {
            final String producerInfluenceId = this.canonicalGraph.srp2inf.get(srpId);
            if ((producerInfluenceId != null)) {
              final LinkedHashSet<String> incomingToInfluence = this.canonicalGraph.inEdges.get(producerInfluenceId);
              if ((incomingToInfluence != null)) {
                for (final String upstreamNodeId : incomingToInfluence) {
                  if (((upstreamNodeId != null) && upstreamNodeId.startsWith("A:"))) {
                    RequirementTraceability.TracePath _tracePath = new RequirementTraceability.TracePath(requirementId, srpId, producerInfluenceId, upstreamNodeId);
                    collectedPaths.add(_tracePath);
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = collectedPaths;
    }
    return _xblockexpression;
  }

  /**
   * Resolve requirement -> environmental factors as explicit path tuples:
   * 
   *   R <- SR <- I <- E
   */
  public Iterable<RequirementTraceability.TracePath> traceRequirementToEnvironmentalFactors(final String requirementNameOrId) {
    ArrayList<RequirementTraceability.TracePath> _xblockexpression = null;
    {
      final ArrayList<RequirementTraceability.TracePath> collectedPaths = new ArrayList<RequirementTraceability.TracePath>();
      if ((this.canonicalGraph == null)) {
        return collectedPaths;
      }
      final String requirementId = RequirementTraceability.normalizeRequirementId(requirementNameOrId);
      final LinkedHashSet<String> srpIdsConstrainedByRequirement = this.canonicalGraph.inEdges.get(requirementId);
      if ((srpIdsConstrainedByRequirement != null)) {
        for (final String srpId : srpIdsConstrainedByRequirement) {
          if (((srpId != null) && srpId.startsWith("SR:"))) {
            final String producerInfluenceId = this.canonicalGraph.srp2inf.get(srpId);
            if ((producerInfluenceId != null)) {
              final LinkedHashSet<String> incomingToInfluence = this.canonicalGraph.inEdges.get(producerInfluenceId);
              if ((incomingToInfluence != null)) {
                for (final String upstreamNodeId : incomingToInfluence) {
                  if (((upstreamNodeId != null) && upstreamNodeId.startsWith("E:"))) {
                    RequirementTraceability.TracePath _tracePath = new RequirementTraceability.TracePath(requirementId, srpId, producerInfluenceId, upstreamNodeId);
                    collectedPaths.add(_tracePath);
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = collectedPaths;
    }
    return _xblockexpression;
  }

  /**
   * Resolve artifact -> requirements as explicit path tuples:
   * 
   *   A -> I -> SR -> R
   */
  public Iterable<RequirementTraceability.TracePath> traceArtifactToRequirements(final String artifactSimpleNameOrId) {
    ArrayList<RequirementTraceability.TracePath> _xblockexpression = null;
    {
      final String artifactId = RequirementTraceability.normalizeArtifactId(artifactSimpleNameOrId);
      final ArrayList<RequirementTraceability.TracePath> collectedPaths = new ArrayList<RequirementTraceability.TracePath>();
      if ((this.canonicalGraph == null)) {
        return collectedPaths;
      }
      final LinkedHashSet<String> influenceIdsConsumedByArtifact = this.canonicalGraph.outEdges.get(artifactId);
      if ((influenceIdsConsumedByArtifact != null)) {
        for (final String influenceId : influenceIdsConsumedByArtifact) {
          if (((influenceId != null) && influenceId.startsWith("I:"))) {
            final LinkedHashSet<String> srpOutputsOfInfluence = this.canonicalGraph.outEdges.get(influenceId);
            if ((srpOutputsOfInfluence != null)) {
              for (final String srpId : srpOutputsOfInfluence) {
                if (((srpId != null) && srpId.startsWith("SR:"))) {
                  final LinkedHashSet<String> requirementIdsConstrainedBySrp = this.canonicalGraph.outEdges.get(srpId);
                  if ((requirementIdsConstrainedBySrp != null)) {
                    for (final String requirementId : requirementIdsConstrainedBySrp) {
                      if (((requirementId != null) && requirementId.startsWith("R:"))) {
                        RequirementTraceability.TracePath _tracePath = new RequirementTraceability.TracePath(requirementId, srpId, influenceId, artifactId);
                        collectedPaths.add(_tracePath);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = collectedPaths;
    }
    return _xblockexpression;
  }

  /**
   * Resolve environmental factor -> requirements as explicit path tuples:
   * 
   *   E -> I -> SR -> R
   */
  public Iterable<RequirementTraceability.TracePath> traceEnvironmentalFactorToRequirements(final String factorSimpleNameOrId) {
    ArrayList<RequirementTraceability.TracePath> _xblockexpression = null;
    {
      final String factorId = RequirementTraceability.normalizeFactorId(factorSimpleNameOrId);
      final ArrayList<RequirementTraceability.TracePath> collectedPaths = new ArrayList<RequirementTraceability.TracePath>();
      if ((this.canonicalGraph == null)) {
        return collectedPaths;
      }
      final LinkedHashSet<String> influenceIdsConsumedByFactor = this.canonicalGraph.outEdges.get(factorId);
      if ((influenceIdsConsumedByFactor != null)) {
        for (final String influenceId : influenceIdsConsumedByFactor) {
          if (((influenceId != null) && influenceId.startsWith("I:"))) {
            final LinkedHashSet<String> srpOutputsOfInfluence = this.canonicalGraph.outEdges.get(influenceId);
            if ((srpOutputsOfInfluence != null)) {
              for (final String srpId : srpOutputsOfInfluence) {
                if (((srpId != null) && srpId.startsWith("SR:"))) {
                  final LinkedHashSet<String> requirementIdsConstrainedBySrp = this.canonicalGraph.outEdges.get(srpId);
                  if ((requirementIdsConstrainedBySrp != null)) {
                    for (final String requirementId : requirementIdsConstrainedBySrp) {
                      if (((requirementId != null) && requirementId.startsWith("R:"))) {
                        RequirementTraceability.TracePath _tracePath = new RequirementTraceability.TracePath(requirementId, srpId, influenceId, factorId);
                        collectedPaths.add(_tracePath);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = collectedPaths;
    }
    return _xblockexpression;
  }

  /**
   * Upstream artifacts for an SRP id.
   * 
   * Accepts:
   *   "Speed"
   *   "SR:Speed"
   */
  public Map<String, Integer> upstreamArtifacts(final String srpNameOrId, final Map<String, LinkedHashSet<String>> inEdges) {
    return this.upstreamByPrefix(RequirementTraceability.normalizeSrpId(srpNameOrId), inEdges, "A:");
  }

  /**
   * Upstream environmental factors for an SRP id.
   * 
   * Accepts:
   *   "Speed"
   *   "SR:Speed"
   */
  public Map<String, Integer> upstreamEnvironmentalFactors(final String srpNameOrId, final Map<String, LinkedHashSet<String>> inEdges) {
    return this.upstreamByPrefix(RequirementTraceability.normalizeSrpId(srpNameOrId), inEdges, "E:");
  }

  /**
   * Shared BFS used by upstreamArtifacts/upstreamEnvironmentalFactors.
   * 
   * Walks backwards:
   *   SR <- I <- A/E/SR
   * 
   * If it finds an upstream SR, it continues with the influence that produced
   * that upstream SR.
   */
  private Map<String, Integer> upstreamByPrefix(final String srpId, final Map<String, LinkedHashSet<String>> inEdges, final String wantedPrefix) {
    HashMap<String, Integer> _xblockexpression = null;
    {
      final HashMap<String, Integer> distances = new HashMap<String, Integer>();
      final HashSet<String> visitedSrps = new HashSet<String>();
      final ArrayDeque<RequirementTraceability.WorkItem> worklist = new ArrayDeque<RequirementTraceability.WorkItem>();
      if (((srpId == null) || (inEdges == null))) {
        return distances;
      }
      final LinkedHashSet<String> incomingToSrp = inEdges.get(srpId);
      if ((incomingToSrp != null)) {
        for (final String nodeId : incomingToSrp) {
          if (((nodeId != null) && nodeId.startsWith("I:"))) {
            RequirementTraceability.WorkItem _workItem = new RequirementTraceability.WorkItem(nodeId, 0);
            worklist.add(_workItem);
          }
        }
      }
      while ((!worklist.isEmpty())) {
        {
          final RequirementTraceability.WorkItem item = worklist.removeFirst();
          final String influenceId = item.nodeId;
          final int hopsSoFar = item.hops;
          final LinkedHashSet<String> incomingToInfluence = inEdges.get(influenceId);
          if ((incomingToInfluence != null)) {
            final int nextHops = (hopsSoFar + 1);
            for (final String upstreamNodeId : incomingToInfluence) {
              if ((upstreamNodeId != null)) {
                boolean _startsWith = upstreamNodeId.startsWith(wantedPrefix);
                if (_startsWith) {
                  final Integer previous = distances.get(upstreamNodeId);
                  if (((previous == null) || (nextHops < (previous).intValue()))) {
                    distances.put(upstreamNodeId, Integer.valueOf(nextHops));
                  }
                } else {
                  boolean _startsWith_1 = upstreamNodeId.startsWith("SR:");
                  if (_startsWith_1) {
                    boolean _contains = visitedSrps.contains(upstreamNodeId);
                    boolean _not = (!_contains);
                    if (_not) {
                      visitedSrps.add(upstreamNodeId);
                      final LinkedHashSet<String> incomingToUpstreamSrp = inEdges.get(upstreamNodeId);
                      if ((incomingToUpstreamSrp != null)) {
                        for (final String maybeInfluence : incomingToUpstreamSrp) {
                          if (((maybeInfluence != null) && maybeInfluence.startsWith("I:"))) {
                            RequirementTraceability.WorkItem _workItem_1 = new RequirementTraceability.WorkItem(maybeInfluence, nextHops);
                            worklist.add(_workItem_1);
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = distances;
    }
    return _xblockexpression;
  }

  /**
   * Compute upstream base variables of a given SRP:
   * 
   *   artifacts + environmental factors
   * 
   * Accepts:
   *   "Speed"
   *   "SR:Speed"
   */
  public RequirementTraceability.UpstreamVariables findUpstreamBaseVariables(final String srpNameOrId) {
    RequirementTraceability.UpstreamVariables _xblockexpression = null;
    {
      final String rootSrpId = RequirementTraceability.normalizeSrpId(srpNameOrId);
      final HashSet<String> visitedSrpIds = new HashSet<String>();
      final HashSet<String> upstreamArtifactIds = new HashSet<String>();
      final HashSet<String> upstreamFactorIds = new HashSet<String>();
      if (((this.canonicalGraph != null) && (rootSrpId != null))) {
        visitedSrpIds.add(rootSrpId);
        this.depthFirstCollectUpstream(rootSrpId, visitedSrpIds, upstreamArtifactIds, upstreamFactorIds);
      }
      _xblockexpression = new RequirementTraceability.UpstreamVariables(upstreamArtifactIds, upstreamFactorIds);
    }
    return _xblockexpression;
  }

  private void depthFirstCollectUpstream(final String currentSrpId, final Set<String> visitedSrpIds, final Set<String> collectedArtifactIds, final Set<String> collectedFactorIds) {
    if (((this.canonicalGraph == null) || (currentSrpId == null))) {
      return;
    }
    final String producerInfluenceId = this.canonicalGraph.srp2inf.get(currentSrpId);
    if ((producerInfluenceId != null)) {
      final LinkedHashSet<String> incomingNodeIds = this.canonicalGraph.inEdges.get(producerInfluenceId);
      if ((incomingNodeIds != null)) {
        for (final String upstreamNodeId : incomingNodeIds) {
          if ((upstreamNodeId != null)) {
            boolean _startsWith = upstreamNodeId.startsWith("A:");
            if (_startsWith) {
              collectedArtifactIds.add(upstreamNodeId);
            } else {
              boolean _startsWith_1 = upstreamNodeId.startsWith("E:");
              if (_startsWith_1) {
                collectedFactorIds.add(upstreamNodeId);
              } else {
                boolean _startsWith_2 = upstreamNodeId.startsWith("SR:");
                if (_startsWith_2) {
                  boolean _contains = visitedSrpIds.contains(upstreamNodeId);
                  boolean _not = (!_contains);
                  if (_not) {
                    visitedSrpIds.add(upstreamNodeId);
                    this.depthFirstCollectUpstream(upstreamNodeId, visitedSrpIds, collectedArtifactIds, collectedFactorIds);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  /**
   * Flattened table for exporters:
   * 
   *   [requirement, srp, influence, artifact]
   * 
   * The first argument can be:
   *   "MyRequirement"
   *   "R:MyRequirement"
   *   "platform:/resource/..."
   */
  public Iterable<String[]> buildImpactSummaryTableForRequirement(final String requirementNameOrId) {
    ArrayList<String[]> _xblockexpression = null;
    {
      final ArrayList<String[]> rows = new ArrayList<String[]>();
      Iterable<RequirementTraceability.TracePath> _traceRequirementToArtifacts = this.traceRequirementToArtifacts(requirementNameOrId);
      for (final RequirementTraceability.TracePath path : _traceRequirementToArtifacts) {
        String _stripKnownPrefix = RequirementTraceability.stripKnownPrefix(path.requirementId);
        String _stripKnownPrefix_1 = RequirementTraceability.stripKnownPrefix(path.srpId);
        String _stripKnownPrefix_2 = RequirementTraceability.stripKnownPrefix(path.influenceId);
        String _stripKnownPrefix_3 = RequirementTraceability.stripKnownPrefix(path.sourceId);
        rows.add(
          new String[] { _stripKnownPrefix, _stripKnownPrefix_1, _stripKnownPrefix_2, _stripKnownPrefix_3 });
      }
      _xblockexpression = rows;
    }
    return _xblockexpression;
  }

  /**
   * Useful when the caller does not know the exact external requirement label.
   */
  public Iterable<String> requirementIds() {
    TreeSet<String> _xblockexpression = null;
    {
      final TreeSet<String> result = new TreeSet<String>();
      if (((this.canonicalGraph != null) && (this.canonicalGraph.reqToSRs != null))) {
        Set<String> _keySet = this.canonicalGraph.reqToSRs.keySet();
        for (final String requirementName : _keySet) {
          result.add(RequirementTraceability.normalizeRequirementId(requirementName));
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }

  public Iterable<String> requirementLabels() {
    final Function1<String, String> _function = (String it) -> {
      return RequirementTraceability.stripKnownPrefix(it);
    };
    return IterableExtensions.<String, String>map(this.requirementIds(), _function);
  }

  private static String normalizeArtifactId(final String value) {
    String _xifexpression = null;
    if ((value == null)) {
      _xifexpression = null;
    } else {
      String _xifexpression_1 = null;
      boolean _startsWith = value.startsWith("A:");
      if (_startsWith) {
        _xifexpression_1 = value;
      } else {
        _xifexpression_1 = ("A:" + value);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  private static String normalizeFactorId(final String value) {
    String _xifexpression = null;
    if ((value == null)) {
      _xifexpression = null;
    } else {
      String _xifexpression_1 = null;
      boolean _startsWith = value.startsWith("E:");
      if (_startsWith) {
        _xifexpression_1 = value;
      } else {
        _xifexpression_1 = ("E:" + value);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  private static String normalizeSrpId(final String value) {
    String _xifexpression = null;
    if ((value == null)) {
      _xifexpression = null;
    } else {
      String _xifexpression_1 = null;
      boolean _startsWith = value.startsWith("SR:");
      if (_startsWith) {
        _xifexpression_1 = value;
      } else {
        _xifexpression_1 = ("SR:" + value);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  private static String normalizeRequirementId(final String value) {
    String _xifexpression = null;
    if ((value == null)) {
      _xifexpression = null;
    } else {
      String _xifexpression_1 = null;
      boolean _startsWith = value.startsWith("R:");
      if (_startsWith) {
        _xifexpression_1 = value;
      } else {
        _xifexpression_1 = ("R:" + value);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }

  private static String stripKnownPrefix(final String id) {
    String _xblockexpression = null;
    {
      if ((id == null)) {
        return "";
      }
      boolean _startsWith = id.startsWith("SR:");
      if (_startsWith) {
        return id.substring(3);
      }
      if ((((id.startsWith("A:") || id.startsWith("E:")) || id.startsWith("I:")) || id.startsWith("R:"))) {
        return id.substring(2);
      }
      _xblockexpression = id;
    }
    return _xblockexpression;
  }
}
