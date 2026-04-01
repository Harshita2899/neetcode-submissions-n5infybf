class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        dict_chk ={c:i for i,c in enumerate(order)}

        for i in range(len(words)-1):
            w1 = words[i]
            w2 = words[i+1]
        
            for j in range(min(len(w1),len(w2))):
                if w1[j]!=w2[j]:
                    if dict_chk[w1[j]]>dict_chk[w2[j]]:
                        return False
                    
                    break
            else:
                if len(w1)>len(w2):
                    return False
            
        return True