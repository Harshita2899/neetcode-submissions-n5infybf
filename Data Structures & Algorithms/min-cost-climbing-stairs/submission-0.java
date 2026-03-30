class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n<2)
        {
            return 0;
        }
        int[] price = new int[n+1];
        for (int i=2;i<=n;i++)
        {
            // price[i] = Math.min(price[i-2]+cost[i-2], price[i-1]+cost[i-1]);
            price[i] = Math.min(price[i-1]+cost[i-1],price[i-2]+cost[i-2]);
        }
        return price[n];
    }
}
