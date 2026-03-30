class Solution {
    public void generateAdjList(List<List<Integer>> adj, int n, int[][] p,int[] in_degree)
    {
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<p.length;i++)
        {
            adj.get(p[i][1]).add(p[i][0]);
            in_degree[p[i][0]]++;
        }
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj=new ArrayList();
        List<Integer> a = new ArrayList();
        Queue<Integer> q = new LinkedList();
        generateAdjList(adj,numCourses,prerequisites,indegree);
        boolean[] visited= new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
        }
        int in;
        while(!q.isEmpty())
        {
            in = q.poll();
            visited[in] = true;
            a.add(in);
            for(int j=0;j<adj.get(in).size();j++)
            {
                indegree[adj.get(in).get(j)]--;
                if(indegree[adj.get(in).get(j)]==0)
                {
            
                    if(!visited[adj.get(in).get(j)])
                    {
                        q.offer(adj.get(in).get(j));
                        
                    }
                }
            }

        }
        
        //int[] ans =new int[a.size()];
        if(a.size()!=numCourses)
        {
            int []ans = new int[0];
            return ans;
        }
        int[] ans =new int[a.size()];
        for(int i =0;i<a.size();i++)
        {
            ans[i]=a.get(i);
        }
        return ans;
    }
}
