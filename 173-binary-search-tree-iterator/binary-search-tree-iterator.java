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
class BSTIterator {
      List<Integer> l=new ArrayList<>();
      int p=0;
      public void inorder(TreeNode root)
      { if(root==null)
        return;
        
        inorder(root.left);
        l.add(root.val);
        p++;
        inorder(root.right);
        }
    public BSTIterator(TreeNode root) {
       inorder(root);
    }
    
    public int next() {
      //  System.out.println(l);
       int nextVal=l.get(l.size()-p);
        p--;
      return nextVal;

        
    }
    
    public boolean hasNext() {
        if(p>0)
        return true;
        return false;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */