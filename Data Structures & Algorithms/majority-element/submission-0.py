class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        k=0
        major =-1
        for i in range(len(nums)):
            if k==0:
                major = nums[i]
            if nums[i] == major:
                k =k+1
            else:
                k =k-1
        return major                
        