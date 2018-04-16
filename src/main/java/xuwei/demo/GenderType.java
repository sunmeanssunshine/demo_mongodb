package xuwei.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuwei on 2018/4/16.
 */
public enum GenderType {
    Male, Female;

    private static Map<String, GenderType> typeMap = new HashMap<String, GenderType>(2);

    static {
        typeMap.put("Male", Male);
        typeMap.put("Female", Female);
    }

    @JsonCreator
    public static GenderType forValue(String value) {
        if (typeMap.containsKey(value)) {
            return typeMap.get(value);
        } else {
            return null;
        }
    }

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, GenderType> entry : typeMap.entrySet()) {
            if (entry.getValue() == this) {
                if (entry.getValue().equals(GenderType.Male)) {
                    return "男";
                } else {
                    return "女";
                }
            }
        }
        return null;
    }
}
