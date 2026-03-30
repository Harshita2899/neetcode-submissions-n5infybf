class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_val = prices[0]
        profit =0
        for i in range(0,len(prices)):
            temp = prices[i] - min_val
            profit = max(temp, profit)
            min_val = min(min_val, prices[i])

        return profit 