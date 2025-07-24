package fr.inria.kairos.influence.visualisation.klighd.synthesis;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.kgraph.EMapPropertyHolder;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.kgraph.KPort;
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle;
import de.cau.cs.kieler.klighd.krendering.LineStyle;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.NamedElement;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponse;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.styles.InfluenceShapeExtensions;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.styles.InfluenceStyleExtensions;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.util.UtilityExtensions;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import org.eclipse.elk.alg.layered.options.EdgeStraighteningStrategy;
import org.eclipse.elk.alg.layered.options.FixedAlignment;
import org.eclipse.elk.alg.layered.options.LayeredOptions;
import org.eclipse.elk.core.math.ElkPadding;
import org.eclipse.elk.core.options.CoreOptions;
import org.eclipse.elk.core.options.Direction;
import org.eclipse.elk.core.options.EdgeRouting;
import org.eclipse.elk.core.options.PortConstraints;
import org.eclipse.elk.core.options.PortSide;
import org.eclipse.elk.core.options.SizeConstraint;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Diagram synthesis for Influence programs.
 * adapted from LF program originnaly written by
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 * and adapted by
 * @author{Julien Deantoni <julien.deantoni@univ-cotedazur.fr>}
 */
@ViewSynthesisShared
@SuppressWarnings("all")
public class InfluenceSynthesis extends AbstractDiagramSynthesis<InfluenceModel> {
  @Inject
  @Extension
  private KNodeExtensions _kNodeExtensions;

  @Inject
  @Extension
  private KEdgeExtensions _kEdgeExtensions;

  @Inject
  @Extension
  private KPortExtensions _kPortExtensions;

  @Inject
  @Extension
  private KLabelExtensions _kLabelExtensions;

  @Inject
  @Extension
  private KRenderingExtensions _kRenderingExtensions;

  @Inject
  @Extension
  private KContainerRenderingExtensions _kContainerRenderingExtensions;

  @Inject
  @Extension
  private KPolylineExtensions _kPolylineExtensions;

  @Inject
  @Extension
  private InfluenceStyleExtensions _influenceStyleExtensions;

  @Inject
  @Extension
  private InfluenceShapeExtensions _influenceShapeExtensions;

  @Inject
  @Extension
  private UtilityExtensions _utilityExtensions;

  public static final Property<Boolean> REACTOR_RECURSIVE_INSTANTIATION = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.recursive.instantiation", Boolean.valueOf(false));

  public static final Property<Boolean> REACTOR_HAS_BANK_PORT_OFFSET = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.bank.offset", Boolean.valueOf(false));

  public static final Property<Boolean> REACTOR_INPUT = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.input", Boolean.valueOf(false));

  public static final Property<Boolean> REACTOR_OUTPUT = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.output", Boolean.valueOf(false));

  public static final List<Float> ALTERNATIVE_DASH_PATTERN = Collections.<Float>unmodifiableList(CollectionLiterals.<Float>newArrayList(Float.valueOf(3.0f)));

  public static final String TEXT_ERROR_RECURSIVE = "Recursive reactor instantiation!";

  public static final String TEXT_ERROR_CONTAINS_RECURSION = "Reactor contains recursive instantiation!";

  public static final String TEXT_ERROR_CONTAINS_CYCLE = "Reactor contains cyclic dependencies!";

  public static final String TEXT_ERROR_CYCLE_DETECTION = "Dependency cycle detection failed.\nCould not detect dependency cycles due to unexpected graph structure.";

  public static final String TEXT_ERROR_CYCLE_BTN_SHOW = "Show Cycle";

  public static final String TEXT_ERROR_CYCLE_BTN_FILTER = "Filter Cycle";

  public static final String TEXT_ERROR_CYCLE_BTN_UNFILTER = "Remove Cycle Filter";

  public static final String TEXT_NO_INFLUENCE_MODEL = "No influence model";

  public static final String TEXT_REACTOR_NULL = "Reactor is null";

  public static final String TEXT_HIDE_ACTION = "[Hide]";

  public static final String TEXT_SHOW_ACTION = "[Details]";

  /**
   * Synthesis category
   */
  public static final SynthesisOption APPEARANCE = SynthesisOption.createCategory("Appearance", true);

  public static final SynthesisOption EXPERIMENTAL = SynthesisOption.createCategory("Experimental", true);

  /**
   * Synthesis options
   */
  public static final SynthesisOption SHOW_USER_LABELS = SynthesisOption.createCheckOption("User Labels (@label in JavaDoc)", Boolean.valueOf(true)).setCategory(InfluenceSynthesis.APPEARANCE);

  public static final SynthesisOption SHOW_HYPERLINKS = SynthesisOption.createCheckOption("Expand/Collapse Hyperlinks", Boolean.valueOf(false)).setCategory(InfluenceSynthesis.APPEARANCE);

  public static final SynthesisOption USE_ALTERNATIVE_DASH_PATTERN = SynthesisOption.createCheckOption("Alternative Dependency Line Style", Boolean.valueOf(false)).setCategory(InfluenceSynthesis.APPEARANCE);

  public static final SynthesisOption SHOW_REACTOR_HOST = SynthesisOption.createCheckOption("Reactor Host Addresses", Boolean.valueOf(true)).setCategory(InfluenceSynthesis.APPEARANCE);

  public static final SynthesisOption SHOW_INSTANCE_NAMES = SynthesisOption.createCheckOption("Reactor Instance Names", Boolean.valueOf(false)).setCategory(InfluenceSynthesis.APPEARANCE);

  @Override
  public List<SynthesisOption> getDisplayedSynthesisOptions() {
    return Collections.<SynthesisOption>unmodifiableList(CollectionLiterals.<SynthesisOption>newArrayList(InfluenceSynthesis.SHOW_USER_LABELS, InfluenceSynthesis.SHOW_HYPERLINKS, InfluenceSynthesis.USE_ALTERNATIVE_DASH_PATTERN, InfluenceSynthesis.SHOW_REACTOR_HOST, InfluenceSynthesis.SHOW_INSTANCE_NAMES));
  }

  private HashMap<EObject, KNode> elemToNode = new HashMap<EObject, KNode>();

  @Override
  public KNode transform(final InfluenceModel model) {
    final KNode rootNode = KGraphUtil.createInitializedNode();
    this.elemToNode.put(model, rootNode);
    try {
      final InfluenceModel main = model;
      if ((main != null)) {
        EList<DesignArtifact> _ownedArtifacts = main.getOwnedArtifacts();
        for (final DesignArtifact artifact : _ownedArtifacts) {
          {
            KNode artNode = this.createArtifact(artifact);
            EList<KNode> _children = rootNode.getChildren();
            _children.add(artNode);
            this.elemToNode.put(artifact, artNode);
          }
        }
        EList<PhysicalPhenomena> _ownedPhysicalPhenomena = main.getOwnedPhysicalPhenomena();
        for (final PhysicalPhenomena phenomena : _ownedPhysicalPhenomena) {
          {
            KNode pheNode = this.createPhenomena(phenomena);
            EList<KNode> _children = rootNode.getChildren();
            _children.add(pheNode);
            this.elemToNode.put(phenomena, pheNode);
          }
        }
        EList<AbstractInfluence> _ownedInfluences = main.getOwnedInfluences();
        for (final AbstractInfluence absInf : _ownedInfluences) {
          {
            KNode infNode = this.createInfluencePass1(absInf);
            EList<KNode> _children = rootNode.getChildren();
            _children.add(infNode);
            this.elemToNode.put(absInf, infNode);
          }
        }
        EList<AbstractInfluence> _ownedInfluences_1 = main.getOwnedInfluences();
        for (final AbstractInfluence absInf_1 : _ownedInfluences_1) {
          this.createInfluencePass2(absInf_1);
        }
        EList<AbstractInfluence> _ownedInfluences_2 = main.getOwnedInfluences();
        for (final AbstractInfluence absInf_2 : _ownedInfluences_2) {
          this.createInfluencePass3(absInf_2);
        }
        EList<Requirement> _ownedRequirements = main.getOwnedRequirements();
        for (final Requirement req : _ownedRequirements) {
          {
            KNode reqNode = this.createRequirement(req);
            EList<KNode> _children = rootNode.getChildren();
            _children.add(reqNode);
            this.elemToNode.put(req, reqNode);
          }
        }
        EList<AbstractInfluence> _ownedInfluences_3 = main.getOwnedInfluences();
        for (final AbstractInfluence absInf_3 : _ownedInfluences_3) {
          EList<SystemResponse> _affects = absInf_3.getAffects();
          for (final SystemResponse sr : _affects) {
            int _size = sr.getUsedIn().size();
            boolean _greaterThan = (_size > 0);
            if (_greaterThan) {
              EList<Requirement> _usedIn = sr.getUsedIn();
              for (final Requirement req_1 : _usedIn) {
                {
                  KNode srNode = this.elemToNode.get(sr);
                  KNode reqNode = this.elemToNode.get(req_1);
                  KPort _addPort = this.addPort(reqNode);
                  final Procedure1<KPort> _function = (KPort it) -> {
                    this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.WEST);
                  };
                  KPort dest = ObjectExtensions.<KPort>operator_doubleArrow(_addPort, _function);
                  KPort _addPort_1 = this.addPort(srNode);
                  final Procedure1<KPort> _function_1 = (KPort it) -> {
                    this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.EAST);
                  };
                  KPort src = ObjectExtensions.<KPort>operator_doubleArrow(_addPort_1, _function_1);
                  this.connect(this.createDelayEdge(this), src, dest);
                }
              }
            }
          }
        }
      } else {
        final KNode messageNode = KGraphUtil.createInitializedNode();
        this._influenceShapeExtensions.addErrorMessage(messageNode, InfluenceSynthesis.TEXT_NO_INFLUENCE_MODEL, null);
        EList<KNode> _children = rootNode.getChildren();
        _children.add(messageNode);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
        final KNode messageNode_1 = KGraphUtil.createInitializedNode();
        String _simpleName = e.getClass().getSimpleName();
        String _plus = (_simpleName + " occurred. Could not create diagram.");
        this._influenceShapeExtensions.addErrorMessage(messageNode_1, "Error in Diagram Synthesis", _plus);
        EList<KNode> _children_1 = rootNode.getChildren();
        _children_1.add(messageNode_1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return rootNode;
  }

  private KNode _createInfluencePass1(final Influence influence) {
    final KNode node = KGraphUtil.createInitializedNode();
    this.<KNode>associateWith(node, influence);
    this._utilityExtensions.setID(node, influence.getName());
    final String label = this.createNamedElementLabel(influence);
    if ((influence == null)) {
      this._influenceShapeExtensions.addErrorMessage(node, InfluenceSynthesis.TEXT_REACTOR_NULL, null);
    } else {
      final KRoundedRectangle figure = this._influenceShapeExtensions.addInfluenceFigure(node, influence, label);
      this._kContainerRenderingExtensions.addChildArea(figure);
      EList<DesignArtifact> _originatorArtifact = influence.getOriginatorArtifact();
      for (final DesignArtifact or : _originatorArtifact) {
        {
          KPort _addPort = this.addPort(node);
          final Procedure1<KPort> _function = (KPort it) -> {
            this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.WEST);
          };
          KPort dest = ObjectExtensions.<KPort>operator_doubleArrow(_addPort, _function);
          KPort _addPort_1 = this.addPort(this.elemToNode.get(or));
          final Procedure1<KPort> _function_1 = (KPort it) -> {
            this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.EAST);
          };
          KPort src = ObjectExtensions.<KPort>operator_doubleArrow(_addPort_1, _function_1);
          KEdge edge = this.connect(this.createArrowEdge(), src, dest);
          node.getIncomingEdges().add(edge);
          this.elemToNode.get(or).getOutgoingEdges().add(edge);
        }
      }
      EList<PhysicalPhenomena> _originatorPhenomena = influence.getOriginatorPhenomena();
      for (final PhysicalPhenomena or_1 : _originatorPhenomena) {
        {
          KPort _addPort = this.addPort(node);
          final Procedure1<KPort> _function = (KPort it) -> {
            this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.WEST);
          };
          KPort dest = ObjectExtensions.<KPort>operator_doubleArrow(_addPort, _function);
          KPort _addPort_1 = this.addPort(this.elemToNode.get(or_1));
          final Procedure1<KPort> _function_1 = (KPort it) -> {
            this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.EAST);
          };
          KPort src = ObjectExtensions.<KPort>operator_doubleArrow(_addPort_1, _function_1);
          KEdge edge = this.connect(this.createArrowEdge(), src, dest);
          node.getIncomingEdges().add(edge);
          this.elemToNode.get(or_1).getOutgoingEdges().add(edge);
        }
      }
      this.configureInterfaceNodeLayout(node);
      this.<KNode, String>setLayoutOption(node, CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID);
      this.<KNode, Direction>setLayoutOption(node, CoreOptions.DIRECTION, Direction.RIGHT);
      this.<KNode, EnumSet<SizeConstraint>>setLayoutOption(node, CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.<SizeConstraint>of(SizeConstraint.MINIMUM_SIZE));
      this.<KNode, FixedAlignment>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED);
      this.<KNode, EdgeStraighteningStrategy>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS);
      Double _default = LayeredOptions.SPACING_EDGE_NODE.getDefault();
      double _multiply = ((_default).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE, Double.valueOf(_multiply));
      Double _default_1 = LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.getDefault();
      double _multiply_1 = ((_default_1).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_1));
      this.<KNode, Boolean>setLayoutOption(node, LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, Boolean.valueOf(true));
      this.<KNode, EdgeRouting>setLayoutOption(node, LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES);
      boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
      boolean _not = (!_booleanValue);
      if (_not) {
        ElkPadding _elkPadding = new ElkPadding((-1), 6, 6, 6);
        this.<KNode, ElkPadding>setLayoutOption(node, CoreOptions.PADDING, _elkPadding);
        Double _default_2 = LayeredOptions.SPACING_COMPONENT_COMPONENT.getDefault();
        double _multiply_2 = ((_default_2).doubleValue() * 0.5f);
        this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_COMPONENT_COMPONENT, Double.valueOf(_multiply_2));
      }
    }
    return node;
  }

  private KNode _createInfluencePass2(final Influence influence) {
    final KNode node = this.elemToNode.get(influence);
    EList<SystemResponse> _affects = influence.getAffects();
    for (final SystemResponse sr : _affects) {
      {
        KNode srNode = this.createSystemResponseNode(sr);
        node.getParent().getChildren().add(srNode);
        this.elemToNode.put(sr, srNode);
        KPort _addPort = this.addPort(srNode);
        final Procedure1<KPort> _function = (KPort it) -> {
          this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.WEST);
        };
        KPort dest = ObjectExtensions.<KPort>operator_doubleArrow(_addPort, _function);
        KPort _addPort_1 = this.addPort(node);
        final Procedure1<KPort> _function_1 = (KPort it) -> {
          this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.EAST);
        };
        KPort src = ObjectExtensions.<KPort>operator_doubleArrow(_addPort_1, _function_1);
        KEdge edge = this.connect(this.createArrowEdge(), src, dest);
        node.getIncomingEdges().add(edge);
      }
    }
    return node;
  }

  private KNode _createInfluencePass3(final Influence influence) {
    final KNode node = this.elemToNode.get(influence);
    EList<SystemResponse> _originatorSystemResponse = influence.getOriginatorSystemResponse();
    for (final SystemResponse or : _originatorSystemResponse) {
      {
        KPort _addPort = this.addPort(node);
        final Procedure1<KPort> _function = (KPort it) -> {
          this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.WEST);
        };
        KPort dest = ObjectExtensions.<KPort>operator_doubleArrow(_addPort, _function);
        KPort _addPort_1 = this.addPort(this.elemToNode.get(or));
        final Procedure1<KPort> _function_1 = (KPort it) -> {
          this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.EAST);
        };
        KPort src = ObjectExtensions.<KPort>operator_doubleArrow(_addPort_1, _function_1);
        KEdge edge = this.connect(this.createArrowEdge(), src, dest);
        node.getIncomingEdges().add(edge);
      }
    }
    return node;
  }

  private KNode _createInfluencePass1(final CompositeInfluence influence) {
    final KNode node = KGraphUtil.createInitializedNode();
    this.<KNode>associateWith(node, influence);
    this._utilityExtensions.setID(node, influence.getName());
    final String label = this.createNamedElementLabel(influence);
    if ((influence == null)) {
      this._influenceShapeExtensions.addErrorMessage(node, InfluenceSynthesis.TEXT_REACTOR_NULL, null);
    } else {
      final KRoundedRectangle figure = this._influenceShapeExtensions.addCompositeInfluenceFigure(node, influence, label);
      this._kContainerRenderingExtensions.addChildArea(figure);
      EList<AbstractInfluence> _internalInfluences = influence.getInternalInfluences();
      for (final AbstractInfluence internInf : _internalInfluences) {
        {
          KNode infNode = this.elemToNode.get(internInf);
          node.getChildren().add(infNode);
          if ((internInf instanceof Influence)) {
            EList<DesignArtifact> _originatorArtifact = ((Influence)internInf).getOriginatorArtifact();
            for (final DesignArtifact or : _originatorArtifact) {
              {
                KNode orNode = this.elemToNode.get(or);
                node.getChildren().add(orNode);
              }
            }
            EList<PhysicalPhenomena> _originatorPhenomena = ((Influence)internInf).getOriginatorPhenomena();
            for (final PhysicalPhenomena or_1 : _originatorPhenomena) {
              {
                KNode orNode = this.elemToNode.get(or_1);
                node.getChildren().add(orNode);
              }
            }
          }
        }
      }
      this.configureInterfaceNodeLayout(node);
      this.<KNode, String>setLayoutOption(node, CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID);
      this.<KNode, Direction>setLayoutOption(node, CoreOptions.DIRECTION, Direction.RIGHT);
      this.<KNode, EnumSet<SizeConstraint>>setLayoutOption(node, CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.<SizeConstraint>of(SizeConstraint.MINIMUM_SIZE));
      this.<KNode, FixedAlignment>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED);
      this.<KNode, EdgeStraighteningStrategy>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS);
      Double _default = LayeredOptions.SPACING_EDGE_NODE.getDefault();
      double _multiply = ((_default).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE, Double.valueOf(_multiply));
      Double _default_1 = LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.getDefault();
      double _multiply_1 = ((_default_1).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_1));
      this.<KNode, Boolean>setLayoutOption(node, LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, Boolean.valueOf(true));
      this.<KNode, EdgeRouting>setLayoutOption(node, LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES);
      boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
      boolean _not = (!_booleanValue);
      if (_not) {
        ElkPadding _elkPadding = new ElkPadding((-1), 6, 6, 6);
        this.<KNode, ElkPadding>setLayoutOption(node, CoreOptions.PADDING, _elkPadding);
        Double _default_2 = LayeredOptions.SPACING_COMPONENT_COMPONENT.getDefault();
        double _multiply_2 = ((_default_2).doubleValue() * 0.5f);
        this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_COMPONENT_COMPONENT, Double.valueOf(_multiply_2));
      }
    }
    return node;
  }

  private KNode _createInfluencePass2(final CompositeInfluence influence) {
    final KNode node = this.elemToNode.get(influence);
    EList<SystemResponse> _affects = influence.getAffects();
    for (final SystemResponse sr : _affects) {
      {
        KNode srNode = this.createSystemResponseNode(sr);
        node.getParent().getChildren().add(srNode);
        this.elemToNode.put(sr, srNode);
        KPort _addPort = this.addPort(srNode);
        final Procedure1<KPort> _function = (KPort it) -> {
          this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.WEST);
        };
        KPort dest = ObjectExtensions.<KPort>operator_doubleArrow(_addPort, _function);
        KPort _addPort_1 = this.addPort(node);
        final Procedure1<KPort> _function_1 = (KPort it) -> {
          this.<KPort, PortSide>setLayoutOption(it, CoreOptions.PORT_SIDE, PortSide.EAST);
        };
        KPort src = ObjectExtensions.<KPort>operator_doubleArrow(_addPort_1, _function_1);
        KEdge edge = this.connect(this.createArrowEdge(), src, dest);
        node.getIncomingEdges().add(edge);
      }
    }
    return node;
  }

  private KNode _createInfluencePass3(final CompositeInfluence influence) {
    final KNode node = this.elemToNode.get(influence);
    return node;
  }

  private KNode createArtifact(final DesignArtifact artifact) {
    final KNode node = KGraphUtil.createInitializedNode();
    this.<KNode>associateWith(node, artifact);
    this._utilityExtensions.setID(node, artifact.getName());
    final String label = this.createNamedElementLabel(artifact);
    if ((artifact == null)) {
      this._influenceShapeExtensions.addErrorMessage(node, InfluenceSynthesis.TEXT_REACTOR_NULL, null);
    } else {
      final KRoundedRectangle figure = this._influenceShapeExtensions.addDesignArtifactFigure(node, artifact, label);
      this._kContainerRenderingExtensions.addChildArea(figure);
      this.configureInterfaceNodeLayout(node);
      this.<KNode, String>setLayoutOption(node, CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID);
      this.<KNode, Direction>setLayoutOption(node, CoreOptions.DIRECTION, Direction.RIGHT);
      this.<KNode, EnumSet<SizeConstraint>>setLayoutOption(node, CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.<SizeConstraint>of(SizeConstraint.MINIMUM_SIZE));
      this.<KNode, FixedAlignment>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED);
      this.<KNode, EdgeStraighteningStrategy>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS);
      Double _default = LayeredOptions.SPACING_EDGE_NODE.getDefault();
      double _multiply = ((_default).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE, Double.valueOf(_multiply));
      Double _default_1 = LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.getDefault();
      double _multiply_1 = ((_default_1).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_1));
      this.<KNode, Boolean>setLayoutOption(node, LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, Boolean.valueOf(true));
      this.<KNode, EdgeRouting>setLayoutOption(node, LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES);
      boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
      boolean _not = (!_booleanValue);
      if (_not) {
        ElkPadding _elkPadding = new ElkPadding((-1), 6, 6, 6);
        this.<KNode, ElkPadding>setLayoutOption(node, CoreOptions.PADDING, _elkPadding);
        Double _default_2 = LayeredOptions.SPACING_COMPONENT_COMPONENT.getDefault();
        double _multiply_2 = ((_default_2).doubleValue() * 0.5f);
        this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_COMPONENT_COMPONENT, Double.valueOf(_multiply_2));
      }
    }
    return node;
  }

  private KNode createRequirement(final Requirement req) {
    final KNode node = KGraphUtil.createInitializedNode();
    this.<KNode>associateWith(node, req);
    this._utilityExtensions.setID(node, req.getName());
    final String label = this.createNamedElementLabel(req);
    if ((req == null)) {
      this._influenceShapeExtensions.addErrorMessage(node, InfluenceSynthesis.TEXT_REACTOR_NULL, null);
    } else {
      final KRoundedRectangle figure = this._influenceShapeExtensions.addRequirementFigure(node, req, label);
      this._kContainerRenderingExtensions.addChildArea(figure);
      this.configureInterfaceNodeLayout(node);
      this.<KNode, String>setLayoutOption(node, CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID);
      this.<KNode, Direction>setLayoutOption(node, CoreOptions.DIRECTION, Direction.RIGHT);
      this.<KNode, EnumSet<SizeConstraint>>setLayoutOption(node, CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.<SizeConstraint>of(SizeConstraint.MINIMUM_SIZE));
      this.<KNode, FixedAlignment>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED);
      this.<KNode, EdgeStraighteningStrategy>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS);
      Double _default = LayeredOptions.SPACING_EDGE_NODE.getDefault();
      double _multiply = ((_default).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE, Double.valueOf(_multiply));
      Double _default_1 = LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.getDefault();
      double _multiply_1 = ((_default_1).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_1));
      this.<KNode, Boolean>setLayoutOption(node, LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, Boolean.valueOf(true));
      this.<KNode, EdgeRouting>setLayoutOption(node, LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES);
      boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
      boolean _not = (!_booleanValue);
      if (_not) {
        ElkPadding _elkPadding = new ElkPadding((-1), 6, 6, 6);
        this.<KNode, ElkPadding>setLayoutOption(node, CoreOptions.PADDING, _elkPadding);
        Double _default_2 = LayeredOptions.SPACING_COMPONENT_COMPONENT.getDefault();
        double _multiply_2 = ((_default_2).doubleValue() * 0.5f);
        this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_COMPONENT_COMPONENT, Double.valueOf(_multiply_2));
      }
    }
    return node;
  }

  private KNode createPhenomena(final PhysicalPhenomena phenomena) {
    final KNode node = KGraphUtil.createInitializedNode();
    this.<KNode>associateWith(node, phenomena);
    this._utilityExtensions.setID(node, phenomena.getName());
    final String label = this.createNamedElementLabel(phenomena);
    if ((phenomena == null)) {
      this._influenceShapeExtensions.addErrorMessage(node, InfluenceSynthesis.TEXT_REACTOR_NULL, null);
    } else {
      final KRoundedRectangle figure = this._influenceShapeExtensions.addPhenomenaFigure(node, phenomena, label);
      this._kContainerRenderingExtensions.addChildArea(figure);
      this.configureInterfaceNodeLayout(node);
      this.<KNode, String>setLayoutOption(node, CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID);
      this.<KNode, Direction>setLayoutOption(node, CoreOptions.DIRECTION, Direction.RIGHT);
      this.<KNode, EnumSet<SizeConstraint>>setLayoutOption(node, CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.<SizeConstraint>of(SizeConstraint.MINIMUM_SIZE));
      this.<KNode, FixedAlignment>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED);
      this.<KNode, EdgeStraighteningStrategy>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS);
      Double _default = LayeredOptions.SPACING_EDGE_NODE.getDefault();
      double _multiply = ((_default).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE, Double.valueOf(_multiply));
      Double _default_1 = LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.getDefault();
      double _multiply_1 = ((_default_1).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_1));
      this.<KNode, Boolean>setLayoutOption(node, LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, Boolean.valueOf(true));
      this.<KNode, EdgeRouting>setLayoutOption(node, LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES);
      boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
      boolean _not = (!_booleanValue);
      if (_not) {
        ElkPadding _elkPadding = new ElkPadding((-1), 6, 6, 6);
        this.<KNode, ElkPadding>setLayoutOption(node, CoreOptions.PADDING, _elkPadding);
        Double _default_2 = LayeredOptions.SPACING_COMPONENT_COMPONENT.getDefault();
        double _multiply_2 = ((_default_2).doubleValue() * 0.5f);
        this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_COMPONENT_COMPONENT, Double.valueOf(_multiply_2));
      }
    }
    return node;
  }

  private KNode createSystemResponseNode(final SystemResponse sr) {
    final KNode node = KGraphUtil.createInitializedNode();
    this.<KNode>associateWith(node, sr);
    this._utilityExtensions.setID(node, sr.getName());
    final String label = this.createNamedElementLabel(sr);
    if ((sr == null)) {
      this._influenceShapeExtensions.addErrorMessage(node, InfluenceSynthesis.TEXT_REACTOR_NULL, null);
    } else {
      final KRoundedRectangle figure = this._influenceShapeExtensions.addSystemResponseFigure(node, sr, label);
      this._kContainerRenderingExtensions.addChildArea(figure);
      this.configureInterfaceNodeLayout(node);
      this.<KNode, String>setLayoutOption(node, CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID);
      this.<KNode, Direction>setLayoutOption(node, CoreOptions.DIRECTION, Direction.RIGHT);
      this.<KNode, EnumSet<SizeConstraint>>setLayoutOption(node, CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.<SizeConstraint>of(SizeConstraint.MINIMUM_SIZE));
      this.<KNode, FixedAlignment>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED);
      this.<KNode, EdgeStraighteningStrategy>setLayoutOption(node, LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS);
      Double _default = LayeredOptions.SPACING_EDGE_NODE.getDefault();
      double _multiply = ((_default).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE, Double.valueOf(_multiply));
      Double _default_1 = LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.getDefault();
      double _multiply_1 = ((_default_1).doubleValue() * 1.1f);
      this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_1));
      this.<KNode, Boolean>setLayoutOption(node, LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, Boolean.valueOf(true));
      this.<KNode, EdgeRouting>setLayoutOption(node, LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES);
      boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
      boolean _not = (!_booleanValue);
      if (_not) {
        ElkPadding _elkPadding = new ElkPadding((-1), 6, 6, 6);
        this.<KNode, ElkPadding>setLayoutOption(node, CoreOptions.PADDING, _elkPadding);
        Double _default_2 = LayeredOptions.SPACING_COMPONENT_COMPONENT.getDefault();
        double _multiply_2 = ((_default_2).doubleValue() * 0.5f);
        this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_COMPONENT_COMPONENT, Double.valueOf(_multiply_2));
      }
    }
    return node;
  }

  private KNode configureInterfaceNodeLayout(final KNode node) {
    KNode _xblockexpression = null;
    {
      this.<KNode, EnumSet<SizeConstraint>>setLayoutOption(node, CoreOptions.NODE_SIZE_CONSTRAINTS, SizeConstraint.minimumSizeWithPorts());
      this.<KNode, PortConstraints>setLayoutOption(node, CoreOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER);
      this.<KNode, Boolean>setLayoutOption(node, LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, Boolean.valueOf(true));
      this.<KNode, EdgeRouting>setLayoutOption(node, LayeredOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL);
      KNode _xifexpression = null;
      boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
      boolean _not = (!_booleanValue);
      if (_not) {
        KNode _xblockexpression_1 = null;
        {
          ElkPadding _elkPadding = new ElkPadding(2, 6, 6, 6);
          this.<KNode, ElkPadding>setLayoutOption(node, CoreOptions.PADDING, _elkPadding);
          Double _default = LayeredOptions.SPACING_NODE_NODE.getDefault();
          double _multiply = ((_default).doubleValue() * 0.75f);
          this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_NODE_NODE, Double.valueOf(_multiply));
          Double _default_1 = LayeredOptions.SPACING_NODE_NODE_BETWEEN_LAYERS.getDefault();
          double _multiply_1 = ((_default_1).doubleValue() * 0.75f);
          this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_NODE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_1));
          Double _default_2 = LayeredOptions.SPACING_EDGE_NODE.getDefault();
          double _multiply_2 = ((_default_2).doubleValue() * 0.75f);
          this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE, Double.valueOf(_multiply_2));
          Double _default_3 = LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.getDefault();
          double _multiply_3 = ((_default_3).doubleValue() * 0.75f);
          _xblockexpression_1 = this.<KNode, Double>setLayoutOption(node, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, Double.valueOf(_multiply_3));
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  private String createNamedElementLabel(final NamedElement ne) {
    final StringBuilder b = new StringBuilder();
    String _xifexpression = null;
    if ((ne == null)) {
      _xifexpression = "<NULL>";
    } else {
      String _elvis = null;
      String _name = ne.getName();
      if (_name != null) {
        _elvis = _name;
      } else {
        _elvis = "<Unresolved Element>";
      }
      _xifexpression = _elvis;
    }
    b.append(_xifexpression);
    return b.toString();
  }

  private KEdge createDelayEdge(final Object associate) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = (KEdge it) -> {
      this.<KEdge>associateWith(it, associate);
      KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
      final Procedure1<KPolyline> _function_1 = (KPolyline it_1) -> {
        boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.USE_ALTERNATIVE_DASH_PATTERN);
        if (_booleanValue) {
          this._kRenderingExtensions.setLineStyle(it_1, LineStyle.CUSTOM);
          EList<Float> _dashPattern = this._kRenderingExtensions.getLineStyle(it_1).getDashPattern();
          Iterables.<Float>addAll(_dashPattern, InfluenceSynthesis.ALTERNATIVE_DASH_PATTERN);
        } else {
          this._kRenderingExtensions.setLineStyle(it_1, LineStyle.DASH);
        }
        this._influenceStyleExtensions.boldLineSelectionStyle(it_1);
      };
      ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }

  private KEdge createIODependencyEdge(final Object associate) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = (KEdge it) -> {
      if ((associate != null)) {
        this.<KEdge>associateWith(it, associate);
      }
      KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
      final Procedure1<KPolyline> _function_1 = (KPolyline it_1) -> {
        this._influenceStyleExtensions.boldLineSelectionStyle(it_1);
      };
      ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }

  private KEdge createDependencyEdge(final Object associate) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = (KEdge it) -> {
      if ((associate != null)) {
        this.<KEdge>associateWith(it, associate);
      }
      KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
      final Procedure1<KPolyline> _function_1 = (KPolyline it_1) -> {
        boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.USE_ALTERNATIVE_DASH_PATTERN);
        if (_booleanValue) {
          this._kRenderingExtensions.setLineStyle(it_1, LineStyle.CUSTOM);
          EList<Float> _dashPattern = this._kRenderingExtensions.getLineStyle(it_1).getDashPattern();
          Iterables.<Float>addAll(_dashPattern, InfluenceSynthesis.ALTERNATIVE_DASH_PATTERN);
        } else {
          this._kRenderingExtensions.setLineStyle(it_1, LineStyle.DASH);
        }
        this._influenceStyleExtensions.boldLineSelectionStyle(it_1);
      };
      ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }

  private KEdge createOrderEdge() {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = (KEdge it) -> {
      KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
      final Procedure1<KPolyline> _function_1 = (KPolyline it_1) -> {
        this._kRenderingExtensions.setLineWidth(it_1, 1.5f);
        this._kRenderingExtensions.setLineStyle(it_1, LineStyle.DOT);
        this._kRenderingExtensions.setForeground(it_1, Colors.CHOCOLATE_1);
        this._influenceStyleExtensions.boldLineSelectionStyle(it_1);
        this._kPolylineExtensions.addHeadArrowDecorator(it_1);
      };
      ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }

  private KEdge createArrowEdge() {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = (KEdge it) -> {
      KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
      final Procedure1<KPolyline> _function_1 = (KPolyline it_1) -> {
        this._kRenderingExtensions.setLineWidth(it_1, 1.5f);
        this._kRenderingExtensions.setForeground(it_1, Colors.CHOCOLATE_1);
        this._influenceStyleExtensions.boldLineSelectionStyle(it_1);
        this._kPolylineExtensions.addHeadArrowDecorator(it_1);
      };
      ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }

  private KEdge _connect(final KEdge edge, final KNode src, final KNode dst) {
    edge.setSource(src);
    edge.setTarget(dst);
    return edge;
  }

  private KEdge _connect(final KEdge edge, final KNode src, final KPort dst) {
    edge.setSource(src);
    edge.setTargetPort(dst);
    KNode _node = null;
    if (dst!=null) {
      _node=dst.getNode();
    }
    edge.setTarget(_node);
    return edge;
  }

  private KEdge _connect(final KEdge edge, final KPort src, final KNode dst) {
    edge.setSourcePort(src);
    KNode _node = null;
    if (src!=null) {
      _node=src.getNode();
    }
    edge.setSource(_node);
    edge.setTarget(dst);
    return edge;
  }

  private KEdge _connect(final KEdge edge, final KPort src, final KPort dst) {
    edge.setSourcePort(src);
    KNode _node = null;
    if (src!=null) {
      _node=src.getNode();
    }
    edge.setSource(_node);
    edge.setTargetPort(dst);
    KNode _node_1 = null;
    if (dst!=null) {
      _node_1=dst.getNode();
    }
    edge.setTarget(_node_1);
    return edge;
  }

  private KPort addInvisiblePort(final KNode node) {
    final KPort port = this._kPortExtensions.createPort();
    EList<KPort> _ports = node.getPorts();
    _ports.add(port);
    port.setSize(0, 0);
    return port;
  }

  private KPort addPort(final KNode node) {
    final KPort port = this._kPortExtensions.createPort();
    EList<KPort> _ports = node.getPorts();
    _ports.add(port);
    port.setSize(3, 3);
    return port;
  }

  private KNode createInfluencePass1(final AbstractInfluence influence) {
    if (influence instanceof CompositeInfluence) {
      return _createInfluencePass1((CompositeInfluence)influence);
    } else if (influence instanceof Influence) {
      return _createInfluencePass1((Influence)influence);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(influence).toString());
    }
  }

  private KNode createInfluencePass2(final AbstractInfluence influence) {
    if (influence instanceof CompositeInfluence) {
      return _createInfluencePass2((CompositeInfluence)influence);
    } else if (influence instanceof Influence) {
      return _createInfluencePass2((Influence)influence);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(influence).toString());
    }
  }

  private KNode createInfluencePass3(final AbstractInfluence influence) {
    if (influence instanceof CompositeInfluence) {
      return _createInfluencePass3((CompositeInfluence)influence);
    } else if (influence instanceof Influence) {
      return _createInfluencePass3((Influence)influence);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(influence).toString());
    }
  }

  private KEdge connect(final KEdge edge, final EMapPropertyHolder src, final EMapPropertyHolder dst) {
    if (src instanceof KNode
         && dst instanceof KNode) {
      return _connect(edge, (KNode)src, (KNode)dst);
    } else if (src instanceof KNode
         && dst instanceof KPort) {
      return _connect(edge, (KNode)src, (KPort)dst);
    } else if (src instanceof KPort
         && dst instanceof KNode) {
      return _connect(edge, (KPort)src, (KNode)dst);
    } else if (src instanceof KPort
         && dst instanceof KPort) {
      return _connect(edge, (KPort)src, (KPort)dst);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(edge, src, dst).toString());
    }
  }
}
