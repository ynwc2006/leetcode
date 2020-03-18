class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0) return "";
        if(numRows ==1) return s;
        String str="";
        
        for(int row=1;row<=numRows;row++){
            //str=str+"--";
            for (int i=0;i<s.length();i++){
                if(((i)%(2*numRows-2)==row-1) || ((row+i)%(2*numRows-2)==1))
                    str=str+s.charAt(i);
        
            }
        }
        return str;
        
        
     //the one below is not working as there is a misunderstanding about 'zigzag'   
        
   /*     if (s.length()==0) return "";
        if(numRows==1) return s;
        
        boolean odd= (numRows%2==1);
        String str="";
        if (odd) {
            for(int row=1;row<=numRows;row++){
               
                if(row==numRows/2+1){
                    for(int i=0;i<s.length();i++)
                    {
                    if  ((i+1)%(numRows+1)==row) 
                         str=str+s.charAt(i);
                    if  ((i+1)%(numRows+1)==0) 
                         str=str+s.charAt(i);
                      }       
                }
                else{
                    for(int i=0;i<s.length();i++)
                    {
                    if  ((i+1)%(numRows+1)==row) 
                       str=str+s.charAt(i);
                    }
                }
                
            }
        
        }
        else {          
            for(int row=1;row<=numRows;row++){
               //  str=str+"--";
                if(row==numRows/2){
                    for(int i=0;i<s.length();i++)
                    {
                    if  ((i+1)%(numRows+2)==row) 
                         str=str+s.charAt(i);
                    if  ((i+1)%(numRows+2)==0) 
                         str=str+s.charAt(i);
                      }       
                }
                else if (row==numRows/2+1){
                    for(int i=0;i<s.length();i++)
                    {
                    if  ((i+1)%(numRows+2)==row) 
                         str=str+s.charAt(i);
                    else if  ((i+1)%(numRows+2)==numRows+1) 
                         str=str+s.charAt(i);
                      }       
                }
                else{
                    for(int i=0;i<s.length();i++)
                    {
                    if  ((i+1)%(numRows+2)==row) 
                       str=str+s.charAt(i);
                    }
                }
                
            }
        
        }
        return str;
 */   
    }
}
