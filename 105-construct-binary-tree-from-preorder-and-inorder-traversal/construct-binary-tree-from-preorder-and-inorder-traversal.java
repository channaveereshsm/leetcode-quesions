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
    public TreeNode build(int[] preorder,int[] inorder,int sin,int spr,int endin)
    {
        if(sin>endin||spr>preorder.length-1)
        return null;
        TreeNode root=new TreeNode(preorder[spr]);
        int ind=0;
        for(int i=sin;i<=endin;i++)
        {
            if(inorder[i]==root.val)
            {
            ind=i;
            }
        }
        int leftend=ind-sin;
        root.left=build(preorder,inorder,sin,spr+1,ind-1);
        root.right=build(preorder,inorder,ind+1,spr+leftend+1,endin);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return build(preorder,inorder,0,0,inorder.length-1);
    }
}