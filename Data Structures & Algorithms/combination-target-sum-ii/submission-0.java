class Solution {
    public void gen_comb(int[] nums, int i, int sum, int target, List<List<Integer>> ans, List<Integer> l)
    {
        if(sum==target)
        {
            ans.add(new ArrayList(l));
            return;
        }
        if(i==nums.length)
        {
            return;
        }
        for(int j=i;j<nums.length;j++)
        {
            if(j>i && nums[j-1]==nums[j])
            {
                continue;
            }
            if(nums[j]+sum>target)
            {
                break;
            }
            l.add(nums[j]);
            gen_comb(nums, j+1, sum+nums[j], target,ans,l);
            l.remove(l.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList();
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(candidates);
        gen_comb(candidates, 0, 0, target,ans,temp);
        return ans;
    }
}
