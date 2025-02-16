//https://youtu.be/LhXPvhrhcIk
class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           Queue<Node> q=new LinkedList<>();
           ArrayList<Integer> ans=new ArrayList<>();
           if(root==null) return ans;//!root wont work since its an object
           q.offer(root);
           while(!q.isEmpty())
           {
               Node temp=q.poll();
               while(temp!=null)//MAIN LOGIC LOOP
               {
                   if(temp.left!=null) q.offer(temp.left);
                   ans.add(temp.data);
                   temp=temp.right;
               }
           }
           return ans;
      }
}
//tc=sc=O(N)
