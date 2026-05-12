class Solution:

    def generate(self,nums,index):
        if len(nums)==index:
            temp=nums[:]
            
            if temp not in self.ans:
                self.ans.append(temp)
            return

        for i in range(index,len(nums)):
            nums[i],nums[index]=nums[index],nums[i]
            self.generate(nums,index+1)
            nums[i],nums[index]=nums[index],nums[i]
                

    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        self.ans=[]
        self.generate(nums,0)
        return self.ans