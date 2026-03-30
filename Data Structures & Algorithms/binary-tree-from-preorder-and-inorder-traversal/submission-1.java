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
    int preindex=0;
    public TreeNode bTree(int[] pre, int[] in, int start, int end)
    {
        
        if(start>end)
        {
            return null;
        }
        int ind =start;
        for(int i =start;i<=end;i++)
        {
            if(in[i]==pre[preindex])
            {
                ind =i;
                break;
            }
        }
        TreeNode root = new TreeNode(pre[preindex++]);
        root.left = bTree(pre,in,start,ind-1);
        root.right = bTree(pre,in,ind+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bTree(preorder, inorder, 0,  preorder.length-1);
    }
}
