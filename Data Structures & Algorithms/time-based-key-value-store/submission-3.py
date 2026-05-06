class TimeMap:

    def __init__(self):
        self.dict_key={}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in list(self.dict_key.keys()):
            self.dict_key[key] = []
        self.dict_key[key].append([value,timestamp])

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.dict_key:
            return "" 
        
        ls = self.dict_key[key]

        l = 0
        r = len(ls)-1
        t=-1
        while l<=r:
            m= (l+r)//2
            if ls[m][1]==timestamp:
                return ls[m][0]
            elif ls[m][1]>timestamp:
                r = m-1
            else:
                t=m
                l= m+1
        if t==-1:
            return ""
        return ls[t][0]
