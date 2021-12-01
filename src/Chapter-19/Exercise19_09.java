/*
    (Sort ArrayList) This program will prompt the user to enter 10 integers and
    invokes a method to sort the elements in an ArrayList

    @author: Eric Ramsey
    @version: 09/29/21
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise19_09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Initialize Scanner object
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 10 integers: "); // Prompt user for 10 Integer values
        populateList(list, scanner); // Call method to populate the ArrayList
        sort(list); // Call method to sort the elements in the ArrayList
        displaySortedElements(list); // Display the final output

    }
    // Method used to sort the elements in a given list
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            E minNum = list.get(i);
            int min = i;

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).compareTo(minNum) < 0) {

                    minNum = list.get(j);
                    min = j;

                }
            }
            if (min != i) {

                list.set(min, list.get(i));
                list.set(i, minNum);

            }
        }
    }
    // Method used to populate a given list with user's input
    public static void populateList(ArrayList<Integer> list, Scanner scanner) {

        if (scanner.hasNext()) {

            for (int i = 0; i < 10; i++) {

                list.add(scanner.nextInt());

            }
        }
    }
    public static void displaySortedElements(ArrayList<Integer> list) {

        System.out.println("The sorted numbers are ");

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " ");

        }
    }
}