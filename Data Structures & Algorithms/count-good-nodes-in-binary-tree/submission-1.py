# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    
    def goodNodes(self, root: TreeNode) -> int:

        def dfs(r,maxvalue):
            if not r:
                return 0
            
            res = 1 if r.val>=maxvalue else 0
           
            maxval = max(maxvalue,r.val)
            res += dfs(r.left,maxval)
        
            res += dfs(r.right,maxval)
        
            return res
            

        return dfs(root,root.val)