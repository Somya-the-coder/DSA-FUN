class Solution {
    Node reverseList(Node head) {
        //Iterative(easy)- 3 variables, 4 steps
        Node prev=null;
        Node curr=head;
        
        while(curr!=null)
        {
            Node next=curr.next;//write 2nd.....storing next 1st
            curr.next=prev;//write 1st
            prev=curr;//write 3rd
            curr=next;//write 4th
        }
        
        return prev;

        //Recursive
    }
}
