class ListNode:

    def __init__(self):
        self.children = [None]*26
        self.boolEnd = False

class WordDictionary:

    def __init__(self):
        self.root = ListNode()

    def addWord(self, word: str) -> None:
        cur = self.root
        for i in word:
            indx = ord(i)-ord('a')
            if not cur.children[indx]:
                cur.children[indx] = ListNode()
            cur = cur.children[indx]
        
        cur.boolEnd = True

    def search(self, word: str) -> bool:

        def dfs(indx,cur):
            if indx == len(word):
                return cur.boolEnd

            c = word[indx]
            
            if c=='.':
                for ch in cur.children:
                    if ch and dfs(indx+1, ch):
                        return True
                return False
                
                
            ind = ord(c)-ord('a')
            if not cur.children[ind]:
                return False
            cur = cur.children[ind]

            return dfs(indx+1,cur)

        return dfs(0,self.root)
        

        
