class StockSpanner:

    def __init__(self):
        self.stock=[]

    def next(self, price: int) -> int:
        ans =1
        if len(self.stock)>0:
            j=len(self.stock)-1
            while j>=0 and self.stock[j]<=price:
                ans+=1
                j-=1
        
        self.stock.append(price)
        return ans

        


# Your StockSpanner object will be instantiated and called as such:
# obj = StockSpanner()
# param_1 = obj.next(price)