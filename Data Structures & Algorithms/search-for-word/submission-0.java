class Solution {
    boolean dfs(char[][] board,int i, int j,int[][] dir, int curr, String word,boolean[][] visited)
    {
        int newi,newj;
        if(word.length()==curr)
        {
            return true;
        }
        else
        {
            for(int k =0;k<dir.length;k++)
            {
                newi=i+dir[k][0];
                newj=j+dir[k][1];
                if(newi>=0 && newi<board.length && newj>=0 && newj<board[0].length && word.charAt(curr)==board[newi][newj] && visited[newi][newj]==false)
                {
                    visited[newi][newj] = true; 
                    if(dfs(board,newi,newj,dir,curr+1,word,visited))
                    {
                        return true;
                    }
                    visited[newi][newj] = false;;
                }
                
            }
            return false;
        }
    }
    public boolean exist(char[][] board, String word) {
        int[][] dir ={{0,1},{0,-1},{1,0},{-1,0}};
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    visited[i][j]=true;
                    if(dfs(board,i,j,dir,1,word,visited))
                    {
                        return true;
                    }
                    visited[i][j]=false;
                }
            }
        }
        return false;
    }
}
