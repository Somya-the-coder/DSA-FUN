/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node node=q.remove();
            if(node==null)
            {
                if(q.isEmpty()) break;
                else q.add(null);//to go just after null(i.e. 1st elt=left view)
            }
            else
            {
                Node node1=q.peek();//to go just bef null...check if in q curr is null
                if(node1==null) ans.add(node.data);//then add the popped elt as its the last
                
                if(node.left!=null) q.add(node.left);
                if(node.right!=null)    q.add(node.right);
            }
        }
        return ans;
    }
}
/*
The time complexity of the solution is O(n), where 𝑛 is the number of nodes in the binary tree.
Reason: Each node is processed exactly once during the level-order traversal. Operations like adding to or removing from the queue take constant time 
O(1).


The space complexity of the solution is 
O(w), where 𝑤
w is the maximum width of the binary tree.
Reason:
The queue at most holds all the nodes in one level of the tree, and the maximum width of the binary tree determines the maximum size of the queue.
In the worst case (for a complete binary tree), 
𝑤 𝑛/2 w≈n/2, so the space complexity can also be expressed as O(n) in the worst case
*/
