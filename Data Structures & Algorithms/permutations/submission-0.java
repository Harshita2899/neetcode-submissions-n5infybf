class Solution {
    void permute(List<List<Integer>> ans, int i, int[] nums)
    {
        if(i==nums.length)
        {
            List<Integer> l =new ArrayList();
            for(int j=0;j<nums.length;j++)
            {
                l.add(nums[j]);
            }
            ans.add(l);
            return;
        }
        for(int j=i;j<nums.length;j++)
        {
            swap(nums,i,j);
            permute(ans,i+1,nums);
            swap(nums,i,j);
        }
    }
    void swap(int[] n, int i, int j)
    {
        int t= n[i];
        n[i]=n[j];
        n[j]= t;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        
        permute(ans, 0,nums);
        
        return ans;
    }
}
