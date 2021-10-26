package org.mentalizr.commons;

public class StringHelper {

    public static String linearize(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '\n' || c == '\t') {
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static String limit(String string, int limit) {
        if (limit < 0) throw new IllegalArgumentException("limit smaller than 0: " + limit);

        if (string.length() <= limit) {
            return string;
        } else {
            return string.substring(0, limit);
        }

    }

}
