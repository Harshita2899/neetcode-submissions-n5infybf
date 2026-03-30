class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        for(int i =0;i<tokens.length;i++)
        {
            if(Character.isDigit(tokens[i].charAt(tokens[i].length()-1)))
            {
                st.push(Integer.valueOf(tokens[i]));
            }
            else 
            {
                int b = st.pop();
                int a =st.pop();
                if(tokens[i].charAt(0)=='*')
                {
                    int c = a*b;
                    st.push(c);
                }
                else if(tokens[i].charAt(0)=='/')
                {
                    int c = a/b;
                    st.push(c);
                }
                else if(tokens[i].charAt(0)=='+')
                {
                    int c = a+b;
                    st.push(c);
                }
                else
                {
                    int c = a-b;
                    st.push(c);
                }
            }
        }
        return st.pop();
    }
}
