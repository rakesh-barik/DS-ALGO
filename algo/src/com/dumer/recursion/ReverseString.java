package com.dumer.recursion;

/**
 * Created by rakesh.barik on 08-03-2016.
 */
public class ReverseString {
    public static void main(String arg[]){

        String example = "Rakesh";
        for(int i=0;i<=example.length();i++) {
            System.out.println(example.substring(1) + example.charAt(0));
        }
        //String reversedString = reverseMyString(example);
        //System.out.println(reversedString);
    }

    private static String reverseMyString(String example) {
        //strategy case to handle one char string and empty string
        if (example.length() < 2) {
            return example;
        }
        return reverseMyString(example.substring(1)) + example.charAt(0);
    }
}
