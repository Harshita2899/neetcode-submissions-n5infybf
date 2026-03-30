class Solution {
    public int maxCoins(int[] nums) {
        int[] temp =new int[nums.length+2];
        temp[0]=1;
        temp[nums.length+1]=1;
        int c=0;

        int maximum;
        for(int i=0;i<nums.length;i++)
        {
            temp[i+1]=nums[i];
        }
        int dp[][]=new int [nums.length+2][nums.length+2];
        int left,right;
        for (int window=1;window<=nums.length;window++)
        {
            for (left =1; left<=nums.length-window+1;left++)
            {
                right = left+window-1;
                c=0;
                maximum=0;
                for(int i =left;i<=right;i++)
                {
                    c=0;                    
                    if(i==left)
                    {
                        c=0;
                    }
                    else
                    {
                        c=dp[left][i-1];
                    }
                    c = c+ temp[left-1]*temp[i]*temp[right+1];
                    if(i==right)
                    {
                        c=c+0;
                    }
                    else
                    {
                        c=c+dp[i+1][right];
                    }
                    maximum= Math.max(maximum,c);
                }
                dp[left][right]=Math.max(maximum,dp[left][right]);
            }
        }
        return dp[1][nums.length];
    }
}
