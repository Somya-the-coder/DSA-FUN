class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1; // Base case for 1 step(obvio can't be 0 stair)/ or keep it inside for(in DSA notes see)...then begin loop from 1

        int dp[] = new int[n + 1];//0th row and col extra for initialization(as read in DAA reqd to complete table as next row is filled using prev row values)

        // Base cases
        dp[0] = 1; // 1 way to stay on the ground (no steps)
        dp[1] = 1; // 1 way to reach the first step

        // Tabulation
        for (int i = 2; i <= n; i++) {//as i-1 is a base case/initialization step
            dp[i] = dp[i - 1] + dp[i - 2];//2 steps so min subproblem (5 par hai toh -1 and -2 se waha tak kaise pohochenge again -1 & -2)
        }

        return dp[n];
    }
}
