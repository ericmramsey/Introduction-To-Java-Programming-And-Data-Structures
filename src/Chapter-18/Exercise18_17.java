/*
    (Occurrences of a specified character in an array) Write a recursive method
    that finds the number of occurrences of a specified character in an array. You
    need to define the following two methods. The second one is a recursive helper
    method.

    public static int count(char[] chars, char ch)
    public static int count(char[] chars, char ch, int high)

    Write a test program that prompts the user to enter a list of characters in
    one line, and a character, and displays the number of occurrences of the
    character in the list.

    @author: Eric Ramsey
    @version: 09/19/21
*/

import java.util.Scanner;

public class Exercise18_17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: "); // prompt user for string
        String userInput = scanner.nextLine(); // store user input

        char[] charArray = new char[userInput.length()]; // initialize char[] array
        populateArray(charArray, userInput); // populate the char array with userInput variable elements

        System.out.println("Enter a character: ");
        String character = scanner.next();
        char targetChar = character.charAt(0);

        System.out.println(targetChar + " appears " + count(charArray, targetChar) + " times");

    }
    // Recursive method that finds the number of occurrences of a specified character
    public static int count(char[] chars, char ch) {

        return count(chars, ch, chars.length - 1);

    }
    // Recursive helper method (required for assignment)
    public static int count(char[] chars, char ch, int high) {

        if (high == -1) {

            return 0;

        } else if (chars[high] == ch) {

            return 1 + count(chars, ch, high - 1);

        } else {

            return count(chars, ch, high - 1);

        }
    }
    // Method used to populate array with char elements
    public static void populateArray(char[] array, String userInput) {

        for (int i = 0; i < userInput.length(); i++) {

            array[i] = userInput.charAt(i);

        }
    }
}
