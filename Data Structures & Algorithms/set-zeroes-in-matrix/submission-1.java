class Solution {
    public void setZeroes(int[][] matrix) {
        int r=1,i,j;
        for ( i=0;i<matrix.length;i++)
        {
            for( j =0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if (i==0)
                    {
                        r=0;
                    }
                    else
                    {
                        matrix[i][0]=0;
                    }
                    matrix[0][j]=0;
                }
            }
        }
        
        for( i=1;i<matrix.length;i++)
        {
            if (matrix[i][0]==0)
            {
                for( j=1;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }

        for( i=1;i<matrix[0].length;i++)
        {
            if (matrix[0][i]==0)
            {
                for( j=1;j<matrix.length;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
        if(matrix[0][0]==0)
        {
           for( i =1;i<matrix.length;i++)
            {
                matrix[i][0]=0;
            } 
        }
        if(r==0)
        {
            for( i =0;i<matrix[0].length;i++)
            {
                matrix[0][i]=0;
            }
        }
        
    }
}
