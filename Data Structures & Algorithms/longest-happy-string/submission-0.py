class Solution:
    def longestDiverseString(self, a: int, b: int, c: int) -> str:
        res = ''
        maxheap =[]
        for count,character in [(-a,'a'),(-b,'b'),(-c,'c')]:
            if count!=0:
                heapq.heappush(maxheap,(count,character))

        while maxheap:
            cnt,c = heapq.heappop(maxheap)
            if len(res)>1 and res[-1]==res[-2] and res[-1]==c:
                if not maxheap:
                    break
                else:
                    cnt2,c2 = heapq.heappop(maxheap)
                    res = res+c2
                    cnt2+=1
                    if cnt2!=0:
                        heapq.heappush(maxheap,(cnt2,c2))
            else:
                res = res+c
                cnt +=1

            if cnt!=0:
                heapq.heappush(maxheap,(cnt,c)) 
        return res