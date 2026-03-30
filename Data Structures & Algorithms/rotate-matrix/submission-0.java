class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int temp;
        int l =matrix[0].length;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length/2;j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][l-j-1];
                matrix[i][l-j-1] =temp;
            }
        }
    }
}
