/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // //BRUTEFORCE METHOD- JUST DATA CHANGES NOT LL(at internal)
        // //USING EXTRA SPACE i.e. STACK
        // //PUT LL DATA INTO STK IN 1 LOOP
        // //THEN DATA BACK FROM STK TO LL IN 2ND LOOP
        // //T.C=O(N+N) ,S.C=O(N)-stk 
        // ListNode temp=head;
        // Stack<Integer> stk=new Stack<>();
        // while(temp!=null)
        // {
        //     stk.push(temp.val);
        //     temp=temp.next;
        // }
        // temp=head;
        // while(temp!=null)
        // {
        //     temp.val=stk.peek();
        //     stk.pop();
        //     temp=temp.next;
        // }
        // return head;

        
        // //ITERATIVE METHOD - CHANGE LINKS(3 VAR + 4 STEPS)
        // ListNode curr=head;
        // ListNode prev=null;
        // ListNode next=null;
        // while(curr!=null)
        // {
        //     next=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=next;
        // }
        // return prev;//as head bina hile hi last mei jaa chuka hai


        //RECURSIVE METHOD
        //take U forward- best expl by striver bhaiya(of recursion--1st unwinds then winds)---T.C =S.C= O(n)
        if(head==null || head.next==null)//b.c until when array unwinds(1/0 nodes)
        {
            return head;
        }
        ListNode newnode=reverseList(head.next);
        //above array unwinding(breaking inti 1 node list as reversing 1 node is easiest )
        //winding of recursion
        ListNode front=head.next;//newnode=head from piche, front last node each time
        front.next=head;
        head.next=null;
        return newnode;
    }
}
