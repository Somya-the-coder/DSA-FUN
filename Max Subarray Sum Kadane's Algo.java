class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    
    //IMP INTERVIEW QUESTION: MAX SUM OF ANY SUBARRAY IN THE GIVEN ARRAY

    int maxSubarraySum(int[] arr) {
        
    int n=arr.length;
    int max_sum=Integer.MIN_VALUE;
    // System.out.println(max_sum);
    
// //M1:BRUTEFORCE---O(n^3)--------------------------------------------------------------------

//     int start=0,end=0,sum=0;
//     for(int i=0;i<n;i++)
//     {
//         // start=i;
//         for(int j=i;j<n;j++)//j=i+1 is wrong
//         {
//             // end=j;
//             sum=0;
//             for(int k=i;k<=j;k++)
//             {
//                 sum+=arr[k];
//             }
//             if(sum>max_sum)
//                 max_sum=sum;
//         }
//     }
//     return max_sum;
    



// //M2:PREFIX SUM---O(n^2)--------------------------------------------------------------------

// int prefix[]=new int[n];
// prefix[0]=arr[0];
// int curr=0;

// for(int i=1;i<n;i++)
//     prefix[i]=prefix[i-1]+arr[i];

// for(int i=0;i<n;i++)
// {
//     for(int j=i;j<n;j++)
//     {
//         //ternary(3 expressions)/conditional(like if else in single line)
//         curr =  (i==0)?prefix[j]:prefix[j]-prefix[i-1];
//         if(curr>max_sum)
//             max_sum=curr;
//     }
// }
//     return max_sum;



//M3:KADANE'S ALGORITHM------------------------------------------------------------
/*
uses simple observation:
+ve + +ve = +ve
+ve + -ve = +ve
+ve + big -ve = -ve
*/
int ms=Integer.MIN_VALUE;//or arr[0]---ms=maximum sum
int cs=0;//---cs=maximum sum
for(int i=0;i<n;i++)
{
    cs=cs+arr[i];
    ms=Math.max(cs,ms);// Update maximum sum
    if(cs<0)//no need of carrying on something which may hamper/decrease our sum
        cs=0;// Reset current sum only if it's negative
    // ms=Math.max(cs,ms);// Update maximum sum........do not write here
}
return ms;
    }
}
