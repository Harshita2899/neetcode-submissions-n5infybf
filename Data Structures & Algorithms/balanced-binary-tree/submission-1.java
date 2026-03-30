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
    public int heigtOfTree(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        return 1+ Math.max(heigtOfTree(root.left), heigtOfTree(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null)
        {
            return true;
        }
        int left = heigtOfTree(root.left);
        int right = heigtOfTree(root.right);
        int diff = Math.abs(left-right);
        return ((diff<=1) && isBalanced(root.left) && isBalanced(root.right));
    }
}
