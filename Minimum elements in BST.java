class Solution {
    //TREE=RECURSION=BASE CASE=return mei call or variable mei call!!!!!
    
    // Function to find the minimum element in the given BST.
    //bst has smallest elt at leftmost=just traverse
    int minValue(Node root) {
        
        //M1:RECURSION
        //Base case to stop recursion(at the last)
        if(root.left==null)  return root.data;
        
        //hey dude recursion requires a base case else throws a null_pointer_exception
        return minValue(root.left);

        // //M2: ITERATION
        // while(root.left!=null)
        // {
        //     root=root.left;
        // }
        // return root.data;
    }
}
