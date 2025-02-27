//Bitwise operations (<<, &, |) take constant time , so T.C.=O(1)
//We use only a few integer variables (mask, x, y, l, r), which take constant space. so S.C.=o(1)
//O(1) in a fixed-size integer.

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
/*
EXAMPLE:-
x = 10100000 (Binary, 8 bits)
y = 11011010 (Binary, 8 bits)
l = 3, r = 5 (We want to copy bits from positions 3 to 5 of y into x)

ANSWER:-
mask = (1 << (r - l + 1));.........................Create a mask of ones for the given range
(r - l + 1) = (5 - 3 + 1) = 3
1 << 3 gives 1000 (which is 8 in decimal)


mask--;...........................................Convert it into all 1s
1000 - 1 = 0111 (which is 7 in decimal)
Now, mask = 00000111 (since it's 3 bits set to 1).


mask = (mask << (l - 1));..................................Shift it to align with the position l
l - 1 = 3 - 1 = 2
mask = 00000111 << 2 = 00011100
Now, mask = 00011100, which represents the bit positions we want to modify.


mask = (mask & y);..................................Extract the bits from y
y = 11011010
mask = 00011100
............mask & y results in:
  11011010
& 00011100
------------
  00011000  (which is `24` in decimal)


x = (x | mask);.................................  Merge with x
x = 10100000
mask = 00011000
.................................x | mask results in:
  10100000
| 00011000
------------
  10111000
*/
  
