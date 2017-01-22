package validator.regularexpression.type.Validators;

import android.widget.EditText;

public class OrValidator extends MultiValidator {

    public OrValidator(String message, Validator... validators) {
        super(message, validators);
    }

    public boolean isValid(EditText et) {
        //TODO: What if we've no validators ?
        for (Validator v : validators) {
            if (v.isValid(et)) {
                return true; // Remember :) We're acting like an || operator.
            }
        }
        return false;
    }

}

