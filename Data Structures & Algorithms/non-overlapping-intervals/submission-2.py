class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        #sort on the basis of end time and the chack if start time is less than finish time if yes than count +=1 else update the finish with latest end 

        intervals.sort(key = lambda x: x[1])
        finish = -math.inf

        count =0

        for i in range(len(intervals)):
            start = intervals[i][0]
            end=intervals[i][1]

            if start<finish:
                count=count+1
            else:
                finish = end
        return count
