/*
    (Remove duplicates) Write a method that removes the duplicate elements from
    an array list of integers using the following header:
    public static void removeDuplicate(ArrayList<Integer> list)
    Write a test program that prompts the user to enter 10 integers to a list and displays
    the distinct integers separated by exactly one space.

    @author: Eric Ramsey
    @version: 03/23/21
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter ten integers: "); // Prompt user for input
        // Populates the ArrayList with 10 integers from user input
        for (int i = 0; i < 10; i++) {

            numbers.add(scanner.nextInt());

        }
        // Calls removeDuplicateNums method
        removeDuplicateNums(numbers);

        System.out.print("The distinct integers are ");
        // Displays distinct integers
        for (int e = 0; e < numbers.size(); e++) {

            System.out.print(numbers.get(e) + " ");

        }

    }
    // Method used to remove duplicate integers from ArrayList to display distinct values
    public static void removeDuplicateNums(ArrayList<Integer> nums) {

        for(int i = 0; i < nums.size() - 1; i++) {

            for(int c = i + 1; c < nums.size(); c++) {

                if (nums.get(i) == nums.get(c)) {

                    nums.remove(c);

                }
            }
        }
    }
}
