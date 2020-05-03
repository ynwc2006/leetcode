// it only needs to scan once, so it's better than the scan twice methode in the case of DNA chain.
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> feq = new HashMap<>();
        Map<Character, Integer> index = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            feq.put(s.charAt(i), feq.getOrDefault(s.charAt(i), 0) + 1);
            index.put(s.charAt(i), i);
        }
        
        int min = Integer.MAX_VALUE;     
        for (char c : feq.keySet()) {
            if (feq.get(c) == 1) {
                min = Math.min(min, index.get(c));
            }
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
