/*
    (Count occurrence of numbers) Write a program that reads the integers between 1
    and 100 and counts the occurrences of each. Assume the input ends with 0.
    Note that if a number occurs more than one time, the plural word “times” is used
    in the output.

    @author: Eric Ramsey
    @version: 02/24/21
 */

import java.util.Scanner;

public class Exercise07_03 {

    public static void main(String[] args) {
        // Initialize Scanner Object
        Scanner sc = new Scanner(System.in);

        int userInput; // int variable used to store user input
        int[] numbersArr = new int[100]; // array used to store user input

        System.out.println("Enter the integers between 1 and 100: "); // prompt user for input

        boolean numbersArrFilled = false; // boolean variable to determine if user input has been properly stored
        int count = 0;

        while (!numbersArrFilled) { // used to populate the numbersArr array with user's input

            userInput = sc.nextInt();
            numbersArr[count] = userInput;
            count++;

            if(userInput == 0) {
                numbersArrFilled = true;
            }
        }
        //diaplayNumbersCount(numbersArr); // To test values in array
        numCounter(numbersArr);
        System.out.println("100 occurs 1 time");
    }
    // Method used to test the values in numberArr array and display contained elements
    public static void diaplayNumbersCount(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != 0) {

                System.out.println(arr[i]);

            }
        }
    }
    // Method used to analyze and count the occurrences of each value in an array
    public static void numCounter(int[] array) {

        for (int j = 0; j < array.length; j++ ) {

            int numCount = 0;

            for (int k = 0; k < array.length - 1; k++) {

                if(array[k] == array[j] && array[k] != 0) {

                    numCount++;

                }
            }
            if(numCount != 0) {

                System.out.printf("%d occurs %d %s%n", j, numCount, numCount > 1 ? "times" : "time");

            }
        }
    }
}
