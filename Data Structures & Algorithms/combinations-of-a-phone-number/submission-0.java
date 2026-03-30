class Solution {
    void gen_comb(String digits, int pos, StringBuilder s,HashMap<Character,ArrayList<Character>> hm, List<String> ans)
    {
        if (pos==digits.length())
        {
            ans.add(s.toString());
            return;
        }
        ArrayList<Character> ch = hm.get(digits.charAt(pos));
        for(int k =0;k<ch.size();k++)
        {
            s.append(ch.get(k));
            gen_comb(digits,pos+1,s,hm,ans);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();
        if(digits.length()==0)
        {
            return ans;
        }
        StringBuilder s = new StringBuilder();
        HashMap<Character,ArrayList<Character>> hm = new HashMap();
        int c =0;
        int count ;
        for(int i = 2;i<=9;i++)
        {
            if(i==7 || i==9)
            {
                count = 4;
            }
            else
            {
                count = 3;
            }
            ArrayList<Character> chk = new ArrayList();
            for(int j=0;j<count ;j++ )
            {
                chk.add((char) ('a' + c));
                c++;
            }
            char key = (char)('0'+i);
            hm.put(key,chk);
        }
        gen_comb(digits,0,s,hm,ans);
        return ans;
    }
}
