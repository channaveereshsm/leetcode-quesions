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
    List<List<TreeNode>> l=new ArrayList<>();

    public void find(TreeNode root,List<TreeNode> l1)
    {
         if(root==null)
         return;
        if(root.left==null && root.right==null)
        {
            l1.add(root);
            l.add(new ArrayList<>(l1));
             l1.remove(l1.size()-1);
            return ;
        }
        l1.add(root);
    
        find(root.left,l1);
       
        find(root.right,l1);
        l1.remove(l1.size()-1);


    }
    public int countPairs(TreeNode root, int d) {
        List<TreeNode> l1=new ArrayList<>();
        int ans=0;
        find(root,l1);
          for(int i=0;i<l.size();i++)
          {
            for(int j=i+1;j<l.size();j++)
            {
                int f=0;
                for(int k=0;k<Math.min(l.get(i).size(),l.get(j).size());k++)
                {
                    if(l.get(i).get(k)!=l.get(j).get(k) && f==0)
                    {
                        if(l.get(i).size()+l.get(j).size()-2*(k)<=d)
                       { ans++;
                       }
                       f=1;
                    }
                    if(f==1)
                     break;

                }
            }
          }
       
        return ans;
        
    }
}