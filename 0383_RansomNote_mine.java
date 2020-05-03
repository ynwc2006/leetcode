class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<m;i++){
            char c=magazine.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int j=0;j<n;j++){
            char c=ransomNote.charAt(j);
            if(!map.containsKey(c) || map.get(c)<1) return false;
            else map.put(c,map.get(c)-1);
        }
        return true;
    }
}
