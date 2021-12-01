/*
    (Tree height) Define a new class named BSTWithHeight that extends BST

    @author: Eric Ramsey
    @version: 11/16/21
 */

import java.util.Scanner;

public class Exercise25_01 {

    public static void main(String[] args) {

        BSTWithHeight<String> tree = new BSTWithHeight<>();
        System.out.print("The height of an empty tree is " + tree.height());

        tree.insert("Green");
        System.out.print("\nThe height of the tree with one node is " + tree.height());

        tree.insert("Red");
        System.out.print("\nThe height of the tree with two nodes is " + tree.height());

        Scanner input = new Scanner(System.in); // Initialize Scanner Object
        System.out.print("\nEnter six strings: "); // Prompt user for input

        for (int i = 0; i < 6; i++) {

            String s = input.next();
            tree.insert(s.trim());

        }
        System.out.print("The height of tree is " + tree.height());

        BSTWithHeight<String> tree1 = new BSTWithHeight<>(new String[]
                {"Tom", "George", "Jean", "Jane", "Kevin", "Peter", "Susan", "Jen", "Kim", "Michael", "Michelle"});
        System.out.print("\nThe height of tree1 is " + tree1.height());

        BSTWithHeight<Integer> tree2 = new BSTWithHeight<>(new Integer[]{50, 45, 35, 48, 59, 51, 58});
        System.out.print("\nThe height of tree2 is " + tree2.height());
    }
}
