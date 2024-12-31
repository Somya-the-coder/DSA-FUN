class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // sub"string" hota toh sliding window could be applied
//subseq cannot have window so SUBSEQ_WORD(where heard?)=LCS(in daa subject) == DP
int n=arr.length;
if (n == 0) return 0;

//M3:OPTIMAL APPROACH- hashset
//hashset tc=O(1) and total code  tc=O(3N) ...but if rare W.C collisions happen then O(N) BY HASHSET TOO



//M2: BETTER APPROACH - sort(n log n)-for sorting + n(1 loop)
//sorting: but we're distorting the array and interviewer won't be happy 
//tell [brute , any other , then any of the concepts u've read] but try 
Arrays.sort(arr);
//take 3 variables simple
int longest=1,count_current=0,last_smaller=Integer.MIN_VALUE;
for(int i=0;i<n;i++)
{
    if(arr[i]-1==last_smaller)
    {
        count_current+=1;
        last_smaller=arr[i];
    }
    else if(arr[i]!=last_smaller)//start a new sequence
    {
        count_current=1;
        last_smaller=arr[i];
    }
    longest=Math.max(longest,count_current);
}
return longest;



// //M1:BRUTEFORCE - linear search
//     int max = 0;
//     // Brute force: Check each element as the start of a sequence
//     for (int i = 0; i < n; i++) {
//         int current = arr[i];
//         int count = 1;
//         // Check for the next consecutive elements
//         for (int j = 0; j < n; j++) {//linear search
//             if (arr[j] == current + 1) {
//                 current++;
//                 count++;
//                 j = -1; // Restart from the beginning to check for the next number
//             }
//         }
//         max = Math.max(max, count);
//     }
//     return max;
// //tc=O(n^2) , sc=O(1)



//M0: MY APPROACH
// //u can make subseq to substr by sorting but handle repeated elts(for subseq property)
//         Arrays.sort(arr);
//         int count=1,max=0;
//         for(int i=0;i<arr.length-1;i++)
//         {
//             if(arr[i+1]==arr[i]+1)
//                 count+=1;
//             else
//             {
//                 if(count>max)
//                 {
//                     max=count;
//                 }
//                 count=0;
//             }
//         }
//         return max;
    }
}
