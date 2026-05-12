class Solution:
    def generate(self,nums,index):
        if index==len(nums):
            self.ans.append(nums[:])
            return
        for indx in range(index,len(nums)):
            nums[indx],nums[index] = nums[index],nums[indx]
            self.generate(nums,index+1)
            nums[indx],nums[index] = nums[index],nums[indx]

    def permute(self, nums: List[int]) -> List[List[int]]:
        self.ans=[]
        self.generate(nums,0)
        return self.ans