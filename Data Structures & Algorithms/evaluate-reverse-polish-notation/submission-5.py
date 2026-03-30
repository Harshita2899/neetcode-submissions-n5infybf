class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st =[]
        operator = ['+','*','-','/']
        for i in tokens:
            if i in operator:
                top2 = st.pop()
                top1 = st.pop()

                if i =='+':
                    st.append(top1+top2)
                elif i =='*':
                    st.append(top1*top2)
                elif i =='/':
                    st.append(int(top1/top2))
                else:
                    st.append(top1-top2)
                
            else:
                st.append(int(i))
        
        return int(st.pop())
       