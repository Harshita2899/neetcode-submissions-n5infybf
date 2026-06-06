class Solution:
    def rob(self, nums: List[int]) -> int:
        dp=[]
        if len(nums)>0:
            dp.append(nums[0])
        if len(nums)>1:
            dp.append(max(nums[0],nums[1]))

        for i in range(2,len(nums)):
            dp.append(max(dp[-1],dp[-2]+nums[i]))
        
        return max(dp[-2],dp[-1]) if len(nums)>1  else nums[0]