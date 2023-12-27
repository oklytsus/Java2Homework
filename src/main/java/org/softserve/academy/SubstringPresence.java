package org.softserve.academy;
/**
 * 3. Create a method that checks whether a certain substring is contained in a given string,
 * and returns the index of its first occurrences.
 */
import java.util.Scanner;
public class SubstringPresence {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        String mainString=sc.nextLine();
        System.out.println("Enter the substring:");
        String subString=sc.nextLine();
        if (index(mainString,subString)<0) {
            System.out.println("Substring not found");
        }
        else {
            System.out.println("Index of the first appearance of substring is: " + index(mainString,subString));
        }
    }
    private static int index (String mainString, String subString){
               return mainString.indexOf(subString);
        }

}
