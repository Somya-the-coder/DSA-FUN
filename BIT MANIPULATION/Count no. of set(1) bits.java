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
