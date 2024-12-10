class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
//M3: OPTIMAL(AND BEST WHAT I UNDERSTAND)-- see striver's optimal (good pointer visualization explaination)
//4 variables(2 fixed for a loop , 2 moving like i,j,k,...,l)->k++;l--;
//T.C=n*n*(n-3)=O(n^3)....n-3 for k running from 3rd position till last so almost n.
//S.C=O(1)- as we're taking 0 or no space in deriving the answer(just n space in returning the answer- that's not the part of S.C)
int n=nums.length;
List<List<Integer>> ans=new ArrayList<>();
Set<List<Integer>> set=new HashSet<>();
Arrays.sort(nums);
for(int i=0;i<n;i++)
{
    if(i>0 && nums[i]==nums[i-1]) continue;
    for(int j=i+1;j<n;j++)
    {
        if(j!=(i+1) && nums[j]==nums[j-1]) continue;
        int k=j+1;
        int l=n-1;
        while(k<l){
            long sum=nums[i];
            sum+=nums[j];
            sum+=nums[k];
            sum+=nums[l];
            if(sum==target)
            {
                set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                k++;l--;
            }
            else if(sum<target) k++;
            else l--;
        }
    }
}
// return ans.addAll(set);//-error- boolean cannot be converted to List<List<Integer>>
ans.addAll(set);
return ans;
    }
}

//M2: BETTER - (WRITE FEW LINES AND CALL 3 SUM) 

// //M1: BRUTEFORCE- USE HASHSET TO AVOID DUPLICATES - TLE ERROR
//         int n = nums.length;
//         Set<List<Integer>> resultSet = new HashSet<>(); // Use a HashSet to avoid duplicates
        
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 for (int k = j + 1; k < n; k++) {
//                     for (int l = k + 1; l < n; l++) {
//                         if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
//                             List<Integer> temp = new ArrayList<>();
//                             temp.add(nums[i]);
//                             temp.add(nums[j]);
//                             temp.add(nums[k]);
//                             temp.add(nums[l]);
//                             temp.sort(null); // Ensure the list is in sorted order
//                             resultSet.add(temp); // Add to the set to prevent duplicates
//                         }
//                     }
//                 }
//             }
//         }
        
//         return new ArrayList<>(resultSet); // Convert the set to a list before returning
//     }
// }
