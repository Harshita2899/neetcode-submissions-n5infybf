# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        
        b = True
        if root.left and root.left.val>=root.val:
            b = False

        if root.right and root.right.val<=root.val:
            b = False

        return b and self.isValidBST(root.left) and self.isValidBST(root.right)