package fr.inria.kairos.influence.export

import fr.inria.kairos.influence.metamodel.RangeValue
import fr.inria.kairos.influence.metamodel.ScalarValue
import fr.inria.kairos.influence.metamodel.ValueSpec

class ValueSpecPrinter {

	def static String label(ValueSpec v) {
		switch v {
			ScalarValue: {
				v.value + (if (v.unit !== null) " " + v.unit else "")
			}

			RangeValue: {
				"[" + v.lower + ".." + v.upper + "]" +
				(if (v.unit !== null) " " + v.unit else "")
			}

			default: "?"
		}
	}
}