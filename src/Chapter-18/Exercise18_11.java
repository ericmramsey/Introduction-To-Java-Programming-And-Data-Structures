/*
    (Occurrences of a specified character in a string) Write a recursive method
    that finds the number of occurrences of a specified letter in a string.

    For example, count("Welcome", 'e') returns 2. Write a test program that
    prompts the user to enter a string and a character, and displays the number of
    occurrences for the character in the string

    @author: Eric Ramsey
    @version: 09/19/21
*/

import java.util.Scanner;

public class Exercise18_11 {

    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt user for an integer value to be tested
        System.out.println("Enter an integer: ");
        long userNum = scanner.nextLong(); // store user value
        // Output
        System.out.println("The sum of digits in " + userNum + " is " + sumDigits(userNum));

    }
    // Recursive method that computes the sum of the digits and outputs an int value
    public static int sumDigits(long n) {

        if (n == 0) {

            return 0;

        } else {

            return (int) (n % 10) + sumDigits(n / 10);

        }

    }
}
