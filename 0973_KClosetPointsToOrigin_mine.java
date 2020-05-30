class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Comparator cmp=new Comparator<int[]>() {
            public int compare(int[] p1,int[] p2){
                int d1=p1[1]*p1[1]+p1[0]*p1[0];
                int d2=p2[1]*p2[1]+p2[0]*p2[0];
                return d1-d2;
            }
        };
        PriorityQueue<int[]> pq=new PriorityQueue<>(cmp);
        
        for(int i=0;i<points.length;i++){
            pq.offer(points[i]);
        }
        
        int[][] ans= new int[K][2];
        for(int i=0;i<K;i++){
            int[] t=pq.poll();
            ans[i][0]=t[0];
            ans[i][1]=t[1];
        }
        return ans;
    }
}
