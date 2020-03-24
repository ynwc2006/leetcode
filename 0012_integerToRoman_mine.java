class Solution {
    public String intToRoman(int num) {
        StringBuilder str= new StringBuilder();
        int digit,p;
        
        for(int i=3;i>=0;i--){
            int tenth=(int)(Math.pow(10,i));
            digit=num/tenth;
            str= digitToRoman(i,digit,str);
            num=num-digit*tenth;
        }
       
        /*digit=num/1000;
        str= digitToRoman(0,digit,str);
        num=num-digit*1000;
        

        digit=num/100;
        str= digitToRoman(1,digit,str);
        num=num-digit*100;
        
        digit=num/10;
        str= digitToRoman(2,digit,str);
        num=num-digit*10;
        
        digit=num/1;
        str= digitToRoman(3,digit,str);
        num=num-digit*1; */
        
        return str.toString();

    }
        
        
        
        
        
        
    private StringBuilder digitToRoman(int p, int digit, StringBuilder s){
        if (digit==0) return s;
        char a='\0',b='\0',c='\0';
        switch(p){
            case 3:
                a='M';
                b='M';
                c='M';
                break;  
            case 2: 
                a='C';
                b='D';
                c='M';
                break;
            case 1:
                a='X';
                b='L';
                c='C';
                break;
            case 0:
                a='I';
                b='V';
                c='X';
                break;
        }
        switch(digit){
            case 1:
                s.append(a);
                break;
            case 2:
                s.append(a).append(a);
                break;
            case 3:
                s.append(a).append(a).append(a);
                break;
            case 4:
                s.append(a).append(b);
                break;
            case 5:
                s.append(b);
                break;
            case 6:
                s.append(b).append(a);
                break;
            case 7:
                s.append(b).append(a).append(a);
                break;
            case 8:
                s.append(b).append(a).append(a).append(a);
                break;
            case 9:
                s.append(a).append(c);
                break;
                
        }
        return s;
        
    }
    
}
