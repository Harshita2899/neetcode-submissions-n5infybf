class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }
        
        int[] s_count = new int[256];
        int[] t_count = new int[256];

        for ( int i= 0;i<s.length();i++)
        {
            s_count[s.charAt(i)]++;
            t_count[t.charAt(i)]++;
        }
        
        for(int i=0;i<256;i++)
        {
            if(s_count[i]!=t_count[i])
            {
                return false;
            }
        }
        return true;
    }
}
