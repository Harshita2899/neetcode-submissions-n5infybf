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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root==null)
        {
            return root;
        }
        if(root.val== p.val || root.val==q.val)
        {
            return root;
        }
        TreeNode lca1 = lowestCommonAncestor(root.left,p,q);
        TreeNode lca2 = lowestCommonAncestor(root.right,p,q);
        if(lca1!=null && lca2!=null)
        {
            return root;
        }
        else if (lca1==null)
        {
            return lca2;
        }
        else
        {
            return lca1;
        }

    }
}
