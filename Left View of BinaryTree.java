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
}*/
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        //left view : every level ka 1st node=level order traversal
        ArrayList<Integer> ans=new ArrayList<>();//to store result
        
        if(root==null) return ans;//...extra from level order travrersal

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        
        ans.add(root.data);
        // Node a;
        
        while(!q.isEmpty())
        {
            Node node=q.remove();
            if(node==null)
            {
                if(q.isEmpty()) break;
                
                else
                {
                    ans.add(q.peek().data);//....extra from level order travrersal
                    // a=q.peek();
                    q.add(null);
                }
                // System.out.println(a.data);
            }
            else
            {
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
        }
        return ans;
    }
}
