class Solution {
    // Function to find the height of a binary tree.
    
//EXPL:-
// TREE=12{8(-5,11),18}

// height(’12’) = max(height(‘8′), height(’18’)) + 1 = 1 + 1 = 2
// because recursively:................................................
// height(‘8’) = max(height(‘5′), height(’11’)) + 1 = 0 + 1 = 1
// height(’18’) = max(height(NULL), height(‘NULL’)) + 1 = (-1) + 1 = 0
// height(“5”) = max(height(NULL), height(‘NULL’)) + 1 = (-1) + 1 = 0
// height(“11”) = max(height(NULL), height(‘NULL’)) + 1 = (-1) + 1 = 0
    
    
//M1: recursion ...tc=O(n) , sc=O(1)
    int height(Node node) {
        // code here
        if(node==null)
            return -1;//not 0 else 1 extra height will come
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }
}

//M2:LEVEL ORDER TRAVERSAL...QUEUE
/*
[Expected Approach – 2] Using Level Order Traversal – O(n) Time and O(n) Space
The idea is, if we take a closer look at the depth first traversal, we can notice that after we process the last node of the current level, the next level is completely in the queue. We use this property and insert a special NULL into the queue to indicate end of a level.
*/

//M3:[Alternate Approach] Using Level Order Traversal – O(n) Time and O(n) Space
// This method also uses the same concept that when we process the last node of a current level, the next level is completely in the queue. Instead of adding a null in the Queue. Simply increase the counter when the level increases and push the children of current node into the queue, then remove all the nodes from the queue of the current Level.
