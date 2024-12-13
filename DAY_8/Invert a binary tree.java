/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//INVERT DOES'NT MEAN UPSIDE DOWN(IT MEANS MIRROR/SWAP....AND MANY NAMES)

//M1: RECURSION
 //invert means interchange LHS & RHS
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return root;

        TreeNode left=invertTree(root.left);//RECURSIVE
        TreeNode right=invertTree(root.right);

        root.right=left;
        root.left=right;

        return root;

    }
}

//M2: ITERATIVE(USING LEVEL ORDER TRAVERSAL) -Nikhil Lohia You Tube Channel!(Good Intro- gives interest)
 //see level order traversal(iterative method of solving this)
//level order- push in Q , add null in Q , pop from Q and print , push its lhs and rhs children in Q,again add null,pop1,push its children,add null and so on (level order traversal/sorted order in BST Is done)
//then how to invert a tree- Each time on pushing its L-R Children-swap them in queue (array) itself---inverted order will be printed 
