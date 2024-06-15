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
    public int widthOfBinaryTree(TreeNode root) {
         int max=1;
    Queue<TreeNode> q=new LinkedList<>();
    Queue<Integer> p=new LinkedList<>();
    
 q.add(root);
    p.add(1);
    while(q.size()!=0)
    {
        int size=q.size(),f=0,b=0;
        for(int i=0;i<size;i++)
        {
            if(i==0)
                f=p.peek();
            if(i==size-1)
                b=p.peek();
            TreeNode n=q.poll();
            int x=p.poll();
            if(n.left!=null)
            {
                q.add(n.left);
                p.add(2*x);
            }
            if(n.right!=null)
            {
                q.add(n.right);
                p.add(2*x+1);
            }
        }
        max=Math.max(b-f+1,max);
    }
    return max;
     
        
    }
}