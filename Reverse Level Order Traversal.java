class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
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
                else    q.add(null);
            }
            else
            {
                ans.add(node.data);
                //just add right child 1st then left
                if(node.right!=null)    q.add(node.right);
                if(node.left!=null) q.add(node.left);
            }
        }
                Collections.reverse(ans);
                return ans;

    }
}
