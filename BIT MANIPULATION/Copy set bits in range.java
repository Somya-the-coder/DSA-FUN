class Solution{
    static int setSetBit(int x, int y, int l, int r){
        // code here
        //PEPCODING KILLED THE EXPALINATION, GREAT!
        //DRY-RUN THIS CODE
        int mask=(1<<(r-l+1));//window size alw=r-l+1...do rough with small eg and see
        mask--;
        mask=(mask<<(l-1));
        
        mask = (mask&y);
        x = (x|mask);
        
        return x;
    }
}
