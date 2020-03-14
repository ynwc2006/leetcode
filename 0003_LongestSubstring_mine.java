class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        int maxLength=0;
        for(int i = 0;i<s.length();i++){
            int l = 0;
            Map<Character,Integer> map= new HashMap<>();
            for(;i+l<s.length();l++){
                char cur=s.charAt(i+l);
                if(!map.containsKey(cur)) map.put(cur,i);
                else break;
            }
            if (l>maxLength) maxLength=l;
        }
        return maxLength;
    }
}
