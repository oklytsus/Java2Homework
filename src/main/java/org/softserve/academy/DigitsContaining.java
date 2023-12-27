package org.softserve.academy;

import java.util.Scanner;

/**
 * 5. Implement a method that determines whether a string contains digits,
 * and returns true or false accordingly.
 */
public class DigitsContaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Check for digits presence: " + checkForDigits(str));

    }
    static boolean checkForDigits(String str){
        boolean checker=false;
        for (char c:str.toCharArray()) {
            if (Character.isDigit(c)){
                checker=true;
                break;
            }
        }
        return checker;
    }
}
