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
    public int goodNodes(TreeNode root) {
        int res = 0;
        if(root == null)
        {
            return res;
        }
        Queue <Pair<TreeNode,Integer>>  q = new LinkedList();
        q.offer(new Pair<>(root, Integer.MIN_VALUE));
        while(!q.isEmpty())
        {
            Pair<TreeNode,Integer> p = q.poll();
            if(p.getValue()<=p.getKey().val)
            {
                res++;
            }
            if(p.getKey().left!=null)
            {
                q.offer(new Pair<>(p.getKey().left, Math.max(p.getKey().val, p.getValue())));
            }
            if(p.getKey().right!=null)
            {
                q.offer(new Pair<>(p.getKey().right, Math.max(p.getKey().val, p.getValue())));
            }
        }
        return res;
        
    }
}
