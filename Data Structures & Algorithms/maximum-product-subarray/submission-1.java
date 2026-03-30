class Solution {
    public int maxProduct(int[] nums) {
        int min_val = nums[0];
        int max_val = nums[0];
        int res =nums[0];
        for(int i =1;i<nums.length;i++)
        {
            int temp_max = max_val*nums[i];
            int temp_min = min_val*nums[i];
            max_val = Math.max(Math.max(temp_max, temp_min),nums[i]);
            min_val = Math.min(Math.min(temp_max, temp_min),nums[i]);
            res = Math.max(max_val,res);
        }
        return res;
    }
}
