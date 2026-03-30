class Solution {
    public void find_combination(int nums[],int i, int sum, int target, List<List<Integer>> ans, List<Integer> l)
    {
        if (sum==target)
        {
            ans.add(new ArrayList(l));
            return;
        }
        if(i==nums.length)
        {
            return;
        }
        if(sum+nums[i]<=target)
        {
            l.add(nums[i]);
            find_combination(nums,i,sum+nums[i],target,ans,l);
            l.remove(l.size()-1);
            
        }
        find_combination(nums,i+1,sum,target,ans,l);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> temp = new ArrayList();
        find_combination(nums,0,0,target,ans,temp);
        return ans;
    }
}
