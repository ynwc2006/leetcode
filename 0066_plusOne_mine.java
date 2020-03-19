class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int p=digits.length-1;
        
        
        while (carry!=0 && p>=0 ){
            int num=digits[p];
            digits[p]=(num+carry)%10;
            carry=(num+carry)/10;
            p=p-1;
        }
        
        if (carry!=0)
        {
            int[] digitsNew=new int[digits.length+1];
            digitsNew[0]=1;
            for(int i=1;i<digits.length+1;i++){
                digitsNew[i]=digits[i-1];
            }
            return digitsNew;
    }
        else return digits;
}
}
