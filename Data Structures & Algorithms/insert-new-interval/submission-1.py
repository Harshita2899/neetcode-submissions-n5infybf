class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        loc=len(intervals)
        for i in range(len(intervals)):
            if intervals[i][0]>newInterval[0]:
                loc = i
                break
        

        intervals.insert(loc,newInterval)
        i=0
        while i<len(intervals):
            
            if i>0 and i<len(intervals):
                if intervals[i-1][1]>=intervals[i][0]:
                    intervals[i-1][1] = max(intervals[i][1],intervals[i-1][1])
                    intervals[i-1][0] = min(intervals[i][0],intervals[i-1][0])
                    intervals.pop(i)
                    i=i-1
            
            i+=1


        return intervals