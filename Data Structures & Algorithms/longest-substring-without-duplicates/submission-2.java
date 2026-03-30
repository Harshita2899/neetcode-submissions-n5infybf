class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap();
        int ans = 0;
        int start =0;
        int i =0;
        while(i<s.length())
        {
            if (hm.containsKey(s.charAt(i)) && (start<=hm.get(s.charAt(i))))
            {
                start = hm.get(s.charAt(i));
            }
            hm.put(s.charAt(i),i);
            ans = Math.max(ans, i-start);
            i++;
        
        }
        return ans;
    }
}
