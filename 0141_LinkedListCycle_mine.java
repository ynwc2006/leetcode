public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map= new HashMap<>();
        int i=0;
        while(head!=null){
            if(map.containsKey(head)) return true;
            map.put(head,i);
            i++;
            head=head.next;
        }
        return false;
    }
}
