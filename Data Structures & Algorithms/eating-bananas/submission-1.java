class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int high= piles[0];
        for(int i =0;i<piles.length;i++)
        {
            high= Math.max(high,piles[i]);
        }
        int l=0,mid;
        int ans=high;
        long total_time;
        while(l<=high)
        {
            mid = (l+high)/2;
            total_time =0;
            for(int i=0;i<piles.length;i++)
            {
                total_time = total_time+(int)Math.ceil((double)piles[i]/mid);
            }
            if(total_time<=h)
            {
                ans=mid;
                high = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return ans;
    }
}
