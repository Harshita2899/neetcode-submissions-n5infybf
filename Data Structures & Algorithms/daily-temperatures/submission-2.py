class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        m = len(temperatures)
        ans =[0]*m
        st =[]

        for i in range(len(temperatures)-1,-1,-1):
            while st and temperatures[st[-1]]<=temperatures[i]:
                st.pop()

            
            if len(st)!=0:
                ans[i] = st[-1]-i

            st.append(i)
        return ans
                
            