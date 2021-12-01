/*
    (Same-number subsequence)
    Write an O(n) program that prompts the user to enter a sequence of integers
    ending with 0 and finds the longest subsequence with the same number.

    @author: Eric Ramsey
    @version: 10/20/2021
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Exercise22_05 {

    public static void main(String[] args) {

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        // Created LinkedList to store user entry
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Prompt user for input
        System.out.println("Enter a series of numbers ending with 0: ");
        populateLinkedList(linkedList, scanner); // Call populateLinkedList method to store user elements in linkedList
        determineSameNumberSequence(linkedList); // Call determineSameNumberSequence method to display final output

    }
    // Method used to determine the longest same number sequence and the index that sequence starts
    public static void determineSameNumberSequence(LinkedList<Integer> linkedList) {

        int index = 0;
        int value = linkedList.get(index);
        int count = 1;
        int maxIndex = index;
        int maxValue = value;
        int maxCount = count;

        for (int i = 1; i < linkedList.size(); i++) {

            if (linkedList.get(i) == value) {

                count++;

                if (count > maxCount) {

                    if (maxIndex != index) {

                        maxIndex = index;

                    }
                    maxValue = linkedList.get(i);
                    maxCount = count;

                }
            } else {

                index = i;
                value = linkedList.get(i);
                count = 1;
            }
        }

        System.out.println("The longest same number sequence starts at index " + maxIndex + " with " + maxCount
                + " values of " + maxValue);
    }
    // Method used to populate LinkedList with user input
    public static void populateLinkedList(LinkedList<Integer> linkedList, Scanner scanner) {


        while(true) {

            int userNum = scanner.nextInt();
            if (userNum == 0) {

                break;

            }
            linkedList.add(userNum);
        }
    }
}
