class Solution {
    public void generate_subset(int[] nums, int i, List<Integer> l, List<List<Integer>> ans)
    {
        if(nums.length==i)
        {
            ans.add(new ArrayList(l));
            //l=new ArrayList();
            return;
        }
        l.add(nums[i]);
        generate_subset(nums,i+1,l,ans);
        l.remove(l.size()-1);
        generate_subset(nums,i+1,l,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        generate_subset(nums,0,l,ans);
        return ans;
    }
}
