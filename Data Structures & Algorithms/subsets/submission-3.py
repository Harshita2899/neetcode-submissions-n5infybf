class Solution:
    def genSubset(self,temp,nums,indx):
        if len(nums)==indx:
            self.ans.append(temp[:])
            return
        temp.append(nums[indx])
        self.genSubset(temp,nums,indx+1)
        temp.pop()
        self.genSubset(temp,nums,indx+1)

    def subsets(self, nums: List[int]) -> List[List[int]]:
        self.ans=[]
        self.genSubset([],nums,0)
        return self.ans