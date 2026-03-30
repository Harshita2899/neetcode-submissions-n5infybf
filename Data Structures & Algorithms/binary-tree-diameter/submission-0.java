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
    int ans = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        findDiameter(root);
        return ans;
    }
    public int findDiameter(TreeNode root){
        if(root==null) return 0;
        int l = findDiameter(root.left);
        int r = findDiameter(root.right);
        if(root.left!=null){
            l = 1+l;
        }
        if(root.right!=null){
            r = 1+r;
        }
        int max = Math.max(l, r);
        ans = Math.max(l+r, ans);
        return max;
    }
}
