class Solution {
    public class Node{
        char key;
        int val;
        Node(char k,int v){
            key=k;
            val=v;
        }
        Node(){
            this(' ',0);
        }
        
    }
    public String frequencySort(String s) {
        Comparator<Node> cmp;
        cmp=new Comparator<Node>(){
            public int compare(Node n1,Node n2){
                return n2.val-n1.val;
            }
        };
        Queue<Node> pq=new PriorityQueue<Node> (cmp);
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(freq[i]>0)
                pq.offer(new Node((char)i,freq[i]));
        }
        
        String ans="";
        while(pq.size()!=0){
            Node n=pq.poll();
            int i=n.val;
            char c=n.key;
            while(i!=0){
                ans+=c;
                i--;
            }
        }
        return ans;
    }
}
