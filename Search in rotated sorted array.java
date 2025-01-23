//rem we're doing bin search=O(log n) as linear search its O(n)

class Solution {
    public int search(int[] nums, int target) {
//         //Arrays.sort(nums);-- u can't else o/p index will come as per sorted array
//ITS A PLAY WITH BINARY SEARCH-DAA SUBJ WAS SUPERBBBBBB!!!!!!--thanks Striver Bhaiya 
//striver says - hey! 1st tell linear search then say(since array is sorted & search so binary search offers better TC is sorted)

int n=nums.length;
int l=0,h=n-1;
while(l<=h)//always<"=" sign don't forget
{
    int mid=(l+h)/2;
    //rem: even in a rotated sorted array one half is sorted 
    if(nums[mid]==target)   return mid;
    //if left sorted
    if(nums[l]<=nums[mid])//= is necessary
    {
        if(nums[l]<=target && target<nums[mid])  h=mid-1;//= in any one
        else    l=mid+1;
    }
    //if right sorted
    else
    {
        if(nums[mid]<target && target<=nums[h])  l=mid+1;
        else    h=mid-1;;
    }
}
return -1;
    }
}
