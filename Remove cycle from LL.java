/*
class Node
{
    int data;
    Node next;
}
*/
//cycle at head is a confusing corner case - usually contests do not keep it
class Solution {//                  tc=O(n), sc=O(1)
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        //1st meet of slow-fast detects cycle exists, ----turtlr-hare is called floyd cycle detection algorithm
        //To make them meet again, once then meet ,
        //let fast remain there and slow again start from head
        //and increase both pointers by 1 now , they'll meet at the point of intersection of cycle wala node "always"
        //keep a track of fast's prev, & make its next as null
        //Thus, loop removed
        if(head==null || head.next==null)   return;
        
        Node fast=head,slow=head;
        boolean loopExists=false;
        //step 1: detect loop using floyd cycle detection algorithm
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            //step 2: if cycle is detected
            if(fast==slow)
            {
                loopExists=true;
                break;
            }
        }
       if(!loopExists) return;//then no cycle so return;it works ;returns nothing;(since void)
        
        //step 3: find the loop start node
        slow=head;
        // Node prev=null;//.NO USE

//THIS CASE HANDLING IS VIP
        //if loop starts from head,we need special handling
        if(slow==fast){
            while(fast.next!=slow){//move fast till it reaches the last node
                fast=fast.next;
            }
            fast.next=null;
            return;
        }
        //else Move both pointers one step at a time until they meet at the loop start
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }
}
