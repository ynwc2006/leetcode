class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int lenA=A.length, lenB=B.length;
        int t=Math.max(lenA,lenB);
        int[][] ans=new int[2000][2];
        int i=0,j=0,k=0;
        while(i<lenA && j<lenB){
            if(A[i][0]>B[j][1]) j++;
            else if(B[j][0]>A[i][1]) i++;
            else {
                int start=Math.max(A[i][0],B[j][0]);
                int end=Math.min(A[i][1],B[j][1]);
                ans[k][0]=start;
                ans[k][1]=end;
                k++;
                if(A[i][1]<B[j][1]) i++;
                else if(A[i][1]>B[j][1])j++;
                else {i++;j++;}
            }
        }
         int[][] ans2=new int[k][2];
        for(i=0;i<k;i++)
            ans2[i]=ans[i];
        return ans2;
    }
}
