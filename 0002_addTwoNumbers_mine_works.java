/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.lang.Math;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        ListNode ls=new ListNode(0);
        ListNode lr=ls;
        while (l1!=null && l2!=null){
            ls.next=new ListNode((l1.val+l2.val+sum)%10);
            if (l1.val+l2.val+sum>=10) sum=1;
            else sum=0;
            l1=l1.next;
            l2=l2.next;
            ls=ls.next;
        
    }
        while (l1!=null){
            ls.next=new ListNode((l1.val+sum)%10);
            if (l1.val+sum>=10) sum=1;
            else sum=0;
            l1=l1.next;
            ls=ls.next;
        }
        while (l2!=null){
            ls.next=new ListNode((l2.val+sum)%10);
            if (l2.val+sum>=10) sum=1;
            else sum=0;
            l2=l2.next;
            ls=ls.next;
        }
        
        if (sum!=0) ls.next=new ListNode(sum);
        
        return lr.next;
    }
}
