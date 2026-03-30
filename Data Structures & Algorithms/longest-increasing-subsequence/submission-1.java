class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> l = new ArrayList();
        l.add(nums[0]);
        int mx_len  = 1;
        for(int i =1;i<nums.length;i++)
        {
            System.out.print(l.get(l.size()-1));
            if(nums[i]<=l.get(l.size()-1))
            {
                int idx  = ceilIndex(l,nums[i]);
                l.set(idx,nums[i]);
            }
            else
            {
                l.add(nums[i]);
            }
            //mx_len = Math.max(mx_len,l.size());
        }
        return l.size();
    }
    int ceilIndex(List<Integer> l, int target)
    {
        int low = 0;
        int high = l.size()-1;
        int mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(l.get(mid)<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return low;
    }

}
