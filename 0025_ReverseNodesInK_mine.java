/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k==1) return head;
        int i=k;
        int k_static=k;
        ListNode p, ans=new ListNode(0);
        ListNode ans_head=ans;
        ListNode rest=head;
        boolean rest_set=true;
        boolean enough=true;
        
      while(enough==true){
        head=rest;
        p=head;
       // rest_set=true;
        i=k_static;
        k=k_static;
        while(i>0){
            if (p==null) {enough=false;break;}
            p=p.next;
            i--;
        }
         if(enough) rest=p;
        
        while(k>=1 && enough==true){
            p=head;
            for(i=1;i<=k-1;i++){
                p=p.next;
            }
           ans.next= p;
           // if (rest_set) {rest=p.next;rest_set=false;}
            ans=ans.next;
            k--;
        }
      }
        ans.next=rest;
        return ans_head.next;
    }
}
