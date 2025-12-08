package fr.inria.kairos.influence.analysis;

import fr.inria.kairos.influence.analysis.GraphBuilder;
import fr.inria.kairos.influence.analysis.RequirementTraceability;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.InfluenceModel;
import fr.inria.kairos.influence.metamodel.Requirement;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import java.util.*;

// Structural requirement evaluation
public final class StructuralRequirementEvaluation {

	public void appendPerRequirement(Resource resource, GraphBuilder.Result g, StringBuilder out) {
	    out.append("== Structural evaluation per requirement ==\n");
	    var reqNames = new ArrayList<>(g.reqToSRs.keySet());
	    Collections.sort(reqNames);
	    var trace = new RequirementTraceability(g);

	    for (String req : reqNames) {
	      Map<String,Integer> min = new HashMap<>();
	      var srps = g.reqToSRs.getOrDefault(req, new LinkedHashSet<>());

	      for (String srpSimple : srps) {
	        final String srpId = "SR:" + srpSimple;
	        mergeMin(min, trace.upstreamArtifacts(srpId, g.inEdges));
	        mergeMin(min, trace.upstreamEnvironmentalFactors(srpId, g.inEdges));
	      }

	      var ranked = rank(min, g.nodeToOrigin, resource);
	      out.append("  ").append(req).append(": ");
	      if (ranked.isEmpty()) { out.append("(none)\n"); continue; }

	      var parts = new ArrayList<String>();
	      for (Cand c : ranked) {
	        String name  = c.id.substring(2);
	        String label = c.id.startsWith("A:") ? "changeability" : "flexibility";
	        String valStr = c.value >= 0 ? fmt(c.value) : "N/A";
	        
	        // Hops included for info
	        parts.add(name + " (" + label + "=" + valStr + ", " + c.hops + " hops)");
	      }
	      out.append(String.join(", ", parts)).append("\n");
	    }
	    out.append("\n");
	  }

	  // For a single (terminal) influence: print per-linked requirement structural advice.
	  public void appendForInfluence(Resource resource, GraphBuilder.Result g, Influence inf, StringBuilder out) {
	    final var srp = inf.getOutputSRP();
	    if (srp == null || srp.getName() == null) {
	      out.append("  (no output SRP)\n\n");
	      return;
	    }
	    final String srpId = "SR:" + srp.getName();
	    List<Requirement> reqs = srp.getConstrainedBy();
	    if (reqs == null || reqs.isEmpty()) {
	      out.append("  (no linked requirement for SRP ").append(srp.getName()).append(")\n\n");
	      return;
	    }
	    out.append("== Structural evaluation for ")
	       .append(inf.getName()).append(" -> ").append(srp.getName()).append(" ==\n");

	    var trace = new RequirementTraceability(g);
	    Map<String,Integer> min = new HashMap<>();
	    mergeMin(min, trace.upstreamArtifacts(srpId, g.inEdges));
	    mergeMin(min, trace.upstreamEnvironmentalFactors(srpId, g.inEdges));
	    var ranked = rank(min, g.nodeToOrigin, resource);

	    for (Requirement R : reqs) {
	    	out.append("  ").append(R.getName()).append(": ");
	    	if (ranked.isEmpty()) { out.append("(none)\n"); continue; }

	      var parts = new ArrayList<String>();
	      for (Cand c : ranked) {
	    	  String name  = c.id.substring(2);
	    	  String label = c.id.startsWith("A:") ? "changeability" : "flexibility";
	    	  String valStr = c.value >= 0 ? fmt(c.value) : "N/A";
	        
	    	  // Hops included for info
	    	  parts.add(name + " (" + label + "=" + valStr + ", " + c.hops + " hops)");
	      }
	      out.append(String.join(", ", parts)).append("\n");
	    }
	    out.append("\n");
	  }

  // ---------- internals ----------

	private static void mergeMin(Map<String,Integer> acc, Map<String,Integer> add) {
	    if (add == null) return;
	    for (var e : add.entrySet()) acc.merge(e.getKey(), e.getValue(), Math::min);
	  }
  
	private List<Cand> rank(Map<String,Integer> minHops,
          Map<String,String> nodeToOriginUri,
          Resource resource) {
		var out = new ArrayList<Cand>();
		for (var e : minHops.entrySet()) {
		final String id  = e.getKey();
		final int hops   = e.getValue();
		
		double val = -1.0; 
		if (nodeToOriginUri != null && resource != null) {
			String uriStr = nodeToOriginUri.get(id);
			if (uriStr != null) {
				EObject eo = resolve(resource, uriStr);
				if (eo != null) {
					if (id.startsWith("A:")) {
					val = read01(eo, "changeability");
					} else if (id.startsWith("E:")) {
					val = read01(eo, "flexibility");
					}
				}
			}
		}
		out.add(new Cand(id, hops, val));
		}
    
	    out.sort((x,y) -> {
	        // 1. Primary Sort: Value Descending (Highest Changeability first)
	        int c = Double.compare(y.value, x.value); 
	        if (c != 0) return c;
	        
	        // 2. Secondary Sort: When participant is closer to satisfaction of requirement -> means less changes in the chain
	        // This only happens if changeability is exactly the same.
	        c = Integer.compare(x.hops, y.hops); 
	        if (c != 0) return c;
	        
	        return x.id.compareTo(y.id);
	      });
	    return out;
	    }
	private static EObject resolve(Resource res, String uriStr) {
	    try {
	      if (res == null || res.getResourceSet() == null) return null;
	      return res.getResourceSet().getEObject(URI.createURI(uriStr), true);
	    } catch (Exception e) {
	      return null;
	    }
	  }

	private static double read01(EObject eo, String feature) {
	    EStructuralFeature f = eo.eClass().getEStructuralFeature(feature);
	    if (f == null) return -1;
	    Object v = eo.eGet(f);
	    if (v instanceof Number n) return clamp01(n.doubleValue());
	    if (v instanceof String s) {
	      try { return clamp01(Double.parseDouble(s.trim())); } catch (Exception ignored) {}
	    }
	    return -1;
	  }

	private static double clamp01(double x){ return x < 0 ? 0 : (x > 1 ? 1 : x); }
	private static String fmt(double x){ 
		return String.format(Locale.US, "%.2f", x); 
	}
	private static final class Cand {
	    final String id; 
	    final int hops; 
	    final double value; 
	    
	    Cand(String id, int hops, double value){ 
	        this.id=id; 
	        this.hops=hops; 
	        this.value=value; 
	    }
	  }
}

