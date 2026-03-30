class Solution {
    int rob1(int[] nums, int i, int j)
    {
        int h1=0;
        int h2=0;
        int temp;
        for(int k=i;k<j;k++)
        {
            temp =Math.max(h2,h1+nums[k]);
            h1=h2;
            h2=temp;
        }
        return Math.max(h1,h2);
    }
    public int rob(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        return Math.max(rob1(nums,0,nums.length-1),rob1(nums,1,nums.length));
    }
}
