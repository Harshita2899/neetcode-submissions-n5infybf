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
    public TreeNode generatetree(int[] preorder, int[] inorder ,int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        int r= preorder[preindex++];
        TreeNode root = new TreeNode(r);
        int j=0;
        for(int i =start;i<=end;i++)
        {
            if(inorder[i]==r)
            {
                j =i;
                break;
            }
        }
        root.left = generatetree(preorder,inorder,start,j-1);
        root.right = generatetree(preorder,inorder,j+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return generatetree(preorder,inorder,0,inorder.length-1); 
    }
}
