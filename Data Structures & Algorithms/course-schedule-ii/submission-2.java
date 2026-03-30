class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            int pre = prerequisites[i][1];
            int course = prerequisites[i][0];
            indegree[course]++;
            adj.get(pre).add(course);
        }
        Queue<Integer> q = new LinkedList();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int i=0;
        while (!q.isEmpty())
        {
            int p = q.poll();
            ans[i++]= p;
            for( int n:adj.get(p))
            {
                indegree[n]--;
                if(indegree[n]==0)
                {
                    q.offer(n);
                }
            }


        }
        if(i!= numCourses)
        {
            return new int[0];
        }
        return ans;
    }
}
