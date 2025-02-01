/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

/*sum(root.left) + sum(root.right) → Calculates the sum of left and right subtrees.
root.data == sum(root.left) + sum(root.right) → Checks if the current node's value is equal to this sum.
isSumTree(root.left) && isSumTree(root.right) → Recursively verifies if the left and right subtrees are also Sum Trees.
tc=O(n^2)...as 2 functions are called
*/
class Solution {
    
    
    public int sum(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    }
    boolean isSumTree(Node root) {
        //B.C
        if(root==null)  return true;
        
        //kaam- har ek level par we'll be doing
        if(root.left==null && root.right==null){
            return true;
        }
        
        //f(n-1) inner call->vishvaas ki inner call acche se kaam karega
        return (root.data==sum(root.left)+sum(root.right)) && isSumTree(root.left) && isSumTree(root.right);
    }
}
