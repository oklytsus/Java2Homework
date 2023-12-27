package org.softserve.academy;

import java.util.Scanner;

/**
 *1. Write a method that takes two strings and returns true if they are equal, and false otherwise.
 *Consider the possibility of case-sensitive and case-insensitive comparison.
 */
public class StringsComparing
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input 1st string:");
        String str1 = sc.nextLine();
        System.out.println("Input 2nd string:");
        String str2 = sc.nextLine();
        System.out.println("compareStrings: " + compareStrings(str1,str2));
        System.out.println("compareStringsIgnoreCases: " + compareStringsIgnoreCases(str1,str2));

    }
    private static boolean compareStrings(String str1, String str2) {
        int compare = str2.compareTo(str1);
        return compare == 0;
    }
    private static boolean compareStringsIgnoreCases(String str1, String str2) {
        int compare =str1.compareToIgnoreCase(str2);
        return compare == 0;
    }
}
