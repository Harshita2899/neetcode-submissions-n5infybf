class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap();
        int[] ans =new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                ans[1]=i;
                ans[0]= hm.get(nums[i]);
                return ans;
            }
            hm.put(target-nums[i],i);
        }
        return ans;
    }
}
