package fr.inria.kairos.influence.export

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import fr.inria.kairos.influence.metamodel.Influence

class JsonExporter {

	def void exportInfluences(Resource resource, IFileSystemAccess2 fsa) {
	    val sb = new StringBuilder
	    sb.append("{\n\t\"influences\": [\n")
	    var firstInfluence = true
	
		val it = resource.allContents
		while (it.hasNext) {
	      val o = it.next
	      if (o instanceof Influence) {
	        val inf = o as Influence
	        if (!firstInfluence) sb.append(",\n")
	        sb.append("\t\t{\n")
	        sb.append("\t\t\t\"name\": \"").append(inf.name).append("\",\n")
	        sb.append("\t\t\t\"artifactSources\": [")
	          .append(inf.originatorArtifact.filter[it !== null && it.name !== null].map[name].join(", ")['"«it»"'])
	          .append("],\n")
	        sb.append("\t\t\t\"phenomenaSources\": [")
	          .append(inf.originatorPhenomena.filter[it !== null && it.name !== null].map[name].join(", ")['"«it»"'])
	          .append("]\n")
	        sb.append("\t\t}")
	        firstInfluence = false
	      }
	    }
	    sb.append("\n\t]\n}\n")
	    fsa.generateFile("influences.json", sb.toString)
  }
}
