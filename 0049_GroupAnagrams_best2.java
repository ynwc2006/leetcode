class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0)  return new ArrayList();
        HashMap<String, ArrayList> ans= new HashMap<>();
        
        for(String s : strs){
            int[] count=new int[26];
            Arrays.fill(count,0);
            for(char c : s.toCharArray()){
                count[c-'a']++;
            }
            
            String sb="";
            for(int i=0;i<26;i++){
                sb+="#";
                sb+=String.valueOf(count[i]);
            }
            
            if(!ans.containsKey(sb)) ans.put(sb, new ArrayList());
            ans.get(sb).add(s);
            
        }
        return new ArrayList(ans.values());
    }
}
