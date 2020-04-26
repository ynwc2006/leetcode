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
                //int t1=Math.max(dp(text1,text2,i+1,j),dp(text1,text2,i,j+1));
                //memo[i][j]=Math.max(t1,t+dp(text1,text2,i+1,j+1));
        if (t==1) memo[end1][end2]=t+dp(text1,text2,end1-1,end2-1);
        else memo[end1][end2]=Math.max(dp(text1,text2,end1-1,end2),dp(text1,text2,end1,end2-1));
            
        return memo[end1][end2];
    }
}
