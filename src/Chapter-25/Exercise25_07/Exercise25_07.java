/*
    (Implement postorder traversal without using recursion) Implement the postorder
    method in BST using a stack instead of recursion. Write a test program that
    prompts the user to enter 10 integers, stores them in a BST, and invokes the
    postorder method to display the elements.

    @author: Eric Ramsey
    @version: 11/16/21
 */

import java.util.*;

public class Exercise25_07 {

    public static void main(String[] args) {

        BSTWithNumberOfNonLeaves<String> tree = new BSTWithNumberOfNonLeaves<>();

        Scanner input = new Scanner(System.in); // Initialize Scanner Object
        System.out.print("Enter six strings: "); // Prompt User For Input

        for (int i = 0; i < 6; i++) {

            String s = input.next();
            tree.insert(s.trim());

        }
        System.out.println("The number of non-leaves in the tree is " + tree.getNumberOfNonLeaves());
    }
}