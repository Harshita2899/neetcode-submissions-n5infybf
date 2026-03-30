class MinStack:
    
    

    def __init__(self):
        self.st = []
        self.mini = math.inf      

    def push(self, val: int) -> None:
        if val<=self.mini:
            new_val = 2*val - self.mini
            self.mini = val
            val = new_val
        self.st.append(val)

    def pop(self) -> None:
        if len(self.st)>0:
            pop = self.st.pop()
            if pop<=self.mini:
                self.mini = 2*self.mini - pop
            if len(self.st)==0:
                mini = math.inf

    def top(self) -> int:
        if len(self.st)>0:
            if self.st[-1]<self.mini:
                return self.mini
            return self.st[-1]

    def getMin(self) -> int:
        return self.mini
        
