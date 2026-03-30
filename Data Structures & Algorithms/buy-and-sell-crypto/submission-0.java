class Solution {
    public int maxProfit(int[] prices) {
        int max_prof = 0;
        int min_val =prices[0];
        for(int i=1;i<prices.length;i++)
        {
            max_prof=Math.max(max_prof, prices[i]-min_val);
            min_val =Math.min(min_val, prices[i]);
        }
        return max_prof;
    }
}
