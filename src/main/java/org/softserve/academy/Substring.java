package org.softserve.academy;

/**
 * 2. Implement a method that takes a string and two indices,
 * and returns the substring that is contained between those indices.
 */
import java.util.Scanner;
public class Substring {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input your string:");
        String str1 = sc.nextLine();
        System.out.println("Enter start index:");
        int startIndex= sc.nextInt();
        System.out.println("Enter end index:");
        int endIndex= sc.nextInt();
        System.out.println("Substring: " + subString(str1,startIndex,endIndex));
    }
    private static String subString(String str1, int startIndex, int endIndex) {
        return str1.substring(startIndex,endIndex);
    };
}
