# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        q = deque()
        ans=[]
        if root:
            q.append(root)

        while q:
            s = len(q)
        
            for i in range(s):
                t = q.popleft()
                if i==s-1:
                    ans.append(t.val)

                if t.left:
                    q.append(t.left)
                if t.right:
                    q.append(t.right)
            
        return ans
