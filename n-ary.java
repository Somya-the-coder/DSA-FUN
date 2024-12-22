/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

  // Node currnode=q.remove();//a smart method............a a=new a....has become obselete


//LEVEL ORDER IS NON-RECURSIVE/BFS IN NATURE...level order means queue
//level order- if nill comes add it to q and continue
//at last print ,if null comes, print in new line/separate level(a list)
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ll=new ArrayList<>();
        if(root==null)
            return ll;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        //in root null is there...just to show not actually
        //rem root is not an array, Node data type has diff properties...its like head to traverse
        //q.add(null);

        //u'll use bfs...(that'll use queue(that'll be level order))--->simple order
        while(q.size()>0)
        {
            List<Integer> arr=new ArrayList<>();
            int length=q.size();
            for(int i=0;i<length;i++)
            {
                Node curr=q.poll();
                arr.add(curr.val);

                //prev line node added to ll, traverse its neighbour from adj list- add them to q, del parent node from q--->BFS
                for(Node child:curr.children)
                    q.offer(child);
            }
            ll.add(arr);
        }
    return ll;
    }
}
/*Time Complexity (T.C.): 
𝑂(𝑁)
O(N), where 𝑁
N is the total number of nodes in the tree, as each node is visited once.

Space Complexity (S.C.): 
𝑂(𝑊)
O(W), where 𝑊
W is the maximum width of the tree (maximum number of nodes at any level) due to the queue.*/
