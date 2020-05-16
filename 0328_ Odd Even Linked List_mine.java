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
    public ListNode oddEvenList(ListNode head) {
        if (head ==null || head.next==null) return head;
        ListNode head1=head,head2=new ListNode(0);
        ListNode p1=head1,p2=head2;
        while( p1.next!=null && p1.next.next!=null){
            p2.next=p1.next;
            p1.next=p1.next.next;
            p2=p2.next;
            p1=p1.next;
        }
        if (p1.next!=null) {p2.next=p1.next;}
        else p2.next=null;
        p1.next=head2.next;
        return head1;
        
    }
}
