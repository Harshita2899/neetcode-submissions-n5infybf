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
    int treehieght (TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return Math.max(treehieght(root.left),treehieght(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null)
        {
            return true;
        }
        boolean ans = Math.abs(treehieght(root.left)-treehieght(root.right))<=1;
        return ans && isBalanced(root.left) && isBalanced(root.right);
    }
}
