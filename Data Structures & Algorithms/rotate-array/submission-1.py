class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def rev(i,j):
            while i<j:
                temp = nums[i]
                nums[i] =nums[j]
                nums[j] = temp
                i+=1
                j-=1

        d = k%len(nums)
        rev(0,len(nums)-1)
        rev(0,d-1)
        rev(d,len(nums)-1)
        