package com.java.dsa.string;

public class StringIntro {
    public StringIntro() {
    }

    public static void main(String[] args) {
        StringIntro stringIntro = new StringIntro();
        char[] chars = {'j', 'a', 'v', 'a'};
        String returnValue = stringIntro.charAddFunction(chars);
        System.out.println("Final Output" + returnValue);
    }

    // Here we are change character to string in a function and call it into main class
    public String charAddFunction(char[] chars) {
        return new String(chars);
    }
}
