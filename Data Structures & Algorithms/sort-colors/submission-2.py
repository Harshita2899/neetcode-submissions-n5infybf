class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = -1 
        j = 0
        k = len(nums)

        while j<k:
            if nums[j]==0:
                i+=1
                nums[i],nums[j] = nums[j], nums[i]
                j+=1
                
            elif nums[j]==2:
                k-=1
                nums[k],nums[j] = nums[j], nums[k]
        
            else:
                j+=1

            #print(nums)

    

