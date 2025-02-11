class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        //M1: TLE...TC=SC=O(N)
        if(head==null || head.next==null)   return head;
        Node curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data==curr.next.data)   curr.next=curr.next.next;
            else    curr=curr.next;
        }
        return head;
    }
}

// //M2: RETURNING A LL MIGHT COMPLICATE , BUT THE SET RETURNED IS THE CORRECT ANSWER
//   Node removeDuplicates(Node head) {
//         // Your code here
//         //pahilka stepe ihe hokhe ke chahi
//         Node curr=head;
//         HashSet<Integer> set=new HashSet<>();
//         while(curr!=null)
//         {
//             set.add(curr.data);
//             curr=curr.next;
//         }
//         System.out.println(set);
