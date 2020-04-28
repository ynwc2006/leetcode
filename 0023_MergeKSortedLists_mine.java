/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=new ListNode(0);
        ListNode p=head;
        int[] sizes=new int[lists.length];
        int longest=0;
        int sizeSum=0;
        for(int k=0;k<lists.length;k++){
            ListNode headK=lists[k];
            while(headK!=null){
                sizes[k]++;
                headK=headK.next;
            }
            sizeSum+=sizes[k];
            if (sizes[k]>sizes[longest]) longest=k;
        }
        
        while(sizeSum>0){
            int min=Integer.MAX_VALUE;
            int minK=0;
            for(int k=0;k<lists.length;k++){
                if(sizes[k]>0 && lists[k].val<min){
                    minK=k;
                    min=lists[minK].val;
                }
            }
            p.next=new ListNode(lists[minK].val);
            p=p.next;
            lists[minK]=lists[minK].next;
            sizes[minK]--;
            sizeSum--;
            
        }
        return head.next;
    }
}
