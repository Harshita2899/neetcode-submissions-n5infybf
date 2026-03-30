class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        ans =[]
        self.generate(nums,0,ans)
        return ans

    def generate(self, nums, indx, ans):
        if indx==len(nums):
            ans.append(list(nums))
            return 

        for i in range(indx,len(nums)):
            nums[i],nums[indx] = nums[indx],nums[i]
            self.generate(nums,indx+1,ans)            
            nums[i],nums[indx] = nums[indx],nums[i]