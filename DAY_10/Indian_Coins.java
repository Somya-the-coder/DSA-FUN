class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here- if array was passed then uncomment
        Integer[] coins={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };//int[] ke saath Comparator.reverseorder method can't be used so make it an object i.e. Integer[]
        Arrays.sort(coins,Comparator.reverseOrder());//descending order(MAIN THING)        
        int amount=N;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {
            // if(coins[i]<=amount)//descending so chill(grredy hai hum- max hi uthayenge har baar)
            // {
                while(coins[i]<=amount)//coins infinite no. of times available haina toh from decreasing order max ko minus kar karke dekh lo kitna use ho skta hai
                //eg 121={2000,500,200}-no ; 100-yes so 100 jitna baar ho sake - karo (1 hi baar else -ve ho jaayega and 50-no, 20 yes them 5,2-no; 1 yes...arraylist[100,20,1])
                {
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            // }
        }
        return ans;
    }
}
