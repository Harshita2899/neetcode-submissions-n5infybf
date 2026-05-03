# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def heightTree(self,root):
        if not root:
            return 0
        return 1+max(self.heightTree(root.left),self.heightTree(root.right))

    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        hl = self.heightTree(root.left)
        hr = self.heightTree(root.right)
        dif = abs(hl-hr)
        return dif<=1 and self.isBalanced(root.left) and self.isBalanced(root.right)