package org.softserve.academy;

import java.util.Scanner;

/**
 * 4. Write a method that replaces all occurrences of one substring with another in a given string.
 */
public class SubstringReplacing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your string:");
        String mainString = sc.nextLine();
        System.out.println("Enter substring to replace:");
        String subString = sc.nextLine();
        System.out.println("Enter new substring:");
        String newSubstring = sc.nextLine();
        System.out.println("Modified String:" +modifiedString(mainString,subString,newSubstring));
    }

    private static String modifiedString(String mainString, String subString, String newSubstring) {
        return mainString.replaceAll(subString, newSubstring);
    }
}
