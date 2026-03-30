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
    public boolean chk(TreeNode root, int min, int max)
    {
        if(root==null)
        {
            return true;
        }

        return ((root.val<max) && (root.val>min)) && (chk(root.left, min, root.val)) && (chk(root.right,root.val,max));
    }
    public boolean isValidBST(TreeNode root) {
        return chk(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
