/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

//METHOD 1: TWO POINTERS APPROACH
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int flag=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                fast=head;
                while(fast!=slow)//milega hee...cycle hai toh dobara from 1st and point of intersection se 1-1 chalao milega hi ...equal distance par
                {
                fast=fast.next;
                slow=slow.next;                
                }
                return fast;
            }    
        }
        return null;
    }
}
//T.C.=O(n)
// S.C.=O(1)

//same above cheez in 2 loops
/*
       ListNode fast=head;
        ListNode slow=head;
        int flag=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            fast=head;
            while(slow!=fast)
            {
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
        }
        else
            return null;
*/

/*
//METHOD 2:- HASHMAP
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; 
        }
        HashSet<ListNode> visited = new HashSet<>();

       ListNode current =head;
      while(current != null){
        if(visited.contains(current)){
            return current;
        }
        visited.add(current);
        current=current.next;
      }
        return null;
    }
}
// T.C.=O(n)
// S.C.=O(n)
*/
