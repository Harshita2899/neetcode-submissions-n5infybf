# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValid(self,root,minVal,maxVal):
        if not root:
            return True
        res= root.val>minVal
        res = res and root.val<maxVal
        return res and self.isValid(root.left,minVal,root.val) and self.isValid(root.right,root.val,maxVal)
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.isValid(root,-math.inf,math.inf)
        