class Solution:
    def chkTrack(self,nums,k,indx):
        if len(nums)==indx:
            return all(s==self.oneSum for s in self.sides)
        if len(nums)<indx:
            return False
        
        for i in range(k):
            if self.sides[i]+nums[indx]<=self.oneSum:
                self.sides[i]=self.sides[i]+nums[indx]
                if self.chkTrack(nums,k,indx+1):
                    return True
                self.sides[i]=self.sides[i]-nums[indx]
                if self.sides[i] == 0:
                    break
        return False
        
    def canPartitionKSubsets(self, nums: List[int], k: int) -> bool:
        self.oneSum=sum(nums)//k
        if self.oneSum != sum(nums)/k:
            return False
        
        nums.sort(reverse=True)
        if nums[0]>self.oneSum:
            return False

        self.sides = [0]*k

        return self.chkTrack(nums,k,0)