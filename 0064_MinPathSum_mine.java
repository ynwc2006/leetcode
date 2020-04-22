class Solution {
    public int minPathSum(int[][] grid) {
        int[][] sums = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) Arrays.fill(sums[i],Integer.MAX_VALUE);
        explore(grid,sums,0,0,0);
        return sums[grid.length-1][grid[0].length-1];
        
    }
    
    private void explore(int[][] grid, int[][] sums,int i, int j,int sumPrev){
        if(sumPrev+grid[i][j]>=sums[i][j]) return;
        
        sums[i][j]=sumPrev+grid[i][j];
        if(i+1<grid.length) explore(grid, sums,i+1,j,sums[i][j]);
        if(j+1<grid[0].length) explore(grid,sums,i,j+1,sums[i][j]);
        return;
        
    }
}
