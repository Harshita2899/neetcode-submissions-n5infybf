class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0||i==1)
            {
                dp[i] = nums[i];
            }
            else
            {
                dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            }
        }
        return dp[nums.length-1];
    }
}
