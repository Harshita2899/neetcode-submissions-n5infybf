class Solution:

    def s(self, ans,temp, nums, indx):
        if indx == len(nums):
            ans.append(list(temp))
            return
        temp.append(nums[indx])
        self.s(ans, temp, nums, indx+1)
        temp.pop()
        self.s(ans, temp, nums, indx+1)


    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans =[]
        self.s(ans,[],nums,0)
        return ans
