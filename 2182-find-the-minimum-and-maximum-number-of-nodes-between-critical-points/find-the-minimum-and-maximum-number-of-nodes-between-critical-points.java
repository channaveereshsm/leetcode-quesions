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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        for(int i=1;i<l.size()-1;i++)
        {
            if(l.get(i)>l.get(i-1) && l.get(i)>l.get(i+1))
            {
             l1.add(i);
            }
            if(l.get(i)<l.get(i-1) && l.get(i)<l.get(i+1))
            {
             l1.add(i);
            }
        }
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        
        if(l1.size()>1)
           max=l1.get(l1.size()-1)-l1.get(0);
        for(int i=1;i<l1.size();i++)
        {
           
            min=Math.min(l1.get(i)-l1.get(i-1),min);
           
        }
        if(min!=Integer.MAX_VALUE)
        {
            ans[0]=min;
        }
        if(max!=Integer.MIN_VALUE)
        {
            ans[1]=max;
        }
        return ans;
    }
}