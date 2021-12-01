/*
    (Maximum element in an array) This program will prompt the user to enter 10 integers and
    invokes a method to find the max

    @author: Eric Ramsey
    @version: 09/29/21
*/

import java.util.Scanner;

public class Exercise19_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Initialize scanner object
        Integer[] list = new Integer[10]; // Create list of Integer Elements with size 10

        System.out.println("Enter 10 integers: "); // Prompt user for input
        populateList(list, scanner); // Call method to populate list

        System.out.println("The max number is  " + max(list)); // Final output



    }
    // Method used to determine the max number in a given list
    public static <E extends Comparable<E>> E max(E[] list) {

        E maxNum = list[0];

        for (int i = 1; i < list.length; i++) {

            E element = list[i];
            if (list[i].compareTo(maxNum) > 0) {

                maxNum = element;

            }
        }
        return maxNum;
    }
    // Method used to populate a given list with user's input
    public static void populateList(Integer[] list, Scanner scanner) {

        if (scanner.hasNext()) {

            for (int i = 0; i < list.length; i++) {

                list[i] = scanner.nextInt();

            }
        }
    }
}