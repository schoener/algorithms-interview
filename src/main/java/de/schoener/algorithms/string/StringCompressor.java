package de.schoener.algorithms.string;

public class StringCompressor {
    public static String compress(String original) {
        char lastChar = original.charAt(0);
        int charCounter = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < original.length(); i++) {
            char currentChar = original.charAt(i);
            if (lastChar == currentChar) {
                charCounter++;
            } else {
                builder.append(lastChar);
                builder.append(charCounter);
                charCounter = 1;
            }
            if (i == original.length() - 1) {
                builder.append(currentChar);
                builder.append(charCounter);
            }
            lastChar = currentChar;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(StringCompressor.compress("ss"));
    }
}
