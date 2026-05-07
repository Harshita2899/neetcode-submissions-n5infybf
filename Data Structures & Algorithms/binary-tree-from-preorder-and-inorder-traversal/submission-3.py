# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def designTree(self,preorder,inorder,start,end):

        if start>end:
            return None
        val=preorder[self.preIndex]
        self.preIndex=self.preIndex+1
        indx=start
        for i in range(start,end+1):
            if inorder[i]==val:
                indx = i
                break
        root = TreeNode(val)
        root.left = self.designTree(preorder,inorder,start,i-1)
        root.right = self.designTree(preorder,inorder,i+1,end)

        return root

    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:
        self.preIndex=0
        return self.designTree(preorder,inorder,0,len(inorder)-1)