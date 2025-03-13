class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null)  return head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)//null par hi roko
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
//tc=O(N), sc=O(1)
