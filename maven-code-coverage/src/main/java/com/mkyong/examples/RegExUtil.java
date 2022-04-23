package com.mkyong.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExUtil {
    // Regex to check string
    // contains only digits
    private static final String regex = "[0-9]+";
    // Function to validate URL
    // using regular expression
    public static boolean onlyDigits(String str) {
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }

        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }
}
