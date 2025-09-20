package fr.inria.kairos.influence.analysis

import org.eclipse.emf.ecore.resource.Resource
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.Requirement
import fr.inria.kairos.influence.MetadataUtil
import java.util.HashMap
import java.util.Map
import fr.inria.kairos.influence.metamodel.DesignArtifact
import java.util.ArrayDeque
import java.util.LinkedHashSet

class ImpactMetrics {

	def Result compute(Resource resource) {
		val impactArtifacts   = new HashMap<String, Integer>()
		val impactPhenomena   = new HashMap<String, Integer>()
	    val sensRequirements  = new HashMap<String, Integer>()
	    val impactArtifactsW  = new HashMap<String, Double>()
	    val impactPhenomenaW  = new HashMap<String, Double>()
	    val sensRequirementsW = new HashMap<String, Double>()
	
	    val it = resource.allContents
	    while (it.hasNext) {
	      val o = it.next
	      if (o instanceof Influence) {
	        val inf = o as Influence
	        val L = MetadataUtil.parsePerElement(inf.likelihoodPerElement)
	
	        val seenA = new java.util.HashSet<String>()
	        val seenP = new java.util.HashSet<String>()
	        val seenR = new java.util.HashSet<String>()
	
			// Collecting names of Originator Artifact
	        for (a : inf.originatorArtifact) {
		  		if (a !== null && a.name !== null) {
		    	seenA.add(a.name)
		  		}
			}
	        
		    // Originator phenomena
			for (p : inf.originatorPhenomena) {
			  if (p !== null && p.name !== null) {
			    seenP.add(p.name)
			  }
			}
			// Requirements (through usedIn of each system response)
			for (sr : inf.affects) {
			  for (r : sr.usedIn) {
			    if (r !== null && r.name !== null) {
			      seenR.add(r.name)
			    }
			  }
			}
	        for (k : seenA) impactArtifacts.put(k, impactArtifacts.getOrDefault(k, 0) + 1)
	        for (k : seenP) impactPhenomena.put(k, impactPhenomena.getOrDefault(k, 0) + 1)
	        for (k : seenR) sensRequirements.put(k, sensRequirements.getOrDefault(k, 0) + 1)
	
	        for (a : inf.originatorArtifact)
	          if (a?.name !== null && seenA.contains(a.name))
	            impactArtifactsW.put(a.name, impactArtifactsW.getOrDefault(a.name, 0d) + L.artifacts.getOrDefault(a.name, 1.0))
	
	        for (p : inf.originatorPhenomena)
	          if (p?.name !== null && seenP.contains(p.name))
	            impactPhenomenaW.put(p.name, impactPhenomenaW.getOrDefault(p.name, 0d) + L.phenomena.getOrDefault(p.name, 1.0))
	
	        for (t : inf.relatedTo) if (t instanceof Requirement) {
	          val r = t as Requirement
	          if (r.name !== null && seenR.contains(r.name)) {
	            val pw = MetadataUtil.priorityWeight(fr.inria.kairos.influence.generator.InfluenceDSLGenerator.metadataSafe(r))
	            sensRequirementsW.put(r.name, sensRequirementsW.getOrDefault(r.name, 0d) + pw)
	          }
	        }
	      }
	    }
	  
	 	val trace = new RequirementTraceability().buildTrace(resource)

		val allArtifacts = new java.util.LinkedHashSet<String>()
		val it2 = resource.allContents
		while (it2.hasNext) {
			val any = it2.next
      		if (any instanceof DesignArtifact) {
        		val da = any as DesignArtifact
        		if (da.name !== null) allArtifacts.add(da.name)
      		}
    	}

    // For each artifact, count distinct reachable influences via outEdges
		val impactArtifactsPropagated = new HashMap<String, Integer>()
		for (aName : allArtifacts) {
			val start = "A:" + aName
			val count = countReachableInfluences(start, trace.outEdges)
			impactArtifactsPropagated.put(aName, count)
		}

    // indirect-only = propagated - direct
		val impactArtifactsIndirect = new HashMap<String, Integer>()
		for (e : impactArtifactsPropagated.entrySet) {
 		val direct = impactArtifacts.getOrDefault(e.key, 0)
		val only   = e.value - direct
		impactArtifactsIndirect.put(e.key, if (only > 0) only else 0)
		}
		new Result(impactArtifacts, impactPhenomena, sensRequirements,
       impactArtifactsW, impactPhenomenaW, sensRequirementsW, impactArtifactsPropagated, impactArtifactsIndirect)
		
		}

	private def int countReachableInfluences( String start, Map<String, LinkedHashSet<String>> outEdges) {
		val visited    = new java.util.HashSet<String>()
	    val q          = new ArrayDeque<String>()
	    val influences = new java.util.HashSet<String>()
	
	    visited.add(start)
	    q.add(start)
	
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

	static class Result {
		public val Map<String, Integer> impactArtifacts
		public val Map<String, Integer> impactPhenomena
		public val Map<String, Integer> sensRequirements
		public val Map<String, Double>  impactArtifactsW
		public val Map<String, Double>  impactPhenomenaW
		public val Map<String, Double>  sensRequirementsW
	    public val Map<String, Integer> impactArtifactsPropagated
    	public val Map<String, Integer> impactArtifactsIndirect
	
		new(Map<String, Integer> impactArtifacts,
			Map<String, Integer> impactPhenomena,
			Map<String, Integer> sensRequirements,
			Map<String, Double>  impactArtifactsW,
			Map<String, Double>  impactPhenomenaW,
			Map<String, Double>  sensRequirementsW,
			Map<String, Integer> impactArtifactsPropagated,
      		Map<String, Integer> impactArtifactsIndirect
      		) {
			this.impactArtifacts   = impactArtifacts
			this.impactPhenomena   = impactPhenomena
			this.sensRequirements  = sensRequirements
			this.impactArtifactsW  = impactArtifactsW
			this.impactPhenomenaW  = impactPhenomenaW
			this.sensRequirementsW = sensRequirementsW
      		this.impactArtifactsPropagated  = impactArtifactsPropagated
      		this.impactArtifactsIndirect    = impactArtifactsIndirect

	  		}
		}
	}
