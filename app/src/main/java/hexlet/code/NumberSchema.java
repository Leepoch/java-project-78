package hexlet.code;

import java.util.Objects;

public class NumberSchema extends BaseSchema<Integer> {
    public NumberSchema required() {
//        addCheck(Objects::isNull);
        required = true;
        return this;
    }

    public NumberSchema positive() {
        addCheck("positive", number -> {
            if (number == null && required) {
                return false;
            } else if (number == null && !required) {
                return true;
            } else {
                return number > 0;
            }
        });
        return this;
    }

    public NumberSchema range(Integer min, Integer max) {
        addCheck("range", number -> number >= min && number <= max);
        return this;
    }
}
