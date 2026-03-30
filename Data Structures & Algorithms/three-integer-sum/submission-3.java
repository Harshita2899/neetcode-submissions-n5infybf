class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        int sum;
        for (int i =0;i<nums.length-2;i++)
        {
            if(i>0 && (nums[i-1]==nums[i]))
            {
                continue;
            }
            int l= i+1;
            int r = nums.length-1;
            while(l<r)
            {
                sum = nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l>0 && nums[l]==nums[l-1] && l<r)
                    {
                        l++;
                    }
                }
                else if(sum<0)
                {
                    l++;
                }
                else
                {
                    r--;
                }

            }
        }
        return ans;
    }
}
