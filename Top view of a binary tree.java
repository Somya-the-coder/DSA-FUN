/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/


class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

//tc=O(N) , sc=O(N)
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        //just Q and Map(treemap sorted keys) required
        ArrayList<Integer> ans=new ArrayList<>();//to store answer
        if(root==null) return ans;
        Map<Integer,Integer> map=new TreeMap<>();//keys are sorted in treemap and to print we need it!
        Queue<Pair> q=new LinkedList<>();//Pair is a data type object
        q.add(new Pair(root,0));//maybe we can use this with Pair data type
        while(!q.isEmpty())
        {
            Pair it=q.remove();
            int hd=it.hd;
            Node temp=it.node;
            if(map.get(hd)==null) map.put(hd,temp.data);
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
