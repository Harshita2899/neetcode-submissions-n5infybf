# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    preIndx = 0
    def tree(self,preorder,inorder,strt,end):
        if strt>end:
            return None
        ind =0;
        for i in range(strt,end+1):
            if preorder[self.preIndx]==inorder[i]:
                ind = i
                break
        self.preIndx+=1
        root = TreeNode(inorder[ind])
        root.left = self.tree(preorder,inorder,strt,ind-1)
        root.right = self.tree(preorder,inorder,ind+1,end)
        return root

    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        return self.tree(preorder,inorder,0,len(preorder)-1)