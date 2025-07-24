package fr.inria.kairos.influence.visualisation.klighd.synthesis.styles;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.kgraph.KPort;
import de.cau.cs.kieler.klighd.krendering.Arc;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KArc;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KDecoratorPlacementData;
import de.cau.cs.kieler.klighd.krendering.KEllipse;
import de.cau.cs.kieler.klighd.krendering.KGridPlacement;
import de.cau.cs.kieler.klighd.krendering.KPolygon;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.KPosition;
import de.cau.cs.kieler.klighd.krendering.KRectangle;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.LineStyle;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceX;
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceY;
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses;
import fr.inria.kairos.influence.metamodel.CompositeInfluence;
import fr.inria.kairos.influence.metamodel.DesignArtifact;
import fr.inria.kairos.influence.metamodel.Influence;
import fr.inria.kairos.influence.metamodel.PhysicalPhenomena;
import fr.inria.kairos.influence.metamodel.Requirement;
import fr.inria.kairos.influence.metamodel.SystemResponse;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.AbstractSynthesisExtensions;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.InfluenceSynthesis;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.util.UtilityExtensions;
import java.util.Collections;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Extension class that provides shapes and figures for the Lingua France diagram synthesis.
 * 
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 */
@ViewSynthesisShared
@SuppressWarnings("all")
public class InfluenceShapeExtensions extends AbstractSynthesisExtensions {
  public static final float REACTION_POINTINESS = 6;

  public static final Property<Boolean> REACTOR_CONTENT_CONTAINER = new Property<Boolean>("fr.inria.kairos.influence.visualisation.klighd.synthesis.shapes.reactor.content", Boolean.valueOf(false));

  @Inject
  @Extension
  private KEdgeExtensions _kEdgeExtensions;

  @Inject
  @Extension
  private KPortExtensions _kPortExtensions;

  @Inject
  @Extension
  private KLabelExtensions _kLabelExtensions;

  @Inject
  @Extension
  private KRenderingExtensions _kRenderingExtensions;

  @Inject
  @Extension
  private KContainerRenderingExtensions _kContainerRenderingExtensions;

  @Inject
  @Extension
  private KPolylineExtensions _kPolylineExtensions;

  @Inject
  @Extension
  private KColorExtensions _kColorExtensions;

  @Inject
  @Extension
  private InfluenceStyleExtensions _influenceStyleExtensions;

  @Inject
  @Extension
  private UtilityExtensions _utilityExtensions;

  @Extension
  private KRenderingFactory _kRenderingFactory = KRenderingFactory.eINSTANCE;

  public static final float BANK_FIGURE_X_OFFSET_SUM = 6.0f;

  public static final float BANK_FIGURE_Y_OFFSET_SUM = 9.0f;

  /**
   * Creates the composite influence frame.
   */
  public KRoundedRectangle addCompositeInfluenceFigure(final KNode node, final CompositeInfluence influence, final String text) {
    int _xifexpression = (int) 0;
    boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
    if (_booleanValue) {
      _xifexpression = 8;
    } else {
      _xifexpression = 6;
    }
    final int padding = _xifexpression;
    KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(node, 8, 8, 1);
    final Procedure1<KRoundedRectangle> _function = (KRoundedRectangle it) -> {
      this._kContainerRenderingExtensions.setGridPlacement(it, 1);
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setForeground(it, Colors.RED_3);
      this._influenceStyleExtensions.boldLineSelectionStyle(it);
    };
    final KRoundedRectangle figure = ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function);
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(figure);
    final Procedure1<KRectangle> _function_1 = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it), this._kRenderingExtensions.LEFT, padding, 0, this._kRenderingExtensions.TOP, padding, 0), this._kRenderingExtensions.RIGHT, padding, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
      KRectangle _addRectangle_1 = this._kContainerRenderingExtensions.addRectangle(it);
      final Procedure1<KRectangle> _function_2 = (KRectangle it_1) -> {
        this._kRenderingExtensions.setInvisible(it_1, true);
        this._kRenderingExtensions.<KRectangle>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, 0, 0.5f, this._kRenderingExtensions.H_CENTRAL, this._kRenderingExtensions.V_CENTRAL, 0, 0, 0, 0);
        final KGridPlacement placement = this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        KText _addText = this._kContainerRenderingExtensions.addText(it_1, text);
        final Procedure1<KText> _function_3 = (KText it_2) -> {
          DiagramSyntheses.suppressSelectability(it_2);
          this._influenceStyleExtensions.underlineSelectionStyle(it_2);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_3);
        placement.setNumColumns(2);
      };
      ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle_1, _function_2);
    };
    ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_1);
    return figure;
  }

  /**
   * Creates the artefact frame.
   */
  public KRoundedRectangle addInfluenceFigure(final KNode node, final Influence influence, final String text) {
    int _xifexpression = (int) 0;
    boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
    if (_booleanValue) {
      _xifexpression = 8;
    } else {
      _xifexpression = 6;
    }
    final int padding = _xifexpression;
    KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(node, 8, 8, 1);
    final Procedure1<KRoundedRectangle> _function = (KRoundedRectangle it) -> {
      this._kContainerRenderingExtensions.setGridPlacement(it, 1);
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setForeground(it, Colors.BURLYWOOD_4);
      this._influenceStyleExtensions.boldLineSelectionStyle(it);
    };
    final KRoundedRectangle figure = ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function);
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(figure);
    final Procedure1<KRectangle> _function_1 = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it), this._kRenderingExtensions.LEFT, padding, 0, this._kRenderingExtensions.TOP, padding, 0), this._kRenderingExtensions.RIGHT, padding, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
      KRectangle _addRectangle_1 = this._kContainerRenderingExtensions.addRectangle(it);
      final Procedure1<KRectangle> _function_2 = (KRectangle it_1) -> {
        this._kRenderingExtensions.setInvisible(it_1, true);
        this._kRenderingExtensions.<KRectangle>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, 0, 0.5f, this._kRenderingExtensions.H_CENTRAL, this._kRenderingExtensions.V_CENTRAL, 0, 0, 0, 0);
        final KGridPlacement placement = this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        KText _addText = this._kContainerRenderingExtensions.addText(it_1, text);
        final Procedure1<KText> _function_3 = (KText it_2) -> {
          DiagramSyntheses.suppressSelectability(it_2);
          this._influenceStyleExtensions.underlineSelectionStyle(it_2);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_3);
        placement.setNumColumns(2);
      };
      ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle_1, _function_2);
    };
    ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_1);
    return figure;
  }

  /**
   * Creates the artefact frame.
   */
  public KRoundedRectangle addDesignArtifactFigure(final KNode node, final DesignArtifact artifact, final String text) {
    int _xifexpression = (int) 0;
    boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
    if (_booleanValue) {
      _xifexpression = 8;
    } else {
      _xifexpression = 6;
    }
    final int padding = _xifexpression;
    KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(node, 8, 8, 1);
    final Procedure1<KRoundedRectangle> _function = (KRoundedRectangle it) -> {
      this._kContainerRenderingExtensions.setGridPlacement(it, 1);
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setForeground(it, Colors.GRAY);
      this._influenceStyleExtensions.boldLineSelectionStyle(it);
    };
    final KRoundedRectangle figure = ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function);
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(figure);
    final Procedure1<KRectangle> _function_1 = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it), this._kRenderingExtensions.LEFT, padding, 0, this._kRenderingExtensions.TOP, padding, 0), this._kRenderingExtensions.RIGHT, padding, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
      KRectangle _addRectangle_1 = this._kContainerRenderingExtensions.addRectangle(it);
      final Procedure1<KRectangle> _function_2 = (KRectangle it_1) -> {
        this._kRenderingExtensions.setInvisible(it_1, true);
        this._kRenderingExtensions.<KRectangle>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, 0, 0.5f, this._kRenderingExtensions.H_CENTRAL, this._kRenderingExtensions.V_CENTRAL, 0, 0, 0, 0);
        final KGridPlacement placement = this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        KText _addText = this._kContainerRenderingExtensions.addText(it_1, text);
        final Procedure1<KText> _function_3 = (KText it_2) -> {
          DiagramSyntheses.suppressSelectability(it_2);
          this._influenceStyleExtensions.underlineSelectionStyle(it_2);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_3);
        KContainerRendering _addCloudIcon = this._influenceStyleExtensions.addCloudIcon(it_1);
        final Procedure1<KContainerRendering> _function_4 = (KContainerRendering it_2) -> {
          this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it_2), this._kRenderingExtensions.LEFT, 3, 0, this._kRenderingExtensions.TOP, 0, 0), this._kRenderingExtensions.RIGHT, 0, 0, this._kRenderingExtensions.BOTTOM, 0, 0);
        };
        ObjectExtensions.<KContainerRendering>operator_doubleArrow(_addCloudIcon, _function_4);
        placement.setNumColumns(2);
      };
      ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle_1, _function_2);
    };
    ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_1);
    return figure;
  }

  /**
   * Creates the requirement frame.
   */
  public KRoundedRectangle addRequirementFigure(final KNode node, final Requirement req, final String text) {
    int _xifexpression = (int) 0;
    boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
    if (_booleanValue) {
      _xifexpression = 8;
    } else {
      _xifexpression = 6;
    }
    final int padding = _xifexpression;
    KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(node, 8, 8, 1);
    final Procedure1<KRoundedRectangle> _function = (KRoundedRectangle it) -> {
      this._kContainerRenderingExtensions.setGridPlacement(it, 1);
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setForeground(it, Colors.PURPLE_3);
      this._influenceStyleExtensions.boldLineSelectionStyle(it);
    };
    final KRoundedRectangle figure = ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function);
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(figure);
    final Procedure1<KRectangle> _function_1 = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it), this._kRenderingExtensions.LEFT, padding, 0, this._kRenderingExtensions.TOP, padding, 0), this._kRenderingExtensions.RIGHT, padding, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
      KRectangle _addRectangle_1 = this._kContainerRenderingExtensions.addRectangle(it);
      final Procedure1<KRectangle> _function_2 = (KRectangle it_1) -> {
        this._kRenderingExtensions.setInvisible(it_1, true);
        this._kRenderingExtensions.<KRectangle>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, 0, 0.5f, this._kRenderingExtensions.H_CENTRAL, this._kRenderingExtensions.V_CENTRAL, 0, 0, 0, 0);
        final KGridPlacement placement = this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        KText _addText = this._kContainerRenderingExtensions.addText(it_1, text);
        final Procedure1<KText> _function_3 = (KText it_2) -> {
          DiagramSyntheses.suppressSelectability(it_2);
          this._influenceStyleExtensions.underlineSelectionStyle(it_2);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_3);
      };
      ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle_1, _function_2);
    };
    ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_1);
    return figure;
  }

  /**
   * Creates the physical phenomena frame.
   */
  public KRoundedRectangle addPhenomenaFigure(final KNode node, final PhysicalPhenomena phenomena, final String text) {
    int _xifexpression = (int) 0;
    boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
    if (_booleanValue) {
      _xifexpression = 8;
    } else {
      _xifexpression = 6;
    }
    final int padding = _xifexpression;
    KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(node, 8, 8, 1);
    final Procedure1<KRoundedRectangle> _function = (KRoundedRectangle it) -> {
      this._kContainerRenderingExtensions.setGridPlacement(it, 1);
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setForeground(it, Colors.ALICE_BLUE);
      this._influenceStyleExtensions.boldLineSelectionStyle(it);
    };
    final KRoundedRectangle figure = ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function);
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(figure);
    final Procedure1<KRectangle> _function_1 = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it), this._kRenderingExtensions.LEFT, padding, 0, this._kRenderingExtensions.TOP, padding, 0), this._kRenderingExtensions.RIGHT, padding, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
      KRectangle _addRectangle_1 = this._kContainerRenderingExtensions.addRectangle(it);
      final Procedure1<KRectangle> _function_2 = (KRectangle it_1) -> {
        this._kRenderingExtensions.setInvisible(it_1, true);
        this._kRenderingExtensions.<KRectangle>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, 0, 0.5f, this._kRenderingExtensions.H_CENTRAL, this._kRenderingExtensions.V_CENTRAL, 0, 0, 0, 0);
        final KGridPlacement placement = this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        KText _addText = this._kContainerRenderingExtensions.addText(it_1, text);
        final Procedure1<KText> _function_3 = (KText it_2) -> {
          DiagramSyntheses.suppressSelectability(it_2);
          this._influenceStyleExtensions.underlineSelectionStyle(it_2);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_3);
      };
      ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle_1, _function_2);
    };
    ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_1);
    return figure;
  }

  /**
   * Creates the physical phenomena frame.
   */
  public KRoundedRectangle addSystemResponseFigure(final KNode node, final SystemResponse sr, final String text) {
    int _xifexpression = (int) 0;
    boolean _booleanValue = this.getBooleanValue(InfluenceSynthesis.SHOW_HYPERLINKS);
    if (_booleanValue) {
      _xifexpression = 8;
    } else {
      _xifexpression = 6;
    }
    final int padding = _xifexpression;
    KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(node, 8, 8, 1);
    final Procedure1<KRoundedRectangle> _function = (KRoundedRectangle it) -> {
      this._kContainerRenderingExtensions.setGridPlacement(it, 1);
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setForeground(it, Colors.GREEN_3);
      this._influenceStyleExtensions.boldLineSelectionStyle(it);
    };
    final KRoundedRectangle figure = ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function);
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(figure);
    final Procedure1<KRectangle> _function_1 = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it), this._kRenderingExtensions.LEFT, padding, 0, this._kRenderingExtensions.TOP, padding, 0), this._kRenderingExtensions.RIGHT, padding, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
      KRectangle _addRectangle_1 = this._kContainerRenderingExtensions.addRectangle(it);
      final Procedure1<KRectangle> _function_2 = (KRectangle it_1) -> {
        this._kRenderingExtensions.setInvisible(it_1, true);
        this._kRenderingExtensions.<KRectangle>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, 0, 0.5f, this._kRenderingExtensions.H_CENTRAL, this._kRenderingExtensions.V_CENTRAL, 0, 0, 0, 0);
        final KGridPlacement placement = this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        KText _addText = this._kContainerRenderingExtensions.addText(it_1, text);
        final Procedure1<KText> _function_3 = (KText it_2) -> {
          DiagramSyntheses.suppressSelectability(it_2);
          this._influenceStyleExtensions.underlineSelectionStyle(it_2);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_3);
      };
      ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle_1, _function_2);
    };
    ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function_1);
    return figure;
  }

  /**
   * Stopwatch figure for deadlines.
   */
  public KRectangle addStopwatchFigure(final KContainerRendering parent) {
    final int size = 12;
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(parent);
    final Procedure1<KRectangle> _function = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      this._kRenderingExtensions.<KRectangle>setPointPlacementData(it, this._kRenderingExtensions.LEFT, 0, 0, this._kRenderingExtensions.TOP, 0, 0, this._kRenderingExtensions.H_LEFT, this._kRenderingExtensions.V_TOP, 0, 0, size, size);
    };
    final KRectangle container = ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function);
    KPosition _createKPosition = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 3, 0.5f, PositionReferenceY.TOP, (-2), 0);
    KPosition _createKPosition_1 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, (-3), 0.5f, PositionReferenceY.TOP, (-2), 0);
    KPolyline _addPolyline = this._kContainerRenderingExtensions.addPolyline(container, 2, 
      Collections.<KPosition>unmodifiableList(CollectionLiterals.<KPosition>newArrayList(_createKPosition, _createKPosition_1)));
    final Procedure1<KPolyline> _function_1 = (KPolyline it) -> {
      this._kRenderingExtensions.setForeground(it, Colors.BROWN);
    };
    ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function_1);
    KPosition _createKPosition_2 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 0, 0.5f, PositionReferenceY.TOP, (-2), 0);
    KPosition _createKPosition_3 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 0, 0.5f, PositionReferenceY.TOP, 1, 0);
    KPolyline _addPolyline_1 = this._kContainerRenderingExtensions.addPolyline(container, 2, 
      Collections.<KPosition>unmodifiableList(CollectionLiterals.<KPosition>newArrayList(_createKPosition_2, _createKPosition_3)));
    final Procedure1<KPolyline> _function_2 = (KPolyline it) -> {
      this._kRenderingExtensions.setForeground(it, Colors.BROWN);
    };
    ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline_1, _function_2);
    KEllipse _addEllipse = this._kContainerRenderingExtensions.addEllipse(container);
    final Procedure1<KEllipse> _function_3 = (KEllipse it) -> {
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setForeground(it, Colors.BROWN);
      this._kRenderingExtensions.<KEllipse>setPointPlacementData(it, this._kRenderingExtensions.LEFT, 0, 0, this._kRenderingExtensions.TOP, 0, 0, this._kRenderingExtensions.H_LEFT, this._kRenderingExtensions.V_TOP, 0, 0, size, size);
      this._influenceStyleExtensions.noSelectionStyle(it);
    };
    final KEllipse body = ObjectExtensions.<KEllipse>operator_doubleArrow(_addEllipse, _function_3);
    KArc _addArc = this._kContainerRenderingExtensions.addArc(body);
    final Procedure1<KArc> _function_4 = (KArc it) -> {
      it.setStartAngle((-20));
      it.setArcAngle(110);
      it.setArcType(Arc.PIE);
      this._kRenderingExtensions.setLineWidth(it, 0);
      this._kRenderingExtensions.setBackground(it, Colors.BROWN);
      this._kRenderingExtensions.<KArc>setPointPlacementData(it, this._kRenderingExtensions.LEFT, 2, 0, this._kRenderingExtensions.TOP, 2, 0, this._kRenderingExtensions.H_LEFT, this._kRenderingExtensions.V_TOP, 2, 2, (size - 4), (size - 4));
      this._influenceStyleExtensions.noSelectionStyle(it);
    };
    ObjectExtensions.<KArc>operator_doubleArrow(_addArc, _function_4);
    return container;
  }

  /**
   * Creates the visual representation of a reactor port.
   */
  public KPolygon addTrianglePort(final KPort port) {
    KPolygon _xblockexpression = null;
    {
      port.setSize(8, 8);
      KPolygon _addPolygon = this._kRenderingExtensions.addPolygon(port);
      final Procedure1<KPolygon> _function = (KPolygon it) -> {
        this._kRenderingExtensions.setLineWidth(it, 1);
        this._influenceStyleExtensions.boldLineSelectionStyle(it);
        this._kRenderingExtensions.setBackground(it, Colors.BLACK);
        EList<KPosition> _points = it.getPoints();
        KPosition _createKPosition = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 0, 0, PositionReferenceY.TOP, 0, 0);
        KPosition _createKPosition_1 = this._kRenderingExtensions.createKPosition(PositionReferenceX.RIGHT, 0, 0, PositionReferenceY.TOP, 0, 0.5f);
        KPosition _createKPosition_2 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 0, 0, PositionReferenceY.BOTTOM, 0, 0);
        Iterables.<KPosition>addAll(_points, Collections.<KPosition>unmodifiableList(CollectionLiterals.<KPosition>newArrayList(_createKPosition, _createKPosition_1, _createKPosition_2)));
      };
      _xblockexpression = ObjectExtensions.<KPolygon>operator_doubleArrow(_addPolygon, _function);
    }
    return _xblockexpression;
  }

  /**
   * Added a text as collapse expand button.
   */
  public KText addTextButton(final KContainerRendering container, final String text) {
    KText _addText = this._kContainerRenderingExtensions.addText(container, text);
    final Procedure1<KText> _function = (KText it) -> {
      this._kRenderingExtensions.setForeground(it, Colors.BLUE);
      this._kRenderingExtensions.setFontSize(it, 8);
      this._influenceStyleExtensions.noSelectionStyle(it);
    };
    return ObjectExtensions.<KText>operator_doubleArrow(_addText, _function);
  }

  /**
   * Creates the triangular line decorator with text.
   */
  public KPolygon addActionDecorator(final KPolyline line, final String text) {
    KPolygon _xblockexpression = null;
    {
      final float size = 18;
      KPolygon _addPolygon = this._kContainerRenderingExtensions.addPolygon(line);
      final Procedure1<KPolygon> _function = (KPolygon it) -> {
        this._kRenderingExtensions.setBackground(it, Colors.WHITE);
        EList<KPosition> _points = it.getPoints();
        KPosition _createKPosition = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 0, 0.5f, PositionReferenceY.TOP, 0, 0);
        KPosition _createKPosition_1 = this._kRenderingExtensions.createKPosition(PositionReferenceX.RIGHT, 0, 0, PositionReferenceY.BOTTOM, 0, 0);
        KPosition _createKPosition_2 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 0, 0, PositionReferenceY.BOTTOM, 0, 0);
        Iterables.<KPosition>addAll(_points, Collections.<KPosition>unmodifiableList(CollectionLiterals.<KPosition>newArrayList(_createKPosition, _createKPosition_1, _createKPosition_2)));
        KDecoratorPlacementData _createKDecoratorPlacementData = this._kRenderingFactory.createKDecoratorPlacementData();
        final Procedure1<KDecoratorPlacementData> _function_1 = (KDecoratorPlacementData it_1) -> {
          it_1.setRelative(0.5f);
          it_1.setAbsolute(((-size) / 2));
          it_1.setWidth(size);
          it_1.setHeight(size);
          it_1.setYOffset(((-size) * 0.66f));
          it_1.setRotateWithLine(true);
        };
        KDecoratorPlacementData _doubleArrow = ObjectExtensions.<KDecoratorPlacementData>operator_doubleArrow(_createKDecoratorPlacementData, _function_1);
        it.setPlacementData(_doubleArrow);
        KText _addText = this._kContainerRenderingExtensions.addText(it, text);
        final Procedure1<KText> _function_2 = (KText it_1) -> {
          this._kRenderingExtensions.setFontSize(it_1, 8);
          this._influenceStyleExtensions.noSelectionStyle(it_1);
          DiagramSyntheses.suppressSelectability(it_1);
          this._kRenderingExtensions.<KText>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, (size * 0.15f), 0.5f, this._kRenderingExtensions.H_CENTRAL, this._kRenderingExtensions.V_CENTRAL, 0, 0, size, size);
        };
        ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_2);
      };
      _xblockexpression = ObjectExtensions.<KPolygon>operator_doubleArrow(_addPolygon, _function);
    }
    return _xblockexpression;
  }

  /**
   * Creates and adds an error message figure
   */
  public KRectangle addErrorMessage(final KNode node, final String title, final String message) {
    KRectangle _addRectangle = this._kRenderingExtensions.addRectangle(node);
    final Procedure1<KRectangle> _function = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      KRoundedRectangle _addRoundedRectangle = this._kContainerRenderingExtensions.addRoundedRectangle(it, 7, 7);
      final Procedure1<KRoundedRectangle> _function_1 = (KRoundedRectangle it_1) -> {
        this._kContainerRenderingExtensions.setGridPlacement(it_1, 1);
        this._kRenderingExtensions.setLineWidth(it_1, 2);
        this._influenceStyleExtensions.noSelectionStyle(it_1);
        if ((title != null)) {
          KText _addText = this._kContainerRenderingExtensions.addText(it_1, title);
          final Procedure1<KText> _function_2 = (KText it_2) -> {
            this._kRenderingExtensions.setFontSize(it_2, 12);
            this._kRenderingExtensions.setFontBold(it_2, true);
            this._kRenderingExtensions.setForeground(it_2, Colors.RED);
            this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it_2), this._kRenderingExtensions.LEFT, 8, 0, this._kRenderingExtensions.TOP, 8, 0), this._kRenderingExtensions.RIGHT, 8, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
            DiagramSyntheses.suppressSelectability(it_2);
            this._influenceStyleExtensions.noSelectionStyle(it_2);
          };
          ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_2);
        }
        if ((message != null)) {
          KText _addText_1 = this._kContainerRenderingExtensions.addText(it_1, message);
          final Procedure1<KText> _function_3 = (KText it_2) -> {
            if ((title != null)) {
              this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it_2), this._kRenderingExtensions.LEFT, 8, 0, this._kRenderingExtensions.TOP, 0, 0), this._kRenderingExtensions.RIGHT, 8, 0, this._kRenderingExtensions.BOTTOM, 4, 0);
            } else {
              this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it_2), this._kRenderingExtensions.LEFT, 8, 0, this._kRenderingExtensions.TOP, 8, 0), this._kRenderingExtensions.RIGHT, 8, 0, this._kRenderingExtensions.BOTTOM, 8, 0);
            }
            this._influenceStyleExtensions.noSelectionStyle(it_2);
          };
          ObjectExtensions.<KText>operator_doubleArrow(_addText_1, _function_3);
        }
      };
      ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function_1);
    };
    return ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function);
  }

  public KRoundedRectangle addCommentFigure(final KNode node, final String message) {
    KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(node, 1, 1, 1);
    final Procedure1<KRoundedRectangle> _function = (KRoundedRectangle it) -> {
      this._kContainerRenderingExtensions.setGridPlacement(it, 1);
      KText _addText = this._kContainerRenderingExtensions.addText(it, message);
      final Procedure1<KText> _function_1 = (KText it_1) -> {
        this._kRenderingExtensions.setFontSize(it_1, 6);
        this._kRenderingExtensions.to(this._kRenderingExtensions.from(this._kRenderingExtensions.setGridPlacementData(it_1), this._kRenderingExtensions.LEFT, 3, 0, this._kRenderingExtensions.TOP, 3, 0), this._kRenderingExtensions.RIGHT, 3, 0, this._kRenderingExtensions.BOTTOM, 3, 0);
        this._influenceStyleExtensions.noSelectionStyle(it_1);
      };
      ObjectExtensions.<KText>operator_doubleArrow(_addText, _function_1);
    };
    return ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function);
  }

  public KPolyline addCommentPolyline(final KEdge edge) {
    KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(edge);
    final Procedure1<KPolyline> _function = (KPolyline it) -> {
      this._kRenderingExtensions.setLineWidth(it, 1);
      this._kRenderingExtensions.setLineStyle(it, LineStyle.DOT);
    };
    return ObjectExtensions.<KPolyline>operator_doubleArrow(_addPolyline, _function);
  }
}
