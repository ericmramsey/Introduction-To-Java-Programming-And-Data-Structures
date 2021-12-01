/*
    (Pattern matching)
    Write a program that prompts the user to enter two strings and tests whether
    the second string is a substring of the first string. Suppose the neighboring
    characters in the string are distinct. (Don’t use the indexOf method in the String class.)
    Analyze the time complexity of your algorithm. Your algorithm needs to be at least O(n) time.

    @author: Eric Ramsey
    @version: 10/20/2021
 */

import java.util.Scanner;

public class Exercise22_03 {

    public static void main(String[] args) {

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt a user to enter two strings to be compared
        System.out.println("Enter a string s1: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter a string s2: ");
        String s2 = scanner.nextLine();

        // Call stringComparison method and display final output
        stringComparison(s1, s2);

    }
    // Method used to determine if the s2 is a substring of s1
    public static void stringComparison(String s1, String s2) {

        int index = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == s2.charAt(0) && count == 0) {

                index = i;
                count++;

            } else if (s1.charAt(i) == s2.charAt(count)) {

                count++;

            } else {

                count = 0;
                index = -1;

            }
            if (count == s2.length()) {
                break;
            }
        }

        // Conditions have been met and both s1 and s2 have be compared, display final output
        if (index > 1) {

            System.out.println("matched at index " + index);

        } else {

            System.out.println("s2 is not a substring of s1");

        }
    }
}
