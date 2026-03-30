class Solution {
    void dfs(char[][] grid, int i, int j, int[][] dir)
    {
        if(i<0||i>=grid.length||j<0|| j>=grid[0].length|| grid[i][j]=='0')
        {
            return;
        }       
        grid[i][j]='0';
        for(int d=0;d<dir.length;d++)
        {
            dfs(grid,i+dir[d][0],j+dir[d][1],dir);
        }
        return;

    }
    public int numIslands(char[][] grid) {
        int [][] dir= {{0,-1},{0,1},{1,0},{-1,0}};
        boolean[][] visited =new boolean[grid.length][grid[0].length];
        
        int count=0;
        Queue <int[]> q =new LinkedList();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid, i, j, dir);
                    count++;
                }
            }
        }
        return count;
    }
}
