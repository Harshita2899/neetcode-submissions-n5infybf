from collections import defaultdict 
import math
class Solution:
    def maxPoints(self, points: List[List[int]]) -> int:
        def findSlope(x1,x2,y1,y2):
            if x1==x2:
                return math.inf

            slope=(y2-y1)/(x2-x1)
            return slope
        
        ans= 1
        for i in range(len(points)):
            count_dict = defaultdict(int)
            for j in range(i+1,len(points)):
                x1=points[i][0]
                y1=points[i][1]
                x2=points[j][0]
                y2=points[j][1]
                sl = findSlope(x1,x2,y1,y2)
                count_dict[sl] +=1
                ans = max(ans,count_dict[sl]+1) 
        return ans