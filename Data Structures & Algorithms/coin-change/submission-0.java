class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount ==0)
        {
            return 0;
        }
        int n =coins.length;
        int dp[][]=new int[n+1][amount+1];
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<amount+1;j++)
            {
                if(i==0)
                {
                    dp[i][j]=Integer.MAX_VALUE-1;
                }
                if(j==0)
                {
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<amount+1;j++)
            {
                if(coins[i-1]<=j)
                {
                    if(dp[i-1][j-coins[i-1]]!=Integer.MAX_VALUE-1)
                    {
                        dp[i][j]= Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                    }
                    else
                    {
                        dp[i][j]= dp[i-1][j];
                    }
                }
                else
                {
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        return dp[n][amount]==Integer.MAX_VALUE-1?-1:dp[n][amount];
    }
}
