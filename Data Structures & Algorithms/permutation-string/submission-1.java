class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int s1_count[] =new int[26];
        int s2_count[] = new int[26];
        for (int i =0;i<s1.length();i++)
        {
            s1_count[s1.charAt(i)-'a']++;
        }
        for(int i= 0;i<s1.length();i++)
        {
            s2_count[s2.charAt(i)-'a']++;
        }
        boolean flag = true;
            for(int j=0;j<26;j++)
            {
                if(s2_count[j]!=s1_count[j])
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                return flag;
            }
        for(int i=s1.length();i<s2.length();i++)
        {
            s2_count[s2.charAt(i)-'a']++;
            s2_count[s2.charAt(i-s1.length())-'a']--;
            flag = true;
            for(int j=0;j<26;j++)
            {
                if(s2_count[j]!=s1_count[j])
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                return flag;
            }
            
        }
        return false;
    }
}
