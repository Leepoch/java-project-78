package hexlet.code;

import java.util.ArrayList;
import java.util.List;

public class BaseSchema<DataType>{
    private List<String> validationMethodsNames = new ArrayList<>();

    public Boolean isValid(DataType data) {
        for (var methodName : validationMethodsNames) {

        }
        return true;
    }
}
