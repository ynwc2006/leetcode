// solution of the java competition in April 2020
//solution 1
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head.next != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
}

//solution 2
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

//mine
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p=head;
        int size=0;
        while(p!=null){
            size++;
            p=p.next;
        }
        if (size<2) return head;
        int pos=size/2+1;
        p=head;
        while(pos>1){
            p=p.next;
            pos--;
        }
        return p;
    }
}
