//intuitive brute force
class Solution {
    public int maxArea(int[] height) {
        int i, j;
        int vol=0;
        for(i=0;i<height.length;i++){
            for (j=i+1;j<height.length;j++){
                vol=Math.max(vol, Math.min(height[i],height[j])*(j-i));
            }
        }
        return vol;
    }
}
