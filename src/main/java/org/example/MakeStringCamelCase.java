package org.example;

public class MakeStringCamelCase {
    public String makeStringCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNextChar = false;
        input = input.trim();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isWhitespace(currentChar) || currentChar == '_' || currentChar == '-') {
                capitalizeNextChar = true;
            } else {
                if (capitalizeNextChar) {
                    result.append(Character.toUpperCase(currentChar));
                    capitalizeNextChar = false;
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            }
        }
        return result;
    }
}
