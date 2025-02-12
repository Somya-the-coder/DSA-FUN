/*// GREAT ACHIEVEMENT BAUWI!!!
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    public Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        //1st thing...neha ma'am -> allergy hai head se chherkhani mei
        Node curr=head;
        Node head1=reverse(curr);//diff head
        // System.out.print(curr.data+1);
        Node curr1=head1;
        while(curr1.data==9)
        {
            curr1.data=0;
            if(curr1.next==null)//for 999
            {
                Node newNode = new Node(1);
                curr1.next=newNode;
                return reverse(head1);
            }
            curr1=curr1.next;
        }
        curr1.data=curr1.data+1;
    return reverse(head1);
}

}
/*
Time Complexity (TC): O(N) – Each node is traversed a constant number of times (once for reversal, once for addition, once for final reversal).

Space Complexity (SC): O(1) – No extra space is used apart from a few pointers, as the reversal and modification are done in-place.
*/
