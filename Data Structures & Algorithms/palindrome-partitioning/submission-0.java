class Solution {
    boolean isPalindrome (String s)
    {
        int i = 0;
        int j = s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    void gen_partition(String s, List<String> temp, List<List<String>> ans)
    {
        if(s.length()==0)
        {
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            if(isPalindrome(s.substring(0,i+1)))
            {
                temp.add(s.substring(0,i+1));
                gen_partition(s.substring(i+1,s.length()),temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>  ans = new ArrayList();
        List<String> temp = new ArrayList();
        gen_partition(s,temp,ans);
        return ans;
    }
}
