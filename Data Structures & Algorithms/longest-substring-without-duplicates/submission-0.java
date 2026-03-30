class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> hm = new HashMap();
        int ans=0;
        int ind=0;
        for (int i =0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                ind = Math.max(hm.get(s.charAt(i))+1, ind);
            }
            hm.put(s.charAt(i),i);
            ans = Math.max(i-ind+1,ans);
        }
        return ans;
    }
}
