package validator.regularexpression.type.Validators;

import android.widget.EditText;

public class FloatNumericRangeValidator extends Validator {

    private int min, max;

    public FloatNumericRangeValidator(String _customErrorMessage, int min, int max) {
        super(_customErrorMessage);
        this.min = min;
        this.max = max;
    }

    public boolean isValid(EditText et) {
        try {
            double value = Double.parseDouble(et.getText().toString());
            return value >= min && value <= max;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
