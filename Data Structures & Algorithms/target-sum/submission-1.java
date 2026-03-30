class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        if ((sum + target) % 2 != 0 || Math.abs(target) > sum) {
            return 0;
        }

        int sum1=(sum+target)/2;
        
        int dp[][] = new int[nums.length+1][sum1+1];
        for(int i=0;i<=nums.length;i++)
        {
        
                    dp[i][0]=1;

        }
        for(int i=1;i<=nums.length;i++)
        {
            for(int j=0;j<=sum1;j++)
            {
                if(nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for(int i=0;i<=nums.length;i++)
        {
            for(int j=0;j<=sum1;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[nums.length][sum1];
    }
}
