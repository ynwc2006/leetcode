class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length==0) return 0;
        int[][] dp= new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1') {dp[i][j]=1;max=1;}
            }
        if (max==0) return 0;
        for(int i=1;i<matrix.length;i++)
            for(int j=1;j<matrix[0].length;j++){
                int t=Math.min(dp[i-1][j-1],dp[i][j-1]);
                    t=Math.min(t,dp[i-1][j]);
                if(t>0 && matrix[i][j]=='1'){
                    dp[i][j]=t+1;
                    max=Math.max(dp[i][j],max);
                }
                    
                }
                                           
        return max*max;
    }
}
