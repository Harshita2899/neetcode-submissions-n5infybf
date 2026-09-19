class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x:x[0])
        ans=[]
        i =0
        while i<len(intervals):
            start = intervals[i][0]
            end = intervals[i][1]
            while i<len(intervals)-1 and intervals[i+1][0]<=end:
                end=max(end,intervals[i+1][1])
                i=i+1
            i=i+1
            ans.append([start,end])
        return ans


