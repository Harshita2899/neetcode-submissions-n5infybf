class Solution {
    int linear_rob(int[]nums ,int start, int end)
    {
        int[] dp = new int[end-start+1];
        for(int i =0;i<dp.length;i++)
        {
            if(i==0)
            {
                dp[i] = nums[i+start];
            }
            else if(i==1)
            {
                dp[i] = Math.max(dp[i-1],nums[i+start]);
            }
            else
            {
                dp[i] = Math.max(dp[i-1],nums[i+start]+dp[i-2]);
            }
            
        }
        return dp[dp.length-1];
    }
    public int rob(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        return Math.max(linear_rob(nums,0,nums.length-2),linear_rob(nums,1,nums.length-1));
    }
}
