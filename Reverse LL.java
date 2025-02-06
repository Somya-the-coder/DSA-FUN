class Solution {
    Node reverseList(Node head) {
        //M1:LL-STK-LL
 
        
        // //M2: Iterative(easy)- 3 variables, 4 steps
        // Node prev=null;
        // Node curr=head;
        // while(curr!=null)
        // {
        //     Node next=curr.next;//write 2nd.....storing next 1st
        //     curr.next=prev;//write 1st
        //     prev=curr;//write 3rd
        //     curr=next;//write 4th
        // }
        // return prev;

     
        // //M3: Recursive
        if(head==null || head.next==null)   return head;//.......striver mast expl at last video
        Node newnode=reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newnode;

    }
}
