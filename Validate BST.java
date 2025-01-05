public class Solution {
    public boolean isValidBST(TreeNode root) {
    
    // M1: ...tc=O(N),sc=O(1)...though auxiliary/implicit stack in recursion- it is counted while telling cauz algo uses the system call stack
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);//Method overloading...same parameters typw will be called
    }
    
    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        //if !(min<curr<max)
        if (root.val >= maxVal || root.val <= minVal) return false;
        //recursion alw 1st works for left then right subtrees
        //see TUF channel diag:
        //1st in left child- "min remains same" & ""max becomes root value""
        //then opposite in right child- ""min becomes root"" and "max remais same"
        //hence priceed like these
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}

//     //M2: bst if inorder comes sorted(l-r-r)...TC=O(N),SC=O(N)-ARRLIST

//     ArrayList<Integer> a_list = new ArrayList<>(); // To store inorder traversal
//     public boolean isValidBST(TreeNode root) {
//         // Perform inorder traversal
//         inorderTraversal(root);

//         // Check if the inorder traversal is sorted
//         return isSorted(a_list);
//     }

//     // Helper method to perform inorder traversal and store values
//     private void inorderTraversal(TreeNode root) {
//         if (root == null) return;

//         inorderTraversal(root.left);
//         a_list.add(root.val); // Collect values in inorder fashion
//         inorderTraversal(root.right);
//     }

//     // Helper method to check if the list is sorted
//     private boolean isSorted(ArrayList<Integer> list) {
//         for (int i = 0; i < list.size() - 1; i++) {
//             if (list.get(i) >= list.get(i + 1)) { // Ensure strictly increasing order
//                 return false;
//             }
//         }
//         return true;
//     }
// }
