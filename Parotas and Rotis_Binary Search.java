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
