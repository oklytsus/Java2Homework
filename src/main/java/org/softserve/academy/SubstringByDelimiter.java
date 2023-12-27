package org.softserve.academy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 7. Create a method that splits a string into an array of substrings according to a given delimiter.
 */
public class SubstringByDelimiter {
    public static void main(String[] args) {
        String str = "Welcome- /to* /Baeldung";
        String delimiter = "/";
        System.out.println("Arrays: " + Arrays.toString(splitByDelimiter(str, delimiter)));

    }

    static String[] splitByDelimiter(String str, String delimiter) {
        if (delimiter.charAt(0) == '*') {
            return str.split("\\*");
        } else {
            return str.split(delimiter);
        }
    }
}
