class Solution {
    int[][] dp;
    public int maxUncrossedLines(int[] A, int[] B) {
       dp=new int[A.length][B.length];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
       return helper(A,B,0,0) ;
    }
    
    public int helper(int[] A,int[] B,int startA, int startB){
        if(startA>=A.length || startB>=B.length) return 0;
        if(dp[startA][startB]!=-1) return dp[startA][startB];
        int ans=0;
        if(A[startA]==B[startB]) ans=1;
        ans=Math.max(ans+helper(A,B,startA+1,startB+1),helper(A,B,startA,startB+1));
        ans=Math.max(ans,helper(A,B,startA+1,startB));
        dp[startA][startB]=ans;
        return ans;
        
    }
}
