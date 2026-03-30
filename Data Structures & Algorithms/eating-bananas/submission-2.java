class Solution {
    public boolean isPossible(int n, int[]piles, int h)
    {
        int c=0;
        for (int i=0;i<piles.length;i++)
        {
            c += (int)Math.ceil((double)piles[i]/n);
            if(c>h)
            {
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high = piles[0];
        int low = 0;
        int ans=0;
        for (int i=1;i<piles.length;i++)
        {
            high= Math.max(piles[i],high);
        }
        int mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(isPossible(mid,piles,h))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
}
