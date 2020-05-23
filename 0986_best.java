class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int lenA=A.length, lenB=B.length;
       List<int[]>ans=new ArrayList();
        int i=0,j=0;
        
        while(i<lenA && j<lenB){

                int start=Math.max(A[i][0],B[j][0]);
                int end=Math.min(A[i][1],B[j][1]);
                 if(start<=end) ans.add(new int[]{start,end});
               
                if(A[i][1]<B[j][1]) i++;
                else if(A[i][1]>B[j][1])j++;
                else {i++;j++;}
            
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
