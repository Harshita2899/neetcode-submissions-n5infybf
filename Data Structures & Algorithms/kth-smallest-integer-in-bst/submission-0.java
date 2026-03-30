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
    int ans;
    int key;
    private void inorder(TreeNode root)
    {
        if (root==null)
        {
            return;
        }
        inorder(root.left);
        key--;
        if(key==0)
        {
            ans = root.val;
        }
        inorder(root.right);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        key=k;
        inorder(root);
        return ans;
    }
}
