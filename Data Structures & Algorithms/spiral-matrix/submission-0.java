class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int l=0,r=matrix[0].length-1,t=0,b=matrix.length-1;
        int d=0;
        while(l<=r && t<=b)
        {
            if(d==0)
            {
                for (int j=l;j<=r;j++)
                {
                    ans.add(matrix[t][j]);
                }
                t++;
                d=1;
            }
            else if(d==1)
            {
                for(int i=t;i<=b;i++)
                {
                    ans.add(matrix[i][r]);
                }
                r--;
                d=2;
            }
            else if(d==2)
            {
                for(int j=r;j>=l;j--)
                {
                    ans.add(matrix[b][j]);
                }
                b--;
                d=3;
            }
            else 
            {
                for(int i=b;i>=t;i--)
                {
                    ans.add(matrix[i][l]);
                }
                l++;
                d=0;
            }
        }
        return ans;
    }
}
