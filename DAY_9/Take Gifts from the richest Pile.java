class Solution {
    public long pickGifts(int[] gifts, int k)
    {
        long sum=0;
        int max=0,index=0;
        while(k>0)
            {
                for(int j=0;j<gifts.length;j++)
                {
                   if(gifts[j]>max)
                   {
                    max=gifts[j];
                    index=j;
                   }
                }
                gifts[index]=(int)Math.floor(Math.sqrt(gifts[index]));
                max=0;index=0;k--;
            }

            for(int i=0;i<gifts.length;i++)
            {
                sum+=gifts[i];
            }
            return sum;
    }
}
