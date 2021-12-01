/*
    (Test perfect binary tree)
    A perfect binary tree is a complete binary tree with all levels fully filled.
    Define a new class named BSTWithTestPerfect that extends BST with the following
    methods: (Hint: The number of nodes in a perfect binary tree is 2^(height+1) - 1.)
    public boolean isPerfectBST()

    @author: Eric Ramsey
    @version: 11/16/21
 */

import java.util.Scanner;

public class Exercise25_03 {

    public static void main(String[] args) {

        BSTWithTestPerfect<String> tree = new BSTWithTestPerfect<>();
        System.out.print("Is an empty tree prefect? " + tree.isPerfectBST());

        tree.insert("Green");
        System.out.print("\nIs a one-node tree prefect? " + tree.isPerfectBST());

        tree.insert("Red");
        System.out.print("\nIs a two-node tree prefect? " + tree.isPerfectBST());

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String s = input.next();
        tree.insert(s.trim());
        System.out.print("Is this tree perfect? " + tree.isPerfectBST());

        BSTWithTestPerfect<String> tree1 = new BSTWithTestPerfect<>(new String[]
                {"Tom", "George", "Jean", "Jane", "Kevin", "Peter", "Susan", "Jen", "Kim", "Michael", "Michelle"});
        System.out.print("\nIs tree1 perfect? " + tree1.isPerfectBST());

        BSTWithTestPerfect<Integer> tree2 = new BSTWithTestPerfect<>(new Integer[]{50, 45, 75, 18, 49, 51, 98});
        System.out.print("\nIs tree2 perfect? " + tree2.isPerfectBST());
    }
}
