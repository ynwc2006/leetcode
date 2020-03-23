// two pointer
/*We starts with the widest container, l = 0 and r = n - 1. Let's say the left one is shorter: h[l] < h[r]. Then, this is already the largest container the left one can possibly form. There's no need to consider it again. Therefore, we just throw it away and start again with l = 1 and r = n -1.*/
class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int vol=0;
        while ( r>l){
       
               if (height[l]>height[r]){
                   vol=Math.max(vol, height[r]*(r-l));
                   r--;
               }
                else {
                    vol=Math.max(vol, height[l]*(r-l));
                    l++;
                }
            
        }
        return vol;
    }
}
