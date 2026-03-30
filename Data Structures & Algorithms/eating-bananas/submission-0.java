class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int v= piles[0];
        for(int i =0;i<piles.length;i++)
        {
            v= Math.max(v,piles[i]);
        }
        int d = h/piles.length;
        int ans = v/d;
        return ans;
    }
}
