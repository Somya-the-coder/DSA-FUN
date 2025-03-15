class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)==i+1)
                l.add(i+1);
        }
        return l;
    }
}
//tc=O(N) w.c and O(1) b.c
//sc=O(N)
