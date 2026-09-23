class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxval = nums[0]
        minval = nums[0]
        ans = nums[0]
        for i in range(1,len(nums)):
            tmp_min = minval
            tmp_max = maxval
            maxval = max(tmp_max*nums[i],max(tmp_min*nums[i],nums[i]))
            minval = min(tmp_min*nums[i],min(tmp_max*nums[i],nums[i]))
            ans = max(ans,maxval)
            
        return ans