class Solution {
    public int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE;
        int max_val = min_val;
        int profit = Integer.MIN_VALUE;
        for(int i =0;i<prices.length;i++)
        {
            if (prices[i]<min_val)
            {
                profit = Math.max(profit, max_val - min_val);
                min_val = prices[i];
                max_val = prices[i];
            }
            else if (max_val< prices[i])
            {
                max_val = prices[i];
            }
        }
        return Math.max(profit, max_val - min_val);
    }
}
