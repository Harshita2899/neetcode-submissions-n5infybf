class MinStack:

    def __init__(self):
        self.mini = None
        self.st = []

    def push(self, val: int) -> None:
        pushval =val
        if self.mini is None:
            self.mini = val
        elif self.mini>val:
            pushval = (2*val)- self.mini
            self.mini = val
        self.st.append(pushval)
        

    def pop(self) -> None:
        popval =0
        if self.st[-1]<self.mini:
            popval=2*self.mini - self.st.pop()
            self.mini = popval
        else:
            popval = self.st.pop()
            
        if not self.st:
            self.mini = None


    def top(self) -> int:
        popval =0
        if self.st[-1]<self.mini:
            popval=self.mini
            
        else:
            popval = self.st[-1]
        return popval

    def getMin(self) -> int:
        return self.mini
