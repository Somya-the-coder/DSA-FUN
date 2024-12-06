class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
    //OPTIMAL APPROACH : BRUTEFORCTWO POINTERS(+ SORTED ARRAY)
        int n=numbers.length;
        int ans[]=new int[2];
        int i=0,j=n-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]<target) i++;
            else if(numbers[i]+numbers[j]>target) j--;
            else if(numbers[i]+numbers[j]==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }
}
//         //BRUTEFORCE
//         int n=numbers.length,c=0;
//         int ans[]=new int[2];
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(numbers[i]+numbers[j] == target)
//                 {
//                     ans[0]=i+1;
//                     ans[1]=j+1;
//                     c=1;
//                 }
//             }
//             if(c==1)
//                 break;
//         }
//         return ans;  
//     }
// }
