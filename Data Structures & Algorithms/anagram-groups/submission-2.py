class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1 ={}
        for i in strs:
            temp = list(i)
            temp.sort()
            s = ''.join(temp)

            if s in dict1:
                dict1[s].append(i)
            else:
                dict1[s] = [i]
        ans =[]
        for key,val in dict1.items():
            ans.append(val)

        return ans