class Solution:
    def comb(self,ans,target,indx,temp,candidate):
        if target==0:
            if temp not in ans:
                ans.append(list(temp))
            return
        
        if target<0 or indx==len(candidate):
            return
        
        temp.append(candidate[indx])
        self.comb(ans,target-candidate[indx],indx+1,temp,candidate)
        temp.pop()
        self.comb(ans,target,indx+1,temp,candidate)
        
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        ans =[] 
        self.comb(ans,target,0,[],candidates)
        return ans