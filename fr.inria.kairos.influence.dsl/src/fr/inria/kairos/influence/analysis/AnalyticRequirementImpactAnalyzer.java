package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.metamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.*;

/*
 * Numeric and qualitative interpretation of analytic influence functions.
 * *
 * Influence
 *   -> ownedInfluenceFunction
 *      -> representations : FunctionRepresentation[*]
 *         -> AnalyticExpressionFunction
 *
 * SatisfactionCriterion
 *   -> requirementRef : EObject
 *   -> constrainedSRPs : SystemResponseProperty[*]
 *   -> marginDefinition : String
 *
 * Convention:
 *
 *   margin >= 0  => requirement satisfied
 *   margin < 0   => requirement violated
 *
 * This evaluator only evaluates AnalyticExpressionFunction.
 * NaturalLanguageFunction, ParticipantImpactFunction and MonotonicityTable are not
 * numerically evaluated here.
 */
public final class AnalyticRequirementImpactAnalyzer {

	private static final double DEFAULT_TOL = 1e-12;

	private AnalyticRequirementImpactAnalyzer() {
		// Utility class.
	}

	// ---------------------------------------------------------------------
	// Result types
	// ---------------------------------------------------------------------

	public static final class CriterionAnalysisResult {
		public final double srpValue;
		public final double margin;
		public final Map<String, Double> grad;
		public final Map<String, String> label;
		public final String trace;

		public final SatisfactionCriterion criterion;
		public final String requirementLabel;

		public CriterionAnalysisResult(
			double srpValue,
			double margin,
			Map<String, Double> grad,
			Map<String, String> label,
			String trace,
			SatisfactionCriterion criterion,
			String requirementLabel
		) {
			this.srpValue = srpValue;
			this.margin = margin;
			this.grad = Collections.unmodifiableMap(new LinkedHashMap<>(grad));
			this.label = Collections.unmodifiableMap(new LinkedHashMap<>(label));
			this.trace = trace;
			this.criterion = criterion;
			this.requirementLabel = requirementLabel;
		}
	}

	public static final class MultiCriterionAnalysisResult {
		public final Influence influence;
		public final Map<SatisfactionCriterion, CriterionAnalysisResult> resultsByCriterion;
		public final List<RequirementTradeoff> tradeoffs;
		public final String trace;

		public MultiCriterionAnalysisResult(
			Influence influence,
			Map<SatisfactionCriterion, CriterionAnalysisResult> resultsByCriterion,
			List<RequirementTradeoff> tradeoffs,
			String trace
		) {
			this.influence = influence;
			this.resultsByCriterion = Collections.unmodifiableMap(new LinkedHashMap<>(resultsByCriterion));
			this.tradeoffs = Collections.unmodifiableList(new ArrayList<>(tradeoffs));
			this.trace = trace;
		}
	}

	public static final class RequirementTradeoff {
		public final String variable;
		public final List<String> benefits;
		public final List<String> prejudices;
		public final List<String> neutral;

		public RequirementTradeoff(
			String variable,
			List<String> benefits,
			List<String> prejudices,
			List<String> neutral
		) {
			this.variable = variable;
			this.benefits = Collections.unmodifiableList(new ArrayList<>(benefits));
			this.prejudices = Collections.unmodifiableList(new ArrayList<>(prejudices));
			this.neutral = Collections.unmodifiableList(new ArrayList<>(neutral));
		}

		public boolean isConflict() {
			return !benefits.isEmpty() && !prejudices.isEmpty();
		}
	}

	// ---------------------------------------------------------------------
	// Public API
	// ---------------------------------------------------------------------

	/*
	 * Backward-compatible entry point.
	 *
	 * Evaluates the first SatisfactionCriterion constraining the terminal output SRP.
	 */
	public static CriterionAnalysisResult evaluateChainWithRequirement(
		InfluenceModel model,
		Influence terminal,
		Map<String, Double> scenario
	) {
		List<SatisfactionCriterion> criteria = criteriaForOutputSrp(model, terminal);

		if (criteria.isEmpty()) {
			StringBuilder trace = new StringBuilder();
			trace.append("Influence chain evaluation \n");
			trace.append("Terminal influence: ").append(safeName(terminal)).append("\n");
			trace.append("No SatisfactionCriterion linked to output SRP.\n");

			double srpValue = Double.NaN;

			try {
				Index idx = new Index(model);
				Map<String, Double> completedScenario = completeScenario(idx, terminal, scenario);
				srpValue = evalSRP(idx, terminal, completedScenario, new HashMap<>(), trace);
			} catch (Exception ex) {
				trace.append("SRP evaluation also failed: ").append(ex.getMessage()).append("\n");
			}

			return new CriterionAnalysisResult(
				srpValue,
				Double.NaN,
				Collections.emptyMap(),
				Collections.emptyMap(),
				trace.toString(),
				null,
				"<no-requirement>"
			);
		}

		return evaluateChainWithCriterion(model, terminal, criteria.get(0), scenario);
	}

	/*
	 * Detecting trade-offs:
	 * Evaluate all SatisfactionCriterion objects constraining the output SRP of this influence.
	 *   same participant improves requirement R1 but worsens requirement R2.
	 */
	public static MultiCriterionAnalysisResult evaluateInfluenceForAllRequirements(
		InfluenceModel model,
		Influence terminal,
		Map<String, Double> scenario
	) {
		StringBuilder trace = new StringBuilder();
		Map<SatisfactionCriterion, CriterionAnalysisResult> results = new LinkedHashMap<>();

		trace.append("Multi-requirement influence evaluation\n");
		trace.append("Influence: ").append(safeName(terminal)).append("\n");

		if (terminal == null || terminal.getOutputSRP() == null) {
			trace.append("No output SRP. Cannot evaluate requirements.\n");
			return new MultiCriterionAnalysisResult(terminal, results, Collections.emptyList(), trace.toString());
		}

		trace.append("Output SRP: ").append(terminal.getOutputSRP().getName()).append("\n\n");

		List<SatisfactionCriterion> criteria = criteriaForOutputSrp(model, terminal);

		if (criteria.isEmpty()) {
			trace.append("No SatisfactionCriterion constrains output SRP ")
				.append(terminal.getOutputSRP().getName())
				.append(".\n");

			return new MultiCriterionAnalysisResult(terminal, results, Collections.emptyList(), trace.toString());
		}

		for (SatisfactionCriterion criterion : criteria) {
			CriterionAnalysisResult result = evaluateChainWithCriterion(model, terminal, criterion, scenario);
			results.put(criterion, result);

			trace.append(result.trace).append("\n");
		}

		List<RequirementTradeoff> tradeoffs = detectTradeoffs(results);

		trace.append("Trade-off analysis\n");

		if (tradeoffs.isEmpty()) {
			trace.append("No trade-off detected among evaluated requirements.\n");
		} else {
			for (RequirementTradeoff t : tradeoffs) {
				if (t.isConflict()) {
					trace.append("Variable ")
						.append(t.variable)
						.append(" benefits ")
						.append(t.benefits)
						.append(" but prejudices ")
						.append(t.prejudices)
						.append(".\n");
				}
			}
		}

		return new MultiCriterionAnalysisResult(terminal, results, tradeoffs, trace.toString());
	}

	/*
	 * Evaluate a specific SatisfactionCriterion.
	 */
	public static CriterionAnalysisResult evaluateChainWithCriterion(
	    InfluenceModel model,
	    Influence terminal,
	    SatisfactionCriterion criterion,
	    Map<String, Double> scenario
	) {
	    Index idx = new Index(model);
	    StringBuilder trace = new StringBuilder();

	    String srpName = terminal.getOutputSRP().getName();
	    String requirementName = requirementLabel(criterion.getRequirementRef());

	    trace.append("Influence chain evaluation\n");
	    trace.append("Terminal influence: ").append(terminal.getName())
	        .append(" -> SRP: ").append(srpName).append("\n");

	    /*
	     * This check only concerns the terminal output SRP.
	     *
	     * It is perfectly valid that intermediate SRPs in the influence chain
	     * do not have SatisfactionCriterion links. They are propagated variables,
	     * not necessarily requirement-evaluation points.
	     */
	    if (!criterionConstrainsSrp(criterion, terminal.getOutputSRP())) {
	        trace.append(">> WARNING: Criterion ")
	            .append(criterion.getName())
	            .append(" is not directly associated with terminal output SRP ")
	            .append(srpName)
	            .append(". This may indicate that the wrong criterion was passed to this analysis.\n");
	    }

	    Map<String, Double> completedScenario = completeScenario(idx, terminal, scenario);

	    double yStar = evalSRP(idx, terminal, completedScenario, new HashMap<>(), trace);

	    trace.append("SRP ").append(srpName).append(" = ").append(fmt(yStar)).append("\n\n");

	    trace.append("Criterion: ").append(criterion.getName()).append("\n");
	    trace.append("Requirement: ").append(requirementName).append("\n");

	    String marginExpr = criterion.getCriterionDefinition();
	    LanguageType lang = criterion.getLanguage();

	    if (marginExpr == null || marginExpr.trim().isEmpty()) {
	        trace.append(">> Criterion has no marginDefinition.\n");

	        return new CriterionAnalysisResult(
	            yStar,
	            Double.NaN,
	            Collections.emptyMap(),
	            Collections.emptyMap(),
	            trace.toString(),
	            criterion,
	            requirementName
	        );
	    }

	    if (lang != LanguageType.JAVA_NUMERIC_EXPRESSION) {
	        String langName = lang != null ? lang.getName() : "null";

	        trace.append(">> Skipping numeric margin evaluation. Language is ")
	            .append(langName)
	            .append(", evaluator expects JavaNumericExpression.\n");

	        return new CriterionAnalysisResult(
	            yStar,
	            Double.NaN,
	            Collections.emptyMap(),
	            Collections.emptyMap(),
	            trace.toString(),
	            criterion,
	            requirementName
	        );
	    }

	    trace.append("Margin expression M(x): ").append(marginExpr).append("\n");
	    trace.append("Convention: M >= 0 means satisfied, M < 0 means violated.\n\n");

	    NumericExpressionEvaluator.Expr marginAst = NumericExpressionEvaluator.compile(marginExpr);
	    Set<String> marginVars = NumericExpressionEvaluator.variables(marginAst);

	    validateMarginVariablesAreResolvable(idx, marginVars, completedScenario, trace);

	    LinkedHashSet<String> baseVars = new LinkedHashSet<>();
	    collectBaseVarsReachable(idx, terminal, completedScenario, baseVars);

	    for (String v : marginVars) {
	        if (!idx.srp2inf.containsKey(v)) {
	            baseVars.add(v);
	        }
	    }

	    double margin = evalMarginGeneral(idx, completedScenario, marginAst, trace);

	    trace.append("Margin M = ").append(fmt(margin))
	        .append(margin >= 0 ? "  SATISFIED\n\n" : "  VIOLATED\n\n");
		
		
		Map<String, Double> grad = new LinkedHashMap<>();

		trace.append("Decomposed sensitivities dM/dx \n");

		List<String> sortedVars = new ArrayList<>(baseVars);
		Collections.sort(sortedVars);

		for (String variable : sortedVars) {
			Double current = completedScenario.get(variable);

			if (!isFinite(current)) {
				trace.append(variable).append(": skipped, no finite value in scenario.\n");
			} else {
				double h = step(current);

				Map<String, Double> sPlus = new LinkedHashMap<>(completedScenario);
				sPlus.put(variable, current + h);

				Map<String, Double> sMinus = new LinkedHashMap<>(completedScenario);
				sMinus.put(variable, current - h);

				double mp = evalMarginGeneral(idx, sPlus, marginAst, null);
				double mm = evalMarginGeneral(idx, sMinus, marginAst, null);

				double derivative = (mp - mm) / (2.0 * h);
				grad.put(variable, derivative);

				trace.append(variable)
					.append(": h=").append(fmt(h))
					.append(" M(+h)=").append(fmt(mp))
					.append(" M(-h)=").append(fmt(mm))
					.append(" dM/d").append(variable).append("≈").append(fmt(derivative))
					.append("\n");
			}
		}

		trace.append("\n");

		Map<String, String> labels = classifyGradients(grad);

		trace.append("== Qualitative classification if variable increases ==\n");

		for (Map.Entry<String, String> e : labels.entrySet()) {
			trace.append(e.getKey()).append(": ").append(e.getValue()).append("\n");
		}

		return new CriterionAnalysisResult(
			yStar,
			margin,
			grad,
			labels,
			trace.toString(),
			criterion,
			requirementName
		);
	}

	// ---------------------------------------------------------------------
	// Trade-off analysis
	// ---------------------------------------------------------------------

	private static List<RequirementTradeoff> detectTradeoffs(Map<SatisfactionCriterion, CriterionAnalysisResult> results) {
		Map<String, List<String>> benefits = new LinkedHashMap<>();
		Map<String, List<String>> prejudices = new LinkedHashMap<>();
		Map<String, List<String>> neutral = new LinkedHashMap<>();

		for (CriterionAnalysisResult result : results.values()) {
			String req = result.requirementLabel;

			for (Map.Entry<String, Double> e : result.grad.entrySet()) {
				String variable = e.getKey();
				double g = e.getValue();

				if (Math.abs(g) < DEFAULT_TOL) {
					addToList(neutral, variable, req);
				} else if (g > 0) {
					addToList(benefits, variable, req);
				} else {
					addToList(prejudices, variable, req);
				}
			}
		}

		TreeSet<String> variables = new TreeSet<>();
		variables.addAll(benefits.keySet());
		variables.addAll(prejudices.keySet());
		variables.addAll(neutral.keySet());

		List<RequirementTradeoff> tradeoffs = new ArrayList<>();

		for (String variable : variables) {
			List<String> b = benefits.getOrDefault(variable, Collections.emptyList());
			List<String> p = prejudices.getOrDefault(variable, Collections.emptyList());
			List<String> n = neutral.getOrDefault(variable, Collections.emptyList());

			if (!b.isEmpty() && !p.isEmpty()) {
				tradeoffs.add(new RequirementTradeoff(variable, b, p, n));
			}
		}

		return tradeoffs;
	}

	private static void addToList(Map<String, List<String>> map, String key, String value) {
		List<String> list = map.get(key);

		if (list == null) {
			list = new ArrayList<>();
			map.put(key, list);
		}

		list.add(value);
	}

	private static Map<String, String> classifyGradients(Map<String, Double> grad) {
		Map<String, String> label = new LinkedHashMap<>();

		for (Map.Entry<String, Double> e : grad.entrySet()) {
			double g = e.getValue();

			String l;

			if (Math.abs(g) < DEFAULT_TOL) {
				l = "neutral";
			} else if (g > 0) {
				l = "benefits (increase helps satisfaction)";
			} else {
				l = "prejudices (increase hurts satisfaction)";
			}

			label.put(e.getKey(), l);
		}

		return label;
	}

	// ---------------------------------------------------------------------
	// SRP and margin evaluation
	// ---------------------------------------------------------------------

	private static double evalSRP(
		Index idx,
		Influence influence,
		Map<String, Double> scenario,
		Map<String, Double> memoSRP,
		StringBuilder traceOrNull
	) {
		String outputName = influence.getOutputSRP().getName();

		if (memoSRP.containsKey(outputName)) {
			return memoSRP.get(outputName);
		}

		AnalyticExpressionFunction analytic = selectAnalyticFunction(influence);

		if (analytic == null) {
			throw new IllegalStateException(
				"No AnalyticExpressionFunction found for influence " + influence.getName()
			);
		}

		if (analytic.getExpressionLanguage() != LanguageType.JAVA_NUMERIC_EXPRESSION) {
			throw new IllegalStateException(
				"AnalyticExpressionFunction " + safeName(analytic)
					+ " is not JavaNumericExpression."
			);
		}

		String expression = analytic.getExpression();
		NumericExpressionEvaluator.Expr ast = NumericExpressionEvaluator.compile(expression);

		Map<String, Double> vars = new LinkedHashMap<>();

		if (traceOrNull != null) {
			traceOrNull.append("[evalSRP] ")
				.append(outputName)
				.append(" from ")
				.append(safeName(analytic))
				.append(": ")
				.append(expression)
				.append("\n");
		}

		for (Participant p : influence.getOwnedParticipants()) {
			double value = resolveParticipantValue(idx, p, scenario, memoSRP, traceOrNull);

			for (String alias : participantAliases(p)) {
				vars.put(alias, value);
			}

			if (traceOrNull != null) {
				traceOrNull.append("  ")
					.append(participantDisplayName(p))
					.append(" = ")
					.append(fmt(value))
					.append("\n");
			}
		}

		double y = NumericExpressionEvaluator.eval(ast, vars);
		memoSRP.put(outputName, y);

		if (traceOrNull != null) {
			traceOrNull.append("=> ")
				.append(outputName)
				.append(" = ")
				.append(fmt(y))
				.append("\n\n");
		}

		return y;
	}

	private static double evalMarginGeneral(
		Index idx,
		Map<String, Double> scenario,
		NumericExpressionEvaluator.Expr marginAst,
		StringBuilder traceOrNull
	) {
		Set<String> varsNeeded = NumericExpressionEvaluator.variables(marginAst);
		Map<String, Double> vm = new LinkedHashMap<>();
		Map<String, Double> memoSRP = new HashMap<>();

		if (traceOrNull != null) {
			traceOrNull.append("[evalMargin] variables needed: ")
				.append(varsNeeded)
				.append("\n");
		}

		for (String variable : varsNeeded) {
			Influence producingInfluence = idx.srp2inf.get(variable);

			if (producingInfluence != null) {
				double y = evalSRP(idx, producingInfluence, scenario, memoSRP, traceOrNull);
				vm.put(variable, y);
			} else {
				vm.put(variable, requireVar(variable, scenario));
			}
		}

		double margin = NumericExpressionEvaluator.eval(marginAst, vm);

		if (traceOrNull != null) {
			traceOrNull.append("[evalMargin] M(")
				.append(vm)
				.append(") = ")
				.append(fmt(margin))
				.append("\n\n");
		}

		return margin;
	}

	// ---------------------------------------------------------------------
	// Scenario completion and participant values
	// ---------------------------------------------------------------------

	private static Map<String, Double> completeScenario(
		Index idx,
		Influence terminal,
		Map<String, Double> scenario
	) {
		Map<String, Double> completed = new LinkedHashMap<>();

		if (scenario != null) {
			completed.putAll(scenario);
		}

		fillScenarioForInfluenceChain(idx, terminal, completed, new HashSet<>());

		return completed;
	}

	private static void fillScenarioForInfluenceChain(
		Index idx,
		Influence influence,
		Map<String, Double> scenario,
		Set<Influence> visited
	) {
		if (influence == null || visited.contains(influence)) {
			return;
		}

		visited.add(influence);

		for (Participant p : influence.getOwnedParticipants()) {
			if (p instanceof ArtifactParticipant) {
				fillArtifactAliases((ArtifactParticipant) p, scenario);
			} else if (p instanceof EnvironmentalFactorParticipant) {
				fillEnvironmentalAliases((EnvironmentalFactorParticipant) p, scenario);
			} else if (p instanceof SRPInputParticipant) {
				SRPInputParticipant sp = (SRPInputParticipant) p;

				if (sp.getTarget() != null && sp.getTarget().getName() != null) {
					Influence upstream = idx.srp2inf.get(sp.getTarget().getName());

					if (upstream != null) {
						fillScenarioForInfluenceChain(idx, upstream, scenario, visited);
					}
				}
			}
		}
	}

	private static void fillArtifactAliases(ArtifactParticipant p, Map<String, Double> scenario) {
		String participantName = p.getName();
		String targetName = p.getTarget() != null ? p.getTarget().getName() : null;

		Double value = firstFinite(scenario, participantName, targetName);

		if (value != null) {
			putIfName(scenario, participantName, value);
			putIfName(scenario, targetName, value);
		}
	}

	private static void fillEnvironmentalAliases(EnvironmentalFactorParticipant p, Map<String, Double> scenario) {
		String participantName = p.getName();
		String targetName = p.getTarget() != null ? p.getTarget().getName() : null;

		Double value = firstFinite(scenario, participantName, targetName);

		if (value == null) {
			value = representativeValue(p.getAdmissibleSpace());
		}

		if (value != null) {
			putIfName(scenario, participantName, value);
			putIfName(scenario, targetName, value);
		}
	}

	private static double resolveParticipantValue(
		Index idx,
		Participant p,
		Map<String, Double> scenario,
		Map<String, Double> memoSRP,
		StringBuilder traceOrNull
	) {
		if (p instanceof ArtifactParticipant) {
			ArtifactParticipant ap = (ArtifactParticipant) p;

			return requireFirstVar(
				scenario,
				ap.getName(),
				ap.getTarget() != null ? ap.getTarget().getName() : null
			);
		}

		if (p instanceof EnvironmentalFactorParticipant) {
			EnvironmentalFactorParticipant ep = (EnvironmentalFactorParticipant) p;

			Double value = firstFinite(
				scenario,
				ep.getName(),
				ep.getTarget() != null ? ep.getTarget().getName() : null
			);

			if (value != null) {
				return value;
			}

			value = representativeValue(ep.getAdmissibleSpace());

			if (value != null) {
				return value;
			}

			throw new IllegalArgumentException(
				"Missing/invalid value for environmental participant: "
					+ participantDisplayName(ep)
			);
		}

		if (p instanceof SRPInputParticipant) {
			SRPInputParticipant sp = (SRPInputParticipant) p;

			if (sp.getTarget() == null || sp.getTarget().getName() == null) {
				throw new IllegalArgumentException("SRPInputParticipant has no target SRP.");
			}

			String srpName = sp.getTarget().getName();
			Influence upstream = idx.srp2inf.get(srpName);

			if (upstream == null) {
				return requireFirstVar(scenario, sp.getName(), srpName);
			}

			return evalSRP(idx, upstream, scenario, memoSRP, traceOrNull);
		}

		throw new IllegalArgumentException("Unknown participant type: " + p);
	}

	private static Double representativeValue(ValueSpec spec) {
		if (spec == null) {
			return null;
		}

		if (spec instanceof ScalarValue) {
			return ((ScalarValue) spec).getValue();
		}

		if (spec instanceof RangeValue) {
			RangeValue range = (RangeValue) spec;

			EStructuralFeature nominalFeature = range.eClass().getEStructuralFeature("nominal");

			if (nominalFeature != null && range.eIsSet(nominalFeature)) {
				double nominal = range.getNominal();

				if (nominal >= range.getLower() && nominal <= range.getUpper()) {
					return nominal;
				}
			}

			return (range.getLower() + range.getUpper()) / 2.0;
		}

		return null;
	}

	// ---------------------------------------------------------------------
	// Variables, criteria, and validation
	// ---------------------------------------------------------------------

	private static void collectBaseVarsReachable(
		Index idx,
		Influence influence,
		Map<String, Double> scenario,
		Set<String> out
	) {
		for (Participant p : influence.getOwnedParticipants()) {
			if (p instanceof ArtifactParticipant) {
				out.add(canonicalVariableName(p, scenario));
			} else if (p instanceof EnvironmentalFactorParticipant) {
				out.add(canonicalVariableName(p, scenario));
			} else if (p instanceof SRPInputParticipant) {
				SRPInputParticipant sp = (SRPInputParticipant) p;

				if (sp.getTarget() != null && sp.getTarget().getName() != null) {
					Influence upstream = idx.srp2inf.get(sp.getTarget().getName());

					if (upstream != null) {
						collectBaseVarsReachable(idx, upstream, scenario, out);
					}
				}
			}
		}
	}

	private static String canonicalVariableName(Participant p, Map<String, Double> scenario) {
		String participantName = p.getName();
		String targetName = targetNameOf(p);

		if (participantName != null && scenario.containsKey(participantName)) {
			return participantName;
		}

		if (targetName != null && scenario.containsKey(targetName)) {
			return targetName;
		}

		if (participantName != null) {
			return participantName;
		}

		return targetName;
	}

	private static List<String> participantAliases(Participant p) {
		LinkedHashSet<String> aliases = new LinkedHashSet<>();

		if (p.getName() != null) {
			aliases.add(p.getName());
		}

		String target = targetNameOf(p);

		if (target != null) {
			aliases.add(target);
		}

		return new ArrayList<>(aliases);
	}

	private static String targetNameOf(Participant p) {
		if (p instanceof ArtifactParticipant) {
			ArtifactParticipant ap = (ArtifactParticipant) p;
			return ap.getTarget() != null ? ap.getTarget().getName() : null;
		}

		if (p instanceof EnvironmentalFactorParticipant) {
			EnvironmentalFactorParticipant ep = (EnvironmentalFactorParticipant) p;
			return ep.getTarget() != null ? ep.getTarget().getName() : null;
		}

		if (p instanceof SRPInputParticipant) {
			SRPInputParticipant sp = (SRPInputParticipant) p;
			return sp.getTarget() != null ? sp.getTarget().getName() : null;
		}

		return null;
	}

	private static String participantDisplayName(Participant p) {
		String target = targetNameOf(p);

		if (p.getName() != null && target != null) {
			return p.getName() + " -> " + target;
		}

		if (p.getName() != null) {
			return p.getName();
		}

		if (target != null) {
			return target;
		}

		return p.eClass().getName();
	}

	private static List<SatisfactionCriterion> criteriaForOutputSrp(
		InfluenceModel model,
		Influence influence
	) {
		List<SatisfactionCriterion> result = new ArrayList<>();

		if (model == null || influence == null || influence.getOutputSRP() == null) {
			return result;
		}

		SystemResponseProperty srp = influence.getOutputSRP();

		TreeIteratorAdapter it = new TreeIteratorAdapter(model);

		while (it.hasNext()) {
			EObject object = it.next();

			if (object instanceof SatisfactionCriterion) {
				SatisfactionCriterion c = (SatisfactionCriterion) object;

				if (criterionConstrainsSrp(c, srp)) {
					result.add(c);
				}
			}
		}

		return result;
	}

	private static boolean criterionConstrainsSrp(
		SatisfactionCriterion criterion,
		SystemResponseProperty srp
	) {
		if (criterion == null || srp == null || criterion.getConstrainedSRPs() == null) {
			return false;
		}

		return criterion.getConstrainedSRPs().contains(srp);
	}

	
	private static void validateMarginVariablesAreResolvable(
		    Index idx,
		    Set<String> marginVars,
		    Map<String, Double> scenario,
		    StringBuilder trace
		) {
		    for (String varName : marginVars) {
		        boolean isProducedSrp = idx.srp2inf.containsKey(varName);
		        boolean isScenarioVar = scenario != null
		            && scenario.containsKey(varName)
		            && scenario.get(varName) != null
		            && Double.isFinite(scenario.get(varName));

		        if (!isProducedSrp && !isScenarioVar) {
		            trace.append(">> WARNING: Margin variable '")
		                .append(varName)
		                .append("' is neither a produced SRP nor a finite scenario variable.\n");
		        }
		    }
		}

	// ---------------------------------------------------------------------
	// Function selection
	// ---------------------------------------------------------------------

	private static AnalyticExpressionFunction selectAnalyticFunction(Influence influence) {
		if (influence == null || influence.getOwnedInfluenceFunction() == null) {
			return null;
		}

		InfluenceFunction fn = influence.getOwnedInfluenceFunction();

		if (fn.getRepresentations() == null || fn.getRepresentations().isEmpty()) {
			return null;
		}

		AnalyticExpressionFunction best = null;
		double bestConfidence = Double.NEGATIVE_INFINITY;

		for (FunctionRepresentation rep : fn.getRepresentations()) {
			if (rep instanceof AnalyticExpressionFunction) {
				AnalyticExpressionFunction candidate = (AnalyticExpressionFunction) rep;

				double confidence = readDoubleFeature(candidate, "confidence", 0.0);

				if (best == null || confidence > bestConfidence) {
					best = candidate;
					bestConfidence = confidence;
				}
			}
		}

		return best;
	}

	// ---------------------------------------------------------------------
	// Utilities
	// ---------------------------------------------------------------------

	private static boolean isFinite(Double value) {
		return value != null && Double.isFinite(value);
	}

	private static Double firstFinite(Map<String, Double> scenario, String... names) {
		if (scenario == null || names == null) {
			return null;
		}

		for (String name : names) {
			if (name != null) {
				Double value = scenario.get(name);

				if (isFinite(value)) {
					return value;
				}
			}
		}

		return null;
	}

	private static double requireFirstVar(Map<String, Double> scenario, String... names) {
		Double value = firstFinite(scenario, names);

		if (value == null) {
			throw new IllegalArgumentException("Missing/invalid value for variables: " + Arrays.toString(names));
		}

		return value;
	}

	private static double requireVar(String name, Map<String, Double> scenario) {
		Double value = scenario.get(name);

		if (!isFinite(value)) {
			throw new IllegalArgumentException("Missing/invalid value for variable: " + name);
		}

		return value;
	}

	private static void putIfName(Map<String, Double> scenario, String name, Double value) {
		if (name != null && value != null && Double.isFinite(value)) {
			scenario.put(name, value);
		}
	}

	private static double step(double x) {
		double ax = Math.abs(x);
		double h = 1e-6 * (ax > 1.0 ? ax : 1.0);

		if (h == 0.0) {
			h = 1e-6;
		}

		return h;
	}

	private static String fmt(double x) {
		return String.format(Locale.US, "%.6f", x);
	}

	private static String safeName(EObject object) {
		if (object == null) {
			return "<null>";
		}

		EStructuralFeature nameFeature = object.eClass().getEStructuralFeature("name");

		if (nameFeature != null) {
			Object value = object.eGet(nameFeature);

			if (value != null) {
				return String.valueOf(value);
			}
		}

		return object.eClass().getName();
	}

	private static String requirementLabel(EObject requirementRef) {
		if (requirementRef == null) {
			return "<unknown-requirement>";
		}

		EStructuralFeature nameFeature = requirementRef.eClass().getEStructuralFeature("name");

		if (nameFeature != null) {
			Object value = requirementRef.eGet(nameFeature);

			if (value != null) {
				return String.valueOf(value);
			}
		}

		if (EcoreUtil.getURI(requirementRef) != null) {
			return EcoreUtil.getURI(requirementRef).toString();
		}

		return requirementRef.toString();
	}

	private static double readDoubleFeature(EObject object, String featureName, double defaultValue) {
		if (object == null || featureName == null) {
			return defaultValue;
		}

		EStructuralFeature feature = object.eClass().getEStructuralFeature(featureName);

		if (feature == null || !object.eIsSet(feature)) {
			return defaultValue;
		}

		Object value = object.eGet(feature);

		if (value instanceof Number) {
			return ((Number) value).doubleValue();
		}

		return defaultValue;
	}

	// ---------------------------------------------------------------------
	// Index
	// ---------------------------------------------------------------------

	private static final class Index {
		final Map<String, Influence> srp2inf = new HashMap<>();

		Index(InfluenceModel model) {
			if (model == null || model.getOwnedInfluences() == null) {
				return;
			}

			for (AbstractInfluence ai : model.getOwnedInfluences()) {
				if (ai instanceof Influence) {
					Influence influence = (Influence) ai;

					if (
						influence.getOutputSRP() != null
						&& influence.getOutputSRP().getName() != null
					) {
						srp2inf.put(influence.getOutputSRP().getName(), influence);
					}
				}
			}
		}
	}

	private static final class TreeIteratorAdapter implements Iterator<EObject> {
		private final org.eclipse.emf.common.util.TreeIterator<EObject> delegate;

		TreeIteratorAdapter(EObject root) {
			this.delegate = root.eAllContents();
		}

		@Override
		public boolean hasNext() {
			return delegate.hasNext();
		}

		@Override
		public EObject next() {
			return delegate.next();
		}
	}
}
