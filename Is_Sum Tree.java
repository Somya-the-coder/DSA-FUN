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


/*
//again for practice:-
class Solution{
    //simple maan lo recursion loop ka alternative hai...(fun call itself in it with increment/decrement)   + those 3 steps
    
    public int sum(Node root)
    {
        if(root==null)  return 0;
        return root.data+sum(root.left)+sum(root.right);
    }//recursively calls left and right and add
    
    boolean isSumTree(Node root)
    {
        // BC
        if(root==null) return true;//no tree is a sum tree
        if(root.left==null && root.right==null) return true;//leaf node is also a sum tree
        //kaam bhi yahi hai sum function is being called
        //call n-1...assuming it will call the rest nicely in depth in return itself
        return root.data==sum(root.left)+sum(root.right) && isSumTree(root.left) && isSumTree(root.right);
//....................................................................................................
        //above line vvimportant explaination:-/*
sum(root.left) + sum(root.right) → Calculates the sum of left and right subtrees.
root.data == sum(root.left) + sum(root.right) → Checks if the current node's value is equal to this sum.
isSumTree(root.left) && isSumTree(root.right) → Recursively verifies if the left and right subtrees are also Sum Trees.
tc=O(n^2)...as 2 functions are called/*
}
}
*/

//...................................................................................................
//  public int sum(Node root)
//     {
//         if(root==null)  return 0;
//         return root.data+sum(root.left)+sum(root.right);
//     }//recursively calls left and right and add

//explaination of these lines vvimp
/*
How Does Recursion Work Here?
For every node:

It takes the node's own value (root.data).
It makes recursive calls to compute the sum of the left and right subtrees:
sum(root.left): Gets the sum of all nodes in the left subtree.
sum(root.right): Gets the sum of all nodes in the right subtree.
It adds all these values together to get the total sum of that subtree.

if(root == null) {
    return 0;  // If there is no node, return 0
}
If the function reaches a null node (empty child), it returns 0 (because an empty subtree has a sum of 0).
This prevents infinite recursion.*/
