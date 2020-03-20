class Solution {
    private int low=0,len=0;
   public  String longestPalindrome(String s) {
    
        if(s==null || s.length() < 1) return "";

       for(int i=0;i<s.length(); i++){
           expandAroundCenter(s,i,i);
           expandAroundCenter(s,i,i+1);

           
       }
       return s.substring(low,low+len);
       
    } 
    
    private void expandAroundCenter(String s, int left, int right) {
        int L=left, R=right;
        while(L>=0 && R <s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        if (len< R-L-1){
            low=L+1;
            len=R-L-1;
        }
    }
    
    
}
