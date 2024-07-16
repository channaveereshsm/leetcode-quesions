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
    TreeNode root;
    public void insert(TreeNode root,int p)
    {
        if(root.left==null &&root.val>=p)
        {
                root.left=new TreeNode(p);
                return;
            
        }
        if(root.right==null&& root.val<=p )
        {
            
                root.right=new TreeNode(p);
                return;
            
        }
        if(root.val>=p)
        {
            insert(root.left,p);
        }
        else
        {
            insert(root.right,p);
        }
        

    
    }
    public TreeNode bstFromPreorder(int[] p) {
    root=new TreeNode(p[0]);
    for(int i=1;i<p.length;i++)
    {
     insert(root,p[i]);   
    }
    return root;
        
    }
}