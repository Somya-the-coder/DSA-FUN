class Solution {
    static int setBits(int n) {//no. of set bits means find no. of 1's
        // code here
        int count=0;
        while(n!=0)
        {
            //if(n%10==1) count++;
            if((n&1) != 0)    count++;//n&1==0 then even else odd---this concept is used here
            n=n>>1;
        }
        return count;
    }
}
//tc= O(log n base 2+1)...any no. can be represented in bonary as log n base 2 + 1
//sc=O(1)
/*
TC...........
n each iteration, n is right-shifted by 1 (n = n >> 1), effectively dividing it by 2.
The number of times we can divide 𝑛 by 2 before it becomes 0 is O(logn) (base 2).
SC..........
We use only a few integer variables (count, n), which take constant space.
No extra data structures (arrays, recursion stack, etc.) are used.
*/
