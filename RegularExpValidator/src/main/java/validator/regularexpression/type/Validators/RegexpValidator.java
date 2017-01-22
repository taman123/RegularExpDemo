package validator.regularexpression.type.Validators;

import java.util.regex.Pattern;

public class RegexpValidator extends PatternValidator {
    public RegexpValidator(String message, String _regexp) {
        super(message, Pattern.compile(_regexp));
    }
}
