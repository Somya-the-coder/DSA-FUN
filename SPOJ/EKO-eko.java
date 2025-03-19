import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();  // Number of trees
        int M = in.nextInt();  // Required wood
        int[] trees = new int[N];

        int maxTree = 0;
        for (int i = 0; i < N; i++) {
            trees[i] = in.nextInt();
            maxTree = Math.max(maxTree, trees[i]);
        }

        System.out.println(findMaxSawHeight(trees, M, maxTree));
        in.close();
    }

    public static int findMaxSawHeight(int[] trees, int M, int maxTree) {
        int low = 0, high = maxTree, bestHeight = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            long wood = woodCollected(trees, mid);

            if (wood >= M) {  
                bestHeight = mid;  // Store best valid height
                low = mid + 1;  // Try for a higher saw height
            } else {
                high = mid - 1;  // Try for a lower saw height
            }
        }
        return bestHeight;
    }

    public static long woodCollected(int[] trees, int H) {
        long wood = 0;
        for (int height : trees) {
            if (height > H) wood += height - H;
        }
        return wood;
    }
}


/*
EKO - Eko
#binary-search

Lumberjack Mirko needs to chop down M metres of wood. It is an easy job for him since he has a nifty new woodcutting machine that can take down forests like wildfire. However, Mirko is only allowed to cut a single row of trees.

Mirko‟s machine works as follows: Mirko sets a height parameter H (in metres), and the machine raises a giant sawblade to that height and cuts off all 
tree parts higher than H (of course, trees not higher than H meters remain intact). 
Mirko then takes the parts that were cut off. For example, if the tree row contains trees with 
heights of 20, 15, 10, and 17 metres, and Mirko raises his sawblade to 15 metres, the remaining tree heights after cutting will be
15, 15, 10, and 15 metres, respectively, while Mirko will take 5 metres off the first tree and 2 metres off the fourth tree (7 metres of wood in total).

Mirko is ecologically minded, so he doesn‟t want to cut off more wood than necessary. That‟s why he wants to set his sawblade as high as possible. Help Mirko find the maximum integer height of the sawblade that still allows him to cut off at least M metres of wood.

Input
The first line of input contains two space-separated positive integers, N (the number of trees, 1 ≤ N ≤ 1 000 000) and M (Mirko‟s required wood amount, 1 ≤ M ≤ 2 000 000 000).

The second line of input contains N space-separated positive integers less than 1 000 000 000, the heights of each tree (in metres). The sum of all heights will exceed M, thus Mirko will always be able to obtain the required amount of wood.

Output
The first and only line of output must contain the required height setting.

Example
Input:
4 7
20 15 10 17
Output:
15

Input:
5 20
4 42 40 26 46
Output:
36

//TC
Time Complexity: O(N log maxHeight), which is much faster than brute force (O(N * maxHeight)).
Time Complexity
Binary search on H → O(log maxHeight).
Wood collection (each iteration) → O(N).
Overall Complexity: O(N log maxHeight). 🚀 Efficient for large inputs!

overall s.c.=O(1)


//why BIN SEARCH:-
.

🔹 Optimal Approach: Binary Search
Since H lies between 0 and max(tree height), we can use binary search to efficiently find the maximum possible height.

Algorithm (Binary Search on H)
Set low = 0 and high = max(tree height).
While low ≤ high:
Find mid = (low + high) / 2.
Compute wood collected at height mid.
If wood collected ≥ M → Increase H (low = mid + 1).
If wood collected < M → Decrease H (high = mid - 1).
Return the last valid H (stored in high).

*/
