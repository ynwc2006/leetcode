class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0) return 0;
        for(int j=0; j<=(haystack.length()-needle.length());j++){
            int i=0;
            while(i < needle.length()){
                if (haystack.charAt(j+i)!=needle.charAt(i)) break;
                else i++;
                }
            if (i==needle.length()) return j;
            
        }
        return -1;
                
    }
}
