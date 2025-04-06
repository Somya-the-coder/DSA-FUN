
// User function Template for Java 

/* class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class Solution {
    public static Node findFirstNode(Node head) {
        // code here 
        Node slow=head,fast=head;
        int j=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                j=1;
                break;
            }
        }
        if(j==1)
        {
            slow=head;
            while(slow!=fast)
            {
                fast=fast.next;
                slow=slow.next;
            }
            return fast;
        }
        else
        {
            return null;
        }
    }
}
