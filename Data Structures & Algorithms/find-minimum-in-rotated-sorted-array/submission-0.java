class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid = (r+l)/2;
        int a = nums[0];
        while(l<r)
        {
            if(nums[l]<nums[r])
            {
                a = Math.min(a,nums[l]);
                break;
            }
            mid = (r+l)/2;
            a = Math.min(a, nums[mid]);
            if(nums[mid]<nums[l])
            {   
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return a;
    }
}
