/*
Brute Force: Simple but too slow.
Optimized (Hashing + Sliding Window): 🚀 Efficient, works well for large inputs.

NOTE:--------------------------
📝 Rule of Thumb:

If you're finding the largest (maximization problem) → 🔍 Binary Search!
If you're just finding an occurrence → ❌ No need for Binary Search!
*/
import java.util.*;

public class SmallMatrixInBigMatrixOptimized {
    public static boolean findSmallMatrix(int[][] A, int[][] B, int n, int m, int x, int y) {
        HashSet<String> bHashes = new HashSet<>();
        
        // Convert B rows into hashable strings
        for (int i = 0; i < x; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < y; j++) {
                sb.append(B[i][j]).append(",");
            }
            bHashes.add(sb.toString());
        }

        // Check for B inside A
        for (int i = 0; i <= n - x; i++) {
            for (int j = 0; j <= m - y; j++) {
                boolean found = true;
                for (int k = 0; k < x; k++) {
                    StringBuilder sb = new StringBuilder();
                    for (int l = 0; l < y; l++) {
                        sb.append(A[i + k][j + l]).append(",");
                    }
                    if (!bHashes.contains(sb.toString())) {
                        found = false;
                        break;
                    }
                }
                if (found) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();

        int x = sc.nextInt(), y = sc.nextInt();
        int[][] B = new int[x][y];
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                B[i][j] = sc.nextInt();

        System.out.println(findSmallMatrix(A, B, n, m, x, y) ? "YES" : "NO");
        sc.close();
    }
}
//tc=O(NM)














/*
//bruteforce:-
import java.util.*;

public class SmallMatrixInBigMatrix {
    public static boolean isMatch(int[][] A, int[][] B, int row, int col, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (A[row + i][col + j] != B[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean findSmallMatrix(int[][] A, int[][] B, int n, int m, int x, int y) {
        for (int i = 0; i <= n - x; i++) {
            for (int j = 0; j <= m - y; j++) {
                if (isMatch(A, B, i, j, x, y)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read A matrix
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();

        // Read B matrix
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] B = new int[x][y];
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++)
                B[i][j] = sc.nextInt();

        // Check if B exists inside A
        if (findSmallMatrix(A, B, n, m, x, y)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}


//TC=O(NMXY)
*/
