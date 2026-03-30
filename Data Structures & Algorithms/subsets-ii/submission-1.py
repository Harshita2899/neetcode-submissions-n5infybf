class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        ans =[]
        self.subset(ans,nums,0,[])
        return ans 

    def subset(self,ans, nums, indx, temp):
        if indx==len(nums):
            temp = list(temp)
            temp.sort()
            if temp not in ans:
                ans.append(temp)
            return
            
        temp.append(nums[indx])
        self.subset(ans,nums,indx+1,temp)
        temp.pop()
        self.subset(ans,nums,indx+1,temp)
    