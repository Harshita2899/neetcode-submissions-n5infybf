# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def dfs(self,root,maxval):
        if not root:
            return 0
        res =1 if root.val>=maxval else 0
        maxval= max(maxval,root.val)

        res +=self.dfs(root.left,maxval)
        res +=self.dfs(root.right,maxval)

        return res

    def goodNodes(self, root: TreeNode) -> int:
        return self.dfs(root,root.val)