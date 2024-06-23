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
    int ans=0;
    public void find(TreeNode root,int i,int sum)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
           
            ans=ans+sum*2+root.val;
            return;
        }
        sum=sum*2+root.val;
        find(root.left,i+1,sum);
        find(root.right,i+1,sum);
        sum=(sum-root.val)/2;
    }
    public int sumRootToLeaf(TreeNode root) {
        find(root,0,0);
        return ans;
    }
}