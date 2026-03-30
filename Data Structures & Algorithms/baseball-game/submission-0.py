class Solution:
    def calPoints(self, operations: List[str]) -> int:
        score=[]
        res =0
        for i in operations:
                           
            if i == 'C':
                res = res - score[-1]
                score = score[:-1]
            elif i== 'D':
                res = res + 2*score[-1]
                score.append(2*score[-1])
            elif i=='+':
                res = res+ score[-1]+score[-2]
                score.append(score[-1]+score[-2])
            else:
                val = int(i)
                res = res + val
                score.append(val)

        return res