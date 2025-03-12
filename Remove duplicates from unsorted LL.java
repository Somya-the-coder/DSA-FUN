class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        
        if(head==null)  return null;
        
        HashSet<Integer> s=new HashSet<>();
        s.add(head.data);
        
        Node temp=head;
        
        while(temp.next!=null)//not check last node as its already checked
        {
            if(s.contains(temp.next.data)){
                temp.next=temp.next.next;
                // continue;
            }  
            else{
                s.add(temp.next.data);
                temp=temp.next;
            }
        
        }
        return head;
    }
}
//tc=O(N), sc=O(N) in worst case when all N elements are unique
