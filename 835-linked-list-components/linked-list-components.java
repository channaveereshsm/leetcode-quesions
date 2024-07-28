/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> m=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            m.add(nums[i]);
        }
        
        int c=0,ans=0;
        while(head!=null)
        {
         if(m.contains(head.val))
           {
            if(c==0)
            {
                c=1;
                ans++;
            }
           } 
           else
           c=0;

           head=head.next;

        }
        
        
        
        return ans;
        
    }
}