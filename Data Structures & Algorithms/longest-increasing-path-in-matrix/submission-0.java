class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m =matrix.length;
        int n = matrix[0].length;
        int[][] chk= new int[m][n];
        int maxlen =0,len;
        int[][] dir ={{0,1},{0,-1},{1,0},{-1,0}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                len = dfs(matrix,m,n,i,j,dir,chk);
                maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
    public int dfs(int[][] matrix,int m ,int n , int x, int y, int[][]dir,int[][] chk)
    {
        if(chk[x][y]>0)
        {
            return chk[x][y];
        }
        int max=0,cur;
        int xnew, ynew;
        for(int i=0;i<dir.length;i++)
        {
            xnew=x+dir[i][0];
            ynew=y+dir[i][1];
            if(xnew>=0 && xnew<m && ynew>=0 && ynew<n && matrix[xnew][ynew]>matrix[x][y])
            {
            cur=dfs(matrix,m,n,xnew,ynew,dir,chk);
            max= Math.max(cur,max);
            }
        }
        chk[x][y]= max+1;
        return chk[x][y];
    }
}
