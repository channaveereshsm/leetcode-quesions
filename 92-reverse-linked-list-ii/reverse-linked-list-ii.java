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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        Stack<Integer> s=new Stack<>();
        int l=left;
        while(l>1)
        {
            temp=temp.next;
            l--;
        }
        l=left;
        ListNode h1=temp;
        while(l<=right)
        {
            s.push(temp.val);
            temp=temp.next;
            l++;
        }
        for(int i=left;i<=right;i++)
        {  
            h1.val=s.pop();
            h1=h1.next;
        }
        
        return head;
        
    }
}