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
    HashMap<Integer,TreeNode> m=new HashMap<>();
    List<Integer> l=new ArrayList<>();
    public void find(TreeNode root)
    {
        if(root==null)
        return;
        m.put(root.val,root);
        find(root.left);
        l.add(root.val);
        find(root.right);

    }
    public TreeNode form(int le,int r)
    {
        if(le>r)
        return null;
        int mid=(le+r)/2;
        TreeNode t=m.get(l.get(mid));
        t.left=form(le,mid-1);
        t.right=form(mid+1,r);
        return t;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        m.put(val,new TreeNode(val));

        find(root);
        System.out.println(m);
        l.add(val);
        Collections.sort(l);
        return form(0,l.size()-1);

    
        
    }
}