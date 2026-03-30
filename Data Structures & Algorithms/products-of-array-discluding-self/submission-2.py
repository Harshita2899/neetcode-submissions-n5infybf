class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        right_pr = 1
        left_pr = 1
        right  = [1]*len(nums)
        left = [1]*len(nums)
        for i in range(1,len(nums)):
            right[i] = (right[i-1]*nums[i-1])
        for i in range(len(nums)-2,-1,-1):
            left[i] = left[i+1]*nums[i+1]
    
        for i in range(0, len(nums)):
            left[i] = left[i] * right[i]

        return left;