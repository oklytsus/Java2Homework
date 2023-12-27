package org.softserve.academy;

import java.util.Scanner;

/**
 * 6. Write a method that removes all leading and trailing spaces from a string.
 */
public class SpaceRemoving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Stripped string: " + modifyString(str));
    }

    static String modifyString(String str) {
        return str.strip();

    }
}
