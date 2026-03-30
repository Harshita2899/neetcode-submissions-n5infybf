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
    public boolean isValidBST(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        boolean ans = true;
        if(root.left!=null)
        {
            ans = ans && (root.left.val<root.val);

        }  
        if(root.right!=null)
        {
            ans = ans && (root.right.val>root.val);

        } 
        return ans && isValidBST(root.left) && isValidBST(root.right);

    }
}
