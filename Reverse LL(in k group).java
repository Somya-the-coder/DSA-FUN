/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
    //simple-reverse you know now divide into two parts and and call reversal
    //recursion is required
    if (head==null)
    {
        return head;
    }
    Node curr=head;
    Node newHead=null;
    Node tail=null;
    
    while(curr!=null){
        Node groupHead=curr;
        Node prev=null;
        Node nextNode=null;
        int count=0;
        
        //Reverse the nodes in the current group 
        while(curr!=null && count<k)
        {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            count++;
        }
        
        //unwinding so piche se zur raha hai
        //if newHead is null,set it to the last node of the first group
        if(newHead==null){
            newHead=prev;
        }
        //connect the previous group to the current reversed group(piche se)
        if(tail!=null){
            tail.next=prev;
        }
        //Move tail to the end of the reversed group
        tail=groupHead;
    }
    return newHead;
    }
}
