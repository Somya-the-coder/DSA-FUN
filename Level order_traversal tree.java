/*
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
class Solution {
    // Function to return the level order traversal of a tree.
    //Given a root of a binary tree with n nodes, the task is to find its level order traversal. Level order traversal of a tree is breadth-first traversal for the tree
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> ll=new ArrayList<ArrayList<Integer>>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);//VVIMP: root and all are nodes ...node.val=int data
        q.add(null);
        while(!q.isEmpty())
        {
            ArrayList<Integer> l=new ArrayList<>();
            Node node=q.remove();
            if(node==null)//if null is popped
            {
                if(q.isEmpty())//if q becomes empty means all nodes explored
                {
                    break;
                }
                else
                {
                    q.add(null);//add null in q itself so that while printing null helps to let us know whwn the new level comes
                }
            }
            else//if some elt is popped
            {
                l.add(node.data);// add it(node.data) in the ans
                if(node.left!=null)//put children of "popped & node stored in the ans" in the queue
                {
                    q.add(node.left);
                }
                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }
            ll.add(l);
        }
        //l.add(l)...write this here and l decralation outside while loop...addAll(used with arraylist<integer>)
        return ll;
    }
}
