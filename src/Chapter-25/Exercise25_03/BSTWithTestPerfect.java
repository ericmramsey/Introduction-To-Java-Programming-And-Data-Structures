/*
    (Test perfect binary tree)
    A perfect binary tree is a complete binary tree with all levels fully filled.
    Define a new class named BSTWithTestPerfect that extends BST with the following
    methods: (Hint: The number of nodes in a perfect binary tree is 2^(height+1) - 1.)
    public boolean isPerfectBST()

    Use https://liveexample.pearsoncmg.com/test/Exercise25_03.txt to test your code.

    @author: Eric Ramsey
    @version: 11/16/21
 */

public class BSTWithTestPerfect<E> extends BST<E> {
    /** Create a default BST with a natural order comparator */
    public BSTWithTestPerfect() {
        super();
    }

    /** Create a BST with a specified comparator */
    public BSTWithTestPerfect(java.util.Comparator<E> c) {
        super(c);
    }

    /** Create a binary tree from an array of objects */
    public BSTWithTestPerfect(E[] objects) {
        super(objects);
    }

    /**
     * Returns the height of this binary tree.
     */
    public int height() {
        return height(root);
    }

    private int height(TreeNode<E> root) {
        // if root is null, returning -1 (empty trees have height -1)
        if (root == null) {
            return -1;
        }
        // if root is a leaf node, returning 0
        else if (root.left == null && root.right == null) {
            return 0;
        } else {
            // else finding heights of left and right subtrees
            int leftH = height(root.left);
            int rightH = height(root.right);
            // adding 1 to the maximum value among leftH and rightH, returning
            return 1 + Math.max(leftH, rightH);
        }
    }

    /** Returns true if the tree is a perfect binary tree */
    public boolean isPerfectBST() {
        // returning true if the number of nodes in the tree equals
        // 2^(height+1) -1
        return getSize() == (Math.pow(2, height() + 1) - 1);
    }
}
