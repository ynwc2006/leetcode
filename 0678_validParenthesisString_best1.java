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
