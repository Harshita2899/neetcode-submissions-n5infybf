class Solution {
    int max_area =0;
    boolean[][] visit;

    void s(int[][] grid, int i, int j, int[][] dir)
    {
        Queue <Pair<Integer,Integer>> q = new LinkedList<>();
        int area = 0;
        q.offer(new Pair(i,j));
        while(!q.isEmpty())
        {
            Pair<Integer,Integer> p = q.poll();
            int a = p.getKey();
            int b = p.getValue();
            visit[a][b]=true;
            area +=1;
            for(int k=0;k<dir.length;k++)
            {
                int x = a+dir[k][0];
                int y = b+dir[k][1];
                if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && (grid[x][y]==1) && !visit[x][y])
                {
                    q.offer(new Pair(x,y));
                }
            }
            max_area= Math.max(area, max_area);
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        visit = new boolean[grid.length][grid[0].length];
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!visit[i][j] && (grid[i][j]==1))
                {
                    s(grid, i,j, dir);
                }   
            }
        }
        return max_area;

    }
}
