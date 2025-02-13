//MOVED LAST ELT TO 1ST
class Solution {
    public static Node moveToFront(Node head) {
        Node curr=head;
        while(curr.next.next!=null)
        {
            curr=curr.next;
        }
        Node last=curr.next;
        curr.next=null;
        
        last.next=head;
        head=last;
        
        return head;
        
////MOVED 1ST ELT TO LAST:-
        // //in LL question always a first line is:-
        // Node curr=head;
        // Node first=curr;
        // head=head.next;
        // while(curr.next!=null)//I need last node ; not the null value
        // {
        //     curr=curr.next;
        // }
        // curr.next=first;
        // first.next=null;
        
        // return head;
    }
}
