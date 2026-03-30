class Solution {
    public void gen_comb(int[] nums,List<List<Integer>> ans, ArrayList<Integer> l, int i)
    {
        ans.add(new ArrayList(l));
        
        
        for(int j=i;j<nums.length;j++)
        {
            if(j>i && (nums[j]==nums[j-1]))
            {
                continue;
            }
            l.add(nums[j]);
            gen_comb(nums,ans,l,j+1);
            l.remove(l.size()-1);
            //gen_comb(nums,ans,l,j+1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        gen_comb(nums,ans,new ArrayList(),0);
        return ans;
    }
}
