//Bitwise operations (<<, &, |) take constant time , so T.C.=O(1)
//We use only a few integer variables (mask, x, y, l, r), which take constant space. so S.C.=o(1)
O(1) in a fixed-size integer.

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
