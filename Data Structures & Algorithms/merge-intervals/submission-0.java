class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int size=0;
        int prev_end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(prev_end>=intervals[i][0])
            {
                prev_end=Math.max(prev_end,intervals[i][1]);
            }
            else
            {
                intervals[size][1]= prev_end;
                size++;
                intervals[size][0]=intervals[i][0];
                prev_end=intervals[i][1];
            }
        }
        intervals[size][1]=prev_end;
        size++;
        int[][] ans =new int[size][2];
        for(int i = 0;i<size;i++)
        {
            ans[i][0]=intervals[i][0];
            ans[i][1]=intervals[i][1];
        }
        return ans;
    }
}
