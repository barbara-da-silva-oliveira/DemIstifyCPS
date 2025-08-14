package fr.inria.kairos.influence.visualisation.klighd.synthesis.util

import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import fr.inria.kairos.influence.visualisation.klighd.synthesis.AbstractSynthesisExtensions

/**
 * Extension class that provides various utility methods for the synthesis.
 * 
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 */
@ViewSynthesisShared
class UtilityExtensions extends AbstractSynthesisExtensions {
	
	extension KGraphFactory = KGraphFactory.eINSTANCE

	/**
	 * Sets KGE ID.
	 */
	def setID(KGraphElement kge, String id) {
		kge.data.add(createKIdentifier => [it.setId(id)])
	}

}
