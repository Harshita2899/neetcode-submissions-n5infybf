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
    private boolean sameTree(TreeNode p, TreeNode q)
    {
        if(p==null && q==null)
        {
            return true;
        }
        if(p==null ||q==null)
        {
            return false;
        }
        if(p.val != q.val)
        {
            return false;
        }
        return (sameTree(p.left,q.left)&& sameTree(p.right,q.right));
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root ==null && subRoot!=null)
        {
            return false;
        }
        return (sameTree(root,subRoot) || sameTree(root.left,subRoot) || sameTree(root.right,subRoot));
    }
}
