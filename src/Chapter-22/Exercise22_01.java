/*
    (Maximum consecutive increasingly ordered substring)
    Write a program that prompts the user to enter a string and
    displays the maximum consecutive increasingly ordered substring.
    Analyze the time complexity of your program.

    @author: Eric Ramsey
    @version: 10/20/2021
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise22_01 {

    public static void main(String[] args) {

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Created two LinkedList to store and compare user information
        LinkedList<Character> maxConsecutiveNums = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        // Prompt user for String
        System.out.println("Enter a string: ");
        String userString = scanner.nextLine(); // Store user String

        maxConsecutiveOrder(maxConsecutiveNums, list, userString); // call maxConsecutiveOrder method
        displayMaxListElements(maxConsecutiveNums); // Display the final output

    }
    // Method used to determine the maximum consecutive increasingly order
    public static void maxConsecutiveOrder(LinkedList<Character> max, LinkedList<Character> list, String string) {

        for (int i = 0; i < string.length(); i++) {

            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {

                list.clear();

            }
            list.add(string.charAt(i));

            if (list.size() > max.size()) {

                max.clear();
                max.addAll(list);

            }
        }
    }
    // Method used to display the final output of the maximum consecutive increasingly order LinkedList
    public static void displayMaxListElements(LinkedList<Character> max) {

        System.out.print("Maximum consecutive increasingly ordered substring is ");

        for (int j = 0; j < max.size(); j++) {

            System.out.print(max.get(j));

        }
    }
}
