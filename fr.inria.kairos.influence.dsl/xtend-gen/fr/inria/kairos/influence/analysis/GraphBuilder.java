package fr.inria.kairos.influence.analysis;

import com.google.common.collect.Iterables;
import fr.inria.kairos.influence.metamodel.ArtifactParticipant;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor;
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction;
import fr.inria.kairos.influence.metamodel.ParticipantRelativeImpact;
import fr.inria.kairos.influence.metamodel.SRPInputParticipant;
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

@SuppressWarnings("all")
public class GraphBuilder {
  public static class Result {
    public final DefaultDirectedGraph<String, DefaultEdge> graph;

    public final Map<String, String> vertexLabels;

    public final Map<DefaultEdge, String> edgeLabels;

    public final Map<String, LinkedHashSet<String>> outEdges;

    public final Map<String, LinkedHashSet<String>> inEdges;

    public final Map<String, LinkedHashSet<String>> reqToSRs;

    public final Map<String, String> srp2inf;

    public final Map<String, String> nodeToOrigin;

    public final Map<String, String> originToNode;

    public final Map<DefaultEdge, String> edgeToOrigin;

    public final Map<DefaultEdge, Double> edgeWeights;

    public final Map<String, String> nodeSourceModel;

    public Result(final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> inEdges, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, String> srp2inf, final Map<String, String> nodeToOrigin, final Map<String, String> originToNode, final Map<DefaultEdge, String> edgeToOrigin, final Map<DefaultEdge, Double> edgeWeights, final Map<String, String> nodeSourceModel) {
      this.graph = graph;
      this.vertexLabels = vertexLabels;
      this.edgeLabels = edgeLabels;
      this.outEdges = outEdges;
      this.inEdges = inEdges;
      this.reqToSRs = reqToSRs;
      this.srp2inf = srp2inf;
      this.nodeToOrigin = nodeToOrigin;
      this.originToNode = originToNode;
      this.edgeToOrigin = edgeToOrigin;
      this.edgeWeights = edgeWeights;
      this.nodeSourceModel = nodeSourceModel;
    }
  }

  private static final double DEFAULT_IMPACT_WEIGHT = 1.0;

  private static final double MISSING_CONTRIBUTION_WEIGHT = 0.0;

  public GraphBuilder.Result build(final Resource resource) {
    GraphBuilder.Result _xblockexpression = null;
    {
      final DefaultDirectedGraph<String, DefaultEdge> graph = new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
      final HashMap<String, String> vertexLabels = new HashMap<String, String>();
      final HashMap<DefaultEdge, String> edgeLabels = new HashMap<DefaultEdge, String>();
      final HashMap<String, LinkedHashSet<String>> outEdges = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, LinkedHashSet<String>> inEdges = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, LinkedHashSet<String>> reqToSRs = new HashMap<String, LinkedHashSet<String>>();
      final HashMap<String, String> srp2inf = new HashMap<String, String>();
      final HashMap<String, String> nodeToOrigin = new HashMap<String, String>();
      final HashMap<String, String> originToNode = new HashMap<String, String>();
      final HashMap<DefaultEdge, String> edgeToOrigin = new HashMap<DefaultEdge, String>();
      final HashMap<DefaultEdge, Double> edgeWeights = new HashMap<DefaultEdge, Double>();
      final HashMap<String, String> nodeSourceModel = new HashMap<String, String>();
      Iterable<Influence> _filter = Iterables.<Influence>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Influence.class);
      for (final Influence inf : _filter) {
        {
          final String iNode = GraphBuilder.toI(inf.getName());
          graph.addVertex(iNode);
          vertexLabels.put(iNode, GraphBuilder.influenceLabel(inf));
          GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, iNode, inf);
          EList<Participant> _ownedParticipants = inf.getOwnedParticipants();
          for (final Participant p : _ownedParticipants) {
            boolean _matched = false;
            if (p instanceof ArtifactParticipant) {
              _matched=true;
              this.addArtifactParticipantEdge(((ArtifactParticipant)p), inf, iNode, graph, vertexLabels, edgeLabels, outEdges, inEdges, nodeToOrigin, originToNode, edgeToOrigin, edgeWeights, nodeSourceModel);
            }
            if (!_matched) {
              if (p instanceof EnvironmentalFactorParticipant) {
                _matched=true;
                this.addEnvironmentalFactorParticipantEdge(((EnvironmentalFactorParticipant)p), inf, iNode, graph, vertexLabels, edgeLabels, outEdges, inEdges, nodeToOrigin, originToNode, edgeToOrigin, edgeWeights);
              }
            }
            if (!_matched) {
              if (p instanceof SRPInputParticipant) {
                _matched=true;
                this.addSRPInputParticipantEdge(((SRPInputParticipant)p), inf, iNode, resource, graph, vertexLabels, edgeLabels, outEdges, inEdges, nodeToOrigin, originToNode, edgeToOrigin, edgeWeights, reqToSRs);
              }
            }
          }
          final SystemResponseProperty output = inf.getOutputSRP();
          if (((output != null) && (output.getName() != null))) {
            final String srOutNode = GraphBuilder.toSR(output.getName());
            graph.addVertex(srOutNode);
            vertexLabels.putIfAbsent(srOutNode, srOutNode);
            GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, srOutNode, output);
            final DefaultEdge producesEdge = graph.addEdge(iNode, srOutNode);
            if ((producesEdge != null)) {
              edgeLabels.put(producesEdge, "produces");
              GraphBuilder.setEdgeOrigin(edgeToOrigin, producesEdge, inf);
            }
            GraphBuilder.addAdjEdge(outEdges, inEdges, iNode, srOutNode);
            srp2inf.put(srOutNode, iNode);
            this.addRequirementEdgesForSrp(resource, output, srOutNode, graph, vertexLabels, edgeLabels, outEdges, inEdges, reqToSRs, nodeToOrigin, originToNode, edgeToOrigin);
            EList<Participant> _ownedParticipants_1 = inf.getOwnedParticipants();
            for (final Participant p_1 : _ownedParticipants_1) {
              boolean _matched_1 = false;
              if (p_1 instanceof ArtifactParticipant) {
                _matched_1=true;
                final DesignArtifact artifact = ((ArtifactParticipant)p_1).getTarget();
                String _name = null;
                if (artifact!=null) {
                  _name=artifact.getName();
                }
                boolean _tripleNotEquals = (_name != null);
                if (_tripleNotEquals) {
                  GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toA(artifact.getName()), srOutNode);
                }
              }
              if (!_matched_1) {
                if (p_1 instanceof EnvironmentalFactorParticipant) {
                  _matched_1=true;
                  final EnvironmentalFactor env = ((EnvironmentalFactorParticipant)p_1).getTarget();
                  String _name = null;
                  if (env!=null) {
                    _name=env.getName();
                  }
                  boolean _tripleNotEquals = (_name != null);
                  if (_tripleNotEquals) {
                    GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toE(env.getName()), srOutNode);
                  }
                }
              }
              if (!_matched_1) {
                if (p_1 instanceof SRPInputParticipant) {
                  _matched_1=true;
                  final SystemResponseProperty srp = ((SRPInputParticipant)p_1).getTarget();
                  String _name = null;
                  if (srp!=null) {
                    _name=srp.getName();
                  }
                  boolean _tripleNotEquals = (_name != null);
                  if (_tripleNotEquals) {
                    GraphBuilder.addAdjEdge(outEdges, inEdges, GraphBuilder.toSR(srp.getName()), srOutNode);
                  }
                }
              }
            }
          }
        }
      }
      _xblockexpression = new GraphBuilder.Result(graph, vertexLabels, edgeLabels, outEdges, inEdges, reqToSRs, srp2inf, nodeToOrigin, originToNode, edgeToOrigin, edgeWeights, nodeSourceModel);
    }
    return _xblockexpression;
  }

  private void addArtifactParticipantEdge(final ArtifactParticipant participant, final Influence influence, final String influenceNode, final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> inEdges, final Map<String, String> nodeToOrigin, final Map<String, String> originToNode, final Map<DefaultEdge, String> edgeToOrigin, final Map<DefaultEdge, Double> edgeWeights, final Map<String, String> nodeSourceModel) {
    final DesignArtifact artifact = participant.getTarget();
    if (((artifact == null) || (artifact.getName() == null))) {
      return;
    }
    final String artifactNode = GraphBuilder.toA(artifact.getName());
    graph.addVertex(artifactNode);
    vertexLabels.putIfAbsent(artifactNode, artifactNode);
    GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, artifactNode, artifact);
    final DefaultEdge edge = graph.addEdge(artifactNode, influenceNode);
    final double weight = this.participantImpactWeight(influence, participant);
    if ((edge != null)) {
      edgeLabels.put(edge, GraphBuilder.fmtD(weight));
      edgeWeights.put(edge, Double.valueOf(weight));
      GraphBuilder.setEdgeOrigin(edgeToOrigin, edge, participant);
    }
    GraphBuilder.addAdjEdge(outEdges, inEdges, artifactNode, influenceNode);
    final EObject targetEObject = GraphBuilder.readRefEObject(artifact);
    final String modelUri = GraphBuilder.modelUriOf(targetEObject);
    if ((modelUri != null)) {
      nodeSourceModel.put(artifactNode, modelUri);
    }
  }

  private void addEnvironmentalFactorParticipantEdge(final EnvironmentalFactorParticipant participant, final Influence influence, final String influenceNode, final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> inEdges, final Map<String, String> nodeToOrigin, final Map<String, String> originToNode, final Map<DefaultEdge, String> edgeToOrigin, final Map<DefaultEdge, Double> edgeWeights) {
    final EnvironmentalFactor env = participant.getTarget();
    if (((env == null) || (env.getName() == null))) {
      return;
    }
    final String envNode = GraphBuilder.toE(env.getName());
    graph.addVertex(envNode);
    vertexLabels.putIfAbsent(envNode, envNode);
    GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, envNode, env);
    final DefaultEdge edge = graph.addEdge(envNode, influenceNode);
    final double weight = this.participantImpactWeight(influence, participant);
    if ((edge != null)) {
      edgeLabels.put(edge, GraphBuilder.fmtD(weight));
      edgeWeights.put(edge, Double.valueOf(weight));
      GraphBuilder.setEdgeOrigin(edgeToOrigin, edge, participant);
    }
    GraphBuilder.addAdjEdge(outEdges, inEdges, envNode, influenceNode);
  }

  private void addSRPInputParticipantEdge(final SRPInputParticipant participant, final Influence influence, final String influenceNode, final Resource resource, final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> inEdges, final Map<String, String> nodeToOrigin, final Map<String, String> originToNode, final Map<DefaultEdge, String> edgeToOrigin, final Map<DefaultEdge, Double> edgeWeights, final Map<String, LinkedHashSet<String>> reqToSRs) {
    final SystemResponseProperty srp = participant.getTarget();
    if (((srp == null) || (srp.getName() == null))) {
      return;
    }
    final String srpNode = GraphBuilder.toSR(srp.getName());
    graph.addVertex(srpNode);
    vertexLabels.putIfAbsent(srpNode, srpNode);
    GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, srpNode, srp);
    final DefaultEdge edge = graph.addEdge(srpNode, influenceNode);
    final double weight = this.participantImpactWeight(influence, participant);
    if ((edge != null)) {
      edgeLabels.put(edge, GraphBuilder.fmtD(weight));
      edgeWeights.put(edge, Double.valueOf(weight));
      GraphBuilder.setEdgeOrigin(edgeToOrigin, edge, participant);
    }
    GraphBuilder.addAdjEdge(outEdges, inEdges, srpNode, influenceNode);
    this.addRequirementEdgesForSrp(resource, srp, srpNode, graph, vertexLabels, edgeLabels, outEdges, inEdges, reqToSRs, nodeToOrigin, originToNode, edgeToOrigin);
  }

  private void addRequirementEdgesForSrp(final Resource resource, final SystemResponseProperty srp, final String srpNode, final DefaultDirectedGraph<String, DefaultEdge> graph, final Map<String, String> vertexLabels, final Map<DefaultEdge, String> edgeLabels, final Map<String, LinkedHashSet<String>> outEdges, final Map<String, LinkedHashSet<String>> inEdges, final Map<String, LinkedHashSet<String>> reqToSRs, final Map<String, String> nodeToOrigin, final Map<String, String> originToNode, final Map<DefaultEdge, String> edgeToOrigin) {
    if (((srp == null) || (srp.getName() == null))) {
      return;
    }
    Iterable<SatisfactionCriterion> _criteriaForSrp = this.criteriaForSrp(resource, srp);
    for (final SatisfactionCriterion criterion : _criteriaForSrp) {
      {
        final EObject requirementRef = this.requirementRefOf(criterion);
        final String requirementName = this.requirementLabel(requirementRef);
        if ((requirementName != null)) {
          final String requirementNode = GraphBuilder.toR(requirementName);
          graph.addVertex(requirementNode);
          vertexLabels.putIfAbsent(requirementNode, requirementNode);
          if ((requirementRef != null)) {
            GraphBuilder.setNodeOrigin(nodeToOrigin, originToNode, requirementNode, requirementRef);
          }
          final DefaultEdge edge = graph.addEdge(srpNode, requirementNode);
          if ((edge != null)) {
            edgeLabels.put(edge, "constrains");
            GraphBuilder.setEdgeOrigin(edgeToOrigin, edge, criterion);
          }
          GraphBuilder.addAdjEdge(outEdges, inEdges, srpNode, requirementNode);
          GraphBuilder.addReqToSrp(reqToSRs, requirementName, srp.getName());
        }
      }
    }
  }

  private Iterable<SatisfactionCriterion> criteriaForSrp(final Resource resource, final SystemResponseProperty srp) {
    final Function1<SatisfactionCriterion, Boolean> _function = (SatisfactionCriterion criterion) -> {
      return Boolean.valueOf(this.criterionConstrainsSrp(criterion, srp));
    };
    return IterableExtensions.<SatisfactionCriterion>filter(Iterables.<SatisfactionCriterion>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), SatisfactionCriterion.class), _function);
  }

  /**
   * Reflection-based so it survives during your migration if constrainedSRPs
   * is temporarily single-valued or multi-valued.
   * 
   * Recommended Ecore:
   *   constrainedSRPs : SystemResponseProperty [1..*]
   */
  private boolean criterionConstrainsSrp(final SatisfactionCriterion criterion, final SystemResponseProperty srp) {
    boolean _xblockexpression = false;
    {
      if (((criterion == null) || (srp == null))) {
        return false;
      }
      final EStructuralFeature feature = criterion.eClass().getEStructuralFeature("constrainedSRPs");
      if (((feature == null) || (!criterion.eIsSet(feature)))) {
        return false;
      }
      final Object value = criterion.eGet(feature);
      if ((value instanceof Collection<?>)) {
        return ((Collection<?>) value).contains(srp);
      }
      _xblockexpression = (value == srp);
    }
    return _xblockexpression;
  }

  private EObject requirementRefOf(final SatisfactionCriterion criterion) {
    Object _xblockexpression = null;
    {
      if ((criterion == null)) {
        return null;
      }
      final EStructuralFeature feature = criterion.eClass().getEStructuralFeature("requirementRef");
      if (((feature == null) || (!criterion.eIsSet(feature)))) {
        return null;
      }
      final Object value = criterion.eGet(feature);
      if ((value instanceof EObject)) {
        return ((EObject) value);
      }
      if ((value instanceof Collection<?>)) {
        for (final Object item : ((Collection<?>) value)) {
          if ((item instanceof EObject)) {
            return ((EObject) item);
          }
        }
      }
      _xblockexpression = null;
    }
    return ((EObject)_xblockexpression);
  }

  private String requirementLabel(final EObject requirementRef) {
    String _xblockexpression = null;
    {
      if ((requirementRef == null)) {
        return "<unknown-requirement>";
      }
      final EStructuralFeature nameFeature = requirementRef.eClass().getEStructuralFeature("name");
      if ((nameFeature != null)) {
        final Object value = requirementRef.eGet(nameFeature);
        if ((value != null)) {
          return String.valueOf(value);
        }
      }
      URI _xifexpression = null;
      boolean _eIsProxy = requirementRef.eIsProxy();
      if (_eIsProxy) {
        _xifexpression = ((InternalEObject) requirementRef).eProxyURI();
      } else {
        _xifexpression = EcoreUtil.getURI(requirementRef);
      }
      final URI uri = _xifexpression;
      if ((uri != null)) {
        return uri.toString();
      }
      _xblockexpression = requirementRef.toString();
    }
    return _xblockexpression;
  }

  /**
   * Weight for Participant -> Influence.
   * 
   * Source:
   *   ParticipantImpactFunction.participantContribution.importance
   * 
   * If no ParticipantImpactFunction exists, use DEFAULT_IMPACT_WEIGHT.
   * If an impact function exists but does not mention this participant,
   * use MISSING_CONTRIBUTION_WEIGHT.
   */
  private double participantImpactWeight(final Influence influence, final Participant participant) {
    double _xblockexpression = (double) 0;
    {
      final ParticipantImpactFunction impactFunction = this.bestParticipantImpactFunction(influence);
      if ((impactFunction == null)) {
        return GraphBuilder.DEFAULT_IMPACT_WEIGHT;
      }
      final Function1<ParticipantRelativeImpact, Boolean> _function = (ParticipantRelativeImpact c) -> {
        Participant _participant = c.getParticipant();
        return Boolean.valueOf((_participant == participant));
      };
      final ParticipantRelativeImpact contribution = IterableExtensions.<ParticipantRelativeImpact>findFirst(this.participantContributions(impactFunction), _function);
      if ((contribution == null)) {
        return GraphBuilder.MISSING_CONTRIBUTION_WEIGHT;
      }
      _xblockexpression = this.sanitizeWeight(contribution.getImportance());
    }
    return _xblockexpression;
  }

  private ParticipantImpactFunction bestParticipantImpactFunction(final Influence influence) {
    ParticipantImpactFunction _xblockexpression = null;
    {
      final InfluenceFunction function = influence.getOwnedInfluenceFunction();
      if (((function == null) || (function.getRepresentations() == null))) {
        return null;
      }
      final List<ParticipantImpactFunction> impactFunctions = IterableExtensions.<ParticipantImpactFunction>toList(Iterables.<ParticipantImpactFunction>filter(function.getRepresentations(), ParticipantImpactFunction.class));
      boolean _isEmpty = impactFunctions.isEmpty();
      if (_isEmpty) {
        return null;
      }
      final Comparator<ParticipantImpactFunction> _function = (ParticipantImpactFunction a, ParticipantImpactFunction b) -> {
        return Double.compare(b.getConfidence(), a.getConfidence());
      };
      impactFunctions.sort(_function);
      _xblockexpression = IterableExtensions.<ParticipantImpactFunction>head(impactFunctions);
    }
    return _xblockexpression;
  }

  /**
   * Reflection-based for stability while Ecore is still moving.
   * 
   * Recommended Ecore:
   *   participantContribution : ParticipantRelativeImpact [1..*] containment
   */
  private List<ParticipantRelativeImpact> participantContributions(final ParticipantImpactFunction function) {
    ArrayList<ParticipantRelativeImpact> _xblockexpression = null;
    {
      final ArrayList<ParticipantRelativeImpact> result = new ArrayList<ParticipantRelativeImpact>();
      if ((function == null)) {
        return result;
      }
      final EStructuralFeature feature = function.eClass().getEStructuralFeature("participantContribution");
      if (((feature == null) || (!function.eIsSet(feature)))) {
        return result;
      }
      final Object value = function.eGet(feature);
      if ((value instanceof Collection<?>)) {
        for (final Object item : ((Collection<?>) value)) {
          if ((item instanceof ParticipantRelativeImpact)) {
            result.add(((ParticipantRelativeImpact) item));
          }
        }
      } else {
        if ((value instanceof ParticipantRelativeImpact)) {
          result.add(((ParticipantRelativeImpact) value));
        }
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }

  private double sanitizeWeight(final double rawWeight) {
    double _xblockexpression = (double) 0;
    {
      boolean _isNaN = Double.isNaN(rawWeight);
      if (_isNaN) {
        return GraphBuilder.DEFAULT_IMPACT_WEIGHT;
      }
      if ((rawWeight < 0.0)) {
        return 0.0;
      }
      if ((rawWeight > 1.0)) {
        return 1.0;
      }
      _xblockexpression = rawWeight;
    }
    return _xblockexpression;
  }

  public static void addAdjEdge(final Map<String, LinkedHashSet<String>> outE, final Map<String, LinkedHashSet<String>> inE, final String from, final String to) {
    LinkedHashSet<String> os = outE.get(from);
    if ((os == null)) {
      LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>();
      os = _linkedHashSet;
      outE.put(from, os);
    }
    os.add(to);
    LinkedHashSet<String> is = inE.get(to);
    if ((is == null)) {
      LinkedHashSet<String> _linkedHashSet_1 = new LinkedHashSet<String>();
      is = _linkedHashSet_1;
      inE.put(to, is);
    }
    is.add(from);
  }

  public static void addReqToSrp(final Map<String, LinkedHashSet<String>> reqToSRs, final String requirementName, final String srpName) {
    LinkedHashSet<String> srps = reqToSRs.get(requirementName);
    if ((srps == null)) {
      LinkedHashSet<String> _linkedHashSet = new LinkedHashSet<String>();
      srps = _linkedHashSet;
      reqToSRs.put(requirementName, srps);
    }
    srps.add(srpName);
  }

  public static String influenceLabel(final Influence inf) {
    String _xblockexpression = null;
    {
      String _name = inf.getName();
      String s = ("I:" + _name);
      final String meta = GraphBuilder.metadataSafe(inf);
      if (((meta != null) && (!meta.trim().isEmpty()))) {
        s = ((s + "\\n") + meta);
      }
      _xblockexpression = s;
    }
    return _xblockexpression;
  }

  public static String metadataSafe(final EObject o) {
    Object _xblockexpression = null;
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
      if ((v instanceof String)) {
        return ((String) v);
      }
      if ((v instanceof List<?>)) {
        final Function1<Object, Boolean> _function = (Object it) -> {
          return Boolean.valueOf((it != null));
        };
        final Function1<Object, String> _function_1 = (Object it) -> {
          return String.valueOf(it);
        };
        return IterableExtensions.join(IterableExtensions.map(IterableExtensions.filter(((List<?>) v), _function), _function_1), ", ");
      }
      _xblockexpression = null;
    }
    return ((String)_xblockexpression);
  }

  public static String originOf(final EObject e) {
    Object _xblockexpression = null;
    {
      if ((e == null)) {
        return null;
      }
      URI _xifexpression = null;
      boolean _eIsProxy = e.eIsProxy();
      if (_eIsProxy) {
        _xifexpression = ((InternalEObject) e).eProxyURI();
      } else {
        _xifexpression = EcoreUtil.getURI(e);
      }
      final URI uri = _xifexpression;
      if ((uri != null)) {
        return uri.toString();
      }
      _xblockexpression = null;
    }
    return ((String)_xblockexpression);
  }

  public static void setNodeOrigin(final Map<String, String> nodeToOrigin, final Map<String, String> originToNode, final String nodeId, final EObject source) {
    final String originId = GraphBuilder.originOf(source);
    if (((originId != null) && (nodeId != null))) {
      boolean _containsKey = nodeToOrigin.containsKey(nodeId);
      boolean _not = (!_containsKey);
      if (_not) {
        nodeToOrigin.put(nodeId, originId);
      }
      boolean _containsKey_1 = originToNode.containsKey(originId);
      boolean _not_1 = (!_containsKey_1);
      if (_not_1) {
        originToNode.put(originId, nodeId);
      }
    }
  }

  public static void setEdgeOrigin(final Map<DefaultEdge, String> edgeToOrigin, final DefaultEdge edge, final EObject source) {
    if (((edge != null) && (source != null))) {
      edgeToOrigin.put(edge, GraphBuilder.originOf(source));
    }
  }

  public static EObject readRefEObject(final DesignArtifact artifact) {
    Object _xblockexpression = null;
    {
      if ((artifact == null)) {
        return null;
      }
      final EStructuralFeature f = artifact.eClass().getEStructuralFeature("ref");
      if (((f == null) || (!artifact.eIsSet(f)))) {
        return null;
      }
      final Object value = artifact.eGet(f);
      if ((value instanceof EObject)) {
        return ((EObject) value);
      }
      _xblockexpression = null;
    }
    return ((EObject)_xblockexpression);
  }

  public static String modelUriOf(final EObject e) {
    Object _xblockexpression = null;
    {
      if ((e == null)) {
        return null;
      }
      URI _xifexpression = null;
      boolean _eIsProxy = e.eIsProxy();
      if (_eIsProxy) {
        _xifexpression = ((InternalEObject) e).eProxyURI();
      } else {
        _xifexpression = EcoreUtil.getURI(e);
      }
      final URI uri = _xifexpression;
      URI _trimFragment = null;
      if (uri!=null) {
        _trimFragment=uri.trimFragment();
      }
      final URI base = _trimFragment;
      if ((base != null)) {
        return base.toString();
      }
      _xblockexpression = null;
    }
    return ((String)_xblockexpression);
  }

  public static String toA(final String n) {
    return ("A:" + n);
  }

  public static String toE(final String n) {
    return ("E:" + n);
  }

  public static String toSR(final String n) {
    return ("SR:" + n);
  }

  public static String toR(final String n) {
    return ("R:" + n);
  }

  public static String toI(final String n) {
    return ("I:" + n);
  }

  public static String fmtD(final double d) {
    return String.format(Locale.US, "%.3f", Double.valueOf(d));
  }
}
