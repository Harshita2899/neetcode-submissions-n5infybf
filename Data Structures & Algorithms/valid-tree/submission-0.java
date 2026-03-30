class Solution {
    boolean[] visited;
    boolean dfs(List<List<Integer>> adj,int par, int cur)
    {
        visited[cur]= true;
        for(int dest : adj.get(cur))
        {
            if(visited[dest] && par!=dest)
            {
                return true;
            }
            else if(!visited[dest])
            {
                if(dfs(adj,cur,dest))
                {
                    return true;
                }
            }
        }
        return false;
    }
    boolean isCycle(List<List<Integer>> adj)
    {
        int connect=0;
        visited = new boolean[adj.size()];
        for(int i=0;i<visited.length;i++)
        {
            
            if(!visited[i])
            {
                connect++;
                if(dfs(adj,-1,i))
                {
                    return true;
                }
            }
        }
        return connect>1;

    }
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        return !isCycle(adj);
    }
}
