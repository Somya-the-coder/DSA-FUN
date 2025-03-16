import java.util.*;

class PrataCooking {
    
    // Function to check if we can cook `P` pratas in `mid` minutes
    public static boolean canCookPratas(int P, int[] ranks, int mid) {
        int pratasCooked = 0;
        
        for (int rank : ranks) {
            int timeTaken = 0, count = 0;
            
            while (timeTaken + (count + 1) * rank <= mid) {
                count++; // Increase prata count
                timeTaken += count * rank; // Update time taken
            }
            
            pratasCooked += count;
            if (pratasCooked >= P) return true; // If we reach P, return true
        }
        
        return false;
    }

    public static int minTimeToCookPratas(int P, int[] ranks) {
        int low = 1, high = 1000000, result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canCookPratas(P, ranks, mid)) {
                result = mid; // Store possible answer
                high = mid - 1; // Try for a smaller time
            } else {
                low = mid + 1; // Increase time if P pratas can't be cooked
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int P = sc.nextInt(); // Number of pratas needed
            int L = sc.nextInt(); // Number of cooks
            int[] ranks = new int[L];

            for (int i = 0; i < L; i++) {
                ranks[i] = sc.nextInt();
            }

            System.out.println(minTimeToCookPratas(P, ranks));
        }
        
        sc.close();
    }
}
/*
question:-

PRATA - Roti Prata
no tags 

IEEE is having its AGM next week and the president wants to serve cheese prata after the meeting. The subcommittee members are asked to go to food connection and get P (P ≤ 1000) pratas packed for the function. The stall has L cooks (L ≤ 50) and each cook has a rank R (1 ≤ R ≤ 8). A cook with a rank R can cook 1 prata in the first R minutes 1 more prata in the next 2R minutes, 1 more prata in 3R minutes and so on (he can only cook a complete prata) (For example if a cook is ranked 2, he will cook one prata in 2 minutes one more prata in the next 4 mins an one more in the next 6 minutes hence in total 12 minutes he cooks 3 pratas in 13 minutes also he can cook only 3 pratas as he does not have enough time for the 4th prata). The webmaster wants to know the minimum time to get the order done. Please write a program to help him out.

Input
The first line tells the number of test cases. Each test case consist of 2 lines. In the first line of the test case we have P the number of prata ordered. In the next line the first integer denotes the number of cooks L and L integers follow in the same line each denoting the rank of a cook.

Output
Print an integer which tells the number of minutes needed to get the order done.

Example
Input:
3
10
4 1 2 3 4
8
1 1
8
8 1 1 1 1 1 1 1 1

Output:
12
36
1
*/
/*
HOW BINARY SEARCH CAN BE USED TO SOLVE THIS:-
Step-by-Step Approach
1. Apply Binary Search on Time
Since we don’t know the exact minimum time required, we can use binary search on time.

Lower bound (low) = 1 minute (best case scenario)
Upper bound (high) = a very large number (worst case, if the slowest cook made all pratas alone)
Goal = Find the minimum possible time where we can cook all P pratas.
2. Check Feasibility for a Given Time
For a given mid (potential answer), check if all P pratas can be cooked in mid minutes using:

Start with 0 pratas cooked.
Loop through each cook and count how many pratas they can cook in mid minutes.
If the total pratas cooked ≥ P, the time is feasible.
3. Adjust Binary Search Range
If we can cook P pratas in mid minutes → Try a lower time (high = mid).
Else → Increase time (low = mid + 1).
*/
