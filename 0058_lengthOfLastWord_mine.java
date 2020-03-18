class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length()==0) return 0;
 /*     int lastSpace=0;
        while(s.charAt(s.length()-1-lastSpace) == ' ' && s.length()-1-lastSpace>0){
            lastSpace++;
        }
        
        for(int i=s.length()-1-lastSpace;i>=0;i--){
            if (s.charAt(i) == ' ') {
                return s.length()-1-lastSpace-i;
            }
        }
        return s.length()-lastSpace;
// not so intuitive, too much index change.
*/
        int trueLast=s.length()-1;
        while(s.charAt(trueLast) == ' '){
            if (trueLast==0) return 0;
            trueLast-=1;
        }
        
        for(int i=trueLast;i>=0;i--){
            if(s.charAt(i) == ' '){
                return trueLast-i;
            }
        }
        
        return trueLast+1;
        
    }
}
