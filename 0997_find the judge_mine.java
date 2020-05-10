class Solution {
    public int findJudge(int N, int[][] trust) {
        boolean[] trustSbd=new boolean[N+1];
        int[] trusted=new int[N+1];
        for(int i=0;i<trust.length;i++){
            trustSbd[trust[i][0]]=true;
            trusted[trust[i][1]]++;
            
        }
        for(int i=1;i<N+1;i++){
            if(trustSbd[i]==false && trusted[i]==N-1)
                return i;
        }
        return -1;
    }
}
