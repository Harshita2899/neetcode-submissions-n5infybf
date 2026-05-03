class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = [[0]*2 for i in range(len(prices)+1)]
        
        for i in range(len(prices)-1,-1,-1):
            for j in range(0,2):
                if j==0:
                    buy[i][j] = max(prices[i]+buy[i+1][1],buy[i+1][0])
                else:
                    buy[i][j] = max(-prices[i]+buy[i+1][0],buy[i+1][1])
        return buy[0][1]