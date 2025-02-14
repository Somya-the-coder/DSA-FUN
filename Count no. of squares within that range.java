/*
Consider a sample space consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number n, you have to find the number of integers less than n in the sample space.

Examples :

Input: n = 9
Output: 2
Explanation: 1 and 4 are the only Perfect Squares less than 9. So, the Output is 2.
Input: n = 3
Output: 1
Explanation: 1 is the only Perfect Square less than 3. So, the Output is 1.
Input: n = 5
Output: 2
Constraints:
1 <= n <= 108
*/

class Solution {
    static int countSquares(int n) {
        // code here
        int i=1;
        while(i*i<n)
        {
            // System.out.println(i*i);
            i++;
        }
        return i-1;
    }
}
