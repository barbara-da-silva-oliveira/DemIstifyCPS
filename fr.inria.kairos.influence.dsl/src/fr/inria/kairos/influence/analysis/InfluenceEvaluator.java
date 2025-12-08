package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.metamodel.*;
import java.util.*;


// Full-chain evaluation with requirement-derived margin and decomposed sensitivities.
// Recursively evaluates upstream SRPs (via model indexing).
//Parses "satisfied when" into a signed margin M that is > 0 iff satisfied.
// Computes central-difference sensitivities dM/dx for all upstream base variables
// (Artifacts + EnvironmentalFactors), plus any vars that appear in the requirement.
// Classifies each variable as compensates / aggravates / neutral based on sign(dM/dx).

public final class InfluenceEvaluator {

	// Result of a terminal influence evaluation.
	public static final class EvalResult {
		public final double srpValue;                 // terminal SRP value y*
	    public final double margin;                   // signed margin M ( > 0 iff satisfied )
	    public final Map<String,Double> grad;         // dM/d(var) for decomposed sensitivities
	    public final Map<String,String> label;        // var -> compensates/originates/neutral
	    public final String trace;                    // step-by-step explanation
	
	    public EvalResult(double srpValue, double margin,
	                      Map<String,Double> grad, Map<String,String> label,
	                      String trace) {
	      this.srpValue = srpValue;
	      this.margin   = margin;
	      this.grad     = Collections.unmodifiableMap(new LinkedHashMap<>(grad));
	      this.label    = Collections.unmodifiableMap(new LinkedHashMap<>(label));
	      this.trace    = trace;
	    }
	  }

//  Evaluate the chain ending at (its output SRP), using (name -> value) for Artifacts/EnvironmentalFactors. 
//  The requirement linked to the terminal SRP is parsed to define a signed margin M that is > 0 iff satisfied.
//  Returns the SRP value, margin, decomposed sensitivities, labels, and a trace.

	public static EvalResult evaluateChainWithRequirement(InfluenceModel model,
                                                        Influence terminal,
                                                        Map<String,Double> scenario) {
		Index idx = new Index(model);
	    String srpName = terminal.getOutputSRP().getName();
	
	    StringBuilder tr = new StringBuilder();
	    tr.append("== Chain evaluation ==\n");
	    tr.append("Terminal influence: ").append(terminal.getName())
	      .append("  →  SRP: ").append(srpName).append("\n");
	
	    // 1) Terminal SRP value (y*)
	    double yStar = evalSRP(idx, terminal, scenario, new HashMap<>(), tr);
	    tr.append("SRP ").append(srpName).append(" = ").append(fmt(yStar)).append("\n\n");
	
	    // 2) Select requirement affecting this SRP (first, if many)
	    List<Requirement> aff = terminal.getOutputSRP().getConstrainedBy();
	    if (aff == null || aff.isEmpty()) {
	      tr.append("No requirement linked to SRP ").append(srpName).append(" → margin=N/A.\n");
	      return new EvalResult(yStar, Double.NaN, Map.of(), Map.of(), tr.toString());
	    }
	    Requirement R = aff.get(0);
	    tr.append("Requirement: ").append(R.getName()).append("\n");
	    
	    if (R.getDescription() != null) {
            tr.append("Description: \"").append(R.getDescription()).append("\"\n");
        }
	    
	    String sat = R.getSatisfaction();
	    LanguageType lang = R.getLanguage();
	    
	    if (sat == null || sat.trim().isEmpty()) {
            tr.append(">> Requirement has no satisfaction formula.\n");
            return new EvalResult(yStar, Double.NaN, Map.of(), Map.of(), tr.toString());
        }
	    
	    if (lang != LanguageType.JAVA_NUMERIC_EXPRESSION) {
            String langName = (lang != null) ? lang.getName() : "Null";
            tr.append(">> Skipping evaluation. Language is '").append(langName)
              .append("' but evaluator expects 'ConstraintExpression'.\n");
            return new EvalResult(yStar, Double.NaN, Map.of(), Map.of(), tr.toString());
        }
	    
	    //It is fine to continue...
	    
	    tr.append("Constraint Formula: ").append(sat).append("\n");
	    
	    // 3) Parse inequality -> signed margin expression (M > 0 iff satisfied)
	    ParsedIneq ineq = parseInequality(sat);
	    String marginExpr = (ineq.sign == Sign.GT || ineq.sign == Sign.GE)
	        ? "(" + ineq.lhs + ")-(" + ineq.rhs + ")" // if
	        : "(" + ineq.rhs + ")-(" + ineq.lhs + ")"; //else
	    tr.append("Margin expression M(x) = ").append(marginExpr).append("\n\n");
	
	    JavaExprEvaluator.Expr mAst = JavaExprEvaluator.compile(marginExpr);
	    Set<String> marginVars = JavaExprEvaluator.variables(mAst);
	    //checking the traceability from srp to requirement:
	    for (String varName : marginVars) {
	        Influence producingInf = idx.srp2inf.get(varName);
	        if (producingInf != null) {
	            // It is an SRP. Check if it points to the Requirement:
	            SystemResponseProperty srp = producingInf.getOutputSRP();
	            if (!srp.getConstrainedBy().contains(R)) {
	                tr.append(">> VALIDATION ERROR: The formula references SRP '").append(varName)
	                  .append("', but the model does not link it to Requirement '").append(R.getName()).append("'.\n");
	                return new EvalResult(yStar, Double.NaN, Map.of(), Map.of(), tr.toString());
	            }
	        }
	    }
	    
	    // 4) Collect all upstream base variables (Artifacts + EFs) reachable from terminal
	    LinkedHashSet<String> baseVars = new LinkedHashSet<>();
	    collectBaseVarsReachable(idx, terminal, baseVars);
	
	    // Add any additional variables appearing explicitly in the requirement margin
	    baseVars.addAll(marginVars);
	
	    // 5) Compute margin value under the current scenario (compose any SRP symbols too)
	    double M = evalMarginGeneral(idx, scenario, mAst, tr);
	    tr.append("Margin M = ").append(fmt(M))
	      .append("   (positive ⇒ requirement satisfied)\n\n");
	
	    // 6) Decomposed sensitivities via central differences on base variables
	    Map<String,Double> grad = new LinkedHashMap<>();
	    tr.append("== Decomposed sensitivities (central difference) ==\n");
	    List<String> sorted = new ArrayList<>(baseVars);
	    Collections.sort(sorted);
	    for (String v : sorted) {
	    	Double cur = scenario.get(v);
	    	if (!isFinite(cur)) {
	    		tr.append(v).append(": skipped (no finite value in scenario)\n");
	    		continue;
		      }
	    	double h = step(cur.doubleValue());
	      // +h
	    	Map<String,Double> sPlus = new LinkedHashMap<>(scenario);
	    	sPlus.put(v, cur + h);
	    	double Mp = evalMarginGeneral(idx, sPlus, mAst, null);
	      // -h
	    	Map<String,Double> sMinus = new LinkedHashMap<>(scenario);
	    	sMinus.put(v, cur - h);
	    	double Mm = evalMarginGeneral(idx, sMinus, mAst, null);
	
	    	double d = (Mp - Mm) / (2*h);
	    	grad.put(v, d);
	    	tr.append(": h=").append(fmt(h))
		        .append("  M(+h)=").append(fmt(Mp))
		        .append("  M(-h)=").append(fmt(Mm))
		        .append("  dM/d").append(v).append("≈").append(fmt(d))
		        .append("\n");
	    }
	    tr.append("\n");
	
	    // 7) Classify helps/hurts
	    Map<String,String> label = new LinkedHashMap<>();
	    double tol = 1e-12;
	    tr.append("== Classification (if increase values) ==\n");
	    for (var e : grad.entrySet()) {
	    	double g = e.getValue();
	    	String L = (Math.abs(g) < tol) ? "neutral"
	                : (g > 0 ? "benefits (↑ helps)"
	                         : "prejudices (↑ hurts)");
	    	label.put(e.getKey(), L);
	    	tr.append(e.getKey()).append(": ").append(L).append("\n");
	    }
	    return new EvalResult(yStar, M, grad, label, tr.toString());
	  }

// helpers

// Evaluate an SRP by recursively evaluating its producing influence chain.
	private static double evalSRP(Index idx,
                                Influence inf,
                                Map<String,Double> scenario,
                                Map<String,Double> memoSRP, // cache SRP
                                StringBuilder traceOrNull) {
    String out = inf.getOutputSRP().getName();
    if (memoSRP.containsKey(out)) return memoSRP.get(out);

    InfluenceFunction tf = (InfluenceFunction) inf.getOwnedInfluenceFunction();
    String expr = tf.getDefinition();
    JavaExprEvaluator.Expr ast = JavaExprEvaluator.compile(expr);

    Map<String,Double> vars = new LinkedHashMap<>();
    if (traceOrNull != null) {
    	traceOrNull.append("[evalSRP] ").append(out).append("  from expression: ").append(expr).append("\n");
    }

    for (Participant p : inf.getOwnedParticipants()) {
    	String n; double v;
    	if (p instanceof ArtifactParticipant ap) {
	        n = ap.getTarget().getName();
	        v = requireVar(n, scenario);
      } else if (p instanceof EnvironmentalFactorParticipant efp) {
	        n = efp.getTarget().getName();
	        v = requireVar(n, scenario);
      } else if (p instanceof SRPInputParticipant sp) {
	    	n = sp.getTarget().getName();
	        Influence up = idx.srp2inf.get(n);
	        if (up == null)
	        throw new IllegalStateException("No producing influence for SRP: " + n);
	        v = evalSRP(idx, up, scenario, memoSRP, traceOrNull);
	      } else throw new IllegalArgumentException("Unknown Participant type: " + p);
	      vars.put(n, v);
      if (traceOrNull != null) {
      	traceOrNull.append(n).append(" = ").append(fmt(v)).append("\n");
      }
    }

    double y = JavaExprEvaluator.eval(ast, vars);
    memoSRP.put(out, y);
    if (traceOrNull != null) {
      traceOrNull.append("→ ").append(out).append(" = ").append(fmt(y)).append("\n\n");
    }
    return y;
  }

//  Evaluate the margin expression by composing:
//   - any SRP symbols that appear in the expression (computed via the model index),
//    - any scalar variables (Artifacts/EFs) from the scenario.
//   If a needed scalar is missing, throws IllegalArgumentException.

	private static double evalMarginGeneral(Index idx,
                                          Map<String,Double> scenario,
                                          JavaExprEvaluator.Expr marginAst,
                                          StringBuilder traceOrNull) {
		
		Set<String> varsNeeded = JavaExprEvaluator.variables(marginAst);
	    Map<String,Double> vm = new LinkedHashMap<>();
	
	    // Memo for SRP values within this margin evaluation
	    Map<String,Double> memoSRP = new HashMap<>();
	
	    if (traceOrNull != null) {
	      traceOrNull.append("[evalMargin] variables needed: ").append(varsNeeded).append("\n");
	    }
	
	    for (String v : varsNeeded) {
	      Influence prod = idx.srp2inf.get(v);
	      if (prod != null) {
	        // v is an SRP symbol
	        double y = evalSRP(idx, prod, scenario, memoSRP, traceOrNull);
	        vm.put(v, y);
	      } else {
	        // v is a scalar (artifact/environment factor)
	        vm.put(v, requireVar(v, scenario));
	      }
	    }
	
	    double M = JavaExprEvaluator.eval(marginAst, vm);
	    if (traceOrNull != null) {
	      traceOrNull.append("[evalMargin] M(").append(vm).append(") = ").append(fmt(M)).append("\n\n");
	    }
	    return M;
	  }

// Collect all reachable base variables (Artifacts + EnvironmentalFactors). 
	private static void collectBaseVarsReachable(Index idx,
                                               Influence inf,
                                               Set<String> out) {
		for (Participant p : inf.getOwnedParticipants()) {
	    	if (p instanceof ArtifactParticipant ap) {
		        out.add(ap.getTarget().getName());
		      } else if (p instanceof EnvironmentalFactorParticipant efp) {
		        out.add(efp.getTarget().getName());
		      } else if (p instanceof SRPInputParticipant sp) {
		        String srp = sp.getTarget().getName();
		        Influence up = idx.srp2inf.get(srp);
		        if (up != null) collectBaseVarsReachable(idx, up, out);
		      }
		    }
	  }

  // Utilities

	private static boolean isFinite(Double d) { return d != null && Double.isFinite(d); }

	private static double requireVar(String name, Map<String,Double> scenario) {
	    Double v = scenario.get(name);
	    if (v == null || !Double.isFinite(v))
	      throw new IllegalArgumentException("Missing/invalid value for variable: " + name);
	    return v.doubleValue();
	}

// Central-difference step: relative 1e-6 
	private static double step(double x) {
	    double ax = Math.abs(x);
	    double h = 1e-6 * (ax > 1.0 ? ax : 1.0);
	    if (h == 0.0) h = 1e-6;
	    return h;
	}

	private static String fmt(double x) {
		return String.format(java.util.Locale.US, "%.6f", x);
	}

  // Indexing

// SRP name to producing influence. 
	private static final class Index {
		final Map<String,Influence> srp2inf = new HashMap<>();
	    Index(InfluenceModel model) {
	      for (AbstractInfluence ai : model.getOwnedInfluences()) {
	        if (ai instanceof Influence inf) {
	          String s = inf.getOutputSRP().getName();
	          srp2inf.put(s, inf);
	        }
	      }
	    }
	  }

  // Inequality parsing (simple)

	private enum Sign { GT, GE, LT, LE }

	private static final class ParsedIneq {
	    final String lhs, rhs; final Sign sign;
	    ParsedIneq(String lhs, Sign sign, String rhs) {
	      this.lhs = lhs; this.sign = sign; this.rhs = rhs;
	      }
	    }

//Parses simple forms like:
// "MarginToCrash - 5 > 0"
//   "SRP <= 0.1"
//   "DetectionThreshold - BrakingDistance > 0"
//Returns (lhs, op, rhs). If no comparator is found, assumes "> 0".
// 
	private static ParsedIneq parseInequality(String s) {
	    if (s == null) throw new IllegalArgumentException("Empty satisfaction string.");
	    String txt = s.trim();
	    String[] ops = {">=", "<=", ">", "<"};
	    for (String op : ops) {
	      int k = txt.indexOf(op);
	      if (k >= 0) {
	        String lhs = txt.substring(0, k).trim();
	        String rhs = txt.substring(k + op.length()).trim();
	        return new ParsedIneq(lhs, toSign(op), rhs);
	      }
	    }
	    return new ParsedIneq(txt, Sign.GT, "0");
	  }

	private static Sign toSign(String op) {
		return switch (op) {
			case ">"  -> Sign.GT;
			case ">=" -> Sign.GE;
			case "<"  -> Sign.LT;
			case "<=" -> Sign.LE;
			default   -> throw new IllegalArgumentException("Unknown op: " + op);
	    };
	  }
}

