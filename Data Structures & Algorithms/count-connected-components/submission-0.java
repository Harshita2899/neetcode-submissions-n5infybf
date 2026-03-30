class Solution {
    boolean visited[];
    void dfs(List<List<Integer>> adj, int cur)
    {
        visited[cur]= true;
        for(int dest: adj.get(cur))
        {
            if(!visited[dest])
            {
                dfs(adj,dest);
            }
        }
    }
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList();
        for(int i =0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        visited= new boolean[n];
        int component =0;
        for(int i =0;i<n;i++)
        {
            if(!visited[i])
            {
                component++;
                dfs(adj,i);
            }
        }
        return component;

    }
}
