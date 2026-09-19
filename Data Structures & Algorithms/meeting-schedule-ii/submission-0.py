"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def minMeetingRooms(self, intervals: List[Interval]) -> int:
        start = sorted([interval.start for interval in intervals])
        end = sorted([interval.end for interval in intervals])

        s=0
        e=0
        count =0
        ans =0

        for i in range(len(start)):
            if start[s]<end[e]:
                count+=1
                ans = max(count,ans)
                s+=1
            else:
                count-=1
                e+=1

        return ans