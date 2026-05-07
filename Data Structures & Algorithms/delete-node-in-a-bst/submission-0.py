# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findSucc(self,root):
        while root.left:
            root=root.left
        return root
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        if not root:
            return root
        if key ==root.val:
            if not root.left:
                return root.right
            elif not root.right:
                return root.left
            else: 
                r = self.findSucc(root.right)
                root.val = r.val
                root.right = self.deleteNode(root.right,r.val)

        elif key<root.val:
            root.left= self.deleteNode(root.left,key)
        else:
            root.right=self.deleteNode(root.right,key)
        return root