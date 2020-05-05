//solution1
class Solution {
    public boolean isPalindrome(ListNode head) {
        int size=0;
        ListNode p=head;
        while(p!=null){
            size++;
            p=p.next;
        }
        //System.out.println(size);
        int[] a=new int[size];
        p=head;
        int i=0,j=size-1;
        while(p!=null){
            a[i]=p.val;
            i++;
            p=p.next;
        }
        i=0;
        while(i<j){
            if(a[i]!=a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}



//solution 2
class Solution {
    public boolean isPalindrome(ListNode head) {
        int size=0;
        ListNode p=head;
        while(p!=null){
            size++;
            p=p.next;
        }
        int i=0;
        p=head;
        while(i<size/2){
            p=p.next;
            i++;
        }
        ListNode p1=head;
        ListNode p2=reverseList(p);
        
        while(p1!=null && p2!=null){
            if(p1.val!=p2.val) return false;
            p1=p1.next;
            p2=p2.next;
        }
        //if(p2==null && p1==null) return true;
        //if(p2.next==null && p1==null) return true;
        //return false;
        return true;
    }
    
    
    private ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode t=curr.next;
            curr.next=pre;
            pre=curr;
            curr=t;
        }
        return pre;
    }
}
