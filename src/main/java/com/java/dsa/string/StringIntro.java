package com.java.dsa.string;

public class StringIntro {
    public StringIntro() {
    }

    public static void main(String[] args) {
        StringIntro stringIntro = new StringIntro();
        char[] chars = {'j', 'a', 'v', 'a'};
        String returnValue = stringIntro.charAddFunction(chars);
        System.out.println("Final Output " + returnValue);
        String reverseString = reverseString(returnValue);
        System.out.println("Reverse String " + reverseString);
        System.out.println(reverseStringShort(reverseString));
    }

    // Here we are change character to string in a function and call it into main class
    public String charAddFunction(char[] chars) {
        return new String(chars);
    }

    // Here we are reverse string using recursion
    static String reverseString(final String input) {
        // recursive termination
        if (input.length() <= 1)
            return input;
        final char firstChar = input.charAt(0);
        final String remaining = input.substring(1);
        // recursive descent
        return reverseString(remaining) + firstChar;
    }

    // Short code for recursion string reverse
    static String reverseStringShort(final String input) {
        return input.length() <= 1 ? input :
                reverseStringShort(input.substring(1)) + input.charAt(0);
    }

    static int countSubstrings(final String input, final String valueToFind) {
        // recursive termination
        if (input.length() < valueToFind.length())
            return 0;
        int count;
        String remaining;
        // does the text start with the search string?
        if (input.startsWith(valueToFind)) {
            remaining = input.substring(valueToFind.length());
            count = 1;
        } else {
            // remove first character and search again
            remaining = input.substring(1);
            count = 0;
        }
        // recursive descent
        return countSubstrings(remaining, valueToFind) + count;
    }
}
