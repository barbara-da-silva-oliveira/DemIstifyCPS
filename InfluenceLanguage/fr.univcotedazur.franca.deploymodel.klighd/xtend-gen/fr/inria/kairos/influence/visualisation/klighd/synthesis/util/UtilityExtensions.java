package fr.inria.kairos.influence.visualisation.klighd.synthesis.util;

import de.cau.cs.kieler.klighd.kgraph.KGraphData;
import de.cau.cs.kieler.klighd.kgraph.KGraphElement;
import de.cau.cs.kieler.klighd.kgraph.KGraphFactory;
import de.cau.cs.kieler.klighd.kgraph.KIdentifier;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.AbstractSynthesisExtensions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Extension class that provides various utility methods for the synthesis.
 * 
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 */
@ViewSynthesisShared
@SuppressWarnings("all")
public class UtilityExtensions extends AbstractSynthesisExtensions {
  @Extension
  private KGraphFactory _kGraphFactory = KGraphFactory.eINSTANCE;

  /**
   * Sets KGE ID.
   */
  public boolean setID(final KGraphElement kge, final String id) {
    EList<KGraphData> _data = kge.getData();
    KIdentifier _createKIdentifier = this._kGraphFactory.createKIdentifier();
    final Procedure1<KIdentifier> _function = (KIdentifier it) -> {
      it.setId(id);
    };
    KIdentifier _doubleArrow = ObjectExtensions.<KIdentifier>operator_doubleArrow(_createKIdentifier, _function);
    return _data.add(_doubleArrow);
  }
}
