class Solution {
    public void genStrings(int open,int close, int n, List<String> a, String s)
    {
        if((open== n)&& (close==open))
        {
            a.add(s);
        }
        if(open<n)
        {
        
            genStrings(open+1,close,n,a,s+"(");
           
        }
        if(close<open)
        {
            
            genStrings(open,close+1,n,a,s+")");
    
        }
        
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> a = new ArrayList();
        genStrings(0,0,n,a,"");
        return a;
    }
}
