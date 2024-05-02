package hexlet.code;

import java.util.ArrayList;
import java.util.List;

public class NumberSchema {
    private List<String> validationMethodsNames = new ArrayList<>();
    private Integer minRange;
    private Integer maxRange;

    public NumberSchema required() {
        validationMethodsNames.add("required");
        return this;
    }

    public NumberSchema positive() {
        validationMethodsNames.add("positive");
        return this;
    }

    public NumberSchema range(Integer min, Integer max) {
        validationMethodsNames.add("range");
        minRange = min;
        maxRange = max;
        return this;
    }

    public Boolean isValid(Integer number) {
        for (var methodName : validationMethodsNames) {
            switch (methodName) {
                case "required":
                    if (number == null) {
                        return false;
                    }
                    break;
                case "positive":
                    if (number == null && validationMethodsNames.contains("required")) {
                        return false;
                    } else if (number == null && !validationMethodsNames.contains("required")) {
                        return true;
                    } else if (number <= 0) {
                        return false;
                    }
                    break;
                case "range":
                    if (number < minRange || number > maxRange) {
                        return false;
                    }
            }
        }
        return true;
    }
}
