package hexlet.code.schemas;

import java.util.Map;

public final class MapSchema extends BaseSchema<Map<String, String>> {
    public MapSchema required() {
        required = true;
        return this;
    }

    public MapSchema sizeof(Integer size) {
        addCheck("sizeof", map -> map.size() >= size);
        return this;
    }

    public MapSchema shape(Map<String, BaseSchema<String>> schemas) {
        var entrySchemas = schemas.entrySet();
        for (var entry : entrySchemas) {
            var valueName = entry.getKey();
            var validationObject = entry.getValue();
            addCheck("shape", map -> validatedValue(map, valueName, validationObject));
        }
        return this;
    }

    public Boolean validatedValue(
            Map<String, String> validatedMap,
            String valueName,
            BaseSchema<String> validationObject
    ) {
        var validatedValue = validatedMap.get(valueName);
        return validationObject.isValid(validatedValue);
    }
}
