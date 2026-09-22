class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        ROWS = len(coins)
        COL = amount

        dp = [[math.inf]*(COL+1) for i in range(ROWS+1)]

        for i in range(ROWS+1):
            dp[i][0]=0


        for j in range(1,COL+1):
            if j%coins[0]==0:
                dp[1][j] = int(j/coins[0])
            else:
                dp[0][j] = math.inf -1

        for i in range(2,ROWS+1):
            for j in range(COL+1):
                if j>=coins[i-1]:
                    dp[i][j] = min(dp[i-1][j],dp[i][j-coins[i-1]]+1)
                else:
                    dp[i][j] = dp[i-1][j]

        if dp[ROWS][COL]==math.inf:
            return -1

        return dp[ROWS][COL]
                
                
        