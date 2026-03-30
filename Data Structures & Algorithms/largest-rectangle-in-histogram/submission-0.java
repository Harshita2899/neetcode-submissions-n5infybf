class Solution {
    public int largestRectangleArea(int[] heights) {
       int[] leftsmall = new int[heights.length];
       int[]rightsmall =new int[heights.length];
       leftsmall[0]=-1;
       rightsmall[heights.length-1]=heights.length;
       Stack<Integer> st = new Stack();
       st.push(-1);
       int val;
       for (int i =1;i<heights.length;i++)
       {
        int j =i-1;
        
        while(j>=0 && heights[j]>=heights[i]  )
        {
            j--;
        }
        leftsmall[i]=j;
       }
       for (int i =heights.length-2;i>=0;i--)
       {
        int j =i+1;
        
        while(j<heights.length && heights[j]>=heights[i] )
        {
            j++;
        }
        rightsmall[i]=j;
       }
       int ans=0;
        for (int i =0;i<heights.length;i++)
        {
            int temp = heights[i]*(rightsmall[i]-leftsmall[i]-1);
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}
