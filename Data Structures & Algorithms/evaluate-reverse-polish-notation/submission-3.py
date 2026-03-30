class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        st =[]
        operator = ['+','*','-','/']
        for i in tokens:
            if i in operator:
                top2 = int(st.pop())
                top1 = int(st.pop())

                if i =='+':
                    st.append(str(top1+top2))
                elif i =='*':
                    st.append(str(top1*top2))
                elif i =='/':
                    st.append(str(top1/top2))
                else:
                    st.append(str(top1-top2))
                
            else:
                st.append(i)
        
        return int(st.pop())



        