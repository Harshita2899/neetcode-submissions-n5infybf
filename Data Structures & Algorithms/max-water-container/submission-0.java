class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int ans = 0;
        int temp;
        while(l<r)
        {
            temp = Math.min(heights[l],heights[r]) *(r-l);
            ans = Math.max(temp,ans);
            if(heights[l]<heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return ans;
    }
}
