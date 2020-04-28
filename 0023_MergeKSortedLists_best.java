//divide and conquer. written by myself
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=new ListNode(0);
        head = mergeTwo(lists,0,lists.length-1);
        return head;
    }
    
    private ListNode mergeTwo(ListNode[] l,int start,int end){
        if(start>end) return null;
        if (start==end) return l[start];
        int mid=(start+end)/2;
        ListNode head1=mergeTwo(l,start,mid);
        ListNode head2=mergeTwo(l,mid+1,end);
        ListNode head=new ListNode(0);
        ListNode p=head;
        while(head1!=null || head2!=null){
            if(head1==null){
                p.next=new ListNode(head2.val);
                head2=head2.next;
            }
            else if(head2==null || head1.val<head2.val){
                p.next=head1;
                head1=head1.next;
            }
            else{
                p.next=new ListNode(head2.val);
                head2=head2.next;
            }
            p=p.next;
        }
        return head.next;
        
    }
}

//Priority Queue
public ListNode mergeKLists(ListNode[] lists) { 
        Comparator<ListNode> cmp;
        cmp = new Comparator<ListNode>() {  
        @Override
        public int compare(ListNode o1, ListNode o2) {
            // TODO Auto-generated method stub
            return o1.val-o2.val;
        }
        };
 
        Queue<ListNode> q = new PriorityQueue<ListNode>(cmp);
        for(ListNode l : lists){
            if(l!=null){
                q.add(l);
            }        
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while(!q.isEmpty()){ 
            point.next = q.poll();
            point = point.next; 
            ListNode next = point.next;
            if(next!=null){
                q.add(next);
            }
        }
        return head.next;
    }
