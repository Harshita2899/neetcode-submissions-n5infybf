class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict1 = dict();
        for i in range(0,len(nums)):
            if nums[i] in dict1:
                return  [ dict1[nums[i]],i]
            
            dict1[target - nums[i]] = i

            