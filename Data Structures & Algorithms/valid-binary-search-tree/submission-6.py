# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def rangeCheck(r, minVal, maxVal):
            if not r:
                return True
            b = r.val>minVal and r.val<maxVal
            return b and rangeCheck(r.left, minVal, r.val) and rangeCheck(r.right, r.val, maxVal)

        return rangeCheck(root,-math.inf, math.inf)