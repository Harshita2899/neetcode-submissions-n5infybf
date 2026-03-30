class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            maxSum = Math.max(nums[i], nums[i]+maxSum);
        }
        return maxSum;
    }
}
