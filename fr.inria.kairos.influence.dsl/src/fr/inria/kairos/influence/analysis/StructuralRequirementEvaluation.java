package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.metamodel.Influence;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;

/*
 * Structural requirement evaluation.
 *
 * This analysis is purely graph-based.
 *
 * It does not depend on a local Requirement EClass anymore.
 * Requirements are represented as graph nodes:
 *
 *   R:<requirementLabel>
 *
 * created by GraphBuilder from:
 *
 *   SatisfactionCriterion.requirementRef
 *   SatisfactionCriterion.constrainedSRPs
 *
 * Structural logic:
 *
 *   Requirement R
 *      <- constrained SRPs
 *      <- producing influences
 *      <- upstream participants
 *
 * Then participants are ranked by:
 *
 *   Artifact          -> changeability
 *   EnvironmentalFactor -> flexibility
 */

public final class StructuralRequirementEvaluation {

	public void appendPerRequirement(Resource resource, GraphBuilder.Result graph, StringBuilder out) {
		out.append("== Structural evaluation per requirement ==\n");

		if (graph == null || graph.reqToSRs == null || graph.reqToSRs.isEmpty()) {
			out.append("  (no requirement traceability available)\n\n");
			return;
		}

		List<String> requirementNames = new ArrayList<>(graph.reqToSRs.keySet());
		Collections.sort(requirementNames);

		RequirementTraceability traceability = new RequirementTraceability(graph);

		for (String requirementName : requirementNames) {
			Map<String, Integer> minHopByNode = new HashMap<>();

			LinkedHashSet<String> srps = graph.reqToSRs.getOrDefault(
				requirementName,
				new LinkedHashSet<>()
			);

			for (String srpName : srps) {
				String srpId = normalizeSrpId(srpName);

				mergeMin(
					minHopByNode,
					traceability.upstreamArtifacts(srpId, graph.inEdges)
				);

				mergeMin(
					minHopByNode,
					traceability.upstreamEnvironmentalFactors(srpId, graph.inEdges)
				);
			}

			List<Cand> ranked = rank(minHopByNode, graph.nodeToOrigin, resource);

			out.append("  ")
				.append(displayRequirement(requirementName))
				.append(": ");

			if (ranked.isEmpty()) {
				out.append("(none)\n");
			} else {
				List<String> parts = new ArrayList<>();

				for (Cand candidate : ranked) {
					String name = stripKnownPrefix(candidate.id);
					String label = candidate.id.startsWith("A:")
						? "changeability"
						: "flexibility";

					String valueText = candidate.value >= 0
						? fmt(candidate.value)
						: "N/A";

					parts.add(
						name
						+ " ("
						+ label
						+ "="
						+ valueText
						+ ", "
						+ candidate.hops
						+ " hops)"
					);
				}

				out.append(String.join(", ", parts)).append("\n");
			}
		}

		out.append("\n");
	}

	/*
	 * For a single influence, print structural advice for each requirement
	 * linked to the influence output SRP.
	 *
	 *   graph.reqToSRs
	 *   or SR -> R edges created from SatisfactionCriterion
	 */
	public void appendForInfluence(
		Resource resource,
		GraphBuilder.Result graph,
		Influence influence,
		StringBuilder out
	) {
		if (influence == null) {
			out.append("  (no influence)\n\n");
			return;
		}

		if (graph == null) {
			out.append("  (no graph available)\n\n");
			return;
		}

		var outputSrp = influence.getOutputSRP();

		if (outputSrp == null || outputSrp.getName() == null) {
			out.append("  (no output SRP)\n\n");
			return;
		}

		String srpName = outputSrp.getName();
		String srpId = normalizeSrpId(srpName);

		List<String> requirementNames = requirementsForSrp(graph, srpName);

		if (requirementNames.isEmpty()) {
			out.append("  (no linked requirement for SRP ")
				.append(srpName)
				.append(")\n\n");
			return;
		}

		out.append("== Structural evaluation for ")
			.append(influence.getName())
			.append(" -> ")
			.append(srpName)
			.append(" ==\n");

		RequirementTraceability traceability = new RequirementTraceability(graph);

		Map<String, Integer> minHopByNode = new HashMap<>();

		mergeMin(
			minHopByNode,
			traceability.upstreamArtifacts(srpId, graph.inEdges)
		);

		mergeMin(
			minHopByNode,
			traceability.upstreamEnvironmentalFactors(srpId, graph.inEdges)
		);

		List<Cand> ranked = rank(minHopByNode, graph.nodeToOrigin, resource);

		for (String requirementName : requirementNames) {
			out.append("  ")
				.append(displayRequirement(requirementName))
				.append(": ");

			if (ranked.isEmpty()) {
				out.append("(none)\n");
			} else {
				List<String> parts = new ArrayList<>();

				for (Cand candidate : ranked) {
					String name = stripKnownPrefix(candidate.id);
					String label = candidate.id.startsWith("A:")
						? "changeability"
						: "flexibility";

					String valueText = candidate.value >= 0
						? fmt(candidate.value)
						: "N/A";

					parts.add(
						name
						+ " ("
						+ label
						+ "="
						+ valueText
						+ ", "
						+ candidate.hops
						+ " hops)"
					);
				}

				out.append(String.join(", ", parts)).append("\n");
			}
		}

		out.append("\n");
	}

	// ---------------------------------------------------------------------
	// Requirement lookup
	// ---------------------------------------------------------------------

	private static List<String> requirementsForSrp(GraphBuilder.Result graph, String srpSimpleName) {
		TreeSet<String> requirements = new TreeSet<>();

		if (graph == null || srpSimpleName == null) {
			return new ArrayList<>(requirements);
		}

		String srpId = normalizeSrpId(srpSimpleName);
		String srpNameWithoutPrefix = stripKnownPrefix(srpId);

		/*
		 * Primary source:
		 *
		 *   graph.reqToSRs:
		 *     requirementLabel -> srpSimpleName[*]
		 */
		if (graph.reqToSRs != null) {
			for (Map.Entry<String, LinkedHashSet<String>> entry : graph.reqToSRs.entrySet()) {
				String requirementName = entry.getKey();
				LinkedHashSet<String> srps = entry.getValue();

				if (srps != null) {
					for (String candidateSrp : srps) {
						String normalizedCandidate = stripKnownPrefix(normalizeSrpId(candidateSrp));

						if (srpNameWithoutPrefix.equals(normalizedCandidate)) {
							requirements.add(requirementName);
						}
					}
				}
			}
		}

		/*
		 * Secondary source:
		 *
		 *   graph.outEdges:
		 *     SR:<srp> -> R:<requirement>
		 *
		 * This makes the method robust even if reqToSRs changes later.
		 */
		if (graph.outEdges != null) {
			LinkedHashSet<String> outgoing = graph.outEdges.get(srpId);

			if (outgoing != null) {
				for (String nodeId : outgoing) {
					if (nodeId != null && nodeId.startsWith("R:")) {
						requirements.add(stripKnownPrefix(nodeId));
					}
				}
			}
		}

		return new ArrayList<>(requirements);
	}

	// ---------------------------------------------------------------------
	// Ranking
	// ---------------------------------------------------------------------

	private static void mergeMin(Map<String, Integer> accumulator, Map<String, Integer> values) {
		if (values == null) {
			return;
		}

		for (Map.Entry<String, Integer> entry : values.entrySet()) {
			accumulator.merge(entry.getKey(), entry.getValue(), Math::min);
		}
	}

	private List<Cand> rank(
		Map<String, Integer> minHops,
		Map<String, String> nodeToOriginUri,
		Resource resource
	) {
		List<Cand> candidates = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : minHops.entrySet()) {
			String nodeId = entry.getKey();
			int hops = entry.getValue();

			double value = -1.0;

			if (nodeToOriginUri != null && resource != null) {
				String uriString = nodeToOriginUri.get(nodeId);

				if (uriString != null) {
					EObject object = resolve(resource, uriString);

					if (object != null) {
						if (nodeId.startsWith("A:")) {
							value = read01(object, "changeability");
						} else if (nodeId.startsWith("E:")) {
							value = read01(object, "flexibility");
						}
					}
				}
			}

			candidates.add(new Cand(nodeId, hops, value));
		}

		candidates.sort((left, right) -> {
			/*
			 * 1. Higher changeability/flexibility first.
			 * Unknown value = -1, so it naturally goes last.
			 */
			int cmp = Double.compare(right.value, left.value);

			if (cmp != 0) {
				return cmp;
			}

			/*
			 * 2. Shorter path first.
			 * A closer participant usually means fewer chained changes.
			 */
			cmp = Integer.compare(left.hops, right.hops);

			if (cmp != 0) {
				return cmp;
			}

			return left.id.compareTo(right.id);
		});

		return candidates;
	}

	private static EObject resolve(Resource resource, String uriString) {
		try {
			if (resource == null || resource.getResourceSet() == null) {
				return null;
			}

			return resource.getResourceSet().getEObject(URI.createURI(uriString), true);
		} catch (Exception ignored) {
			return null;
		}
	}

	private static double read01(EObject object, String featureName) {
		if (object == null || featureName == null) {
			return -1;
		}

		EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);

		if (feature == null) {
			return -1;
		}

		Object value = object.eGet(feature);

		if (value instanceof Number number) {
			return clamp01(number.doubleValue());
		}

		if (value instanceof String text) {
			try {
				return clamp01(Double.parseDouble(text.trim()));
			} catch (Exception ignored) {
				return -1;
			}
		}

		return -1;
	}

	// ---------------------------------------------------------------------
	// ID helpers
	// ---------------------------------------------------------------------

	private static String normalizeSrpId(String value) {
		if (value == null) {
			return null;
		}

		if (value.startsWith("SR:")) {
			return value;
		}

		return "SR:" + value;
	}

	private static String stripKnownPrefix(String id) {
		if (id == null) {
			return "";
		}

		if (id.startsWith("SR:")) {
			return id.substring(3);
		}

		if (
			id.startsWith("A:")
			|| id.startsWith("E:")
			|| id.startsWith("I:")
			|| id.startsWith("R:")
		) {
			return id.substring(2);
		}

		return id;
	}

	private static String displayRequirement(String requirementNameOrId) {
		return stripKnownPrefix(requirementNameOrId);
	}

	private static double clamp01(double value) {
		if (value < 0) {
			return 0;
		}

		if (value > 1) {
			return 1;
		}

		return value;
	}

	private static String fmt(double value) {
		return String.format(Locale.US, "%.2f", value);
	}

	private static final class Cand {
		final String id;
		final int hops;
		final double value;

		Cand(String id, int hops, double value) {
			this.id = id;
			this.hops = hops;
			this.value = value;
		}
	}
}
