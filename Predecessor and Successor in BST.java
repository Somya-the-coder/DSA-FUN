// tc=sc=O(height of bst)
class Solution {
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        Node curr=root;
        //successor
        while(curr!=null)
        {
            if(key>=curr.data)//then on right you'll get the successor
            {
                curr=curr.right;
            }
            else
            {
                suc[0]=curr;
                curr=curr.left;//""""""""""""""""""""""""""inorder suc=leftmost node in right subtree""""""""""""""""""""""""""""""""""""""""
            }
        }
        
        curr=root;
        //predecessor
        while(curr!=null)
        {
            if(key<=curr.data)
            {
                curr=curr.left;
            }
            else
            {
                pre[0]=curr;
                curr=curr.right;//"""""""""""""""""""""""""""""""""inorder pred=rightmost node in the left subtree"""""""""""""""""""""""""""""""""""""""
            }
        }
    }
}
//my first thinking approach...call inorder(root); & print key's just after and jsut before elts

//MY TALKS:-------------------------------------------------
        //Node[] pre->object....node[] pre=new Node;
        
    //successor....=inorder successor(just right & grandchild)
    //predecessor....=inorder predecessor(just left & grandchild)
        
        //M1:ITERATIVE
                //tc=n,sc=1
                //  while(node.next!=null).....used in LL Beti

        //M2:RECURSION...Tree goes both sides so recusion use karna hi hoga
        //B.C
