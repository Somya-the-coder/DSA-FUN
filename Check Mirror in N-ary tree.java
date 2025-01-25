// tc=O(e);sc=O(n+e)
class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        //1 if mirror else 0...arrray mei solve this qs
        
        // Create adjacency lists for both trees
        HashMap<Integer, List<Integer>> tree1 = new HashMap<>();
        HashMap<Integer, List<Integer>> tree2 = new HashMap<>();

        // Build the adjacency list for the first tree
        for (int i = 0; i < 2 * e; i += 2) {
            if (!tree1.containsKey(A[i])) {
                tree1.put(A[i], new ArrayList<>());
            }
            tree1.get(A[i]).add(A[i + 1]);
        }

        // Build the adjacency list for the second tree
        for (int i = 0; i < 2 * e; i += 2) {
            if (!tree2.containsKey(B[i])) {
                tree2.put(B[i], new ArrayList<>());
            }
            tree2.get(B[i]).add(B[i + 1]);
        }

        // Compare the adjacency lists
        for (int key : tree1.keySet()) {
            List<Integer> children1 = tree1.get(key);
            List<Integer> children2 = tree2.get(key);

            // Reverse the children list of tree2
            Collections.reverse(children2);//list only we can reverse

            // If they are not identical, the trees are not mirrors
            if (!children1.equals(children2)) {
                return 0;
            }
        }

        return 1; // Trees are mirrors
    }
}
