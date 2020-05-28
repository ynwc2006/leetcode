class Solution {
    public int[] countBits(int num) {
        int[] ans=new int[num+1];
        ans[0]=0;
        if (num==0) { return ans;}
        
        int i=0,j=1,p=0;
        while(j<=num){
            if(j==1<<p) { i=0; p++;}
            ans[j]=ans[i]+1;
            j++;
            i++;
        }
        return ans;
    }
}
