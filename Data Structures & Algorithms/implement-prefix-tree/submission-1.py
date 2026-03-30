class ListNode:
    def __init__(self):
        self.children = [None]*26
        self.boolEnd = False

class PrefixTree:

    def __init__(self):
        self.root = ListNode()

    def insert(self, word: str) -> None:
        cur = self.root
        for i in word:
            indx = ord(i)-ord('a')
            if not cur.children[indx]:
                cur.children[indx] = ListNode()
            cur= cur.children[indx]
        cur.boolEnd = True

    def search(self, word: str) -> bool:
        cur = self.root
        for i in word:
            indx = ord(i)-ord('a')
            if not cur.children[indx]:
                return False
            cur= cur.children[indx]
        
        return cur.boolEnd
            
        

    def startsWith(self, prefix: str) -> bool:
        cur = self.root
        for i in prefix:
            indx = ord(i)-ord('a')
            if not cur.children[indx]:
                return False
            cur = cur.children[indx]
        return True

        