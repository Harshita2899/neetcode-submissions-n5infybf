class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i = 0;i<=coins.length;i++)
        {
            for(int j =0;j<=amount;j++)
            {
                if(j==0)
                {
                    dp[i][j]=0;
                }
                if(i==0)
                {
                    dp[i][j] = Integer.MAX_VALUE -1;
                }
                
            }
        }
        for(int j =1;j<=amount;j++)
        {
            if(j%coins[0]==0)
            {
                dp[1][j] = j/coins[0];
            }
            else
            {
                dp[1][j] = Integer.MAX_VALUE;
            }
        }
        for(int i=2;i<dp.length;i++)
        {
            for(int j =0;j<dp[0].length;j++)
            {
                if(j>=coins[i-1])
                {
                    dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        if(dp[coins.length][amount] == Integer.MAX_VALUE)
        {
            return -1;
        }
        return dp[coins.length][amount];
    }
}
