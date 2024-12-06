class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
            HashSet<Integer> hs=new HashSet<>();
            for(int i:banned){ hs.add(i); }
            int sum=0,count=0;
            for(int i=1;i<=n;i++)
            {
                if(!hs.contains(i))
                {
                    sum+=i;
                    if(sum<=maxSum) 
                        count++;
                    else
                        break;
                }
            }
            return count;
    }
}
