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
class Solution {List<Integer> l=new ArrayList<>();
     public void dfs(TreeNode root)
     {
        if(root==null)
        return;
        l.add(root.val);
        dfs(root.left);
        dfs(root.right);

     }
     public TreeNode find(int l1,int ri)
     {
        if(l1>ri)
        return null;
        int mid=(l1+ri)/2;
        TreeNode r1=new TreeNode(l.get(mid));
       
        r1.left=find(l1,mid-1);
        r1.right=find(mid+1,ri);
        return r1;
     }
    public TreeNode balanceBST(TreeNode root) {
        dfs(root);
        System.out.println(l);
        Collections.sort(l);
     
        TreeNode r=find(0,l.size()-1);
        return r;
    }
}