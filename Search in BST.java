//tc=sc= O(log n) when balanced BST, & =O(n) when skewed BST(worst case).

class BST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        //do any traversal & check
        //preorder
        
        //recursion base case
        if(root==null) return false;
        
        //kaam
        if(root.data==x)    return true;
        if(root.data>x)     return search(root.left,x);
        else    return search(root.right,x);//ye else is of upar wala if
        //rem recursion wala visualization---leaf returns false to parent if not found
    }
}
