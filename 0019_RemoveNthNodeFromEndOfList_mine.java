/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       // ListNode thead=head;
        ListNode p=head;
        int size=1;
        while (p.next!=null){
            p=p.next;
            size++;
        }
        
        p=head;
        int i=size-n+1;
        
        if (i==1) return head.next;
        if(i==size) {
            while(p.next.next!=null){
                p=p.next;
            }
            p.next=null;
            return head;
        }
       
        while(i>2){
            p=p.next;
            i--;
        }
        p.next=p.next.next;
        
        
        return head;
    }
}
