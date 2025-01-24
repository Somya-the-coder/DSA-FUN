/*class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to convert a binary tree into its mirror tree.
    //make changes in the same tree; no new tree creation
    //recursion use says- subtree ke liye ho raha then bare ke liye bhi hoga
//M1: POSTORDER METHOD
    void mirror(Node node) {//at 1st node=root; treat it as root only;
//BC
        if(node==null)  return;//base case of recursion;;in void only return; works but not in non-void method

        Node temp;
//RECURSION        
        //calling mirror functions recursively for lrft & right subtrees
        mirror(node.left);
        mirror(node.right);
//SWAP        
        //swapping the left & right subtree
        temp=node.left;
        node.left=node.right;
        node.right=temp;
        
    }
    // //to traverse/print we have to use any traversal....like in array or both things loop is needed
    // //bit in qs already printed
    //preorder(node);//node toh abhi bhi root ko point kar raha hai
    
    //void preorder(Node root)
    // {
    //     if(root==null)  return;
    //     System.out.println(root.data+" ");
    //     preorder(root.left);
    //     preorder(root.right);
    // }
    
    
    //M2:-
    // Node mirror(Node node) {//at 1st node=root
    //     //swap use 3 variables concept
    //     if(node==null)
    //         return null;
    //     Node left_subtree=mirror(node.left);
    //     Node right_subtree=mirror(node.right);
    //     node.left=right_subtree;
    //     node.right=left_subtree;
    //     return node;
    //}
}
