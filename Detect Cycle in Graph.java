class Solution {
    
    // private boolean dfsCheck(int node,ArrayList<ArrayList<Integer>> adj, int vis[],int pathVis[])
    // {
//         vis[node]=1;
//         pathVis[node]=1;
        
//         for(int it: adj.get(node)){
//             if(vis[it]==0){
//                 if(dfsCheck(it,adj,vis,pathVis)==true)
//                     return true;
//             }
//             else if(pathVis[it]==1)
//             {
//                 return true;
//             }
//         }
//         pathVis[node]=0;
//         return false;
//     }
    
//     // Function to detect cycle in a directed graph.
//     public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
//         // code here
//         int vis[]=new int[V];
//         int pathVis[]=new int[V];
        
//         for(int i=0;i<V;i++)
//         {
//             if(vis[i]==0){
//                 if(dfsCheck(i,adj,vis,pathVis)==true)
//                     return true;
//             }
//         }
//         return false;
//     }
// }

//USING TOPOLOGICAL SORT(BFS)...ALSO DFS WE CAN TOPO SORT - no recursion
//IF TOPO SORT EXIST , ITS A DAG(ACYCLIC/NON- CYCLIC GRAPH)
public boolean isCyclic(int V,ArrayList<ArrayList<Integer>> adj)
{
    int[] inDegree=new int[V];
    Queue<Integer> q=new LinkedList<>();
    
//calculating indegree for each node- make indegree array traverse through the adj list and each ke index par increment count in the indegree array
    for(int i=0;i<V;i++)
    {
        for(int neighbor:adj.get(i))
        {
            inDegree[neighbor]++;
        }
    }
    
    
    
    //Add nodes with in-degree 0 to the queue
    //if not 0 traverse each time and --
    for(int i=0;i<V;i++)
    {
        if(inDegree[i]==0)
        {
            q.add(i);
        }
    }
    int count=0;
    while(!q.isEmpty())
    {
        int node=q.poll();
        count++;
        
    //if not 0 traverse each time and --
    for(int neighbor:adj.get(node)){
    inDegree[neighbor]--;
    if(inDegree[neighbor]==0){
        q.add(neighbor);
        
    }    
    }
    }

//if all nodes processed : NO CYCLE
    return count!=V;
}
}
