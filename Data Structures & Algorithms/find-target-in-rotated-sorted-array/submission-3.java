class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid ;
        while(l<=r)
        {
            
            mid = (l+r)/2;
            System.out.println(l +" "+r);
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[l]<=nums[mid]) // left part is sorted
            {
                if(nums[mid]>target && nums[l]<=target)
                {
                    r = mid-1;
                }
                else
                {
                    l = mid+1;
                }
            }
            else
            {
                if(nums[mid]<target && target<=nums[r])
                {
                    l = mid+1;
                }
                else
                {
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}
