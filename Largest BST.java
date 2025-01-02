// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

//M1:BRUTEFORCE ...TC=N^2,SC=1
    //traverse each node and call valid bst function...hence if true return no. of nodes
//M2:OPTIMIZED ...TC=N,SC=1...BEGIN POSTORDER FROM BOTTOM
class NodeValue{
    public int maxNode,minNode,maxSize;
    NodeValue(int minNode,int maxNode,int maxSize){
    this.maxNode=maxNode;
    this.minNode=minNode;
    this.maxSize=maxSize;
    }
}

class Solution{//post order
    
    
    private static NodeValue largestBSTSubtreeHelper(Node root){
        //An empty tree is a BST of size 0
        if(root==null){
            return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        
        //get values from left and right subtree of current tree.
        NodeValue left=largestBSTSubtreeHelper(root.left);
        NodeValue right=largestBSTSubtreeHelper(root.right);
        
        //Current node is greater than max in left and smaller than min in right
        if(left.maxNode < root.data && root.data < right.minNode)
        {
            //it is a BST...(min,max,size)
            return new NodeValue(Math.min(root.data, left.minNode),Math.max(root.data, right.maxNode),left.maxSize + right.maxSize + 1);
        }
        //Otherwise return[-inf,infinity] so that parent can't be a valid 
        return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.maxSize,right.maxSize));
    }
    
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        //ek traversal lagana hoga(dfs(pre,post,in)-recursive OR bfs(level)-iterative)
        return largestBSTSubtreeHelper(root).maxSize;
    }
