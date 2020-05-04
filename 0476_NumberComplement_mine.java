class Solution {
    public int findComplement(int num) {
        int len=0;
        int t=num;
        if (t==0) return 1;
        if(t==1) return 0;
        while(t!=0){
            t=t/2;
            len++;
        }
        return (2<<len-1)-1-num;
    }
}
