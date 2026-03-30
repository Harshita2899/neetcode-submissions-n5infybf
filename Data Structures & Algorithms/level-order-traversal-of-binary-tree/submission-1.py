# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        ans =[]
        
        dq = deque()
        if root:
            dq.append(root)
        
        while len(dq)>0:
            level =[]
            
            m = len(dq)
            for i in range(m):
                t = dq.popleft()
                level.append(t.val)
                if t.left:
                    dq.append(t.left)
                if t.right:
                    dq.append(t.right)
            
            ans.append(level)

        return ans

