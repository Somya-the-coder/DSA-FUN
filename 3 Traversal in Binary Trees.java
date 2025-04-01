//PREORDER
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root==null)  return l;
        l.add(root.val);
        l.addAll(preorderTraversal(root.left));
        l.addAll(preorderTraversal(root.right));

        return l;
    }
}
//POSTORDER
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
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();//list in list adding use addAll ...not necessary that you use ArrayList of ArrayList to use addAll method
        
        if(root==null)  return l;
        l.addAll(postorderTraversal(root.left));
        l.addAll(postorderTraversal(root.right));
        l.add(root.val);

        return l;
    }
}
//INORDER
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();

        if(root==null) return l;

        l.addAll(inorderTraversal(root.left));//winds - unwinds
        l.add(root.val);
        l.addAll(inorderTraversal(root.right));

        return l;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//iterative codes + explaination:-
https://www.techiedelight.com/inorder-tree-traversal-iterative-recursive/
https://www.techiedelight.com/preorder-tree-traversal-iterative-recursive/
https://www.techiedelight.com/postorder-tree-traversal-iterative-recursive/


////////////////////////////////////////////////////////////////////////////////////////////////////
| Traversal Type                | Time Complexity | Space Complexity                   | Recursive or Iterative |
|--------------------------------|----------------|-----------------------------------|------------------------|
| Preorder (Root → Left → Right) | O(N)           | O(N) (Recursive) / O(N) (Iterative) | Recursive & Iterative  |
| Inorder (Left → Root → Right)  | O(N)           | O(N) (Recursive) / O(N) (Iterative) | Recursive & Iterative  |
| Postorder (Left → Right → Root)| O(N)           | O(N) (Recursive) / O(N) (Iterative) | Recursive & Iterative  |
| Level Order (BFS using Queue)  | O(N)           | O(N) (uses Queue)                  | Iterative              |
