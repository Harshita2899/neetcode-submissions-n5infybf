class Solution:
    def feasible(self,m, piles,h):
        count =0
        for i in range(len(piles)):
            count += math.ceil(piles[i]/m)
        
        return count<=h 



    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        maximum = -math.inf
        for i in range(len(piles)):
            maximum = max(maximum,piles[i])

        minimum = 1
        ans =0
        
        while minimum<=maximum:
            mid = int((maximum+minimum)//2)

            if self.feasible(mid,piles,h):
                maximum = mid-1
                ans =mid
                print (ans)
            else:
                minimum = mid+1

        return ans