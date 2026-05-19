package fr.inria.kairos.influence.export;

import fr.inria.kairos.influence.metamodel.RangeValue;
import fr.inria.kairos.influence.metamodel.ScalarValue;
import fr.inria.kairos.influence.metamodel.ValueSpec;

@SuppressWarnings("all")
public class ValueSpecPrinter {
  public static String label(final ValueSpec v) {
    String _switchResult = null;
    boolean _matched = false;
    if (v instanceof ScalarValue) {
      _matched=true;
      double _value = ((ScalarValue)v).getValue();
      String _xifexpression = null;
      String _unit = ((ScalarValue)v).getUnit();
      boolean _tripleNotEquals = (_unit != null);
      if (_tripleNotEquals) {
        String _unit_1 = ((ScalarValue)v).getUnit();
        _xifexpression = (" " + _unit_1);
      } else {
        _xifexpression = "";
      }
      _switchResult = (Double.valueOf(_value) + _xifexpression);
    }
    if (!_matched) {
      if (v instanceof RangeValue) {
        _matched=true;
        double _lower = ((RangeValue)v).getLower();
        String _plus = ("[" + Double.valueOf(_lower));
        String _plus_1 = (_plus + "..");
        double _upper = ((RangeValue)v).getUpper();
        String _plus_2 = (_plus_1 + Double.valueOf(_upper));
        String _plus_3 = (_plus_2 + "]");
        String _xifexpression = null;
        String _unit = ((RangeValue)v).getUnit();
        boolean _tripleNotEquals = (_unit != null);
        if (_tripleNotEquals) {
          String _unit_1 = ((RangeValue)v).getUnit();
          _xifexpression = (" " + _unit_1);
        } else {
          _xifexpression = "";
        }
        _switchResult = (_plus_3 + _xifexpression);
      }
    }
    if (!_matched) {
      _switchResult = "?";
    }
    return _switchResult;
  }
}
