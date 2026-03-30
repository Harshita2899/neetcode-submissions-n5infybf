class Solution {
    boolean [][] visited;
    void chk(char[][] grid,int i, int j, int[][] d)
    {
        Queue <Pair<Integer,Integer>> q = new LinkedList();
        
        q.add(new Pair(i,j));
        while(!q.isEmpty())
        {
            Pair<Integer,Integer> p = q.poll();
            int a = p.getKey();
            int b = p.getValue();
            visited[a][b] = true;
            for(int k =0;k<d.length;k++)
            {
                int x = a+d[k][0];
                int y = b+d[k][1];
                if((x>=0) &&(x<grid.length) && (y>=0) && (y<grid[0].length) && !visited[x][y] && grid[x][y]=='1')
                {
                    q.offer(new Pair(x,y));
                }
            }

        }
    }
    public int numIslands(char[][] grid) {
        int[][] dir ={{1,0},{0,1},{-1,0},{0,-1}};
        visited = new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i =0;i<grid.length;i++)
        {
            for (int j =0;j<grid[0].length;j++)
            {
                if((grid[i][j]=='1') && !visited[i][j])
                {
                    chk(grid, i, j, dir);
                    count++;
                }
            }
        }
        return count;
    }
}
