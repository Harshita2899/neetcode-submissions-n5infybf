class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        def merge(L,M,R,nums):
            i, j, k = L,0,0
            left = nums[i:M+1]
            right = nums[M+1:R+1]
            while j<len(left)and k<len(right):
                if left[j]<=right[k]:
                    nums[i] = left[j]
                    j+=1
                else:
                    nums[i] = right[k]
                    k+=1
                i+=1

            while k<len(right):
                nums[i] = right[k]
                k+=1
                i+=1
            while j<len(left):
                nums[i] =left[j]
                j+=1
                i+=1
            
        def mergeSort(arr,l,r):
            if l>=r:
                return 
            mid = (l+r)//2

            mergeSort(arr,l,mid)
            mergeSort(arr,mid+1,r)
            merge(l,mid,r,arr)

        mergeSort(nums,0,len(nums)-1)
        return nums