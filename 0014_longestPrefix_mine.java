class Solution {
    public String longestCommonPrefix(String[] strs) {
        int numOfStrs=strs.length;
        if (numOfStrs==0) return "";
        
        int shortest=strs[0].length();
        for (int i=0; i<numOfStrs;i++){
            if (strs[i].length()<shortest) shortest=strs[i].length();
        }
        
        String commonString="";
        for (int i=0; i<shortest;i++){
            char c=strs[0].charAt(i);
            boolean b=true;
            for (int j=0;j<numOfStrs;j++){
                if (strs[j].charAt(i)!=c) {
                    
                    b = false;
                    break;
                }
            }
            if (b) commonString+=c;
            else break;
        }
        return commonString;
    }
}
