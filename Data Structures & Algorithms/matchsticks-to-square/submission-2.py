class Solution:
    def chkValid(self,indx,matchsticks):
        #if indx==len(matchsticks) and sum(self.side)//4==self.sideLength:
        #    return True
        if indx == len(matchsticks):
            return all(side == self.sideLength for side in self.side)
        for i in range(4):
            if self.side[i]+matchsticks[indx]<=self.sideLength:
                self.side[i]=self.side[i]+matchsticks[indx]
                if self.chkValid(indx+1,matchsticks):
                    return True
                self.side[i]=self.side[i]-matchsticks[indx]
        return False
        
    def makesquare(self, matchsticks: List[int]) -> bool:
        self.sideLength = sum(matchsticks)//4
        self.side=[0]*4
        if self.sideLength != sum(matchsticks)/4:
            return False
        matchsticks.sort(reverse=True)

        if matchsticks[0]>self.sideLength:
            return False

        return self.chkValid(0,matchsticks)