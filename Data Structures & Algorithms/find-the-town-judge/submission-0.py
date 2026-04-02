class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        overall_diff = defaultdict(int) # incoming-outgoing --for the town judge it woulld be n-1

        for i in trust:
             overall_diff[i[1]] +=1
             overall_diff[i[0]] -=1

        for i in overall_diff:
            if overall_diff[i] == n-1:
                return i
        
        return -1