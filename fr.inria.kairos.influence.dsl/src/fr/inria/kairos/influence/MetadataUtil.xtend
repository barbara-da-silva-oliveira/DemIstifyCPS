package fr.inria.kairos.influence

import java.util.regex.Pattern
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors

class MetadataUtil {
	
	  /** Artifact/phenomenon weights. */
	  @Accessors(PUBLIC_GETTER)
	  static class Weights {
	    var double likelihood = 1.0
	    var double strength   = 1.0
	    var double confidence = 1.0
	    override toString() '''(likelihood=«likelihood», strength=«strength», confidence=«confidence»)'''
	  }
	
	  //-------- regex bits ----------
	  static val String NUMBER = '[-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?'
	  static val Pattern KEYVAL_LSC = Pattern::compile(
	    '(?i)\\b(likelihood|strength|confidence)\\b\\s*=\\s*(' + NUMBER + ')'
	  )
		
	  /** Parse artifact/phenomenon/system-response metadata: "likelihood=0.7, strength=0.8, confidence=0.9". */
	  def static Weights parseWeights(String meta) {
	    val w = new Weights
	    if (meta === null) return w
	    var s = meta.trim
	    if (s.startsWith('{') && s.endsWith('}')) s = s.substring(1, s.length - 1).trim
		if ((s.startsWith('"') && s.endsWith('"')) || (s.startsWith("'") && s.endsWith("'"))) {
		  s = s.substring(1, s.length - 1)
		}
		val m = KEYVAL_LSC.matcher(s)
		while (m.find) {
		  val key = m.group(1).toLowerCase
		  val v   = Double.parseDouble(m.group(2))
		  switch key {
		    case 'likelihood': w.likelihood = v
		case 'strength'  : w.strength   = v
		case 'confidence': w.confidence = v
		      }
		    }
		    w
		}
	
	
	  /** Returns numeric requirement priority if present (null if absent). Accepts: priority=0.85 */
	  def static Double extractPriorityNumber(String meta) {
	    extractDouble(meta, 'priority')
	  }
	
	  /** Returns labeled requirement priority if present (null if absent). Accepts: priority=high|medium|low */
	  def static String extractPriorityLabel(String meta) {
	    extractWord(meta, 'priority')
	  }
	
	
	  def static Double extractDouble(String meta, String key) {
	    if (meta === null) return null
	    val p = Pattern.compile('(?i)\\b' + Pattern.quote(key) + '\\b\\s*=\\s*(' + NUMBER + ')')
	    val m = p.matcher(sanitize(meta))
	    if (m.find) Double.valueOf(m.group(1)) else null
	  }
	
	  /** key = word or key = "word"  String or null if absent. */
	  def static String extractWord(String meta, String key) {
	    if (meta === null) return null
	    // allow quoted or unquoted alphabetic tokens
		val p = Pattern.compile('(?i)\\b' + Pattern.quote(key) + '\\b\\s*=\\s*("?)([A-Za-z]+)\\1')
	    val m = p.matcher(sanitize(meta))
	    if (m.find) m.group(2) else null
	  }
	  
	  
	    /** trims and strips surrounding braces/quotes if the dev added them. */
	  private static def String sanitize(String meta) {
	    var s = meta.trim
	    if (s.startsWith('{') && s.endsWith('}')) s = s.substring(1, s.length - 1).trim
		if ((s.startsWith('"') && s.endsWith('"')) || (s.startsWith("'") && s.endsWith("'"))) {
	      s = s.substring(1, s.length - 1)
	    }
	    s
	  }
	
	def static double priorityWeight(String meta) {
		//    val num = extractPriorityNumber(meta)
		val w = extractPriorityLabel(meta)
		if (w === null) 1.0
		else switch w.toLowerCase {
			case 'high'  : 1.0
		case 'medium': 0.66
		case 'low'   : 0.33
			default      : 1.0
		  }
	}
	
	
	
	/** Safely get 'metadata' as a single String from any EObject. Joins lists with ", ". */
	def static String metadataSafe(EObject o) {
	  if (o === null) return null
	  val f = o.eClass?.getEStructuralFeature("metadata")
	  if (f === null) return null
	  val v = o.eGet(f)
	  switch v {
	    case v instanceof String              : v as String
	    case v instanceof java.util.List<?>   : (v as java.util.List<?>)
	                                             .filter[it !== null]
	                                             .map[String.valueOf(it)]
	                                             .join(", ")
		    default                               : null
		  }
	}
}