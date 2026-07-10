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
import fr.inria.kairos.influence.metamodel.EnvironmentalFactor
import de.cau.cs.kieler.klighd.kgraph.util.KGraphUtil
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject

import fr.inria.kairos.influence.metamodel.CompositeInfluence
import fr.inria.kairos.influence.metamodel.InfluenceFunction
import fr.inria.kairos.influence.metamodel.ArtifactParticipant
import fr.inria.kairos.influence.metamodel.EnvironmentalFactorParticipant
import fr.inria.kairos.influence.metamodel.SRPInputParticipant
import fr.inria.kairos.influence.metamodel.SystemResponseProperty
import fr.inria.kairos.influence.metamodel.SatisfactionCriterion
import fr.inria.kairos.influence.metamodel.FunctionRepresentation
import fr.inria.kairos.influence.metamodel.NaturalLanguageFunction
import fr.inria.kairos.influence.metamodel.AnalyticExpressionFunction
import fr.inria.kairos.influence.metamodel.ParticipantImpactFunction
import fr.inria.kairos.influence.metamodel.MonotonicityTable
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil
/**
 * Diagram synthesis for Influence programs.
 * adapted from LF program originnaly written by 
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 * and adapted by
 * @author{Julien Deantoni <julien.deantoni@univ-cotedazur.fr>}
 * @author{Barbara da Silva Oliveira <barbara.da-silva-oliveira@inria.fr>}
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
	public static val REACTOR_RECURSIVE_INSTANTIATION = new Property<Boolean>(
		"org.lflang.linguafranca.diagram.synthesis.reactor.recursive.instantiation", false)
	public static val REACTOR_HAS_BANK_PORT_OFFSET = new Property<Boolean>(
		"org.lflang.linguafranca.diagram.synthesis.reactor.bank.offset", false)
	public static val REACTOR_INPUT = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.input",
		false)
	public static val REACTOR_OUTPUT = new Property<Boolean>("org.lflang.linguafranca.diagram.synthesis.reactor.output",
		false)

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
	public static val SynthesisOption SHOW_USER_LABELS = SynthesisOption.createCheckOption(
		"User Labels (@label in JavaDoc)", true).setCategory(APPEARANCE)
	public static val SynthesisOption SHOW_HYPERLINKS = SynthesisOption.createCheckOption("Expand/Collapse Hyperlinks",
		false).setCategory(APPEARANCE)
	public static val SynthesisOption USE_ALTERNATIVE_DASH_PATTERN = SynthesisOption.createCheckOption(
		"Alternative Dependency Line Style", false).setCategory(APPEARANCE)
	public static val SynthesisOption SHOW_REACTOR_HOST = SynthesisOption.createCheckOption("Reactor Host Addresses",
		true).setCategory(APPEARANCE)
	public static val SynthesisOption SHOW_INSTANCE_NAMES = SynthesisOption.createCheckOption("Reactor Instance Names",
		false).setCategory(APPEARANCE)

//    /** Synthesis actions */
//    public static val DisplayedActionData COLLAPSE_ALL = DisplayedActionData.create(CollapseAllReactorsAction.ID, "Hide all Details")
//    public static val DisplayedActionData EXPAND_ALL = DisplayedActionData.create(ExpandAllReactorsAction.ID, "Show all Details")
	override getDisplayedSynthesisOptions() {
		return #[
//			MEMORIZE_EXPANSION_STATES,
			SHOW_USER_LABELS,
			SHOW_HYPERLINKS,
			// LinguaFrancaSynthesisInterfaceDependencies.SHOW_INTERFACE_DEPENDENCIES,
			USE_ALTERNATIVE_DASH_PATTERN,
			SHOW_REACTOR_HOST,
			SHOW_INSTANCE_NAMES
		]
	}

//    override getDisplayedActions() {
//        return #[COLLAPSE_ALL, EXPAND_ALL]
//    }
	// -------------------------------------------------------------------------
	private var elemToNode = new HashMap<EObject, KNode>()
	private var reqRefToNode = new HashMap<EObject, KNode>()
	private var reqKeyToNode = new HashMap<String, KNode>()
	override KNode transform(InfluenceModel model) {
		val rootNode = KGraphUtil.createInitializedNode()
		elemToNode.put(model, rootNode)
		try {
			// Find main
			val main = model
			if (main !== null) {
				for (artifact : main.ownedArtifacts) {
					var artNode = artifact.createArtifact
					rootNode.children += artNode
					elemToNode.put(artifact, artNode)
				}
				for (factor : main.ownedEnvironmentalFactors) {
					var pheNode = factor.createEnvironmentalFactor
					rootNode.children += pheNode
					elemToNode.put(factor, pheNode)

				}
				
				for (srp : main.ownedSRPs) {
        			val srpNode = srp.createSystemResponseNode
        			rootNode.children += srpNode
        			elemToNode.put(srp, srpNode)
      			}
      			
				for (AbstractInfluence absInf : main.ownedInfluences) {
					var infNode = absInf.createInfluencePass1
					rootNode.children += infNode
					elemToNode.put(absInf, infNode)
				}
				for (AbstractInfluence absInf : main.ownedInfluences) {
					absInf.createInfluencePass2
				}
				for (AbstractInfluence absInf : main.ownedInfluences) {
					absInf.createInfluencePass3
				}
				
				// Satisfaction criteria replace local Requirement.
			// They are the DSL-owned traceability/margin artifacts.
			
			val reqKeyToRepresentativeCriterion = new HashMap<String, SatisfactionCriterion>()
			val reqKeyToSrps = new HashMap<String, java.util.LinkedHashSet<SystemResponseProperty>>()
			
			// Collect all SRPs per referenced requirement.
			for (criterion : main.allSatisfactionCriteria) {
				val reqRef = criterion.requirementRef
			
				if (reqRef !== null) {
					val reqKey = requirementKey(reqRef)
			
					if (!reqKeyToRepresentativeCriterion.containsKey(reqKey)) {
						reqKeyToRepresentativeCriterion.put(reqKey, criterion)
					}
			
					var srps = reqKeyToSrps.get(reqKey)
					if (srps === null) {
						srps = new java.util.LinkedHashSet<SystemResponseProperty>()
						reqKeyToSrps.put(reqKey, srps)
					}
			
					for (srp : criterion.constrainedSrps) {
						if (srp !== null) {
							srps.add(srp)
						}
					}
				}
			}
			
			// Create one visual requirement node per referenced requirement.
			for (entry : reqKeyToRepresentativeCriterion.entrySet) {
				val reqKey = entry.key
				val criterion = entry.value
			
				if (!reqKeyToNode.containsKey(reqKey)) {
					val reqNode = criterion.createRequirementNodeFromCriterion
					rootNode.children += reqNode
					reqKeyToNode.put(reqKey, reqNode)
			
					if (criterion.requirementRef !== null) {
						elemToNode.put(criterion.requirementRef, reqNode)
					}
				}
			}
			
			// Connect only terminal SRPs to requirement nodes.
			val alreadyConnected = newHashSet
			
			for (entry : reqKeyToSrps.entrySet) {
				val reqKey = entry.key
				val reqNode = reqKeyToNode.get(reqKey)
			
				if (reqNode !== null) {
					val terminalSrps = main.terminalSrpsForRequirement(entry.value)
			
					for (srp : terminalSrps) {
						val srpNode = elemToNode.get(srp)
			
						if (srpNode !== null) {
							val edgeKey = srp.name + "->" + reqKey
			
							if (!alreadyConnected.contains(edgeKey)) {
								alreadyConnected += edgeKey
			
								val criterion = main.findCriterionForRequirementAndSrp(reqKey, srp)
			
								val src = reqNode.addPort => [
									setLayoutOption(CoreOptions.PORT_SIDE, PortSide.SOUTH)
								]
			
								val dest = srpNode.addPort => [
									setLayoutOption(CoreOptions.PORT_SIDE, PortSide.NORTH)
								]
			
								createRequirementTraceEdge(criterion).connect(src, dest)
							}
						}
					}
				}
			}
						
			// SRP -> SatisfactionCriterion edges
//			for (criterion : main.allSatisfactionCriteria) {
//				val criterionNode = elemToNode.get(criterion)
//			
//				if (criterionNode !== null) {
//					for (srp : criterion.constrainedSrps) {
//						val srpNode = elemToNode.get(srp)
//			
//						if (srpNode !== null) {
//							val src = srpNode.addPort => [
//								setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
//							]
//			
//							val dest = criterionNode.addPort => [
//								setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
//							]
//			
//							createDelayEdge(criterion).connect(src, dest)
//						}
//					}
//				}
//			}
//			}else {
//				val messageNode = KGraphUtil.createInitializedNode()
//				messageNode.addErrorMessage(
//					fr.inria.kairos.influence.visualisation.klighd.synthesis.InfluenceSynthesis.TEXT_NO_INFLUENCE_MODEL,
//					null)
//				rootNode.children += messageNode
//			}

//comenting:
//			rootNode.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
//			rootNode.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)


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
		}
		
		} catch (Exception e) {
			e.printStackTrace

			val messageNode = KGraphUtil.createInitializedNode()
			messageNode.addErrorMessage("Error in Diagram Synthesis",
				e.class.simpleName + " occurred. Could not create diagram.")
			rootNode.children += messageNode
		}

		return rootNode
	}
	
	private def Iterable<SatisfactionCriterion> allSatisfactionCriteria(InfluenceModel model) {
		val result = newArrayList
	
		if (model !== null) {
			val it = model.eAllContents
	
			while (it.hasNext) {
				val obj = it.next
	
				if (obj instanceof SatisfactionCriterion) {
					result += obj
				}
			}
		}
	
		return result
		}
	
	private def Iterable<SystemResponseProperty> constrainedSrps(SatisfactionCriterion criterion) {
		val result = newLinkedHashSet
	
		if (criterion === null) {
			return result
		}

	// Preferred new metamodel:
	// SatisfactionCriterion.constrainedSRPs : SystemResponseProperty[*]
		val feature = criterion.eClass.getEStructuralFeature("constrainedSRPs")
	
		if (feature !== null && criterion.eIsSet(feature)) {
			val value = criterion.eGet(feature)
	
			if (value instanceof java.util.Collection<?>) {
				for (item : value as java.util.Collection<?>) {
					if (item instanceof SystemResponseProperty) {
						result += item as SystemResponseProperty
					}
				}
			} else if (value instanceof SystemResponseProperty) {
				result += value as SystemResponseProperty
			}
		}

	// Compatibility mode:
	// SatisfactionCriterion is contained by SystemResponseProperty
		if (result.empty && criterion.eContainer instanceof SystemResponseProperty) {
			result += criterion.eContainer as SystemResponseProperty
		}
	
		return result
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
		
		    // Function
			if (influence.ownedInfluenceFunction !== null) {
				val funNode = influence.ownedInfluenceFunction.createInfluenceFunction
				node.children.add(funNode)
			}		
		    // Participants: Artifact & EnvironmentalFactor INTO Influence
		    for (p : influence.ownedParticipants) {
		      switch p {
		        ArtifactParticipant: {
		          val a = p.target
		          if (a !== null) {
		            val dest = node.addPort => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST) ]
		            val src  = elemToNode.get(a).addPort => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST) ]
		            val edge = createArrowEdge().connect(src, dest)
		            node.incomingEdges.add(edge)
		          }
		        }
		        EnvironmentalFactorParticipant: {
		          val ef = p.target
		          if (ef !== null) {
		            val dest = node.addPort => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST) ]
		            val src  = elemToNode.get(ef).addPort => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST) ]
		            val edge = createArrowEdge().connect(src, dest)
		            node.incomingEdges.add(edge)
		          }
		        }
//		       SRPInputParticipant: {
//		       	val srp = p.target
//            	if (srp !== null) {
//                	var srNode = elemToNode.get(srp)
//                	if (srNode === null) {
//                    	srNode = srp.createSystemResponseNode
//                    	node.parent.children += srNode
//                    	elemToNode.put(srp, srNode)
//                	}
//                val dest = node.addPort => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST) ]
//                val src  = srNode.addPort => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST) ]
//                createArrowEdge.connect(src, dest)
//            }
//            
//            }
		        default: { /* SRP inputs handled in pass 3 */ }
		      }
		    }
		
		    node.configureInterfaceNodeLayout()
		
		    // (layout options unchanged)
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

//
//	private dispatch def KNode createInfluencePass1(Influence influence) {
//		val node = KGraphUtil.createInitializedNode()
//		node.associateWith(influence)
//		node.ID = influence.name
//
//		val label = influence.createNamedElementLabel
//
//		if (influence === null) {
//			node.addErrorMessage(TEXT_REACTOR_NULL, null)
//		} else {
//			val figure = node.addInfluenceFigure(influence, label)
//			var childArea = figure.addChildArea()
//			var funNode = influence.ownedFunction.createFunction
//			node.children.add(funNode)
//			for (or : influence.originatorArtifact) {
//				var dest = node.addPort() => [
//					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
//				]
//				var src = elemToNode.get(or).addPort() => [
//					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
//				]
//				var edge = createArrowEdge().connect(src, dest)
//				node.incomingEdges.add(edge)
//				elemToNode.get(or).outgoingEdges.add(edge)
//			}
//			for (or : influence.originatorPhenomena) {
//				var dest = node.addPort() => [
//					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
//				]
//				var src = elemToNode.get(or).addPort() => [
//					setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
//				]
//				var edge = createArrowEdge().connect(src, dest)
//				node.incomingEdges.add(edge)
//				elemToNode.get(or).outgoingEdges.add(edge)
//			}
//
//			node.configureInterfaceNodeLayout()
//
//			// Additional layout adjustment for main node
//			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
//			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
//			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
//			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
//			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
//				EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
//			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
//			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
//				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
//			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
//			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
//
//			if (!SHOW_HYPERLINKS.booleanValue) {
//				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
//				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
//					LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
//			}
//		}
//
//		return node
//	}

	private dispatch def KNode createInfluencePass2(Influence influence) {

	  	val node = elemToNode.get(influence)
		val srp = influence.outputSRP
		if (srp !== null) {
			val srpNode = elemToNode.get(srp)
		    if (srpNode !== null) {
		    	val dest = srpNode.addPort => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST) ]
		    	val src  = node.addPort    => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST) ]
		   		val edge = createArrowEdge().connect(src, dest)
		      // node.outgoingEdges.add(edge)   // optional
		    }
		  }
		return node
	}

	private dispatch def KNode createInfluencePass3(Influence influence) {
		val node = elemToNode.get(influence)

		for (p : influence.ownedParticipants) {
		    if (p instanceof SRPInputParticipant) {
		    	val srp = p.target
		    	val srpNode = if (srp !== null) elemToNode.get(srp) else null
		    	if (srpNode !== null) {
		        val dest = node.addPort   => [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST) ]
		        val src  = srpNode.addPort=> [ setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST) ]
		        val e = createArrowEdge().connect(src, dest)
		        node.incomingEdges += e
        		}
		    }
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
		
		    for (internInf : influence.internalInfluences) {
		      val infNode = elemToNode.get(internInf)
		      node.children += infNode
		
		      if (internInf instanceof Influence) {
		        // bring visible sources inside the composite box
		        for (p : internInf.ownedParticipants) {
		          switch p {
		            ArtifactParticipant: {
		              val a = p.target
		              if (a !== null) node.children += elemToNode.get(a)
		            }
		            EnvironmentalFactorParticipant: {
		              val ef = p.target
		              if (ef !== null) node.children += elemToNode.get(ef)
		            }
		            SRPInputParticipant: {
		              val s = p.target
		              if (s !== null) node.children += elemToNode.get(s)
		            }
		            default: {}
		          }
		        }
		      }
		    }
		
		    node.configureInterfaceNodeLayout()
		    // (same layout options as before)
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
	
//	private dispatch def KNode createInfluencePass1(CompositeInfluence influence) {
//		val node = KGraphUtil.createInitializedNode()
//		node.associateWith(influence)
//		node.ID = influence.name
//
//		val label = influence.createNamedElementLabel
//
//		if (influence === null) {
//			node.addErrorMessage(TEXT_REACTOR_NULL, null)
//		} else {
//			val figure = node.addCompositeInfluenceFigure(influence, label)
//			figure.addChildArea()
//
//			for (internInf : influence.internalInfluences) {
//				var infNode = elemToNode.get(internInf)
//				node.children.add(infNode)
//				if (internInf instanceof Influence) {
//					for (or : internInf.originatorArtifact) {
////						var src = elemToNode.get(or).addInvisiblePort() => [
////							setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
////						]
////						var dest = node.addInvisiblePort() => [
////							setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
////						]
////						createInvisibleEdge().connect(src,dest)
//						var orNode = elemToNode.get(or)
//						node.children.add(orNode)
//					}
//					for (or : internInf.originatorPhenomena) {
////						var src = elemToNode.get(or).addInvisiblePort() => [
////							setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
////						]
////						var dest = node.addInvisiblePort() => [
////							setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
////						]
////						createInvisibleEdge().connect(src,dest)
//						var orNode = elemToNode.get(or)
//						node.children.add(orNode)
//					}
//				}
//
//			}
//
//			node.configureInterfaceNodeLayout()
//
//			// Additional layout adjustment for main node
//			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
//			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
//			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
//			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
//			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
//				EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
//			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
//			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
//				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
//			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
//			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
//
//			if (!SHOW_HYPERLINKS.booleanValue) {
//				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
//				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
//					LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
//			}
//		}
//
//		return node
//	}

	private dispatch def KNode createInfluencePass2(CompositeInfluence influence) {
		val node = elemToNode.get(influence)

//		for (sr : influence.affects) {
//			var srNode = sr.createSystemResponseNode
//			node.parent.children.add(srNode)
//			elemToNode.put(sr, srNode)
//			var dest = srNode.addPort() => [
//				setLayoutOption(CoreOptions.PORT_SIDE, PortSide.WEST)
//			]
//			var src = node.addPort() => [
//				setLayoutOption(CoreOptions.PORT_SIDE, PortSide.EAST)
//			]
//			var edge = createArrowEdge().connect(src, dest)
//			node.incomingEdges.add(edge)
//
//		}

		return node
	}

	private dispatch def KNode createInfluencePass3(CompositeInfluence influence) {
		val node = elemToNode.get(influence)
		
		if (influence.ownedInfluenceFunction !== null) {
			val funNode = influence.ownedInfluenceFunction.createInfluenceFunction
			node.children.add(funNode)
		}
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
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
				EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)

			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
					LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		}

		return node
	}

	private dispatch def KNode createInfluenceFunction(InfluenceFunction fun) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(fun)
		node.ID = fun.name

		val label = fun.createInfluenceFunctionLabel

		if (fun === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addInfluenceFunctionFigure(fun, label)
			figure.addChildArea()

			node.configureInterfaceNodeLayout()

			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
				EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)

			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
					LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		}

		return node
	}

//	private def KNode createSatisfactionCriterion(SatisfactionCriterion criterion) {
//		val node = KGraphUtil.createInitializedNode()
//		node.associateWith(criterion)
//		node.ID = "SC_" + criterion.safeName
//	
//		val label = criterion.createSatisfactionCriterionLabel
//	
//		if (criterion === null) {
//			node.addErrorMessage(TEXT_REACTOR_NULL, null)
//		} else {
//			val figure = node.addSatisfactionCriterionFigure(criterion, label)
//			figure.addChildArea()
//	
//			node.configureInterfaceNodeLayout()
//	
//			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
//			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
//			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
//			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
//			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
//				EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
//			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
//			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
//				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
//			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
//			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
//	
//			if (!SHOW_HYPERLINKS.booleanValue) {
//				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
//				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
//					LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
//			}
//		}
//	
//		return node
//	}

	private def KNode createRequirementNodeFromCriterion(SatisfactionCriterion criterion) {
	    val node = KGraphUtil.createInitializedNode()
	    node.associateWith(criterion.requirementRef)
	    node.ID = getRequirementNodeId(criterion)
	
	    val label = getRequirementLabel(criterion)
	
	    if (criterion === null || criterion.requirementRef === null) {
	        node.addErrorMessage("Requirement reference is null", null)
	    } else {
	        val figure = node.addRequirementFigure(label)
	        figure.addChildArea()
	
	        node.configureInterfaceNodeLayout()
			node.setLayoutOption(CoreOptions.COMMENT_BOX, true)

			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(4, 6, 4, 6))
			
//	        node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
//	        node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
//	        node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
//	        node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
//	        node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
//	            EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
//	        node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
//	        node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
//	            LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
//	        node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
//	        node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)
//	
//	        if (!SHOW_HYPERLINKS.booleanValue) {
//	            node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
//	            node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
//	                LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
//	        }
	    }
	
	    return node
	}

	private def KNode createEnvironmentalFactor(EnvironmentalFactor ef) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(ef)
		node.ID = ef.name

		val label = ef.createNamedElementLabel

		if (ef === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addPhenomenaFigure(ef, label)
			figure.addChildArea()

			node.configureInterfaceNodeLayout()

			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
				EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)

			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
					LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		}

		return node
	}

	private def KNode createSystemResponseNode(SystemResponseProperty srp) {
		val node = KGraphUtil.createInitializedNode()
		node.associateWith(srp)
		node.ID = srp.name

		val label = srp.createNamedElementLabel

		if (srp === null) {
			node.addErrorMessage(TEXT_REACTOR_NULL, null)
		} else {
			val figure = node.addSystemResponseFigure(srp, label)
			figure.addChildArea()

			node.configureInterfaceNodeLayout()

			// Additional layout adjustment for main node
			node.setLayoutOption(CoreOptions.ALGORITHM, LayeredOptions.ALGORITHM_ID)
			node.setLayoutOption(CoreOptions.DIRECTION, Direction.RIGHT)
			node.setLayoutOption(CoreOptions.NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.MINIMUM_SIZE))
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_FIXED_ALIGNMENT, FixedAlignment.BALANCED)
			node.setLayoutOption(LayeredOptions.NODE_PLACEMENT_BK_EDGE_STRAIGHTENING,
				EdgeStraighteningStrategy.IMPROVE_STRAIGHTNESS)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 1.1f)
			node.setLayoutOption(LayeredOptions.CROSSING_MINIMIZATION_SEMI_INTERACTIVE, true)
			node.setLayoutOption(LayeredOptions.EDGE_ROUTING, EdgeRouting.SPLINES)

			if (!SHOW_HYPERLINKS.booleanValue) {
				node.setLayoutOption(CoreOptions.PADDING, new ElkPadding(-1, 6, 6, 6))
				node.setLayoutOption(LayeredOptions.SPACING_COMPONENT_COMPONENT,
					LayeredOptions.SPACING_COMPONENT_COMPONENT.^default * 0.5f)
			}
		}

		return node
	}
	
	private def String createInfluenceFunctionLabel(InfluenceFunction fun) {
		val b = new StringBuilder
	
		if (fun === null) {
			b.append("<NULL>")
			return b.toString
		}
	
		b.append(fun.safeName)
	
		val reps = fun.representations
	
		if (reps !== null && !reps.empty) {
			for (rep : reps) {
				b.append("\n").append(rep.representationLabel)
			}
		} else {
			b.append("\n<no representation>")
		}
	
		return b.toString
	}
	
	
	def addRequirementFigure(KNode node, String text) {
    val padding = SHOW_HYPERLINKS.booleanValue ? 8 : 6
    val figure = node.addRoundedRectangle(8, 8, 1) => [
        setGridPlacement(1)
        lineWidth = 1
        foreground = Colors.PURPLE_3
        boldLineSelectionStyle
    ]

    figure.addRectangle() => [
        invisible = true
        setGridPlacementData()
            .from(LEFT, padding, 0, TOP, padding, 0)
            .to(RIGHT, padding, 0, BOTTOM, 4, 0)

        addRectangle() => [
            invisible = true
            setPointPlacementData(
                LEFT, 0, 0.5f,
                TOP, 0, 0.5f,
                H_CENTRAL, V_CENTRAL,
                0, 0, 0, 0
            )

            setGridPlacement(1)

            addText(text) => [
                noSelectionStyle()
                underlineSelectionStyle()
            ]
        ]
    ]
	return figure
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
			node.setLayoutOption(LayeredOptions.SPACING_NODE_NODE_BETWEEN_LAYERS,
				LayeredOptions.SPACING_NODE_NODE_BETWEEN_LAYERS.^default * 0.75f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE, LayeredOptions.SPACING_EDGE_NODE.^default * 0.75f)
			node.setLayoutOption(LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS,
				LayeredOptions.SPACING_EDGE_NODE_BETWEEN_LAYERS.^default * 0.75f)
		}
	}

	private def String createNamedElementLabel(NamedElement ne) {
		val b = new StringBuilder
		b.append(ne === null
			? "<NULL>"
			: ne.name ?: "<Unresolved Element>")
		return b.toString()
	}

	private def String representationLabel(FunctionRepresentation rep) {
		if (rep === null) {
			return "<null representation>"
		}
	
		switch rep {
			NaturalLanguageFunction: {
				"NL: " + shorten(rep.stringFeature("definition"), 56)
			}
	
			AnalyticExpressionFunction: {
				"AE: " + shorten(rep.stringFeature("expression"), 56)
			}
	
			ParticipantImpactFunction: {
				val count = rep.contributionCount
				"Impact weights: " + count
			}
	
			MonotonicityTable: {
				val count = rep.rowCount
				"Monotonicity rows: " + count
			}
	
			default: {
				rep.eClass.name
			}
		}
	}

	private def int contributionCount(ParticipantImpactFunction f) {
		val feature = f.eClass.getEStructuralFeature("participantContribution")
	
		if (feature === null || !f.eIsSet(feature)) {
			return 0
		}
	
		val value = f.eGet(feature)
	
		if (value instanceof java.util.Collection<?>) {
			return (value as java.util.Collection<?>).size
		}
	
		if (value !== null) {
			return 1
		}
	
		return 0
	}
	
	private def int rowCount(MonotonicityTable table) {
		val feature = table.eClass.getEStructuralFeature("tableRows")
	
		if (feature === null || !table.eIsSet(feature)) {
			return 0
		}
	
		val value = table.eGet(feature)
	
		if (value instanceof java.util.Collection<?>) {
			return (value as java.util.Collection<?>).size
		}
	
		if (value !== null) {
			return 1
		}
	
		return 0
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
				// addFixedTailArrowDecorator() // Fix for bug: https://github.com/kieler/KLighD/issues/38
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
				// addFixedTailArrowDecorator() // Fix for bug: https://github.com/kieler/KLighD/issues/38
				addHeadArrowDecorator()
			]
		]
	}

	private def createInvisibleEdge() {
		return createEdge => [
			addPolyline() => [
				lineWidth = 0
				foreground = Colors.WHITE
				boldLineSelectionStyle()
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
	
//	private def String createSatisfactionCriterionLabel(SatisfactionCriterion criterion) {
//		val b = new StringBuilder
//	
//		b.append(criterion.safeName)
//	
//		val reqRef = criterion.requirementRefObject
//		val reqLabel = reqRef.labelOfEObject
//	
//		if (reqLabel !== null && !reqLabel.empty) {
//			b.append("\nreq: ").append(shorten(reqLabel, 48))
//		}
//	
//		val margin = criterion.stringFeature("marginDefinition")
//	
//		if (margin !== null && !margin.trim.empty) {
//			b.append("\nM: ").append(shorten(margin, 48))
//		}
//	
//		val lang = criterion.stringFeature("language")
//	
//		if (lang !== null && !lang.trim.empty) {
//			b.append("\n").append(lang)
//		}
//	
//		return b.toString
//	}
	private def EObject requirementRefObject(SatisfactionCriterion criterion) {
		if (criterion === null) {
			return null
		}
	
		var feature = criterion.eClass.getEStructuralFeature("requirementRef")
	
		// Compatibility with older grammar if it was called "requirement"
		if (feature === null) {
			feature = criterion.eClass.getEStructuralFeature("requirement")
		}
	
		if (feature === null || !criterion.eIsSet(feature)) {
			return null
		}
	
		val value = criterion.eGet(feature)
	
		if (value instanceof EObject) {
			return value as EObject
		}
	
		return null
	}

	private def String stringFeature(EObject obj, String featureName) {
		if (obj === null || featureName === null) {
			return null
		}
	
		val feature = obj.eClass.getEStructuralFeature(featureName)
	
		if (feature === null || !obj.eIsSet(feature)) {
			return null
		}
	
		val value = obj.eGet(feature)
	
		if (value !== null) {
			return String.valueOf(value)
		}
	
		return null
	}

	private def String safeName(EObject obj) {
		if (obj === null) {
			return "<null>"
		}
	
		val nameFeature = obj.eClass.getEStructuralFeature("name")
	
		if (nameFeature !== null && obj.eIsSet(nameFeature)) {
			val value = obj.eGet(nameFeature)
	
			if (value !== null) {
				return String.valueOf(value)
			}
		}
	
		return obj.eClass.name
	}
	
	private def String labelOfEObject(EObject obj) {
		if (obj === null) {
			return ""
		}
	
		val nameFeature = obj.eClass.getEStructuralFeature("name")
	
		if (nameFeature !== null && obj.eIsSet(nameFeature)) {
			val value = obj.eGet(nameFeature)
	
			if (value !== null) {
				return String.valueOf(value)
			}
		}
	
		val uri = EcoreUtil.getURI(obj)
	
		if (uri !== null) {
			return uri.toString
		}
	
		return obj.eClass.name
	}

	private def String shorten(String s, int max) {
		if (s === null) {
			return ""
		}
	
		if (s.length <= max) {
			return s
		}
		return s.substring(0, max - 3) + "..."
	}



	private def String getRequirementLabel(SatisfactionCriterion criterion) {
	    val reqRef = criterion.requirementRef
	    if (reqRef === null) {
	        return "<Unresolved Requirement>"
	    }
	
	    // If it has a "name" feature, use it
	    val nameFeature = reqRef.eClass.EAllStructuralFeatures.findFirst[it.name == "name"]
	    if (nameFeature !== null) {
	        val value = reqRef.eGet(nameFeature)
	        if (value !== null) {
	            return value.toString
	        }
	    }
	
	    return reqRef.eClass.name
	}
	
	private def String getRequirementNodeId(SatisfactionCriterion criterion) {
	    val reqRef = criterion.requirementRef
	    if (reqRef === null) {
	        return "unresolvedRequirement"
	    }
	
	    val nameFeature = reqRef.eClass.EAllStructuralFeatures.findFirst[it.name == "name"]
	    if (nameFeature !== null) {
	        val value = reqRef.eGet(nameFeature)
	        if (value !== null) {
	            return value.toString
	        }
	    }
	
	    return reqRef.eClass.name + "_" + Integer.toHexString(System.identityHashCode(reqRef))
	}
	
	private def createRequirementTraceEdge(Object associate) {
		return createEdge => [
			if (associate !== null) {
				associateWith(associate)
			}
	
			addPolyline() => [
				lineWidth = 1.2f
				lineStyle = LineStyle.DASH
				foreground = Colors.PURPLE_3
				boldLineSelectionStyle()
			]
		]
	}
	// new satisfaction criterion:
	private def String requirementKey(EObject reqRef) {
		if (reqRef === null) {
			return "<unresolved-requirement>"
		}
	
		val uri = org.eclipse.emf.ecore.util.EcoreUtil.getURI(reqRef)
	
		if (uri !== null) {
			return uri.toString
		}
	
		return reqRef.labelOfEObject
	}
	
	private def Iterable<SystemResponseProperty> terminalSrpsForRequirement(
	InfluenceModel model,
	Iterable<SystemResponseProperty> candidateSrps
	) {
		val candidates = new java.util.LinkedHashSet<SystemResponseProperty>()
	
		for (srp : candidateSrps) {
			if (srp !== null) {
				candidates.add(srp)
			}
		}
	
		val terminal = new java.util.LinkedHashSet<SystemResponseProperty>()
	
		for (srp : candidates) {
			if (!model.reachesAnotherCandidateSrp(srp, candidates)) {
				terminal.add(srp)
			}
		}
	
		// Safety fallback. If everything was filtered by a cycle, show something.
		if (terminal.empty) {
			return candidates
		}
	
		return terminal
	}
	private def boolean reachesAnotherCandidateSrp(
	InfluenceModel model,
	SystemResponseProperty start,
	java.util.LinkedHashSet<SystemResponseProperty> candidates
	) {
		if (model === null || start === null || candidates === null) {
			return false
		}
	
		val visited = new java.util.HashSet<SystemResponseProperty>()
		val queue = new java.util.ArrayDeque<SystemResponseProperty>()
	
		visited.add(start)
		queue.add(start)
	
		while (!queue.empty) {
			val current = queue.removeFirst
	
			for (absInf : model.ownedInfluences) {
				if (absInf instanceof Influence) {
					val inf = absInf as Influence
	
					if (inf.usesSrpInput(current)) {
						val output = inf.outputSRP
	
						if (output !== null) {
							if (output !== start && candidates.contains(output)) {
								return true
							}
	
							if (!visited.contains(output)) {
								visited.add(output)
								queue.add(output)
							}
						}
					}
				}
			}
		}
	
		return false
	}
	
	
	private def boolean usesSrpInput(Influence inf, SystemResponseProperty srp) {
		if (inf === null || srp === null) {
			return false
		}
	
		var found = false
	
		for (p : inf.ownedParticipants) {
			if (p instanceof SRPInputParticipant) {
				val sp = p as SRPInputParticipant
	
				if (sp.target === srp) {
					found = true
				}
			}
		}
	
		return found
	}
	
	private def SatisfactionCriterion findCriterionForRequirementAndSrp(
	InfluenceModel model,
	String reqKey,
	SystemResponseProperty srp
	) {
		if (model === null || reqKey === null || srp === null) {
			return null
		}
	
		var SatisfactionCriterion found = null
	
		for (criterion : model.allSatisfactionCriteria) {
			val reqRef = criterion.requirementRef
	
			if (reqRef !== null && requirementKey(reqRef) == reqKey) {
				for (candidateSrp : criterion.constrainedSrps) {
					if (candidateSrp === srp && found === null) {
						found = criterion
					}
				}
			}
		}
	
		return found
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
