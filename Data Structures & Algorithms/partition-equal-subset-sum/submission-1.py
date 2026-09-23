class Solution:
    def subset_chk(self,nums,sum_val):
        ROW = len(nums)+1
        COL = int(sum_val) + 1

        dp =[[False]*COL for _ in range(ROW)]

        for i in range(ROW):
            dp[i][0]= True

        for i in range(1,ROW):
            for j in range(1,COL):
                if j>=nums[i-1]:
                    dp[i][j] = dp[i-1][j] or dp[i-1][j-nums[i-1]]
                else:
                    dp[i][j] = dp[i-1][j]

        return dp[len(nums)][sum_val]

    def canPartition(self, nums: List[int]) -> bool:
        chk_val = sum(nums)
        if chk_val%2==0:
            return self.subset_chk(nums,chk_val//2)
        
        return False