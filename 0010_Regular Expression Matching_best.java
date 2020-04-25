class Solution {
    int[][] memo;
    public boolean isMatch(String text, String pattern) {
        memo= new int[text.length()+1][pattern.length()+1];
        return dp(0,0,text,pattern);
    }
    
    private boolean dp(int i,int j, String text, String pattern){
        if (memo[i][j]!=0) return memo[i][j]==1?true:false;
        boolean ans;
        if (j==pattern.length()) {ans=i==text.length();}
        else {
            boolean firstMatch=(i<text.length() && (pattern.charAt(j)=='.' ||  text.charAt(i)==pattern.charAt(j)));
            if(j+1<pattern.length() && pattern.charAt(j+1)=='*'){
                ans=( dp(i,j+2,text,pattern) || firstMatch && dp(i+1, j,text,pattern)  );
            }
            else ans=firstMatch && dp(i+1,j+1,text,pattern);
            
        }
        memo[i][j]=ans?1:-1;
        return ans;
        
        
    }
}
