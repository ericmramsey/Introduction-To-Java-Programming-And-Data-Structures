/*
    (Statistics: compute deviation) Programming Exercise 5.45 computes the standard deviation
    of numbers. This exercise uses a different but equivalent formula to compute the standard
    deviation of n numbers.

    @author: Eric Ramsey
    @version: 02/24/21
 */

import java.util.Scanner;

public class Exercise07_11 {

    public static void main(String[] args) {
        // Initialize Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ten numbers: "); // Prompt user for input

        double[] userNumbers = new double[10]; // Store user input in array with length 10

        boolean arrayFilled = false; // variable used to determine if array has been fully populated
        int count = 0;

        while (!arrayFilled) {

            userNumbers[count] = scanner.nextDouble();
            count++;

            if(count == userNumbers.length) {
                arrayFilled = true;
            }
        }

        //displayArr(userNumbers);
        System.out.println("The mean is " + mean(userNumbers));
        System.out.println("The standard deviation is " + deviation(userNumbers));
    }
    // Method used to calculate the standard deviation of array elements
    public static double deviation(double[] x) {

        double deviation = 0;
        double mean = mean(x);

        for (int i = 0; i < x.length; i++) {

            deviation += Math.pow(x[i] - mean, 2);

        }
        double squareRoot = Math.sqrt(deviation / (x.length - 1));

        return (double)Math.round(squareRoot * 100000) / 100000;
    }
    // Method used to calculate the mean of the array values
    public static double mean(double[] x) {

        double sum = 0.0;

        for (int i = 0; i < x.length; i++) {

            sum += x[i];
        }
        double mean = sum / x.length;

        return (double)Math.round(mean * 100) / 100;
    }
    // Method used to display values in array and debugging purposes
    public static void displayArr(double[] arr) {

        for (int j = 0; j < arr.length; j++) {

            System.out.println("arr[" + j + "] = " + arr[j]);
        }
    }
}
