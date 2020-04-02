/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode p= new ListNode(0);
        if (head==null || head.next==null) return head;
        ListNode newhead=head.next;
        p.next=head;
        while(p!=null && p.next!=null && p.next.next!=null){
            ListNode o1=p.next;
            ListNode o2=p.next.next;
            ListNode o3=p.next.next.next;
            
            p.next=o2;
            p.next.next=o1;
            p.next.next.next=o3;
            
            p=o1;
            
        }
        return newhead;
    }
}
