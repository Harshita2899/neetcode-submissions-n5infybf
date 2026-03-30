class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack();
        int res =0;
        for(int i =0;i<tokens.length;i++)
        {
            if(tokens[i].equals("/"))
            {
                int b = st.pop();
                int a = st.pop();
                res = (int)(a/b);
                st.push(res);
            }
            else if(tokens[i].equals("+"))
            {
                int b = st.pop();
                int a = st.pop();
                res = (int)(a+b);
                st.push(res);
            }
            else if(tokens[i].equals("-"))
            {
                int b = st.pop();
                int a = st.pop();
                res = (int)(a-b);
                st.push(res);
            }
            else if(tokens[i].equals("*"))
            {
                int b = st.pop();
                int a = st.pop();
                res = (int)(a*b);
                st.push(res);
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}
