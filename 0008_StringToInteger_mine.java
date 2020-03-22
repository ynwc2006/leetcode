class Solution {
    public int myAtoi(String str) {
        if (str.length()==0) return 0;
        int p=0, len=0;
        int[] num= new int[10];
        boolean negative = false;
        while(p<str.length() && str.charAt(p)==' '){
            p++;
        }
        
        if(p<str.length() && str.charAt(p) == '-') {
            negative=true;
            p++;
        }
        
        else if(p<str.length() && str.charAt(p) == '+') {
            negative=false;
            p++;
        }
        
        while (p<str.length() && str.charAt(p) =='0') p++;
        
        while(p<str.length() && str.charAt(p)>='0' && str.charAt(p)<='9' ){
            if(len==10) return negative? Integer.MIN_VALUE: Integer.MAX_VALUE;
            num[len] = str.charAt(p) - '0';
            len++;
            p++;
            
        }
        
        if (len==0) return 0; // all the ones begin with character other than digits
        
        len--;
        Double renum = 0.0;
        for(int i=0 ;i<=len;i++){
            renum = renum+ num[i]* Math.pow(10, len-i )*(negative? -1:1);
         //   if (negative && renum>0) return  Integer.MIN_VALUE;
         //   if (!negative && renum<0) return  Integer.MAX_VALUE;
        }
        
        return renum.intValue();
        
        
    }
}
