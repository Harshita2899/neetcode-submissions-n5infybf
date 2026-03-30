class Solution {
    public void backtrackParenthesis(int openN, int closeN, int n, StringBuilder s, List<String> ans)
    {
        if((closeN == n) &&(openN==n))
        {
            ans.add(s.toString());
            return;
        }
        if(n>openN)
        {
            s.append('(');
            backtrackParenthesis(openN+1,closeN,n,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        if(openN>closeN)
        {
            s.append(')');
            backtrackParenthesis(openN,closeN+1,n,s,ans);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrackParenthesis(0,0,n,sb,ans);
        return ans;
    }
}
