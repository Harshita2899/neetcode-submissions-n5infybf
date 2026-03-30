class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        int i,j,sum;
        int n =  nums.length;
        for(int k =0;k<n-2;k++)
        {
            while(k>0 && k<n-2 && nums[k-1]==nums[k] )
            {
                k++;
            }
            i=k+1;
            j=nums.length-1;
            while(i<j)
            {
                sum = nums[k]+nums[i]+nums[j];
                if(sum == 0)
                {
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    i++;
                    j--;
                    while(i>0 && i<j && (nums[i]==nums[i-1]))
                    {
                        i++;
                    }
                }
                else if(sum<0)
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
            
        }
        return ans;
    }
}
