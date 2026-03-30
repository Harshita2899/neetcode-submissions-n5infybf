class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())
        {
            return false;
        }
       int s1_count[] = new int[26];
       int s2_count[] = new int[26];
       int match_count =0;
       for(int i=0;i<s1.length();i++)
       {
            s1_count[s1.charAt(i)-'a']++;
       } 
       for(int i=0;i<s1.length();i++)
       {
            s2_count[s2.charAt(i)-'a']++;
       }
       for(int i=0;i<26;i++)
       {
            if(s1_count[i]==s2_count[i])
            {
                match_count++;
            }
       }
       if (match_count==26)
       {
            return true;
        }
       int window_start_index =0;
       for(int i= s1.length();i<s2.length();i++)
       {
            match_count=0;
            s2_count[s2.charAt(window_start_index)-'a']--;
            s2_count[s2.charAt(i)-'a']++;
            window_start_index++;
            for(int j=0;j<26;j++)
            {
                if(s1_count[j]==s2_count[j])
                {
                    match_count++;
                }
            }
            if (match_count==26)
            {
            return true;
            }
       }
       return false;
    }
}
