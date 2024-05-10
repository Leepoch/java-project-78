package hexlet.code;

public class StringSchema extends BaseSchema<String> {
    public StringSchema required() {
//        addCheck(text -> text == null || text.isEmpty());
        required = true;
        return this;
    }

    public StringSchema minLength(Integer minLength) {
        addCheck("minLength", text -> text.length() > minLength);
        return this;
    }

    public StringSchema contains(String substring) {
        addCheck("contains", text -> text.contains(substring));
        return this;
    }
}
