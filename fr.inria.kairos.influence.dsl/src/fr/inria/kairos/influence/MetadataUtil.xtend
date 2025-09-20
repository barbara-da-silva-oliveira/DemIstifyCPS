package fr.inria.kairos.influence

import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import java.util.HashMap
import java.util.List
import java.util.Map

class MetadataUtil {

  static val String NUMBER = '[-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?'

	@Accessors
	static class Weights {
	  	val double likelihood = 1.0
	  	val double strength   = 1.0
	  	val double confidence = 1.0
	}

  /** Parsed likelihoods per element type. */
	@Accessors
	static class PerElement {
		val artifacts       = new java.util.HashMap<String, Double>()
		val phenomena       = new java.util.HashMap<String, Double>()
		val systemResponses = new java.util.HashMap<String, Double>()
	}
	
  // ----- Likelihood per element -----

  /** Accept items like: "artifact motorSpeed 0.8", "system response \"TTC\" 0.9", "phenomena 'wind' 0.3" */
	static val ITEM = Pattern.compile(
	    "(?is)^\\s*(artifact|phenomena|system\\s+response)\\s+" + // kind
	    "(?:\"([^\"]+)\"|'([^']+)'|(.+?))\\s+" +                  // name: "quoted" | 'quoted' | bare
	    "(" + NUMBER + ")\\s*$"                                   // value
  	)

	def static PerElement parsePerElement(List<String> items) {
		val out = new PerElement
		if (items === null) return out
	
		for (raw : items) {
		    if (raw !== null) {
		      val s = raw.trim
		      if (!s.empty) {
		        val m = ITEM.matcher(s)
		        if (m.matches) {
		          val kind = m.group(1).toLowerCase
		          val name = (if (m.group(2) !== null) m.group(2)
		                  else if (m.group(3) !== null) m.group(3)
		                  else if (m.group(4) !== null) m.group(4)
		                  else "").trim
		          val v = java.lang.Double.parseDouble(m.group(5))
		          switch kind {
		            case "artifact"        : out.artifacts.put(name, v)
		            case "phenomena"       : out.phenomena.put(name, v)
		            case "system response" : out.systemResponses.put(name, v)
		          }
		        }
		      }
		    }
		  }
		out
	}


  /** Convenience if you store a single CSV string instead of a list attribute. */
	def static PerElement parsePerElementCSV(String csv) {
		if (csv === null || csv.trim.empty) return new PerElement
	    parsePerElement(java.util.Arrays.asList(csv.split("\\s*,\\s*")))
	  }


	def static Double extractPriorityNumber(String meta) {
    	extractDouble(meta, 'priority')
  	}

	def static String extractPriorityLabel(String meta) {
    	extractWord(meta, 'priority')
  	}

	def static Double extractDouble(String meta, String key) {
	    if (meta === null) return null
	    val p = Pattern.compile('(?i)\\b' + Pattern.quote(key) + '\\b\\s*=\\s*(' + NUMBER + ')')
	    val m = p.matcher(sanitize(meta))
	    if (m.find) Double.valueOf(m.group(1)) else null
  }

	def static String extractWord(String meta, String key) {
	    if (meta === null) return null
	    val p = Pattern.compile('(?i)\\b' + Pattern.quote(key) + '\\b\\s*=\\s*("?)([A-Za-z]+)\\1')
	    val m = p.matcher(sanitize(meta))
	    if (m.find) m.group(2) else null
  }

	private static def String sanitize(String meta) {
	    var s = meta.trim
	    if (s.startsWith('{') && s.endsWith('}')) s = s.substring(1, s.length - 1).trim
	    if ((s.startsWith('"') && s.endsWith('"')) || (s.startsWith("'") && s.endsWith("'"))) {
	      s = s.substring(1, s.length - 1)
	    }
	    s
	}

	def static double priorityWeight(String meta) {
	    val w = extractPriorityLabel(meta)
	    if (w === null) 1.0
	    else switch w.toLowerCase {
	      case 'high'  : 1.0
	      case 'medium': 0.66
	      case 'low'   : 0.33
	      default      : 1.0
	    }
  }

  /** Requirement metadata lists. */
	def static String metadataSafe(EObject o) {
	    if (o === null) return null
	    val f = o.eClass?.getEStructuralFeature("metadata")
	    if (f === null) return null
	    val v = o.eGet(f)
	    switch v {
	      case v instanceof String            : v as String
	      case v instanceof java.util.List<?> : (v as java.util.List<?>)
	                                             .filter[it !== null]
	                                             .map[String.valueOf(it)]
	                                             .join(", ")
	      default                             : null
    }
  }
}
