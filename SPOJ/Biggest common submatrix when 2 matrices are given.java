// VIOLA ... HAPPY 100 DAYS OF CODING SOMYA VERMA... SOMI😁💕

/*
Brute Force: Tries all squares, too slow for large cases.
Optimized (Binary Search + Hashing): Uses row/column hashing + binary search, making it efficient.

NOTE:-------------------------------
📝 Rule of Thumb:

If you're finding the largest (maximization problem) → 🔍 Binary Search!
If you're just finding an occurrence → ❌ No need for Binary Search!

*/

//OPTIMAL APPROACH:-
import java.util.*;

public class Main {
    static int n, m, x, y;
    static String[] rowA, rowB, colA, colB;

    public static int largestCommonSubsquare() {
        int low = 1, high = Math.min(n, x), best = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (existsCommonSubsquare(mid)) {
                best = mid; // Try larger square
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return best;
    }

    public static boolean existsCommonSubsquare(int size) {
        Set<String> hashSetA = new HashSet<>();
        for (int i = 0; i + size <= n; i++) {
            for (int j = 0; j + size <= m; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < size; k++) {
                    sb.append(rowA[i + k].substring(j, j + size)).append("|");
                }
                hashSetA.add(sb.toString());
            }
        }

        for (int i = 0; i + size <= x; i++) {
            for (int j = 0; j + size <= y; j++) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < size; k++) {
                    sb.append(rowB[i + k].substring(j, j + size)).append("|");
                }
                if (hashSetA.contains(sb.toString())) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = in.nextInt();

        x = in.nextInt();
        y = in.nextInt();
        int[][] B = new int[x][y];

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                B[i][j] = in.nextInt();

        // Convert rows and columns into hashable strings
        rowA = new String[n];
        rowB = new String[x];
        colA = new String[m];
        colB = new String[y];

        for (int i = 0; i < n; i++) rowA[i] = Arrays.toString(A[i]);
        for (int i = 0; i < x; i++) rowB[i] = Arrays.toString(B[i]);

        System.out.println(largestCommonSubsquare());
        in.close();
    }
}

/*
//BRUTE-FORCE
import java.util.*;

public class Main {
    static int n, m, x, y;
    static int[][] A, B;

    public static boolean isSubsquare(int rA, int cA, int rB, int cB, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (A[rA + i][cA + j] != B[rB + i][cB + j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int bruteForceBCS() {
        int maxSize = 0;
        for (int size = Math.min(n, x); size > 0; size--) { // Try all possible square sizes
            for (int rA = 0; rA + size <= n; rA++) {
                for (int cA = 0; cA + size <= m; cA++) {
                    for (int rB = 0; rB + size <= x; rB++) {
                        for (int cB = 0; cB + size <= y; cB++) {
                            if (isSubsquare(rA, cA, rB, cB, size)) {
                                return size; // Return largest found
                            }
                        }
                    }
                }
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        A = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = in.nextInt();

        x = in.nextInt();
        y = in.nextInt();
        B = new int[x][y];

        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                B[i][j] = in.nextInt();

        System.out.println(bruteForceBCS());
        in.close();
    }
}

*/
