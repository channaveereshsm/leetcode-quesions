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
    public ListNode mergeNodes(ListNode head) {
        ListNode h=head,ans=head,prev=head;
        h=h.next;
        int sum=0;
        while(h!=null)
        {
        if(h.val==0)
        {
         ans.val=sum; 
         prev=ans;
         ans=ans.next; 
         sum=0;
        }
        else
        {
        sum=sum+h.val;
        }
        h=h.next;
        
        }
        prev.next=null;
        return head;
    }
}