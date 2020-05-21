class Solution {
    public int countSquares(int[][] matrix) {
        if(matrix.length==0) return 0;
        int m=matrix.length,n=matrix[0].length;
        int[][] dp=new int[m][n];
       // int maxL=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) {
                    dp[i][j]=matrix[i][j];
                   // if (matrix[i][j]==1) maxL=1;
                }
                else if(matrix[i][j]==1){
                    int min=Math.min(dp[i-1][j-1],dp[i-1][j]);
                    min=Math.min(min,dp[i][j-1]);
                    dp[i][j]=min+1;
                   // maxL=Math.max(dp[i][j],maxL);
                }
            }
        }
       // if (maxL==0) return 0;
        int ans=0;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                ans+=dp[i][j];
                //System.out.println(dp[i][j]);
            }
        return ans;
    }
}
