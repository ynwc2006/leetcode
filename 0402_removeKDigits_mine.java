class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()) return "0";
        if(k==0) return num;
        String ans="";

        int i=0;
        while(i+1<num.length()){
            if(num.charAt(i+1)<num.charAt(i)) break;
            i++;
            }
        ans=num.substring(0,i)+num.substring(i+1);

        i=0;
        while(i<ans.length() && ans.charAt(i)=='0') i++;
        if (i==ans.length()) return "0";
        ans=ans.substring(i);
        return removeKdigits(ans,k-1);
    }
}
