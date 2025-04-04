import java.util.*;

public class DieHard {
    
    static int[][][] dp;

    public static int solve(int h, int a, int move) {
        // Base case: if health or armor drops below or equal to 0, you die
        if (h <= 0 || a <= 0) return 0;

        // Memoization check
        if (dp[h][a][move] != -1) return dp[h][a][move];

        int x = 0, y = 0;

        // You cannot stay in the same place twice, so alternate places
        if (move != 0) // not coming from air
            x = 1 + solve(h + 3, a + 2, 0); // move to air

        if (move != 1) // not coming from water
            y = 1 + solve(h - 5, a - 10, 1); // move to water

        int z = 0;
        if (move != 2) // not coming from fire
            z = 1 + solve(h - 20, a + 5, 2); // move to fire

        return dp[h][a][move] = Math.max(x, Math.max(y, z));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int h = sc.nextInt();
            int a = sc.nextInt();
            
            // Initialize DP array
            dp = new int[1005][1005][3];
            for (int i = 0; i < 1005; i++)
                for (int j = 0; j < 1005; j++)
                    Arrays.fill(dp[i][j], -1);

            // First move: always go to Air (best survival option)
            int result = solve(h + 3, a + 2, 0) + 1;
            System.out.println(result);
        }
        sc.close();
    }
}
/*
🔚 Final Answer:
Measure	Complexity
Time Complexity	O(H * A * 3) ⇒ O(3 * 10^6)
Space Complexity	O(H * A * 3) ⇒ O(3 * 10^6)
*/
