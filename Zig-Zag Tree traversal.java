//tc=sc=O(n)
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //simple u know na how to print reverse level order=>right subtree 1st then left
	    ArrayList<Integer> ans=new ArrayList<>();
	    Queue<Node> q=new LinkedList<>();
	    q.add(root);
	    boolean lefttoright=true;
	    //no khela of NULL
	    while(!q.isEmpty())
	    {
	        int size=q.size();//no. of nodes at the current level
	        ArrayList<Integer> level=new ArrayList<>();
	        
	        for(int i=0;i<size;i++)
	        {
	            Node node=q.remove();
                level.add(node.data);
                // Add child nodes to the queue for the next level.
                if(node.left!=null)    q.add(node.left);
	            if(node.right!=null)    q.add(node.right);
	        }

            //REVERSE the order if its not left to right level
            if(!lefttoright)
            {
                Collections.reverse(level);
            }
            
            //Add the current level to the result
            ans.addAll(level);//here comes addAll's use...arrlist and another arrlist
            
            //Toggle the order for next level
            lefttoright=!lefttoright;
            
	            	/*
	            	ans.add(node.data);
	            	if(q.peek()==null) ans.add(null);
	            	
	            	above 2 lines o/p=
	            	For Input: 
                        1 2 3 4 5 6 7
                        Your Output: 
                        1 null 2 3 null 4 5 6 7 null
                        
                    
	                if(node.left!=null)    q.add(node.left);
	                if(node.right!=null)    q.add(node.right);
	            	*/
	    }
	    return ans;
	}
}
