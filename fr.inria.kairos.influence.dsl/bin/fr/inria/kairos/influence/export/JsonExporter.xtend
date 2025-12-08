package fr.inria.kairos.influence.export

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess2
import fr.inria.kairos.influence.metamodel.*
import static extension java.util.stream.Collectors.joining

class JsonExporter {

	def void exportInfluences(Resource resource, IFileSystemAccess2 fsa) {
	    val sb = new StringBuilder
	    sb.append("{\n  \"influences\": [\n")
	    var first = true
	
	    val it = resource.allContents
	    while (it.hasNext) {
	      val o = it.next
	      if (o instanceof Influence) {
	        val inf = o as Influence
	        if (!first) sb.append(",\n")
	        first = false
	
	        val arts = inf.ownedParticipants.filter(ArtifactParticipant)
	          .map[target].filter[it !== null && name !== null]
	          .map['''{"name":"«esc(name)»","origin":"«uriOf(it)»"}''']
	          .join(", ")
	
	        val envs = inf.ownedParticipants.filter(EnvironmentalFactorParticipant)
	          .map[target].filter[it !== null && name !== null]
	          .map['''{"name":"«esc(name)»","origin":"«uriOf(it)»"}''']
	          .join(", ")
	
	        val srInputs = inf.ownedParticipants.filter(SRPInputParticipant)
	          .map[target].filter[it !== null && name !== null]
	          .map['''{"name":"«esc(name)»","origin":"«uriOf(it)»"}''']
	          .join(", ")
	
	        val outSR = inf.outputSRP
	        val outSRJson = if (outSR !== null && outSR.name !== null)
	          '''{"name":"«esc(outSR.name)»","origin":"«uriOf(outSR)»"}'''
	        else "null"
	
	        sb.append('''    {
	      "name": "«esc(inf.name)»",
	      "origin": "«uriOf(inf)»",
	      "designArtifacts": [«arts»],
	      "environmentalFactors": [«envs»],
	      "srpInputs": [«srInputs»],
	      "outputSRP": «outSRJson»
	    }''')
	      }
	    }
	    sb.append("\n  ]\n}\n")
	    fsa.generateFile("influences.json", sb.toString)
  }

	private def static String esc(String s) {
	    if (s === null) return ""
	    s.replace("\\", "\\\\").replace("\"", "\\\"")
	     .replace("\n","\\n").replace("\r","\\r").replace("\t","\\t")
	  }
	private def static String uriOf(org.eclipse.emf.ecore.EObject e) {
	    if (e === null) return null
	    EcoreUtil.getURI(e).toString
	  }
}

