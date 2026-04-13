class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        totsum = nums[0]
        minsum = nums[0]
        maxsum = nums[0]
        currsum_min = nums[0]
        currsum_max = nums[0]

        for i in range(1,len(nums)):
            currsum_max = max(nums[i], currsum_max+nums[i])
            maxsum = max(maxsum,currsum_max)
            currsum_min = min(nums[i],currsum_min+nums[i])
            minsum=min(minsum,currsum_min)
            totsum = totsum+nums[i]

        if maxsum<0:
            return maxsum


        return max(maxsum,totsum - minsum)