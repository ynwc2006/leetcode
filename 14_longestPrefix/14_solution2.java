class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length==0) return "";
        
        
        String commonString=strs[0];
        for (int i=0; i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for (int j=0;j<strs.length;j++){
                if ((i>=strs[j].length()) || (strs[j].charAt(i)!=c)) {
                    
                    return commonString.substring(0,i);
                }
            }
            
        }
        return commonString;
    }
}
