# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        ans=[]
        if root==None:
            return ans
        q=deque()
        q.append(root)
        while len(q)>0:
            l= len(q)
            row=[]
            for i in range(l):
                r= q.popleft()
                if r.left:
                    q.append(r.left)
                if r.right:
                    q.append(r.right)
                row.append(r.val)
            ans.append(row)

        return ans