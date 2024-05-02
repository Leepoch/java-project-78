package hexlet.code;

import java.util.ArrayList;
import java.util.List;

public class StringSchema {
    private List<String> validationMethodsNames = new ArrayList<>();
    private Integer argMinLength;
    private String argContains;

    public StringSchema required() {
        validationMethodsNames.add("required");
        return this;
    }

    public StringSchema minLength(Integer minLength) {
        validationMethodsNames.add("minLength");
        argMinLength = minLength;
        return this;
    }

    public StringSchema contains(String substring) {
        validationMethodsNames.add("substring");
        argContains = substring;
        return this;
    }

    public Boolean isValid(String text) {
        for (var methodName : validationMethodsNames) {
            switch (methodName) {
                case "required":
                    if (text == null || text.isEmpty()) {
                        return false;
                    }
                    break;
                case "minLength":
                    if (text.length() < argMinLength) {
                        return false;
                    }
                    break;
                case "substring":
                    if (!text.contains(argContains)) {
                        return false;
                    }
            }
        }
        return true;
    }
}
