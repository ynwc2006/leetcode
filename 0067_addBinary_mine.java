class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s= new StringBuilder();
        String rs ="";
        
        if (a.length()==0) return b;
        if (b.length()==0) return a;
        
        int ia=a.length()-1;
        int ib=b.length()-1;
        int carry=0,ns;
        while(ia>=0 & ib>=0){
            int na = (int)a.charAt(ia)%2;
            int nb = (int)b.charAt(ib)%2;
            ns=(na+nb+carry)%2;
            carry=(na+nb+carry)/2;
            s = s.append(ns);
            ia--;
            ib--;
        }
        while(ia>=0){
            int na = (int)a.charAt(ia)%2;
            ns=(na+carry)%2;
            carry=(na+carry)/2;
            s=s.append(ns);
            ia--;
        }
         while(ib>=0){
            int nb = (int)b.charAt(ib)%2;
            ns=(nb+carry)%2;
            carry=(nb+carry)/2;
            s=s.append(ns);
            ib--;
        }
        if (carry==1) s.append(1);
        
        for(int i=s.length()-1;i>=0;i--){
            rs=rs+s.charAt(i);
        }
        
        return rs;
    }
}
