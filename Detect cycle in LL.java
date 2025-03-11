//ANOTHER VIP QS IN THIS- FIND POINT OF INTERSECTION OF CYCLE- SO ONCE SLOW==FAST.AGAIN FAST FROM HEAD AND KEEP SLOW AT (SLOW==FAST) AGAIN MOVE BY 1 AND 2 AND THEY'LL
//OBVIO NOW MEET AT THE POINT OF INTERSECTION........I think this expl is wrong instead...

//refer to explaination of code - Remove cycle from LL.java
// DETECT CYCLR IN LL
Class Solution
  {
    public static boolean detectLoop(Node head)
      {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
          {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
              return true;
          }
        return false;
      }
  }
//T.C=O(n)
//S.C=O(1)
//ALSO WE can do it using hashmap- tracking the already traveresed node(if again reached means there exists a cycle- but here t.c toh O(n) hai hi and s.c. also is O(n)
//So above hare-turtoise approach is optimal and goooood




//again practice
/*
// User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}


class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        //loop in LL=2 pointers i.e. [hare-turtle / fast-slow]
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
}
*/
