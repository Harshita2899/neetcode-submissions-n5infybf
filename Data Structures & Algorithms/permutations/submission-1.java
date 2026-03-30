class Solution {

    public void gen_per(int[] nums, int i,List<List<Integer>> ans )
    {
        if(i==nums.length)
        {
            List<Integer> l = new ArrayList<>();
            for (int num : nums) l.add(num);
            ans.add(l);
        }
        for(int j =i;j<nums.length;j++)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            gen_per(nums,i+1,ans);
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList();
        gen_per(nums,0,ans);
        return ans;
    }
}
