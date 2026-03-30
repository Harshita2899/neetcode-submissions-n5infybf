class Solution:
    def addSum(self,ans,target,nums,indx,temp):
        
        if target==0:
            ans.append(list(temp))
            return
        if indx==len(nums) or target<0:
            return
        temp.append(nums[indx])
        self.addSum(ans,target-nums[indx],nums,indx,temp)
        temp.pop()
        self.addSum(ans,target,nums,indx+1,temp)
        

    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        ans=[]
        self.addSum(ans,target,nums,0,[])
        return ans 
