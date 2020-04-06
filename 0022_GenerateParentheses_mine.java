class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans=new ArrayList<>();
        ans.add("");
        int[] count = new int[(int)Math.pow(2,n)];
        int i=0;
        while(i<=n*2-1){
            List<String> tans=new ArrayList<>();
            int[] tcount = new int[(int)Math.pow(2,n*2)];
            int p=0;
            for(int j=0;j<ans.size();j++){
                
                if (count[j]==0) {
                    tans.add(ans.get(j)+"(") ;
                    tcount[tans.size()-1]=count[j]+1;
                }
                else if(count[j]>0 && count[j]<2*n-i){
                    tans.add(ans.get(j)+"(");
                    tcount[tans.size()-1]=count[j]+1;
                    tans.add(ans.get(j)+")");
                    tcount[tans.size()-1]=count[j]-1;
                }
                else {
                    tans.add(ans.get(j)+")");
                    tcount[tans.size()-1]=count[j]-1;
                }
                
            }
            ans=tans;
            count=tcount;
                i++;
        }
        
        return ans;
    }
}
