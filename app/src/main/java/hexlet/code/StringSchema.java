package hexlet.code;

import java.util.List;

public class StringSchema {
    private List<String> validationMethodsNames;
    private String text;
    private Boolean isValid;

    public void required() {
        validationMethodsNames.add("required");
    }

    public void minLength(Integer minLength) {
        validationMethodsNames.add("minLength");
    }

    public void contains(String substring) {
        validationMethodsNames.add("contains");
    }

    public Boolean isValid(String text) {
        for (var methodName : validationMethodsNames) {

        }
        return true;
    }
}
