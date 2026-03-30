class Solution {
    public boolean dfs(char[][] board, int i, int j, int ind, String word,boolean[][] visited, int[][] dir)
    {
        if(ind == word.length())
        {
            return true;
        }
        for(int k=0;k<dir.length;k++)
        {
            int new_i = i+dir[k][0];
            int new_j = j+dir[k][1];
            if((new_j>=0)&&(new_i>=0)&&(new_j<board[0].length)&&(new_i<board.length))
            {
                if(!visited[new_i][new_j] && (board[new_i][new_j]==word.charAt(ind)))
                {
                    visited[new_i][new_j] = true;
                    if(dfs(board,new_i,new_j,ind+1,word,visited,dir))
                    {
                        return true;
                    }
                    visited[new_i][new_j] = false;
                }
            }
        }
    return false;
    }
    public boolean exist(char[][] board, String word) {
        int dir[][] ={{1,0},{0,1},{-1,0},{0,-1}};
        boolean visited[][] = new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    visited[i][j] = true;
                    if(dfs(board,i,j,1,word,visited,dir))
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
