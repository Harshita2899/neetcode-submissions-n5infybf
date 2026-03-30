class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
                
        }
        int ans=0;
        int temp=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            temp =nums[i];
        
            hs.add(nums[i]);
            count =0;
            while(hs.contains(temp))
            {
                count++;
                temp--;
                System.out.print(temp);
            }
            ans = Math.max(ans,count);
            
        }
        return ans;
    }

}
