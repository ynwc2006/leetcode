// recursion
class Solution {
    int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        memo=new int[text1.length()][text2.length()];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        int res= dp(text1,text2,text1.length()-1,text2.length()-1);
        return res;
    }
    
    private int dp(String text1,String text2,int end1,int end2){

        if (end1<0|| end2<0) return 0;
        if (memo[end1][end2]!=-1) return memo[end1][end2];
        int t=0;
        if (text1.charAt(end1)==text2.charAt(end2)) t=1;
        if (t==1) memo[end1][end2]=t+dp(text1,text2,end1-1,end2-1);
        else memo[end1][end2]=Math.max(dp(text1,text2,end1-1,end2),dp(text1,text2,end1,end2-1));
            
        return memo[end1][end2];
    }
}
// iteration
class Solution {
  
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp =new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<text1.length()+1;i++) dp[i][0]=0;
        for(int j=0;j<text2.length()+1;j++) dp[0][j]=0;
        for(int i=1;i<=text1.length();i++)
            for(int j=1;j<=text2.length();j++){
                dp[i][j]=text1.charAt(i-1)==text2.charAt(j-1)?1+dp[i-1][j-1]:Math.max(dp[i-1][j],dp[i][j-1]);
            }
        return dp[text1.length()][text2.length()];
    }
}
