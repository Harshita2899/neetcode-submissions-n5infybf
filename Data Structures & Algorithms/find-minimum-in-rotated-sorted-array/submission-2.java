class Solution {
    public int findMin(int[] nums) {
        int h=nums.length-1;
        int l=0;
        int mid=0;
        int ans=Integer.MAX_VALUE;
        while(h>=l)
        {
            mid = (h+l)/2;
            int m = nums[mid];
            if(nums[mid]<nums[h])
            {
                h = mid-1;
            }
            else
            {
                l = mid+1;
            }
            ans = Math.min(ans,m);
        }
        return ans;
    }
}
