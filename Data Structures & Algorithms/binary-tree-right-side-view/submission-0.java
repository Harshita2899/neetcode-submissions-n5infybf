/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        if(root!=null)
        {
            q.offer(root);
        }
        while(!q.isEmpty())
        {
            int s= q.size();
            TreeNode m;
            
            for(int i=0;i<s;i++)
            {
                m = q.poll();
                if(i==s-1)
                {
                    ans.add(m.val);
                }
                if(m.left!=null)
                {
                    q.offer(m.left);
                }
                if(m.right!=null)
                {
                    q.offer(m.right);
                }
            }
        }
        return ans;
    }
}
