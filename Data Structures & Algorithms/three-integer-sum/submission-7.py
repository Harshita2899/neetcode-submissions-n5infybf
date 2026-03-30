class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        ans =[]
        for i in range(0,n-2):
            while i>0 and i<n-2 and nums[i] == nums[i-1]:
                i+=1
            j = i+1
            k = n-1
            while j<k:
                if nums[i]+nums[j]+nums[k] == 0:
                    temp = [nums[i],nums[j],nums[k]]
                    if temp not in ans:
                        ans.append(temp)
                    k = k-1
                    j = j+1
                elif nums[i]+nums[j]+nums[k]>0:
                    k -= 1
                else:
                    j += 1

        return ans
