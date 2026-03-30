class Solution {
    public String longestPalindrome(String s) {
        int strlen = 0, strStart =0;
        for(int i=0;i<s.length();i++)
        {
            //odd
            int l = i;
            int r = i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                l--;r++;
            }
            int temp_len = r-l-1;
            if(temp_len>strlen)
            {
                strlen = temp_len;
                strStart = l+1;
            }
            //even
            l = i;
            r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                l--;r++;
            }
            temp_len = r-l-1;
            if(temp_len>strlen)
            {
                strlen = temp_len;
                strStart = l+1;
            }
        }
        return s.substring(strStart,strStart+strlen);
    }
}
