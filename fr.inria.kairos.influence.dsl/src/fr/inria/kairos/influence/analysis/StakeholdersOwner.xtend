package fr.inria.kairos.influence.analysis

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import fr.inria.kairos.influence.metamodel.Influence
import fr.inria.kairos.influence.metamodel.DesignArtifact
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.InternalEObject

import java.util.LinkedHashSet
import java.util.TreeSet
import java.util.Collection

class StakeholdersOwner {

	static class Row {
	    public val String influence
	    public val int    modelCount
	    public val String modelsCsv
	    new(String influence, int modelCount, String modelsCsv) {
	      this.influence  = influence
	      this.modelCount = modelCount
	      this.modelsCsv  = modelsCsv
	    }
  	}

	def java.util.List<Row> analyze(Resource res) {
		val rows = new java.util.ArrayList<Row>()

	    for (inf : res.allContents.toIterable.filter(Influence)) {
	      val iName = safeName(inf)
	
	      // Take originator artifacts directly from the feature
	      val originators = readArtifactsFeature(inf, "originatorArtifact")
	
	      if (originators.empty) {
	      	rows.add(new Row(iName, 0, ""))
	      } else {
	      	val modelUris = new TreeSet<String>()
	        for (da : originators) {
	          val target = readRefEObject(da)           // <-- the referenced EObject
	          if (target !== null) {
				modelUris.add(modelUriOf(target))       // file/URI of the referenced model
	          }
	        }
			rows.add(new Row(iName, modelUris.size, joinSemi(modelUris)))
	      }
	    }
		rows
	 }

	def void exportCSV(Resource res, IFileSystemAccess2 fsa, String outPath) {
	    val rows = analyze(res)
	    val sb = new StringBuilder("influence,model_count,models\n")
	    for (r : rows) {
	      sb.append(csv(r.influence)).append(',')
	        .append(String.valueOf(r.modelCount)).append(',')
	        .append(csv(r.modelsCsv)).append('\n')
	    }
	    fsa.generateFile(outPath, sb.toString)
  }


	private def String safeName(Influence inf) {
	    val n = inf?.name
	    if (n !== null) n else "<unnamed-influence>"
  	}

	private def LinkedHashSet<DesignArtifact> readArtifactsFeature(EObject host, String featureName) {
	    val out = new LinkedHashSet<DesignArtifact>()
	    val f = host.eClass.getEStructuralFeature(featureName)
	    if (f === null) return out
	    val v = host.eGet(f)
	    switch v {
	      Collection<?>: for (e : v) if (e instanceof DesignArtifact) out.add(e as DesignArtifact)
	      DesignArtifact: out.add(v as DesignArtifact)
	      default: {}
	    }
	    out
  	}

	private def EObject readRefEObject(DesignArtifact da) {
		val f = da.eClass.getEStructuralFeature("ref")
		if (f === null || !da.eIsSet(f)) return null
		val v = da.eGet(f)
		return if (v instanceof EObject) v as EObject else null
	  }

	private def String modelUriOf(EObject target) {
	    val u = if (target.eIsProxy)
	              (target as InternalEObject).eProxyURI
				else
	              EcoreUtil.getURI(target)
		val base = u?.trimFragment
		return if (base !== null) base.toString else "<unknown>"
  	}

	private def String joinSemi(Iterable<String> xs) {
		if (xs === null) return ""
		val it = xs.iterator
	    if (!it.hasNext) return ""
	    val sb = new StringBuilder
	    sb.append(it.next)
	    while (it.hasNext) sb.append("; ").append(it.next)
	    sb.toString
	  }

	private def String csv(String s) {
		if (s === null) return ""
		val needs = s.indexOf(',') >= 0 || s.indexOf('"') >= 0 || s.indexOf('\n') >= 0 || s.indexOf('\r') >= 0
		val esc = s.replace("\"", "\"\"")
		if (needs) '"' + esc + '"' else esc
  	}
}
