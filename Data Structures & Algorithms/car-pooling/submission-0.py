class Solution:
    def carPooling(self, trips: List[List[int]], capacity: int) -> bool:
        ans = [0]*1001 
        for i in trips:
            ans[i[1]] += i[0]
            ans[i[2]] -= i[0]

        for i in range(1,len(ans)):
            ans[i] = ans[i]+ans[i-1]
            if ans[i]>capacity:
                return False
        return True