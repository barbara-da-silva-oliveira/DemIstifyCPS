package fr.inria.kairos.influence.analysis

import fr.inria.kairos.influence.analysis.GraphBuilder
import org.eclipse.emf.ecore.resource.Resource
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.Requirement
import fr.inria.kairos.influence.MetadataUtil
import java.util.HashMap
import java.util.Map
import fr.inria.kairos.influence.metamodel.DesignArtifact
import java.util.ArrayDeque
import java.util.LinkedHashSet
import fr.inria.kairos.influence.metamodel.*

class ImpactMetrics {

	def Result compute(Resource resource, GraphBuilder.Result graphBundle) {
		val impactArtifacts   = new HashMap<String, Integer>()
		val impactEnvFactors   = new HashMap<String, Integer>()
	    val sensRequirements  = new HashMap<String, Integer>()
	    val partToInfWeight = new HashMap<String, Double>() 
	    
	    val influenceWeight = new HashMap<String, Double>()
	    val impactArtifactsW  = new HashMap<String, Double>()
	    val impactEnvFactorsW  = new HashMap<String, Double>()
	    val sensRequirementsW = new HashMap<String, Double>()
	
	    val it = resource.allContents
	    while (it.hasNext) {
	      val o = it.next
	      if (o instanceof Influence) {
	        val inf = o as Influence
	        	
	        val seenA = new java.util.HashSet<String>()
	        val seenE = new java.util.HashSet<String>()
	        val seenR = new java.util.HashSet<String>()
		    
		    val wA = new HashMap<String, Double>()
        	val wE = new HashMap<String, Double>()
        	
        	var sumIW = 0.0
		        // Participants
	        for (p : inf.ownedParticipants) {
	          if (p instanceof ArtifactParticipant) {
	            val ap = p as ArtifactParticipant
	            val a  = ap.target
	            if (a !== null && a.name !== null) {
	              seenA.add(a.name)
	              val w = if (ap.confidence == 0.0) 1.0 else ap.confidence
	              wA.put(a.name, wA.getOrDefault(a.name, 0d) + w)
	              partToInfWeight.put("A:" + a.name + "->I:" + inf.name, w)
	              sumIW += w
	              
	            }
	          } else if (p instanceof EnvironmentalFactorParticipant) {
	            val ep = p as EnvironmentalFactorParticipant
	            val e  = ep.target
	            if (e !== null && e.name !== null) {
	              seenE.add(e.name)
	              val w = if (ep.confidence == 0.0) 1.0 else ep.confidence
	              wE.put(e.name, wE.getOrDefault(e.name, 0d) + w)
	              partToInfWeight.put("E:" + e.name + "->I:" + inf.name, w)
	              sumIW += w
	            }
	          } else if (p instanceof SRPInputParticipant) {
	            // SRP inputs are used for traceability graph, but not for artifact/EF impact
	          }
	        }
	        influenceWeight.put("I:" + inf.name, sumIW)
	        
			
			// Requirements (through usedIn of each system response)
			val sr = inf.outputSRP
			if (sr !== null)
          	for (r : sr.constrainedBy) if (r !== null && r.name !== null) seenR.add(r.name)

	        for (k : seenA) impactArtifacts.put(k, impactArtifacts.getOrDefault(k, 0) + 1)
        	for (k : seenE) impactEnvFactors.put(k,  impactEnvFactors.getOrDefault(k, 0) + 1)
        	for (k : seenR) sensRequirements.put(k, sensRequirements.getOrDefault(k, 0) + 1)
	
			for (e : wA.entrySet) impactArtifactsW.put(e.key, impactArtifactsW.getOrDefault(e.key, 0d) + e.value)
        	for (e : wE.entrySet) impactEnvFactorsW.put(e.key, impactEnvFactorsW.getOrDefault(e.key, 0d) + e.value)

// Priority metada:
//			for (r : sr?.constrainedBy ?: emptyList) {
//          		if (r instanceof Requirement && r.name !== null && seenR.contains(r.name)) {
//	            	val pw = fr.inria.kairos.influence.MetadataUtil.priorityWeight(
//	              	fr.inria.kairos.influence.generator.InfluenceDSLGenerator.metadataSafe(r)
//	            	)
//	            	sensRequirementsW.put(r.name, sensRequirementsW.getOrDefault(r.name, 0d) + pw)
//          		}
//
//	    	}
	 	}
	}
	  
		val allArtifacts = new java.util.LinkedHashSet<String>()
		val it2 = resource.allContents
		while (it2.hasNext) {
			val any = it2.next
      		if (any instanceof DesignArtifact) {
        		val da = any as DesignArtifact
        		if (da.name !== null) allArtifacts.add(da.name)
      		}
    	}
    	
    	val allEnvFactors = new java.util.LinkedHashSet<String>()
		val it3 = resource.allContents
		while (it3.hasNext) {
		  val any2 = it3.next
		  if (any2 instanceof EnvironmentalFactor) {
		    val ef = any2 as EnvironmentalFactor
		    if (ef.name !== null) allEnvFactors.add(ef.name)
		  }
		}

    // For each artifact, count distinct reachable influences via outEdges
		val impactArtifactsPropagated = new HashMap<String, Integer>()
		for (aName : allArtifacts) {
			val startNodeId = "A:" + aName
			val count = countReachableInfluences(startNodeId, graphBundle.outEdges)

			impactArtifactsPropagated.put(aName, count)
		}
		val impactArtifactsPropagatedW = new HashMap<String, Double>()
		for (aName : allArtifacts) {
		    val startNodeId = "A:" + aName
		    val wsum = sumPathWeightedInfluences(
		        startNodeId,
		        graphBundle.outEdges,
		        partToInfWeight,
		        influenceWeight
		    )
		    impactArtifactsPropagatedW.put(aName, wsum)
		}
		
		val impactEnvFactorsPropagated = new HashMap<String, Integer>()
		for (eName : allEnvFactors) {
		  val startNodeId = "E:" + eName
		  val count = countReachableInfluences(startNodeId, graphBundle.outEdges)
		  impactEnvFactorsPropagated.put(eName, count)
		}
		
		
		val impactEnvFactorsPropagatedW = new HashMap<String, Double>()
		for (eName : allEnvFactors) {
		  val startNodeId = "E:" + eName
		  val wsum = sumPathWeightedInfluences(
		    startNodeId,
		    graphBundle.outEdges,
		    partToInfWeight,
		    influenceWeight
		  )
		  impactEnvFactorsPropagatedW.put(eName, wsum)
		}
    // indirect-only = propagated - direct
		val impactArtifactsIndirect = new HashMap<String, Integer>()
		for (e : impactArtifactsPropagated.entrySet) {
 		val direct = impactArtifacts.getOrDefault(e.key, 0)
		val only   = e.value - direct
		impactArtifactsIndirect.put(e.key, if (only > 0) only else 0)
		}
		
		val impactEnvFactorsIndirect = new HashMap<String, Integer>()
		for (e : impactEnvFactorsPropagated.entrySet) {
		  val direct = impactEnvFactors.getOrDefault(e.key, 0)
		  val only   = e.value - direct
		  impactEnvFactorsIndirect.put(e.key, if (only > 0) only else 0)
		}
	    new Result(
	      impactArtifacts, impactEnvFactors, sensRequirements,
	      impactArtifactsW, impactEnvFactorsW, sensRequirementsW,
	      impactArtifactsPropagated, impactArtifactsIndirect,
	      impactArtifactsPropagatedW, impactEnvFactorsPropagated, impactEnvFactorsIndirect, impactEnvFactorsPropagatedW
	    )		
	}
	

	private def int countReachableInfluences( String startNodeId, Map<String, LinkedHashSet<String>> outEdges) {
		val visited    = new java.util.HashSet<String>()
	    val q          = new ArrayDeque<String>()
	    val influences = new java.util.HashSet<String>()
	
	    visited.add(startNodeId)
	    q.add(startNodeId)
	
	    while (!q.isEmpty) {
	      val cur = q.removeFirst
	      val succ = outEdges.get(cur)
	      if (succ !== null) {
	        for (n : succ) {
	          if (visited.add(n)) {
	            if (n.startsWith("I:")) influences.add(n)
	            q.add(n)
	          }
	        }
	        
	      }
	    }
	    influences.size
  	}

	private def double sumPathWeightedInfluences(
		String startNodeId,
		Map<String, LinkedHashSet<String>> outEdges,
		Map<String, Double> partToInfWeight,
		Map<String, Double> influenceWeight
		) {
		val best = new HashMap<String, Double>()
		val q    = new ArrayDeque<String>()
	  	best.put(startNodeId, 0d)
	  	q.add(startNodeId)
	
		while (!q.isEmpty) {
			val cur      = q.removeFirst
		    val curScore = best.getOrDefault(cur, 0d)
		    val succ     = outEdges.get(cur)
		
		    if (succ !== null) {
		    	for (n : succ) {
			        var add = 0d
			        // A/E -> I : per-Participant weight
			        if ((cur.startsWith("A:") || cur.startsWith("E:")) && n.startsWith("I:")) {
			          val key = cur + "->" + n
			          add = partToInfWeight.getOrDefault(key, 1.0)
			        }
			        // S -> I : influence-level weight
			        else if (cur.startsWith("S:") && n.startsWith("I:")) {
			          add = influenceWeight.getOrDefault(n, 0d)
			        }
			        // I -> S and S -> R : structural (add = 0)
			
			        val newScore = curScore + add
			        if (newScore > best.getOrDefault(n, Double.NEGATIVE_INFINITY)) {
			          best.put(n, newScore)
			          q.add(n)
			        }
		      }
		    }
	  }
	
	  var total = 0d
	  for (e : best.entrySet) {
	    if (e.key.startsWith("I:")) total += e.value
	  }
	  total
	}
	
	

	static class Result {
		public val Map<String, Integer> impactArtifacts
		public val Map<String, Integer> impactEnvFactors
		public val Map<String, Integer> sensRequirements
		public val Map<String, Double>  impactArtifactsW
		public val Map<String, Double>  impactEnvFactorsW
		public val Map<String, Double>  sensRequirementsW
	    public val Map<String, Integer> impactArtifactsPropagated
    	public val Map<String, Integer> impactArtifactsIndirect
		public val Map<String, Double> impactArtifactsPropagatedW
		public val Map<String, Integer> impactEnvFactorsPropagated
		public val Map<String, Integer> impactEnvFactorsIndirect
		public val Map<String, Double>  impactEnvFactorsPropagatedW
		
		new(Map<String, Integer> impactArtifacts,
			Map<String, Integer> impactEnvFactors,
			Map<String, Integer> sensRequirements,
			Map<String, Double>  impactArtifactsW,
			Map<String, Double>  impactEnvFactorsW,
			Map<String, Double>  sensRequirementsW,
			Map<String, Integer> impactArtifactsPropagated,
      		Map<String, Integer> impactArtifactsIndirect,
      		Map<String, Double> impactArtifactsPropagatedW,
      		Map<String, Integer> impactEnvFactorsPropagated,
			Map<String, Integer> impactEnvFactorsIndirect,
			Map<String, Double>  impactEnvFactorsPropagatedW
      		) {
			this.impactArtifacts   = impactArtifacts
			this.impactEnvFactors   = impactEnvFactors
			this.sensRequirements  = sensRequirements
			this.impactArtifactsW  = impactArtifactsW
			this.impactEnvFactorsW  = impactEnvFactorsW
			this.sensRequirementsW = sensRequirementsW
      		this.impactArtifactsPropagated  = impactArtifactsPropagated
      		this.impactArtifactsIndirect    = impactArtifactsIndirect
      		this.impactArtifactsPropagatedW = impactArtifactsPropagatedW
      		this.impactEnvFactorsPropagated  = impactEnvFactorsPropagated
		    this.impactEnvFactorsIndirect    = impactEnvFactorsIndirect
		    this.impactEnvFactorsPropagatedW = impactEnvFactorsPropagatedW

	  		}
		}
}