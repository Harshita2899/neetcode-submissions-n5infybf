class Solution:
    

    def getString(self,ans,digits,indx,temp):
        keypad = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz"
        }
        if len(temp) == len(digits):
            ans.append(temp)
            return

        if indx>=len(digits):
            return

        nl = keypad[digits[indx]]

        for i in nl:
            temp = temp +i
            self.getString(ans,digits,indx+1,temp)
            temp = temp[:-1]

    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:         # important!
            return []
        ans = []

        self.getString(ans,digits,0,'')

        return ans
