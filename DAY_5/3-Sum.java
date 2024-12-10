//M1:  bruteforce will be 3 loop laga lo

//M2:  3 POINTERS
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //VVIP SORT ARRAY: THEN ONLY THIS TECHNIQUE WILL WORK(3 pointer at 1st,2nd,last[2 sum - 2 pointer])
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)//this loop extra than 2 sum
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)//two sum ka i here is j and j here is k
            {
                if(nums[i]+nums[j]+nums[k] == 0)
                {
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k] < 0)
                    j++;
                else
                    k--;
            }
        }
        ans.addAll(set);
        return ans;
    }
}



//M3 : Also more optimal 3 sum making it 2 sum
import java.util.*;

// class Solution {

//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         Arrays.sort(nums); // Step 1: Sort the array
        
//         for (int i = 0; i < nums.length - 2; i++) {
//             // Skip duplicates for the first number
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }
            
//             int target = -nums[i]; // We need to find two numbers that sum to -nums[i]
//             twoSum(nums, i + 1, target, res, nums[i]);
//         }
        
//         return res;
//     }

//     private void twoSum(int[] nums, int start, int target, List<List<Integer>> res, int firstNum) {
//         int end = nums.length - 1;

//         while (start < end) {
//             int sum = nums[start] + nums[end];

//             if (sum == target) {
//                 res.add(Arrays.asList(firstNum, nums[start], nums[end]));

//                 // Skip duplicates for the second and third numbers
//                 while (start < end && nums[start] == nums[start + 1]) start++;
//                 while (start < end && nums[end] == nums[end - 1]) end--;
                
//                 start++;
//                 end--;
//             } else if (sum < target) {
//                 start++;
//             } else {
//                 end--;
//             }
//         }
//     }
// }

/*above expl:-
THIS LINE: if (i > 0 && nums[i] == nums[i - 1]) .........
accha 1st elt ko skip karega 
2nd array elt se check karlega agar wo aur 2nd pointer 0 de raha hai toh 2 ka sum 0 ho jaayega but hame 3 ka sum 0 chahiye  ...isliye ye condition mei continue kar de raha hai
Shayad*/
