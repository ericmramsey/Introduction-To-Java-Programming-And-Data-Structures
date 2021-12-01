/*
    (Sorted?) Write the following method that returns true if the list is already sorted in increasing
    order. public static boolean isSorted(int[] list) Write a test program that prompts the user to
    enter a list and displays whether the list is sorted or not. Here is a sample run. Note that the
    first number in the input indicates the number of the elements in the list. This number is not
    part of the list.

    @author: Eric Ramsey
    @version:02/24/21
 */

import java.util.Scanner;

public class Exercise07_19 {

    public static void main(String[] args) {
        // Initialize Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter List: "); // Prompt user to enter list

        int[] listArr = new int[scanner.nextInt()]; // array used to store user's input

        boolean arrayFilled = false; // variable used to determine if the array has been fully populated
        int count = 0;

        while (!arrayFilled) { // populates listArr array with user input

            listArr[count] = scanner.nextInt();
            count++;

            if (count == listArr.length) {
                arrayFilled = true;
            }
        }
        if (isSorted(listArr)) {

            System.out.println("The list is already sorted");

        } else {

            System.out.println("The list is not sorted");
        }
    }
    // Method that is used to determine if user's list is sorted
    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                return false;

            }
        }
        return true;
    }
}
