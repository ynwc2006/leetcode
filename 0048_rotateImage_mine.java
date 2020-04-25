class Solution {
    public void rotate(int[][] matrix) {
        //if (matrix.length==1) return matrix;
        int layer=matrix.length/2-1;
        while(layer>=0){
            int start=layer,end=matrix.length-1-layer;
            for(int i=0;i<=end-start-1;i++){
                int t= matrix[start][start+i];
                matrix[start][start+i]=matrix[end-i][start];
                matrix[end-i][start]=matrix[end][end-i];
                matrix[end][end-i]=matrix[start+i][end];
                matrix[start+i][end]=t;
            }
            layer--;
        }
        return;
    }
}
