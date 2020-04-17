class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length==0) return 0;
        boolean[][] mark=new boolean[grid.length][grid[0].length];
        for(int i=0;i<mark.length;i++)
            Arrays.fill(mark[i],false);
        int count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
                if(grid[i][j]=='1' && !mark[i][j]){
                    count++;
                    markAll(grid,mark,i,j);
            }
        return count;
        
    }
        
    private void markAll(char[][] grid,boolean[][] mark,int i,int j){
        mark[i][j]=true;
        if(i+1<grid.length && grid[i+1][j]=='1' && !mark[i+1][j]) markAll(grid,mark,i+1,j);
        if(j+1<grid[i].length && grid[i][j+1]=='1' && !mark[i][j+1]) markAll(grid,mark,i,j+1);
        if(j-1>=0 && grid[i][j-1]=='1' && !mark[i][j-1]) markAll(grid,mark,i,j-1);
        if(i-1>=0 && grid[i-1][j]=='1' && !mark[i-1][j]) markAll(grid,mark,i-1,j);
        
    }
}
