/*
    (Find the nonleaves)

    Define a new class named BSTWithNumberOfNonLeaves that extends BST with the following methods:
    Return the number of nonleaf nodes
    public int getNumberofNonLeaves()

    Use https://liveexample.pearsoncmg.com/test/Exercise25_07.txt to test your code.

    @author: Eric Ramsey
    @version: 11/16/21
 */

public class BSTWithNumberOfNonLeaves<E> extends BST<E> {
    /** Create a default BST with a natural order comparator */
    public BSTWithNumberOfNonLeaves() {
        super();
    }

    /** Create a BST with a specified comparator */
    public BSTWithNumberOfNonLeaves(java.util.Comparator<E> c) {
        super(c);
    }

    /** Create a binary tree from an array of objects */
    public BSTWithNumberOfNonLeaves(E[] objects) {
        super(objects);
    }

    public int getNumberOfNonLeaves() {
        return getNumberOfNonLeaves(root);
    }

    /** Returns the number of non-leaf nodes */
    private int getNumberOfNonLeaves(TreeNode<E> root) {
        // if tree is empty returning 0
        if (root == null) {
            return 0;
        }
        // if this is a leaf node, returning 0
        else if (root.left == null && root.right == null) {
            return 0;
        } else {
            // else finding number of non leaves on left subtree, and right
            // subtree, adding 1 to the count, returning it
            return 1 + getNumberOfNonLeaves(root.left)
                    + getNumberOfNonLeaves(root.right);
        }
    }
}