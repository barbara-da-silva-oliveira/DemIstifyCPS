package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.analysis.GraphBuilder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class RequirementTraceability {
  public static class WorkItem {
    public final String nodeId;

    public final int hops;

    public WorkItem(final String nodeId, final int hops) {
      this.nodeId = nodeId;
      this.hops = hops;
    }
  }

  public static class TracePath {
    public final String requirementId;

    public final String srpId;

    public final String influenceId;

    public final String artifactId;

    public TracePath(final String requirementId, final String srpId, final String influenceId, final String artifactId) {
      this.requirementId = requirementId;
      this.srpId = srpId;
      this.influenceId = influenceId;
      this.artifactId = artifactId;
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

  private final GraphBuilder.Result canonicalGraph;

  public RequirementTraceability(final GraphBuilder.Result graphBundle) {
    this.canonicalGraph = graphBundle;
  }

  public Iterable<RequirementTraceability.TracePath> traceRequirementToArtifacts(final String requirementSimpleName) {
    final String requirementId = RequirementTraceability.toRequirementId(requirementSimpleName);
    final ArrayList<RequirementTraceability.TracePath> collectedPaths = CollectionLiterals.<RequirementTraceability.TracePath>newArrayList();
    if ((this.canonicalGraph == null)) {
      return collectedPaths;
    }
    final LinkedHashSet<String> srpIdsConstrainedByRequirement = this.canonicalGraph.inEdges.get(requirementId);
    if ((srpIdsConstrainedByRequirement != null)) {
      for (final String srpId : srpIdsConstrainedByRequirement) {
        {
          final String producerInfluenceId = this.canonicalGraph.srp2inf.get(srpId);
          if ((producerInfluenceId != null)) {
            final LinkedHashSet<String> incomingToInfluence = this.canonicalGraph.inEdges.get(producerInfluenceId);
            if ((incomingToInfluence != null)) {
              for (final String upstreamNodeId : incomingToInfluence) {
                boolean _startsWith = upstreamNodeId.startsWith("A:");
                if (_startsWith) {
                  RequirementTraceability.TracePath _tracePath = new RequirementTraceability.TracePath(requirementId, srpId, producerInfluenceId, upstreamNodeId);
                  collectedPaths.add(_tracePath);
                } else {
                }
              }
            } else {
            }
          } else {
          }
        }
      }
    } else {
    }
    return collectedPaths;
  }

  public Iterable<RequirementTraceability.TracePath> traceArtifactToRequirements(final String artifactSimpleName) {
    final String artifactId = RequirementTraceability.toArtifactId(artifactSimpleName);
    final ArrayList<RequirementTraceability.TracePath> collectedPaths = CollectionLiterals.<RequirementTraceability.TracePath>newArrayList();
    final LinkedHashSet<String> influenceIdsConsumedByArtifact = this.canonicalGraph.outEdges.get(artifactId);
    if ((influenceIdsConsumedByArtifact != null)) {
      for (final String influenceId : influenceIdsConsumedByArtifact) {
        {
          final LinkedHashSet<String> srpOutputsOfInfluence = this.canonicalGraph.outEdges.get(influenceId);
          if ((srpOutputsOfInfluence != null)) {
            for (final String srpId : srpOutputsOfInfluence) {
              boolean _startsWith = srpId.startsWith("SR:");
              if (_startsWith) {
                final LinkedHashSet<String> requirementIdsConstrainedBySrp = this.canonicalGraph.outEdges.get(srpId);
                if ((requirementIdsConstrainedBySrp != null)) {
                  for (final String requirementId : requirementIdsConstrainedBySrp) {
                    boolean _startsWith_1 = requirementId.startsWith("R:");
                    if (_startsWith_1) {
                      RequirementTraceability.TracePath _tracePath = new RequirementTraceability.TracePath(requirementId, srpId, influenceId, artifactId);
                      collectedPaths.add(_tracePath);
                    } else {
                    }
                  }
                } else {
                }
              } else {
              }
            }
          } else {
          }
        }
      }
    } else {
    }
    return collectedPaths;
  }

  public Map<String, Integer> upstreamArtifacts(final String srpId, final Map<String, LinkedHashSet<String>> inEdges) {
    return this.upstreamByPrefix(srpId, inEdges, "A:");
  }

  public Map<String, Integer> upstreamEnvironmentalFactors(final String srpId, final Map<String, LinkedHashSet<String>> inEdges) {
    return this.upstreamByPrefix(srpId, inEdges, "E:");
  }

  private Map<String, Integer> upstreamByPrefix(final String srpId, final Map<String, LinkedHashSet<String>> inEdges, final String wantedPrefix) {
    final HashMap<String, Integer> distances = new HashMap<String, Integer>();
    final HashSet<String> visitedSrps = new HashSet<String>();
    final ArrayDeque<RequirementTraceability.WorkItem> worklist = new ArrayDeque<RequirementTraceability.WorkItem>();
    if ((srpId == null)) {
      return distances;
    } else {
      if ((inEdges == null)) {
        return distances;
      } else {
        final LinkedHashSet<String> incomingToSrp = inEdges.get(srpId);
        if ((incomingToSrp == null)) {
          return distances;
        } else {
          for (final String n : incomingToSrp) {
            if (((n != null) && n.startsWith("I:"))) {
              RequirementTraceability.WorkItem _workItem = new RequirementTraceability.WorkItem(n, 0);
              worklist.add(_workItem);
            } else {
            }
          }
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
          for (final String u : incomingToInfluence) {
            if ((u == null)) {
            } else {
              boolean _startsWith = u.startsWith(wantedPrefix);
              if (_startsWith) {
                final Integer prev = distances.get(u);
                if (((prev == null) || (nextHops < (prev).intValue()))) {
                  distances.put(u, Integer.valueOf(nextHops));
                } else {
                }
              } else {
                boolean _startsWith_1 = u.startsWith("SR:");
                if (_startsWith_1) {
                  boolean _contains = visitedSrps.contains(u);
                  boolean _not = (!_contains);
                  if (_not) {
                    visitedSrps.add(u);
                    final LinkedHashSet<String> inc = inEdges.get(u);
                    if ((inc != null)) {
                      for (final String maybeInf : inc) {
                        if (((maybeInf != null) && maybeInf.startsWith("I:"))) {
                          RequirementTraceability.WorkItem _workItem_1 = new RequirementTraceability.WorkItem(maybeInf, nextHops);
                          worklist.add(_workItem_1);
                        } else {
                        }
                      }
                    } else {
                    }
                  } else {
                  }
                } else {
                }
              }
            }
          }
        } else {
        }
      }
    }
    return distances;
  }

  public RequirementTraceability.UpstreamVariables findUpstreamBaseVariables(final String srpSimpleName) {
    final String rootSrpId = RequirementTraceability.toSrpId(srpSimpleName);
    final Set<String> visitedSrpIds = new HashSet<String>();
    visitedSrpIds.add(rootSrpId);
    final Set<String> upstreamArtifactIds = new HashSet<String>();
    final Set<String> upstreamFactorIds = new HashSet<String>();
    this.depthFirstCollectUpstream(rootSrpId, visitedSrpIds, upstreamArtifactIds, upstreamFactorIds);
    return new RequirementTraceability.UpstreamVariables(upstreamArtifactIds, upstreamFactorIds);
  }

  private void depthFirstCollectUpstream(final String currentSrpId, final Set<String> visitedSrpIds, final Set<String> collectedArtifactIds, final Set<String> collectedFactorIds) {
    final String producerInfluenceId = this.canonicalGraph.srp2inf.get(currentSrpId);
    if ((producerInfluenceId != null)) {
      final LinkedHashSet<String> incomingNodeIds = this.canonicalGraph.inEdges.get(producerInfluenceId);
      if ((incomingNodeIds != null)) {
        for (final String upstreamNodeId : incomingNodeIds) {
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
                } else {
                }
              } else {
              }
            }
          }
        }
      } else {
      }
    } else {
    }
  }

  public Iterable<String[]> buildImpactSummaryTableForRequirement(final String requirementSimpleName) {
    final ArrayList<String[]> rows = CollectionLiterals.<String[]>newArrayList();
    Iterable<RequirementTraceability.TracePath> _traceRequirementToArtifacts = this.traceRequirementToArtifacts(requirementSimpleName);
    for (final RequirementTraceability.TracePath p : _traceRequirementToArtifacts) {
      String _stripPrefix = RequirementTraceability.stripPrefix(p.requirementId);
      String _stripPrefix_1 = RequirementTraceability.stripPrefix(p.srpId);
      String _stripPrefix_2 = RequirementTraceability.stripPrefix(p.influenceId);
      String _stripPrefix_3 = RequirementTraceability.stripPrefix(p.artifactId);
      rows.add(
        ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_stripPrefix, _stripPrefix_1, _stripPrefix_2, _stripPrefix_3)), String.class)));
    }
    return rows;
  }

  private static String toArtifactId(final String simple) {
    return ("A:" + simple);
  }

  private static String toFactorId(final String simple) {
    return ("E:" + simple);
  }

  private static String toSrpId(final String simple) {
    return ("SR:" + simple);
  }

  private static String toRequirementId(final String simple) {
    return ("R:" + simple);
  }

  private static String stripPrefix(final String id) {
    String _xblockexpression = null;
    {
      if ((id == null)) {
        return "";
      }
      final int i = id.indexOf(":");
      String _xifexpression = null;
      if (((i >= 0) && ((i + 1) < id.length()))) {
        _xifexpression = id.substring((i + 1));
      } else {
        _xifexpression = id;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
