/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {//No don't use here...its used to validate bst=>or do inorder traversal if comes sorted then its a BST
        // code here
        //tc=sc=O(n)
        return dfs_height(root)!=-1;//then return true else false
    }
        
        public int dfs_height(Node root)//dfs as stack ke tarike se calc height
        {
            if(root==null)  return 0;
            
            int lh=dfs_height(root.left); if(lh==-1)    return -1;//in case any subtree returns -1 (not balanced) return -1 then & there
            int rh=dfs_height(root.right); if(rh==-1)   return -1;
        
            if(Math.abs(lh-rh)>1)    return -1;
            //else return height...return Math.max(lh,rh)+1return true;
            return Math.max(lh,rh)+1;
        }
}
/*
this line's significane:-if(lh==-1)    return -1;
ki agar koi subtree hi returns -1 to lh then wahi per bst is unbalanced


The line checks if the left subtree (referred to as lh, the left height) is already unbalanced. If it is, the method immediately returns -1 to indicate that the entire tree (or subtree) rooted at the current node is also unbalanced.

This mechanism works recursively as follows:

Base Case: When a subtree is determined to be unbalanced (i.e., its height difference exceeds 1), the method returns -1 as a signal to its parent nodes.
Propagation: Once a -1 is returned from any subtree, it propagates upward through the recursive calls, ensuring that no further calculations are performed for other subtrees or nodes.
*/
