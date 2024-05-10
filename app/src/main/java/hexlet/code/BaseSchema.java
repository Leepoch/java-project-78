package hexlet.code;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Predicate;

public class BaseSchema<DataType> {
    private Map<String, Predicate<DataType>> checksMap = new HashMap<>();
    public Boolean required = false;

    public void addCheck(String checkName, Predicate<DataType> check) {
        checksMap.put(checkName, check);
    }

    public Boolean isValid(DataType data) {
        if (required && (data == null || data.equals(""))) {
            return false;
        }
        var entryChecks = checksMap.entrySet();
        for (var entry : entryChecks) {
            var check = entry.getValue();
            if (!check.test(data)) {
                return false;
            }
        }
        return true;
    }
}
