//smart sliding window
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int i=0,j=0;
        Map<Character, Integer> map=new HashMap<>();
        for(;j<s.length();j++ ){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i,map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j),j);
            ans=Math.max(ans, j-i+1);
        }
        return ans;
    }
}
