class Solution {
   // int[][] visited=new int[51];
    public int[][] floodFill(int[][] image, int x, int y, int newColor) {
        if (image[x][y]==newColor) return image;
        floodFillHelper(image[x][y],image,x,y,newColor);
        return image;
    }
    
     public void floodFillHelper(int color, int[][] image, int x, int y, int newColor) {
        int  m=image.length;
        int  n=image[0].length;
       // if(visited[x][y]==1) return;
        if (x<0 || x>m-1 || y<0 || y>n-1) return;
         if(image[x][y]!=color) return;
         image[x][y]=newColor;
        // visited[x][y]=1;
         floodFillHelper(color,image,x-1,y,newColor);
         floodFillHelper(color,image,x+1,y,newColor);
         floodFillHelper(color,image,x,y-1,newColor);
         floodFillHelper(color,image,x,y+1,newColor);
     }
}
