/*
    (Print distinct numbers) Write a program that reads in ten numbers and displays
    the number of distinct numbers and the distinct numbers separated by exactly one
    space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
    Read a number and store it to an array if it is new. If the number is already in the
    array, ignore it.) After the input, the array contains the distinct numbers.

    @author: Eric Ramsey
    @version: 02/24/21
*/

import java.util.Scanner;

public class Exercise07_05 {

    public static void main(String[] args) {
        // Initialize scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ten numbers: "); // prompt user for input
        int[] distinctNumArray = new int[10]; // Create an array to store all users numbers entered
        
        boolean arrayFilled = false;
        int count = 0;
        int userNum;
        int numOfDistinct = distinctNumArray.length -1;

            for (int c = 0; c < 10; c++) {

                userNum = scanner.nextInt();
                //Test if num is distinct
                if (distinctNumberVerifier(distinctNumArray, userNum)) {

                    distinctNumArray[count] = userNum;

                }
                count++;
            }

        System.out.println("The number of distinct number is " + displayAmountOfDistinctNums(distinctNumArray));
         displayDistinctNums(distinctNumArray);
    }
    public static boolean distinctNumberVerifier(int[] array, int num) { // Determines if a num is distinct

        for (int i = 0; i < array.length; i++) {

            if (num == array[i]) {
                return false;
            }
        }
        return true;
    }
    // Method used to display all distinct numbers based on the user's input
    public static void displayDistinctNums(int[] arr) {

        System.out.print("The distinct numbers are:");
        for (int e = 0; e < arr.length; e++) {

            if (arr[e] != 0) {

                System.out.print(" " + arr[e]);

            }
        }
    }
    // Method used to display the total amount of discrete numbers
    public static int displayAmountOfDistinctNums(int[] arr) {
        int amount = 0;
        for (int e = 0; e < arr.length; e++) {

            if (arr[e] != 0) {

                amount++;

            }
        }
        return amount;
    }
}
