// User function Template for Java

/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/
//tc=O(n) and sc - Worst Case (Skewed Tree):O(n) and Balanced Tree=O(log n)
class Solution {
    // Function to return the diameter of a Binary Tree.
    class Info{
    int diam;
    int ht;
    public Info(int diam,int ht){
        this.diam=diam;
        this.ht=ht;
    }
}
    private Info diameter1(Node root)
    {
        if(root==null)      return new Info(0,0);
        Info leftInfo=diameter1(root.left);
        Info rightInfo=diameter1(root.right);
        
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht);//here no +1 as math.max already has "+1"
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam,ht);
    }
      int diameter(Node root) {
        return diameter1(root).diam;
    }
}

/*
//TLE EXCEEDED TC=O(N^2),SC=O(N)
class Solution {

    
    int diameter(Node root) {
        // Your code here
        //base case
        if(root==null)  return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        int selfdiam=lh+rh;
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        return Math.max(selfdiam,Math.max(ld,rd));
    }
    
    int height(Node root)
    {
        if(root==null) return 0;
        return Math.max( height(root.left) , height(root.right) ) + 1 ;
    }
}

*/
