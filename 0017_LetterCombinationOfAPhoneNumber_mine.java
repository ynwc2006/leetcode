class Solution {
    public List<String> letterCombinations(String digits) {
        
        String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> ans= new LinkedList<>();
        if (digits.length()==0) return ans;
        ans.add("");
        //boolean initial=true;
        for(char a: digits.toCharArray() ){
            int x= a-'0';
           /* if (initial){
                for(char b : map[x].toCharArray()){
                    ans.add(""+b);
                }
                initial=false;
            }*/
            
            LinkedList<String> tans=new LinkedList<>();
            
            for(char b : map[x].toCharArray()){
                int i=0;
                while(i<ans.size() ){
                    tans.add(ans.get(i)+b);
                    i++;
                }
            }
            ans=tans;
            
        }
        
        return ans;
        
    }
}
