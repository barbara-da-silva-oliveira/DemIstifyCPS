package fr.inria.kairos.influence.visualisation.klighd.synthesis

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.Collection
import java.util.EnumSet
import java.util.HashMap
import org.eclipse.elk.alg.layered.options.EdgeStraighteningStrategy
import org.eclipse.elk.alg.layered.options.FixedAlignment
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.math.ElkPadding
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.Property
import fr.inria.kairos.influence.visualisation.klighd.synthesis.styles.ReactorFigureComponents
import fr.inria.kairos.influence.visualisation.klighd.synthesis.util.UtilityExtensions
import fr.inria.kairos.influence.metamodel.InfluenceModel
import fr.inria.kairos.influence.metamodel.DesignArtifact
import fr.inria.kairos.influence.metamodel.NamedElement
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.AbstractInfluence
import fr.inria.kairos.influence.visualisation.klighd.synthesis.styles.InfluenceShapeExtensions
import fr.inria.kairos.influence.visualisation.klighd.synthesis.styles.InfluenceStyleExtensions
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import fr.inria.kairos.influence.metamodel.CompositeInfluence
import fr.inria.kairos.influence.metamodel.SystemResponse
import fr.inria.kairos.influence.metamodel.Requirement

/**
 * Diagram synthesis for Influence programs.
 * adapted from LF program originnaly written by 
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 * and adapted by
 * @author{Julien Deantoni <julien.deantoni@univ-cotedazur.fr>}
 */
@ViewSynthesisShared
class InfluenceSynthesis extends AbstractDiagramSynthesis<InfluenceModel> {

	@Inject extension KNodeExtensions
	@Inject extension KEdgeExtensions
	@Inject extension KPortExtensions
	@Inject extension KLabelExtensions
	@Inject extension KRenderingExtensions
	@Inject extension KContainerRenderingExtensions
	@Inject extension KPolylineExtensions
	@Inject extension InfluenceStyleExtensions
	@Inject extension InfluenceShapeExtensions
	@Inject extension UtilityExtensions

	
	// -------------------------------------------------------------------------

	// -- INTERNAL --
//	public static val REACTOR_INSTANCE = new Property<BreadCrumbTrail<Instantiation>>("org.lflang.linguafranca.diagram.synthesis.reactor.instantiation")
	public static val REACTOR_RECURSIVE_INSTANTIATION = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.recursive.instantiation", false)
    public static val REACTOR_HAS_BANK_PORT_OFFSET = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.bank.offset", false)
    public static val REACTOR_INPUT = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.input", false)
    public static val REACTOR_OUTPUT = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.output", false)
	
	// -- STYLE --	
	public static val ALTERNATIVE_DASH_PATTERN = #[3.0f]
	
	// -- TEXT --
	public static val TEXT_ERROR_RECURSIVE = "Recursive reactor instantiation!"
	public static val TEXT_ERROR_CONTAINS_RECURSION = "Reactor contains recursive instantiation!"
	public static val TEXT_ERROR_CONTAINS_CYCLE = "Reactor contains cyclic dependencies!"
	public static val TEXT_ERROR_CYCLE_DETECTION = "Dependency cycle detection failed.\nCould not detect dependency cycles due to unexpected graph structure."
	public static val TEXT_ERROR_CYCLE_BTN_SHOW = "Show Cycle"
	public static val TEXT_ERROR_CYCLE_BTN_FILTER = "Filter Cycle"
	public static val TEXT_ERROR_CYCLE_BTN_UNFILTER = "Remove Cycle Filter"
	public static val TEXT_NO_INFLUENCE_MODEL = "No influence model"
	public static val TEXT_REACTOR_NULL = "Reactor is null"
	public static val TEXT_HIDE_ACTION = "[Hide]"
	public static val TEXT_SHOW_ACTION = "[Details]"
	
	// -------------------------------------------------------------------------
	
	/** Synthesis category */
	public static val SynthesisOption APPEARANCE = SynthesisOption.createCategory("Appearance", true)
	public static val SynthesisOption EXPERIMENTAL = SynthesisOption.createCategory("Experimental", true)
	
	/** Synthesis options */	
	public static val SynthesisOption SHOW_USER_LABELS = SynthesisOption.createCheckOption("User Labels (@label in JavaDoc)", true).setCategory(APPEARANCE)
	public static val SynthesisOption SHOW_HYPERLINKS = SynthesisOption.createCheckOption("Expand/Collapse Hyperlinks", false).setCategory(APPEARANCE)
	public static val SynthesisOption USE_ALTERNATIVE_DASH_PATTERN = SynthesisOption.createCheckOption("Alternative Dependency Line Style", false).setCategory(APPEARANCE)
	public static val SynthesisOption SHOW_REACTOR_HOST = SynthesisOption.createCheckOption("Reactor Host Addresses", true).setCategory(APPEARANCE)
	public static val SynthesisOption SHOW_INSTANCE_NAMES = SynthesisOption.createCheckOption("Reactor Instance Names", false).setCategory(APPEARANCE)
	
//    /** Synthesis actions */
//    public static val DisplayedActionData COLLAPSE_ALL = DisplayedActionData.create(CollapseAllReactorsAction.ID, "Hide all Details")
//    public static val DisplayedActionData EXPAND_ALL = DisplayedActionData.create(ExpandAllReactorsAction.ID, "Show all Details")
	
	
	

	
	
	override getDisplayedSynthesisOptions() {
		return #[
//			MEMORIZE_EXPANSION_STATES,
			SHOW_USER_LABELS,
			SHOW_HYPERLINKS,
			//LinguaFrancaSynthesisInterfaceDependencies.SHOW_INTERFACE_DEPENDENCIES,
			USE_ALTERNATIVE_DASH_PATTERN,
			SHOW_REACTOR_HOST,
			SHOW_INSTANCE_NAMES
		]
	}
	
//    override getDisplayedActions() {
//        return #[COLLAPSE_ALL, EXPAND_ALL]
//    }
	
	// -------------------------------------------------------------------------
	
	private var elemToNode = new HashMap<EObject,KNode>()	
	
	
	override KNode transform(InfluenceModel model) {
		val rootNode = KGraphUtil.createInitializedNode()
		elemToNode.put(model,rootNode)
		try {
			// Find main
			val main = model
			if (main !== null) {
				for(artifact : main.ownedArtifacts){
					var artNode = artifact.createArtifact
					rootNode.children += artNode
					elemToNode.put(artifact,artNode)  
				}
				for(phenomena : main.ownedPhysicalPhenomena){
					var pheNode = phenomena.createPhenomena
					rootNode.children += pheNode
					elemToNode.put(phenomena,pheNode)  
					 
				}
				for(AbstractInfluence absInf: main.ownedInfluences){
					var infNode = absInf.createInfluencePass1
					rootNode.children += infNode
					elemToNode.put(absInf,infNode)  
				}
				for(AbstractInfluence absInf: main.ownedInfluences){
					absInf.createInfluencePass2		
				}
				for(AbstractInfluence absInf: main.ownedInfluences){
					absInf.createInfluencePass3
				}
				for(Requirement req: main.ownedRequirements){
					var reqNode = req.createRequirement
					rootNode.children += reqNode
					elemToNode.put(req,reqNode)
				}
				for(AbstractInfluence absInf: main.ownedInfluences){
					for (sr : absInf.affects){
						if (sr.usedIn.size()>0){
							for (req: sr.usedIn){
								var srNode = elemToNode.get(sr)
								var reqNode = elemToNode.get(req)
								var dest = reqNode.addPort() => [
										setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
									]
								var src = srNode.addPort() => [
										setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
									]
								createDelayEdge().connect(src,dest)
							}
						}
					}
				}
			} else {
				val messageNode = KGraphUtil.createInitializedNode()
				messageNode.addErrorMessage(fr.inria.kairos.influence.visualisation.klighd.synthesis.InfluenceSynthesis.TEXT_NO_INFLUENCE_MODEL, null)
				rootNode.children += messageNode
			}
			
			// Show all reactors
//			if (main === null || SHOW_ALL_REACTORS.booleanValue) {
//				val reactorNodes = newArrayList()
//				val Iterable<FDExtensionRoot> allFDExtensionRoots = model.deployments.filter[depl|depl instanceof FDExtensionRoot].map( d | d as FDExtensionRoot)
//					for(extensionRoot : allFDExtensionRoots){
//						for(extensionElement : extensionRoot.elements){
//							reactorNodes += (extensionElement.target as FInterface).createReactorNode(false, main === null, null, HashBasedTable.<Instantiation, Input, KPort>create, HashBasedTable.<Instantiation, Output, KPort>create, newLinkedList, newHashMap)
//				}
//				if (!reactorNodes.empty) {
//					// To allow ordering, we need box layout but we also need layered layout for ports thus wrap all node
//					// TODO use rect packing in the future
//					reactorNodes.add(0, rootNode.children.head)
//					for (entry : reactorNodes.filter[!getProperty(CoreOptions.COMMENT_BOX)].indexed) {
//						rootNode.children += KGraphUtil.createInitializedNode() => [
//							val node = entry.value
//							children += node
//							// Add comment nodes
//							children += node.incomingEdges.filter[source.getProperty(CoreOptions.COMMENT_BOX)].map[source]
//							
//							addInvisibleContainerRendering
//							setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
//					        setLayoutOption(CoreOptions.PADDING, new ElkPadding(0))
//					        setLayoutOption(CoreOptions.PRIORITY, reactorNodes.size - entry.key) // Order!
//						]
//					}
//					
//					rootNode.setLayoutOption(CoreOptions.ALGORITHM, BoxLayouterOptions.ALGORITHM_ID)
//			        rootNode.setLayoutOption(CoreOptions.SPACING_NODE_NODE, 25.0)
//				}
//			}
//		   }
		} catch (Exception e) {
			e.printStackTrace
			
			val messageNode = KGraphUtil.createInitializedNode()
			messageNode.addErrorMessage("Error in Diagram Synthesis", e.class.simpleName + " occurred. Could not create diagram.")
			rootNode.children += messageNode
		}

		return rootNode
	}
	
	private dispatch def KNode createInfluencePass1(Influence influence) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(influence)
		node.ID = influence.name

		val label = influence.createNamedElementLabel
	
		if (influence === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addInfluenceFigure(influence, label)
			figure.addChildArea()
			
			for(or: influence.originatorArtifact){
				var dest = node.addPort() => [
						setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
					]
				var src = elemToNode.get(or).addPort() => [
						setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
					]
				var edge = createArrowEdge().connect(src,dest)
				node.incomingEdges.add(edge)
				elemToNode.get(or).outgoingEdges.add(edge)
			}
			for(or: influence.originatorPhenomena){
				var dest = node.addPort() => [
						setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
					]
				var src = elemToNode.get(or).addPort() => [
						setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
					]
				var edge = createArrowEdge().connect(src,dest)
				node.incomingEdges.add(edge)
				elemToNode.get(or).outgoingEdges.add(edge)
			}
			
			
			node.configureInterfaceNodeLayout()
			
			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
			
			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT, LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		} 
		
		
		return node	
	}
	
	private dispatch def KNode createInfluencePass2(Influence influence) {
		val node = elemToNode.get(influence)
	
		for(sr: influence.affects){
			var srNode = sr.createSystemResponseNode
			node.parent.children.add(srNode)
			elemToNode.put(sr,srNode)
			var dest = srNode.addPort() => [
					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
				]
			var src = node.addPort() => [
					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
				]
			var edge = createArrowEdge().connect(src,dest)
			node.incomingEdges.add(edge)
			
		}

		
		return node	
	}
	
	private dispatch def KNode createInfluencePass3(Influence influence) {
		val node = elemToNode.get(influence)
	
		for(or: influence.originatorSystemResponse){
			var dest = node.addPort() => [
					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
				]
			var src = elemToNode.get(or).addPort() => [
					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
				]
			var edge = createArrowEdge().connect(src,dest)
			node.incomingEdges.add(edge)
			
		}
				
		return node	
	}
	
	
	
	private dispatch def KNode createInfluencePass1(CompositeInfluence influence) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(influence)
		node.ID = influence.name

		val label = influence.createNamedElementLabel
	
		if (influence === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addCompositeInfluenceFigure(influence, label)
			figure.addChildArea()
			
			for(internInf : influence.internalInfluences){
				var infNode = elemToNode.get(internInf)
				node.children.add(infNode)
				if (internInf instanceof Influence){
					for (or : internInf.originatorArtifact){
						var orNode = elemToNode.get(or)
						node.children.add(orNode)
					}
					for (or : internInf.originatorPhenomena){
						var orNode = elemToNode.get(or)
						node.children.add(orNode)
					}
				}
				
			}
			
		
			node.configureInterfaceNodeLayout()
			
			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
			
			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT, LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		} 
		
		
		return node	
	}
	
		private dispatch def KNode createInfluencePass2(CompositeInfluence influence) {
		val node = elemToNode.get(influence)
	
		for(sr: influence.affects){
			var srNode = sr.createSystemResponseNode
			node.parent.children.add(srNode)
			elemToNode.put(sr,srNode)
			var dest = srNode.addPort() => [
					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
				]
			var src = node.addPort() => [
					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
				]
			var edge = createArrowEdge().connect(src,dest)
			node.incomingEdges.add(edge)
			
		}

		
		return node	
	}
	
	private dispatch def KNode createInfluencePass3(CompositeInfluence influence) {
		val node = elemToNode.get(influence)
	
//		for(or: influence.originatorSystemResponse){
//			var dest = node.addPort() => [
//					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
//				]
//			var src = elemToNode.get(or).addPort() => [
//					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
//				]
//			var edge = createArrowEdge().connect(src,dest)
//			node.incomingEdges.add(edge)
//			
//		}
				
		return node	
	}
	
	
	private def KNode createArtifact(DesignArtifact artifact) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(artifact)
		node.ID = artifact.name

		val label = artifact.createNamedElementLabel
	
		if (artifact === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addDesignArtifactFigure(artifact, label)
			figure.addChildArea()
			
		
			
			node.configureInterfaceNodeLayout()
			
			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
			
			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT, LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		} 
		
		return node	
	}
	
	private def KNode createRequirement(Requirement req) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(req)
		node.ID = req.name

		val label = req.createNamedElementLabel
	
		if (req === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addRequirementFigure(req, label)
			figure.addChildArea()
			
		
			
			node.configureInterfaceNodeLayout()
			
			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
			
			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT, LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		} 
		
		
		return node	// To allow ordering, we need box layout but we also need layered layout for ports thus wrap all node
					// TODO use rect packing in the future
					//reactorNodes.add(0, node.children.head)
	}

	
		private def KNode createPhenomena(PhysicalPhenomena phenomena) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(phenomena)
		node.ID = phenomena.name

		val label = phenomena.createNamedElementLabel
	
		if (phenomena === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addPhenomenaFigure(phenomena, label)
			figure.addChildArea()
			
			node.configureInterfaceNodeLayout()
			
			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
			
			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT, LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		} 
		
		
		return node
	}
	
			private def KNode createSystemResponseNode(SystemResponse sr) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(sr)
		node.ID = sr.name

		val label = sr.createNamedElementLabel
	
		if (sr === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addSystemResponseFigure(sr, label)
			figure.addChildArea()
			
			node.configureInterfaceNodeLayout()
			
			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING, EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
			
			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT, LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		} 
		
		
		return node
	}
	
	
	
//	private def Collection<KNode> createInterfaceNode(
//		AbstractInfluence influence,
//		boolean isComposite,
//		boolean expandDefault,
//		Influence instance
//	) {
//		val node = KGraphUtil.createInitializedNode()
//		val nodes = newArrayList(node)
//		node.associateWith(influence)
//		node.ID = isComposite ? "main" : influence?.name
//
//		val label = createNamedElementLabel(influence)
//		if (influence === null) {
//			node.addErrorMessage(TEXT_REACTOR_NULL, null)
//		} else {
//			// Expanded Rectangle
//			node.addReactorFigure(influence, instance, label) => [ ReactorFigureComponents comps |
//				comps.figures.forEach[associateWith(influence)]
//				comps.outer.setProperty(KlighdProperties.EXPANDED_RENDERING, true)
////				comps.figures.forEach[addDoubleClickAction(MEM_EXPAND_COLLAPSE_ACTION_ID)]
////				comps.reactor.handleIcon(reactor, false)
//
//				if (SHOW_HYPERLINKS.booleanValue) {
//					// Collapse button
//					comps.reactor.addTextButton(TEXT_HIDE_ACTION) => [
//						setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 0, 0)
////						addSingleClickAction(MEM_EXPAND_COLLAPSE_ACTION_ID)
////						addDoubleClickAction(MEM_EXPAND_COLLAPSE_ACTION_ID)
//					]
//				}
//				
////				if (REACTOR_PARAMETER_MODE.objectValue === ReactorParameterDisplayModes.TABLE && !reactor.parameters.empty) {
////					comps.reactor.addRectangle() => [
////						invisible = true
////						if (!SHOW_HYPERLINKS.booleanValue) {
////							setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 4, 0)
////						} else {
////							setGridPlacementData().from(LEFT, 8, 0, TOP, 4, 0).to(RIGHT, 8, 0, BOTTOM, 0, 0)
////						}
////						horizontalAlignment = HorizontalAlignment.LEFT
////						
////						addParameterList(reactor.parameters)
////					]
////				}
//				
//				comps.reactor.addChildArea()
//			]
//
////			// Collapse Rectangle
////			node.addReactorFigure(influence, instance, label) => [ ReactorFigureComponents comps |
////				comps.figures.forEach[associateWith(influence)]
////				comps.outer.setProperty(KlighdProperties.COLLAPSED_RENDERING, true)
////				if (reactor.hasContent && !recursive) {
////					comps.figures.forEach[addDoubleClickAction(MEM_EXPAND_COLLAPSE_ACTION_ID)]
////				}
////				comps.reactor.handleIcon(reactor, true)
////
////				if (SHOW_HYPERLINKS.booleanValue) {
////					// Expand button
////					if (reactor.hasContent && !recursive) {
////						comps.reactor.addTextButton(TEXT_SHOW_ACTION) => [
////							setGridPlacementData().from(LEFT, 8, 0, TOP, 0, 0).to(RIGHT, 8, 0, BOTTOM, 8, 0)
////							addSingleClickAction(MEM_EXPAND_COLLAPSE_ACTION_ID)
////							addDoubleClickAction(MEM_EXPAND_COLLAPSE_ACTION_ID)
////						]
////					}
////				}
////				
////				if (recursive) {
////					comps.figures.forEach[errorStyle()]
////				}
////			]
//			
////			// Create ports
//////			val inputPorts = <FMethod, KPort>newHashMap
//////			val outputPorts = <FMethod, KPort>newHashMap
////			for (input : influence.methods.filter[m | m.kind == FMethodKind.PROVIDED]) {
////				inputPorts.put(input, node.addIOPort(input, true))
////			}
////			for (output : influence.methods.filter[m | m.kind == FMethodKind.REQUIRED]) {
////				outputPorts.put(output, node.addIOPort(output, false))
////			}
////			// Mark ports
////			inputPorts.values.forEach[setProperty(REACTOR_INPUT, true)]
////            outputPorts.values.forEach[setProperty(REACTOR_OUTPUT, true)]
//
//			// Add content
////			if (reactor.hasContent && !recursive) {
////				node.children += reactor.transformReactorNetwork(inputPorts, outputPorts, parentReactors, allReactorNodes)
////			}
//			
//			// Pass port to given tables
////			if (instance !== null) {
////				if (inputPortsReg !== null) {
////					for (entry : inputPorts.entrySet) {
////						inputPortsReg.put(instance, entry.key, entry.value)
////					}
////				}
////				if (outputPortsReg !== null) {
////					for (entry : outputPorts.entrySet) {
////						outputPortsReg.put(instance, entry.key, entry.value)
////					}
////				}
////			}
//			
////			node.setProperty(REACTOR_INSTANCE, instanceTrail) // save to distinguish nodes associated with the same reactor
////			node.setLayoutOption(KlighdProperties.EXPAND, expandDefault)
//			// Interface Dependencies
////			node.addInterfaceDependencies(expandDefault)
//			
////			if (instance !== null) {
////				nodes += instance.createUserComments(node)
////				if (!SHOW_ALL_REACTORS.booleanValue) {
////					nodes += reactor.createUserComments(node)
////				}
////			} else {
////				nodes += reactor.createUserComments(node)
////			}
//			
//			node.configureInterfaceNodeLayout()
//		}
//		
//		
//		return nodes
//	}
	
	private def configureInterfaceNodeLayout(KNode node) {
		

//		
		node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, SizeConstraint.minimumSizeWithPorts)
		node.setLayoutOption(CoreOptions.PORT_CONSTRAINTS, PortConstraints.FIXED_ORDER)
		node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
		node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.ORTHOGONAL)
		if (!SHOW_HYPERLINKS.booleanValue) {
			node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(2, 6, 6, 6))
			node.setLayoutOption(LayeredOptions.SPACING_NODE_NODE, LayeredOptions.SPACING_NODE_NODE.^default * 0.75f)
			node.setLayoutOption(LayeredOptions.SPACING_NODE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_NODE_NODE_BETWEEN_LAYERS.^default * 0.75f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 0.75f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS, LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 0.75f)
		}
	}
	
	
	private def String createNamedElementLabel(NamedElement ne) {
        val b = new StringBuilder
        b.append(
            ne === null ? "<NULL>" : ne.name ?:
                "<Unresolved Element>")
        return b.toString()
    }
	

//	private def addParameterList(KContainerRendering container, List<Parameter> parameters) {
//		var cols = 1
//		try {
//			cols = REACTOR_PARAMETER_TABLE_COLS.intValue
//		} catch (Exception e) {} // ignore
//		if (cols > parameters.size) {
//			cols = parameters.size
//		}
//		container.gridPlacement = cols
//		for (param : parameters) {
//			container.addText(param.createParameterLabel(true)) => [
//				fontSize = 8
//				horizontalAlignment = HorizontalAlignment.LEFT
//			]
//		}
//	}
//	
//	private def String createParameterLabel(Parameter param, boolean bullet) {
//		val b = new StringBuilder
//		if (bullet) {
//			b.append("\u2022 ")
//		}
//		b.append(param.name)
//		val t = ASTUtils.getInferredType(param).toText
//		if (!t.nullOrEmpty) {
//			b.append(":").append(t)
//		}
//		return b.toString()
//	}
	
	private def createDelayEdge(Object associate) {
		return createEdge => [
			associateWith(associate)
			addPolyline() => [
				if (USE_ALTERNATIVE_DASH_PATTERN.booleanValue) {
					lineStyle = LineStyle.CUSTOM
					lineStyle.dashPattern += ALTERNATIVE_DASH_PATTERN
				} else {
					lineStyle = LineStyle.DASH
				}
				boldLineSelectionStyle()
			]
		]
	}
	
	private def createIODependencyEdge(Object associate) {
		return createEdge => [
			if (associate !== null) {
				associateWith(associate)
			}
			addPolyline() => [
				boldLineSelectionStyle()
			]
		]
	}
	
	private def createDependencyEdge(Object associate) {
		return createEdge => [
			if (associate !== null) {
				associateWith(associate)
			}
			addPolyline() => [
				if (USE_ALTERNATIVE_DASH_PATTERN.booleanValue) {
					lineStyle = LineStyle.CUSTOM
					lineStyle.dashPattern += ALTERNATIVE_DASH_PATTERN
				} else {
					lineStyle = LineStyle.DASH
				}
				boldLineSelectionStyle()
			]
		]
	}
	
	private def createOrderEdge() {
		return createEdge => [
			addPolyline() => [
				lineWidth = 1.5f
				lineStyle = LineStyle.DOT
				foreground = Colors.CHOCOLATE_1
				boldLineSelectionStyle()
				//addFixedTailArrowDecorator() // Fix for bug: https://github.com/kieler/KLighD/issues/38
				addHeadArrowDecorator()
			]
		]
	}
	
	private def createArrowEdge() {
		return createEdge => [
			addPolyline() => [
				lineWidth = 1.5f
				foreground = Colors.CHOCOLATE_1
				boldLineSelectionStyle()
				//addFixedTailArrowDecorator() // Fix for bug: https://github.com/kieler/KLighD/issues/38
				addHeadArrowDecorator()
			]
		]
	}
	
	private def dispatch KEdge connect(KEdge edge, KNode src, KNode dst) {
		edge.source = src
		edge.target = dst
		
		return edge
	}
	private def dispatch KEdge connect(KEdge edge, KNode src, KPort dst) {
		edge.source = src
		edge.targetPort = dst
		edge.target = dst?.node
		
		return edge
	}
	private def dispatch KEdge connect(KEdge edge, KPort src, KNode dst) {
		edge.sourcePort = src
		edge.source = src?.node
		edge.target = dst
		
		return edge
	}
	private def dispatch KEdge connect(KEdge edge, KPort src, KPort dst) {
		edge.sourcePort = src
		edge.source = src?.node
		edge.targetPort = dst
		edge.target = dst?.node
		
		return edge
	}
	
//	/**
//	 * Translate an input/output into a port.
//	 */
//	private def addIOPort(KNode node, FMethod lfPort, boolean input) {
//		val port = createPort
//		node.ports += port
//		
//		port.associateWith(lfPort)
//		port.setPortSize(6, 6)
//		
//		if (input) {
//            // multiports are smaller by an offset at the right, hence compensate in inputs
//            val offset = -3.3
//			port.setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
//			port.setLayoutOption(CoreOptions.PORT_BORDER_OFFSET, offset)
//		} else {
//		    var offset = -3.3 // multiports are smaller
//			port.setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
//			port.setLayoutOption(CoreOptions.PORT_BORDER_OFFSET, offset)
//		}
//		
//		
//		port.addTrianglePort
//		
//		var label = lfPort.name
//		port.addOutsidePortLabel(label, 8).associateWith(lfPort)
//		return port
//	}

	private def KPort addInvisiblePort(KNode node) {
		val port = createPort
		node.ports += port
		
		port.setSize(0, 0) // invisible

		return port
	}
	
	private def KPort addPort(KNode node) {
		val port = createPort
		node.ports += port
		
		port.setSize(3, 3) // invisible

		return port
	}
	
//	private def KNode addErrorComment(KNode node, String message) {
//		val comment = KGraphUtil.createInitializedNode()
//        comment.setLayoutOption(CoreOptions.COMMENT_BOX, true)
//        comment.addCommentFigure(message) => [
//        	errorStyle()
//        	background = Colors.PEACH_PUFF_2
//        ]
//        
//        // connect
//        createEdge() => [
//        	source = comment
//        	target = node
//        	addCommentPolyline().errorStyle()
//        ]  
//        
//        return comment
//	}
	
//	private def Iterable<KNode> createUserComments(EObject element, KNode targetNode) {
//		if (SHOW_USER_LABELS.booleanValue) {
//			val commentText = ASTUtils.findAnnotationInComments(element, "@label")
//			
//			if (!commentText.nullOrEmpty) {
//				val comment = KGraphUtil.createInitializedNode()
//		        comment.setLayoutOption(CoreOptions.COMMENT_BOX, true)
//		        comment.addCommentFigure(commentText) => [
//		        	commentStyle()
//		        ]
//		        
//		        // connect
//		        createEdge() => [
//		        	source = comment
//		        	target = targetNode
//		        	addCommentPolyline().commentStyle()
//		        ]  
//		        
//		        return #[comment]
//			}
//		}
//		return #[]
//	}

}
