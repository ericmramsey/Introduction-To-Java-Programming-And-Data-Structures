/*
    (Tree height)
    Define a new class named BSTWithHeight that extends BST with the following method:
        public int height()
    Use https://liveexample.pearsoncmg.com/test/Exercise25_01.txt to test your code.

    @author: Eric Ramsey
    @version: 11/16/21
 */

public class BSTWithHeight<E> extends BST<E> {

    // Create a default BST with a natural order comparator
    public BSTWithHeight() {

        super();

    }
    // Create a BST with a specified comparator
    public BSTWithHeight(java.util.Comparator<E> c) {

        super(c);

    }
    // Create a binary tree from an array of objects
    public BSTWithHeight(E[] objects) {

        super(objects);

    }
    // Returns the height of this binary tree.
    public int height() {

        return height(root);

    }
    private int height(TreeNode<E> root) {
        // WRITE YOUR CODE HERE
        if (root == null) {
            return -1;
        }

        int lefth = height(root.left);
        int righth = height(root.right);

        if (lefth > righth) {
            return lefth + 1;
        } else {
            return righth + 1;
        }
    }
}