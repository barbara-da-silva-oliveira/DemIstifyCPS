package fr.inria.kairos.influence.util

import org.eclipse.emf.ecore.EObject

class EmfFeatureReader {

	def static String stringFeature(EObject o, String featureName) {
		if (o === null) {
			return null
		}

		val f = o.eClass?.getEStructuralFeature(featureName)

		if (f === null) {
			return null
		}

		val v = o.eGet(f)

		if (v instanceof String) {
			return v as String
		}

		if (v instanceof java.util.List<?>) {
			return (v as java.util.List<?>)
				.filter[it !== null]
				.map[String.valueOf(it)]
				.join(", ")
		}

		null
	}
}