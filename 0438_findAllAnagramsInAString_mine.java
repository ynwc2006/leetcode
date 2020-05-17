class Solution {
    List<Integer> ans=new LinkedList();
    public List<Integer> findAnagrams(String s, String p) {
        
        for(int i=0;i<=s.length()-p.length();i++){
            int[] map =new int[26];
            for(char c: p.toCharArray()){
              map[c-'a']++;
            }
            int j=0,k=p.length();
            while(j+i<s.length() && k>0){
                char c=s.charAt(j+i);
                if(map[c-'a']>0) {
                    map[c-'a']--;
                    j++;
                    k--;
                }
                else break;
            }
            if (k==0) ans.add(i);
        }
        return ans;
    }

}
