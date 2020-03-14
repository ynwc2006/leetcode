//convert the List to a int number. It doesn't work when there is an overflow over (-2147483648 to 2147483647)
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
        
        int len1=1;
        int len2=1;
        
        ListNode r = new ListNode();
        ListNode pl1=l1,pl2=l2,pr=r;
        
        int n1=0;
        int n2=0;
/*        while(pl1!=null){
            len1+=1;
            pl1=pl1.next;
            
        }
        pl1=l1;
        while(pl2!=null){
            len2+=1;
            pl2=pl2.next;
        }
        pl2=l2;
        */
        
        while(pl1!=null){
            n1=n1+pl1.val*(int)Math.pow(10,len1-1);
            len1+=1;
            pl1=pl1.next;
        }
        while(pl2!=null){
            n2=n2+pl2.val*(int)Math.pow(10,len2-1);
            len2+=1;
            pl2=pl2.next;
        }
        
        int nr=n1+n2;
        
        if (nr==0) return new ListNode(0);        
        while(nr!=0){
            r.next=new ListNode(nr%10);
            r=r.next;
            nr=nr/10;
        }
        return pr.next;
    }
}
