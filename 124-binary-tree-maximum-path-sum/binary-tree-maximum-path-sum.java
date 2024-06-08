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
    int max=Integer.MIN_VALUE;
    public int find(TreeNode root)
    {
        if(root==null)
            return 0;
        int l=find(root.left);
        l=Math.max(0,l);
        int r=find(root.right);
        r=Math.max(r,0);
        max=Math.max(root.val+l+r,max);
        return Math.max(l,r)+root.val;
       
    }
    
    public int maxPathSum(TreeNode root) {
        int x=find(root);
        return max;
    }
}
