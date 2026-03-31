class Solution:

    def subsetXORSum(self, nums: List[int]) -> int:
        def dfs(indx,total):
            if indx == len(nums):
                return total
            
            return dfs(indx+1,total^nums[indx])+dfs(indx+1,total) #num of the lit included in the xor n number not included in the xor
        
        return dfs(0,0)

        