class Solution {
    public String countAndSay(int n) {
        if (n==1) return Integer.toString(1);
        String sPre = countAndSay(n-1);
        String sCurrent="";
        char currentNum=sPre.charAt(0);
        int count=0 ;
        for(int i=0;i<sPre.length();i++){
            if (sPre.charAt(i)!= currentNum){
                sCurrent=sCurrent+Integer.toString(count)+currentNum;
                currentNum=sPre.charAt(i);
                count=1;
            }
            else {
                count+=1;
            }
        }
        
        sCurrent=sCurrent+Integer.toString(count)+currentNum;
        return sCurrent;
    }
}
