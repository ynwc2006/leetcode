/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode m= new ListNode();
        ListNode mi=m;
        ListNode tl1=l1;
        ListNode tl2=l2;
        if (l1==null) return l2;
        if (l2==null) return l1;
        while (tl1!=null && tl2!=null){
            if(tl1.val>tl2.val){
                m.next=new ListNode(tl2.val);
                tl2=tl2.next;
            }
            else {
                m.next=new ListNode(tl1.val);
                tl1=tl1.next;
            }
            
        m=m.next;
            
        }
        while (tl1!=null ){
            m.next=new ListNode(tl1.val);
            tl1=tl1.next;
            m=m.next;
        }
        while (tl2!=null ){
            m.next=new ListNode(tl2.val);
            tl2=tl2.next;
            m=m.next;
        }
        
        return mi.next;
    }
}
