class Solution {
    public int maxProduct(int[] nums) {
        int min_val = 1;
        int max_val = 1;
        int res =1;
        for(int i =0;i<nums.length;i++)
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
