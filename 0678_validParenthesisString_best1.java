class Solution {
    public boolean checkValidString(String s) {
        //Let lo, hi respectively be the smallest and largest possible number of open left brackets after processing the current character in the string.
        int lo=0, hi=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '*': 
                    hi++;
                    lo--;
                    break;
                case '(':
                    lo++;
                    hi++;
                    break;
                case ')':
                    hi--;
                    lo--;
            }
            if (hi<0) return false;
            if(lo<0) lo=0;
            
        }
    
        
    return lo==0;
    
        
    }
}


class Solution {
    public boolean checkValidString(String s) {
    //range of balance{'('+1,')'-1} -> [lo,hi]
        int lo=0,hi=0;
        for(char c: s.toCharArray()){
            lo+= (c=='(')? 1:-1;
            hi+=(c!=')')?1:-1;
            if(hi<0) return false;
            lo=Math.max(lo,0);
        }
        return lo==0;
        
    }
}
