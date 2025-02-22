 /*
  square(n) = 0 if n == 0
  if n is even 
     square(n) = 4*square(n/2) 
  if n is odd
     square(n) = 4*square(floor(n/2)) + 4*floor(n/2) + 1 

Examples
  square(6) = 4*square(3)
  square(3) = 4*(square(1)) + 4*1 + 1 = 9
  square(7) = 4*square(3) + 4*3 + 1 = 4*9 + 4*3 + 1 = 49
 */

class Toh{
    static int square(int n)
    {
        // base case
        if(n==0) return 0;
        if(n<0) n=-n;//make -ve no. positive otherwise bitwise 1,s 2,s complembt karke rula dega(;)
        //get floor using (n/2)->right shift
        int x=n>>1;
        //if n is odd
        if(n%2!=0)  return ((square(x)<<2)+(x<<2)+1);//above formula ka implementation only 4*(n/2)=2*n=left shift by 2
        //if n is even
        else return (square(x)<<2);
    }
    // Driver code
    public static void main(String args[])
    {
        // Function calls
        for (int n = 1; n <= 5; n++)
            System.out.println("n = " + n
                               + " n^2 = " + square(n));
    }
}
//TC=SC=O(log n)
