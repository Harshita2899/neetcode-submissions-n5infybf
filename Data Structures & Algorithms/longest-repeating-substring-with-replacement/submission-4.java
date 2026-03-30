class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq = 0;
        int ans = 0;
        int left =0;
        int[] char_count = new int[26];
        for(int rt=0;rt<s.length();rt++)
        {
            char_count[s.charAt(rt)-'A']++;
            maxfreq = Math.max(maxfreq, char_count[s.charAt(rt)-'A']);
            if(rt-left+1-maxfreq>k)
            {
                char_count[s.charAt(left)-'A']--;
                left++;
            }
            ans = Math.max(ans,rt-left+1);
        }
        return ans;
    }
}
