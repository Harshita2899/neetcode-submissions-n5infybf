class Solution {
    void generate_sub(int[] nums, int i, List<Integer> sub , List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList(sub));
            return;
        }
        sub.add(nums[i]);
        generate_sub(nums,i+1,sub,ans);
        sub.remove(sub.size()-1);
        generate_sub(nums,i+1,sub,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> sub = new ArrayList();
        generate_sub(nums,0,sub,ans);
        return ans;
    }
}
