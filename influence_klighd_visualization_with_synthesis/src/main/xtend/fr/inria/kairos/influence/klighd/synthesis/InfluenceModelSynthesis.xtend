package fr.inria.kairos.influence.klighd.synthesis

import org.eclipse.xtext.xbase.lib.Extension
import org.eclipse.sirius.diagram.Diagram
import org.eclipse.sirius.diagram.DiagramElement
import org.eclipse.sirius.diagram.Edge
import org.eclipse.sirius.diagram.Label
import org.eclipse.sirius.diagram.layout.elk.ElkLayoutOptions
import org.eclipse.sirius.diagram.layout.elk.ElkLayoutProperties
import org.eclipse.sirius.diagram.AbstractDiagramSynthesizer
import fr.inria.kairos.influence.influences.InfluenceModel
import fr.inria.kairos.influence.influences.DesignArtifact
import fr.inria.kairos.influence.influences.PhysicalPhenomena
import fr.inria.kairos.influence.influences.Requirement
import fr.inria.kairos.influence.influences.SystemResponse
import fr.inria.kairos.influence.influences.Influence
import fr.inria.kairos.influence.influences.CompositeInfluence
import fr.inria.kairos.influence.influences.AbstractInfluence
import java.util.HashMap
import java.util.HashSet
import org.eclipse.emf.ecore.EObject

class InfluenceModelSynthesis extends AbstractDiagramSynthesizer {

    // Map to store created DiagramElements by their modelElement for easy lookup
    val HashMap<EObject, DiagramElement> elementMap = new HashMap<EObject, DiagramElement>()

    override createDiagram(Object modelElement) : Diagram {
        if (!(modelElement instanceof InfluenceModel)) {
            return null;
        }
        val model = modelElement as InfluenceModel

        // Clear the map for each new diagram creation
        elementMap.clear()

        // Create the root diagram
        val diagram = createDiagram("Influence Diagram: " + model.name) => [
            modelElement = model
            // Set ELK layout options for the entire diagram
            layoutOptions += new ElkLayoutOptions => [
                properties += new ElkLayoutProperties("org.eclipse.elk.algorithm", "org.eclipse.elk.layered")
                properties += new ElkLayoutProperties("org.eclipse.elk.direction", "DOWN")
                properties += new ElkLayoutProperties("org.eclipse.elk.edgeRouting", "ORTHOGONAL")
                properties += new ElkLayoutProperties("org.eclipse.elk.layered.nodePlacement.strategy", "BRANDES_KOEPF")
                properties += new ElkLayoutProperties("org.eclipse.elk.spacing.nodeNode", "50.0")
                properties += new ElkLayoutProperties("org.eclipse.elk.spacing.nodeNodeBetweenLayers", "70.0")
            ]
        ]
        elementMap.put(model, diagram) // Put the root diagram itself in the map

        // --- Phase 1: Create all nodes and add them to appropriate containers/diagram ---

        // Create containers for different types of elements and add them to the diagram
        // These containers are visual groupings and are not directly mapped to a single EObject,
        // but rather to the feature list that contains the elements.
        val artifactsContainer = createDiagramElement("Design Artifacts") => [
            // No direct modelElement, as it represents a collection
            properties.put("collapsible", "true")
            properties.put("collapsed", "true")
        ]
        diagram.elements += artifactsContainer

        val requirementsContainer = createDiagramElement("Requirements") => [
            properties.put("collapsible", "true")
            properties.put("collapsed", "true")
        ]
        diagram.elements += requirementsContainer

        val phenomenaContainer = createDiagramElement("Physical Phenomena") => [
            properties.put("collapsible", "true")
            properties.put("collapsed", "true")
        ]
        diagram.elements += phenomenaContainer

        val influencesContainer = createDiagramElement("Influences") => [
            properties.put("collapsible", "true")
            properties.put("collapsed", "true")
        ]
        diagram.elements += influencesContainer

        // Map DesignArtifacts
        for (artifact : model.ownedArtifacts) {
            val node = createDiagramElement("Artifact: " + artifact.name) => [
                modelElement = artifact
                properties.put("shape", "rectangle")
                properties.put("background-color", "blue")
                properties.put("foreground-color", "white")
            ]
            artifactsContainer.children += node
            elementMap.put(artifact, node)
        }

        // Map PhysicalPhenomena
        for (phenomenon : model.ownedPhysicalPhenomena) {
            val node = createDiagramElement("Phenomenon: " + phenomenon.name) => [
                modelElement = phenomenon
                properties.put("shape", "circle")
                properties.put("background-color", "green")
                properties.put("foreground-color", "white")
            ]
            phenomenaContainer.children += node
            elementMap.put(phenomenon, node)
        }

        // Map Requirements
        for (req : model.ownedRequirements) {
            val node = createDiagramElement("Requirement: " + req.name) => [
                modelElement = req
                properties.put("shape", "hexagon")
                properties.put("background-color", "purple")
                properties.put("foreground-color", "white")
            ]
            requirementsContainer.children += node
            elementMap.put(req, node)
        }

        // Collect all unique SystemResponses from the model and its influences
        val allSystemResponses = new HashSet<SystemResponse>()
        for (influence : model.ownedInfluences) {
            if (influence instanceof Influence) {
                allSystemResponses.addAll((influence as Influence).affects)
                allSystemResponses.addAll((influence as Influence).originatorSystemResponse)
            } else if (influence instanceof CompositeInfluence) {
                allSystemResponses.addAll((influence as CompositeInfluence).affects)
            }
        }
        // Also collect SystemResponses referenced by Requirements (if they exist in the model)
        // The Xtext grammar shows SystemResponse has 'usedIn' referring to Requirement,
        // but SystemResponse itself is not 'owned' by InfluenceModel.
        // We assume SystemResponses are created implicitly when referenced or exist as part of some other collection.
        // For this synthesis, we create nodes for all found SystemResponses.

        for (sysResponse : allSystemResponses) {
            if (!elementMap.containsKey(sysResponse)) { // Only create if not already created
                val node = createDiagramElement("System Response: " + sysResponse.name) => [
                    modelElement = sysResponse
                    properties.put("shape", "diamond")
                    properties.put("background-color", "gray")
                    properties.put("foreground-color", "white")
                ]
                // SystemResponses are placed directly in the main diagram elements for now.
                // A dedicated container could be added if desired.
                diagram.elements += node
                elementMap.put(sysResponse, node)
            }
        }


        // Map Influences and CompositeInfluences
        for (influence : model.ownedInfluences) {
            if (influence instanceof Influence) {
                val inf = influence as Influence
                val node = createDiagramElement("Influence: " + inf.name) => [
                    modelElement = inf
                    properties.put("shape", "roundedRectangle")
                    properties.put("background-color", "lightcoral")
                    properties.put("foreground-color", "black")
                ]
                influencesContainer.children += node
                elementMap.put(inf, node)

            } else if (influence instanceof CompositeInfluence) {
                val compInf = influence as CompositeInfluence
                val node = createDiagramElement("Composite Influence: " + compInf.name) => [
                    modelElement = compInf
                    properties.put("shape", "rectangle")
                    properties.put("background-color", "lightblue")
                    properties.put("foreground-color", "black")
                    properties.put("border-width", "2")
                    properties.put("border-color", "darkblue")
                ]
                influencesContainer.children += node
                elementMap.put(compInf, node)

                // Internal Influences container (collapsible)
                val internalInfluencesContainer = createDiagramElement("Internal Influences") => [
                    // This container is purely for visual grouping within the CompositeInfluence node
                    properties.put("collapsible", "true")
                    properties.put("collapsed", "true")
                ]
                node.children += internalInfluencesContainer
            }
        }

        // --- Phase 2: Create all edges now that all nodes are created and mapped ---

        // Edges for SystemResponse 'usedIn'
        for (sysResponse : allSystemResponses) {
            val sourceNode = elementMap.get(sysResponse)
            if (sourceNode !== null) {
                for (usedReq : sysResponse.usedIn) {
                    val targetNode = elementMap.get(usedReq)
                    if (targetNode !== null) {
                        val edge = createEdge("used in") => [
                            source = sourceNode
                            target = targetNode
                            properties.put("target-arrow", "true")
                            properties.put("color", "darkpurple")
                        ]
                        diagram.edges += edge
                    }
                }
            }
        }

        // Edges for Influences and CompositeInfluences
        for (influence : model.ownedInfluences) {
            val sourceNode = elementMap.get(influence)
            if (sourceNode !== null) { // Ensure the source node was created
                if (influence instanceof Influence) {
                    val inf = influence as Influence

                    // 'affects' edges
                    for (affectedSysResponse : inf.affects) {
                        val targetNode = elementMap.get(affectedSysResponse)
                        if (targetNode !== null) {
                            val edge = createEdge("affects") => [
                                source = sourceNode
                                target = targetNode
                                properties.put("target-arrow", "true")
                                properties.put("color", "darkred")
                            ]
                            diagram.edges += edge
                        }
                    }

                    // Originator edges (distinct colors)
                    // The Xtext grammar indicates originators are references *from* the Influence.
                    // For visualization, it's common to draw edges *from* the originator *to* the influence.
                    // So, source is originator, target is influence.
                    for (originator : inf.originatorArtifact) {
                        val originatorNode = elementMap.get(originator)
                        if (originatorNode !== null) {
                            val edge = createEdge("artifact originator") => [
                                source = originatorNode
                                target = sourceNode
                                properties.put("color", "blue")
                            ]
                            diagram.edges += edge
                        }
                    }
                    for (originator : inf.originatorPhenomena) {
                        val originatorNode = elementMap.get(originator)
                        if (originatorNode !== null) {
                            val edge = createEdge("phenomena originator") => [
                                source = originatorNode
                                target = sourceNode
                                properties.put("color", "green")
                            ]
                            diagram.edges += edge
                        }
                    }
                    for (originator : inf.originatorSystemResponse) {
                        val originatorNode = elementMap.get(originator)
                        if (originatorNode !== null) {
                            val edge = createEdge("system response originator") => [
                                source = originatorNode
                                target = sourceNode
                                properties.put("color", "orange")
                            ]
                            diagram.edges += edge
                        }
                    }

                } else if (influence instanceof CompositeInfluence) {
                    val compInf = influence as CompositeInfluence

                    // Edges for internal influences (from CompositeInfluence to its internal AbstractInfluence)
                    // These edges should point from the composite node to its internal influences' nodes
                    for (internalInf : compInf.internalInfluences) {
                        val targetNode = elementMap.get(internalInf)
                        if (targetNode !== null) {
                            val edge = createEdge("encapsulates") => [
                                source = sourceNode
                                target = targetNode
                                properties.put("line-style", "dashed")
                                properties.put("color", "gray")
                            ]
                            diagram.edges += edge
                        }
                    }

                    // 'affects' edges
                    for (affectedSysResponse : compInf.affects) {
                        val targetNode = elementMap.get(affectedSysResponse)
                        if (targetNode !== null) {
                            val edge = createEdge("affects") => [
                                source = sourceNode
                                target = targetNode
                                properties.put("target-arrow", "true")
                                properties.put("color", "darkred")
                            ]
                            diagram.edges += edge
                        }
                    }
                }
            }
        }

        return diagram
    }
}
