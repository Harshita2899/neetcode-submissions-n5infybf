class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        sum_sub = 0
        min_ans = math.inf
        i=0
        j=0
        while j<len(nums) :
            if target > sum_sub:
                sum_sub +=nums[j]
                j+=1
            while target <= sum_sub:
                min_ans = min(j-i,min_ans)
                
                sum_sub -=nums[i]
                i+=1

            #print(sum_sub)
        if min_ans == math.inf:
                return 0     
        return min_ans

