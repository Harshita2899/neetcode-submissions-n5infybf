class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        st = []
        for i in asteroids:
            while st and st[-1]>0 and i<0:
                tmp = st[-1]+i
                if tmp>0:
                    break
                elif tmp ==0:
                    st.pop()
                    break
                else:
                    st.pop()

            else:
                st.append(i)
        
        return st