class Solution {
    List<int[]> pacific;
    List<int[]> atlantic;
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
    public void chk_pacific(int[][] height)
    {
        boolean[][] visited= new boolean[height.length][height[0].length];

        Queue<Pair<Integer,Integer>> q = new LinkedList();
        for(int i=0;i<height[0].length;i++)
        {
            q.offer(new Pair(0,i));
            pacific.add(new int[]{0,i});
            visited[0][i]=true;
        }
        for(int i=0;i<height.length;i++)
        {
            q.offer(new Pair(i,0));
            pacific.add(new int[]{i,0});
            visited[i][0] = true;
        }
        
        while(!q.isEmpty())
        {
            Pair<Integer,Integer> p = q.poll();
            int a = p.getKey();
            int b = p.getValue();
            for(int i=0;i<dir.length;i++)
            {
                int x= a+dir[i][0];
                int y = b+dir[i][1];
                if(x>=0 && y>=0 && x<height.length && y<height[0].length)
                {
                    if(height[a][b]<=height[x][y] && !visited[x][y])
                    {
                        q.offer(new Pair(x,y));
                        pacific.add(new int[]{x,y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }

    public void chk_atlantic(int[][] height)
    {
        boolean[][] visited= new boolean[height.length][height[0].length];

        Queue<Pair<Integer,Integer>> q = new LinkedList();
        for(int i=0;i<height[0].length;i++)
        {
            q.offer(new Pair(height.length-1,i));
            atlantic.add(new int[]{height.length-1,i});
            visited[height.length-1][i]=true;
        }
        for(int i=0;i<height.length;i++)
        {
            q.offer(new Pair(i,height[0].length-1));
            atlantic.add(new int[]{i,height[0].length-1});
            visited[i][height[0].length-1] = true;
        }
        
        while(!q.isEmpty())
        {
            Pair<Integer,Integer> p = q.poll();
            int a = p.getKey();
            int b = p.getValue();
            for(int i=0;i<dir.length;i++)
            {
                int x= a+dir[i][0];
                int y = b+dir[i][1];
                if(x>=0 && y>=0 && x<height.length && y<height[0].length)
                {
                    if(height[a][b]<=height[x][y] && !visited[x][y])
                    {
                        q.offer(new Pair(x,y));
                        atlantic.add(new int[]{x,y});
                        visited[x][y] = true;
                    }
                }
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList();
        pacific =new ArrayList();
        atlantic =new ArrayList();
        chk_pacific(heights);
        chk_atlantic(heights);
        int[][] chk = new int[heights.length][heights[0].length];
        for(int i =0;i<pacific.size();i++)
        {
            int x = pacific.get(i)[0];
            int y = pacific.get(i)[1];
            chk[x][y] = 1;
        }
        for(int i =0;i<atlantic.size();i++)
        {
            int x = atlantic.get(i)[0];
            int y = atlantic.get(i)[1];
            if(chk[x][y]==1)
            {
                List a = new ArrayList();
                a.add(x);
                a.add(y);
                ans.add(a);
                chk[x][y]=2;
            }
        }
        return ans;
    }
}
