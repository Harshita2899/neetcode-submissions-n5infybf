class Solution {
    public int characterReplacement(String s, int k) {
        int[] ch = new int[26];
        int maxfreq=0;
        int maxlength=0;
        int left=0;
        for (int right=0;right<s.length();right++)
        {
            ch[s.charAt(right)-'A']++;
            maxfreq = Math.max(maxfreq, ch[s.charAt(right)-'A']);
            if(right-left+1-maxfreq>k)
            {
                ch[s.charAt(left)-'A']--;
                left++;
                
            }
            maxlength =Math.max(maxlength, right-left+1);
        }
        return maxlength;

    }
}
