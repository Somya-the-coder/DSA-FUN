//FIXED SIZE SLIDING WINDOW , BUT 1ST DON'T FORGET TO WRITE BRUTEFORCE
class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        //M1: BRUTEFORCE...TC=O(N*k),SC=O(1)
            //2 loops 1 from 0 to n and inner till window size
        //M2: OPTIMIZED - SLIDING WINDOW - V.EASY...TC=O(N),SC=O(1)
            int i=0,j=0;
            int max=arr[0],sum=0;
            //window size=j-i+1...used many places
            while(j<arr.length)
            {
                sum+=arr[j];
                if(j-i+1<k)
                {
                    j++;
                }
                else if(j-i+1==k)
                {
                    max=Math.max(sum,max);
                    sum-=arr[i];
                    i++;j++;
                }
            }
            return max;
    }
}
