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
                // LLOOGGIICC LINE....................:-just add right child 1st then left
                if(node.right!=null)    q.add(node.right);
                if(node.left!=null) q.add(node.left);
            }
        }
                Collections.reverse(ans);
                return ans;

    }
}
//tc=sc=O(N)
/*
expalin like this:-
### **Time Complexity (TC) & Space Complexity (SC) Analysis**  

#### **Time Complexity (TC):**  
- Each node is visited **once** in the while loop → **O(N)**
- Removing elements from the queue → **O(1)** per operation
- Adding elements to the queue → **O(1)** per operation
- **Reversing the list** at the end → **O(N)**  

**Total Time Complexity:**
\[
O(N) + O(N) = O(N)
\]

#### **Space Complexity (SC):**  
- **Queue (`q`)** stores at most one level of the tree at a time. In the worst case (for a balanced binary tree), it can store **O(N/2) ≈ O(N)** nodes.
- **ArrayList (`l`)** stores **all N nodes** → **O(N)**
- **Overall SC:** **O(N) + O(N) = O(N)**  

### **Final Complexity:**
- **Time Complexity: O(N)**
- **Space Complexity: O(N)**
*/
