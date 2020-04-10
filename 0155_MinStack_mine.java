class MinStack {

    /**
     * initialize your data structure here.
     */
    private int size;
    private Node bottom;
    private Node top;

    public MinStack() {
        Node bottom = new Node();
        Node top = new Node();
        size = 0;
    }

    class Node {
        int val;
        int min;
        Node pre;
        Node next;

        Node() {
            val = 0;
            min = 0;
            pre = null;
            next = null;
        }

        Node(int v) {
            val = v;
            min = v;
            pre = null;
            next = null;
        }
    }

    public void push(int x) {
        if (size == 0) {
            bottom = new Node(x);
            top = bottom;
            size++;
        } else {
            size++;
            Node n = new Node(x);
            n.min = x > top.min ? top.min : x;
            Node t = top;
            top = n;
            top.pre = t;
            t.next = top;
        }
        return;
    }

    public void pop() {
        if (size==0) return;
        size--;
        top = top.pre;
        if(top!=null) top.next = null;
        return;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return top.min;
    }

/*    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }*/
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

}
