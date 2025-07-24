package fr.inria.kairos.influence.visualisation.klighd.synthesis;

import com.google.inject.Inject;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import org.eclipse.emf.ecore.EObject;

/**
 * Abstract super class for extension classes used in for the diagram synthesis that provides some convince methods.
 * 
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 */
@SuppressWarnings("all")
public abstract class AbstractSynthesisExtensions {
  @Inject
  private AbstractDiagramSynthesis<?> delegate;

  public boolean getBooleanValue(final SynthesisOption option) {
    return this.delegate.getBooleanValue(option);
  }

  public <T extends EObject> T associateWith(final T derived, final Object source) {
    return this.delegate.<T>associateWith(derived, source);
  }
}
