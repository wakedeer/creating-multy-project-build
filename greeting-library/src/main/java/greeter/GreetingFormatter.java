package greeter;

import static org.apache.commons.lang3.StringUtils.isNoneBlank;

public class GreetingFormatter {
    static String greeting(final String name) {
        return isNoneBlank(name) ? "Hello," + name : "default";
    }
}
