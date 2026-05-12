class Solution:
    def genCombination(self,nums,temp,indx,target):
        if target==0:
            self.ans.append(temp[:])
            return
        if len(nums)==indx or target<0:
            return 
        
        temp.append(nums[indx])
        self.genCombination(nums,temp,indx,target-nums[indx])
        temp.pop()
        self.genCombination(nums,temp,indx+1,target)

    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        self.ans=[]
        self.genCombination(nums,[],0,target)
        return self.ans