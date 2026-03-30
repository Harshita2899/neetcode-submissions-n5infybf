class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> param = new Stack();
        Stack<Integer> star = new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                param.push(i);
            }
            else if(s.charAt(i)=='*')
            {
                star.push(i);
            }
            else
            {
                if(!param.isEmpty())
                {
                    param.pop();
                }
                else if(!star.isEmpty())
                {
                    star.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        while(!star.isEmpty() && !param.isEmpty())
        {
            if(param.pop()>star.pop())
            {
                return false;
            }
        }
        if(!param.isEmpty())
        {
            return false;
        }
        return true;
    }
}
