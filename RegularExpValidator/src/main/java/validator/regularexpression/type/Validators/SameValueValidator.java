package validator.regularexpression.type.Validators;

import android.text.TextUtils;
import android.widget.EditText;

public class SameValueValidator extends Validator {
    private final EditText otherEditText;

    public SameValueValidator(EditText otherEditText, String errorMessage) {
        super(errorMessage);
        this.otherEditText = otherEditText;
    }

    @Override
    public boolean isValid(EditText editText) {
        return TextUtils.equals(editText.getText(), otherEditText.getText());
    }
}
