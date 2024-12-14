/{ Driver Code Starts
import java.io.*;
import java.util.*;

class Reversing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading total number of test cases
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            // Creating a Queue
            Queue<Integer> queue = new LinkedList<>();

            // Reading all the elements as a string
            String input = br.readLine();

            // Splitting the string into separate elements based on spaces
            String[] elements = input.split(" ");

            // Adding all the elements to the Queue
            for (String element : elements) {
                int value = Integer.parseInt(element);
                queue.add(value);
            }

            // Creating an object of class Solution
            Solution solution = new Solution();

            // Calling reverseQueue method of class Solution
            queue = solution.reverseQueue(queue);

            // Printing the elements of the reversed queue
            while (!queue.isEmpty()) {
                int value = queue.peek();
                queue.poll();
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        
        // //M1: BRUTEFORCE: Q-S-Q(TLE Error)
        // // code here.-JCF so we can use "add, remove, peek, isEmpty()"
        // //rem Q-remove(),add() & Stack-push(),pop()
        // Stack<Integer> stk=new Stack<>();
        // while(!queue.isEmpty())
        // {
        //     stk.push(queue.remove());
        // }
        // while(!stk.isEmpty())
        // {
        //     queue.add(stk.pop());
        // }
        // return queue;
        
        
        //M2: RECURSION
        //remove from Q (ofcourse front elts as FIFO-normal Q removes from front)
        //add removed elts back to Q(Ofcourse rear mei as normal Q adds as rear)
        //base case- when Q empty return...
    if (queue.isEmpty()) return queue; // Explicitly return the queue object//-> OR if(queue.size()==0)
    int elt = queue.poll();
    reverseQueue(queue);
    queue.add(elt);
    return queue; // Return the reversed queue
    }
}
