class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m=A.length;
        int n=B.length;
  
        if (n<m){
            int[] t= A;
            A=B;
            B=t;
            m=A.length;
            n=B.length;
        }
        
        int imin=0, imax=m;
        int mid=0;
        while(imax>=imin){
            int i=(imax+imin)/2;
            int j=(m+n+1)/2-i;
            if(i<m && B[j-1]>A[i]) imin=i+1;
            else if(i>0 && A[i-1]>B[j]) imax= i-1;
            else {
                int maxLeft=0;
                if (i==0) maxLeft=B[j-1];
                else if (j==0) maxLeft=A[i-1];
                else maxLeft= Math.max(A[i-1],B[j-1]);
                if ((m+n)%2==1) return maxLeft;
                
                    int maxRight=0;
                    if(i==m) maxRight=B[j];
                    else if(j==n) maxRight=A[i];
                    else maxRight=Math.min(A[i],B[j]);
                    return (maxRight+maxLeft)/2.0;
                
            }
        }
        
        return 0.0;
        
         
    }
}
