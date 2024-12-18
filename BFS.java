//{ Driver Code Starts
import java.util.*;

// Driver code
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt(); // Taking number of test cases as input

        while (testcases-- > 0) {
            int V = sc.nextInt(); // Number of vertices
            int E = sc.nextInt(); // Number of edges

            // Initialize adjacency list
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>()); // Create a new list for each vertex
            }

            // Add edges to the adjacency list
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v); // Adding edge u -> v
                adj.get(v).add(u); // Adding edge v -> u (undirected graph)
            }

            // Create Solution object and call bfsOfGraph
            Solution obj = new Solution();
            ArrayList<Integer> result = obj.bfsOfGraph(V, adj);

            // Print the result
            for (int node : result) {
                System.out.print(node + " ");
            }
            System.out.println();
        }

        sc.close(); // Close the scanner
    }
}

// } Driver Code Ends


// User function Template for Java:  ITERATIVE METHOD USING QUEUE
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // simply 1st take array vis and queue and arraylist to return result as input, 
        boolean vis[]=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> bfs=new ArrayList<>();
        
        //add Q and initialize vis array with given starting index
        q.add(0);
        vis[0]=true;
        
        //keep on emptying until q is empty(BEGIN a -"while loop")
        while(!q.isEmpty()){
        //dequeue one by one elts, arrlist m add that node(or simply array make make it true)
            Integer node=q.poll();
        //as soon as popped add to ans arraylist
            bfs.add(node);
            
        //visit adj list of "node=which is just now popped"
        for(Integer it:adj.get(node)){
            if(vis[it]==false)
            {
            //check if node's neighbour is not visited - make it true as already popped from Q
                vis[it]=true;
            //add its adj elts (which u got by traversing its adj list-given in Qs"connected undirected graph represented by an adjacency list adj, which is a vector of vectors where each adj[i] represents the list of vertices connected to vertex i") to the Q
                q.add(it);
            }
        }
            
        }
        return bfs;
    }
}
//T.C=O(V+E)
//S.C=O(V)
