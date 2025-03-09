//{ Driver Code Starts
// Initial Template for Java - as per striver's expl
import java.io.*; 
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(adj);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends: DFS=STACK=RECURSIVE
//EASIEST CIODE AND BETTER THAN BFS IN AI THEORY CLASS VIJAY SIR SAID+EXPL...WOWIEE

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public static void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,ls);
            }
        }
    }
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[adj.size()];//[V+1]
        vis[0]=true;
        ArrayList<Integer> ls=new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
}
//T.C=O(V+E)
//S.C=O(V)
//ALSO WE CAN USE ITERATIVE METHOD
//ABOVE WAS(RECURSION-IMPLICIT OR INBUILT STACK)
//AND ITERATIVE- EXPLICIT STACK(WHICH WE'LL CREATE IN CODE WITH SAME RECURSION LOGIC-(1ST ADD ,THEN BACKTRACK BY POPPING) )
