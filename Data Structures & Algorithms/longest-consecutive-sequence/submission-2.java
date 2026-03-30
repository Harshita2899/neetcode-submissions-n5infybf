class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> hs = new HashSet();
        for(int i =0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        int ans = 0;
        int curr =0;
        for(int n: hs)
        {
            curr =1;
            while(hs.contains(n+1))
            {
                curr++;
                n=n+1;
            }
            ans = Math.max(curr,ans);
        }
        return ans;
    }
}
