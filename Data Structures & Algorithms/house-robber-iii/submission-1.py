# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def robbed(self,root,rob):
        if root is None:
            return 0
        if (root,rob) in self.mem:
            return self.mem[(root,rob)]
        if rob:
            ans= root.val+self.robbed(root.left,False)+self.robbed(root.right,False)
        
        else:
            ans=max(self.robbed(root.left,True),self.robbed(root.left,False))+max(self.robbed(root.right,True),self.robbed(root.right,False))
        
        self.mem[(root,rob)]=ans  
        
        return ans

    def rob(self, root: Optional[TreeNode]) -> int:
        self.mem ={}
        return max(self.robbed(root,True),self.robbed(root,False))