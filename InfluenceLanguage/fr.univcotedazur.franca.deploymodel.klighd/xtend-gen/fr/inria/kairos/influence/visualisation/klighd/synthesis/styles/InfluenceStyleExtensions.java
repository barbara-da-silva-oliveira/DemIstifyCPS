package fr.inria.kairos.influence.visualisation.klighd.synthesis.styles;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KLabel;
import de.cau.cs.kieler.klighd.kgraph.KPort;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KBackground;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KDecoratorPlacementData;
import de.cau.cs.kieler.klighd.krendering.KEllipse;
import de.cau.cs.kieler.klighd.krendering.KForeground;
import de.cau.cs.kieler.klighd.krendering.KLineWidth;
import de.cau.cs.kieler.klighd.krendering.KPolygon;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.KPosition;
import de.cau.cs.kieler.klighd.krendering.KRectangle;
import de.cau.cs.kieler.klighd.krendering.KRendering;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle;
import de.cau.cs.kieler.klighd.krendering.KSpline;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.Underline;
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceX;
import de.cau.cs.kieler.klighd.krendering.extensions.PositionReferenceY;
import de.cau.cs.kieler.klighd.labels.decoration.IDecoratorRenderingProvider;
import de.cau.cs.kieler.klighd.labels.decoration.ITextRenderingProvider;
import de.cau.cs.kieler.klighd.labels.decoration.LabelDecorationConfigurator;
import fr.inria.kairos.influence.visualisation.klighd.synthesis.AbstractSynthesisExtensions;
import java.util.Collections;
import org.eclipse.elk.core.math.ElkPadding;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Extension class that provides styles and coloring for the Lingua France diagram synthesis.
 * 
 * @author{Alexander Schulz-Rosengarten <als@informatik.uni-kiel.de>}
 */
@ViewSynthesisShared
@SuppressWarnings("all")
public class InfluenceStyleExtensions extends AbstractSynthesisExtensions {
  private static final Property<Colors> LABEL_PARENT_BACKGROUND = new Property<Colors>("org.lflang.linguafranca.diagram.synthesis.styles.label.parent.background", Colors.WHITE);

  @Inject
  @Extension
  private KRenderingExtensions _kRenderingExtensions;

  @Inject
  @Extension
  private KContainerRenderingExtensions _kContainerRenderingExtensions;

  @Inject
  @Extension
  private KPolylineExtensions _kPolylineExtensions;

  @Extension
  private KRenderingFactory _kRenderingFactory = KRenderingFactory.eINSTANCE;

  public KRendering noSelectionStyle(final KRendering r) {
    return this._kRenderingExtensions.setSelectionTextStrikeout(r, false);
  }

  public KRendering underlineSelectionStyle(final KRendering r) {
    return this._kRenderingExtensions.setSelectionTextUnderline(r, Underline.SINGLE);
  }

  public KRendering boldLineSelectionStyle(final KRendering r) {
    float _lineWidthValue = this._kRenderingExtensions.getLineWidthValue(r);
    float _multiply = (_lineWidthValue * 2);
    return this._kRenderingExtensions.setSelectionLineWidth(r, _multiply);
  }

  public KText boldTextSelectionStyle(final KText t) {
    return this._kRenderingExtensions.setSelectionFontBold(t, true);
  }

  public void errorStyle(final KRendering r) {
    this._kRenderingExtensions.setForeground(r, Colors.RED);
    this._kRenderingExtensions.setLineWidth(r, 2);
    this._kRenderingExtensions.setSelectionLineWidth(r, 3);
    if (((r.eContainer() instanceof KEdge) || (r.eContainer() instanceof KPort))) {
      this._kRenderingExtensions.setBackground(r, Colors.RED);
      KBackground _background = this._kRenderingExtensions.getBackground(r);
      _background.setPropagateToChildren(true);
      KForeground _foreground = this._kRenderingExtensions.getForeground(r);
      _foreground.setPropagateToChildren(true);
      KLineWidth _lineWidth = this._kRenderingExtensions.getLineWidth(r);
      _lineWidth.setPropagateToChildren(true);
    }
  }

  public void commentStyle(final KRendering r) {
    this._kRenderingExtensions.setForeground(r, Colors.LIGHT_GOLDENROD);
    this._kRenderingExtensions.setBackground(r, Colors.PALE_GOLDENROD);
    this._kRenderingExtensions.setLineWidth(r, 1);
    this._kRenderingExtensions.setSelectionLineWidth(r, 2);
    EObject _eContainer = r.eContainer();
    if ((_eContainer instanceof KEdge)) {
      this._kRenderingExtensions.setBackground(r, Colors.LIGHT_GOLDENROD);
      KBackground _background = this._kRenderingExtensions.getBackground(r);
      _background.setPropagateToChildren(true);
      KForeground _foreground = this._kRenderingExtensions.getForeground(r);
      _foreground.setPropagateToChildren(true);
      KLineWidth _lineWidth = this._kRenderingExtensions.getLineWidth(r);
      _lineWidth.setPropagateToChildren(true);
    }
  }

  private static final int CLOUD_WIDTH = 20;

  public KContainerRendering addCloudIcon(final KContainerRendering parent) {
    KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(parent);
    final Procedure1<KRectangle> _function = (KRectangle it) -> {
      this._kRenderingExtensions.setInvisible(it, true);
      KRoundedRectangle _addRoundedRectangle = this._kContainerRenderingExtensions.addRoundedRectangle(it, (InfluenceStyleExtensions.CLOUD_WIDTH / 7), (InfluenceStyleExtensions.CLOUD_WIDTH / 7));
      final Procedure1<KRoundedRectangle> _function_1 = (KRoundedRectangle it_1) -> {
        this._kRenderingExtensions.setBackground(it_1, Colors.GRAY);
        this._kRenderingExtensions.setForeground(it_1, Colors.GRAY);
        this._kRenderingExtensions.<KRoundedRectangle>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 2, 0, this._kRenderingExtensions.TOP, 0, 0.5f, this._kRenderingExtensions.H_LEFT, this._kRenderingExtensions.V_TOP, 0, 0, InfluenceStyleExtensions.CLOUD_WIDTH, (InfluenceStyleExtensions.CLOUD_WIDTH / 3));
      };
      ObjectExtensions.<KRoundedRectangle>operator_doubleArrow(_addRoundedRectangle, _function_1);
      KEllipse _addEllipse = this._kContainerRenderingExtensions.addEllipse(it);
      final Procedure1<KEllipse> _function_2 = (KEllipse it_1) -> {
        this._kRenderingExtensions.setBackground(it_1, Colors.GRAY);
        this._kRenderingExtensions.setForeground(it_1, Colors.GRAY);
        this._kRenderingExtensions.<KEllipse>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0f, this._kRenderingExtensions.TOP, 0, 0.38f, this._kRenderingExtensions.H_LEFT, this._kRenderingExtensions.V_TOP, 0, 0, (InfluenceStyleExtensions.CLOUD_WIDTH / 2.5f), (InfluenceStyleExtensions.CLOUD_WIDTH / 2.5f));
      };
      ObjectExtensions.<KEllipse>operator_doubleArrow(_addEllipse, _function_2);
      KEllipse _addEllipse_1 = this._kContainerRenderingExtensions.addEllipse(it);
      final Procedure1<KEllipse> _function_3 = (KEllipse it_1) -> {
        this._kRenderingExtensions.setBackground(it_1, Colors.GRAY);
        this._kRenderingExtensions.setForeground(it_1, Colors.GRAY);
        this._kRenderingExtensions.<KEllipse>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.5f, this._kRenderingExtensions.TOP, 0, 0.25f, this._kRenderingExtensions.H_RIGHT, this._kRenderingExtensions.V_TOP, 0, 0, (InfluenceStyleExtensions.CLOUD_WIDTH / 3f), (InfluenceStyleExtensions.CLOUD_WIDTH / 3f));
      };
      ObjectExtensions.<KEllipse>operator_doubleArrow(_addEllipse_1, _function_3);
      KEllipse _addEllipse_2 = this._kContainerRenderingExtensions.addEllipse(it);
      final Procedure1<KEllipse> _function_4 = (KEllipse it_1) -> {
        this._kRenderingExtensions.setBackground(it_1, Colors.GRAY);
        this._kRenderingExtensions.setForeground(it_1, Colors.GRAY);
        this._kRenderingExtensions.<KEllipse>setPointPlacementData(it_1, this._kRenderingExtensions.LEFT, 0, 0.4f, this._kRenderingExtensions.TOP, (InfluenceStyleExtensions.CLOUD_WIDTH / 10), 0, this._kRenderingExtensions.H_LEFT, this._kRenderingExtensions.V_TOP, 0, 0, (InfluenceStyleExtensions.CLOUD_WIDTH / 2), (InfluenceStyleExtensions.CLOUD_WIDTH / 2));
      };
      ObjectExtensions.<KEllipse>operator_doubleArrow(_addEllipse_2, _function_4);
    };
    return ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function);
  }

  public KRendering addCloudUploadIcon(final KContainerRendering parent) {
    KContainerRendering _addCloudIcon = this.addCloudIcon(parent);
    final Procedure1<KContainerRendering> _function = (KContainerRendering it) -> {
      KPolygon _addPolygon = this._kContainerRenderingExtensions.addPolygon(it);
      final Procedure1<KPolygon> _function_1 = (KPolygon it_1) -> {
        this._kRenderingExtensions.setBackground(it_1, Colors.WHITE);
        this._kRenderingExtensions.setForeground(it_1, Colors.WHITE);
        EList<KPosition> _points = it_1.getPoints();
        KPosition _createKPosition = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, (-1.5f), 0.5f, PositionReferenceY.TOP, (InfluenceStyleExtensions.CLOUD_WIDTH / 3), 0.5f);
        KPosition _createKPosition_1 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, (-1.5f), 0.5f, PositionReferenceY.TOP, 0, 0.58f);
        KPosition _createKPosition_2 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, (-4), 0.5f, PositionReferenceY.TOP, 0, 0.58f);
        KPosition _createKPosition_3 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 0, 0.5f, PositionReferenceY.TOP, 0, 0.35f);
        KPosition _createKPosition_4 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 4, 0.5f, PositionReferenceY.TOP, 0, 0.58f);
        KPosition _createKPosition_5 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 1.5f, 0.5f, PositionReferenceY.TOP, 0, 0.58f);
        KPosition _createKPosition_6 = this._kRenderingExtensions.createKPosition(PositionReferenceX.LEFT, 1.5f, 0.5f, PositionReferenceY.TOP, (InfluenceStyleExtensions.CLOUD_WIDTH / 3), 0.5f);
        Iterables.<KPosition>addAll(_points, Collections.<KPosition>unmodifiableList(CollectionLiterals.<KPosition>newArrayList(_createKPosition, _createKPosition_1, _createKPosition_2, _createKPosition_3, _createKPosition_4, _createKPosition_5, _createKPosition_6)));
      };
      ObjectExtensions.<KPolygon>operator_doubleArrow(_addPolygon, _function_1);
    };
    return ObjectExtensions.<KContainerRendering>operator_doubleArrow(_addCloudIcon, _function);
  }

  private static LabelDecorationConfigurator _onEdgeLabelConfigurator;

  public void applyOnEdgeStyle(final KLabel label) {
    if ((InfluenceStyleExtensions._onEdgeLabelConfigurator == null)) {
      final ITextRenderingProvider _function = (KContainerRendering container, KLabel klabel) -> {
        KText _xblockexpression = null;
        {
          final KText kText = this._kRenderingFactory.createKText();
          this._kRenderingExtensions.setFontSize(kText, 9);
          EList<KRendering> _children = container.getChildren();
          _children.add(kText);
          _xblockexpression = kText;
        }
        return _xblockexpression;
      };
      InfluenceStyleExtensions._onEdgeLabelConfigurator = LabelDecorationConfigurator.create().withInlineLabels(true).withLabelTextRenderingProvider(_function);
    }
    InfluenceStyleExtensions._onEdgeLabelConfigurator.applyTo(label);
  }

  private static LabelDecorationConfigurator _onEdgeDelayLabelConfigurator;

  public void applyOnEdgeDelayStyle(final KLabel label) {
    if ((InfluenceStyleExtensions._onEdgeDelayLabelConfigurator == null)) {
      final ITextRenderingProvider _function = (KContainerRendering container, KLabel klabel) -> {
        KText _xblockexpression = null;
        {
          final KText kText = this._kRenderingFactory.createKText();
          this._kRenderingExtensions.setFontSize(kText, 8);
          this.boldTextSelectionStyle(kText);
          kText.<Object>setProperty(KlighdInternalProperties.MODEL_ELEMEMT, klabel.<Object>getProperty(KlighdInternalProperties.MODEL_ELEMEMT));
          EList<KRendering> _children = container.getChildren();
          _children.add(kText);
          _xblockexpression = kText;
        }
        return _xblockexpression;
      };
      LabelDecorationConfigurator _withLabelTextRenderingProvider = LabelDecorationConfigurator.create().withInlineLabels(true).withLabelTextRenderingProvider(_function);
      InfluenceStyleExtensions._onEdgeDelayLabelConfigurator = _withLabelTextRenderingProvider.addDecoratorRenderingProvider(new IDecoratorRenderingProvider() {
        @Override
        public ElkPadding createDecoratorRendering(final KContainerRendering container, final KLabel label, final LabelDecorationConfigurator.LayoutMode layoutMode) {
          final ElkPadding padding = new ElkPadding();
          padding.left = 2;
          padding.right = 2;
          padding.bottom = Math.max(padding.bottom, 1);
          EList<KRendering> _children = container.getChildren();
          KPolygon _createKPolygon = InfluenceStyleExtensions.this._kRenderingFactory.createKPolygon();
          final Procedure1<KPolygon> _function = (KPolygon it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, (-2), 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 2, 0, PositionReferenceY.TOP, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, (-2), 0, PositionReferenceY.TOP, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 2, 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.setBackground(it, Colors.WHITE);
            InfluenceStyleExtensions.this._kRenderingExtensions.setForeground(it, Colors.WHITE);
          };
          KPolygon _doubleArrow = ObjectExtensions.<KPolygon>operator_doubleArrow(_createKPolygon, _function);
          _children.add(_doubleArrow);
          EList<KRendering> _children_1 = container.getChildren();
          KPolyline _createKPolyline = InfluenceStyleExtensions.this._kRenderingFactory.createKPolyline();
          final Procedure1<KPolyline> _function_1 = (KPolyline it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, (-2), 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 2, 0, PositionReferenceY.TOP, 0, 0);
          };
          KPolyline _doubleArrow_1 = ObjectExtensions.<KPolyline>operator_doubleArrow(_createKPolyline, _function_1);
          _children_1.add(_doubleArrow_1);
          EList<KRendering> _children_2 = container.getChildren();
          KPolyline _createKPolyline_1 = InfluenceStyleExtensions.this._kRenderingFactory.createKPolyline();
          final Procedure1<KPolyline> _function_2 = (KPolyline it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.RIGHT, 2, 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, (-2), 0, PositionReferenceY.TOP, 0, 0);
          };
          KPolyline _doubleArrow_2 = ObjectExtensions.<KPolyline>operator_doubleArrow(_createKPolyline_1, _function_2);
          _children_2.add(_doubleArrow_2);
          return padding;
        }
      });
    }
    InfluenceStyleExtensions._onEdgeDelayLabelConfigurator.applyTo(label);
  }

  private static LabelDecorationConfigurator _onEdgePysicalDelayLabelConfigurator;

  public void applyOnEdgePysicalDelayStyle(final KLabel label, final Colors parentBackgroundColor) {
    if ((InfluenceStyleExtensions._onEdgePysicalDelayLabelConfigurator == null)) {
      final ITextRenderingProvider _function = (KContainerRendering container, KLabel klabel) -> {
        KText _xblockexpression = null;
        {
          final KText kText = this._kRenderingFactory.createKText();
          this._kRenderingExtensions.setFontSize(kText, 8);
          this.boldTextSelectionStyle(kText);
          kText.<Object>setProperty(KlighdInternalProperties.MODEL_ELEMEMT, klabel.<Object>getProperty(KlighdInternalProperties.MODEL_ELEMEMT));
          EList<KRendering> _children = container.getChildren();
          _children.add(kText);
          _xblockexpression = kText;
        }
        return _xblockexpression;
      };
      LabelDecorationConfigurator _withLabelTextRenderingProvider = LabelDecorationConfigurator.create().withInlineLabels(true).withLabelTextRenderingProvider(_function);
      InfluenceStyleExtensions._onEdgePysicalDelayLabelConfigurator = _withLabelTextRenderingProvider.addDecoratorRenderingProvider(new IDecoratorRenderingProvider() {
        @Override
        public ElkPadding createDecoratorRendering(final KContainerRendering container, final KLabel label, final LabelDecorationConfigurator.LayoutMode layoutMode) {
          final ElkPadding padding = new ElkPadding();
          padding.left = 8;
          padding.right = 16;
          padding.bottom = Math.max(padding.bottom, 1);
          EList<KRendering> _children = container.getChildren();
          KPolygon _createKPolygon = InfluenceStyleExtensions.this._kRenderingFactory.createKPolygon();
          final Procedure1<KPolygon> _function = (KPolygon it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, 0, 0, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0, PositionReferenceY.TOP, 1, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 0, 0, PositionReferenceY.TOP, 1, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 0, 0, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.setBackground(it, label.<Colors>getProperty(InfluenceStyleExtensions.LABEL_PARENT_BACKGROUND));
            InfluenceStyleExtensions.this._kRenderingExtensions.setForeground(it, label.<Colors>getProperty(InfluenceStyleExtensions.LABEL_PARENT_BACKGROUND));
          };
          KPolygon _doubleArrow = ObjectExtensions.<KPolygon>operator_doubleArrow(_createKPolygon, _function);
          _children.add(_doubleArrow);
          EList<KRendering> _children_1 = container.getChildren();
          KSpline _createKSpline = InfluenceStyleExtensions.this._kRenderingFactory.createKSpline();
          final Procedure1<KSpline> _function_1 = (KSpline it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, (-0.66f), 0, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 1, 0, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 3, 0, PositionReferenceY.BOTTOM, 8, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 5, 0, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 5.5f, 0, PositionReferenceY.BOTTOM, (-1.5f), 0.5f);
          };
          KSpline _doubleArrow_1 = ObjectExtensions.<KSpline>operator_doubleArrow(_createKSpline, _function_1);
          _children_1.add(_doubleArrow_1);
          EList<KRendering> _children_2 = container.getChildren();
          KSpline _createKSpline_1 = InfluenceStyleExtensions.this._kRenderingFactory.createKSpline();
          final Procedure1<KSpline> _function_2 = (KSpline it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.RIGHT, 15f, 0, PositionReferenceY.BOTTOM, 3.5f, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 14f, 0, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 11, 0, PositionReferenceY.BOTTOM, (-8), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 9, 0, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 7, 0, PositionReferenceY.BOTTOM, 8, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 4f, 0, PositionReferenceY.BOTTOM, 2, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 1.5f, 0, PositionReferenceY.BOTTOM, 0.5f, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 0.2f, 0, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, (-0.7f), 0, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
          };
          KSpline _doubleArrow_2 = ObjectExtensions.<KSpline>operator_doubleArrow(_createKSpline_1, _function_2);
          _children_2.add(_doubleArrow_2);
          EList<KRendering> _children_3 = container.getChildren();
          KPolygon _createKPolygon_1 = InfluenceStyleExtensions.this._kRenderingFactory.createKPolygon();
          final Procedure1<KPolygon> _function_3 = (KPolygon it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, 4, 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 8, 0, PositionReferenceY.TOP, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 12, 0, PositionReferenceY.TOP, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 16, 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.setBackground(it, Colors.WHITE);
            InfluenceStyleExtensions.this._kRenderingExtensions.setForeground(it, Colors.WHITE);
          };
          KPolygon _doubleArrow_3 = ObjectExtensions.<KPolygon>operator_doubleArrow(_createKPolygon_1, _function_3);
          _children_3.add(_doubleArrow_3);
          EList<KRendering> _children_4 = container.getChildren();
          KPolyline _createKPolyline = InfluenceStyleExtensions.this._kRenderingFactory.createKPolyline();
          final Procedure1<KPolyline> _function_4 = (KPolyline it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, 4, 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 8, 0, PositionReferenceY.TOP, 0, 0);
          };
          KPolyline _doubleArrow_4 = ObjectExtensions.<KPolyline>operator_doubleArrow(_createKPolyline, _function_4);
          _children_4.add(_doubleArrow_4);
          EList<KRendering> _children_5 = container.getChildren();
          KPolyline _createKPolyline_1 = InfluenceStyleExtensions.this._kRenderingFactory.createKPolyline();
          final Procedure1<KPolyline> _function_5 = (KPolyline it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.RIGHT, 16, 0, PositionReferenceY.BOTTOM, 0, 0);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 12, 0, PositionReferenceY.TOP, 0, 0);
          };
          KPolyline _doubleArrow_5 = ObjectExtensions.<KPolyline>operator_doubleArrow(_createKPolyline_1, _function_5);
          _children_5.add(_doubleArrow_5);
          return padding;
        }
      });
    }
    label.<Colors>setProperty(InfluenceStyleExtensions.LABEL_PARENT_BACKGROUND, parentBackgroundColor);
    InfluenceStyleExtensions._onEdgePysicalDelayLabelConfigurator.applyTo(label);
  }

  private static LabelDecorationConfigurator _onEdgePysicalLabelConfigurator;

  public void applyOnEdgePysicalStyle(final KLabel label, final Colors parentBackgroundColor) {
    if ((InfluenceStyleExtensions._onEdgePysicalLabelConfigurator == null)) {
      final ITextRenderingProvider _function = (KContainerRendering container, KLabel klabel) -> {
        KText _xblockexpression = null;
        {
          final KText kText = this._kRenderingFactory.createKText();
          this._kRenderingExtensions.setInvisible(kText, true);
          EList<KRendering> _children = container.getChildren();
          _children.add(kText);
          _xblockexpression = kText;
        }
        return _xblockexpression;
      };
      LabelDecorationConfigurator _withLabelTextRenderingProvider = LabelDecorationConfigurator.create().withInlineLabels(true).withLabelTextRenderingProvider(_function);
      InfluenceStyleExtensions._onEdgePysicalLabelConfigurator = _withLabelTextRenderingProvider.addDecoratorRenderingProvider(new IDecoratorRenderingProvider() {
        @Override
        public ElkPadding createDecoratorRendering(final KContainerRendering container, final KLabel label, final LabelDecorationConfigurator.LayoutMode layoutMode) {
          final ElkPadding padding = new ElkPadding();
          padding.left = 3;
          padding.right = 3;
          padding.bottom = Math.max(padding.bottom, 1);
          EList<KRendering> _children = container.getChildren();
          KPolygon _createKPolygon = InfluenceStyleExtensions.this._kRenderingFactory.createKPolygon();
          final Procedure1<KPolygon> _function = (KPolygon it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, 0, 0, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0, PositionReferenceY.TOP, 1, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 0, 0, PositionReferenceY.TOP, 1, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.RIGHT, 0, 0, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.setBackground(it, label.<Colors>getProperty(InfluenceStyleExtensions.LABEL_PARENT_BACKGROUND));
            InfluenceStyleExtensions.this._kRenderingExtensions.setForeground(it, label.<Colors>getProperty(InfluenceStyleExtensions.LABEL_PARENT_BACKGROUND));
          };
          KPolygon _doubleArrow = ObjectExtensions.<KPolygon>operator_doubleArrow(_createKPolygon, _function);
          _children.add(_doubleArrow);
          EList<KRendering> _children_1 = container.getChildren();
          KSpline _createKSpline = InfluenceStyleExtensions.this._kRenderingFactory.createKSpline();
          final Procedure1<KSpline> _function_1 = (KSpline it) -> {
            InfluenceStyleExtensions.this._kRenderingExtensions.from(it, PositionReferenceX.LEFT, (-0.66f), 0, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 1, 0, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.1f, PositionReferenceY.BOTTOM, 8, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.2f, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.3f, PositionReferenceY.BOTTOM, (-8), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.4f, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.45f, PositionReferenceY.BOTTOM, 4f, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.5f, PositionReferenceY.BOTTOM, 8, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.55f, PositionReferenceY.BOTTOM, 4f, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.6f, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.65f, PositionReferenceY.BOTTOM, (-4), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.7f, PositionReferenceY.BOTTOM, (-8), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.8f, PositionReferenceY.BOTTOM, (-4), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0, 0.9f, PositionReferenceY.BOTTOM, 0, 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, (-1), 1, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
            InfluenceStyleExtensions.this._kRenderingExtensions.to(it, PositionReferenceX.LEFT, 0.66f, 1, PositionReferenceY.BOTTOM, (-0.5f), 0.5f);
          };
          KSpline _doubleArrow_1 = ObjectExtensions.<KSpline>operator_doubleArrow(_createKSpline, _function_1);
          _children_1.add(_doubleArrow_1);
          return padding;
        }
      });
    }
    label.<Colors>setProperty(InfluenceStyleExtensions.LABEL_PARENT_BACKGROUND, parentBackgroundColor);
    InfluenceStyleExtensions._onEdgePysicalLabelConfigurator.applyTo(label);
  }

  public KRendering addFixedTailArrowDecorator(final KPolyline pl) {
    final KRendering head = this._kPolylineExtensions.addTailArrowDecorator(pl);
    KDecoratorPlacementData _createKDecoratorPlacementData = this._kRenderingFactory.createKDecoratorPlacementData();
    final Procedure1<KDecoratorPlacementData> _function = (KDecoratorPlacementData it) -> {
      it.setRotateWithLine(true);
      it.setRelative(0f);
      it.setAbsolute(2f);
      it.setWidth(8);
      it.setHeight(6);
      it.setXOffset((-3f));
      it.setYOffset((-4f));
    };
    KDecoratorPlacementData _doubleArrow = ObjectExtensions.<KDecoratorPlacementData>operator_doubleArrow(_createKDecoratorPlacementData, _function);
    head.setPlacementData(_doubleArrow);
    return head;
  }

  public void addArrayDecorator(final KEdge edge, final Integer size) {
    final KRendering line = this._kRenderingExtensions.getKRendering(edge);
    if ((line instanceof KPolyline)) {
      KDecoratorPlacementData _createKDecoratorPlacementData = this._kRenderingFactory.createKDecoratorPlacementData();
      final Procedure1<KDecoratorPlacementData> _function = (KDecoratorPlacementData it) -> {
        it.setRotateWithLine(true);
        it.setRelative(0f);
        it.setAbsolute(6f);
      };
      final KDecoratorPlacementData placement = ObjectExtensions.<KDecoratorPlacementData>operator_doubleArrow(_createKDecoratorPlacementData, _function);
      KPolyline _addChild = this._kContainerRenderingExtensions.<KPolyline>addChild(((KContainerRendering)line), this._kRenderingFactory.createKPolyline());
      final Procedure1<KPolyline> _function_1 = (KPolyline it) -> {
        EList<KPosition> _points = it.getPoints();
        KPosition _createKPosition = this._kRenderingExtensions.createKPosition(this._kRenderingExtensions.RIGHT, 0, 0, this._kRenderingExtensions.TOP, 0, 0);
        _points.add(_createKPosition);
        EList<KPosition> _points_1 = it.getPoints();
        KPosition _createKPosition_1 = this._kRenderingExtensions.createKPosition(this._kRenderingExtensions.LEFT, 0, 0, this._kRenderingExtensions.BOTTOM, 0, 0);
        _points_1.add(_createKPosition_1);
      };
      final KPolyline slash = ObjectExtensions.<KPolyline>operator_doubleArrow(_addChild, _function_1);
      KDecoratorPlacementData _copy = EcoreUtil.<KDecoratorPlacementData>copy(placement);
      final Procedure1<KDecoratorPlacementData> _function_2 = (KDecoratorPlacementData it) -> {
        it.setWidth(5);
        it.setHeight(10);
        it.setYOffset((-5f));
      };
      KDecoratorPlacementData _doubleArrow = ObjectExtensions.<KDecoratorPlacementData>operator_doubleArrow(_copy, _function_2);
      slash.setPlacementData(_doubleArrow);
      if ((size != null)) {
        KText _addChild_1 = this._kContainerRenderingExtensions.<KText>addChild(((KContainerRendering)line), this._kRenderingFactory.createKText());
        final Procedure1<KText> _function_3 = (KText it) -> {
          it.setText(size.toString());
          this._kRenderingExtensions.setFontSize(it, 5);
          this.noSelectionStyle(it);
        };
        final KText num = ObjectExtensions.<KText>operator_doubleArrow(_addChild_1, _function_3);
        KDecoratorPlacementData _copy_1 = EcoreUtil.<KDecoratorPlacementData>copy(placement);
        final Procedure1<KDecoratorPlacementData> _function_4 = (KDecoratorPlacementData it) -> {
          it.setXOffset(2f);
        };
        KDecoratorPlacementData _doubleArrow_1 = ObjectExtensions.<KDecoratorPlacementData>operator_doubleArrow(_copy_1, _function_4);
        num.setPlacementData(_doubleArrow_1);
      }
    }
  }
}
