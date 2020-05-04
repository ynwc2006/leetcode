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
    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        int size=0;
        ListNode p=head;
        while(p!=null) {
            size++;
            p=p.next;
        }
        p=head;
        int[] m= new int[size];
        for(int i=0;i<size;i++){
            m[i]=p.val;
            p=p.next;
        }
        
        ListNode headAns=new ListNode(m[size-1]);
        p=headAns;
        for(int i=size-2;i>=0;i--){
            p.next=new ListNode(m[i]);
            p=p.next;
        }
        return headAns;
        
    }
}
